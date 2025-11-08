package DesignRelated;

import Hero.*;

public class Stats {

    public void sackOfGold(Hero hero) {

        int gold = 2500;

        System.out.println("░░░░░█    ░░░░░░  ░░      ░█    ░░░░    ░░░░░█    ░░░░░█      ░░░░░█");
        System.out.println("░░    ░░  ░█      ░░  ░░  ░█  ░░    █░  ░░    ░░  ░░    ░░  ░█");
        System.out.println("░░░░░░    ░░░░    ░█  ░░  ░░  ░░░░░░░░  ░░░░░░    ░░    ░░    ░░░░");
        System.out.println("░░    ░█  ░█      ░█  ░░  ░░  ░█    ░░  ░█    ░░  ░░    ░█        ░░");
        System.out.println("░░    ░█  ░░░░░░    ░░  ░░    ░░    ░░  ░█    ░░  ░░░░░█    ░░░░░█") ;
        System.out.println();
        System.out.println("                        ░░░░░░                        ");
        System.out.println("          ░░░░░░    ░░░░▓▓▒▒▒▒░░░░                       ");
        System.out.println("        ░░▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░                    ");
        System.out.println("      ░░▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░");
        System.out.println("      ░░▒▒▒▒▓▓░░░░▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒░░ ┌───────────────────────────────────────────────────┐");
        System.out.println("        ░░▒▒▒▒▒▒▓▓░░░░▒▒▒▒▒▒░░▒▒▒▒▓▓░░░░   │    Here's a sack of gold for you. May it help     │");
        System.out.println("          ░░▒▒▒▒▒▒▒▒▒▒░░░░░░▓▓▒▒▒▒░░       │    face the challenges that await on your path.   │");
        System.out.println("            ░░▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░     └───────────────────────────────────────────────────┘");
        System.out.printf("          ░░▒▒▒▒▒▒▒▒▒▒░░▒▒▓▓▓▓▒▒▒▒▒▒▒▒░░    >>> %-15s : +%6d%n", "Gold Earned", gold);
        System.out.printf("        ░░▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒░░  >>> %-15s : %6d%n", "Total Gold", hero.getGold() + gold);
        System.out.println("        ░░▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░");
        System.out.println("      ░░▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒░░");
        System.out.println("      ░░▒▒░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒░░");
        System.out.println("      ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒░░");
        System.out.println("      ░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒░░");
        System.out.println("      ░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒░░");
        System.out.println("    ░░  ░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒░░");
        System.out.println("  ░░      ░░░░▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒░░░░");
        System.out.println("  ░░          ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░");
        System.out.println("    ░░            ░░░░░░░░░░░░░░");
        System.out.println("      ░░░░                                ");
        System.out.println("          ░░      ░░                 ");
        System.out.println("            ░░░░░░                      ");


    }

    public void rewards(Hero hero) {
        int gold = 5000; // for testing
        int xp = 5000; // for testing

        System.out.println("░░░░░█    ░░░░░░  ░░      ░█    ░░░░    ░░░░░█    ░░░░░█      ░░░░░█");
        System.out.println("░░    ░░  ░█      ░░  ░░  ░█  ░░    █░  ░░    ░░  ░░    ░░  ░█");
        System.out.println("░░░░░░    ░░░░    ░█  ░░  ░░  ░░░░░░░░  ░░░░░░    ░░    ░░    ░░░░");
        System.out.println("░░    ░█  ░█      ░█  ░░  ░░  ░█    ░░  ░█    ░░  ░░    ░█        ░░");
        System.out.println("░░    ░█  ░░░░░░    ░░  ░░    ░░    ░░  ░█    ░░  ░░░░░█    ░░░░░█") ;
        System.out.println("                                                                     ");
        System.out.println("     > Gold Gained: " + gold + "       > Experience Gained: " + xp);
        System.out.println("                                                                       ");
        System.out.println("                        ░░░░░░░░░░░░░░░");
        System.out.println("                     ░░░▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓░░░");
        System.out.println("                  ░░░▒▒▒▒▒▒▒▒▒▒▒▒▓▓░▒▒▒▓▓▓░░░");
        System.out.println("               ░░░▒▒▒▒▒▒░░░▒▒▒▒▒▒▒▒▒▓▓░▒▒▒▓▓▓░░░");
        System.out.println("            ░░░▒▒▒▒▒▒░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓░▒▒▒▒▒▒░░░");
        System.out.println("            ░░░▒▒▒▒▒▒░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓░▒▒▒▒▒▒░░░");
        System.out.println("            ░░░▒▒▒▒▒▒░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓░▒▒▒▓▓▓░░░");
        System.out.println("            ░░░▒▒▒▒▒▒░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓░▒▒▒▓▓▓░░░");
        System.out.println("            ░░░▒▒▒▒▒▒░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░");
        System.out.println("               ░░░▒▒▒▒▒▒░░░▒▒▒▒▒▒▒▒▒░░░▒▒▒▒▒▒░░░");
        System.out.println("               ░░░▒▒▒▒▒▒▒▒▒░░░░░░░░░▒▒▒▒▒▒▒▒▒░░░");
        System.out.println("            ░░░▒▒▒░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒▒▒░░░");
        System.out.println("         ░░░▒▒▒▒▒▒▒▒▒░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒▒▒▓▓░▒▒▒░░░");
        System.out.println("      ░░░▒▒▒▓▓░▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░▒▒▒▒▒▒▓▓▓▓▓░▒▒▒░░░");
        System.out.println("   ░░░▒▒▒▓▓▓▓▓░▒▒▒▒▒▒▒▒▒░░░         ░░░▒▒▒▓▓░▒▒▒▒▒▒▒▒▒▒▒▒░░░");
        System.out.println("░░░░░░░░░▒▒▒▒▒▒▓▓░▒▒▒░░░               ░░░▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░");
        System.out.println("         ░░░▒▒▒▒▒▒░░░                     ░░░▒▒▒▒▒▒░░░");
        System.out.println("         ░░░▒▒▒░░░                           ░░░▒▒▒░░░");
        System.out.println("         ░░░░░░                                 ░░░░░░");

    }

}
