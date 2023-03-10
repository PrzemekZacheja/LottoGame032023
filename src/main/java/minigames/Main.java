package minigames;

import minigames.games.IGame;
import minigames.games.lotto.LottoGame;
import minigames.games.lotto.input.NumberTaker;
import minigames.games.lotto.logic.NumberMaker;
import minigames.games.lotto.messageprovider.MessageProvider;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IGame lotek = prepareGame();
        lotek.startGame();
    }

    private static IGame prepareGame() {
        NumberTaker taker = new NumberTaker();
        Scanner scanner = new Scanner(System.in);
        NumberMaker numberMaker = new NumberMaker();
        MessageProvider messageProvider = new MessageProvider();
        return new LottoGame(taker, scanner, numberMaker, messageProvider);
    }
}