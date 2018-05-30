package cn.share2u.ssmTest.web;

import cn.share2u.ssmTest.model.Student;
import cn.share2u.ssmTest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("select")
    public Student select(Integer id) {
        return studentService.select(id);
    }
}
