package FilesExplanation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePractice {

    public static void createFile(String location, String filename) {
        Path path = Path.of(location,filename);
//                ??or .of
        try {
            Files.createFile(path);
            //10Exception,exceptions to add  file not found exception, security exception

        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }


  }
  public static void createDirectory(String location){
        Path path = Path.of(location);
        try {
            Files.createDirectory(path);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

  }

    public static void deleteDirectory(String location) {
        Path path = Path.of(location);
        try{
            Files.deleteIfExists(path);
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }


    }

    public static void deleteFileInDirectory(String location, String filename) {
        Path path = Path.of(location,filename);
        try{
            Files.deleteIfExists(path);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


    }


}
