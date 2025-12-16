import java.util.Scanner;

  public class CylinderVolume{
     public static void main(String[] args){
	    
		Scanner sc = new Scanner(System.in);
		float r = sc.nextFloat();
		float h = sc.nextFloat();
		
		float volume = 3.14 * r*r * h;
		
		System.out.println(volume);
	}
}	