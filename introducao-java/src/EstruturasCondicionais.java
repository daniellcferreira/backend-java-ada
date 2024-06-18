public class EstruturasCondicionais {

    public static void main(String[] args) {

        // exemplo 1
        int nota = 70;

        if (nota >= 70) {
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }

        // exemplo 2

        if (nota >= 80) {
            System.out.println("graduação A");
        } else if (nota < 80 && nota >= 70) {
            System.out.println("graduação B");
        } else if (nota < 70 && nota >= 60) {
            System.out.println("graduação C");
        } else if (nota < 60 && nota >= 0) {
            System.out.println("graduação D");
        } else {
            System.out.println("nota invalida");
        }
    }
}
