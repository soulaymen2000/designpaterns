//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        accessHandler levelOne = new levelOneHandler();
        accessHandler levelTwo = new levelTwoHandler();
        accessHandler levelThree = new levelThreeHandler();

        levelOne.setNextHandler(levelTwo);
        levelTwo.setNextHandler(levelThree);

        levelOne.handleAccess("levelOne");
        levelOne.handleAccess("levelTwo");
        levelOne.handleAccess("levelThree");
        levelOne.handleAccess("levelFour");
    }
}