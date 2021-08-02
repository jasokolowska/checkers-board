public class Main {
    public static void main(String[] args) {
        Board checkers = new Board();

        checkers.setFigure(3,3, new Pawn("white"));
        checkers.setFigure(1,1, new Pawn("white"));
        checkers.setFigure(2,2, new Pawn("white"));
        checkers.setFigure(2,6, new Queen("white"));
        checkers.setFigure(1,3, new Queen("white"));
        System.out.println("Current figure is: " + checkers.getFigure(2,6));
        System.out.println(checkers);

        checkers.move(3,3, 4,4);
        checkers.move(2,6, 4,8);
        System.out.println(checkers);
    }
}
