package Menu;

import java.util.Scanner;

import GymBehavior.Arcane;
import GymBehavior.BladeArt;
import GymBehavior.Combat;
import GymBehavior.Gun;

public class TrainingMenu {

    static Scanner scanner = new Scanner(System.in);
    boolean continueSparring = true;
    
    public void trainingMenu(){
        boolean training = true;
        BladeArt bladeArtHandler = new BladeArt();
        Combat combatHandler = new Combat();
        Gun gunHandler = new Gun();
        Arcane arcaneHandler = new Arcane();

        while(training){
            System.out.println();
            System.out.println("+------------------------------------------------+");
            System.out.println("|            Choose Your Training Discipline     |");
            System.out.println("+------------------------------------------------+");
            System.out.println("| 1. Blade Arts                                  |");
            System.out.println("|    Master swordplay and sharpen your weapon    |");
            System.out.println("|    skills in one-on-one duels.                 |");
            System.out.println("| 2. Combat Conditioning                         |");
            System.out.println("|    Refine your agility, endurance, and physical|");
            System.out.println("|    technique through close-quarters sparring.  |");
            System.out.println("| 3. Gunslinger Training                         |");
            System.out.println("|    Train in precision shooting and mobility    |");
            System.out.println("|    with arcane-forged firearms.                |");
            System.out.println("| 4. Arcane Dueling                              |");
            System.out.println("|    Harness your magical power and test your    |");
            System.out.println("|    spellcasting in dynamic magical combat.     |");
            System.out.println("| 4. Exit Training                               |");
            System.out.println("+------------------------------------------------+");
            System.out.print(">>> ");

           String choice = scanner.nextLine();

           while(continueSparring){
                switch (choice) {
                    case "1":
                        bladeArtHandler.bladeArt();
                        continueSparring = false;
                        break;

                    case "2":
                        combatHandler.combatConditioning();
                        continueSparring = false;
                        break;

                    case "3":
                        gunHandler.gunslingerTraining();
                        continueSparring = false;
                        break;

                    case "4":
                        arcaneHandler.arcaneDuel();
                        continueSparring = false;
                        break;

                    default:
                        System.out.println();
                        System.out.println("┌───────────────────────────────┐");
                        System.out.println("│   Invalid input. Try again.   │");
                        System.out.println("└───────────────────────────────┘");
                }
            }
            
            training = false;
        }
    }
}
