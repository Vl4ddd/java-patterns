package socnet.socnet.Status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Status {
    private String text;
    private String emoji;

    public StatusMemento save() {
        return new StatusMemento(text, emoji);
    }

    public void restore(StatusMemento memento) {
        this.text = memento.getText();
        this.emoji = memento.getEmoji();
    }

}
