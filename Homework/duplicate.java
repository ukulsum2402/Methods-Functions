class duplicate {
    public static void main(String[] args) {

        int num = 12233445;
        int result = 0;
        int place = 1;

        while (num > 0) {
            int digit = num % 10;

            if (!isPresent(result, digit)) {
                result = result + digit * place;
                place = place * 10;
            }

            num = num / 10;
        }

        System.out.println("Number after removing duplicates = " + result);
    }

    static boolean isPresent(int number, int digit) {
        while (number > 0) {
            if (number % 10 == digit) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }
}
