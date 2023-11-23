import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PratoService {

    @Autowired
    private PratoRepository pratoRepository;

    public List<Prato> listarPratos() {
        return pratoRepository.findAll();
    }

    public Optional<Prato> buscarPorId(Long id) {
        return pratoRepository.findById(id);
    }

    public Prato salvarPrato(Prato prato) {
        return pratoRepository.save(prato);
    }

    public void deletarPrato(Long id) {
        pratoRepository.deleteById(id);
    }

    // Implemente métodos para atualização conforme necessário
}
