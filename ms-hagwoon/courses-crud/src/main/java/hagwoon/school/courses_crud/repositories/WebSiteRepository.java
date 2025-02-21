package hagwoon.school.courses_crud.repositories;

import hagwoon.school.courses_crud.entities.WebSite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebSiteRepository extends JpaRepository <WebSite, Long> {
}
