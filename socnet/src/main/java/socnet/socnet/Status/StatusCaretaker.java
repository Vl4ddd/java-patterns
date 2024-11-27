package socnet.socnet.Status;

import java.util.ArrayList;
import java.util.List;

public class StatusCaretaker {
     private final List<StatusMemento> mementoList = new ArrayList<>();

    public void addMemento(StatusMemento memento) {
        mementoList.add(memento);
    }

    public StatusMemento getMemento(int index) {
        return mementoList.get(index);
    }

    public List<StatusMemento> getMementoList() {
        return mementoList;
    }
}
