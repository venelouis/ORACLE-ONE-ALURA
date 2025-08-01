package hub.forun.api.domain.usuario;

import jakarta.validation.constraints.NotNull;

public record DadosCadastroDeUsuario(

         @NotNull(message = "O login é obrigatório!")
         String login,
         String senha,
         String nome

) {
}
