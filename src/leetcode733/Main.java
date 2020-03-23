package leetcode733;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[][] image = {{1,0,1},{1,1,0},{1,0,1}};
		
		int newColor = 2;
		
		System.out.println("Input: " + Arrays.deepToString(image));
		
		System.out.println("New color: " + newColor);
		
		FillUpNewColorFunction solution = new FillUpNewColorFunction();
		
		System.out.println(Arrays.deepToString(solution.floodFill(image, 1, 1, newColor)));
	}
}
