package FilesExplanation;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FilePracticeTest {
    @Test
    public void testCreateFile(){
        String location = "C:\\Users\\Dell\\IdeaProjects\\myJavaProject\\files";
        String filename = "sample.txt";
        FilePractice.createFile(location, filename);
        Path path = Paths.get(location,filename);
        System.out.println(path);

        assertTrue(Files.exists(path));
//        failing because i deleted the file already in my test
    }
    @Test
    public void testDeleteDirectory(){
        String location  ="C:\\Users\\Dell\\IdeaProjects\\myJavaProject\\files";
        FilePractice.deleteDirectory(location);
        Path path = Paths.get(location);
        assertFalse(Files.exists(path));
    }


    @Test
    public  void testDeleteFileInDirectory(){
        String location = "C:\\Users\\Dell\\IdeaProjects\\myJavaProject\\files";
        String filename = "sample.txt";
        FilePractice.deleteFileInDirectory(location, filename);
        Path path = Paths.get(location,filename);
        assertFalse(Files.exists(path));


    }



}