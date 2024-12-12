public class Fraction implements FractionInterface {
    private int a;
    private int b;

    public Fraction(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        this.a = a;
        this.b = b > 0 ? b : -b;
        if (b < 0) {
            this.a = -this.a;
        }
    }


    public String toString() {
        return a + "/" + b;
    }

    @Override
    public double getDecimalValue() {
        return (double) this.a/this.b;
    }

    @Override
    public void seta(int a) {
        this.a = a;
    }

    @Override
    public void setb(int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        this.b = b > 0 ? b : -b;
        if (b < 0) {
            this.a = -this.a;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fraction fraction = (Fraction) obj;
        return this.a * fraction.b == fraction.a * this.b;
    }


}