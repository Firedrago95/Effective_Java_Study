package hello.effectivejava.creation.item3.singleton;

public class ConstSingleton {
    // static 상수 멤버
    public static final ConstSingleton INSTANCE = new ConstSingleton();

    // private 생성자
    private ConstSingleton() {}
}
