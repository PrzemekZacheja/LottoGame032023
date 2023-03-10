import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberTaker {

    private final Set<Integer> setOfNumbers;

    public NumberTaker() {
        setOfNumbers = new HashSet<>();
    }

    public Set<Integer> takeSixNumbersFromPlayer(Scanner scanner) {
        while (setOfNumbers.size() < ConfigLottoGame.NUMBERS_IN_GAME) {
            System.out.printf(MessageProvider.INPUT_NEXT_NUMBER, ConfigLottoGame.MIN_NUMBER_ORIGIN,
                    ConfigLottoGame.MAX_BOUND_NUMBER_FROM_USER);

            int number = scanner.nextInt();
            if (number >= ConfigLottoGame.MIN_NUMBER_ORIGIN && number <= ConfigLottoGame.MAX_BOUND_NUMBER_FROM_USER) {
                setOfNumbers.add(number);
            } else {
                System.out.printf(MessageProvider.INPUT_OVER_THE_RANGE, ConfigLottoGame.MIN_NUMBER_ORIGIN,
                        ConfigLottoGame.MAX_BOUND_NUMBER_FROM_USER);
            }

        }
        scanner.close();
        return setOfNumbers;
    }
}