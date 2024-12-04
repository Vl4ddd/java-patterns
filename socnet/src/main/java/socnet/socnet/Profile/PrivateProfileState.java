package socnet.socnet.Profile;

import socnet.socnet.DTO.User.UserDTO;
import socnet.socnet.Logger.Logger;

public class PrivateProfileState implements ProfileState{

    @Override
    public void viewProfile() {
        Logger logger = Logger.getInstance();
		logger.log("View private profile");
    }

    @Override
    public void changePrivacy(UserDTO userDTO, ProfileContext context) {
        Logger logger = Logger.getInstance();
		logger.log(userDTO.getLogin() + " - profile privacy change to public");
        userDTO.setProfileState("public");
        context.setState(new PublicProfileState());
    }

}
