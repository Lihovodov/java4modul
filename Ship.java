import java.util.List;

public class Ship {
    private final int size;
    private final List<String> cells;

    public Ship(int size, List<String> cells) {
        this.size = size;
        this.cells = cells;
    }

    public int getSize() {
        return size;
    }

    public List<String> getCells() {
        return cells;
    }
}