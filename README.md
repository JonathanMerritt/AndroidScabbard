<img src="https://raw.githubusercontent.com/JonathanMerritt/AndroidScabbard/master/app/src/main/ic_launcher-web.png" width="156" align="left"/>

# Android Scabbard
[![JCenter][J-CENTER-SVG]][J-CENTER]
[![Maven Central][MAVEN-SVG]][MAVEN]
[![Travis][TRAVIS-CI-SVG]][TRAVIS-CI]


**A set of base dagger classes for common android components.**

#
The main reason for creating the library, was to avoid having to copy over the same base dagger classes for
every new project.

I intended for it to be just the `annotations` library, which contains `@Scope`'s and `@Qualifier`'s, however
I decided to add the `core` library, which contains `@Module`'s. 

Each one has a `-support` library equivalent, to 'somewhat' match daggers' structure.

_Any help or contribution is welcome._

## Download
#### Gradle
```groovy
  repositories {
    jcenter()
    //OR
    mavenCentral()
  }
 
  dependencies {
    implementation "com.github.jonathanmerritt.androidscabbard:annotations OR* core:x.y.z"    
    //AND OR**
    implementation "com.github.jonathanmerritt.androidscabbard:annotations-support OR* core-support:x.y.z"
  }
```

#### Maven
```xml
<dependencies>
 <dependency>
   <groupId>com.github.jonathanmerritt.androidscabbard</groupId>
   <artifactId>annotations OR* core</artifactId>
   <!--AND OR**-->
   <artifactId>annotations-support OR* core-support</artifactId>
   <version>x.y.z</version>
   <type>pom</type>
 </dependency>
</dependencies>
```

*`core` libraries will include their equivalent `annotations` library automatically.

**`-support` variants will NOT include their equivalents.


## Usage
This small example simply `Provides` an `ActivityScoped ActivityQualified String`.

_Check the sample apps for more detailed examples._
 
#### Annotations
```java
  @Module public interface SomeActivityModule {
    @ActivityScoped @ActivityQualified @Provides static String provideActivityTag(SomeActivity someActivity) {
      return activity.getClass().getSimpleName();
    }
  }
```

#### Core
```java
  @Module(includes = HasActivityModule.class) public interface SomeActivityModule extends IsActivityModule<SomeActivity> {
      @ActivityScoped @ActivityQualified @Provides static String provideActivityTag(@ActivityQualified Class<?> activityClass) {
        return activityClass.getSimpleName();
      }
  }
```

## TODO
- Improve sample apps.
- Add overview of classes to README.
- Quadruple check stuff.
- Bump to 1.0.0.
- ...

## License
[Apache-2.0][LICENSE]

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
