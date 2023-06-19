package chap_01;

public class BlackBox {

    // 설계도
    String modelName;
    String resolution;
    int price;
    String color;
    int serialNumber;

    static int counter = 0;
    static boolean canAutoReport = false; // 자동 신고 기능

    BlackBox() {
//        System.out.println("기본 생성자");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);

    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this();
//
//        System.out.println("사용자 정의 생성자 혿출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    // 전달값이 없는 메소드
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고됩니다.");
        }
        else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    // 전달값이 있는 메소드
    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity);
    }

    // 전달값 + 반환값
    int getVideoFileCount(int type) {
        if (type == 1) { // 일반 영상
            return 9;
        }
        else if (type == 2) { // 이벤트 영상
            return  1;
        } return 10;
    }

    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은" + min + "분 단위로 표시됩니다.");
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000)으로 연결합니다.");
        //modelName = "test";
        canAutoReport = false;
    }

    void appendModelName(String modelName) {
       this.modelName += modelName;
    }

    public void appendMod23elName(String s) {
    }


    // Getter & Setter
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null  || resolution.isEmpty()) {
            return  "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }
}
