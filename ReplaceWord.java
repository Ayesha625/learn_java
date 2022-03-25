import java.util.Scanner;
class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence, searchword, replaceword;

        System.out.println("Enter the string:");
        sentence = sc.nextLine();

        System.out.println("Enter the word to be searched:");
        searchword = sc.nextLine();

        System.out.println("Enter the word to be replaced:");
        replaceword = sc.nextLine();

        String finalSentence = sentence.replace(searchword, replaceword);

        if (finalSentence.equals(sentence)) {
            System.out.println("The word " + searchword + " not found");
        } else {
            System.out.println(finalSentence);
        }
    }
}
