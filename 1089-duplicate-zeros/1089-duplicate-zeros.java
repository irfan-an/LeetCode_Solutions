class Solution {
    public void duplicateZeros(int[] arr) {
        int poZeroDups=0;
        int lastIdx =arr.length-1;

        for(int i=0; i<=lastIdx- poZeroDups; i++){
            if(arr[i]==0){
                if(i==lastIdx-poZeroDups){
                    arr[lastIdx]=0;
                    lastIdx-=1;
                    break;
                }
                poZeroDups++;
            }
        }
        int newLastIdx =lastIdx -poZeroDups;
        for(int i=newLastIdx; i>=0; i--){
            if(arr[i]==0){
                arr[i+poZeroDups]=0;
                poZeroDups--;
                arr[i+poZeroDups]=0;
            }else{
                arr[i+poZeroDups]=arr[i];
            }
        }
    }
}