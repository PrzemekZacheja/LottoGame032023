package minigames.games.lotto;

import java.util.Set;

class MessageProvider {

    public static final String YOURS_NUMBERS_ARE = "Yours numbers are: ->";
    public static final String THE_WINNER_NUMBERS_ARE = "The WINNER numbers are: ";
    public static final String WINNER_MESSAGE = "You are lucky guy, YOU WIN";
    public static final String LOOSE_MESSAGE = "Oh my Gosh, you LOOSE";
    public static final String INPUT_NOT_NUMBER = "Error, You must input only numbers";
    public static final String INPUT_OVER_THE_RANGE = "Your number is over the range from %d to %d%n";
    public static final String INPUT_NEXT_NUMBER = "Input next number in range from %d to %d %n";
    public static final String START_GAME_INFO = "You are using a Lotto simulator application. " +
            "Enter 6 numbers from 1 to 99 to find out if you matched the winning numbers.\n";

    public MessageProvider() {
    }

    void printResult(boolean result) {
        System.out.println(result ? WINNER_MESSAGE : LOOSE_MESSAGE);
    }

    void showInputNumbersFromPlayer(Set<Integer> sixNumbersFromPlayer) {
        System.out.println(YOURS_NUMBERS_ARE);
        printSet(sixNumbersFromPlayer);
    }

    void printSet(Set<Integer> setToPrint) {
        setToPrint.forEach(a -> System.out.print(a + " "));
        System.out.println();
    }

    void showRandomWinnerNumbers(Set<Integer> randomNumbers) {
        System.out.println(THE_WINNER_NUMBERS_ARE);
        printSet(randomNumbers);
    }
}