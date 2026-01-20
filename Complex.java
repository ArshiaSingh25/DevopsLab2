class Complex {
    double real;
    double imag;

    // Constructor
    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add two complex numbers
    Complex add(Complex other) {
        return new Complex(
            this.real + other.real,
            this.imag + other.imag
        );
    }

    // Method to display complex number
    void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, -2);

        Complex sum = c1.add(c2);

        System.out.print("Sum = ");
        sum.display();
    }
}
