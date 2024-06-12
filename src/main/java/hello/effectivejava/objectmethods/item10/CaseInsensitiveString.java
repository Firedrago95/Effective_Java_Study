package hello.effectivejava.objectmethods.item10;

import java.util.Objects;

public final class CaseInsensitiveString {

    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    /**
     * - 대칭성 위반 -
     * CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
     * String s = "polish";
     *
     * cis.equals(s) 는 true를 반환하지만,
     * s.equals(cis) 는 false를 반환한다. String equals는 CaseInsensitiveString를 모른다.
     */
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof CaseInsensitiveString) {
//            return s.equalsIgnoreCase(
//                    ((CaseInsensitiveString) obj).s);
//        }
//
//        if (obj instanceof String) {
//            return s.equalsIgnoreCase((String) obj);
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);
    }
}
