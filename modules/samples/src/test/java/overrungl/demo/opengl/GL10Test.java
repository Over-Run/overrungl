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

package overrungl.demo.opengl;

import overrungl.glfw.GLFW;
import overrungl.glfw.GLFWCallbacks;
import overrungl.glfw.GLFWErrorCallback;
import overrungl.opengl.GL;
import overrungl.opengl.GLLegacy;
import overrungl.opengl.GLLoader;
import overrungl.util.MemoryStack;
import overrungl.util.Unmarshal;

import java.lang.foreign.MemorySegment;
import java.util.Objects;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static overrungl.glfw.GLFW.*;

/**
 * Tests basic GLFW and OpenGL
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL10Test {
    private MemorySegment window;
    private GLLegacy gl;

    public void run() {
        init();
        load();
        loop();

        GLFWCallbacks.free(window);
        glfwDestroyWindow(window);

        glfwTerminate();
        glfwSetErrorCallback(MemorySegment.NULL);
    }

    private void init() {
        glfwSetErrorCallback(GLFWErrorCallback.createPrint());
        if (!glfwInit()) throw new IllegalStateException("Unable to initialize GLFW");
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        window = glfwCreateWindow(300, 300, "Hello World!", MemorySegment.NULL, MemorySegment.NULL);
        if (Unmarshal.isNullPointer(window)) throw new IllegalStateException("Failed to create the GLFW window");
        glfwSetKeyCallback(window, (_, key, _, action, _) -> {
            if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                glfwSetWindowShouldClose(window, true);
            }
        });
        glfwSetFramebufferSizeCallback(window, (_, width, height) ->
            gl.viewport(0, 0, width, height));
        var vidMode = glfwGetVideoMode(glfwGetPrimaryMonitor());
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
        gl = Objects.requireNonNull(GLLoader.loadLegacy(GLLoader.loadFlags(GLFW::glfwGetProcAddress)), "Failed to load OpenGL");

        gl.clearColor(0.4f, 0.6f, 0.9f, 1.0f);
    }

    private void loop() {
        while (!glfwWindowShouldClose(window)) {
            gl.clear(GL.COLOR_BUFFER_BIT | GL.DEPTH_BUFFER_BIT);

            // Draw triangle
            gl.begin(GL.TRIANGLES);
            gl.color3f(1f, 0f, 0f);
            gl.vertex2f(0.0f, 0.5f);
            gl.color3f(0f, 1f, 0f);
            gl.vertex2f(-0.5f, -0.5f);
            gl.color3f(0f, 0f, 1f);
            gl.vertex2f(0.5f, -0.5f);
            gl.end();

            glfwSwapBuffers(window);

            glfwPollEvents();
        }
    }

    public static void main(String[] args) {
        new GL10Test().run();
    }
}
