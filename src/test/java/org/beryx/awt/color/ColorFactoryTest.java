/*
 * Copyright (c) 2018 the original author or authors
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation. The authors designate this
 * particular file as subject to the "Classpath" exception as provided
 * by the authors in the LICENSE file that accompanied this code.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package org.beryx.awt.color;

import org.junit.jupiter.api.Test;

import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

public class ColorFactoryTest {
    @Test
    public void valueOfTest() {
        assertEquals(Color.red, ColorFactory.valueOf("red"));
        assertEquals(ColorFactory.FIREBRICK, ColorFactory.valueOf("firebrick"));
        assertEquals(new Color(170, 56, 224), ColorFactory.valueOf("#aa38e0"));
        assertEquals(new Color(64, 168, 204), ColorFactory.valueOf("0x40A8CC"));
        assertEquals(new Color(0, 255, 255, 100), ColorFactory.valueOf("00FFFF64"));
        assertEquals(new Color(0, 255, 255, 102), ColorFactory.valueOf("0FF6"));
        assertEquals(new Color(112, 36, 228, (int)(0.9 * 255 + 0.5)), ColorFactory.valueOf("rgba(112,36,228,0.9)"));
        assertEquals(new Color(128, 0, 255), ColorFactory.valueOf("hsla(270,100%,100%,1.0)"));
    }

    @Test
    public void webTest() {
        assertEquals(new Color(170, 56, 224, (int)(0.3 * 255 + 0.5)), ColorFactory.web("#aa38e0", 0.3));
        assertEquals(new Color(64, 168, 204, (int)(0.7 * 255 + 0.5)), ColorFactory.web("0x40A8CC", 0.7));
        assertEquals(new Color(34, 139, 34, (int)(0.6 * 255 + 0.5)), ColorFactory.web("forestgreen", 0.6));
        assertEquals(new Color(98, 18, 179, (int)(0.8 * 255 + 0.5)), ColorFactory.web("hsl(270,90%,70%)", 0.8));
        assertEquals(new Color(0, 255, 255, 100), ColorFactory.valueOf("00FFFF64"));
        assertEquals(new Color(0, 255, 255, 102), ColorFactory.valueOf("0FF6"));
    }
}
