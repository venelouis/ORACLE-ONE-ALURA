package hub.forun.api.domain.topicos;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(
       @NotNull(message = "O campo id é obrigatório!")
        Long id,
        String titulo,
        String mensagem) {
}
