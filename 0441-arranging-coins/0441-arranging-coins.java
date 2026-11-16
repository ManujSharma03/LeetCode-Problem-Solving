class Solution {
    public int arrangeCoins(int n) {
        int row=1;
        int num=n-1;
        for(int i=2;i<n;i++){
            if(i<=num){
                row++;
                num=num-i;
                continue;
            }
            else {
                break;
            }

        }
        return row;
    }
}