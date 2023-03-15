package games.lotto;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;


class LottoGameTest {

    @Test
    void shouldReturnSixNumbersFromScanner() {
        //given
        NumberTaker taker = new NumberTaker();
        String input = "1 2 3 4 5 6";
        Scanner scanner = mockScannerInput(input);
        //when
        Set<Integer> sixNumbersFromPlayer = taker.takeNumbersFromPlayer(scanner);
        //then
        assertThat(sixNumbersFromPlayer.size()).isEqualTo(6);
    }

    @Test
    void should_return_correct_Set_when_some_numbers_are_not_in_range() {
        //given
        NumberTaker taker = new NumberTaker();
        String input = "1 100 134 2 3 4 5 6";
        Scanner scanner = mockScannerInput(input);
        Set<Integer> correct = Set.of(1, 2, 3, 4, 5, 6);
        //when
        Set<Integer> sixNumbersFromPlayer = taker.takeNumbersFromPlayer(scanner);
        //then
        assertThat(sixNumbersFromPlayer).isEqualTo(correct);
    }

    @Test
    void should_return_correct_Set_when_not_numbers_are_input() {
        //given
        NumberTaker taker = new NumberTaker();
        String input = "1 2 asd 3 4 5 6";
        Scanner scanner = mockScannerInput(input);
        Set<Integer> correct = Set.of(1, 2, 3, 4, 5, 6);
        //when
        Set<Integer> sixNumbersFromPlayer = taker.takeNumbersFromPlayer(scanner);
        //then
        assertThat(sixNumbersFromPlayer).isEqualTo(correct);
    }

    @Test
    void should_return_true_for_winner_numbers() {
        //given
        NumberTaker numberTaker = new NumberTaker();
        String inputNumbers = "1 2 3 4 5 6";
        Scanner scanner = mockScannerInput(inputNumbers);
        NumberMaker numberMaker = Mockito.mock(NumberMaker.class);
        MessageProvider messageProvider = new MessageProvider();
        CalculatorResult calculatorResult = new CalculatorResult();

        LottoGame lottoGame = new LottoGame(numberTaker, scanner, numberMaker, messageProvider, calculatorResult);

        //when
        when(numberMaker.getRandomNumbers()).thenReturn(Set.of(1, 2, 3, 4, 5, 6));
        //then
        assertThat(lottoGame.startGame()).isTrue();
    }


    private Scanner mockScannerInput(String input) {
        InputStream inputStream = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        System.setIn(inputStream);
        return scanner;
    }
}