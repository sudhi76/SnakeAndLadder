package snakeladder;

import java.util.Random;

public class SnakeAndLadder {
	static int position = 0;
	static final int LADDER = 1;
	static final int SNAKE = 2;
	static final int NOPLAY = 0;
	static int totalDiceCount = 0;
	static final int PLAYER1 = 1;
	static final int PLAYER2 = 2;
	static int player = PLAYER1;
	static int dice;

	public static int diceRoll() {
		Random random = new Random();
		int dice = random.nextInt(6) + 1;
		return dice;
	}

	public static int checkoption() {
		Random random = new Random();
		int check = random.nextInt(3);
		return check;
	}

	public static void positionCheck() {
		int check = checkoption();
		if ((check == LADDER) && (position + dice <= 100)) {
			position = position + dice;
		} else if (check == SNAKE) {
			position = position - dice;
		} else if (position < 0) {
			position = 0;
		} else {
			position = position;
		}
	}

	public static void playercheck() {
		int check = checkoption();

	}

	public static void main(String[] args) {
		while (position < 100) {
			totalDiceCount++;
			dice = diceRoll();
			positionCheck();
			System.out.println("Dice Roll number =" + diceRoll());
			checkoption();
			System.out.println("Player current position = " + position);
		}
		System.out.println("total Dice Count:" + totalDiceCount);

	}

}
