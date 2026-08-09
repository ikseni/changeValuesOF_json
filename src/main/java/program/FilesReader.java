package program;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilesReader {
    public static File wholeFileName(String filePathScan){

        String separator = File.separator;
        return new File(filePathScan, "Risk of Rain 2" + separator + "Risk of Rain 2_Data" + separator + "StreamingAssets" + separator + "Language");
    }


    public static List<File> dirsReader(File file){
        List<File> files = new ArrayList<>();

        File[] folders = file.listFiles(File::isDirectory);
        if(folders == null || folders.length == 0){
            System.out.println("Не найдено ни одной папки в папке Language");
            return files;
        }

        for(File folder:folders){
            if(folder.getName().equals("en")){
                 File[] filesEn = folder.listFiles((File dir, String name) -> (name.equals("Items.json") || (name.equals("Equipment.json"))));
                 if(filesEn != null){
                     files.addAll(Arrays.asList(filesEn));
                 }
            }
            File[] filesOther = folder.listFiles((File dir, String name) -> (name.startsWith("output-") && name.endsWith(".json")));
            if(filesOther != null){
                files.addAll(Arrays.asList(filesOther));
            }
        }
        return files;
    }
}
