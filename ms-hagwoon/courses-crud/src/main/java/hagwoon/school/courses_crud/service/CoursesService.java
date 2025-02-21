package hagwoon.school.courses_crud.service;

import hagwoon.school.courses_crud.entities.Courses;

public interface CoursesService {

    Courses create(Courses courses);
    Courses readByName(String name);
    Courses update(Courses courses, String name);
    void delete (String name);
}
