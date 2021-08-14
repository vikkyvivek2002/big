import java.util.*;
class big
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
int a, b;
System.out.println("enter two numbers ");
a = s.nextInt();
b= s.nextInt();
if(a>b)
System.out.println(a +"is grater than "+b );
else
System.out.println(b +"is grater than "+a );
s.close();
}
}
