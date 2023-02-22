public class PrimeGenerator implements Series {
    private Integer nextItem = 1;

    @Override
    public boolean isHasNextStep() {
        if (isPrime(++nextItem)) {
            return true;
        }
        isHasNextStep();
        return true;
    }

    @Override
    public Integer nextStep() {
        return nextItem;
    }

    boolean isPrime(Integer testNumber) {
        for (int j = 2; j < Math.abs(testNumber); j++) {
            if (testNumber % j == 0) {
                return false;
            }
        }
        return true;
    }

}
