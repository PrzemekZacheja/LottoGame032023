package minigames;

import minigames.lotto.IGame;
import minigames.lotto.LottoGame;
import minigames.lotto.input.NumberTaker;
import minigames.lotto.logic.NumberMaker;
import minigames.lotto.messageprovider.MessageProvider;

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