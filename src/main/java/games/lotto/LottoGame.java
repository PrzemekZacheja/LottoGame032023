package games.lotto;

import games.Game;
import lombok.AllArgsConstructor;

import java.util.Scanner;
import java.util.Set;

@AllArgsConstructor
class LottoGame implements Game {

    private final NumberTaker numberTaker;
    private final Scanner scanner;
    private final NumberMaker numberMaker;
    private final MessageProvider messageProvider;
    private final CalculatorResult calculatorResult;

    @Override
    public ResultReturner startGame() {
        Set<Integer> takeNumbersFromPlayer = numberTaker.takeNumbersFromPlayer(scanner);
        messageProvider.showInputNumbersFromPlayer(takeNumbersFromPlayer);
        Set<Integer> randomNumbers = numberMaker.getRandomNumbers();
        messageProvider.showRandomWinnerNumbers(randomNumbers);
        ResultReturner resultReturner = calculatorResult.calculateResult(takeNumbersFromPlayer, randomNumbers);
        messageProvider.printResult(resultReturner.result());
        return resultReturner;
    }

}