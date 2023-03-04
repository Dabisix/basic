# 사용할 base 이미지
FROM openjdk:8-jdk-alpine

# 작업 디렉토리를 지정
WORKDIR /app

# 호스트에서 빌드된 jar 파일을 도커 이미지로 복사
COPY build/libs/*.jar app.jar

# 애플리케이션 실행을 위한 커맨드를 정의
ENTRYPOINT ["java", "-jar", "app.jar"]
