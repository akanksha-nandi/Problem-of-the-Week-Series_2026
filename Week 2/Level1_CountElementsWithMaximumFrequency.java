class Level1_CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        HashMap <Integer, Integer> elementCount = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (elementCount.containsKey(nums[i])) elementCount.put(nums[i], elementCount.get(nums[i]) + 1);
            else elementCount.put(nums[i], 1);
        }

        int maxCount = 0, keysWithMax = 0;

        for (int count : elementCount.values()) {
            if (count > maxCount) {
                maxCount = count;
                keysWithMax = 1;
            } 
            else if (count == maxCount) keysWithMax++;
        }

        return maxCount * keysWithMax;
    }
}
