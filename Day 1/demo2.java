

import java.util.Scanner;
class demo2{
public static void main(String args[])
{
float f, c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter tempreture in fahrenheit");
f=sc.nextFloat();
c=((f-32)*5)/9;
System.out.println("Celcius tempreture is"+c);
}
}