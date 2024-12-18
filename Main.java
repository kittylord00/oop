public class Main {
    public static void main(String[] args) {
        One one = new One(10.5, 20.3, 30.7);
        Two two = new Two(5, 10, 15);
        Three three = new Three(12.8, 8.5, 14.6);

        one.printValues();
        System.out.println("Сума значень в One: " + one.calculateSum());
        one.multiplyAndPrint(2);

        two.printValues();
        System.out.println("Добуток значень в Two: " + two.calculateProduct());
        two.subtractAndPrint(10);

        three.printValues();
        System.out.println("Середнє значення в Three: " + three.calculateAverage());
        three.divideAndPrint(5);

    }
}