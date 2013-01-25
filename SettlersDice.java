import java.util.*;

public class SettlersDice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();

        int die2 = 0, die3 = 0, die4 = 0, die5 = 0, die6 = 0;
        int die7 = 0, die8 = 0, die9 = 0, die10 = 0, die11 = 0, die12 = 0;
        int i = 0;
        int barbarianCount = 0, barbarianTotal = 0;
        int greenCount = 0, yellowCount = 0, blueCount = 0;

        while(i != -1){

            if (i == 0)
                System.out.println("Instructions: " +
                        "\n\t0: Instructions " +
                        "\n\t1: Next Roll " +
                        "\n\t2: View Current Die Stats" +
                        "\n\t-1: End Game");

            System.out.println("Next roll?");
            i = input.nextInt();

            if (i == 1){

                int dieWhite = generator.nextInt(6) + 1;
                int dieRed = generator.nextInt(6) + 1;
                int dieSum = dieWhite + dieRed;

                int eventDie = generator.nextInt(6) + 1;

                if (dieSum == 2)
                    die2++;
                else if (dieSum == 3)
                    die3++;
                else if (dieSum == 4)
                    die4++;
                else if(dieSum == 5)
                    die5++;
                else if (dieSum == 6)
                    die6++;
                else if (dieSum == 7)
                    die7++;
                else if (dieSum == 8)
                    die8++;
                else if (dieSum == 9)
                    die9++;
                else if (dieSum == 10)
                    die10++;
                else if (dieSum == 11)
                    die11++;
                else if (dieSum == 12)
                    die12++;
                System.out.println("Roll = " + dieSum);
                System.out.println("Red Die = " + dieRed);

                if (eventDie <= 3){
                    barbarianTotal++;
                    barbarianCount++;
                    if (barbarianCount < 7)
                        System.out.println("Barbarian advances to " + barbarianCount + "/7");
                    else {
                        System.out.println("BARBARIAN ATTACK!");
                        barbarianCount = 0;
                    }
                }
                else if (eventDie == 4){
                    greenCount++;
                    System.out.println("Green Metrop");
                }
                else if (eventDie == 5){
                    yellowCount++;
                    System.out.println("Yellow Metrop");
                }
                else if (eventDie == 6){
                    blueCount++;
                    System.out.println("Blue Metrop");
                }
            }
            else if (i == 2) {
                System.out.print("2: " + die2 + " |");
                System.out.print("3: " + die3 + " |");
                System.out.print("4: " + die4 + " |");
                System.out.print("5: " + die5 + " |");
                System.out.print("6: " + die6 + " |");
                System.out.print("7: " + die7 + " |");
                System.out.print("8: " + die8 + " |");
                System.out.print("9: " + die9 + " |");
                System.out.print("10: " + die10 + " |");
                System.out.print("11: " + die11 + " |");
                System.out.println("12: " + die12 + " ");
                System.out.println("Yellow Progress Cards: " + yellowCount);
                System.out.println("Green Progress Cards: " + greenCount);
                System.out.println("Blue Progress Cards: " + blueCount);
                System.out.println("Barbarians Rolled: " + barbarianTotal);
            }
        }
        System.out.print("2: " + die2 + " |");
        System.out.print("3: " + die3 + " |");
        System.out.print("4: " + die4 + " |");
        System.out.print("5: " + die5 + " |");
        System.out.print("6: " + die6 + " |");
        System.out.print("7: " + die7 + " |");
        System.out.print("8: " + die8 + " |");
        System.out.print("9: " + die9 + " |");
        System.out.print("10: " + die10 + " |");
        System.out.print("11: " + die11 + " |");
        System.out.println("12: " + die12 + " ");
        System.out.println("Yellow Progress Cards: " + yellowCount);
        System.out.println("Green Progress Cards: " + greenCount);
        System.out.println("Blue Progress Cards: " + blueCount);
        System.out.println("Barbarians Rolled: " + barbarianTotal);
    }
}