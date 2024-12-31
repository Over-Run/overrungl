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

import overrungl.demo.util.IOUtil;
import overrungl.glfw.GLFW;
import overrungl.glfw.GLFWCallbacks;
import overrungl.glfw.GLFWErrorCallback;
import overrungl.glfw.GLFWImage;
import overrungl.opengl.GL;
import overrungl.opengl.GLLoader;
import overrungl.util.Unmarshal;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Objects;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static overrungl.glfw.GLFW.*;
import static overrungl.stb.STBImage.*;

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
        glfwDestroyWindow(window);

        glfwTerminate();
        glfwSetErrorCallback(MemorySegment.NULL);
    }

    private void init(Arena arena) {
        glfwSetErrorCallback(GLFWErrorCallback.createPrint());
        if (!glfwInit()) throw new IllegalStateException("Unable to initialize GLFW");
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        window = glfwCreateWindow(300, 300, "Hello World!", MemorySegment.NULL, MemorySegment.NULL);
        if (Unmarshal.isNullPointer(window)) throw new IllegalStateException("Failed to create the GLFW window");

        try {
            var px = arena.allocate(JAVA_INT);
            var py = arena.allocate(JAVA_INT);
            var pc = arena.allocate(JAVA_INT);
            var data = stbi_load_from_memory(
                IOUtil.ioResourceToSegment(arena, "image.png"),
                px, py, pc, STBI_rgb_alpha
            );
            glfwSetWindowIcon(window, GLFWImage.alloc(arena)
                .width(px.get(JAVA_INT, 0))
                .height(py.get(JAVA_INT, 0))
                .pixels(data));
            stbi_image_free(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        glfw.setKeyCallback(window, (_, key, _, action, _) -> {
            if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                glfwSetWindowShouldClose(window, true);
            }
        });
        glfwSetFramebufferSizeCallback(window, (_, width, height) ->
            gl.viewport(0, 0, width, height));
        var vidMode = glfwGetVideoMode(glfwGetPrimaryMonitor());
        if (vidMode != null) {
            var size = glfwGetWindowSize(window);
            glfwSetWindowPos(
                window,
                (vidMode.width() - size.x()) / 2,
                (vidMode.height() - size.y()) / 2
            );
        }

        glfw.makeContextCurrent(window);
        glfw.swapInterval(1);

        glfwShowWindow(window);
    }

    private void load() {
        gl = Objects.requireNonNull(GLLoader.load(GLLoader.loadFlags(glfw::getProcAddress)), "Failed to load OpenGL");

        gl.clearColor(0.4f, 0.6f, 0.9f, 1.0f);
    }

    private void loop() {
        while (!glfwWindowShouldClose(window)) {
            gl.clear(GL.COLOR_BUFFER_BIT | GL.DEPTH_BUFFER_BIT);

            glfw.swapBuffers(window);

            glfwPollEvents();
        }
    }

    public static void main(String[] args) {
        new GLFWWindowIconTest().run();
    }
}
