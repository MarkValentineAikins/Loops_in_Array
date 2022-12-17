import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

         //int [] Num = new int[2];
         //final int [] NumTst = new int[5];

         //alternative declaration of a constant array;'l;
        //final int bnb = 5;
        //int [] TnT = new int[bnb];

        //int [] joo = new int[6];
        //joo [0]= 3;
        //joo [1]= 4;
        //joo [5]= 14;


        //final int[] cons = new int[10];
        //cons [4]= 100;
        //cons [6]= 70;
        //cons [8]= 101;

        //System.out.println(joo[5]);
         /* Scanner sc = new Scanner(System.in);

         final int Student = 3;
         int [] score = new int[Student];

         System.out.println("Enter Score for thsese" + Student + "students");

         System.out.println("Enter Score for student 1: ");
         score[0] = sc.nextInt();

        System.out.println("Enter Score for student 2: ");
        score[1] = sc.nextInt();

        System.out.println("Enter Score for student 3: ");
        score[2] = sc.nextInt();

        System.out.println("These were the scores you entered for the " + "students");
        System.out.println("Student one's score is " + score[0]);
        System.out.println("Student two's score is " + score[1]);
        System.out.println("Student three's score is " + score[2]); */

        Scanner sc = new Scanner(System.in);
        int pupils = 4;
        int [] age = new int[pupils];

        int index;
        System.out.println("Enter the ages of these 4 students");

        /*System.out.println("Enter age for pupil 1: ");
        age[0] = sc.nextInt();

        System.out.println("Enter age for pupil 2: ");
        age[1] = sc.nextInt();

        System.out.println("Enter age for pupil 3: ");
        age[2] = sc.nextInt();

        System.out.println("Enter age for pupil 4: ");
        age[3] = sc.nextInt();*/

        for (index =0; index< pupils; index++){
            System.out.println("Enter   age for pupil "+(index+1) + ": ");
            age[index] = sc.nextInt();
        }


        System.out.println("These were the ages you entered for the " + "pupils");

        for (index=0; index<pupils;index++) {

            System.out.println("pupil "+(index+1) + " age is " + age[index]);
        }
        /*
        System.out.println("Pupil one's age is " + age[0]);
        System.out.println("Pupil two's age is " + age[1]);
        System.out.println("Pupil three's age is " + age[2]);
        System.out.println("Pupil four's age is " + age[3]);

         */



    }
}