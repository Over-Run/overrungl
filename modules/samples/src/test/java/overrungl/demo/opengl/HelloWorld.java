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

import overrungl.glfw.*;
import overrungl.opengl.GL;
import overrungl.util.MemoryUtil;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static overrungl.glfw.GLFW.*;
import static overrungl.opengl.GL.*;

static final int INIT_WIDTH = 300;
static final int INIT_HEIGHT = 300;
/// The arena of the window
Arena windowArena;
/// The window handle
MemorySegment window = MemorySegment.NULL;
/// The OpenGL context
GL gl = null;

void start() {
    // Set up an error callback. The default implementation
    // will print the error message in System.err.
    // We simply use a global arena to manage the upcall stub.
    glfwSetErrorCallback(GLFWErrorCallback.createPrint().stub(Arena.global()));

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
    // GLFWVidMode::ofNative is used since glfwGetVideoMode is a native function,
    // and it returns a zero-length segment
    var vidMode = GLFWVidMode.ofNative(glfwGetVideoMode(glfwGetPrimaryMonitor()));
    if (vidMode != null) {
        // Center the window
        glfwWindowHint(GLFW_POSITION_X, (vidMode.width() - INIT_WIDTH) / 2);
        glfwWindowHint(GLFW_POSITION_Y, (vidMode.height() - INIT_HEIGHT) / 2);
    }

    // The window arena for us to create window callbacks.
    // Callbacks cannot be accessed on other threads, so we use confined arena.
    windowArena = Arena.ofConfined();
    // Create the window
    // As glfwCreateWindow copies the string,
    // we can use MemoryUtil::allocString to allocate a string managed with GC.
    window = glfwCreateWindow(INIT_WIDTH, INIT_HEIGHT, MemoryUtil.allocString("Hello World!"), MemorySegment.NULL, MemorySegment.NULL)
        // associate the window with the given arena
        .reinterpret(windowArena, null);
    if (MemoryUtil.isNullPointer(window)) {
        throw new IllegalStateException("Failed to create the GLFW window");
    }

    // Set up a key callback. It will be called every time a key is pressed, repeated or released.
    glfwSetKeyCallback(window, GLFWKeyFun.alloc(windowArena, (handle, key, _, action, _) -> {
        if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
            // We will detect this in the rendering loop
            glfwSetWindowShouldClose(handle, true);
        }
    }));
    glfwSetFramebufferSizeCallback(window, GLFWFramebufferSizeFun.alloc(windowArena, (_, width, height) -> {
        // Resize the viewport
        if (gl != null) {
            gl.Viewport(0, 0, width, height);
        }
    }));

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

void initGL(GL gl) {
    // Set the clear color
    gl.ClearColor(0.4f, 0.6f, 0.9f, 1.0f);
}

void run() {
    // Run the rendering loop until the user has attempted to close
    // the window or has pressed the ESCAPE key.
    while (!glfwWindowShouldClose(window)) {
        // Poll for window events. The key callback above will only be
        // invoked during this call.
        glfwPollEvents();
        render(gl);
    }
}

void render(GL gl) {
    // clear the framebuffer
    gl.Clear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    // swap the color buffers
    glfwSwapBuffers(window);
}

void dispose() {
    // Destroy the window
    glfwDestroyWindow(window);
    // Closes the window arena, which also releases callbacks
    windowArena.close();

    // Terminate GLFW
    glfwTerminate();
}

void main() {
    IO.println();
    try {
        start();
    } finally {
        dispose();
    }
}
