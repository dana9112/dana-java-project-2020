# 17 - 다형성과 형변환 응용

## 학습 목표

- 다형적 변수를 활용하여 다양한 타입의 데이터를 다룰 수 있다.
- 형변환을 이해하고 다룰 수 있다.

## 실습 소스 및 결과

- src/main/java/dana/djp/ticketsite/handler/InformationList.java 삭제
- src/main/java/dana/djp/ticketsite/handler/MemberList.java 삭제
- src/main/java/dana/djp/ticketsite/handler/ReviewList.java 삭제
- src/main/java/dana/djp/ticketsite/handler/ArrayList.java 추가
- src/main/java/dana/djp/ticketsite/handler/InformationHandler.java 변경
- src/main/java/dana/djp/ticketsite/handler/MemberHandler.java 변경
- src/main/java/dana/djp/ticketsite/handler/ReviewHandler.java 변경

## 실습

### 작업1) Lesson, Member, Board를 모두 다룰 수 있는 List 클래스를 만들라.

- ArrayList.java
    - InformationHandler, MemberList, ReviewList 클래스를 합쳐 한 클래스로 만든다.
- LessonHandler.java
    - `ArrayList` 클래스를 사용하여 데이터를 처리한다.
- MemberHandler.java
    - `ArrayList` 클래스를 사용하여 데이터를 처리한다.
- BoardHandler.java
    - `ArrayList` 클래스를 사용하여 데이터를 처리한다.
