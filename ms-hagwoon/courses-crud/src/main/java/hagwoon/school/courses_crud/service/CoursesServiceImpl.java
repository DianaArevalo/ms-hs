package hagwoon.school.courses_crud.service;

import hagwoon.school.courses_crud.entities.Category;
import hagwoon.school.courses_crud.entities.Courses;
import hagwoon.school.courses_crud.repositories.CoursesRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Objects;

@Service
@Transactional
@Slf4j
@AllArgsConstructor
public class CoursesServiceImpl implements CoursesService {

    private final CoursesRepository coursesRepository;

    @Override
    public Courses create(Courses courses) {
        courses.getWebSites().forEach(webSite -> {
            if(Objects.isNull(webSite.getCategory())){
                webSite.setCategory(Category.NONE);
            }
        });
        return this.coursesRepository.save(courses);
    }

    @Override
    public Courses readByName(String name) {
        return this.coursesRepository.findByName(name).orElseThrow(
                ()-> new NoSuchElementException("Course not found")
        );
    }

    @Override
    public Courses update(Courses courses, String name) {
        var courseToUpdate = this.coursesRepository.findByName(name).orElseThrow(
                ()-> new NoSuchElementException("Course not found")
        );
        courseToUpdate.setFounder(courses.getFounder());
        courseToUpdate.setSDate(courses.getSDate());
        return this.coursesRepository.save(courseToUpdate);
    }

    @Override
    public void delete(String name) {
        var courseToDelete = this.coursesRepository.findByName(name).orElseThrow(
                ()-> new NoSuchElementException("Course not found")
        );

        this.coursesRepository.delete(courseToDelete);

    }
}
