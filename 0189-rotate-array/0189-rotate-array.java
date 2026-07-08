import java.util.Arrays;
class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k=k%len;
        Reverse(nums, 0, len - 1);
        Reverse(nums, 0, k - 1);
        Reverse(nums, k, len - 1);
    }
        void Reverse(int[] nums, int s, int e) {
        while (e > s) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
    }