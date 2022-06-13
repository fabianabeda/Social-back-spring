package br.edu.ifpb.gugawag.socialback.repositorio;

import br.edu.ifpb.gugawag.socialback.modelo.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MensagemRepositorioIF extends JpaRepository<Mensagem, Long> {
    @Query("SELECT m FROM Mensagem m where (m.destinatario=:nome)")
    public List<Mensagem> getMensagemByNome(String nome);

}