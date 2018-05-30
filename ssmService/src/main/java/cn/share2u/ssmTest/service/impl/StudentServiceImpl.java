package cn.share2u.ssmTest.service.impl;

import cn.share2u.ssmTest.dao.StudentDao;
import cn.share2u.ssmTest.model.Student;
import cn.share2u.ssmTest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;
    public Student select(Integer id) {
        return studentDao.select(id);
    }
}
