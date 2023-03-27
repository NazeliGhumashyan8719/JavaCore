package homework.fileutil;


import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("please input homework path");
        String homeworkPath = scanner.nextLine();       // arajin@ ru taluc
        System.out.println("please input file name");
        String fileName = scanner.nextLine();
        fileSearch(homeworkPath, fileName);

        System.out.println("please input homework path");
  //      String homeworkPath = scanner.nextLine();
        System.out.println("please input keyword");          // erkrord metod run taluc // ic hanem nuyn@ arajini mej //em
        String keyword = scanner.nextLine();
        contentSearch(homeworkPath, keyword);


        System.out.println("please input file path");
        String filePath = scanner.nextLine();
        System.out.println("please input keyword");
    //    String keyword = scanner.nextLine();     // ays metod@ run taluc // hanem
        findLines(filePath,keyword);






    }

    private static void findLines(String filePath, String keyword) {
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch(String homework, String fileName) {
        File homeworkFile = new File(homework);
        if (!homeworkFile.isDirectory()) {
            System.out.println("wrong homework path");
            return;
        }
        File[] listFiles = homeworkFile.listFiles();
        boolean isFound = false;
        for (File file : listFiles) {
            if (file.isFile() && file.getName().contains(fileName)) {
                isFound = true;
                return;
            }
        }
        System.out.println(isFound);
    }

    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch(String homework, String keyword) {
        File homeworkFile = new File(homework);
        if (!homeworkFile.isDirectory()) {
            System.out.println("wrong homework path");
            return;
        }
        File[] listFiles = homeworkFile.listFiles();
        for (File file : listFiles) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                    String line = null;
                    while ((line = bufferedReader.readLine()) != null) {
                        if (line.contains(keyword)) {
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();

                }

            }

        }

        //այս մեթոդը պետք է սքաններով վերցնի երկու string.
        // 1 - txtPath txt ֆայլի փաթը
        // 2 - keyword - ինչ որ բառ
        // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
      //  static void findLines (String filePath, String keyword) {


//այս մեթոդը պետք է սքաններով վերցնի մեկ string.
// 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
// ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
       //     static void printSizeOfPackage () {


//այս մեթոդը պետք է սքաններով վերցնի երեք string.
// 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
// 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
// 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
// որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
      //          static void createFileWithContent () {

                }
            }

















