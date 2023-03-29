import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
    calculatorWork();
    }

    public static int enterNumber(){
       Scanner scanner = new Scanner(System.in);
       int number = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("Enter number");
            scanner.next();
        }
       number = scanner.nextInt();
        return number;
      }

      public static void calculatorWork(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  number");
        int number = enterNumber();
        char operand = ' ';
        while (operand != 's'){
            System.out.println("Enter operand");
            operand = scanner.next().charAt(0);
            switch (operand){
                case '+':
                    System.out.println("Enter number");
                    number = number + enterNumber();
                    System.out.println(number);
                    break;
                case '-':
                    System.out.println("Enter number");
                    number = number - enterNumber();
                    System.out.println(number);
                    break;
                case '*':
                    System.out.println("Enter number");
                    number = number * enterNumber();
                    System.out.println(number);
                    break;
                case '/':
                    System.out.println("Enter number");
                    number = number / enterNumber();
                    System.out.println(number);
                    break;
                case 'c':
                case 'C':
                    System.out.println("You reset program");
                    System.out.println("Enter number");
                    number = enterNumber();
                    break;
            }
            }
        System.out.println("You canceled the process");
        return;
        }

      }




