class ComplexNumber {
    double real, imag;
    ComplexNumber(double r, double i) {
        real = r;
        imag = i;
    }
    ComplexNumber add(ComplexNumber b) {
        return new ComplexNumber(this.real + b.real, this.imag + b.imag);
    }
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(4, 5);
        ComplexNumber c3 = c1.add(c2);
        c3.display();
    }
}
