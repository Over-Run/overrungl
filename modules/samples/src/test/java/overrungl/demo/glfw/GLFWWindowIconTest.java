/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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
import overrungl.glfw.*;
import overrungl.opengl.GL;
import overrungl.util.MemoryStack;
import overrungl.util.MemoryUtil;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static overrungl.glfw.GLFW.*;
import static overrungl.opengl.GL.*;
import static overrungl.stb.STBImage.*;

/**
 * Tests GLFW window icon and STB image
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFWWindowIconTest {
    private Arena windowArena;
    private MemorySegment window;
    private GL gl;

    public void run() {
        try (var arena = Arena.ofShared()) {
            init(arena);
            load();
        }
        loop();

        glfwDestroyWindow(window);
        windowArena.close();

        glfwTerminate();
        glfwSetErrorCallback(MemorySegment.NULL);
    }

    private void init(Arena arena) {
        glfwSetErrorCallback(GLFWErrorCallback.createPrint().stub(Arena.global()));
        if (!glfwInit()) throw new IllegalStateException("Unable to initialize GLFW");
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        windowArena = Arena.ofConfined();
        window = glfwCreateWindow(300, 300, MemoryUtil.allocString("Hello World!"), MemorySegment.NULL, MemorySegment.NULL);
        if (MemoryUtil.isNullPointer(window)) throw new IllegalStateException("Failed to create the GLFW window");

        try {
            var px = arena.allocate(JAVA_INT);
            var py = arena.allocate(JAVA_INT);
            var pc = arena.allocate(JAVA_INT);
            MemorySegment buffer = IOUtil.ioResourceToSegment(arena, "image.png");
            var data = stbi_load_from_memory(
                buffer, Math.toIntExact(buffer.byteSize()),
                px, py, pc, STBI_rgb_alpha
            );
            glfwSetWindowIcon(window, 1, GLFWImage.alloc(arena)
                .width(px.get(JAVA_INT, 0))
                .height(py.get(JAVA_INT, 0))
                .pixels(data)
                .segment());
            stbi_image_free(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        glfwSetKeyCallback(window, GLFWKeyFun.alloc(windowArena, (_, key, _, action, _) -> {
            if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                glfwSetWindowShouldClose(window, true);
            }
        }));
        glfwSetFramebufferSizeCallback(window, GLFWFramebufferSizeFun.alloc(windowArena, (_, width, height) ->
            gl.Viewport(0, 0, width, height)));
        var vidMode = GLFWVidMode.ofNative(glfwGetVideoMode(glfwGetPrimaryMonitor()));
        if (vidMode != null) {
            try (var stack = MemoryStack.pushLocal()) {
                MemorySegment width = stack.ints(0);
                MemorySegment height = stack.ints(0);
                glfwGetWindowSize(window, width, height);
                glfwSetWindowPos(
                    window,
                    (vidMode.width() - width.get(JAVA_INT, 0)) / 2,
                    (vidMode.height() - height.get(JAVA_INT, 0)) / 2
                );
            }
        }

        glfwMakeContextCurrent(window);
        glfwSwapInterval(1);

        glfwShowWindow(window);
    }

    private void load() {
        gl = new GL(GLFW::glfwGetProcAddress);

        gl.ClearColor(0.4f, 0.6f, 0.9f, 1.0f);
    }

    private void loop() {
        while (!glfwWindowShouldClose(window)) {
            gl.Clear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

            glfwSwapBuffers(window);

            glfwPollEvents();
        }
    }

    public static void main(String[] args) {
        new GLFWWindowIconTest().run();
    }
}
