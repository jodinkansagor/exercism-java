class ArmstrongNumbers {

    int checkNumberDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    boolean isArmstrongNumber(int numberToCheck) {
        int count = checkNumberDigits(numberToCheck);
        int copy = numberToCheck;
        int total = 0;
        int temp = 0;
        while(copy > 0) {
            temp = copy % 10;
            total += (int) Math.pow(temp, count);
            copy /= 10;
        }

        System.out.printf("Total %s, Number to check %s", total, numberToCheck);


        return total == numberToCheck;

    }

}
