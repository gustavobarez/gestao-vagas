package br.com.gustavobarez.gestao_vagas.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor // construtor com todos os argumentos abaixo
public class ErrorMessageDTO {
    private String message;
    private String field;
}
