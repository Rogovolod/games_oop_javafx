package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void positionTest() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        assertThat(bishop.position(), is(Cell.C1));
    }
    @Test
    public void copyTest() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Figure figure = bishop.copy(Cell.G5);
        assertThat(figure.position(), is(Cell.G5));
    }

    @Test
    public void wayTest() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] cells = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        BishopBlack bishop2 = new BishopBlack(Cell.G5);
        Cell[] cells2 = new Cell[]{Cell.F4, Cell.E3, Cell.D2, Cell.C1};
        assertThat(bishop.way(Cell.G5), is (cells));
        assertThat(bishop2.way(Cell.C1), is (cells2));
    }

    @Test
    public void isDiagonalTest() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        assertThat(bishop.isDiagonal(Cell.C1, Cell.G5), is(true));
        assertThat(bishop.isDiagonal(Cell.C3, Cell.H7), is(false));

    }

}