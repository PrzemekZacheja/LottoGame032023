package minigames.games.lotto;

import java.security.SecureRandom;
import java.util.Set;
import java.util.stream.Collectors;


class NumberMaker {

    Set<Integer> getRandomNumbers() {
        SecureRandom random = new SecureRandom();
        return random.ints(ConfigLottoGame.NUMBERS_IN_GAME, ConfigLottoGame.MIN_NUMBER_ORIGIN, ConfigLottoGame.MAX_NUMBERS_BOUND).boxed().collect(Collectors.toSet());
    }

}