package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

import static org.junit.jupiter.api.Assertions.*;


public class LogicTest {

    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new PawnBlack(Cell.D2));
        assertThrows(OccupiedCellException.class, () -> logic.move(Cell.C1, Cell.H6));
        assertThrows(FigureNotFoundException.class, () -> logic.move(Cell.C2, Cell.H3));
        assertThrows(ImpossibleMoveException.class, () -> logic.move(Cell.C1, Cell.B1));
        logic.move(Cell.C1, Cell.B2);
        assertThrows(OccupiedCellException.class, () -> logic.move(Cell.D2, Cell.B2));
    }
}