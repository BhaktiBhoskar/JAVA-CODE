public class MedianOfTwoSortedArrays {
    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length, n2 = nums2.length;
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        
        // merge 2 sorted arrays
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        
        // remaining elements
        while(i < n1){
            merged[k++] = nums1[i++];
        }
        while(j < n2){
            merged[k++] = nums2[j++];
        }
        
        int len = merged.length;
        
        // median calculation
        if(len % 2 == 1){
            return merged[len/2];
        } else {
            return (merged[len/2] + merged[(len/2)-1]) / 2.0;
        }
    }
    
    public static void main(String[] args) {
        int[] a = {1,3};
        int[] b = {2};
        
        System.out.println("Median = " + findMedianSortedArrays(a,b)); // Output: 2.0
    }
}
