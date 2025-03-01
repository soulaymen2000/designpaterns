import java.util.ArrayList;
import java.util.List;

public class pizza {
    private String taille;
    private String typeDeCroute;
    private List<String> garnitures = new ArrayList<>();

    public void setTaille(String taille) {
        this.taille = taille;
    }
    public void setTypeDeCroute(String typeDeCroute) {
        this.typeDeCroute = typeDeCroute;
    }
    public void addGarniture(String garniture) {
        this.garnitures.add(garniture);
    }

    @Override
    public String toString() {
        return taille + " " + typeDeCroute + " " + garnitures;
    }
}
