[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
[![License](https://img.shields.io/badge/License-GPL%202%20with%20Classpath%20exception-blue.svg)](https://github.com/beryx/awt-color-factory/blob/master/LICENSE#L347-L357)
[![Build Status](https://img.shields.io/travis/beryx/awt-color-factory/master.svg?label=Build)](https://travis-ci.org/beryx/awt-color-factory)
[![Javadocs](http://www.javadoc.io/badge/org.beryx/awt-color-factory.png?color=red)](http://www.javadoc.io/doc/org.beryx/awt-color-factory)

# AWT Color Factory


### :bulb: _You can use this library regardless of the license under which your software is distributed._

In JavaFX you can easily create a javafx.scene.paint.Color object from a string representation such as
"lightblue", "#aa38e0", or "0x40A8CC" by using
[Color.web(String colorString)](https://docs.oracle.com/javase/10/docs/api/javafx/scene/paint/Color.html#web(java.lang.String)),
[Color.web(String colorString, double opacity)](https://docs.oracle.com/javase/10/docs/api/javafx/scene/paint/Color.html#web(java.lang.String,double)),
or [Color.valueOf(String value)](https://docs.oracle.com/javase/10/docs/api/javafx/scene/paint/Color.html#valueOf(java.lang.String)).

This one-class project provides equivalent methods for creating java.awt.Color objects.

### Example usage

    Color c1 = ColorFactory.valueOf("firebrick");
    Color c2 = ColorFactory.valueOf("#aa38e0");
    Color c3 = ColorFactory.valueOf("0x40A8CC");
    Color c4 = ColorFactory.valueOf("rgba(112,36,228,0.9)");
    Color c5 = ColorFactory.web("forestgreen", 0.7);
    Color c6 = ColorFactory.web("hsl(270,90%,70%)", 0.8);

See the [javadoc](https://static.javadoc.io/org.beryx/awt-color-factory/1.0.1/org/beryx/awt/color/ColorFactory.html)
for more details.

Why should you use this library? Can't you just call the JavaFX methods and convert the returned javafx.scene.paint.Color into a java.awt.Color?
Of course you can. But you may find this little library useful if you don't want your code to depend on JavaFX.
And remember, starting with JDK 11, JavaFX is no longer part of the JDK.



_AWT Color Factory_ is available in JCenter and Maven Central.

**Maven**

    <dependency>
        <groupId>org.beryx</groupId>
        <artifactId>awt-color-factory</artifactId>
        <version>1.0.1</version>
    </dependency>

**Gradle**

    compile 'org.beryx:awt-color-factory:1.0.1'


_AWT Color Factory_ contains code that is almost identical to that found in javafx.scene.paint.Color,
therefore the library is distributed under the same license as OpenJFX: the [GPL 2 with Classpath exception](http://openjdk.java.net/legal/gplv2+ce.html).
**The _Classpath exception_ clause gives you permission to include this library in your executable code,
regardless of the license under which your software is distributed.**

This library requires Java 7 or newer.
The jar artifact is modularized under the name [org.beryx.awt.color](https://github.com/beryx/awt-color-factory/raw/master/src/main/java/module-info.java).
