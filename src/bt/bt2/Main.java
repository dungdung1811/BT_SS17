package bt.bt2;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("nhập đường dẫn cho tệp nguồn: ");
        String sourcePath = sc.nextLine();
        System.out.print("nhập đường dẫn cho tệp đích: ");
        String destinationPath = sc.nextLine();
        try {
            Files.copy(Paths.get(sourcePath), Paths.get(destinationPath));
        } catch (NoSuchFileException e) {
            System.out.println("không thể sao chép,tệp nguồn không đúng, nhập lại");
            main(args);
        } catch (FileAlreadyExistsException e) {
            System.out.println("Không thể sao chép tệp đích, hãy nhập lại");
            main(args);
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
