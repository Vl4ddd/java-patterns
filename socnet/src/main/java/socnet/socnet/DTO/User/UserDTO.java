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
    private String profileState;
    private boolean isAdmin;

    private UserDTO(String login, String name, String surname, String email, int age, boolean isAdmin, String profileState) {
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.isAdmin = isAdmin;
        this.profileState = profileState;
    }

    private UserDTO(String profileState){
        this.profileState = profileState;
    }

    public String getProfileState() {
        return profileState;
    }

    public void setProfileState(String profileState) {
        this.profileState = profileState;
    }

    public static UserDTO getAdminUser(String login, String name, String surname, String email, int age,
            boolean isAdmin, String profileState) {
        return new UserDTO(login, name, surname, email, age, true, profileState);
    }

    public static UserDTO getSimpleUser(String login, String name, String surname, String email, int age,
            boolean isAdmin, String profileState) {
        return new UserDTO(login, name, surname, email, age, false, profileState);
    }

}