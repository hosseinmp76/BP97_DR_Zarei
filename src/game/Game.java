package game;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private static final int BOARD_WIDTH = 6;
	private static final int BOARD_LENGTH = 10;

	public static void main(String[] args) {
		boolean [][] board = new boolean[BOARD_LENGTH][BOARD_WIDTH];
		List<Shape> shapes = new ArrayList<>();
		for (Shape s: Shape.values()) {
			shapes.add(s);
		}
		if (fill(board, shapes, 0)) {
			for (Shape s: Shape.values()) {
				s.printPosition();
			}
		} else {
			System.out.println("NO solution");
		}
	}

	private static boolean fill(boolean[][] board, List<Shape> shapes, int depth) {
		System.out.println("in depth " + depth);
		for (int i=0; i<BOARD_LENGTH; i++) {
			for (int j = 0; j<BOARD_WIDTH; j++) {
				if (board[i][j]==false) {
					for (int k=0; k<shapes.size();k++) {
						for (int dir=0; dir<1; dir++) {
							if (shapes.get(k).fit(i, j, board, dir)) {
								List<Shape> newShapes = new ArrayList<>();
								newShapes.addAll(shapes);
								newShapes.remove(shapes.get(k));
								if(fill(board, newShapes, depth+1)) {
									return true;
								} else {
									shapes.get(k).unfit(i, j, board, dir);
								}
							}
						}
					}
					return false;
				}
			}
		}
		return false;
	}

}
