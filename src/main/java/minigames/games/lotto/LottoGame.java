package minigames.games.lotto;

import lombok.Data;
import minigames.games.IGame;
import minigames.games.lotto.input.NumberTaker;
import minigames.games.lotto.logic.CalculatorResult;
import minigames.games.lotto.logic.NumberMaker;
import minigames.games.lotto.messageprovider.MessageProvider;

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
        Set<Integer> takeNumbersFromPlayer = numberTaker.takeNumbersFromPlayer(scanner);
        messageProvider.showInputNumbersFromPlayer(takeNumbersFromPlayer);
        Set<Integer> randomNumbers = numberMaker.getRandomNumbers();
        messageProvider.showRandomWinnerNumbers(randomNumbers);
        boolean result = CalculatorResult.calculateResult(takeNumbersFromPlayer, randomNumbers);
        messageProvider.printResult(result);

    }

}