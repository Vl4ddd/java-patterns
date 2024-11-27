package socnet.socnet.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import socnet.socnet.Status.Status;
import socnet.socnet.Status.StatusCaretaker;

@RestController
@RequestMapping("/api/v1/status")
public class StatusController {


     @Autowired
    private Status status;

    @Autowired
    private StatusCaretaker statusCaretaker;

    @PostMapping("/update")
    public String updateProfile(@RequestParam String text, @RequestParam String emoji) {
        statusCaretaker.addMemento(status.save());

        status.setText(text);
        status.setEmoji(emoji);

        return "Профиль обновлен!";
    }

    @GetMapping("/current")
    public Status getCurrentProfile() {
        return status;
    }

    @PostMapping("/restore/{index}")
    public String restoreProfile(@PathVariable int index) {
        status.restore(statusCaretaker.getMemento(index));
        return "Профиль восстановлен!";
    }
/*
    @GetMapping("/history{index}")
    public StatusMemento getHistory(@RequestParam int index) {
        return statusCaretaker.getMemento();
    }

*/
    
}
