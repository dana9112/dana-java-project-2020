# 15 - 인스턴스 연산자와 메서드

## 학습 목표

- 메서드를 활용하여 인스턴스 값을 다루는 연산자를 정의할 수 있다.
- 캡슐화의 의미를 이해하고, 셋터/겟터를 만들 수 있다.

## 실습 소스 및 결과

- src/main/java/dana/djp/ticketsite/domain/Information.java 변경
- src/main/java/dana/djp/ticketsite/domain/Member.java 변경
- src/main/java/dana/djp/ticketsite/domain/Review.java 변경
- src/main/java/dana/djp/ticketsite/handler/InformationHandler.java 변경
- src/main/java/dana/djp/ticketsite/handler/MemberHandler.java 변경
- src/main/java/dana/djp/ticketsite/handler/ReviewHandler.java 변경

## 실습

### 작업1) Information 인스턴스의 값을 다룰 연산자를 정의하라.

- Information.java
    - 인스턴스 변수(필드)를 비공개(private)로 전환한다.
    - 값을 설정하고 리턴해주는 세터/게터를 정의한다.
- InformationHandler.java
    - Information 인스턴스에 값을 넣고 꺼낼 때 세터/겟터를 사용한다.

### 작업2) Member 인스턴스의 값을 다룰 연산자를 정의하라.

- Member.java
    - 인스턴스 변수(필드)를 비공개(private)로 전환한다.
    - 값을 설정하고 리턴해주는 세터/게터를 정의한다.
- MemberHandler.java
    - Member 인스턴스에 값을 넣고 꺼낼 때 세터/겟터를 사용한다.

### 작업3) Review 인스턴스의 값을 다룰 연산자를 정의하라.

- Review.java
    - 인스턴스 변수(필드)를 비공개(private)로 전환한다.
    - 값을 설정하고 리턴해주는 세터/게터를 정의한다.
- ReviewHandler.java
    - Review 인스턴스에 값을 넣고 꺼낼 때 세터/겟터를 사용한다.
