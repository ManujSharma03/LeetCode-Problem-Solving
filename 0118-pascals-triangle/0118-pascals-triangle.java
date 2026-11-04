class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> lst=new ArrayList<>();
        ArrayList<Integer> prev=new ArrayList<>();

        for (int i=0;i<numRows;i++){
            ArrayList<Integer> curr=new ArrayList<>();
            
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    curr.add(1);

                }
                else{
                    curr.add(prev.get(j-1) + prev.get(j));
                }
            }
            lst.add(curr);
            prev=curr;
        }
        return lst;
    }
}