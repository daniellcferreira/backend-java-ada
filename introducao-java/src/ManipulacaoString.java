import java.time.LocalDate;
import java.time.LocalDateTime;

public class ManipulacaoString {

    public static void main(String[] args) {

        // exemplo 1
        String nome = "Pedro";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        // exemplo 2
        String outroNome = "Paulo";
        System.out.println(nome.equalsIgnoreCase(outroNome));

        // datas
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        System.out.println(hoje.getDayOfMonth());

        // exemplo 2 data
        String saudacao;

        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        } else {
            saudacao = "";
        }

        System.out.printf(saudacao);

    }
}
