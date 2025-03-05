package br.com.gustavobarez.gestao_vagas.modules.candidate;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID> {
    // pelo findBy o JPA entende que queremos fazer uma busca, e ele fara sozinho um select no banco de dados para verificar isso 
    Optional<CandidateEntity> findByUsernameOrEmail(String username, String email);    
    Optional<CandidateEntity> findByUsername(String username);
}
