class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] m = new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                m[k]=nums1[i];
                i++;
            }else{
                m[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            m[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n2){
            m[k]=nums2[j];
            j++;
            k++;
        }
        int n3 = m.length;
        if(n3%2==0){
            int mid = n3/2;
            double median = (m[mid]+m[mid-1])/2.0;
            return median;
        }else{
            int mid = n3/2;
            return m[mid];
        }
    }
}