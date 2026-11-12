class Level2_TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int[] solution = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            int low = 0, high = numbers.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (mid != i && numbers[mid] == target - numbers[i]) {
                    solution[0] = Math.min(i, mid) + 1;
                    solution[1] = Math.max(i, mid) + 1;
                    break;
                }
                else if (numbers[mid] > target - numbers[i]) high = mid - 1;
                else low = mid + 1;
            }
        }
        
        return solution;
    }
}
