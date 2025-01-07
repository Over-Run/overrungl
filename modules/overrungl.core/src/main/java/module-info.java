/*
 * MIT License
 *
 * Copyright (c) 2023-2025 Overrun Organization
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
 * The core module of OverrunGL.
 *
 * @author squid233
 * @since 0.1.0
 */
module overrungl.core {
    exports overrungl;
    exports overrungl.annotation;
    exports overrungl.struct;
    exports overrungl.upcall;
    exports overrungl.util;
    exports overrungl.internal
        to overrungl.glfw,
        overrungl.nfd,
        overrungl.openal,
        overrungl.opengl,
        overrungl.stb,
        overrungl.vulkan;

    requires transitive io.github.overrun.platform;
    requires static org.jetbrains.annotations;
}
