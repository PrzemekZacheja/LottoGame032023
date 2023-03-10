import minigames.games.lotto.logic.NumberMaker;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class NumberMakerTest {

    @Test
    void should_return_6_numbers_in_set_from_random_generator() {
        //given
        NumberMaker numbers = new NumberMaker();
        //when
        Set<Integer> randomNumbers = numbers.getRandomNumbers();
        //then
        assertThat(randomNumbers.size()).isEqualTo(6);
    }
}