import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Укажите путь к файлу или к директории");
        String path = new Scanner(System.in).nextLine();//Запрос путь в консоли
        File file = new File(path);
        int numOfReq = 0;
        boolean fileExists = file.exists();
        boolean isDirectory = file.isDirectory();
        String a = "Stop";
        while (path!= a) {
            if (fileExists == false) {
                System.out.println("Файл не существует или указанный путь является путём к папке");
                path = new Scanner(System.in).nextLine();
                file = new File(path);
                fileExists = file.exists();
                isDirectory = file.isDirectory();
                continue;
            }
            if (isDirectory == false) {
                System.out.println("Путь указан верно");
                numOfReq = numOfReq + 1;
                System.out.println("Это файл номер " + numOfReq);
                path = new Scanner(System.in).nextLine();
                file = new File(path);
                fileExists = file.exists();
                isDirectory = file.isDirectory();
                continue;
            }
            if (isDirectory == true) {
                System.out.println("Файл не существует или указанный путь является путём к папке");
                path = new Scanner(System.in).nextLine();
                file = new File(path);
                fileExists = file.exists();
                isDirectory = file.isDirectory();
            }
        }
    }
}