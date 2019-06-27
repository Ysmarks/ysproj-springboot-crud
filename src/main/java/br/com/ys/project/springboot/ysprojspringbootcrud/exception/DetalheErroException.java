package br.com.ys.project.springboot.ysprojspringbootcrud.exception;

import br.com.ys.project.springboot.ysprojspringbootcrud.domain.DetalheErro;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class DetalheErroException {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handler(ResourceNotFoundException recursoNaoEncontradoException) {
        DetalheErro erroDetalhe = DetalheErro.builder()
                .titulo(recursoNaoEncontradoException.getMessage())
                .detalhe("Teste")
                .status(HttpStatus.NOT_FOUND.value())
                .timestemp(new Date().getTime())
                .mensagem(recursoNaoEncontradoException.getMessage())
                .build();
        return new ResponseEntity<>(erroDetalhe, HttpStatus.NOT_FOUND);
    }
}
