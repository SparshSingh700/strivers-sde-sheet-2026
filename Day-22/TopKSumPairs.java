/*
Question Link:
https://www.geeksforgeeks.org/problems/k-maximum-sum-combinations/1

Question:
Find the top k maximum sums
formed by taking one element
from each array.
*/

class Solution {

    static class Tuple {
        int sum;
        int i;
        int j;

        Tuple(int sum, int i, int j) {
            this.sum = sum;
            this.i = i;
            this.j = j;
        }
    }

    /*
    Sort both arrays.

    Start from largest pair.

    Use max heap to always pick
    the next largest sum.

    Use visited set so the same
    pair is not inserted twice.
    */

    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {

        int n = a.length;

        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> ans = new ArrayList<>();

        PriorityQueue<Tuple> pq =
            new PriorityQueue<>((x, y) -> y.sum - x.sum);

        HashSet<String> visited = new HashSet<>();

        int i = n - 1;
        int j = n - 1;

        pq.offer(new Tuple(a[i] + b[j], i, j));
        visited.add(i + "#" + j);

        while(k-- > 0 && !pq.isEmpty()) {

            Tuple cur = pq.poll();

            int sum = cur.sum;
            i = cur.i;
            j = cur.j;

            ans.add(sum);

            if(i - 1 >= 0 && !visited.contains((i - 1) + "#" + j)) {
                pq.offer(new Tuple(a[i - 1] + b[j], i - 1, j));
                visited.add((i - 1) + "#" + j);
            }

            if(j - 1 >= 0 && !visited.contains(i + "#" + (j - 1))) {
                pq.offer(new Tuple(a[i] + b[j - 1], i, j - 1));
                visited.add(i + "#" + (j - 1));
            }
        }

        return ans;
    }
}