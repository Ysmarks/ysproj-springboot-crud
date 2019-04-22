package br.com.ys.project.springboot.ysprojspringbootcrud.controller;

import br.com.ys.project.springboot.ysprojspringbootcrud.domain.Student;
import br.com.ys.project.springboot.ysprojspringbootcrud.utils.DateUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("v1")
public class StudantController {

    private final DateUtils dateUtils;

    @GetMapping
    public ResponseEntity<?> getAllStudents() {
        return new ResponseEntity<>(Student.studentList, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable("id") int id) {

        return new ResponseEntity<>();
    }
}
