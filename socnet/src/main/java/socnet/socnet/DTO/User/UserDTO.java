package socnet.socnet.DTO.User;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO {

    private String login;
    private String name;
    private String surname;
    private String email;
    private int age;
    private boolean isAdmin;

    private UserDTO(String login, String name, String surname, String email, int age, boolean isAdmin) {
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.isAdmin = isAdmin;
    }

    public static UserDTO getAdminUser(String login, String name, String surname, String email, int age,
            boolean isAdmin) {
        return new UserDTO(login, name, surname, email, age, true);
    }

    public static UserDTO getSimpleUser(String login, String name, String surname, String email, int age,
            boolean isAdmin) {
        return new UserDTO(login, name, surname, email, age, false);
    }

}