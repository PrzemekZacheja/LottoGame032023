package minigames.games.lotto;

import minigames.games.IGame;

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