package hello.EffectiveJavaStudy.ObjectCreatingAndDestroying.DependencyInjection.staticUtility;

import hello.EffectiveJavaStudy.ObjectCreatingAndDestroying.DependencyInjection.EnglishLexicon;
import hello.EffectiveJavaStudy.ObjectCreatingAndDestroying.DependencyInjection.Lexicon;

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
