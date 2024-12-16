public class CachedFraction {
    private final Fraction fraction;
    private Double cachedValue = null;

    public CachedFraction(Fraction fraction) {
        this.fraction = fraction;
    }

    public double getDecimalValue() {
        if (this.cachedValue == null) {
            this.cachedValue = fraction.getDecimalValue();
        }
        return this.cachedValue;
    }

    public void updateNumerator(int a) {
        fraction.seta(a);
        this.cachedValue = null;
    }

    public void updateDenominator(int b) {
        fraction.setb(b);
        this.cachedValue = null;
    }

    public Fraction getFraction() {
        return this.fraction;
    }

    @Override
    public String toString() {
        return fraction.toString();
    }
}