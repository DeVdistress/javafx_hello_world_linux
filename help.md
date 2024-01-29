# javaFx

## offical doc
[Getting Started with JavaFX](https://openjfx.io/openjfx-docs/#install-java)

## other
[How to Add JavaFX to an IntelliJ Project](https://javabook.bloomu.edu/setupjavafx.html)

## youtube
1. [How To Deploy Executable JavaFX 18 JAR File Using IntelliJ 2021.3.3 on Windows 11 x64](https://www.youtube.com/watch?v=YPuKgSlLWPo)
2. [JavaFX install & setup (IntelliJ)](https://www.youtube.com/watch?v=Ope4icw6bVk)
3. [Уроки Java / Как создать первое приложение на JavaFX](https://www.youtube.com/watch?v=Qk9JYTCJjRo)

## troubleshooting
### youtube
[Error: JavaFX runtime components are missing](https://www.youtube.com/watch?v=7c30N9MFJcQ)

# how create bin/exe file from bytecode or jar

## java rush
[Java-программы исполняемый EXE-файл для запуска в операционной системе Windows](https://javarush.com/groups/posts/3910-kofe-breyk-148-kak-prevratitjh-ljubuju-java-programmu-v-avtonomnihy-exe-fayl)

## native-image
[Build a Native Executable from a JAR File](https://www.graalvm.org/latest/reference-manual/native-image/guides/build-native-executable-from-jar/)
[Configure Native Image with the Tracing Agent](https://www.graalvm.org/dev/reference-manual/native-image/guides/configure-with-tracing-agent/)
[Reflection in Native Image](https://www.graalvm.org/dev/reference-manual/native-image/dynamic-features/Reflection/)
[Collect Metadata with the Tracing Agent](https://www.graalvm.org/dev/reference-manual/native-image/metadata/AutomaticMetadataCollection/)

### Oracle GraalVM

#### Configuring GraalVM environment variable
1. Edit global environment file
sudo vim /etc/environment
2. Copy the following line at the end of the file
export GRAALVM_HOME=$HOME/.sdkman/candidates/java/19.2.1-grl/
3. Reload the environment variable for the current shell
source /etc/environment
4. Install the native-image tool using gu install:
${GRAALVM_HOME}/bin/gu install native-image

[Setting up GraalVM with native-image support](https://graalvm.github.io/native-build-tools/0.9.6/graalvm-setup.html)
[downloads](https://www.oracle.com/downloads/graalvm-downloads.html)
[downloads-ex](https://www.oracle.com/java/technologies/downloads/)
[Installation on Linux Platforms](https://docs.oracle.com/en/graalvm/jdk/17/docs/getting-started/installation-linux/)
```bash
# build cfg from jar
/opt/graalvm-jdk-17.0.10+11.1/bin/java -agentlib:native-image-agent=config-output-dir=META-INF/native-image -jar demo.jar
# build bin file
native-image -jar demo.jar
```
### plugins
[GluonFX plugin for Gradle](https://github.com/gluonhq/gluonfx-gradle-plugin)
[GluonFX plugin for Maven](https://github.com/gluonhq/gluonfx-maven-plugin)

#### troubleshooting
[Can't generate Graal VM native-image with --no-fallback from executable javafx fat jar](https://stackoverflow.com/questions/73052217/cant-generate-graal-vm-native-image-with-no-fallback-from-executable-javafx-f)