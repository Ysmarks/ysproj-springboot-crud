package br.com.ys.project.springboot.ysprojspringbootcrud.teste;

import br.com.ys.project.springboot.ysprojspringbootcrud.domain.Student;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class JavaSpringClientTest {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplateBuilder().rootUri("http://localhost:8085/v1").build();
        Student forObject = restTemplate.getForObject("/{id}", Student.class, 40);
        System.out.println(forObject);

        ResponseEntity<Student> forEntity = restTemplate.getForEntity("/{id}", Student.class, 43);
        System.out.println(forEntity);

        /*Student[] forObject1 = restTemplate.getForObject("/", Student[].class);
        System.out.println(forObject1);*/

        ResponseEntity<List<Student>> exchange = restTemplate.exchange("/", HttpMethod.GET, null, new ParameterizedTypeReference<List<Student>>() {
        });
        System.out.println(exchange);
    }
}
