//wap to input any alphabet and check it is vowel or consonant

import java.util.Scanner;
class alpha{
public static void main(String args[]){

String s1;
char ch;

Scanner sc = new Scanner(System.in);
System.out.println("Enter character");
s1 = sc.next();
ch = s1.charAt(0);

if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u' ){

System.out.println("it is a vowel");
}
else{
System.out.println("it is a consonant");

}



}

}
