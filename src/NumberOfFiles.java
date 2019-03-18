import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class NumberOfFiles {

    ArrayList <String> firstLatter = new ArrayList<>();

    int count=0;


    public  void firstLetterArray(File path){

        if (path.isDirectory()){
            File [] directoryFiles = path.listFiles();
            if (directoryFiles != null){
                for (File file:directoryFiles){
                    if (file.isFile()) {
                        String s = file.getName().toLowerCase().substring(0, 1);
                        if (!firstLatter.contains(s)) {        // проверяешь если в firstLatter такой буквы нет
                            firstLatter.add(s);                // добавляешь ее в firstLatter
                        }
                    }
                    if (file.isDirectory()){
                        firstLetterArray(file);
                    }
                }
            }
        }
    }

    public void result(File path){
        firstLetterArray(path);
        Collections.sort(firstLatter);
        for (int i = 0; i < firstLatter.size(); i++) {
            countFiles(path,i);
            System.out.println(firstLatter.get(i) + " - " +count + " шт.");
            count = 0;
        }
    }

    public  void countFiles(File path, int i){
            if (path.isDirectory()) {
                File[] directoryFiles = path.listFiles();
                if (directoryFiles != null) {
                    for (File file : directoryFiles) {
                        if (file.isFile()) {
                            String s = file.getName().toLowerCase().substring(0, 1);
                            if (firstLatter.get(i).contains(s)) {        // проверяешь если в firstLatter такая буква есть
                                count = count +1;
                            }
                        }
                        if (file.isDirectory()) {
                            countFiles(file, i);
                        }
                    }
                }
            }

    }
}
