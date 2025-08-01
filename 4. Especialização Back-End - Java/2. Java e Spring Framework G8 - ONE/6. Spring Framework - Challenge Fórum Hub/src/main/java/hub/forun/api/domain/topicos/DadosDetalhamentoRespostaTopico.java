package hub.forun.api.domain.topicos;

import hub.forun.api.domain.repostas.Respostas;

import java.time.LocalDateTime;

public record DadosDetalhamentoRespostaTopico(
        Long id,
        String mensagem,
        String autorNome

) {

    public DadosDetalhamentoRespostaTopico(Respostas respostas){
        this(
                respostas.getId(), respostas.getMensagem(),
                respostas.getAutor().getNome()
        );
    }
}
