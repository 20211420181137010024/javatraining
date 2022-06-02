/*Write a program that averages the rain fall for three months, April, May, and June. Declare and
initialize a variable to the rain fall for each month. Compute the average, and write out the
results, something like:
Rainfall for April: 12
Rainfall for May : 14
Rainfall for June: 8
Average rainfall: 11.333333*/

public class AverageRain{
public static void main(String[]  args) {
int RainfallforApril = 12;
int RainfallforMay = 14;
int RainfallforJune = 8;
double Value = (RainfallforApril + RainfallforMay + RainfallforJune )/3.0;
System.out.println( "Rainfall for April: " + '\t' + RainfallforApril);
System.out.println( "Rainfall for May: " + '\t' + RainfallforMay);
System.out.println( "Rainfall for June: " + '\t' + RainfallforJune);
System.out.println( "Average rainfall: " + '\t' + Value);
}
}
