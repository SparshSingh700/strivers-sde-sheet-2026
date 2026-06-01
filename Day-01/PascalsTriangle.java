class Solution {

    public List<List<Integer>> generate(int numRows) {
        // Final Pascal Triangle, iterate rows and add cols
        List<List<Integer>> triangle = new ArrayList<>();
        for (int currentRow = 1; currentRow <= numRows; currentRow++) {
            triangle.add(generateRow(currentRow));
        }
        return triangle;
    }

    private List<Integer> generateRow(int rowNumber) {
        List<Integer> rowVals = new ArrayList<>();
        // First value of every row is always 1
        long curVal = 1;
        rowVals.add(1);
        // Generate remaining values using nCr formula
        for (int column = 1; column < rowNumber; column++) {
            /*
             Formula:
             nextValue = previousValue * (row - column) / column
             this version avoids factorial calculation
            */
            curVal = curVal * (rowNumber - column);
            curVal  =curVal / column;
            rowVals.add((int) curVal);
        }
        return rowVals;
    }
}