import java.util.*;

public class Board {

    private List<BoardRow> board;

    public Board() {
        this.board = new LinkedList<>();
        for (int i = 0; i < 8; i++){
            this.board.add(new BoardRow());
        }
    }

    public Figure getFigure(int row, int col){

    }
//    public void setFigure(int row, int col, Figure figure){
//
//    }
//
    public String toString(){
        Iterator<BoardRow> iterator = board.listIterator();
        String board = "";
        String midLinePattern = "\n |----|----|----|----|----|----|----|----|\n";
        while (iterator.hasNext()) {
            board += (iterator.next().toString() + midLinePattern);
        }
        return midLinePattern + board;
    }
}
