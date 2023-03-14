package minigames.games.lotto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class NumberTaker {

    private final Set<Integer> setOfNumbers;

    public NumberTaker() {
        setOfNumbers = new HashSet<>();
    }

    Set<Integer> takeNumbersFromPlayer(Scanner scanner) {
        System.out.println(MessageProvider.START_GAME_INFO);
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

    private boolean isInRange(int number) {
        return number >= ConfigLottoGame.MIN_NUMBER_ORIGIN && number <= ConfigLottoGame.MAX_BOUND_NUMBER_FROM_USER;
    }

}