import java.util.Scanner;
  public class RectanglePerimeter{
     public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		float l = sc.nextFloat();
		float b = sc.nextFloat();
		
		float p = 2 * (l + b);
		
		System.out.println(p);
	}
}	