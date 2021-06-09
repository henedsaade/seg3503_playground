import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class TicTest {

    @Test
    public void emptyBoardTest(){
        Tic obj = new Tic();
        assertEquals(" ", obj.emptyBoard());
    }
}