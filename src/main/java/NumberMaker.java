import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class NumberMaker {

    static Set<Integer> randomNumbers = new HashSet<>();

    public static void getRandomNumbers() {
        Random random = new Random();
        while (randomNumbers.size() < ConfigLottoGame.NUMBERS_IN_GAME) {
            int randomNumber;
        }
    }
}