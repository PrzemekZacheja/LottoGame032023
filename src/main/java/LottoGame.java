import lombok.Data;

import java.util.Scanner;
import java.util.Set;

@Data
public class LottoGame implements IGame {

    private final NumberTaker numberTaker;
    private final Scanner scanner;
    private final NumberMaker numberMaker;
    private final MessageProvider messageProvider;

    @Override
    public void startGame() {
        Set<Integer> sixNumbersFromPlayer = numberTaker.takeSixNumbersFromPlayer(scanner);
        messageProvider.showInputNumbersFromPlayer(sixNumbersFromPlayer);
        Set<Integer> randomNumbers = numberMaker.getRandomNumbers();
        messageProvider.showRandomWinnerNumbers(randomNumbers);
        boolean result = CalculatorResult.calculateResult(sixNumbersFromPlayer, randomNumbers);
        MessageProvider.printResult(result);

    }

}