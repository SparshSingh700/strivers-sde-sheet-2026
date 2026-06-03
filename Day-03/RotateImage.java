class Solution {
    public void rotate(int[][] arr) {
        //Transpose matrix: swap lower right angled triangle first i,j with j,i
        int rows=arr.length;
        int cols=rows;

        for(int i=0; i<rows; i++){
            for(int j=0; j<i; j++){
                int temp=arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]=temp;
            }
        }

        //swap each row 
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols/2; j++){
                int temp=arr[i][cols-1-j];
                arr[i][cols-1-j]= arr[i][j];
                arr[i][j]=temp;
            }
        }

    }


}