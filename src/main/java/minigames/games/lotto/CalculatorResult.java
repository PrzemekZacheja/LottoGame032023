package minigames.games.lotto;

import java.util.Set;

class CalculatorResult {

    public static boolean calculateResult(Set<Integer> sixNumbersFromPlayer, Set<Integer> randomNumbers) {
        return sixNumbersFromPlayer.containsAll(randomNumbers);
    }
}