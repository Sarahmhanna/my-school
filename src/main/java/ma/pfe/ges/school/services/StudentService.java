package ma.pfe.ges.school.services;

import ma.pfe.ges.school.dtos.StudentDto;

import java.util.List;

public interface StudentService {


    Long save(StudentDto dto);

    StudentDto update(StudentDto dto);

    boolean delete(Long id);

    List<StudentDto> selectAll(StudentDto dto);

}
