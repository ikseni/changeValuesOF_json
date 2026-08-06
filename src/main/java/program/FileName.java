package program;

import java.io.File;

public class FileName {
    public static File wholeFileName(String filePathScan){

        String separator = File.separator;
        return new File(filePathScan, "Risk of Rain 2_Data" + separator + "StreamingAssets" + separator + "Language");

    }
}
