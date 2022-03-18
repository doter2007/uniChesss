package test.itschool.samsung.unichesss.engine.classic.player.ai;

import test.itschool.samsung.unichesss.engine.classic.board.Move;
import test.itschool.samsung.unichesss.engine.classic.board.Board;

public interface MoveStrategy {

    long getNumBoardsEvaluated();

    Move execute(Board board);

}
