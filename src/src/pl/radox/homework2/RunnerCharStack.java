package pl.radox.homework2;

public class RunnerCharStack {
    public static void main(String[] args) throws Exception {

        String stringToReverse = "Radek";
        CharStack charStack = new CharStack(stringToReverse.length());
        char[] chars = stringToReverse.toCharArray();
        for (char aChar : chars) {
            charStack.push(aChar);
        }

        StringBuilder reversedString = new StringBuilder();
        while (!charStack.isEmpty()) {
            reversedString.append(charStack.readCharFromStack());
            charStack.pop();
        }
        System.out.println("Reversed string:" + reversedString);
    }


}
