package management.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
public class Book {
    private String id;
    private String bookName;
    private int pageNumber;
    private LocalDate releaseDate;
    private List<Topic> topic;
}
