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
            int number = scanner.nextInt();
            setOfNumbers.add(number);
        }
        scanner.close();
        return setOfNumbers;
    }
}