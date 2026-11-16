class Solution {
    public boolean judgeCircle(String moves) {
        int upar_neeche=0;
        int aage_pieche=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                upar_neeche+=1;
            }
            else if(moves.charAt(i)=='D'){
                upar_neeche-=1;

            }
            else if(moves.charAt(i)=='L'){
                aage_pieche+=1;

            }
            else{
                aage_pieche-=1;
            }
        }
        if(upar_neeche == 0 && aage_pieche==0){
            return true;
        }
        
        return false;
        
    }
}