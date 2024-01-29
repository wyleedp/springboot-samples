# springboot-samples
스프링부트 웹프로젝트 예제

### 스펙
* JAVA 17
* SpringBoot 3.2.2
* Maven 3.9.6
* MyBatis 3.5.14

### 기능
* SpringBoot 이용한 게시판 목록조회

### 빌드 및 실행
JAVA_HOME 설정이 JDK 17로 되어 있는 경우

```shell
git clone https://github.com/wyleedp/springboot-samples.git
cd springboot-samples
mvnw clean package
java -jar target\springboot-samples-0.0.1-SNAPSHOT.war
```

JAVA_HOME 설정이 JDK 17 미만으로 되어 있는 경우 JDK 17 설치필요
  * 예) set JAVA_HOME=D:\Develop\JDK\jdk-17.0.2

```shell
git clone https://github.com/wyleedp/springboot-runner.git
cd springboot-runner
set JAVA_HOME=<JDK17 HOME 경로>
mvnw clean package
"%JAVA_HOME%"\bin\java -jar target\springboot-runner-0.0.1.war
```
