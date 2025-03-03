package br.com.gustavobarez.gestao_vagas.modules.candidate.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gustavobarez.gestao_vagas.exceptions.UserFoundException;
import br.com.gustavobarez.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.gustavobarez.gestao_vagas.modules.candidate.CandidateRepository;

@Service
public class CreateCandidateUseCase {
    
    @Autowired // spring vai instanciar e cuidar
    private CandidateRepository candidateRepository;

    public CandidateEntity execute(CandidateEntity candidateEntity) {
        var candidateExists = this.candidateRepository;
        
        this.candidateRepository.findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail()).ifPresent((user) -> {
            throw new UserFoundException();        
        });
        return this.candidateRepository.save(candidateEntity);
    }

}
