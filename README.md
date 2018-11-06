# openjdk11-openjfx11
Demo App for an OpenJDK11 and OpenJFX11 Project

### Dependencies
* [Gradle](https://docs.gradle.org)
* [OpenJDK 11](https://openjdk.java.net/install/)
* [OpenJFX 11](https://wiki.openjdk.java.net/display/OpenJFX/Main)

### Initial Repo Setup



### Development Environment Setup

#### Mac OSX Setup mostly taken from [here](https://solarianprogrammer.com/2018/09/28/installing-openjdk-macos/)

1) Download OpenJDK 11 and unzip the project then copy to location where other JDK's exist

```
tar xf openjdk-11+28_osx-x64_bin.tar.gz
sudo mv jdk-11.jdk /Library/Java/JavaVirtualMachines/
```

2) Update your .bash_profile to easily work with different JDK version from command line

- Add this to the bottom of your .bash_profile above the final export of PATH. Adjust accordingly based off your installs of JDKs

```
export JAVA_8_HOME=$(/usr/libexec/java_home -v1.8)
export JAVA_10_HOME=$(/usr/libexec/java_home -v10)
export JAVA_11_HOME=$(/usr/libexec/java_home -v11)

alias java8='export PATH=$(echo "${PATH//$JAVA_HOME/$JAVA_8_HOME}") && export JAVA_HOME=$JAVA_8_HOME'
alias java10='export PATH=$(echo "${PATH//$JAVA_HOME/$JAVA_10_HOME}") && export JAVA_HOME=$JAVA_10_HOME'
alias java11='export PATH=$(echo "${PATH//$JAVA_HOME/$JAVA_11_HOME}") && export JAVA_HOME=$JAVA_11_HOME'

if [ -z ${JAVA_HOME+x} ];  then
  # JAVA_HOME is not set
  export JAVA_HOME=$JAVA_10_HOME
  java10
  echo "JAVA_HOME is $JAVA_HOME"
else
  # JAVA_HOME is set and needs removed before updating
  PATH=$(echo "${PATH//$JAVA_HOME//g}")
  export JAVA_HOME=$JAVA_10_HOME
  echo "JAVA_HOME is $JAVA_HOME"
fi

export PATH="$JAVA_HOME/bin:$PATH"
```

- you can now easily switch between java versions at the command line like so.

after inital source of .bash_profile I should have JDK10

```
$source ~/.bash_profile
$java --version
java 10.0.1 2018-04-17
Java(TM) SE Runtime Environment 18.3 (build 10.0.1+10)
Java HotSpot(TM) 64-Bit Server VM 18.3 (build 10.0.1+10, mixed mode)
```

switching to OpenJDK11

```
$java11
$java --version
openjdk 11.0.1 2018-10-16
OpenJDK Runtime Environment 18.9 (build 11.0.1+13)
OpenJDK 64-Bit Server VM 18.9 (build 11.0.1+13, mixed mode)
```

3) Load project in eclipse

- New > Java Project
- Name it whatever
- Select the location of the project root (ie, where the build.gradle file lives)
- Convert project to Gradle project view in eclipse: Right Click Project > Configure > Gradle nature

### Running Gradle Project

To run

```
./gradlew run
```
