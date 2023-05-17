package ma.pfe.ges.school.mapper;

import ma.pfe.ges.school.dtos.StudentDto;
import ma.pfe.ges.school.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component("map1")
public class StudentMapper {


    public StudentEntity convertDtoToEntity(StudentDto dto){
        StudentEntity studentEntity= new StudentEntity();
        studentEntity.setId(dto.getId());
        studentEntity.setName(dto.getName());
        return studentEntity;

    }
    public StudentDto convertEntityToDto(StudentEntity entity){
        StudentDto studentDto = new StudentDto();
        studentDto.setId(entity.getId());
        studentDto.setName(entity.getName());
        return studentDto;

    }

    public List<StudentEntity> convertDtoToEntities(List<StudentDto> entities) {
        return entities
                .stream()
                .map(dto -> convertDtoToEntity(dto))
                .collect(Collectors.toList());
    }
    public List<StudentDto> convertEntityToDto (List < StudentEntity > dto){
        return dto
                .stream()
                .map(entity -> convertEntityToDto(entity))
                .collect(Collectors.toList());

    }




}
