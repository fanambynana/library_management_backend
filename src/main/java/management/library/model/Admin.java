package management.library.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Admin extends User{
    public Admin(String id, String name, String sex, String password){
        super(id, name, sex, password);
    }
}
