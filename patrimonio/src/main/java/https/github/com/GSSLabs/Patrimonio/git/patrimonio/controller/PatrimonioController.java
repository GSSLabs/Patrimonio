package https.github.com.GSSLabs.Patrimonio.git.patrimonio.controller;

import https.github.com.GSSLabs.Patrimonio.git.patrimonio.Model.Patrimonio;
import https.github.com.GSSLabs.Patrimonio.git.patrimonio.service.PatrimonioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/patrimonios")
public class PatrimonioController {

    @Autowired
    private PatrimonioService service;

    //Listar todos os patrimonios;
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("listarPatrimonios", service.ListarTodos());
        return "Lista";
    }

    //Formulário para novo patrimonio
    @GetMapping("/novo")
    public String novoFormulario(Model model) {
        model.addAttribute("patrimonio", new Patrimonio());
        return "formulario";
    }

    //Formulario para editar patrimonio existênte
    @GetMapping("/editar/{Id}")
    public String editarFormulario(@PathVariable("Id") Long Id, Model model) {
        Optional<Patrimonio> patrimonio = service.BuscarPorId(Id);

        if (patrimonio.isPresent()) {
            model.addAttribute("patrimonio", patrimonio.get());
            return "formulario";
        }
        return "redirect:/patrimonios";

    }

    //salvar/atualizar patrimonio
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute("patrimonio") Patrimonio patrimonio) {
        service.Salvar(patrimonio);
        return "redirect:/patrimonios";
    }

    //excluir patrimonio
    @GetMapping("/excluir/{Id}")
    public String excluir(@PathVariable("Id") Long Id) {
        service.Deletar(Id);
        return "redirect:/patrimonios";
    }
}
