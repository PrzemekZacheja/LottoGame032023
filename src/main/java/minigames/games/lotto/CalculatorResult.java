package minigames.games.lotto;

import java.util.Set;

class CalculatorResult {

    static boolean calculateResult(Set<Integer> sixNumbersFromPlayer, Set<Integer> randomNumbers) {
        return sixNumbersFromPlayer.containsAll(randomNumbers);
    }
}