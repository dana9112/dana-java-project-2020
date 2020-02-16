# 16 - UI 코드와 데이터 처리 코드를 분리하기

## 학습 목표

- 캡슐화 기법을 이용하여 데이터 처리 코드를 별개의 클래스로 분리할 수 있다.
- 배열 복제를 통해 배열의 크기를 늘릴 수 있다.
- 역할에 따라 클래스를 분리하는 방법과 이점을 이해한다.  

## 실습 소스 및 결과

- src/main/java/dana/djp/ticketsite/handler/InformationList.java 추가
- src/main/java/dana/djp/ticketsite/handler/MemberList.java 추가
- src/main/java/dana/djp/ticketsite/handler/ReviewList.java 추가
- src/main/java/dana/djp/ticketsite/handler/InformationHandler.java 변경
- src/main/java/dana/djp/ticketsite/handler/MemberHandler.java 변경
- src/main/java/dana/djp/ticketsite/handler/ReviewHandler.java 변경

## 실습

### 작업1) InformationHandler에서 데이터 처리 코드를 분리하라.

- InformationList.java
    - `InformationHandler`에서 데이터 처리 코드를 이 클래스로 옮긴다.
    - 공연정보 데이터 배열을 리턴하는 toArray() 메서드를 정의한다.
    - 공연정보 데이터를 저장하는 add() 메서드를 정의한다.
    - 기본 생성자와 배열의 초기 크기를 설정하는 생성자를 정의한다.  
- InformationHandler.java
    - `InformationList` 클래스를 사용하여 데이터를 처리한다.

### 작업2) MemberHandler에서 데이터 처리 코드를 분리하라.

- MemberList.java
    - `MemberHandler`에서 데이터 처리 코드를 이 클래스로 옮긴다.
    - 회원 데이터 배열을 리턴하는 toArray() 메서드를 정의한다.
    - 회원 데이터를 저장하는 add() 메서드를 정의한다.
    - 기본 생성자와 배열의 초기 크기를 설정하는 생성자를 정의한다.  
- MemberHandler.java
    - `MemberList` 클래스를 사용하여 데이터를 처리한다.

### 작업3) ReviewHandler에서 데이터 처리 코드를 분리하라.

- ReviewList.java
    - `ReviewHandler`에서 데이터 처리 코드를 이 클래스로 옮긴다.
    - 게시물 데이터 배열을 리턴하는 toArray() 메서드를 정의한다.
    - 게시물 데이터를 저장하는 add() 메서드를 정의한다.
    - 기본 생성자와 배열의 초기 크기를 설정하는 생성자를 정의한다.  
- ReviewHandler.java
    - `ReviewList` 클래스를 사용하여 데이터를 처리한다.
