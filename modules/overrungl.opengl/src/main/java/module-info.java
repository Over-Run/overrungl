/*
 * MIT License
 *
 * Copyright (c) 2023-2024 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

/**
 * The OpenGL binding.
 *
 * @author squid233
 * @since 0.1.0
 */
module overrungl.opengl {
    exports overrungl.opengl;
    exports overrungl.opengl.ext;
    exports overrungl.opengl.ext.amd;
    exports overrungl.opengl.ext.apple;
    exports overrungl.opengl.ext.arb;
    exports overrungl.opengl.ext.ati;
    exports overrungl.opengl.ext.ext;
    exports overrungl.opengl.ext.ibm;
    exports overrungl.opengl.ext.intel;
    exports overrungl.opengl.ext.khr;
    exports overrungl.opengl.ext.mesa;
    exports overrungl.opengl.ext.nv;
    exports overrungl.opengl.ext.oes;
    exports overrungl.opengl.ext.sgi;
    exports overrungl.opengl.ext.sun;

    requires transitive overrungl.core;
    requires static org.jetbrains.annotations;
    requires io.github.overrun.memstack;
    requires io.github.overrun.marshal; //TODO remove this
}
