package br.com.ys.project.springboot.ysprojspringbootcrud.repository.interfaces;

import br.com.ys.project.springboot.ysprojspringbootcrud.domain.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
}
