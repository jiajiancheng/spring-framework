ide和gradle兼容性不太好，需要用命令行编译

gradlew build -x test

File -> Invalidate Caches / Restart

gradlew -a :spring-webmvc:test
gradlew -a :jjc-web-test:test