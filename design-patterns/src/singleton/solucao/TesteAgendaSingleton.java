package singleton.solucao;

public class TesteAgendaSingleton {

    public static void main(String[] args) {
        // reservaDiaEAGER("Sexta");
        // reservaDiaEAGER("Sabado");

        // reservaDiaLAZY("Sexta");
        // reservaDiaLAZY("Sabado");

        AgendaSingletonEnum agenda1 = AgendaSingletonEnum.getInstance();
        AgendaSingletonEnum agenda2 = AgendaSingletonEnum.getInstance();
        System.out.println(agenda1.hashCode());
        System.out.println(agenda2.hashCode());

        reservaDiaEnum("Sexta");
        reservaDiaEnum("Sabado");
    }

    public static void reservaDiaEAGER(String dia) {
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiasDisponiveis());
    }

    public static void reservaDiaLAZY(String dia) {
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiasDisponiveis());
    }

    public static void reservaDiaEnum(String dia) {
        AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiasDisponiveis());
    }
}
