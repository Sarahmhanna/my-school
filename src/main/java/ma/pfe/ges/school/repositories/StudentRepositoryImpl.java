package ma.pfe.ges.school.repositories;

import ma.pfe.ges.school.entities.StudentEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepositoryImpl implements StudentRepository{
    @Override
    public Long save(StudentEntity entity) {
        return new StudentEntity().getId();
    }

    @Override
    public StudentEntity update(StudentEntity entity) {
        return new StudentEntity();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List<StudentEntity> selectAll(StudentEntity entity) {
        return new ArrayList<>();
    }
}
