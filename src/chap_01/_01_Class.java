package chap_01;

public class _01_Class {
    public static void main(String[] args) {
        // 차량용 블랙박스
        // 모델명, 해상도, 가격, 색상
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000; // price가 int 형식이기 때문에 배열 사용은 불가능
        String color = "블랙";

        // 새로운 제품을 개발
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        // 또 다른 제품을 개발?
        BlackBox bbox = new BlackBox();
        // BlackBox 클래스로부터 bbox 객체 생성
        // bbox 객체는 BlackBox 클래스의 인스턴스


        BlackBox bbox2 = new BlackBox();
    }
}
