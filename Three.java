public class Three {
    double p, q, r;

    public Three(double p, double q, double r) {
        this.p = p;
        this.q = q;
        this.r = r;
    }

    public void printValues() {
        System.out.println("Значення змінних в Three: p = " + p + ", q = " + q + ", r = " + r);
    }


    public double calculateAverage() {
        return (p + q + r) / 3;
    }

    public void divideAndPrint(double divisor) {
        if (divisor != 0) {
            double result = (p + q + r) / divisor;
            System.out.println("Результат ділення на " + divisor + ": " + result);
        } else {
            System.out.println("Результат: ~ ∞");
        }
    }
}
