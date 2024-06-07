package hello.EffectiveJavaStudy.ObjectCreatingAndDestroying.singleton;


/**
 * public static 필드 방식의 싱글턴
 * - 간결하다.
 * - 싱글턴임이 API에 명백히 드러난다.
 */
public class StaticFinalSingleton {
    public static final StaticFinalSingleton INSTANCE = new StaticFinalSingleton();

    private StaticFinalSingleton() {}

    public static StaticFinalSingleton getInstance() {
        return INSTANCE;
    }
}
