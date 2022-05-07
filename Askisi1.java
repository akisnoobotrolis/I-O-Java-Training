import java.util.Scanner;

public class Askisi1 {

    public static void main(String[] args){
        readInput();


    }

    static void readInput() {
        float sum;
        int num;
        float av;
        String name ;
        String subject;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student details: ");
        System.out.print("Name: ");
        name = scanner.nextLine();
        while (!name.equals("000000")) {
            sum = 0;
            num = 0;
            System.out.print("Subject: ");
            subject=scanner.next();
            while (!subject.equals("end")) {
                System.out.print("Grade: ");
                float grade = scanner.nextFloat();
                sum = sum + grade;
                num++;
                System.out.print("Subject: ");
                subject=scanner.next();
            }
            if (num>0)
            av = sum / num;
            else
                av=0;

            System.out.println("average of student " + name + " is " + av);
            System.out.print("Name: ");
            scanner.nextLine();
            name = scanner.nextLine();
        }
        scanner.close();
        System.out.println("Goodbye");


    }
}


