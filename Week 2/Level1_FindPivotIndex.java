class Level1_FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum, totalSum = 0;

        for (int i = 0; i < nums.length; i++) totalSum += nums[i];

        for (int i = 0; i < nums.length; i++) {
            rightSum = totalSum - nums[i] - leftSum;

            if (leftSum == rightSum) return i;

            leftSum += nums[i];
        }

        return -1;
    }
}
