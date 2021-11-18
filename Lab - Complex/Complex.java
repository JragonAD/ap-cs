public class Complex {
    private double realPart, imaginaryPart;

    public Complex(double real, double imaginary) {
        realPart = real;
        imaginaryPart = imaginary;
    }

    public Complex(double real) {
        realPart = real;
        imaginaryPart = 0;
    }

    public Complex() {
        realPart = 0;
        imaginaryPart = 0;
    }

    public Complex add(Complex c) {
        return new Complex(this.realPart + c.realPart, this.imaginaryPart + c.imaginaryPart);
    }

    public Complex sub(Complex c) {
        return new Complex(this.realPart - c.realPart, this.imaginaryPart - c.imaginaryPart);
    }

    public Complex mult(Complex c) {
        double f = this.realPart * c.realPart;
        double o = this.realPart * c.imaginaryPart;
        double i = this.imaginaryPart * c.realPart;
        double l = this.imaginaryPart * c.imaginaryPart * -1;
        return new Complex(f + l, o + i);
    }

    public Complex divide(Complex c) {
        double f = this.realPart * c.realPart;
        double o = this.realPart * -c.imaginaryPart;
        double i = this.imaginaryPart * c.realPart;
        double l = this.imaginaryPart * c.imaginaryPart;
        double denom = c.realPart * c.realPart + c.imaginaryPart * c.imaginaryPart;
        return new Complex((f + l) / denom, (o + i) / denom);
    }

    public boolean equals(Complex c) {
        return (this.realPart == c.realPart && this.imaginaryPart == c.imaginaryPart);
    }

    public String toString() {
        return new String(realPart + " + " + imaginaryPart + "i");
    }
}
