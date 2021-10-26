import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest1 {

    @Test
    void add() {
        int result = Addition.add(3,3);
        int correct=6;
        assertEquals(correct,result);
    }
}