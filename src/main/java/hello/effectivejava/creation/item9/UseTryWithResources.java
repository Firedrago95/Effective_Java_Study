package hello.effectivejava.creation.item9;

import java.io.*;

/**
 * try-finally 보다는
 * try-with-resources를 사용하라
 */
public class UseTryWithResources {

    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }

    /**
     * 자원이 둘 이상이면, try-finally 방식은 너무 지저분하다.
     * try-finally 두군데서 예외가 발생하면 첫번째 예외는 무시된다.
     */
    static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[100];
                int n;
                while ((n = in.read(buf)) >= 0) {
                    out.write(buf, 0, n);
                }
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

    /**
     * try-with-resources 적용
     * AutoCloseable을 구현한 자원만이 사용할 수 있다.
     * 짧고 읽기 수월하다. 문제를 진단하기도 좋다.
     */
    static String firstLineOfFile2(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    static void copy2(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[100];
            int n;
            while ((n = in.read(buf)) >= 0) {
                out.write(buf, 0, n);
            }
        }
    }

    /**
     * try-with-resources를 catch절과 함께 사용하는 모습
     */
    static String firstLineOfFile3(String path, String defaultVal) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }
}
