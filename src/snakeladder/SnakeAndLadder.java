package snakeladder;
import java.util.Random;

public class SnakeAndLadder {
	static int position = 0;
	public static int diceRoll() {
		Random random = new Random();
		int dice = random.nextInt(6)+1;
		return dice;
	}

	public static void main(String[] args) {
		System.out.println("Dice Roll number =" + diceRoll());
	}

}
