package ma.pfe.ges.school.repositories;

import ma.pfe.ges.school.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {





    StudentEntity save(StudentEntity entity);
    StudentEntity update(StudentEntity entity);
    boolean delete (Long id);
    List<StudentEntity> selectAll(StudentEntity entity);
}
