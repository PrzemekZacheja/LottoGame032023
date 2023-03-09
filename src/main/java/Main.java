import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IGame lotek = prepareGame();
        lotek.startGame();
    }

    private static IGame prepareGame() {
        NumberTaker taker = new NumberTaker();
        Scanner scanner = new Scanner(System.in);
        return new LottoGame(taker, scanner);
    }
}