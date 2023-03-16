package homework.fileUtil;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        fileSearch();
        contentSearch();
        findLines();
        printSizeOfPackage();
        createFileWithContent();


    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("enter file address");
        String path = scanner.nextLine();
        System.out.println("enter file name");
        String fileName = scanner.nextLine();
        try {
            File file = new File( path);
            File [] files = file.listFiles();
            for (File file1 : files) {
                if (file1.getName().equals(fileName)){
                    System.out.println(true);
                }else {
                    System.out.println(false);
                }
            }
        }catch (NullPointerException e){
            System.out.println("wrong address entered");
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("enter file address");
        String path = scanner.nextLine();
        System.out.println("enter file name");
        String keyword = scanner.nextLine();
        try {
            File file = new File( path);
            File [] files = file.listFiles();
            for (File file1 : files) {
                if (file1.getName().endsWith(".txt")&& file1.getName().contains(keyword)){
                    System.out.println(file1.getName());

                }
            }
        }catch (NullPointerException e){
            System.out.println("wrong address entered");
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {

        System.out.println("enter file address");
        String txtpath = scanner.nextLine();
        try {
            System.out.println("enter file name");
            String keyword = scanner.nextLine();
            File file = new File(txtpath);
            File [] files = file.listFiles();
            for (File file1 : files) {
                if (file1.getName().contains(keyword)){
                    System.out.println(file1);
               }
            }
        }catch (Exception e){
            System.out.println("wrong address entered");
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("enter file address");
        String path = scanner.nextLine();
        File folder = new File(path);
        int size = getFolderSize(folder);
        System.out.println("summing file sizes" + size);

    }

    private static int getFolderSize(File file) {
        int size = 0;
        if (file.isDirectory()){
            File [] files = file.listFiles();
            for (File file1 : files)
                if (file.isFile()) {
                    size += file.length();
                }else {
                size += getFolderSize(file1);
                }
        }else {
            size += file.length();
        }
        return size;
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {
        System.out.println("enter file address");
        String path = scanner.nextLine();
        System.out.println("enter file name");
        String fileName = scanner.nextLine();
        System.out.println("enter content");
        String content = scanner.nextLine();
        path +=fileName;
        File file = new File(path);
        if (!file.exists()){
            try {
                file.createNewFile();
            }catch (IOException e){
                System.out.println("unable to create file");
            }
        }
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(path))){
            out.writeUTF(content);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
