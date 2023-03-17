package games.lotto;

import java.util.Set;

class CalculatorResult {

    ResultReturner calculateResult(Set<Integer> sixNumbersFromPlayer, Set<Integer> randomNumbers) {
        return new ResultReturner(sixNumbersFromPlayer.containsAll(randomNumbers));
    }
}