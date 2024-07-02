package proxy.solucao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

import builder.Pessoa;
import proxy.PessoaRepository;

public class PessoaRepositoryProxy extends PessoaRepository {

    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    private Map<Long, Pessoa> cache = new HashMap<>();

    @Override
    public Pessoa findById(Long id) {
        log.info("Iniciando chamanda do metodo findById...");
        long inicio = System.currentTimeMillis();
        Pessoa pessoa = null;
        if (Objects.nonNull(cache.get(id))) {
            log.info("Esta pegando do cache");
            pessoa = cache.get(id);
        } else {
            log.info("Esta pegando do PessoaRepository");
            pessoa = super.findById(id);
            cache.put(id, pessoa);
        }
        log.info("Chamada do metodo findById finalizada");
        long fim = System.currentTimeMillis();
        log.info("Tempo gasto na chamada..." + (fim - inicio));
        return pessoa;
    }

    @Override
    public void save(Pessoa pessoa) {
        log.info("Iniciando chamanda do metodo save...");
        super.save(pessoa);
        log.info("Chamada do metodo save finalizada.");
    }

}
