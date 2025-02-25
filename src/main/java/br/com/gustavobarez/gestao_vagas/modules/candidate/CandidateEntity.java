package br.com.gustavobarez.gestao_vagas.modules.candidate;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity(name = "candidate") // estou criando minha tabela, onde todos atributos abaixo agora serao colunas na minha DB
public class CandidateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // vai criar esse ID sempre que algo for incluido no DB
    private UUID id;
    private String name;
    @Pattern(regexp = "\\S+", message = "O campo [username] nao deve conter espacos")
    private String username;
    @Email(message = "O campo [email] deve ser um e-mail valido")
    private String email;
    @Length(min = 10, max = 100, message = "A senha deve ter entre 10 e 100 caracteres")
    private String password;
    private String description;
    private String curriculum;

    @CreationTimestamp // quando foi criada
    private LocalDateTime createdAt;

}
