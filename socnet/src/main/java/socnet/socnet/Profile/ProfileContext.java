package socnet.socnet.Profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import socnet.socnet.DTO.User.UserDTO;

@Component
public class ProfileContext {
    private ProfileState state;
    private UserDTO userDTO;

    @Autowired
    public ProfileContext(PublicProfileState publicProfileState, UserDTO userDTO) {
        this.state = publicProfileState;
        this.userDTO = userDTO;
    }

    public void setState(ProfileState state) {
        this.state = state;
    }

    public void viewProfile() {
        state.viewProfile();
    }

    public void changePrivacy() {
        state.changePrivacy(userDTO, this);
    }
}