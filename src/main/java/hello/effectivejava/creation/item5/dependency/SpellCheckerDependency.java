package hello.effectivejava.creation.item5.dependency;

import hello.effectivejava.creation.item5.Lexicon;

import java.util.List;

/**
 * 의존성 주입
 * - 다형성을 활용가능하다. 테스트하기쉽고, 재삿용성도 높다.
 * - 클래스가 내부적으로 의존관계가 있다면, 의존성 주입을 사용하자
 * - 생성자, 정적 팩토리, 빌더 모두 사용할 수 있다.
 */
public class SpellCheckerDependency {

    private Lexicon dictionary;

    public SpellCheckerDependency(Lexicon dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {return false;}
    public List<String> suggestions(String typo) {return null;}
}
