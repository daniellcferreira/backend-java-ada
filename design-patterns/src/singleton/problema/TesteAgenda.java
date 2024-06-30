package singleton.problema;

public class TesteAgenda {

    public static void main(String[] args) {
        reservaDia("Sexta");
        reservaDia("Sabado");
    }

    public static void reservaDia(String data) {
        Agenda agenda = new Agenda();
        agenda.ocupa(data);
        System.out.println(agenda.getDiasDisponiveis());
    }
}
