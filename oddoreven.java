import java.util.Scanner;
//Check whether number is odd or even//
class oddoreven
{
  public static void main(String[] args)
 {
  int a;
  Scanner input=new Scanner(System.in);
  a=input.nextInt();
  if(a%2==0)
  System.out.println("a is even");
  else 
  System.out.println("a is odd");
 }
}
