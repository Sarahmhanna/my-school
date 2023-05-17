package ma.pfe.ges.school.repositories;

import ma.pfe.ges.school.entities.StudentEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository("repo1")
public class StudentRepositoryImpl implements StudentRepository{
    @Override
    public StudentEntity save(StudentEntity entity) {
        return new StudentEntity();
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
