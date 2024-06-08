package hello.EffectiveJavaStudy.singleton;

/**
 * 간격하게 싱글턴 생성할 수 있다.
 * Enum 외의 클래스를 상속해야 하는 경우에는 사용할 수 없다.
 */
public enum EnumSingleton {
    INSTANCE;

    public void leaveTheBuilding() {}
}
