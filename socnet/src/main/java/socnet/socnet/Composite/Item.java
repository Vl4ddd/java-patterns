package socnet.socnet.Composite;

public class Item implements Component{

    private String name;
    private String group;

    public Item(String name, String group) {
        this.name = name;
        this.group = group;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGroup() {
        return group;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + getGroup());
    }

}
