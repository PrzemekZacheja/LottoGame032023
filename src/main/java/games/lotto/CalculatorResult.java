package games.lotto;

import java.util.Set;

class CalculatorResult {

    boolean calculateResult(Set<Integer> sixNumbersFromPlayer, Set<Integer> randomNumbers) {
        return sixNumbersFromPlayer.containsAll(randomNumbers);
    }
}