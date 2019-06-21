import java.util.Scanner;
/**
 * 
 * @author Thumpasery J George
 *
 */
public class NestedLoopsPractice {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many levels should the staircase have?");
		int numLevels = in.nextInt();
		for (int i = 0; i < numLevels; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
