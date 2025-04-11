public class Unit1ProgramsPt1
{
	public static void main (String[] args){
		Scanner myScan = new Scanner(System.in);





		System.out.println("Enter the temperature in fahrenheit:");
		double Fahrenheit = myScan.nextDouble();

		double Celcius = (Fahrenheit - 32) * (5.0/9);
		String conversion = myScan.nextLine();
		System.out.println("The temperature in celcius is: " + Celcius);






	}
}
