class Level2_MaximumDifferenceBetweenAdjacentElementsInACircularArray {
    public int maxAdjacentDistance(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            int adjDist = Math.abs(nums[i] - nums[(i + 1) % nums.length]);

            if (max < adjDist) max = adjDist;
        }

        return max;
    }
}
