import java.util.*;

public class BoardRow {
    private List<Figure> row;

    public BoardRow() {
        this.row = new LinkedList<>();
        for (int i = 0; i < 8; i++){
            this.row.add(new None("white"));
        }
    }

    @Override
    public String toString() {
        Iterator<Figure> iterator = row.listIterator();
        String row = "";
        while (iterator.hasNext()) {
            row += (" |  " + iterator.next().toString());
        }
        return row + " |  ";
    }
}
// numer indeksu w boardrow to wiersz, a numer indeksu w board to kolumna
