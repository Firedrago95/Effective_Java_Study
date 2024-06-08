package hello.EffectiveJavaStudy.ObjectCreatingAndDestroying.UnnecessaryObjectInstantiation;

import java.time.LocalDateTime;
import java.util.regex.Pattern;

public class Examples {

    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,4})(I[XV]|V?I{0,3})$");

    public static void createStringObjects() {
        for (int i = 1; i < 10000; i++) {
            String s = new String("bikini");
        }
    }

    public static void createStrings() {
        for (int i = 1; i < 10000; i++) {
            String s = "bikini";
        }
    }

    // Pattern 객체가 호출마다 생성된다.
    public static boolean isRomanNumerals(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,4})(I[XV]|V?I{0,3})$");
    }
    // Pattern 객체를 상수로 등록하고 반복사용한다. (7배 정도 빠름)
    public static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }

    // 더해질때마다 Long 타입의 객체가 매번 생성된다. 기본타입을 사용하자
    public static void sum() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            isRomanNumeral(String.valueOf(i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }


}
