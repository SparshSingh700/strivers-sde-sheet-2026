/*
Question Link:
https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1

Question:
For every window of size k,
count the number of
distinct elements.
*/

class Solution {

    /*
        Maintain frequencies of
        elements inside the current window.

        HashMap size gives the
        number of distinct elements.
    */
    ArrayList<Integer> countDistinct(int arr[], int k) {

        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // First window.
        for(int i = 0; i < k; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ans.add(map.size());

        // Remaining windows.
        for(int i = k; i < arr.length; i++){

            // Remove outgoing element.
            map.put(arr[i - k], map.get(arr[i - k]) - 1);

            if(map.get(arr[i - k]) == 0){
                map.remove(arr[i - k]);
            }

            // Add incoming element.
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            ans.add(map.size());
        }

        return ans;
    }
}