public class One {
    double a, b, c;


    public One(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public void printValues() {
        System.out.println("Значення змінних в One: a = " + a + ", b = " + b + ", c = " + c);
    }


    public double calculateSum() {
        return a + b + c;
    }


    public void multiplyAndPrint(double factor) {
        double result = (a + b + c) * factor;
        System.out.println("Результат множення: " + factor + ": " + result);
    }
}
