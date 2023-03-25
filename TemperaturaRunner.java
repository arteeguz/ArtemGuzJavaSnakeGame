import java.util.Scanner;

public class TemperaturaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		//Creating the instance variable of the Scanner class

		
		System.out.print("Please enter the Temperature in Fahrenheit: ");
		double fahrenheit=input.nextDouble();		//declaring variable and store input in it
		
		Temperature temp = new Temperature(fahrenheit); //passing it to constructor to set ftemp

		temp.setFahrenheit(fahrenheit); //setFahrenheit method

		System.out.println("Your input: " + temp.getFahrenheit());
		System.out.println("Temperature in Celsius: " + temp.getCelsius());
		System.out.println("Temperature in Kelvin: " + temp.getKelvin());
	}
}