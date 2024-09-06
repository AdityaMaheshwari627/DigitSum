//Find Sum of Digit
package Numbers;

import java.util.Scanner;

public class Digitsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = obj.nextInt();
        int sum=0;
        int count;
        while(number>0) {
        	count=number%10;
        	sum=sum+count;
        	number=number/10;
        }
        System.out.print("Sum of a digit is "+sum);
	}

}
