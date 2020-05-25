import java.util.Scanner;
import java.lang.*;
import java.io.*;
//Check palindrome or not//
class palindrome
{
	public static void main (String[] args) 
	{
		int num,rev=0,rem,original;
       Scanner input= new Scanner(System.in);
     num=input.nextInt();
        original=num;
        while(num!=0)
         {
           rem=num%10;
           rev=rev*10+rem;
           num=num/10;
         }
       if(original==rev)
     System.out.println("The no. is palindrome");
     else
     System.out.println("The no. is not palindrome");
	}
}
