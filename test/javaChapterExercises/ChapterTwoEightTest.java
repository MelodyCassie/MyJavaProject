package javaChapterExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChapterTwoEightTest {

    @Test
    public void testProduct(){
        ChapterTwoEight chapter = new ChapterTwoEight();
        int actual = chapter.productor(2,3);
        assertEquals(6,actual);
    }



}