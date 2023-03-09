import java.util.Set;

public class MessageProvider {

    public static final String YOURS_NUMBERS_ARE = "Yours numbers are: ->";
    public static final String THE_WINNER_NUMBERS_ARE = "The WINNER numbers are: ";

    public MessageProvider() {
    }

    void showInputNumbersFromPlayer(Set<Integer> sixNumbersFromPlayer) {
        System.out.println(YOURS_NUMBERS_ARE);
        System.out.println(sixNumbersFromPlayer.toArray().toString());
    }

    public void showRandomWinnerNumbers(Set<Integer> randomNumbers) {
        System.out.println(THE_WINNER_NUMBERS_ARE);
        System.out.println(randomNumbers.toArray().toString());
    }
}