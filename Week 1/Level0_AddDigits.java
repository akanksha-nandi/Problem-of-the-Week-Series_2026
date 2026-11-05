class Level0_AddDigits {
    public int addDigits(int num) {
        String number = String.valueOf(num);

        while (number.length() != 1) {
            int sum = 0;

            for (int i = 0; i < number.length(); i++) {
                sum += number.charAt(i) - '0';
            }

            number = String.valueOf(sum);
        }

        return Integer.parseInt(number);
    }
}
