<img src="/app/src/main/ic_launcher-web.png" width="156" align="left"/>

# Android Scabbard

[![JCenter][J-CENTER-SVG]][J-CENTER]
[![Maven Central][MAVEN-SVG]][MAVEN]
[![Travis][TRAVIS-CI-SVG]][TRAVIS-CI]

___

A set of base dagger classes(@Scopes, @Modules...) for common android components(Activities, Fragments...).

#### Index

**Annotations**
- _`TYPE`Scoped_: Scopes based on its `TYPE`.
- _`TYPE`Qualified_: Qualifies based on its `TYPE`.

**Core**
- _Is`TYPE`Module<? extends `TYPE`>_: Binds the base `TYPE` instance.
- _Has`TYPE`Module_: Uses the base instance to provide a set of `TYPE` specific objects.

`TYPE = Application || Activity || Fragment`


## Usage
**Simple**
```java
  @Module public interface SomeActivityModule extends IsActivityModule<SomeActivity> {
    @ActivityScoped @ActivityQualified @Provides static String provideActivityTag(Activity activity) {
      return activity.getClass().getSimpleName();
    }
  }
```

**Full**
```java
  @Module(includes = HasActivityModule.class) public interface SomeActivityModule extends IsActivityModule<SomeActivity> {
      @ActivityScoped @ActivityQualified @Provides static String provideActivityTag(@ActivityQualified Class<?> activityClass) {
        return activityClass.getSimpleName();
      }
  }
```


## Download
Download jar from the GitHub [releases page][RELEASES].


### Gradle
```groovy
  repositories {
    jcenter()
    // or
    mavenCentral()
  }
 
  dependencies {
    implementation "com.github.jonathanmerritt.androidscabbard:annotations:${NEWEST_VERSION}"
    implementation "com.github.jonathanmerritt.androidscabbard:annotations-support:${NEWEST_VERSION}"
       
    implementation "com.github.jonathanmerritt.androidscabbard:core:${NEWEST_VERSION}"
    implementation "com.github.jonathanmerritt.androidscabbard:core-support:${NEWEST_VERSION}"
  }
```


### Maven
```xml
<dependencies>
 <dependency>
   <groupId>com.github.jonathanmerritt.androidscabbard</groupId>
   <artifactId>annotations</artifactId>
   <version>NEWEST_VERSION</version>
   <type>pom</type>
 </dependency>
 
 <dependency>
   <groupId>com.github.jonathanmerritt.androidscabbard</groupId>
   <artifactId>annotations-support</artifactId>
   <version>NEWEST_VERSION</version>
   <type>pom</type>
 </dependency>
  
 <dependency>
   <groupId>com.github.jonathanmerritt.androidscabbard</groupId>
   <artifactId>core</artifactId>
   <version>NEWEST_VERSION</version>
   <type>pom</type>
 </dependency>
   
 <dependency>
   <groupId>com.github.jonathanmerritt.androidscabbard</groupId>
   <artifactId>core-support</artifactId>
   <version>NEWEST_VERSION</version>
   <type>pom</type>
 </dependency>
</dependencies>
```


## License
>[Apache-2.0][LICENSE]

    Copyright 2018 Jonathan Merritt 11R00TT00R11@GMAIL.COM
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

[J-CENTER-SVG]:https://api.bintray.com/packages/jonathanmerritt/AndroidScabbard/annotations/images/download.svg
[J-CENTER]:https://api.bintray.com/packages/jonathanmerritt/AndroidScabbard/annotations/
[MAVEN-SVG]: https://maven-badges.herokuapp.com/maven-central/com.github.jonathanmerritt.androidscabbard/annotations/badge.svg
[MAVEN]: https://maven-badges.herokuapp.com/maven-central/com.github.jonathanmerritt.androidscabbard/annotations/
[TRAVIS-CI-SVG]: https://travis-ci.org/JonathanMerritt/AndroidScabbard.svg?branch=master
[TRAVIS-CI]: https://travis-ci.org/JonathanMerritt/AndroidScabbard
[RELEASES]: https://github.com/JonathanMerritt/AndroidScabbard/releases
[LICENSE]: https://github.com/JonathanMerritt/AndroidScabbard/blob/master/LICENSE.txt
