package program;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к папке: ");
        String filePathScan = "";


        while(true){
            filePathScan = scanner.nextLine();
            File file = FileName.wholeFileName(filePathScan);
            System.out.println(String.valueOf(file));
            if (!file.exists()) {
                System.out.print("По такому пути не удалось найти папку, попробуйте снова: ");
            } else {
                String name = String.valueOf(file);
                System.out.println("Файл найден!!" + name);
                break;
            }
        }

    }

}
