package javaChapterExercisesTest;

import javaChapterExercises.ChapterTwoTwentyFiveT;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChapterTwoTwentyFiveTTest {

    @Test
    public void testThatInputDivisibleBy3Equals0(){
        ChapterTwoTwentyFiveT example = new ChapterTwoTwentyFiveT();
        int actual = example.divisible(9);
        assertEquals(9, actual);
    }

}