/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

package overrungl.demo.glfw;

import overrun.marshal.Unmarshal;
import overrungl.demo.util.IOUtil;
import overrungl.glfw.GLFW;
import overrungl.glfw.GLFWCallbacks;
import overrungl.glfw.GLFWErrorCallback;
import overrungl.glfw.GLFWImage;
import overrungl.opengl.GL;
import overrungl.opengl.GLLoader;
import overrungl.stb.STBImage;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Objects;

import static java.lang.foreign.ValueLayout.JAVA_INT;

/**
 * Tests GLFW window icon and STB image
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFWWindowIconTest {
    private final GLFW glfw = GLFW.INSTANCE;
    private MemorySegment window;
    private GL gl;

    public void run() {
        try (var arena = Arena.ofShared()) {
            init(arena);
            load();
        }
        loop();

        GLFWCallbacks.free(window);
        glfw.destroyWindow(window);

        glfw.terminate();
        glfw.setErrorCallback(null);
    }

    private void init(Arena arena) {
        GLFWErrorCallback.createPrint().set();
        if (!glfw.init()) throw new IllegalStateException("Unable to initialize GLFW");
        glfw.defaultWindowHints();
        glfw.windowHint(GLFW.VISIBLE, false);
        glfw.windowHint(GLFW.RESIZABLE, true);
        window = glfw.createWindow(300, 300, "Hello World!", MemorySegment.NULL, MemorySegment.NULL);
        if (Unmarshal.isNullPointer(window)) throw new IllegalStateException("Failed to create the GLFW window");

        try {
            final STBImage stbImage = STBImage.INSTANCE;
            var px = arena.allocate(JAVA_INT);
            var py = arena.allocate(JAVA_INT);
            var pc = arena.allocate(JAVA_INT);
            var data = stbImage.loadFromMemory(
                IOUtil.ioResourceToSegment(arena, "image.png"),
                px, py, pc, STBImage.RGB_ALPHA
            );
            final GLFWImage image = new GLFWImage(arena);
            GLFWImage.width.set(image, px.get(JAVA_INT, 0));
            GLFWImage.height.set(image, py.get(JAVA_INT, 0));
            GLFWImage.pixels.set(image, data);
            glfw.setWindowIcon(window, image);
            stbImage.free(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        glfw.setKeyCallback(window, (_, key, _, action, _) -> {
            if (key == GLFW.KEY_ESCAPE && action == GLFW.RELEASE) {
                glfw.setWindowShouldClose(window, true);
            }
        });
        glfw.setFramebufferSizeCallback(window, (_, width, height) ->
            gl.viewport(0, 0, width, height));
        var vidMode = glfw.getVideoMode(glfw.getPrimaryMonitor());
        if (vidMode != null) {
            var size = glfw.getWindowSize(window);
            glfw.setWindowPos(
                window,
                (vidMode.width() - size.x()) / 2,
                (vidMode.height() - size.y()) / 2
            );
        }

        glfw.makeContextCurrent(window);
        glfw.swapInterval(1);

        glfw.showWindow(window);
    }

    private void load() {
        gl = Objects.requireNonNull(GLLoader.load(GLLoader.loadFlags(glfw::getProcAddress)), "Failed to load OpenGL");

        gl.clearColor(0.4f, 0.6f, 0.9f, 1.0f);
    }

    private void loop() {
        while (!glfw.windowShouldClose(window)) {
            gl.clear(GL.COLOR_BUFFER_BIT | GL.DEPTH_BUFFER_BIT);

            glfw.swapBuffers(window);

            glfw.pollEvents();
        }
    }

    public static void main(String[] args) {
        new GLFWWindowIconTest().run();
    }
}
