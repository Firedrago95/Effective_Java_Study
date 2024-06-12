package hello.effectivejava.objectmethods.item10;

import java.awt.*;

public class main {
    public static void main(String[] args) {
        추이성위배();
    }

    private static void 대칭성위배() {
        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);

        System.out.println("p.equals(cp) :"+p.equals(cp));
        System.out.println("cp.equals(p) :"+cp.equals(p));
    }

    private static void 추이성위배() {
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);

        System.out.println("p1.equals(p2) :"+p1.equals(p2));
        System.out.println("p2.equals(p3) :"+p2.equals(p3));
        System.out.println("p3.equals(p1) :"+p3.equals(p1));
    }
}
