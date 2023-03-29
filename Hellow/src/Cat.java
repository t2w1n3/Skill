public class Cat {
    public static void main(String[] args) {
            char ch1 = 'h';
            char ch2 = 'i';
            char ch3 = 'b';

            System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
            int variable = 7;
            variable = variable > 10 ? variable - 10 : variable + 10;
            System.out.println(variable);
            trafficLightCalculation("зеленый");

        int i = 45;
        while (i< 350){
        i++;
    }
        System.out.println("Value i = " + i);
        }

        public static String decode(char ch) {
        String result = " ";
        switch (ch){
                case 'h':
                    result = "Hello!";
                    break;
            case 'i':
            case 'm':
            case 'k':
                result = "I can decode";
                break;
            case 'b':
                result = "Bye!";
                break;
            default:
                result = "I don't know these symbols :(";
            }
            return result;
        }
        public static void trafficLightCalculation(String color){
         switch (color){
             case "красный":
                 System.out.println("Остановитесь");
                 break;
             case "зеленый":
                 System.out.println("Можно ехать");
                 break;
             case "желтый":
                 System.out.println("Подожите");
                 break;
         }
        }
    }



