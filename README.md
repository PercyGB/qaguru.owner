### How to run with terminal commands
For web config local mode
```bash
./gradlew clean test --tests WebConfigTests -Dconf=local
```
For web config remote
```bash
./gradle clean test --tests WebConfigTests -Dconf=remote
```

For api config using system properties
```bash
./gradlew clean test --tests ApiConfigTests -DbaseUrl=https://mail.com -Dtoken=123 
```
For api config using file
```bash
./gradlew clean test --tests ApiConfigTests
```
