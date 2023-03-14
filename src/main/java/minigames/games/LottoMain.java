package minigames.games;

import minigames.games.lotto.LottoGame;
import minigames.games.lotto.MessageProvider;
import minigames.games.lotto.NumberMaker;
import minigames.games.lotto.NumberTaker;

import java.util.Scanner;

public class LottoMain {

    public static void main(String[] args) {
        IGame lotek = new LottoGame(
                new NumberTaker(),
                new Scanner(System.in),
                new NumberMaker(),
                new MessageProvider());

        lotek.startGame();
    }

}