class Solution {
    public void setZeroes(int[][] matrix) {
       int m = matrix.length;
       int n = matrix[0].length;
       int ind00 = 1;

   /* traverse matrix, if 0 found mark left side(firstCol=i=0) but check before marking 
    above if its first index, if no mark (firstRow=j=0) else mark ind00=0*/
       for (int i = 0; i < m; i++) {
           for (int j = 0; j < n; j++) {
               if (matrix[i][j] == 0) {
                   matrix[i][0] = 0;
                   if (j != 0) {
                       matrix[0][j] = 0;
                   } else {
                       ind00 = 0;
                   }
               }
           }
       }

    // start mrking from row=col=1, the index zero according to the left and above
       for (int i = 1; i < m; i++) {
           for (int j = 1; j < n; j++) {
               if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                   matrix[i][j] = 0;
               }
           }
       }

    //check matrix[0][0] as it  controls FIRST ROW
       if (matrix[0][0] == 0) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

    // check ind00 as it control FIRST COLUMN
        if (ind00 == 0) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
