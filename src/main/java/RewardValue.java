public class RewardValue {
    private double cashValue;
    private double RATE = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int miles) {
        cashValue = miles * RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return (int) (cashValue / RATE);
    }
}
