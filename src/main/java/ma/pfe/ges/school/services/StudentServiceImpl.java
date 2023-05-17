package ma.pfe.ges.school.services;

import ma.pfe.ges.school.dtos.StudentDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{


    public static final Logger
            LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);
    @Override
    public Long save(StudentDto dto) {
        return null;
    }

    @Override
    public StudentDto update(StudentDto dto) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List<StudentDto> selectAll(StudentDto dto) {
        return null;
    }
}
