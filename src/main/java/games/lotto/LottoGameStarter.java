package games.lotto;

import games.Game;

import java.util.Scanner;

public class LottoGameStarter {

    public void startLottoGame() {
        Game lotek = new LottoGame(new NumberTaker(), new Scanner(System.in), new NumberMaker(), new MessageProvider(), new CalculatorResult());
        lotek.startGame();
    }
}