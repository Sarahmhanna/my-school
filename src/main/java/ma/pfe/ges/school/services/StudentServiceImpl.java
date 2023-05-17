package ma.pfe.ges.school.services;

import ma.pfe.ges.school.dtos.StudentDto;
import ma.pfe.ges.school.mapper.StudentMapper;
import ma.pfe.ges.school.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("service1")
public class StudentServiceImpl implements StudentService{


    public static final Logger
            LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);

    private StudentRepository  repository;
    private StudentMapper mapper;

    public StudentServiceImpl(@Qualifier("repo1") StudentRepository repository, @Qualifier("map1") StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Long save(StudentDto dto) {
        LOGGER.debug("Star method name {} ", dto);
        StudentDto re=mapper.convertEntityToDto(repository.save(mapper.convertDtoToEntity(dto)));
        return re.getId();
    }

    @Override
    public StudentDto update(StudentDto dto) {
        LOGGER.debug("Star method name {}", dto);
        return mapper.convertEntityToDto(repository.update(mapper.convertDtoToEntity(dto)));
    }

    @Override
    public boolean delete(Long id) {
        LOGGER.debug("Star method delete id {} ", id);
        return repository.delete(id);
    }

    @Override
    public List<StudentDto> selectAll(StudentDto dto) {
        LOGGER.debug("Star method readAll ");
        return mapper.convertEntityToDto(repository.selectAll(mapper.convertDtoToEntity(dto)));
    }
}
