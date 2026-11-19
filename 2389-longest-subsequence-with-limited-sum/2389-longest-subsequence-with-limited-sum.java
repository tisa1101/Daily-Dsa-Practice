import java.util.Arrays;

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int count = 0;

            for (int sum : prefix) {
                if (sum <= queries[i]) {
                    count++;
                } else {
                    break;
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}