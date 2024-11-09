package mergesortedarrays;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m -1;
        int j = n -1;
        int k = m + n -1;

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];

        }

        while (j >= 0)
            nums1[k--] = nums2[j--];

    }

    /**
     * Create a variable int called i and initialize it with m - 1;
     * Create a variable int called j and initialize it with n - 1;
     * Create a variable int called k and initialize it with the sum of m and n, minus 1
     * While i and j are higher than 0
     * if index i from nums1 is higher than index j from nums2, assign index k-- from nums1 with index i-- from nums1;
     * In other case assign the index k-- from nums1 with the index j-- from nums2.
     * THe first loop is finished.
     * While j higher or equals to 0, assign index k-- with from nums1 with index j-- from nums2;
     *
     */
}
