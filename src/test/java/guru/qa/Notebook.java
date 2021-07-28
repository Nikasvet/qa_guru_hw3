package guru.qa;

public class Notebook {

    int creationDate;
    char diagonal = 13;
    String color;
    boolean bluetooth;

    public Notebook(int creationDate, char diagonal, String color, boolean bluetooth) {
        this.creationDate = creationDate;
        this.diagonal = diagonal;
        this.color = color;
        this.bluetooth = bluetooth;
    }

    void setColor(String color) {

        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
