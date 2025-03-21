# r_rags_web_server
Web Server for RADIUS Random Account Generation System
12자 문자열 2개를 생성하여 RADIUS DB에 저장하고 사용자에게 보여줍니다.
R-RAGS(RADIUS Random Account Generation System, RADIUS 랜덤 계정 생성 시스템) 개발에 관한 논문을 작성하는 과정에서 개발된 웹 서버 소프트웨어입니다.
스프링 부트(Java) 기반으로 개발되었습니다.

Spring Boot 기반으로 개발된 소프트웨어입니다.

# 사용된 오픈소스 라이선스

## Spring Data JPA
- org.springframework.boot:spring-boot-starter-data-jpa
- https://spring.io/projects/spring-data-jpa
- https://github.com/spring-projects/spring-data-jpa
- Apache License 2.0 [링크](https://github.com/spring-projects/spring-data-jpa/blob/main/LICENSE.txt)

## Thymeleaf
- org.springframework.boot:spring-boot-starter-thymeleaf
- https://www.thymeleaf.org/
- https://github.com/thymeleaf/thymeleaf-spring
- Apache License 2.0 [링크](https://github.com/thymeleaf/thymeleaf-spring/blob/3.1-master/LICENSE.txt)

## Spring Web
- org.springframework.boot:spring-boot-starter-web
- https://spring.io/projects/spring-boot
- https://github.com/spring-projects/spring-boot
- Apache License 2.0 [링크](https://github.com/spring-projects/spring-boot/blob/main/LICENSE.txt)

## MariaDB Driver
- org.mariadb.jdbc:mariadb-java-client
- https://mariadb.com/kb/en/about-mariadb-connector-j/
- https://github.com/mariadb-corporation/mariadb-connector-j
- GNU Lesser General Public License v2.1 [링크](https://github.com/mariadb-corporation/mariadb-connector-j/blob/master/LICENSE)

이 소프트웨어 개발에 사용된 위 라이브러리들은 build.gradle 파일의 dependencies에서 확인하실 수 있습니다.
