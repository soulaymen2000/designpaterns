import java.util.ArrayList;
import java.util.List;

public class directory implements fileComponent{
    private String name;
    private List<fileComponent> children;
    public directory(String name){
        this.name = name;
        children = new ArrayList<fileComponent>();
    }
    public void addChild(fileComponent child){
        children.add(child);
    }

    @Override
    public void display() {
        System.out.println(name);
        for(fileComponent child : children){
            child.display();
        }
    }
}
