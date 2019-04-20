package br.com.ys.project.springboot.ysprojspringbootcrud.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static java.util.Arrays.asList;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Student {

    private String name;

    public static List<Student> studentList;

    static {
        getStudentListRepository();
    }

    private static void getStudentListRepository() {
        studentList = asList(new Student("Ysmarks"), new Student("Kelly"), new Student("David"));
    }
}
