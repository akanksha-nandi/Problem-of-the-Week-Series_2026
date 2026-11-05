class Level0_WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = numBottles;
        int emptyBottles = numBottles;

        while (emptyBottles >= numExchange) {
            int newBottles = emptyBottles / numExchange;
            totalDrunk += newBottles;
            emptyBottles = emptyBottles % numExchange + newBottles;
        }

        return totalDrunk;
    }
}
