# 🌱 Spring Boot Study Log

> **인프런 김영한 님의 [스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술] 강의 학습 기록입니다.** 
스프링 부트의 기초부터 웹 MVC, DB 접근 기술(JPA, Spring Data JPA)까지 전반적인 흐름을 학습하고 실습한 코드를 저장합니다.

<br/>

## 🛠 Tech Stack

<div align=center> 
  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> 
  <img src="https://img.shields.io/badge/spring boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"> 
  <img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white">
  <br>
  <img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white"> 
  <img src="https://img.shields.io/badge/thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white"> 
  <img src="https://img.shields.io/badge/h2-003B57?style=for-the-badge&logo=h2&logoColor=white"> 
</div>

<br/>

## 📝 Curriculum & Progress

강의 커리큘럼에 따른 학습 진행 상황입니다.

- [x] **프로젝트 환경 설정**
  - 라이브러리 살펴보기
  - View 환경 설정
- [x] **스프링 웹 개발 기초**
  - 정적 컨텐츠
  - MVC와 템플릿 엔진
  - API
- [x] **회원 관리 예제 - 백엔드 개발**
  - 비즈니스 요구사항 정리
  - 회원 도메인과 리포지토리 만들기
  - 리포지토리 테스트 케이스 작성 (JUnit)
- [x] **스프링 빈과 의존관계**
  - 컴포넌트 스캔과 자동 의존관계 설정
  - 자바 코드로 직접 스프링 빈 등록하기
- [x] **회원 관리 예제 - 웹 MVC 개발**
  - 회원 웹 기능 (등록, 조회)
- [ ] **스프링 DB 접근 기술**
  - H2 데이터베이스 설치
  - 순수 JDBC
  - 스프링 JdbcTemplate
  - JPA
  - 스프링 데이터 JPA
- [ ] **AOP**
  - AOP가 필요한 상황
  - AOP 적용

<br/>

## 💡 Key Learnings

### 1. 스프링 웹 개발 방식 3가지
* **정적 컨텐츠**: 파일을 그대로 웹 브라우저에 내려주는 방식
* **MVC와 템플릿 엔진**: 서버에서 HTML을 동적으로 바꿔서 내려주는 방식 (Model, View, Controller)
* **API**: JSON 데이터 포맷으로 클라이언트에게 데이터를 전달하는 방식 (`@ResponseBody`)

### 2. 테스트 코드 (JUnit)
* `@AfterEach`: 각 테스트가 종료될 때마다 실행. 메모리 DB에 저장된 데이터를 삭제할 때 사용.
* **TDD(테스트 주도 개발)** 의 중요성과 테스트 케이스 작성 요령 학습.

### 3. 스프링 빈 등록 (DI)
* **컴포넌트 스캔**: `@Controller`, `@Service`, `@Repository` 애노테이션을 이용한 자동 등록.
* **자바 코드 설정**: `@Configuration`, `@Bean`을 이용해 직접 설정 파일에 등록.


<br/>

## 커밋 컨벤션 규칙
- `Docs:` 학습 내용 업데이트
- `Feat:` 새로운 실습 코드 추가
- `Test:` 테스트 코드 작성
- `Refactor:` 코드 유지보수

<br/>

## 📂 Project Structure

```bash
src
├── main
│   ├── java
│   │   └── hello.hellospring
│   │       ├── controller  # 웹 계층 (Controller)
│   │       ├── domain      # 도메인 객체 (Member)
│   │       ├── repository  # DB 접근 계층 (Repository Interface/Impl)
│   │       └── service     # 핵심 비즈니스 로직 (MemberService)
│   └── resources
│       ├── static          # 정적 파일 (HTML, CSS)
│       └── templates       # 템플릿 파일 (Thymeleaf)
└── test                    # 테스트 코드

