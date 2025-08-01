package hub.forun.api.domain.topicos;

import java.time.LocalDateTime;

public record DadosListagemTopicos(Long id, String titulo, String mensagem, LocalDateTime dataCriacao) {

    public DadosListagemTopicos(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(),topico.getDataCriacao() );
    }

}
