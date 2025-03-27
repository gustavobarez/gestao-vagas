package br.com.gustavobarez.gestao_vagas.modules.candidate.dto;

import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCandidateReponseDTO {
    @Schema(example = "Desenvolvedor Java")
    private String description;
    @Schema(example = "Gustavo")
    private String username;
    @Schema(example = "gustavo@gmail.com")
    private String email;
    private UUID id;
    @Schema(example = "Gustavo da Silva")
    private String name;
}
