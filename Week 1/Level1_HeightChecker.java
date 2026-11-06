class Level1_HeightChecker {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];

        for (int i = 0; i < heights.length; i++)
            expected[i] = heights[i];

        insertionSort(expected);

        int mismatches = 0;
        for (int i = 0; i < heights.length; i++) 
            if (heights[i] != expected[i])
                mismatches++;

        return mismatches;
    }

    static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
