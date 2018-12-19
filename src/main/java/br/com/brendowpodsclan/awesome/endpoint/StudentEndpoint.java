package br.com.brendowpodsclan.awesome.endpoint;

import br.com.brendowpodsclan.awesome.model.Student;
import br.com.brendowpodsclan.awesome.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;

@RestController
@RequestMapping("student")
public class StudentEndpoint {
    @Autowired
    private DateUtil dateUtil;
    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public List<Student> listAll() {
        System.out.println(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        List<Student> lista = new ArrayList<>();
        Student s1 = new Student("Brendow");
        Student s2 = new Student("José");

        return asList(s1,s2);
    }
}
