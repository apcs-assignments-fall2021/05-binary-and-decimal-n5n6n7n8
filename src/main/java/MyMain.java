import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        int bin = Integer.parseInt(binary);
        int sum = 0;
        int increment=1;
        while(bin>0)
        {
            if(bin%10==1)
            {
                sum+=increment;
            }
            bin/=10;
            increment*=2;
        }
        return sum;
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
        if(decimal==0)
        {
            return "0";
        }
        String ans = "";
        while (decimal>0)
        {
            ans = String.valueOf(decimal%2) + ans;
            decimal/=2;
        }
        return ans;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number in binary and I will convert it to an integer.");
        String binary = scan.nextLine();
        System.out.println(binaryToDecimal(binary));
        System.out.println("Write an integer and I will convert it to binary.");
        int decimal = scan.nextInt();
        System.out.println(decimalToBinary(decimal));
        scan.close();
    }
}
