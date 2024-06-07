package hello.EffectiveJavaStudy.singleton;

/**
 * 생성자를 private 으로 생성 
 *  - 인스턴스화를 막는다. 자동생성 하지 않는다.
 *  - 내부에서 호출하는것도 막기위해 예외던지는 로직을 추가한다.
 *  - 유틸클래스같은 정적 메서드로 구성된 클래스를 만들때는 생성자를 private 설정하자
 */
public class UtilityClass {

    
    private UtilityClass() {
        throw new AssertionError();
    }
}
