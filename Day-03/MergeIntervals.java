class Solution {
    public int[][] merge(int[][] intervals) {
        //Ineterviews: multiple overlapping intervals? , sorted?

        /* Sort intervals according to starting value, we will conmpare values of curInterval with nextInterval, if overlap exists then update curEnd else just add the curInterval and update it. the last one remains so add it afterwards.
         */
        Arrays.sort(intervals, (a,b)-> a[0]- b[0]);
        ArrayList<int[]> mergedInterval= new ArrayList<>();
        int curStart=intervals[0][0];
        int curEnd= intervals[0][1];

        for(int i=1; i<intervals.length; i++){
            int nextStart= intervals[i][0];
            int nextEnd= intervals[i][1];
            if(nextStart <= curEnd){
                curEnd= Math.max(nextEnd,curEnd);
            }
            else{
                mergedInterval.add(new int[]{curStart,curEnd});
                curStart=nextStart;
                curEnd=nextEnd;
            }
        }
        mergedInterval.add(new int[]{curStart, curEnd});
        return mergedInterval.toArray(new int[mergedInterval.size()][]);
    }
}