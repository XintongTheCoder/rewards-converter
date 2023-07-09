public class RewardValue {
    private final double cashValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int miles) {
        cashValue = miles * MILES_TO_CASH_CONVERSION_RATE;
    }
    private static int convertCashToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    private static double convertMilesToCash(int miles) {
        return miles * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertCashToMiles(cashValue);
    }
}
