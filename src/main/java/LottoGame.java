import java.util.Scanner;

public class LottoGame implements IGame {

    private final NumberTaker numberTaker;
    private final Scanner scanner;

    public LottoGame(NumberTaker numberTaker, Scanner scanner) {
        this.numberTaker = numberTaker;
        this.scanner = scanner;
    }

    @Override
    public void startGame() {
        numberTaker.takeSixNumbersFromPlayer(scanner);
        NumberMaker.getRandomNumbers();
    }

}