
package powerofn;
/* Using  math class*/
import java.lang.Math;
public class PowerofNMath {

	public static void main(String[] args) {
		printPowersOfN(2,7);
		System.out.println();
		printPowersOfN(5,3);

	}

	public static void printPowersOfN(int x, int y) {
		
	 
		for (int i=0; i<=y; i++) {
		
		  System.out.print(Math.round(Math.pow(x, i)));
		  System.out.print(" ");;
		
			
		}
	}
}
