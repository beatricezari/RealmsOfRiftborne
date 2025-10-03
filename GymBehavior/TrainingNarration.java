package GymBehavior;

import java.util.Scanner;

public class TrainingNarration {

    static Scanner scanner = new Scanner(System.in);

    public void trainingNarration1(){

        String[] sparringStartNarration = {
            "You step onto the sparring platform, the weight of a training sword in your hand.",
            "Across from you, a student nods respectfully - no words, just focus.",
            "The instructor watches from the sidelines, arms crossed.",
            "\"Begin.\"",
            "Steel clashes against steel. Every strike tests your grip, your stance, your timing.",
            "You miss. You recover. You push back."
        };

        System.out.println();
        System.out.println("┌────────────────────────────────────┐");
        System.out.println("│     Press Enter to continue...     │");
        System.out.println("└────────────────────────────────────┘");

        playGymNarration(sparringStartNarration);

    }

    public void trainingNarration2(){

        String[] sparringStartNarration = {
            "You step into the training ring, feet pounding against the packed earth.",
            "Your gear is minimal—just wraps on your fists and fire in your veins.",
            "An instructor circles the perimeter, calling out drills. Sprint. Roll. Strike.",
            "Another trainee steps forward. No weapons. Just grit.",
            "Time to test your reflexes—and your resolve."
        };

        System.out.println();
        System.out.println("┌────────────────────────────────────┐");
        System.out.println("│     Press Enter to continue...     │");
        System.out.println("└────────────────────────────────────┘");

        playGymNarration(sparringStartNarration);

    }

    public void trainingNarration3(){

        String[] sparringStartNarration = {
            "You step into the shooting range. Targets shift and flicker at unpredictable angles.",
            "A cold, rune-etched revolver rests in your grip—arcane symbols glowing faintly.",
            "An instructor calls out: \"Movement, aim, precision. No hesitation.\"",
            "You exhale. Focus. The world narrows to sights and sound.",
            "Ready? The targets begin to move."
        };

        System.out.println();
        System.out.println("┌────────────────────────────────────┐");
        System.out.println("│     Press Enter to continue...     │");
        System.out.println("└────────────────────────────────────┘");

        playGymNarration(sparringStartNarration);

    }

    public void trainingNarration4(){

        String[] sparringStartNarration = {
            "The air hums with energy as you step onto the dueling circle.",
            "Crackling wards shimmer around the perimeter—no real death here, but pain is promised.",
            "Across from you, another apprentice raises their hands, spelllight already forming.",
            "The instructor speaks a single word: \'Begin.\'",
            "Magic flows through your veins. Time to see if you can control it."
        };

        System.out.println();
        System.out.println("┌────────────────────────────────────┐");
        System.out.println("│     Press Enter to continue...     │");
        System.out.println("└────────────────────────────────────┘");

        playGymNarration(sparringStartNarration);

    }

    public void exploreNarration(){

        String[] exploreGym = {
            "As you step into the left wing of the Gym, the space opens up into the Academy\'s main Training Ground- a place alive with energy and motion.",
            "To your right, sparks and streaks of light fly through the air as students duel with wands, chanting spells that crackle with raw magic.",
            "To your left, the clash of bodies and grunts of effort mark intense physical sparring matches—each challenger fighting hard, neither willing to back down.",
            "At the center, the sharp clang of steel rings out with every sword strike, echoing through the chamber like a challenge to all who hear it.",
            "And just beyond that, in a reinforced zone surrounded by glowing wards, sharp bangs pierce the air—students practice with enchanted firearms, weaving gunplay and magic into fast-paced, high - precision sparring.",
            "Suddenly, a student in uniform approaches you with a slight smirk."
        };

        System.out.println();
        System.out.println("┌────────────────────────────────────┐");
        System.out.println("│     Press Enter to continue...     │");
        System.out.println("└────────────────────────────────────┘");

        playGymNarration(exploreGym);

    }

    public void playGymNarration(String[] arr){

        for(int i = 0; i < arr.length; i++){
            scanner.nextLine();
            System.out.println(arr[i]);
        }

    }

    public void trainingInstructions(){

        System.out.println();
        System.out.println("┌─────────────────────────────┐");
        System.out.println("│ NOTE: Instructions ahead... │");
        System.out.println("└─────────────────────────────┘");

        
        String[] instruction = {
            "Choose Your Training Wisely.",
            "Each path is tailored to different strengths-physical, precision-based, or magical.",
            "Your selection will define your focus for the entire school year.",
            "No switching once chosen. Pick the discipline that aligns with your character's abilities and instincts."
        };

        playGymNarration(instruction);

    }


}
