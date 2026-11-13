class Level2_GrumpyBookstoreOwner {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int satisfiedCustomers = 0;

        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) satisfiedCustomers += customers[i];
        }

        int windowGain = 0;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) windowGain += customers[i];
        }
        int maxGain = windowGain;

        for (int i = minutes; i < n; i++) {
            if (grumpy[i] == 1) windowGain += customers[i];
            if (grumpy[i - minutes] == 1) windowGain -= customers[i - minutes];
            maxGain = Math.max(maxGain, windowGain);
        }

        return satisfiedCustomers + maxGain;
    }
}
