//wap to check a number is divisible by 5 and 11 or not

import java.util.Scanner;
public class Division{
public static void main(String args[]){

int a;

Scanner sc = new Scanner(System.in);

System.out.println("Enter a number");

a = sc.nextInt();

 if(a%5==0){
 
 System.out.println("number is divisible by 5");


 }
 
 else if(a%11==0){
 
 System.out.println(" number is divisible by 11");
 
 }
 
 else{
 System.out.println("wrong choice");


 }
 }
 }