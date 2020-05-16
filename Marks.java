

import java.util.*;
import java.lang.*;
import java.io.*;

//Marks//
class Marks
{
	public static void main (String[] args) 
	{
       int marks;
       Scanner input= new Scanner(System.in);
       marks=input.nextInt();
       if(marks>80 && marks<=100)
       System.out.println("S");
       else if(marks>50 && marks<=80)
       System.out.println("P");
       else if(marks>=0 && marks<=50)
       System.out.println("F");
       else
       System.out.println("Invalid marks");
      
       
	}
}
