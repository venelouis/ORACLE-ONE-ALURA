package hub.forun.api.domain.usuario;

public record DadosUsuarioCadastrado(Long id,String email,String nome) {

    public DadosUsuarioCadastrado(Usuario usuario){
        this(usuario.getId(), usuario.getLogin(), usuario.getNome());
    }
}
