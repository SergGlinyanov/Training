import java.io.File;

public class Test {
    public static void main(String[] args) {
        File myFolder = new File("C:\\Games\\World_of_Tanks_RU");
        NumberOfFiles numberOfFiles = new NumberOfFiles();
        numberOfFiles.result(myFolder);
    }
}
