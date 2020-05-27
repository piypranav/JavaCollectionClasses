package JavaStringPractice;



public class ReplaceCharacterInString {

    public String replaceCharacter(String str, char c) {
        if(str == null) {
            return str;
        } else {
            return str.replaceAll(Character.toString(c), "");
        }
    }

    public static void main(String[] args) {
        ReplaceCharacterInString replaceChar = new ReplaceCharacterInString();
        System.out.println(replaceChar.replaceCharacter("radar", 'd'));
    }
}
