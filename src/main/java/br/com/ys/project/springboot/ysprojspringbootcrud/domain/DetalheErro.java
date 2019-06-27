package br.com.ys.project.springboot.ysprojspringbootcrud.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DetalheErro {

    private String titulo;
    private int status;
    private String detalhe;
    private long timestemp;
    private String mensagem;
}
