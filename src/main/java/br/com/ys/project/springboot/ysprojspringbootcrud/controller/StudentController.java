package br.com.ys.project.springboot.ysprojspringbootcrud.controller;

import br.com.ys.project.springboot.ysprojspringbootcrud.domain.Student;
import br.com.ys.project.springboot.ysprojspringbootcrud.repository.interfaces.StudentRepository;
import br.com.ys.project.springboot.ysprojspringbootcrud.utils.DateUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("v1")
public class StudentController {

    private final DateUtils dateUtils;
    private final StudentRepository dao;

    @GetMapping
    public ResponseEntity<?> getAllStudents() {
        return new ResponseEntity<>(dao.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable("id") Long id) {
        Optional<Student> student = dao.findById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Student student) {
        System.out.printf("create student success");
        return new ResponseEntity<>(dao.save(student), HttpStatus.OK);
    }

    @PutMapping(path = "admin")
    public ResponseEntity<?> update(@RequestBody Student student) {
        return new ResponseEntity<>(dao.save(student), HttpStatus.OK);
    }

    @DeleteMapping(path = "admin/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        dao.deleteById(id);
        System.out.printf("DELETADO COM SUCESSO ");
        return new ResponseEntity<>( HttpStatus.OK);
    }
}
