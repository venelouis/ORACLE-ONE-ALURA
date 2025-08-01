package hub.forun.api.domain.repostas;

import hub.forun.api.domain.topicos.Topico;
import jakarta.validation.constraints.NotNull;


public record DadosResposta(
        String mensagem,

        @NotNull Long idTopico

) {
}
