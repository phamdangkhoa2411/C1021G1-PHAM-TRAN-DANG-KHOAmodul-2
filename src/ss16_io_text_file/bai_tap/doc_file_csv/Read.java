package ss16_io_text_file.bai_tap.doc_file_csv;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Read {
    public static void main(String[] args) {

        File file=new File("E:\\Codegym\\modul 2\\src\\ss16_io_text_file\\bai_tap\\doc_file_csv\\Country");
        try {
            List<String> rd= Files.readAllLines(file.toPath());
            for( String line: rd){
                System.out.println(line);
            }
        } catch (IOException exception) {
            System.out.println("nhập sai");
        }
    }
}
