## 프로젝트 소개

자취생에게 초점을 맞춘 요리앱 자취생 냉장고는 사용자가 가지고 있는 재료를 개인 냉장고에 등록하여 모바일로 관리하고, 그 재료를 통해 어떤 음식을 만들 수 있는지 알려주는 애플리케이션입니다.  

<img src="https://user-images.githubusercontent.com/92300124/195007568-ddcb588f-cc75-4995-86e2-44d07c963a61.gif" width="640" height="320"/>


## 개발기간

2022년 9월 7일 ~ 2022년 10월 12일

## 참여 인원

백엔드 2인 / 프론트엔드 2인

### 배포주소

[https://www.seb39myfridge.ml/](https://www.seb39myfridge.ml/)


## 기능

- 나만의 레시피를 작성하고 다른 유저의 레시피에 좋아요와 댓글을 남길 수 있습니다.
- 레시피 제목과 재료 태그로 원하는 레시피를 검색 할 수 있습니다
- 내 냉장고에 있는 재료를 기록하고 해당 재료의 유통기한을 관리 할 수 있습니다.


## 기술스택 (백엔드)

 Spring Boot  
 Java 11  
 MySql  
 JPA  
 Querydsl  
 Spring Security  
 AWS - EC2, S3, RDS  
 Redis  

## ERD
 <img width="1200" alt="DB Table" src="https://user-images.githubusercontent.com/41468526/205584499-7a4328c9-cfba-4b94-892f-4998b0b4915e.png">


## API 문서  
   https://api.seb39myfridge.ml/docs/docs.html  

  
## 문제해결 정리

* AuthenticationPrincipal의 expression을 사용하여 Controller의 중복코드를 제거한 경험을 정리하였습니다.  
  https://velog.io/@skrek269/Spring-Security-AuthenticationPrincipal-expression  
  

* 한 클래스에 @Builder를 여러개 적용하여 객체를 구분하여 생성한 경험을 정리했습니다.
  https://velog.io/@skrek269/Lombok-Builder




