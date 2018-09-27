package pl.radox.homework1;

public class LastWordLengthInSequence {

    public static void main(String[] args) {
        String sequence = "tka 11";
        System.out.println(LastWordLengthInSequence.lenghtLastWord(sequence));
    }

    static int lenghtLastWord(String s) {
        int leghht = 0;
        char[] seqArray = s.toCharArray();
        int iterator = seqArray.length - 1;

        while (seqArray[iterator] != ' ') {
            leghht++;
            iterator--;
            if (iterator == -1) {
                break;
            }
        }
        return leghht;
    }
}
