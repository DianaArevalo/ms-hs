package hagwoon.school.courses_crud.controllers;

import hagwoon.school.courses_crud.dto.CourseDTO;
import hagwoon.school.courses_crud.entities.Courses;
import hagwoon.school.courses_crud.entities.Teachers;
import hagwoon.school.courses_crud.repositories.TeacherRepository;
import hagwoon.school.courses_crud.repositories.WebSiteRepository;
import hagwoon.school.courses_crud.service.CoursesService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping(path = "courses")
@AllArgsConstructor
@Slf4j
public class CoursesController {


    private final CoursesService coursesService;
    private final TeacherRepository teacherRepository;
    private final WebSiteRepository webSiteRepository;


    @GetMapping(path= "{name}")
    public ResponseEntity<Courses> get(@PathVariable String name){
        log.info("GET:courses{}", name);
        return ResponseEntity.ok(this.coursesService.readByName(name));
    }

//    @PostMapping
//    public ResponseEntity<Courses> post(@RequestBody CourseDTO courseDTO){
//
//    }

    @PutMapping(path = "{name}")
    public ResponseEntity<Courses> put(@RequestBody Courses courses,
                                       @PathVariable String name){
        log.info("PUT:courses{}", name);
        return ResponseEntity.ok(this.coursesService.update(courses, name));
    }

    @DeleteMapping(path = "{name}")
    public ResponseEntity<?> delete(@PathVariable String name){
        log.info("DELETE:COURSES{}", name );
        this.coursesService.delete(name);
        return ResponseEntity.noContent().build();
    }


}
