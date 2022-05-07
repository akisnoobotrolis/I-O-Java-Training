import java.io.*;
import java.util.Scanner;

public class Askisi3 {
    public static void main(String[] args){
        readCharsFromFile();



    }

    static void readCharsFromFile() {
        try {
            String readPath;
            int lowerA=0;
            int upperA=0;
            int lowerG=0;
            int upperG=0;
            int upperOmega=0;
            int lowerOmega=0;
            int one=0;
            int three=0;
            int five=0;
            int seven=0;
            int nine=0;
            Scanner sc = new Scanner(System.in); //System.in is a standard input stream
            do {
                System.out.print("Enter reading path: ");
                readPath = sc.nextLine();
            }while (readPath.isEmpty());
            FileReader reader = new FileReader(readPath);
            int c;
            while (reader.ready()) {
                c = reader.read(); //character-oriented reading
                if (c=='α')
                    lowerA++;
                else if (c=='Α')
                    upperA++;
                else if (c=='γ')
                    lowerG++;
                else if (c=='Γ')
                    upperG++;
                else if (c=='ω')
                    lowerOmega++;
                else if (c=='Ω')
                    upperOmega++;
                else if (c=='1')
                    one++;
                else if (c=='3')
                    three++;
                else if (c=='5')
                    five++;
                else if (c=='7')
                    seven++;
                else if (c=='9')
                    nine++;
            }
            reader.close();
            System.out.println("Number of: \n");
            System.out.println("α: "+lowerA);
            System.out.println("Α: "+upperA);
            System.out.println("γ: "+lowerG);
            System.out.println("Γ: "+upperG);
            System.out.println("ω: "+lowerOmega);
            System.out.println("Ω: "+upperOmega);
            System.out.println("1: "+one);
            System.out.println("3: "+three);
            System.out.println("5: "+five);
            System.out.println("7: "+seven);
            System.out.println("9: "+nine);
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}




