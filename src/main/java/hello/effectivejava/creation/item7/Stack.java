package hello.effectivejava.creation.item7;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Stack 처럼 자기 메모리를 직접 관리하는 클래스의 메모리 누수에 주의하자
 * (캐시와 콜백 리스너등을 주의하자)
 */
public class Stack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    /**
     * pop으로 반환된 객체는 가비지 컬렉터가 삭제하지 않는다.
     * 메모리 누수가 지속적으로 발생한다.
     * 참조하지 말아야할 객체를 사용하는 잘못된 사용의 가능성도 있다.
     */
    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    /**
     * 다 쓴 참조를 null 처리하면,
     * 메모리 누수는 물론, 실수로 사용하려고 해도 NullPointException으로 잘못된 사용을 막아준다.
     */
    public Object pop2() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null; // 다 쓴 참조는 해제하여, 메모리 누수를 방지한다.
        return result;
    }


    /**
     * 원소를 위한 공간을 적어도 하나 이상 확보한다.
     * 배열 크기를 늘려야 할 때마다 대략 두 배씩 늘린다.
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
