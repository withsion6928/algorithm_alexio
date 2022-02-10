package sample;


//# 문제
//
//        고객이 수기로 작성하여 올바른 주소인지 보장할 수 없는 대량의 주소 목록이 있습니다.
//        건 별로 주소를 검사하여, 주소가 어느 "로"인지 확인하려고 합니다.
//        최대한 많은 주소를 올바른 주소인지 확인할 수 있도록 프로그램을 작성해주세요.
//        프로그램은 실행이 가능해야 하며, 실행 방법을 작성해주세요.
//
//        언어 : java, 버전 무관
//        라이브러리, 오픈소스 제품 등 사용 자유
//
//        프로그램 입력/출력은 아래와 같이 해주시면 됩니다.
//
//        - 입력 형식 : 문자열
//        - 출력 형식 : 자유
//
//        (예)
//        입력 : 성남 분당 백현로 265, 푸른마을 하파트
//        출력 : 백현로


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hantoo {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] str = br.readLine().split(" ");
            

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
