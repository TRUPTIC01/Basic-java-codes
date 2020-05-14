//Reverse number//
 class revno
{
	public static void main (String[] args) 
	{
		int a,n,digit;
       a=1234;
       n=0;
        while(a!=0)
    {
    digit=a%10;
    n=n*10+digit;
    a=a/10;
    }
 System.out.println("The reverse number is:"+n);
 
	}
}
