package br.com.ys.project.springboot.ysprojspringbootcrud.repository.interfaces;

import br.com.ys.project.springboot.ysprojspringbootcrud.domain.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
    List<Student> findByFirstNameIgnoreCaseContaining(String firstName);
}
