import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Askisi4 {
    public static void main(String[] args) {
        String str;
        str=fibonacciWrite();
        read(str);



    }


    public static String fibonacciWrite() {
        String fullPath = null;
        try {
            Scanner sc = new Scanner(System.in); //System.in is a standard input stream
            String writePath;
            do {
                System.out.print("Writing path: ");
                writePath = sc.nextLine();
            } while (writePath.isEmpty());
            System.out.print("Enter txt name: ");
            String fileName = sc.nextLine();
            fullPath = writePath + "\\" + fileName + ".txt";
            System.out.print("The full path is: " + fullPath+ "\n");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fullPath));
            long temp1 = 0;
            long temp2 = 0;
            long temp3 = 0;
            for (int i = 0; i < 50; i++) {
                if (i == 0) {
                    bufferedWriter.write("F(" + i + ")=" + temp1);
                    bufferedWriter.newLine();
                } else if (i == 1) {
                    temp1++;
                    bufferedWriter.write("F(" + i + ")=" + temp1);
                    bufferedWriter.newLine();
                } else if (i == 2) {
                    temp2++;
                    bufferedWriter.write("F(" + i + ")=" + temp1);
                    bufferedWriter.newLine();
                } else {
                    temp3 = temp1 + temp2;
                    temp1 = temp2;
                    temp2 = temp3;
                    bufferedWriter.write("F(" + i + ")=" + temp2);
                    bufferedWriter.newLine();
                }

            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return fullPath;
    }
    static void read(String str) {
            try {
                Scanner scanner = new Scanner(new FileInputStream(str));
                String result = scanner.next();
                while (!result.equals(" ")) {
                    System.out.println(result);
                    result = scanner.next();
                }
                scanner.close();
            } catch (FileNotFoundException ex) {

            }catch (NoSuchElementException ex){

            }
        }


    }




