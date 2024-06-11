package hello.effectivejava.creation.item5.staticUtility;

import hello.effectivejava.creation.item5.EnglishLexicon;
import hello.effectivejava.creation.item5.Lexicon;

import java.util.List;

/**
 * 싱글턴 클래스
 * - 역시 하나의 사전만 사용한다고 가정함 -> 다형성 활용 불가능
 * - 테스트 쉽지 않다.
 */
public class SingletonSpellChecker {

    private final Lexicon dictionay = new EnglishLexicon();

    private SingletonSpellChecker() {}

    public static SingletonSpellChecker INSTANCE = new SingletonSpellChecker();

    public boolean isValid(String word) {return false;}

    public List<String> suggestions(String typo) {return null;}
}
