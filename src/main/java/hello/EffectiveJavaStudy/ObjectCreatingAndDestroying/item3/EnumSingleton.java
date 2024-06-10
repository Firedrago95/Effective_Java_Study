package hello.EffectiveJavaStudy.ObjectCreatingAndDestroying.item3;

/**
 * Enum 싱글턴
 * - 상속받지 못하고, 상속되지 않는다. -> 동일한 인스턴스가 보장된다.
 * - Enum을 사용하면 Java가 자동으로 직렬화를 안전하게 처리한다. 일반적인 싱글턴은 별도의 메서드가 필요하다.
 * - 리플렉션으로 private 생성자를 호출하여 새로운 인스턴스를 생성할 수 있지만, Enum은 리플렉션을 통해 인스턴스를 생성하는 것을 방지한다.
 */
public enum EnumSingleton {
    INSTANCE;

    public void leaveTheBuilding() {
        //...
    }
}
