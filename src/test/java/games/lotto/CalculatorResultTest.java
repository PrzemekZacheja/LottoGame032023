package games.lotto;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CalculatorResultTest {

    CalculatorResult calculatorResult = new CalculatorResult();

    @Test
    void should_return_true_when_sets_are_the_same() {
        //given
        Set<Integer> first = Set.of(1, 2, 3, 4, 5, 6);
        Set<Integer> second = Set.of(1, 2, 3, 4, 5, 6);
        //when
        ResultReturner result = calculatorResult.calculateResult(first, second);
        //then
        assertThat(result.result()).isTrue();
    }

    @Test
    void should_return_false_when_sets_are_not_the_same() {
        //given
        Set<Integer> first = Set.of(1, 2, 3, 4, 5, 6);
        Set<Integer> second = Set.of(1, 2, 3, 4, 5, 7);
        //when
        ResultReturner result = calculatorResult.calculateResult(first, second);
        //then
        assertThat(result.result()).isFalse();
    }
}