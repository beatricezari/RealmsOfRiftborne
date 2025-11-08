package Menu;

import DesignRelated.*;
import Hero.*;
import Narration.Narration;

import java.util.Scanner;

public class InnerCharacterMenu extends Narration{

    static Scanner scanner = new Scanner(System.in);
    

    public Hero playerSwordsman(Hero hero) {
        MenuRelated menuRelatedHandler = new MenuRelated();
        Characters characterStatsHandler = new Characters();
        boolean isValid = false;

        while(!isValid) {
            menuRelatedHandler.swordsmanCharacterMenu();

            try {
                int choice = scanner.nextInt();

                switch(choice) {
                    case 1: 
                        swordsmanDetails();
                        break;

                    case 2:
                        characterStatsHandler.swordsmanCharacterStats(hero);
                        break;

                    case 3:
                        swordsmanBackstory();
                        break;

                    case 4:
                        boolean willChange = true;
                        scanner.nextLine(); 

                        while (willChange) {
                            System.out.println();
                            System.out.println("┌─────────────────────────────────────────────────────────────────────────────┐");
                            System.out.println("│  Are you sure you want to change character? All progress will not be saved. │");
                            System.out.println("│  Enter 'y' to confirm or 'n' to cancel.                                    │");
                            System.out.println("└─────────────────────────────────────────────────────────────────────────────┘");
                            System.out.print("--> ");

                            try {
                                String willChangePlayer = scanner.nextLine().trim();

                                if (willChangePlayer.equalsIgnoreCase("y")) {
                                    System.out.println();
                                    System.out.println(">>>>> - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - <<<<<");
                                    System.out.println("      ┌────────────────────────────────────────────────────────────────────┐");
                                    System.out.println("      │   The fates allow you to choose again. Another destiny awaits...   │");
                                    System.out.println("      └────────────────────────────────────────────────────────────────────┘");
                                    System.out.println(">>>>> - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - <<<<<");

                                    CharacterMenu characterMenuHandler = new CharacterMenu();
                                    characterMenuHandler.chooseCharacterMenu();
                                    return new Swordsman();

                                } else if (willChangePlayer.equalsIgnoreCase("n")) {
                                    System.out.println();
                                    System.out.println("Continuing with current character...");
                                    willChange = false;
                                } else {
                                    System.out.println();
                                    System.out.println("┌─────────────────────────────────────┐");
                                    System.out.println("│  Invalid input. Please enter y/n.   │");
                                    System.out.println("└─────────────────────────────────────┘");
                                }

                            } catch (Exception e) {
                                System.out.println();
                                System.out.println("┌──────────────────────────────────────────────┐");
                                System.out.println("│   Invalid input detected. Please try again.  │");
                                System.out.println("└──────────────────────────────────────────────┘");
                                scanner.nextLine(); // clear buffer
                            }
                        }
                        break;

                    
                    case 5:
                        isValid = true;
                        return null;

                    default:
                        System.out.println();
                        System.out.println("┌─────────────────────────────────────┐");
                        System.out.println("│  Oops! Invalid choice. Try again.   │");
                        System.out.println("└─────────────────────────────────────┘");
                }


            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println("┌──────────────────────────────────────────┐");
                System.out.println("│   Invalid input! Please enter a number.  │");
                System.out.println("└──────────────────────────────────────────┘");
            } catch (Exception e) {
                System.out.println();
                System.out.println("┌──────────────────────────────────────────────┐");
                System.out.println("│   An unexpected error occurred. Try again.   │");
                System.out.println("└──────────────────────────────────────────────┘");
                scanner.nextLine(); 
            }
        }

        return hero;
        
    }

    public Hero playerGunner(Hero hero) {
        MenuRelated menuRelatedHandler = new MenuRelated();
        Characters characterStatsHandler = new Characters();
        boolean isValid = false;

        while(!isValid) {
            menuRelatedHandler.gunnerCharacterMenu();

            try {
                int choice = scanner.nextInt();

                switch(choice) {
                    case 1: 
                        gunnerDetails();
                        break;

                    case 2:
                        characterStatsHandler.gunnerCharacterStats(hero);
                        
                        break;

                    case 3:
                        gunnerBackstory();
                        break;

                    case 4:
                        boolean willChange = true;
                        scanner.nextLine(); 

                        while (willChange) {
                            System.out.println();
                            System.out.println("┌─────────────────────────────────────────────────────────────────────────────┐");
                            System.out.println("│  Are you sure you want to change character? All progress will not be saved. │");
                            System.out.println("│  Enter 'y' to confirm or 'n' to cancel.                                    │");
                            System.out.println("└─────────────────────────────────────────────────────────────────────────────┘");
                            System.out.print("--> ");

                            try {
                                String willChangePlayer = scanner.nextLine().trim();

                                if (willChangePlayer.equalsIgnoreCase("y")) {
                                    System.out.println();
                                    System.out.println(">>>>> - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - <<<<<");
                                    System.out.println("      ┌────────────────────────────────────────────────────────────────┐");
                                    System.out.println("      │   The visions shift... perhaps another path calls your name.   │");
                                    System.out.println("      └────────────────────────────────────────────────────────────────┘");
                                    System.out.println(">>>>> - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - <<<<<");

                                    CharacterMenu characterMenuHandler = new CharacterMenu();
                                    characterMenuHandler.chooseCharacterMenu();
                                    return new Gunner();

                                } else if (willChangePlayer.equalsIgnoreCase("n")) {
                                    System.out.println();
                                    System.out.println("Continuing with current character...");
                                    willChange = false;
                                } else {
                                    System.out.println();
                                    System.out.println("┌─────────────────────────────────────┐");
                                    System.out.println("│  Invalid input. Please enter y/n.   │");
                                    System.out.println("└─────────────────────────────────────┘");
                                }

                            } catch (Exception e) {
                                System.out.println();
                                System.out.println("┌──────────────────────────────────────────────┐");
                                System.out.println("│   Invalid input detected. Please try again.  │");
                                System.out.println("└──────────────────────────────────────────────┘");
                                scanner.nextLine(); 
                            }
                        }
                        break;

                    
                    case 5: 
                        isValid = true;
                        return null;

                    default:
                        System.out.println();
                        System.out.println("┌─────────────────────────────────────┐");
                        System.out.println("│  Oops! Invalid choice. Try again.   │");
                        System.out.println("└─────────────────────────────────────┘");
                }


            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println("┌──────────────────────────────────────────┐");
                System.out.println("│   Invalid input! Please enter a number.  │");
                System.out.println("└──────────────────────────────────────────┘");
            } catch (Exception e) {
                System.out.println();
                System.out.println("┌──────────────────────────────────────────────┐");
                System.out.println("│   An unexpected error occurred. Try again.   │");
                System.out.println("└──────────────────────────────────────────────┘");
                scanner.nextLine(); 
            }
        }

        return hero;
        
    }

    public Hero playerMage(Hero hero) {
        MenuRelated menuRelatedHandler = new MenuRelated();
        Characters characterStatsHandler = new Characters();
        boolean isValid = false;
        //hero = null;

        while(!isValid) {
            menuRelatedHandler.mageCharacterMenu();

            try {
                int choice = scanner.nextInt();

                switch(choice) {
                    case 1: 
                        mageDetails();
                        break;

                    case 2:
                        characterStatsHandler.mageCharacterStats(hero);
                        break;

                    case 3:
                        mageBackstory();
                        break;

                    case 4:
                        boolean willChange = true;
                        scanner.nextLine(); 

                        while (willChange) {
                            System.out.println();
                            System.out.println("┌─────────────────────────────────────────────────────────────────────────────┐");
                            System.out.println("│  Are you sure you want to change character? All progress will not be saved. │");
                            System.out.println("│  Enter 'y' to confirm or 'n' to cancel.                                     │");
                            System.out.println("└─────────────────────────────────────────────────────────────────────────────┘");
                            System.out.print("--> ");

                            try {
                                String willChangePlayer = scanner.nextLine().trim();

                                if (willChangePlayer.equalsIgnoreCase("y")) {
                                    System.out.println();
                                    System.out.println(">>>>> - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - <<<<<");
                                    System.out.println("      ┌───────────────────────────────────────────────────────────────────────────┐");
                                    System.out.println("      │   The scrolls fade from your grasp -  you seek another legend to become.  │");
                                    System.out.println("      └───────────────────────────────────────────────────────────────────────────┘");
                                    System.out.println(">>>>> - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - <<<<<");

                                    CharacterMenu characterMenuHandler = new CharacterMenu();
                                    characterMenuHandler.chooseCharacterMenu();
                                    return new Mage();
                                } 
                                else if (willChangePlayer.equalsIgnoreCase("n")) {
                                    System.out.println();
                                    System.out.println("Continuing with current character...");
                                    willChange = false;
                                } 
                                else {
                                    System.out.println();
                                    System.out.println("┌─────────────────────────────────────┐");
                                    System.out.println("│  Invalid input. Please enter y/n.   │");
                                    System.out.println("└─────────────────────────────────────┘");
                                }

                            } catch (Exception e) {
                                System.out.println();
                                System.out.println("┌──────────────────────────────────────────────┐");
                                System.out.println("│   Invalid input detected. Please try again.  │");
                                System.out.println("└──────────────────────────────────────────────┘");
                                scanner.nextLine(); 
                            }
                        }
                        break;

                         
                    
                    case 5:
                        isValid = true;
                        return null;

                    default:
                        System.out.println();
                        System.out.println("┌─────────────────────────────────────┐");
                        System.out.println("│  Oops! Invalid choice. Try again.   │");
                        System.out.println("└─────────────────────────────────────┘");
                }


            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println("┌──────────────────────────────────────────┐");
                System.out.println("│   Invalid input! Please enter a number.  │");
                System.out.println("└──────────────────────────────────────────┘");
            } catch (Exception e) {
                System.out.println();
                System.out.println("┌──────────────────────────────────────────────┐");
                System.out.println("│   An unexpected error occurred. Try again.   │");
                System.out.println("└──────────────────────────────────────────────┘");
                scanner.nextLine(); 
            }
        }

        return hero;
        
    }

    

}
