package br.com.ys.project.springboot.ysprojspringbootcrud.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "student")
public class Student extends AbstractEntity {

    @NotNull private String firstName;
    @NotNull private String middleName;
    @NotNull private String lastName;
    @NotNull private String sex;
    @NotNull private Long age;


}
