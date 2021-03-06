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

    @Test
    public void emptyBoardTest2(){
        Tic actual = new Tic();
        String[][] expected = {{" "," "}, {" ", " "}};
        assertTrue(Arrays.deepEquals(expected, actual.theBoard(2, 2)));
    }

    @Test
    public void emptyBoardTest3(){ 
        Tic actual = new Tic();
        String[][] expected = {{" ", " ", " "}, {" ", " ", " "}};
        assertTrue(Arrays.deepEquals(expected, actual.theBoard(2, 3)));
    }

    @Test
    public void emptyBoardTest4(){ 
        Tic actual = new Tic();
        String[][] expected = {{" "}, {" "}, {" "}};
        assertTrue(Arrays.deepEquals(expected, actual.theBoard(3, 1)));
    }

    @Test
    public void emptyBoardTest5(){
        Tic actual = new Tic();
        String[][] expected = {{" ", " "}, {" ", " "}, {" ", " "}};
        assertTrue(Arrays.deepEquals(expected, actual.theBoard(3, 2)));
    }
}