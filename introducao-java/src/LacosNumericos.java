public class LacosNumericos {

    public static void main(String[] args) {

        // exemplo 1
        // 1 2 3 4 5 6 7 8 9 10

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // exemplo 2

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + "x" + i + "=" + j * i);
            }
        }
    }
}
