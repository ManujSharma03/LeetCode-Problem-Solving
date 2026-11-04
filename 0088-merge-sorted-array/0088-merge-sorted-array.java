class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m+n];
        int left=0;
        int right=0;
        int counter=0;
        while(left<m && right<n){
            if(nums1[left]<=nums2[right]){
                arr[counter]=nums1[left];
                counter++;
                left++;
            }
            else{
                arr[counter]=nums2[right];
                counter++;
                right++;
            }
        }
        while(left<m){
            arr[counter]=nums1[left];
            left++;
            counter++;

        }
        while(right<n){
            arr[counter]=nums2[right];
            right++;
            counter++;

        }
    
        for (int i =0;i<arr.length;i++){
            nums1[i]=arr[i];
        }
    }
    
}