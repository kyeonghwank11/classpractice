package chap_01;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 (랜덤 글래스)
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt());
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10));
        System.out.println("랜덤 실수" + random.nextDouble());

    }
}
