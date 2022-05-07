import java.io.*;
import java.util.Scanner;

public class Askisi2 {
    public static void main(String[] args) {
        readAndWrite();


    }


    static void readAndWrite() {
        try {
            String readPath, writePath;
            Scanner sc = new Scanner(System.in); //System.in is a standard input stream
            do {
                System.out.print("Enter reading path: ");
                readPath = sc.nextLine();
            }while (readPath.isEmpty());
            System.out.print("You have entered: " + readPath + "\n");
            do {
                System.out.print("Enter writing path: ");
                writePath = sc.nextLine();
            }while (writePath.isEmpty());

            System.out.print("You have entered: " + writePath + "\n");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(readPath));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writePath));
            String line;
            int count = 0;

            while (bufferedReader.ready()) {
                line = bufferedReader.readLine();//line-orie\nted reading
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                count++;
            }
            bufferedReader.close();
            bufferedWriter.close();
            System.out.println("Read lines from data.txt completed");
            System.out.println("Total lines: " + count);

            //The order of catching the exception is that if the first catch matches
            //the exception, it executes, else if it doesn't, the next one is tried
            //and on and on until one is matched or none are.
            //Thus, when catching exceptions you want to always catch the
            //most specific first and the most generic last.
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}