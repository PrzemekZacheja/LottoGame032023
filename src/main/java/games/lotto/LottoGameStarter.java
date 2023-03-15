package games.lotto;

import games.IGame;

import java.util.Scanner;

public class LottoGameStarter {

    public void startLottoGame() {
        IGame lotek = new LottoGame(new NumberTaker(), new Scanner(System.in), new NumberMaker(), new MessageProvider());

        lotek.startGame();
    }
}