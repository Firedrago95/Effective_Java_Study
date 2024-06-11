package hello.effectivejava.creation.item3.singleton;

public class FactoryMethodSingleton {
    // static 상수 멤버
    public static final FactoryMethodSingleton INSTANCE = new FactoryMethodSingleton();

    // private 생성자
    private FactoryMethodSingleton() {}

    // 정적 팩토리 메서드
    public static FactoryMethodSingleton getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        // 진짜 Elvis를 생성하고, 가짜 Elvis는 가비지 컬렉터에 맡긴다.
        return INSTANCE;
    }
}
