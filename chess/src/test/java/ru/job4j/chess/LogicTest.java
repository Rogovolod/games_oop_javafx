package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

public class LogicTest {

    private final Logic logic = new Logic();

    @Test(expected = OccupiedCellException.class)
    public void moveButOccupiedCell()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new PawnBlack(Cell.D2));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test(expected = FigureNotFoundException.class)
    public void moveButFigureNotFound()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new PawnBlack(Cell.D2));
        logic.move(Cell.C2, Cell.H3);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void moveImpossible()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new PawnBlack(Cell.D2));
        logic.move(Cell.C1, Cell.B1);
    }
}