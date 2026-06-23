/*
Question Link:
https://www.geeksforgeeks.org/problems/merge-k-sorted-arrays/1

Question:
Merge K sorted arrays into one sorted array.
*/

class Solution {

    static class Tuple {
        int value;
        int row;
        int col;

        Tuple(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }
    }

    /*
    Heap stores:
    (value, row, col)

    Pop smallest element.

    Push next element
    from the same row.
    */

    public ArrayList<Integer> mergeArrays(int[][] arr) {

        int K = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();

        PriorityQueue<Tuple> pq =
            new PriorityQueue<>((a, b) -> a.value - b.value);

        // Put first element of every row.
        for(int i = 0; i < K; i++) {
            pq.offer(new Tuple(arr[i][0], i, 0));
        }

        while(!pq.isEmpty()) {

            Tuple cur = pq.poll();

            int value = cur.value;
            int row = cur.row;
            int col = cur.col;

            ans.add(value);

            if(col + 1 < arr[row].length) {
                pq.offer(new Tuple(
                    arr[row][col + 1],
                    row,
                    col + 1
                ));
            }
        }

        return ans;
    }
}