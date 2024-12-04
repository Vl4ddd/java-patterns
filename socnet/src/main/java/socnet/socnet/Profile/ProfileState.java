package socnet.socnet.Profile;

import socnet.socnet.DTO.User.UserDTO;

public interface ProfileState {
    void viewProfile();
    void changePrivacy(UserDTO userDTO, ProfileContext context);
}
