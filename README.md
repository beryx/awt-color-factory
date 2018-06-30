[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/beryx/awt-color-factory/blob/master/LICENSE)
[![Build Status](https://img.shields.io/travis/beryx/awt-color-factory/master.svg?label=Build)](https://travis-ci.org/beryx/awt-color-factory)

# AWT Color Factory

A utility class that offers static methods for creating java.awt.Color instances from string representations.
These methods are the counterpart of methods available in javafx.scene.paint.Color, such as
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
    