public class Complex {
    double real;
    double imag;
    public void setdata(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public void display(){
        System.out.println(real+" + "+ imag+"i");
    }
    public Complex add(Complex c1, Complex c2){
        double realPart = c1.real + c2.real;
        double imagPart = c1.imag + c2.imag;
        Complex sum = new Complex(realPart, imagPart);
        return sum;

    }
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, -5);
        Complex sum = new Complex(0, 0);
        sum = sum.add(c1, c2);
        
        System.out.print("Sum = ");
        sum.display();
    }
    
}
