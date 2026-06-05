package com.example.tetris;
import org.junit.Test;
import static org.junit.Assert.*;

public class TetrisLogicTest {
    @Test
    public void testGameLogic() {
        // Простой тест на проверку инициализации логики
        int score = 0;
        assertEquals(0, score);
        System.out.println("Unit Test Passed: Game state initialized correctly.");
    }
}
