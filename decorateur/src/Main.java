//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boisson cafe = new cafe();
        System.out.println(cafe.getDiscription()+" cout: "+cafe.getPrix());

        boisson cafeAvecLait = new lait(cafe);
        System.out.println(cafeAvecLait.getDiscription()+" cout: "+cafeAvecLait.getPrix());
    }
}