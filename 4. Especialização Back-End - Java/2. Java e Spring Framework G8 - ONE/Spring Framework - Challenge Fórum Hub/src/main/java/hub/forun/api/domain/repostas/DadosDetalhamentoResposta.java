package hub.forun.api.domain.repostas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record DadosDetalhamentoResposta(Long id, String topico,String mensagem ,LocalDateTime dataCriacao,String autor,Boolean solucao) {

    public DadosDetalhamentoResposta(Respostas respostas){
        this(respostas.getId(),respostas.getTopico().getTitulo(),respostas.getMensagem(),respostas.getDataCriacao(),respostas.getAutor().getNome(),respostas.getSolucao());
    }
}
