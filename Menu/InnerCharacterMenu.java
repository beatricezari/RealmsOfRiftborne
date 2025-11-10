/*package Menu;

import DesignRelated.*;
import Hero.*;
import Narration.Narration;

import java.util.Scanner;

public class InnerCharacterMenu extends Narration {

    private static Scanner scanner = new Scanner(System.in);

    // ------------------ SWORDSMAN ------------------
    public Hero playerSwordsman(Hero hero) {
        MenuRelated menuHandler = new MenuRelated();
        Characters characterStatsHandler = new Characters();
        boolean isValid = false;

        while (!isValid) {
            menuHandler.swordsmanCharacterMenu();

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume leftover newline

                switch (choice) {
                    case 1:
                        swordsmanDetails();
                        break;
                    case 2:
                        characterStatsHandler.swordsmanCharacterStats(hero);
                        break;
                    case 3:
                        swordsmanBackstory();
                        break;
                    case 4: // change character
                        hero = changeCharacter(hero);
                        break;
                    case 5: // exit menu
                        isValid = true;
                        break;
                    default:
                        System.out.println("\n┌─────────────────────────────────────┐");
                        System.out.println("│ Oops! Invalid choice. Try again.    │");
                        System.out.println("└─────────────────────────────────────┘");
                }
            } catch (Exception e) {
                System.out.println("\n┌──────────────────────────────────────────────┐");
                System.out.println("│ Invalid input detected. Please try again.   │");
                System.out.println("└──────────────────────────────────────────────┘");
                scanner.nextLine(); // clear invalid input
            }
        }

        return hero;
    }

    // ------------------ GUNNER ------------------
    public Hero playerGunner(Hero hero) {
        MenuRelated menuHandler = new MenuRelated();
        Characters characterStatsHandler = new Characters();
        boolean isValid = false;

        while (!isValid) {
            menuHandler.gunnerCharacterMenu();

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume leftover newline

                switch (choice) {
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
                        hero = changeCharacter(hero);
                        break;
                    case 5:
                        isValid = true;
                        break;
                    default:
                        System.out.println("\n┌─────────────────────────────────────┐");
                        System.out.println("│ Oops! Invalid choice. Try again.    │");
                        System.out.println("└─────────────────────────────────────┘");
                }
            } catch (Exception e) {
                System.out.println("\n┌──────────────────────────────────────────────┐");
                System.out.println("│ Invalid input detected. Please try again.   │");
                System.out.println("└──────────────────────────────────────────────┘");
                scanner.nextLine();
            }
        }

        return hero;
    }

    // ------------------ MAGE ------------------
    public Hero playerMage(Hero hero) {
        MenuRelated menuHandler = new MenuRelated();
        Characters characterStatsHandler = new Characters();
        boolean isValid = false;

        while (!isValid) {
            menuHandler.mageCharacterMenu();

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume leftover newline

                switch (choice) {
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
                        hero = changeCharacter(hero);
                        break;
                    case 5:
                        isValid = true;
                        break;
                    default:
                        System.out.println("\n┌─────────────────────────────────────┐");
                        System.out.println("│ Oops! Invalid choice. Try again.    │");
                        System.out.println("└─────────────────────────────────────┘");
                }
            } catch (Exception e) {
                System.out.println("\n┌──────────────────────────────────────────────┐");
                System.out.println("│ Invalid input detected. Please try again.   │");
                System.out.println("└──────────────────────────────────────────────┘");
                scanner.nextLine();
            }
        }

        return hero;
    }

    // ------------------ HELPER METHOD TO CHANGE CHARACTER ------------------
    private Hero changeCharacter(Hero hero) {
        boolean willChange = true;

        while (willChange) {
            System.out.println("\n┌─────────────────────────────────────────────────────────────────────────────┐");
            System.out.println("│ Are you sure you want to change character? All progress will not be saved.   │");
            System.out.println("│ Enter 'y' to confirm or 'n' to cancel.                                     │");
            System.out.println("└─────────────────────────────────────────────────────────────────────────────┘");
            System.out.print("--> ");

            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("y")) {
                hero.resetCharacterFlags(); // reset current hero flags

                CharacterMenu characterMenuHandler = new CharacterMenu();
                hero = characterMenuHandler.chooseCharacterMenu(); // let player select new character

                // Set correct flag for new hero
                if (hero instanceof Swordsman) hero.setSwordmanCharacterChosen(true);
                else if (hero instanceof Mage) hero.setMageCharacterChosen(true);
                else if (hero instanceof Gunner) hero.setGunnerCharacterChosen(true);

                willChange = false; // exit loop
            } else if (input.equalsIgnoreCase("n")) {
                System.out.println("\nContinuing with current character...");
                willChange = false;
            } else {
                System.out.println("\n┌─────────────────────────────────────┐");
                System.out.println("│ Invalid input. Please enter y/n.    │");
                System.out.println("└─────────────────────────────────────┘");
            }
        }

        return hero;
    }
}


/*package Menu;

import DesignRelated.*;
import Hero.*;
import Narration.Narration;

import java.util.Scanner;

public class InnerCharacterMenu extends Narration {

    static Scanner scanner = new Scanner(System.in);

    // ------------------ SWORDSMAN ------------------
    public Hero playerSwordsman(Hero hero) {
        MenuRelated menuHandler = new MenuRelated();
        Characters characterStatsHandler = new Characters();
        boolean isValid = false;

        while (!isValid) {
            menuHandler.swordsmanCharacterMenu();

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume leftover newline

                switch (choice) {
                    case 1:
                        swordsmanDetails();
                        break;

                    case 2:
                        characterStatsHandler.swordsmanCharacterStats(hero);
                        break;

                    case 3:
                        swordsmanBackstory();
                        break;

                    case 4: // change character
                        hero = changeCharacter(hero);
                        break;

                    case 5:
                        isValid = true;
                        return null;

                    default:
                        System.out.println("\n┌─────────────────────────────────────┐");
                        System.out.println("│  Oops! Invalid choice. Try again.   │");
                        System.out.println("└─────────────────────────────────────┘");
                }

            } catch (Exception e) {
                System.out.println("\n┌──────────────────────────────────────────────┐");
                System.out.println("│   Invalid input detected. Please try again.  │");
                System.out.println("└──────────────────────────────────────────────┘");
                scanner.nextLine();
            }
        }

        return hero;
    }

    // ------------------ GUNNER ------------------
    public Hero playerGunner(Hero hero) {
        MenuRelated menuHandler = new MenuRelated();
        Characters characterStatsHandler = new Characters();
        boolean isValid = false;

        while (!isValid) {
            menuHandler.gunnerCharacterMenu();

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume leftover newline

                switch (choice) {
                    case 1:
                        gunnerDetails();
                        break;

                    case 2:
                        characterStatsHandler.gunnerCharacterStats(hero);
                        break;

                    case 3:
                        gunnerBackstory();
                        break;

                    case 4: // change character
                        hero = changeCharacter(hero);
                        break;

                    case 5:
                        isValid = true;
                        return null;

                    default:
                        System.out.println("\n┌─────────────────────────────────────┐");
                        System.out.println("│  Oops! Invalid choice. Try again.   │");
                        System.out.println("└─────────────────────────────────────┘");
                }

            } catch (Exception e) {
                System.out.println("\n┌──────────────────────────────────────────────┐");
                System.out.println("│   Invalid input detected. Please try again.  │");
                System.out.println("└──────────────────────────────────────────────┘");
                scanner.nextLine();
            }
        }

        return hero;
    }

    // ------------------ MAGE ------------------
    public Hero playerMage(Hero hero) {
        MenuRelated menuHandler = new MenuRelated();
        Characters characterStatsHandler = new Characters();
        boolean isValid = false;

        while (!isValid) {
            menuHandler.mageCharacterMenu();

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume leftover newline

                switch (choice) {
                    case 1:
                        mageDetails();
                        break;

                    case 2:
                        characterStatsHandler.mageCharacterStats(hero);
                        break;

                    case 3:
                        mageBackstory();
                        break;

                    case 4: // change character
                        hero = changeCharacter(hero);
                        break;

                    case 5:
                        isValid = true;
                        return null;

                    default:
                        System.out.println("\n┌─────────────────────────────────────┐");
                        System.out.println("│  Oops! Invalid choice. Try again.   │");
                        System.out.println("└─────────────────────────────────────┘");
                }

            } catch (Exception e) {
                System.out.println("\n┌──────────────────────────────────────────────┐");
                System.out.println("│   Invalid input detected. Please try again.  │");
                System.out.println("└──────────────────────────────────────────────┘");
                scanner.nextLine();
            }
        }

        return hero;
    }

    // ------------------ HELPER METHOD TO CHANGE CHARACTER ------------------
    private Hero changeCharacter(Hero hero) {
        boolean willChange = true;

        while (willChange) {
            System.out.println("\n┌─────────────────────────────────────────────────────────────────────────────┐");
            System.out.println("│  Are you sure you want to change character? All progress will not be saved. │");
            System.out.println("│  Enter 'y' to confirm or 'n' to cancel.                                    │");
            System.out.println("└─────────────────────────────────────────────────────────────────────────────┘");
            System.out.print("--> ");

            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("y")) {
                // Reset flags of current hero
                hero.resetCharacterFlags();

                // Let player choose a new character
                CharacterMenu characterMenuHandler = new CharacterMenu();
                hero = characterMenuHandler.chooseCharacterMenu();

                // Set proper flag for the new hero
                if (hero instanceof Swordsman) hero.setSwordmanCharacterChosen(true);
                else if (hero instanceof Mage) hero.setMageCharacterChosen(true);
                else if (hero instanceof Gunner) hero.setGunnerCharacterChosen(true);

                willChange = false; // exit loop after selection
            } else if (input.equalsIgnoreCase("n")) {
                System.out.println("\nContinuing with current character...");
                willChange = false;
            } else {
                System.out.println("\n┌─────────────────────────────────────┐");
                System.out.println("│  Invalid input. Please enter y/n.   │");
                System.out.println("└─────────────────────────────────────┘");
            }
        }

        return hero;
    }
}


*/

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

                                    hero.resetAllProgress();

                                     //hero.resetCharacterFlags();
                                    CharacterMenu characterMenuHandler = new CharacterMenu();
                                    //hero = characterMenuHandler.chooseCharacterMenu();
                                    //hero.setSwordmanCharacterChosen(false);
                                    //return new Swordsman();

                                    hero = characterMenuHandler.chooseCharacterMenu();
                                    hero.setSwordmanCharacterChosen(hero instanceof Swordsman);
                                    hero.setMageCharacterChosen(false);
                                    hero.setGunnerCharacterChosen(false);


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

                                    hero.resetAllProgress();

                                    //hero.resetCharacterFlags();
                                    CharacterMenu characterMenuHandler = new CharacterMenu();
                                    //hero = characterMenuHandler.chooseCharacterMenu();
                                    //hero.setGunnerCharacterChosen(false);
                                    //return new Gunner();

                                    hero = characterMenuHandler.chooseCharacterMenu();
                                    hero.setSwordmanCharacterChosen(false);
                                    hero.setMageCharacterChosen(false);
                                    hero.setGunnerCharacterChosen(hero instanceof Gunner);

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

                                    hero.resetAllProgress();
                                     //hero.resetCharacterFlags();
                                    CharacterMenu characterMenuHandler = new CharacterMenu();
                                     //hero = characterMenuHandler.chooseCharacterMenu();
                                    //hero.setMageCharacterChosen(false);
                                    //return new Mage();

                                    hero = characterMenuHandler.chooseCharacterMenu();
                                    hero.setSwordmanCharacterChosen(false);
                                    hero.setMageCharacterChosen(hero instanceof Mage);
                                    hero.setGunnerCharacterChosen(false);
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
    
