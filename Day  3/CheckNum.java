//Write a program to check whether a number is negative, positive or zero.
import java.util.Scanner;  
public class CheckNum 
{  
public static void main(String[] args)   
{  
int num;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number: ");  
num = sc.nextInt();  
if(num>0)  
{  
System.out.println("The number is positive.");  
}  
else if(num<0)  
{  
System.out.println("The number is negative.");  
}  
selse  
{  
System.out.println("The number is zero.");  
}  
}  
}