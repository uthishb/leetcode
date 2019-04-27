class Solution {   
    public String getBinaryFromNumber(int num) {
        if(num==0)
            return "0";
        StringBuilder sb = new StringBuilder();
        while(num!=0) {
            sb.append(num%2);
            num=num/2;
        }
        return sb.reverse().toString();
    }
    
    public int getNumberFromBinary(String binary) {        
        int result = 0;
        int currentTwoPower = 1;
        for(int i=binary.length()-1;i>=0;i--) {            
            if(binary.charAt(i) == '1') {
                result = result + currentTwoPower;                
            }            
            currentTwoPower = 2*currentTwoPower;            
        }
        return result;
    }
    
    public String getBinaryCompliment(String binaryInp) {
        StringBuilder binaryOut = new StringBuilder();
        for(int i=0;i<binaryInp.length();i++) {
            if(binaryInp.charAt(i)=='0') {
                binaryOut.append('1');
            }
            else if(binaryInp.charAt(i)=='1') {
                binaryOut.append('0');
            }
        }
        return binaryOut.toString();
    }
    
    public int findComplement(int num) {
        String binary = getBinaryFromNumber(num);
        String binaryCompliment = getBinaryCompliment(binary);
        return getNumberFromBinary(binaryCompliment);
    }
}
