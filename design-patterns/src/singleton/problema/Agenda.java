package singleton.problema;

import java.util.Map;
import java.util.HashMap;

public class Agenda {

    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    public Agenda() {
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terça", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sabado", Boolean.TRUE);

    }

    public Map<String, Boolean> getDiasDisponiveis() {
        return diasDisponiveis;
    }

        
    
    public void ocupa(String dia) {diasDisponiveis.replace(dia, Boolean.FALSE);}

}
