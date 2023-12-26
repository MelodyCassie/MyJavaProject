package DiaryApp;

import DiaryApp.exceptions.EmptyInputError;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    Diary melDiary;
    @BeforeEach
    void setMelDiary(){
        melDiary = new Diary("Mel", "melly888");

    }
    @Test
    public void testThatMelDiaryIsUnlocked(){
        assertTrue(melDiary.isLocked());
        melDiary.unlockDiary("melly888");
        assertFalse(melDiary.isLocked() );
    }
    @Test
    public void testThatMelDiaryCanBeLocked(){
        melDiary.unlockDiary("melly888");
        assertFalse(melDiary.isLocked());

        melDiary.lockDiary();
        assertTrue(melDiary.isLocked());
    }

    @Test
    public void testThatMelDiaryCanThrowEmptyInputError(){
        melDiary.unlockDiary("melly888");
        assertFalse(melDiary.isLocked());
        assertThrows(EmptyInputError.class,()-> melDiary.createEntry(" ", " "));
    }

    @Test
    public void testThatMelDiaryCanCreateEntry(){
      melDiary.unlockDiary("melly888");
      assertFalse(melDiary.isLocked());

      melDiary.createEntry("myDiaryTitle", "myDiaryBody");
      assertEquals(1, melDiary.getEntrySize());
      assertEquals(101, melDiary.generateEntryId());
    }
    @Test
    public void testThatMelDiaryCanCreateMoreThanOneEntry(){
        melDiary.unlockDiary("melly888");
        assertFalse(melDiary.isLocked());

        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        melDiary.createEntry("myDiaryTitle", "myDiaryBody");

        assertEquals(5,melDiary.getEntrySize());
        melDiary.lockDiary();

    }
    @Test
    public void testThatMelDiaryCanDeleteEntry(){
        melDiary.unlockDiary("melly888");
        assertFalse(melDiary.isLocked());

        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        assertEquals(1,melDiary.getEntrySize());
        assertEquals(101,melDiary.generateEntryId());

        melDiary.deleteEntry(101);
        assertEquals(0,melDiary.getEntrySize());

        melDiary.lockDiary();
        assertTrue(melDiary.isLocked());
    }
    @Test
    public void testThatMelDiaryCanDeleteMoreThanOneEntry(){
        melDiary.unlockDiary("melly888");
        assertFalse(melDiary.isLocked());

        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        assertEquals(3,melDiary.getEntrySize());


        melDiary.deleteEntry(101);
        melDiary.deleteEntry(103);
        assertEquals(1, melDiary.getEntrySize());


        melDiary.lockDiary();
        assertTrue(melDiary.isLocked());
    }
    @Test
    public void testThatMelDiaryThrowsExceptionIfNotFoundEntry(){
        melDiary.unlockDiary("melly888");
        assertFalse(melDiary.isLocked());

        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        assertEquals(1, melDiary.getEntrySize());
        assertEquals(101, melDiary.generateEntryId());

        melDiary.deleteEntry(101);
        assertThrows(RuntimeException.class,()-> melDiary.deleteEntry(101));

        melDiary.lockDiary();
        assertTrue(melDiary.isLocked());

    }
    @Test
    public void testThatMelDiaryCanFindEntryById(){
        melDiary.unlockDiary("melly888");
        assertFalse(melDiary.isLocked());

        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        melDiary.createEntry("myDiaryTitle", "myDiaryBody");

        Entry entryOne = melDiary.findEntryId(102);
        Entry entryTwo = melDiary.findEntryId(103);

        assertEquals(102, entryOne.getId());
        assertEquals(103, entryTwo.getId());

        melDiary.lockDiary();
        assertTrue(melDiary.isLocked());
    }

    @Test
    public void testThatMelDiaryThrowsExceptionIfNotFoundId(){
        melDiary.unlockDiary("melly888");
        assertFalse(melDiary.isLocked());

        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        melDiary.createEntry("myDiaryTitle", "myDiaryBody");

        assertThrows(RuntimeException.class, ()-> melDiary.findEntryId(100));

    }
    @Test
    public void testThatMelDiaryNotCreateEntryIfLocked(){
        melDiary.unlockDiary("melly888");
        assertFalse(melDiary.isLocked());


        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        melDiary.createEntry("myDiaryTitle", "myDiaryBody");

        melDiary.lockDiary();

        assertThrows(RuntimeException.class,()-> melDiary.createEntry("myDiaryTitle", "myDiaryBody"));

    }
    @Test
    public void testThatMelDiaryNotDeleteEntryIfLocked() {
        melDiary.unlockDiary("melly888");
        assertFalse(melDiary.isLocked());


        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        melDiary.createEntry("myDiaryTitle", "myDiaryBody");

        melDiary.lockDiary();

        assertThrows(RuntimeException.class, () -> melDiary.deleteEntry(102));

    }
    @Test
    public void testThatMelDiaryCanUpdateEntry(){
        melDiary.unlockDiary("melly888");
        assertFalse(melDiary.isLocked());

        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        melDiary.createEntry("myDiaryTitle", "myDiaryBody");
        melDiary.createEntry("myDiaryTitle", "myDiaryBody");

        assertEquals(5, melDiary.getEntrySize());

        melDiary.updateEntry(101, "myDiaryTitle", "myDiaryBody");
        assertEquals(5,melDiary.getEntrySize());

        melDiary.updateEntry(102, "myDiaryTitle", "myDiaryBody");
        assertEquals(5, melDiary.getEntrySize());

        melDiary.lockDiary();
        assertTrue(melDiary.isLocked());
    }
}