package hagwoon.school.courses_crud.repositories;

import hagwoon.school.courses_crud.entities.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CoursesRepository extends JpaRepository<Courses, Long> {

    Optional<Courses>findByName(String name);
}
