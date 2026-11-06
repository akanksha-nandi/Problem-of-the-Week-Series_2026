class Level2_CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];

            if (seen.contains(2 * x)) return true;
            if (x % 2 == 0 && seen.contains(x / 2)) return true;

            seen.add(x);  
        }

        return false;
    }
}
