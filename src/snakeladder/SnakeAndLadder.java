package snakeladder;

import java.util.Random;

public class SnakeAndLadder {
	static int position = 0;
	static final int LADDER = 1;
	static final int SNAKE = 2;
	static final int NOPLAY = 0;

	public static int diceRoll() {
		Random random = new Random();
		int dice = random.nextInt(6) + 1;
		return dice;
	}

	public static void checkoption(int dice) {
		Random random = new Random();
		int check = random.nextInt(3);
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

	public static void main(String[] args) {
		while (position < 100) {
			int dice = diceRoll();
			System.out.println("Dice Roll number =" + diceRoll());
			checkoption(dice);
			System.out.println("Player current position = " + position);
		}

	}

}
