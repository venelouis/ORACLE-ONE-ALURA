package hub.forun.api.domain.topicos;


import hub.forun.api.domain.usuario.Usuario;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroTopicos(
                                    @NotBlank(message = "Campo título obrigatório")
                                    String titulo,

                                   @NotBlank(message = "Campo mensagem obrigatório")
                                   String mensagem,

                                   @NotBlank(message = "Campo curso obrigatório")
                                   String curso





                                   ) {
}
