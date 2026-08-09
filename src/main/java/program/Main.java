package program;

import java.awt.*;
import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к папке: ");

        while(true){
            String filePathScan = scanner.nextLine();
            File file = FilesReader.wholeFileName(filePathScan);

            if (!file.exists()) {
                System.out.print("По пути: " + file + " не удалось найти папку, попробуйте снова: ");
            } else {
                List<File> listOfJsonFiles = FilesReader.dirsReader(file);
                if(!listOfJsonFiles.isEmpty()){
                    for(File list: listOfJsonFiles){
                        System.out.println(list);
                    }
                }
                break;
            }
        }


    }

}
