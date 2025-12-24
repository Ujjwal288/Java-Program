import java.io.File;

public class fileInformation04 {
    public static void main(String[] args) {
        File file = new File ("sample.txt");
        if(file.exists()) {
            System.out.println("File exists ");
            System.out.println("file name : " + file.getName());
            System.out.println("File location :" + file.getAbsolutePath());
            System.out.println("File length :" + file.length());
            System.out.println("File Writeable :" + file.canWrite());
            System.out.println("File readable :" + file.canRead());
            if (file.isFile()) {
                System.out.println("It is a file ");
            }
            else {
                System.out.println("It is a directory");
            }
        }
        else {
            System.out.println("File not exists :");
        }
    }
}
