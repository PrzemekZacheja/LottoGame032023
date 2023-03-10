package minigames.lotto.input;

import minigames.lotto.config.ConfigLottoGame;
import minigames.lotto.messageprovider.MessageProvider;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberTaker {

    private final Set<Integer> setOfNumbers;

    public NumberTaker() {
        setOfNumbers = new HashSet<>();
    }

    private static boolean isInRange(int number) {
        return number >= ConfigLottoGame.MIN_NUMBER_ORIGIN && number <= ConfigLottoGame.MAX_BOUND_NUMBER_FROM_USER;
    }

    public Set<Integer> takeSixNumbersFromPlayer(Scanner scanner) {
        while (setOfNumbers.size() < ConfigLottoGame.NUMBERS_IN_GAME) {
            System.out.printf(MessageProvider.INPUT_NEXT_NUMBER, ConfigLottoGame.MIN_NUMBER_ORIGIN,
                    ConfigLottoGame.MAX_BOUND_NUMBER_FROM_USER);

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (isInRange(number)) {
                    setOfNumbers.add(number);
                } else {
                    System.out.printf(MessageProvider.INPUT_OVER_THE_RANGE, ConfigLottoGame.MIN_NUMBER_ORIGIN,
                            ConfigLottoGame.MAX_BOUND_NUMBER_FROM_USER);
                }
            } else {
                System.out.println(MessageProvider.INPUT_NOT_NUMBER);
                scanner.next();
            }

        }
        scanner.close();
        return setOfNumbers;
    }

}