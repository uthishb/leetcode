class Solution {
    public boolean isMonotonic(int[] A) {
        if(A.length<=2)
            return true;
        boolean isIncreasing = true;
        for(int i=0;i<A.length-1;i++) {
            if(A[i] > A[i+1])
                isIncreasing = false;
        }
        if(isIncreasing) {
            int smallestSeen = A[0];
            for(int i=1;i<A.length;i++) {
                if(A[i] >= smallestSeen)
                    smallestSeen = A[i];
                else
                    return false;
            }
        }
        else {
            int largestSeen = A[0];
            for(int i=1;i<A.length;i++) {
                if(A[i] <= largestSeen)
                    largestSeen = A[i];
                else
                    return false;
            }
        }
        return true;
    }
}
