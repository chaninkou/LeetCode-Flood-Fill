package leetcode733;

public class FillUpNewColorFunction {
    public int[][] floodFill(int[][] image, int i, int j, int newColor) {
        if(image[i][j] == newColor){
            return image;
        }
        
        dfs(image, i, j, image[i][j], newColor);
        
        return image;
    }
    
    private void dfs(int[][] image, int i, int j, int color, int newColor){
    	// every color need to be the same as starting color to get replace
    	if(i < 0 || i >= image.length || j < 0 || j >= image[i].length || image[i][j] != color){
            return;
        }
        
    	// Change the current color to the new color
        image[i][j] = newColor;
        
        // Fill up all the down, right, up, left
        dfs(image, i + 1, j, color, newColor);
        dfs(image, i, j + 1, color, newColor);
        dfs(image, i - 1, j, color, newColor);
        dfs(image, i, j - 1, color, newColor);
    }
}
