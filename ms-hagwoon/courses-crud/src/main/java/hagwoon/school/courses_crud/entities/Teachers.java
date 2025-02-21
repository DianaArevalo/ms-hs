package hagwoon.school.courses_crud.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Teachers {

    @Id
    private Long id;
    private String name;
    private String email;
}
