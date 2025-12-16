import java.util.Scanner;

  public class TemperatureConversion{
    public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  float celsius = sc.nextFloat();
	  
	  float fahrenheit = (celsius * 9/5) + 32;
	  
	  System.out.println(fahrenheit + " 'F");
	}
}	 