/*It is sometimes hard to think in terms of radians; we would rather use degrees. Remember (from
those dark days of trigonometry class) that there are PI radians per 180 degrees. So to convert an
angle given in degrees to radians do this:
rad = degrees * Math.PI/180*/
import java.util.Scanner;
public class radians
{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Angle");
int a = sc.nextInt();
double rad = (a * Math.PI)/180;
System.out.println(rad);
}    
}