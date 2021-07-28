package guru.qa;

public class Main {
    public static void main(String[] args) {

        Notebook hp = new Notebook(2018, (char) 13, "red", true);
        Notebook mac = new Notebook(2020, (char) 15, "white", false);

        mac.setColor("black");
        hp.setColor("red");

        System.out.println("If java show me the red color, then i win!");
        System.out.println(hp.getColor());
    }
}
