import java.io.File;

public class fileDelete03 {
    public static void main(String[] args) {
        File file = new File("samle.txt");
        if(file.delete()) {
            System.out.println("File deleted successfully");
        }
        else {
            System.out.println("Failed to delete file ");
        }
    }
}
