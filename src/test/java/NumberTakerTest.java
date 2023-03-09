import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class NumberTakerTest {

    @Test
    void shouldReturnSixNumbersFromScanner() {
        //given
        NumberTaker taker = new NumberTaker();
        String input = "1 2 3 4 5 6";
        Scanner scanner = mockScannerInput(input);
        //when
        Set<Integer> sixNumbersFromPlayer = taker.takeSixNumbersFromPlayer(scanner);
        //then
        assertThat(sixNumbersFromPlayer.size()).isEqualTo(6);
    }

    private Scanner mockScannerInput(String input) {
        InputStream inputStream = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        System.setIn(inputStream);
        return scanner;
    }
}