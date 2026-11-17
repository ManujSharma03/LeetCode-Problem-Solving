class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min =Integer.MAX_VALUE;
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    int s=i+j;
                    if(s < min){
                    ans.clear();       // Remove previous restaurants
                    ans.add(list2[j]);
                    min = s;
                    }
                
                    else if(s == min){
                        ans.add(list2[j]); // Keep restaurants with equal sum
                    }
                }
                
            }
        }
    
        String[] arr = ans.toArray(new String[0]);
        return arr;
    }
}