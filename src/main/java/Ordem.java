import java.awt.*;

public class Ordem {
    private Color color;
    private int position;

    public Ordem(Color color, int position) {
        this.color = color;
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public int getPosition() {
        return position;
    }
}
