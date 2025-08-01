package hub.forun.api.domain.topicos;

import hub.forun.api.domain.repostas.Respostas;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public record DadosDetalhamentoUnicoTopico(Long id,
                                           String titulo,
                                           String mensagem,
                                           String curso ,
                                           LocalDateTime dataCriacao,
                                           String autor,
                                           Status status,
                                           List<DadosDetalhamentoRespostaTopico> respostas) {

    public DadosDetalhamentoUnicoTopico(Topico topico){
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getCurso(),
                topico.getDataCriacao(),
                topico.getAutor().getNome(),
                topico.getStatus(),
                topico.getRespostas().stream()
                        .map(DadosDetalhamentoRespostaTopico::new)
                        .collect(Collectors.toList())
        );
    }
}
