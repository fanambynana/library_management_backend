package management.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Subscriber extends User{
    private String reference;
    public Subscriber(String id, String name, String sex, String reference, String password) {
        super(id, name, sex, password);
        this.reference = reference;
    }
}
