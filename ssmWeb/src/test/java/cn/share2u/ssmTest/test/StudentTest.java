package cn.share2u.ssmTest.test;

import cn.share2u.ssmTest.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentTest extends BaseTest {
    @Autowired
    StudentService studentService;
    @Test
    public void testSelect(){
        System.out.println(studentService.select(1));
    }
}
