class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean flag=false;
        for(int i=0;i<=31;i++){
            if(n==(Math.pow(2,i))){
                flag=true;
                break;
            }
        }
        if(flag==true)
            return true;
        else
            return false;    

        
    }
}