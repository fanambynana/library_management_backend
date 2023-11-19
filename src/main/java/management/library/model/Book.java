package management.library.model;

import java.time.LocalDate;
import java.util.List;

public class Book {
    private String id;
    private String bookName;
    private String pageNumber;
    private LocalDate releaseDate;
    private static List<Topic> topic;
}
