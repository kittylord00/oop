public class Two {
        int x, y, z;


        public Two(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public void printValues() {
            System.out.println("Значення змінних в Two: x = " + x + ", y = " + y + ", z = " + z);
        }

        public int calculateProduct() {
            return x * y * z;
        }

        public void subtractAndPrint(int subtractValue) {
            int result = (x + y + z) - subtractValue;
            System.out.println("Результат віднімання " + subtractValue + ": " + result);
        }
}
