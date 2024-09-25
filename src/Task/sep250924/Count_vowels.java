package Task.sep250924;

public class Count_vowels {
    public static void main(String[] args) {
        String name = "ArulJeyakumar";
        int vowel = 0;
        int cons = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                vowel = vowel+1;
            } else {
                cons = cons+1;
            }
        }
        System.out.println("no of vowels :" + vowel);
        System.out.println("no of consents :" + cons);
    }
}
