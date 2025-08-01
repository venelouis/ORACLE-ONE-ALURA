package hub.forun.api.domain.topicos;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicoRepository extends JpaRepository<Topico,Long> {
    Boolean existsByTituloAndMensagem(@NotBlank(message = "Campo título obrigatório") String titulo, @NotBlank(message = "Campo mensagem obrigatório") String mensagem);
}
