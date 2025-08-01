package hub.forun.api.domain.topicos;




import hub.forun.api.domain.repostas.Respostas;
import hub.forun.api.domain.usuario.DadosAutenticacao;
import hub.forun.api.domain.usuario.Usuario;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity(name = "Topico")
@Table(name = "topicos")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

 @Column(nullable = false)
   private String titulo;

 @Column(nullable = false)
   private String mensagem;
   private   LocalDateTime dataCriacao;

 @Enumerated(EnumType.STRING)
  private   Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id", nullable = false)
    private Usuario autor;

   private String curso;

  @OneToMany(mappedBy = "topico",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
   private List<Respostas> respostas=new ArrayList<>();

   public Topico(DadosCadastroTopicos dados ,Usuario usuarioLogado){
       this.titulo= dados.titulo();
       this.mensagem= dados.mensagem();
       this.dataCriacao=LocalDateTime.now();
       this.status=Status.NAO_RESPONDIDO;
       this.curso= dados.curso();
       this.autor=usuarioLogado;

   }

   public void atualizarInformacoes( DadosAtualizacaoTopico dados) {

    if (dados.titulo() != null){
        this.titulo= dados.titulo();
    }

     if (dados.mensagem() != null){
         this.mensagem= dados.mensagem();
     }

    }


    public void atualizaStatus() {
       this.status=Status.RESPONDIDO;
    }
}
