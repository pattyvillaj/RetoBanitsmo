package util;

import java.io.File;

public class ProcessFiles {

    public static void checkDeleteDownloaded(String folder, String fileName){

        File downloadsDirectory= new File(folder);

        for (File file : downloadsDirectory.listFiles()){
            if (file.getName().contains(fileName)){
                file.delete();
            }
        }
    }

}
