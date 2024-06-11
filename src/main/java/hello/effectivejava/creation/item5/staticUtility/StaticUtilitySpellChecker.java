package hello.effectivejava.creation.item5.staticUtility;

import hello.effectivejava.creation.item5.EnglishLexicon;
import hello.effectivejava.creation.item5.Lexicon;

import java.util.List;

/**
 * 정적 유틸 클래스
 * - 사용하는 자원에 따라 동작이 달라지는 클래스에는 적합하지 않다.
 * - 테스트도 힘들다.
 */
public class StaticUtilitySpellChecker {

    // Lexicon의 다형성을 전혀 활용할 수 없다.
    private static final Lexicon dictionary = new EnglishLexicon();

    // 객체 생성 방지
    private StaticUtilitySpellChecker() {}

    // 정적 메서드로 만든 유틸리티 메소드
    public static boolean isValid(String word) {return false;}

    public static List<String> suggestions(String typo) {return null;}
 }
