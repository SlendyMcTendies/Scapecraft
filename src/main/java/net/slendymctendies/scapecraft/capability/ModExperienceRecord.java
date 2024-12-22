package net.slendymctendies.scapecraft.capability;

public record ModExperienceRecord() {

    public static int getLevelXp(int level) {
        if (level == 2) {
            return 58;
        } else if (level == 3) {
            return 122;
        } else if (level == 4) {
            return 192;
        } else if (level == 5) {
            return 269;
        } else if (level == 6) {
            return 354;
        } else if (level == 7) {
            return 448;
        } else if (level == 8) {
            return 551;
        } else if (level == 9) {
            return 664;
        } else if (level == 10) {
            return 788;
        } else if (level == 11) {
            return 924;
        } else if (level == 12) {
            return 1074;
        } else if (level == 13) {
            return 1239;
        } else if (level == 14) {
            return 1421;
        } else if (level == 15) {
            return 1621;
        } else if (level == 16) {
            return 1841;
        } else if (level == 17) {
            return 2083;
        } else if (level == 18) {
            return 2349;
        } else if (level == 19) {
            return 2642;
        } else if (level == 20) {
            return 2964;
        } else if (level == 21) {
            return 3318;
        } else if (level == 22) {
            return 3707;
        } else if (level == 23) {
            return 4135;
        } else if (level == 24) {
            return 4606;
        } else if (level == 25) {
            return 5124;
        } else if (level == 26) {
            return 5694;
        } else if (level == 27) {
            return 6321;
        } else if (level == 28) {
            return 7011;
        } else if (level == 29) {
            return 7770;
        } else if (level == 30) {
            return 8605;
        } else {
            return 50000000;
        }
    }
}
