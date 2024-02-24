package FilesExplanation;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryStreamSample {
    public static void main(String[] args) {
        String location = "C:\\Users\\Dell\\IdeaProjects\\myJavaProject";

        Path path = Path.of(location);
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
            directoryStream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
