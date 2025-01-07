/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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
import overrungl.util.Unmarshal;

import java.lang.foreign.MemorySegment;

import static overrungl.glfw.GLFW.*;
import static overrungl.opengl.GL.*;

public class HelloWorld {
    private static final int INIT_WIDTH = 300;
    private static final int INIT_HEIGHT = 300;
    // The window handle
    private MemorySegment window = MemorySegment.NULL;
    // The OpenGL context
    private GL gl = null;

    private void start() {
        // Set up an error callback. The default implementation
        // will print the error message in System.err.
        glfwSetErrorCallback(GLFWErrorCallback.createPrint());

        // Initialize GLFW. Most GLFW functions will not work before doing this.
        // If you are using Kotlin, you can use the builtin check function
        if (!glfwInit()) {
            throw new IllegalStateException("Failed to initialize GLFW");
        }

        // Configure GLFW
        // optional, the current window hints are already the default
        glfwDefaultWindowHints();
        // the window will be resizable
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);

        // Get the resolution of the primary monitor
        var vidMode = glfwGetVideoMode(glfwGetPrimaryMonitor());
        if (vidMode != null) {
            // Center the window
            glfwWindowHint(GLFW_POSITION_X, (vidMode.width() - INIT_WIDTH) / 2);
            glfwWindowHint(GLFW_POSITION_Y, (vidMode.height() - INIT_HEIGHT) / 2);
        }

        // Create the window
        window = glfwCreateWindow(INIT_WIDTH, INIT_HEIGHT, "Hello World!", MemorySegment.NULL, MemorySegment.NULL);
        if (Unmarshal.isNullPointer(window)) {
            throw new IllegalStateException("Failed to create the GLFW window");
        }

        // Set up a key callback. It will be called every time a key is pressed, repeated or released.
        glfwSetKeyCallback(window, (handle, key, _, action, _) -> {
            if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                // We will detect this in the rendering loop
                glfwSetWindowShouldClose(handle, true);
            }
        });
        glfwSetFramebufferSizeCallback(window, (_, width, height) -> {
            // Resize the viewport
            if (gl != null) {
                gl.Viewport(0, 0, width, height);
            }
        });

        // Make the OpenGL context current
        glfwMakeContextCurrent(window);
        // Enable v-sync
        glfwSwapInterval(1);

        // Load OpenGL capabilities with GLFW.
        // This uses core profile, which cannot access deprecated and removed functions.
        gl = new GL(GLFW::glfwGetProcAddress);
        initGL(gl);

        run();
    }

    private void initGL(GL gl) {
        // Set the clear color
        gl.ClearColor(0.4f, 0.6f, 0.9f, 1.0f);
    }

    private void run() {
        // Run the rendering loop until the user has attempted to close
        // the window or has pressed the ESCAPE key.
        while (!glfwWindowShouldClose(window)) {
            // Poll for window events. The key callback above will only be
            // invoked during this call.
            glfwPollEvents();
            render(gl);
        }
    }

    private void render(GL gl) {
        // clear the framebuffer
        gl.Clear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
        // swap the color buffers
        glfwSwapBuffers(window);
    }

    private void dispose() {
        // Free the window callbacks and destroy the window
        GLFWCallbacks.free(window);
        glfwDestroyWindow(window);

        // Terminate GLFW
        glfwTerminate();
    }

    public static void main(String[] args) {
        var app = new HelloWorld();
        try {
            app.start();
        } finally {
            app.dispose();
        }
    }
}