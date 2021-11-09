public class Rational {
    private int numer, denom;

    public Rational(int num, int den) {
        numer = num;
        denom = den;
        reduce();
    }

    public Rational(int num) {
        numer = num;
        denom = 1;
    }

    public Rational() {
        numer = 1;
        denom = 1;
    }

    public Rational add(Rational r) {
        int d = this.denom * r.denom;
        int n = this.numer * r.denom + r.numer * this.denom;
        return new Rational(n, d);
    }

    public Rational sub(Rational r) {
        return new Rational(this.numer * r.denom - r.numer * this.denom, this.denom * r.denom);
    }

    public Rational mult(Rational r) {
        return new Rational(this.numer * r.denom * r.numer * this.denom, this.denom * r.denom);
    }
    public Rational divide(Rational r) {
        int d = this.denom * r.denom;
        int n = this.numer * r.denom + r.numer * this.denom;
        return new Rational(n, d);
    }

    private boolean divisible(int n, int d) {
        return (double) n / (double) d % 1 == 0;
    }

    private void reduce() {
        for (int i = 2; i < this.numer; i++) {
            if (divisible(this.numer, i) && divisible(this.denom, i)) {
                this.numer /= i;
                this.denom /= i;
                reduce();
            }
        }
    }

    public String toString() {
        return new String(numer + "/" + denom);
    }
}