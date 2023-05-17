package ma.pfe.ges.school.controllers;

import ma.pfe.ges.school.dtos.StudentDto;
import ma.pfe.ges.school.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {

@Autowired
    private StudentService service;
    @PostMapping
    public Long save(@RequestBody StudentDto dto){
        Long se =service.save(dto);
        return se;
    }
        //LOGGER.debug("Star method name {}",dto);

    @PutMapping
    public StudentDto update(@RequestBody StudentDto dto) {
        //LOGGER.debug("Star method name {}",dto);
        return service.update(dto);
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Long id) {
       // LOGGER.debug("Star method id {}",id);
        return service.delete(id);
    }
    @GetMapping
    public List<StudentDto> selectAll(StudentDto dto) {
        //LOGGER.debug("Star method name");
        return service.selectAll(dto);
    }
}
