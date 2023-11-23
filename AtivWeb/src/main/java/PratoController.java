import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pratos")
public class PratoController {

    @Autowired
    private PratoService pratoService;

    @GetMapping
    public List<Prato> listarPratos() {
        return pratoService.listarPratos();
    }

    @GetMapping("/{id}")
    public Prato buscarPorId(@PathVariable Long id) {
        return pratoService.buscarPorId(id).orElse(null);
    }

    @PostMapping
    public Prato salvarPrato(@RequestBody Prato prato) {
        return pratoService.salvarPrato(prato);
    }

    @DeleteMapping("/{id}")
    public void deletarPrato(@PathVariable Long id) {
        pratoService.deletarPrato(id);
    }

    // Implemente métodos para atualização conforme necessário
}
