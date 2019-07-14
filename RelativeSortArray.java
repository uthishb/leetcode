class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] bucket = new int[1001];
        int[] retArr = new int[arr1.length];
        for(int i=0;i<arr1.length;i++) {
            bucket[arr1[i]]++;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<arr2.length;i++) {
            set.add(arr2[i]);
        }
        int counter=0;
        for(int i=0;i<arr2.length;i++) {
            for(int j=0;j<bucket[arr2[i]];j++) {
                retArr[counter++] = arr2[i];
            }
        }
        for(int i=0;i<bucket.length;i++) {
            if(bucket[i]>0 && !set.contains(i)) {
                for(int j=0;j<bucket[i];j++) {
                    retArr[counter++] = i;
                }
            }
        }
        return retArr;
    }
}
