package hub.forun.api.domain.usuario;

public record DadosUsuario(
        String nome,
        String email,
        String senha,
        Perfis perfil
) {
}
