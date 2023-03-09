import java.util.Set;

public class CalculatorResult {

    public static boolean calculateResult(Set<Integer> sixNumbersFromPlayer, Set<Integer> randomNumbers) {
        return sixNumbersFromPlayer.containsAll(randomNumbers);
    }
}