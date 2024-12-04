package socnet.socnet.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import socnet.socnet.DTO.User.UserDTO;
import socnet.socnet.Profile.ProfileContext;

@RestController
@RequestMapping("/api/v1/profile")
public class ProfileController {

    private final ProfileContext profileContext;
    private final UserDTO userDTO;

    @Autowired
    public ProfileController(ProfileContext profileContext, UserDTO userDTO) {
        this.profileContext = profileContext;
        this.userDTO = userDTO;
    }
/*
   @GetMapping("/view")
    public void viewProfile(@RequestParam String login) {
        String userLogin = userDTO.getLogin(); // Доделать поиск по логину
       
        profileContext.viewProfile();
    }

    @PostMapping("/change-privacy")
    public void changePrivacy(@RequestParam String login) {
       
        profileContext.changePrivacy();
    }
*/
}
