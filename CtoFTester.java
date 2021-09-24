/*
What should the functions have as parameter(s) ?
The functions should have the user's wanted celsius and
fahrenheit values to convert to fahrenheit and celsius, respectively.

What type should they be?
They should be doubles (and not ints) just to make sure that
multiplying or dividing by 5/9 results in a precise conversion.

What should the functions return?
The celsiusToFahrenheit function should return the fahrenheit value
(a double) of the user's inputed celsius value (a double);
The fahrenheitToCelsius function should return the celsius value
(a double) of the user's inputed fahrenheit value (a double);
*/


public class CtoFTester{
  public static double celsiusToFahrenheit(double celsius){
    double fahrenheit = (celsius * 9.0/5.0) + 32;
    return (fahrenheit);
  }
  public static double fahrenheitToCelsius(double fahrenheit){
    double celsius = (fahrenheit - 32) * (5.0/9.0);
    return (celsius);
  }

  public static void main(String[] args){
    double TestA = 20;
    double TestB = 50;
    System.out.println(celsiusToFahrenheit(TestA)); // 68
    System.out.println(fahrenheitToCelsius(TestA)); // -6.66..7
    System.out.println(celsiusToFahrenheit(TestB)); // 122.0
    System.out.println(fahrenheitToCelsius(TestB)); // 10.0
  }
}
