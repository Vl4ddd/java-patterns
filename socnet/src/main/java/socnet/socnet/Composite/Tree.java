package socnet.socnet.Composite;

import java.util.ArrayList;
import java.util.List;

public class Tree implements Component {
    private String name;
    private List<Component> Components = new ArrayList<>();

    public Tree(String name) {
        this.name = name;
    }

    public void add(Component menuComponent) {
        Components.add(menuComponent);
    }

    public void remove(Component menuComponent) {
        Components.remove(menuComponent);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGroup() {
        return ""; // Компоновщик не имеет цены
    }

    @Override
    public void print() {
        System.out.println("\n" + getName() + ":");
        for (Component Component : Components) {
            Component.print();
        }
    }
}
