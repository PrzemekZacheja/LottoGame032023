package games.lotto;

import games.IGame;
import lombok.AllArgsConstructor;

import java.util.Scanner;
import java.util.Set;

@AllArgsConstructor
class LottoGame implements IGame {

    private final NumberTaker numberTaker;
    private final Scanner scanner;
    private final NumberMaker numberMaker;
    private final MessageProvider messageProvider;

    @Override
    public void startGame() {
        Set<Integer> takeNumbersFromPlayer = numberTaker.takeNumbersFromPlayer(scanner);
        messageProvider.showInputNumbersFromPlayer(takeNumbersFromPlayer);
        Set<Integer> randomNumbers = numberMaker.getRandomNumbers();
        messageProvider.showRandomWinnerNumbers(randomNumbers);
        boolean result = CalculatorResult.calculateResult(takeNumbersFromPlayer, randomNumbers);
        messageProvider.printResult(result);

    }

}