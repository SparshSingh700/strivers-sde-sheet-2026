/*
Question Link:
https://leetcode.com/problems/flood-fill/

Question:
Given an image represented by a 2D grid,
change the color of the starting pixel
and all connected pixels having the same
original color.
*/

class Solution {

    int[] dr = {-1, 0, 1, 0};
    int[] dc = {0, 1, 0, -1};

    /*
        Start DFS from the source cell.

        Recolor every connected cell
        having the original color.
    */
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int original = image[sr][sc];

        // Nothing to change.
        if(original == color){
            return image;
        }

        dfs(image, sr, sc, original, color);

        return image;
    }

    void dfs(int[][] image, int row, int col, int original, int color) {

        // Out of bounds.
        if(row < 0 || col < 0 || row >= image.length || col >= image[0].length){
            return;
        }

        // Different color.
        if(image[row][col] != original){
            return;
        }

        // Paint current cell.
        image[row][col] = color;

        // Visit all 4 directions.
        for(int i = 0; i < 4; i++){
            dfs(image, row + dr[i], col + dc[i], original, color);
        }
    }
}