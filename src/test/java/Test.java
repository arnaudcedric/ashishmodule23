/**
 * Created by acedric on 24/06/2017.
 */
public class Test {

    public boolean verifyWordInSentence(String sentence,String word){

        boolean isWordPresent = false;
        if (sentence.contains(word)){
            isWordPresent = true;
        }
            return isWordPresent;
    }

    public static void main(String[] args) {
        String sentence = "I am at school person";
        String word = "person";
        Test t = new Test();
        System.out.println(t.verifyWordInSentence(sentence, word));
        System.out.println("is t : "+ (t instanceof Test));

    }
}
