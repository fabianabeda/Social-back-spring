package br.edu.ifpb.gugawag.socialback.servico;

import br.edu.ifpb.gugawag.socialback.modelo.Mensagem;
import br.edu.ifpb.gugawag.socialback.repositorio.MensagemRepositorioIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MensagemServico {

    @Autowired
    private MensagemRepositorioIF mensagemRepositorioIF;

    public List<Mensagem> getMensagem() {
        return this.mensagemRepositorioIF.findAll();
    }

    public Mensagem mensagemEnviada(Mensagem mensagem){
        if(Objects.isNull(mensagem)){
            throw new RuntimeException("Não tem mensagem a ser exibida");
        }
        Mensagem mensagemInserida = this.mensagemRepositorioIF.save(mensagem);
        return mensagemInserida;

    }


}