public class Vetores {

    public static void main(String[] args) {
        
        // exemplo 1

        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for(int i=0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // exemplo 2

        String[] letras = {"a", "b", "c", "d", "e"};

        for(int i=0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        // exemplo 3

        int[] numeros1 = {9, 10, 12, 25, 2};
        int maior = numeros1[0];
        int menor = numeros1[0];
        int media = 0;

        for(int i=0; i < numeros1.length; i++) {
            if(numeros1[i] > maior) {
                maior = numeros1[i];
            }
            if(numeros1[i] < menor) {
                menor = numeros1[i];
            }
            media += numeros1[i]
        }
        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("media: " + media/numeros1.length);

    }
}
