package br.edu.ifpb.gugawag.socialback.controlador;
import br.edu.ifpb.gugawag.socialback.modelo.Mensagem;
import br.edu.ifpb.gugawag.socialback.servico.MensagemServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/mensagem")
public class MensagemControlador {

    @Autowired
    private MensagemServico mensagemServico;

    @GetMapping
    public List<Mensagem> getUsuarios(){
        return this.mensagemServico.getMensagem();
    }

    @PostMapping
    public Mensagem inserir(@RequestBody Mensagem mensagemEnviada) {
        return this.mensagemServico.mensagemEnviada(mensagemEnviada);
    }
}