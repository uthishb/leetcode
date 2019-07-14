class Solution {
    public int heightChecker(int[] heights) {
        if(heights==null)
            return 0;
        if(heights.length==1)
            return 0;
        int[] copy = new int[heights.length];
        int retVal = 0;
        for(int i=0;i<heights.length;i++) {
            copy[i] = heights[i];
        }
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++) {
            if(heights[i] != copy[i])
                retVal++;
        }
        return retVal;
    }
}
