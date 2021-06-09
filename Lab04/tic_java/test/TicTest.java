import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class TicTest {


    @Test
    public void emptyBoardTest1(){
        Tic actual = new Tic();
        String[][] expected = {{" "}, {" "}};
        assertTrue(Arrays.deepEquals(expected, actual.theBoard(2, 1)));
    }
}