package hello.effectivejava.creation.item3;

/**
 * 정적 팩토리 메서드를 사용한 싱글턴
 * - API를 바꾸지 않고도 싱글턴 아니게 변경할 수 있다.
 * - 정적 팩터리 메서드를 제네릭 싱글턴 팩토리로 만들수 있다.
 * - 정적 팩토리 메서드 참조를 공급자(supplier)로 사용할 수 있다.
 */
public class StaticMethodSingleton {
    public static final StaticMethodSingleton INSTANCE = new StaticMethodSingleton();

    private StaticMethodSingleton() {}

    public static StaticMethodSingleton getInstance() {
        return INSTANCE;
    }
}
