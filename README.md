# 12 - 클래스 필드와 클래스 메서드의 한계

## 학습 목표

- 클래스 필드와 클래스 메서드의 한계를 이해한다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/handler/BoardHandler2.java 추가
- src/main/java/com/eomcs/lms/App.java 변경

## 실습

### 작업1) 새 게시판을 추가하라.

- InformationHandler2.java
    - `/Information2/add`, `/Information2/list` 명령을 처리할 클래스를 추가한다.
- App.java
    - 새 명령을 처리하는 코드를 추가한다.

실행 결과:

```
명령> /information/add
번호: 1
장르: EDM 페스티벌
공연명: EDC KOREA 2019
장소: 서울랜드
공연시작: 2019-08-30
공연종료: 2019-09-01
러닝타임: 00
관람연령: 만 19세 이상
공연소개: 재미있는 공연
저장하였습니다.

명령> /information/add
번호: 2
장르: EDM 페스티벌
공연명: EDC KOREA 2019
장소: 서울랜드
공연시작: 2019-08-30
공연종료: 2019-09-01
러닝타임: 00
관람연령: 만 19세 이상
공연소개: 재미있는 공연
저장하였습니다.

명령> /information/list
1, 페스티벌, EDCKOREA, 서울랜드, 2019-08-30 ~ 2019-09-01, 00, 만 19세 이상, 이 공연은~
2, 페스티벌, EDCKOREA, 서울랜드, 2019-08-30 ~ 2019-09-01, 00, 만 19세 이상, 이 공연은~


```
