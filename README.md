[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
[![License](https://img.shields.io/badge/License-GPL%202%20with%20Classpath%20exception-blue.svg)](https://github.com/beryx/awt-color-factory/blob/master/LICENSE)
[![Build Status](https://img.shields.io/travis/beryx/awt-color-factory/master.svg?label=Build)](https://travis-ci.org/beryx/awt-color-factory)

# AWT Color Factory

A utility class that offers static methods for creating java.awt.Color instances from string representations.
These methods are the counterpart of static methods available in javafx.scene.paint.Color, such as
- valueOf(String value)
- web(String colorString)
- web(String colorString, double opacity)

### Example usage

    Color c1 = ColorFactory.valueOf("firebrick");
    Color c2 = ColorFactory.valueOf("#aa38e0");
    Color c3 = ColorFactory.valueOf("0x40A8CC");
    Color c4 = ColorFactory.valueOf("rgba(112,36,228,0.9)");
    Color c5 = ColorFactory.web("forestgreen", 0.7);
    Color c6 = ColorFactory.web("hsl(270,90%,70%)", 0.8);


_AWT Color Factory_ is available in JCenter and Maven Central.

**Maven**

    <dependency>
        <groupId>org.beryx</groupId>
        <artifactId>awt-color-factory</artifactId>
        <version>1.0.0</version>
    </dependency>

**Gradle**

    compile 'org.beryx:awt-color-factory:1.0.0'


_AWT Color Factory_ contains code that is almost identical to that found in javafx.scene.paint.Color,
therefore the library is distributed under the same license as OpenJFX: the [GPL 2 with Classpath exception](http://openjdk.java.net/legal/gplv2+ce.html).
The _Classpath exception_ clause gives you permission to include this library in your executable code, 
regardless of the license under which your software is distributed.
