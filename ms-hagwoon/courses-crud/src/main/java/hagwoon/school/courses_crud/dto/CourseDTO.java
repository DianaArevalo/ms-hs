package hagwoon.school.courses_crud.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class CourseDTO {
    private String name;
    private Long founder; // ID del profesor
    private LocalDate sDate;
    private List<WebSiteDTO> webSites; // Lista de sitios web relacionados
}
