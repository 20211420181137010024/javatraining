//Write a program to input angles of a triangle and check whether triangle is valid or not.
import java.util.*;
class TrangleOrNot
{
public static int checkValidity(int a,int b, int c)
{
if (a + b < c || a + c < b || b + c < a)
return 0;
else
return 1;
}
public static void main(String args[])
{
int a = 7, b = 10, c = 5;
if ((checkValidity(a, b, c)) == 1)
System.out.print("It is Trangle");
else
System.out.print("It is not Trangle");
}
}