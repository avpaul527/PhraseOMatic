package demo;

public class PhraseOMatic {
    public static void main(String[] args) {

        String[] wordListOne = {"highly available", "multi-faceted", "impeccable", "B-to-B", "win-win", "advanced", "web-based", "pervasive", "intelligent", "award-winning", "useful", "dynamic"};

        String [] wordListTwo = {"empowered", "intuitive", "valuable", "goal-oriented", "centric", "distributed", "branded", "focused", "impeccable", "shared", "evaluative", "lasting", "powerful", "driven"};

        String [] wordListThree = {"solution", "mission", "strategy", "presentation", "vision", "website", "architecture", "collection", "idea", "creation", "portal", "revolution", "campaign"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);

    }
}
