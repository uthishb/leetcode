class Solution {
    public int[] sortedSquares(int[] A) {
        if(A==null)
            return null;        
        int posPointer = 0;
        int negPointer = 0;
        for(int i=0;i<A.length;i++) {
            if(A[i]>=0) {
                posPointer = i;
                break;
            }                
        }
        negPointer = posPointer-1;
        int[] resultArr = new int[A.length];
        int resultCounter = 0;
        while(negPointer >= 0 && posPointer < A.length) {
            if(A[negPointer]*A[negPointer] <= A[posPointer]*A[posPointer]) {
                resultArr[resultCounter++] = A[negPointer]*A[negPointer];
                negPointer--;
            }
            else {
                resultArr[resultCounter++] = A[posPointer]*A[posPointer];
                posPointer++;
            }
        }
        while(negPointer>=0) {
            resultArr[resultCounter++] = A[negPointer]*A[negPointer];
            negPointer--;
        }
        while(posPointer < A.length) {
            resultArr[resultCounter++] = A[posPointer]*A[posPointer];
            posPointer++;
        }
        return resultArr;
    }
}
