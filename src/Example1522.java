import java.util.Scanner;
public class Example1522 {
    public static void main(String[] argv) {
        int examMark;


        System.out.println("Enter the exam mark:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        examMark = inputValue.nextInt();

        if (examMark < 3) {
            System.out.println("Muy Deficiente.");
        } else {
            if (examMark < 5) {
                System.out.println("Insuficiente.");
            } else {
                if (examMark < 6) {
                    System.out.println("Suficiente.");
                } else {
                    if (examMark < 7) {
                        System.out.println("Bien.");
                    } else {
                        if (examMark < 9) {
                            System.out.println("Notable.");

                        } else {
                            if (examMark <= 10) {
                                System.out.println("Sobresaliente.");

                            }
                            else{
                                System.out.println("Error11" +
                                        ".");

                            }
                        }
                    }
                }
            }
        }
    }


}
