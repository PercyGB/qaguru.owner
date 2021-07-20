### How to run from Terminal
For web config local mode
```bash
./gradlew clean test --tests WebConfigTests -Dconf=local
```
For web config remote mode
```bash
./gradlew clean test --tests WebConfigTests -Dconf=remote
```

For api config using system properties
```bash
./gradlew clean test --tests ApiConfigTests -DbaseUrl=https://mail.com -Dtoken=123 
```
For api config using file
```bash
./gradlew clean test --tests ApiConfigTests
```
