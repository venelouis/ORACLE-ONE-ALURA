package hub.forun.api.controller;

import hub.forun.api.domain.repostas.DadosDetalhamentoResposta;
import hub.forun.api.domain.repostas.DadosResposta;
import hub.forun.api.domain.repostas.RespostaRepository;
import hub.forun.api.domain.repostas.Respostas;
import hub.forun.api.domain.topicos.Topico;
import hub.forun.api.domain.topicos.TopicoRepository;
import hub.forun.api.domain.usuario.Usuario;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Optional;

@RestController
@RequestMapping("resposta")
public class RespostaController {

    @Autowired
    private RespostaRepository repository;

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrarResposta(@RequestBody @Valid DadosResposta dados,
                                            @AuthenticationPrincipal Usuario usuarioLogado,
                                            UriComponentsBuilder uriBuilder){
        var topico=topicoRepository.getReferenceById(dados.idTopico());



        var resposta=new Respostas(dados,usuarioLogado,topico);
        System.out.println(resposta);
        repository.save(resposta);

        topico.atualizaStatus();
        var uri = uriBuilder.path("/resposta/{id}").buildAndExpand(resposta.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoResposta(resposta));


    }
}
