package br.com.gustavobarez.gestao_vagas.exceptions;

public class JobNotFoundException extends RuntimeException {
    public JobNotFoundException() {
        super("Job nao existe");
    }
}
