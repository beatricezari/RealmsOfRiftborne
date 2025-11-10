package Narration;

import java.util.Scanner;
import DesignRelated.IntroTitle;

public class MagePlot {

    Scanner scanner = new Scanner(System.in);

    public void mageAfterArea1() { // implemented
        String[] afterArea1Narration3 = {
            "Narration: The air shimmered with fading magic. You stood among the ruins, your staff lowered, eyes tracing the glowing runes beneath your feet. Something about this place tugged at your memory - not mystery, but recognition.",
            "Louraine: \"You hesitate,\" the wandering spirit murmured, its voice faint and distant.",
            "Selene: \"It feels familiar,\" you whispered. \"Like I\'ve stood here before.\"",
            "Louraine: \"Perhaps you have. Some paths only seem new because you\'ve forgotten the footprints.\"",
            "Selene: \"You mean... this has all happened before?\"",
            "Louraine: \"You\'ll understand soon,\" the spirit said, drifting closer, its glow dimming. \"You always do.\"",
            "Narration: Before you could speak again, it vanished into the air, leaving only the hum of the runes.\nThe silence that followed felt heavy - not final, but repeating.\nAbove, the stars shifted, tracing a pattern you swore you\'d seen before."
        };

        magePlotNarration(afterArea1Narration3);

        System.out.println("┌─────────────────────────────────────────────────────────────┐");
        System.out.println("|   You are asked to be summoned to the Principal's office.   |");
        System.out.println("└─────────────────────────────────────────────────────────────┘");
        System.out.println("Press ENTER to continue");
        scanner.nextLine();
    }

    public void mageAfterArea2() { // implemented
        String[] afterArea2Narration3 = {
            "Narration: The Principal's office was quiet, moonlight cutting across the desk like a blade.\nYou stood still, your pulse steady but your thoughts spiraling.",
            "Selene: \"You called for me,\" you said.",
            "Principal: [He nodded slowly.] \"You've seen traces of Kim Morvain's power, haven't you?\"",
            "Selene: \"Yes... and I felt something else. A relic of sorts.\"",
            "Principal: \"Ah. The Nullstar Relic,\" he said, his tone measured. \"A conduit of Morvain's will. He used it to bind time itself within the Academy.\"",
            "Selene: \"You knew this, and still sent me there?\"",
            "Principal: [He stepped closer.] \"Because the relic responds to you. Kim Morvain chose you long before either of us realized why.\"",
            "Selene: \"Chose me? For what?\"",
            "Principal: \"To finish what he began. To complete the loop that sustains him.\"",
            "Narration: The words hit you harder than any spell. Outside, thunder rolled - not a storm, but the echo of a cycle repeating itself.",
            "Narration: And yet, the path ahead opens. The Forsaken Lands sense your growing mastery and the bond with the Nullstar Relic.\nYou are now eligible to enter, where the remnants of Morvain's power await and the truth of your destiny will unfold."
        };

        magePlotNarration(afterArea2Narration3);
    }


    public void mageDuringArea3() { // implemented
        String[] duringArea3Narration3 = {
            "Narration: The chamber was drenched in shadow, the air heavy with old magic. Your footsteps echoed like whispers of forgotten time.",
            "Kim Morvain: \"At last,\" a voice called from the dark. \"The echo of my will returns.\"",
            "Selene: [You raised your staff.] \"Kim Morvain... You\'re alive.\"",
            "Kim Morvain: [He emerged from the dark, his smile sharp and knowing.] \"Alive? No. Preserved. Bound by the Nullstar Relic — the very tool you now wield without knowing.\"",
            "Selene: \"You twisted the artifact\'s power... trapped us all in this endless loop.\"",
            "Kim Morvain: \"And you think you can break it? Foolish child. You carry my essence. The moment you cast your first spell, the cycle was sealed again.\"",
            "Selene: \"Then I\'ll unmake it - even if it means ending you.\"",
            "Kim Morvain: [He laughed quietly, bitterly.] \"End me? You\'d have to end yourself first. We are bound, you and I - the beginning and the end, feeding each other\'s curse.\"",
            "Narration: The floor cracked with light, and the chamber trembled as the Nullstar Relic pulsed between you both - a rhythm of defiance and destiny colliding."
        };

        magePlotNarration(duringArea3Narration3);
    }

    public void mageAfterArea3() { // implemented
        String[] afterArea3Narration3 = {
            "Narration: The Academy was silent. The halls you once fought through were now still - no life, no sound, only the faint hum of residual magic.",
            "Louraine: [The wandering spirit appeared beside you, its glow dim and trembling.] \"You returned.\"",
            "Selene: \"I defeated him,\" you said quietly. \"So why does it feel like nothing changed?\"",
            "Louraine: \"Because it hasn\'t. Kim Morvain\'s cycle endures. Each time his relic touches your magic, the world resets.\"",
            "Selene: \"Then... this has all happened before.\"",
            "Louraine: \"Many times. You always fight. You always win. And the world begins again. But this time - you\'ve realized it.\"",
            "Selene: [You stared down the corridor, the faint glow of the relic pulsing at your side.] \"There must be a way to end it.\"",
            "Louraine: \"There is. But the cost remains the same - the end of all you are.\"",
            "Narration: You looked toward the faint light at the end of the hall - the same light that greeted every victory, every reset.",
            "Selene: \"Then it\'s not about winning anymore... it\'s about ending the loop.\"",
            "Narration: The spirit said nothing. The silence between you felt like truth itself.\nA low rumble echoed through the academy - not thunder, but time, waiting to break."
        };

        magePlotNarration(afterArea3Narration3);
    }

    public void mageAfterDeath() { // implemented
        String[] afterDeathNarration3 = {
            "Narration: The world was quiet, the Academy gone. The stars hung motionless, unbound by the relic\'s pulse.",
            "Selene: [You exhaled, a soft smile breaking through.] \"It\'s over... isn\'t it?\"",
            "Louraine: [The spirit drifted beside you, now bright and calm.] \"It is. The Nullstar\'s power has faded. Kim Morvain\'s shadow will never return.\"",
            "Selene: \"And the others? The lives we lost?\"",
            "Louraine: \"They live again - not in loops, but in memory. You freed them by choosing to end what bound you both.\"",
            "Narration: The world shimmered like dawn breaking after an endless night.\nYou felt light, unchained, alive.\nFor the first time, the silence was peaceful - not hollow, but whole."
        };

        magePlotNarration(afterDeathNarration3);
    }

    public void mageAcceptanceFate() { // implemented
        String[] acceptanceOfFateNarration3 = {
            "Narration: The halls were dark again. The relic pulsed faintly in your hand, as though waiting for your decision.",
            "Louraine: \"You know what must be done,\" it said softly.",
            "Selene: \"I do. But I can\'t. I\'m not ready to disappear.\"",
            "Louraine: \"Then the cycle continues. You will live... but the loop will claim everything again.\"",
            "Selene: [You tightened your grip on the relic.] \"Then so be it. I\'ll live with the cost — even if it means repeating forever.\"",
            "Narration: The spirit\'s glow dimmed, heavy with sorrow.",
            "Louraine: \"You\'ve chosen survival over freedom. May this world be kind, even if it forgets you again.\"",
            "Narration: The halls rippled, and once more the Academy began to breathe — the same beginning, the same end.\nThe cycle endured, and you, its unwilling guardian, took your first breath again in a world that would never remember the truth."
        };

        magePlotNarration(acceptanceOfFateNarration3);
    }

    public void mageEndingPlot() {
        IntroTitle outroHandler = new IntroTitle();

        mageAfterArea3();

        boolean validChoice = false;

        while (!validChoice) {
            System.out.println("┌───────────────────────────────────────────────────────────────┐");
            System.out.println("│   The question stands before you: Will you break the cycle,   │");
            System.out.println("│          or accept the burden of eternity? (y/n)              │");
            System.out.println("└───────────────────────────────────────────────────────────────┘");


            try {
                String endLoop = scanner.nextLine().trim();

                if (endLoop.equalsIgnoreCase("y")) {
                    System.out.println("┌───────────────────────────────────────┐");
                    System.out.println("│   You have chosen to end the loop...  │");
                    System.out.println("└───────────────────────────────────────┘");

                    mageAfterDeath();
                    validChoice = true;
                } else if (endLoop.equalsIgnoreCase("n")) {
                    System.out.println("┌────────────────────────────────────────────────────────────┐");
                    System.out.println("│   You refuse to end it, accepting what you have become...  │");
                    System.out.println("└────────────────────────────────────────────────────────────┘");

                    mageAcceptanceFate();
                    validChoice = true;
                } else {
                    System.out.println();
                    System.out.println("┌────────────────────────────────────────┐");
                    System.out.println("│   Choice unclear! Enter 'y' or 'n'.    │");
                    System.out.println("└────────────────────────────────────────┘");
                }

            } catch (Exception e) {
                System.out.println();
                System.out.println("┌──────────────────────────────────────────────┐");
                System.out.println("│   An unexpected error occurred. Try again.   │");
                System.out.println("└──────────────────────────────────────────────┘");
                scanner.nextLine();
            }
        }

        outroHandler.outroGameDoneTemporary();

        System.out.println();
        System.out.println("Thank you for playing Mystvale Academy.");
        System.exit(0);
    }

    public void magePlotNarration(String[] array) {
        
        System.out.println("┌─────────────────────────────────────────────────────────────┐");
        System.out.println("│ Narration Ahead! Not Skippable │ Press ENTER to continue... │");
        System.out.println("└─────────────────────────────────────────────────────────────┘");

        for (int i = 0; i < array.length; i++) {
            scanner.nextLine();
            System.out.println(array[i]);
        }

        System.out.println();
    }
}
