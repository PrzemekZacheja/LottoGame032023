import lombok.Data;

import java.util.Scanner;
import java.util.Set;

@Data
public class LottoGame implements IGame {

    private final NumberTaker numberTaker;
    private final Scanner scanner;
    private final NumberMaker numberMaker;

    public LottoGame(NumberTaker numberTaker, Scanner scanner, NumberMaker numberMaker) {
        this.numberTaker = numberTaker;
        this.scanner = scanner;
        this.numberMaker = numberMaker;
    }

    @Override
    public void startGame() {
        Set<Integer> sixNumbersFromPlayer = numberTaker.takeSixNumbersFromPlayer(scanner);
        Set<Integer> randomNumbers = numberMaker.getRandomNumbers();

    }

}