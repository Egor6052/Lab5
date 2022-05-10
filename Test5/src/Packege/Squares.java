package Packege;

import java.util.Arrays;

public class Squares {
    private Square[] squares;

    public Squares(int length) {
        this.squares = new Square[length];
    }

    public void setSquareAt(int index, Square square) {
        squares[index] = square;
    }

    @Override
    public String toString() {
        return "Squares{" +
                "squares=" + Arrays.toString(squares) + "}";
    }

}
