package com.edu.chap03.level02.normal;

public class RandomMaker {

    public static int randomNumber(int min, int max) {
        // 최소값부터 최대값까지 범위의 난수 반환함

        return (int)(Math.random()*(max-min+1))+min;
    }

    public static String randomUpperAlpabet(int length){
        // 인자의 길이 만큼의 랜덤한 대문자 알파벳으로 이루어진 문자열을 반환함
        String result = "";

        for (int i = 0; i<length; i++){
            int random = (int)(Math.random() * 26); // 0~25
            char randomAtoZ = (char)(random + 'A'); //A에 랜덤 숫자 더해서 유니코드 65+90인 대문자 출력
            result += randomAtoZ; //result에 추가해줌
        }
        return result;
    }

    public static String rockPaperScissors() {
        // 가위, 바위, 보 중 한 가지를 반환함
        int random = (int) (Math.random() * 3);

        String[] result = new String[3];
        result[0] = "가위";
        result[1] = "바위";
        result[2] = "보";

        return result[random];

        // 스위치문 사용해봄..
//        switch (random){
//            case 0:
//                return "가위";
//            case 1:
//                return "바위";
//            case 2:
//                return "보";
//            default:
//                return "";
//        }

    }

    public static String tossCoin(){
        // 동전의 앞면, 뒷면 중 한 가지를 반환함
        int random = (int) (Math.random() * 2);
        String[] result = {"앞면", "뒷면"};

        return result[random];
    }

}
