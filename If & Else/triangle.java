//wap to to input angles of a triangle and check triangle is valid or not

import java.util.Scanner;
class triangle{
public static void main(String args[]){

int a,b,c,add;

Scanner sc = new Scanner(System.in);
System.out.println("Enter 3 angles");

a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
add = a+b+c;


if(add==180){
System.out.println("The triangle is valid");


}

else{
System.out.println("Triangle is invalid");

}









}



}