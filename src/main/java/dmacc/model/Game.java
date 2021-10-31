package dmacc.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;

	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}

	private void determineWinner() {
		String winner = "Kelli";
		this.setWinner(winner);
	}

	private void setComputerPlayerToRandom() {
		this.setComputerPlayer("Kelli");
	}
}