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

import org.joml.Matrix4f;
import org.overrun.timer.Timer;
import overrungl.glfw.GLFW;
import overrungl.glfw.GLFWCallbacks;
import overrungl.glfw.GLFWErrorCallback;
import overrungl.joml.Matrixn;
import overrungl.opengl.*;
import overrungl.opengl.amd.GLAMDDebugOutput;
import overrungl.opengl.arb.GLARBDebugOutput;
import overrungl.util.MemoryStack;
import overrungl.util.Unmarshal;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.glfw.GLFW.*;
import static overrungl.opengl.GL.*;

/**
 * Tests OpenGL 3.3 instanced rendering
 *
 * @author squid233
 * @since 0.1.0
 */
public class GL33Test {
    private static final int INSTANCE_COUNT = square(10);
    private static final String WND_TITLE = "OpenGL 3.3";
    private static final boolean VSYNC = true;
    private MemorySegment window;
    private GL gl;
    private int program;
    private int rotationMat;
    private int vao, vbo, ebo, mbo;
    private Arena debugProc;

    private static int square(int x) {
        return x * x;
    }

    public void run() {
        try (var arena = Arena.ofShared()) {
            init();
            load(arena);
        }
        loop();

        gl.DeleteProgram(program);
        gl.DeleteVertexArrays(vao);
        gl.DeleteBuffers(vbo);
        gl.DeleteBuffers(ebo);
        gl.DeleteBuffers(mbo);

        GLFWCallbacks.free(window);
        glfwDestroyWindow(window);
        debugProc.close();

        glfwTerminate();
        glfwSetErrorCallback(MemorySegment.NULL);
    }

    private void init() {
        glfwSetErrorCallback(GLFWErrorCallback.createPrint());
        if (!glfwInit()) throw new IllegalStateException("Unable to initialize GLFW");
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 3);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 3);
        glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
        glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GLFW_TRUE);
        window = glfwCreateWindow(640, 480, WND_TITLE, MemorySegment.NULL, MemorySegment.NULL);
        if (Unmarshal.isNullPointer(window)) throw new IllegalStateException("Failed to create the GLFW window");
        glfwSetKeyCallback(window, (_, key, _, action, _) -> {
            if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                glfwSetWindowShouldClose(window, true);
            }
        });
        glfwSetFramebufferSizeCallback(window, (_, width, height) ->
            gl.Viewport(0, 0, width, height));
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
        if (VSYNC) glfwSwapInterval(1);

        glfwShowWindow(window);
    }

    private void load(Arena arena) {
        GLLoadFunc glLoadFunc = GLFW::glfwGetProcAddress;
        gl = new GL(glLoadFunc);

        var flags = new GLFlags(glLoadFunc);
        debugProc = GLUtil.setupDebugMessageCallback(gl,
            flags,
            () -> new GLARBDebugOutput(glLoadFunc),
            () -> new GLAMDDebugOutput(glLoadFunc));
        gl.ClearColor(0.4f, 0.6f, 0.9f, 1.0f);
        program = gl.CreateProgram();
        int vsh = gl.CreateShader(GL_VERTEX_SHADER);
        int fsh = gl.CreateShader(GL_FRAGMENT_SHADER);
        gl.ShaderSource(vsh, """
            #version 330

            layout (location = 0) in vec3 position;
            layout (location = 1) in vec3 color;
            layout (location = 2) in mat4 modelMat;

            out vec3 vertexColor;

            uniform mat4 rotationMat;

            void main() {
                gl_Position = modelMat * rotationMat * vec4(position, 1.0);
                vertexColor = color;
            }
            """);
        gl.ShaderSource(fsh, """
            #version 330

            in vec3 vertexColor;

            out vec4 fragColor;

            void main() {
                fragColor = vec4(vertexColor, 1.0);
            }
            """);
        gl.CompileShader(vsh);
        gl.CompileShader(fsh);
        gl.AttachShader(program, vsh);
        gl.AttachShader(program, fsh);
        gl.LinkProgram(program);
        gl.DetachShader(program, vsh);
        gl.DetachShader(program, fsh);
        gl.DeleteShader(vsh);
        gl.DeleteShader(fsh);
        rotationMat = gl.GetUniformLocation(program, "rotationMat");

        vao = gl.GenVertexArrays();
        gl.BindVertexArray(vao);
        vbo = gl.GenBuffers();
        gl.BindBuffer(GL_ARRAY_BUFFER, vbo);
        gl.BufferData(GL_ARRAY_BUFFER, arena.allocateFrom(JAVA_FLOAT,
            // Vertex          Color
            -0.5f, 0.5f, 0.0f, 1.0f, 0.0f, 0.0f,
            -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 1.0f,
            0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f,
            0.5f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f
        ), GL_STATIC_DRAW);
        ebo = gl.GenBuffers();
        gl.BindBuffer(GL_ELEMENT_ARRAY_BUFFER, ebo);
        gl.BufferData(GL_ELEMENT_ARRAY_BUFFER, arena.allocateFrom(JAVA_BYTE, new byte[]{
            0, 1, 2, 2, 3, 0
        }), GL_STATIC_DRAW);
        gl.EnableVertexAttribArray(0);
        gl.EnableVertexAttribArray(1);
        gl.VertexAttribPointer(0, 3, GL_FLOAT, false, 24, MemorySegment.NULL);
        gl.VertexAttribPointer(1, 3, GL_FLOAT, false, 24, MemorySegment.ofAddress(12));
        mbo = gl.GenBuffers();
        gl.BindBuffer(GL_ARRAY_BUFFER, mbo);
        var mat = new Matrix4f();
        var iseq = MemoryLayout.sequenceLayout(
            INSTANCE_COUNT,
            Matrixn.MAT4F
        );
        var matrices = arena.allocate(iseq);
        float mul = (float) Math.sqrt(INSTANCE_COUNT);
        float scaling = 1f / mul;
        // TODO: 2023/7/8 Value object
        float[] translations = new float[2 * INSTANCE_COUNT];
        for (int i = 0; i < 2 * INSTANCE_COUNT; ) {
            for (int y = (int) -mul; y < mul; y += 2) {
                for (int x = (int) -mul; x < mul; x += 2) {
                    translations[i++] = (x + 1) * scaling;
                    translations[i++] = (y + 1) * scaling;
                }
            }
        }
        for (int i = 0; i < INSTANCE_COUNT; i++) {
            Matrixn.put(mat.translation(translations[i * 2], translations[i * 2 + 1], 1.0f)
                    .scale(scaling, scaling, 1.0f),
                i * Matrixn.MAT4F.byteSize(),
                matrices);
        }
        gl.BufferData(GL_ARRAY_BUFFER, matrices, GL_STATIC_DRAW);
        gl.EnableVertexAttribArray(2);
        gl.EnableVertexAttribArray(3);
        gl.EnableVertexAttribArray(4);
        gl.EnableVertexAttribArray(5);
        gl.VertexAttribPointer(2, 4, GL_FLOAT, false, 64, MemorySegment.NULL);
        gl.VertexAttribPointer(3, 4, GL_FLOAT, false, 64, MemorySegment.ofAddress(16));
        gl.VertexAttribPointer(4, 4, GL_FLOAT, false, 64, MemorySegment.ofAddress(32));
        gl.VertexAttribPointer(5, 4, GL_FLOAT, false, 64, MemorySegment.ofAddress(48));
        gl.VertexAttribDivisor(2, 1);
        gl.VertexAttribDivisor(3, 1);
        gl.VertexAttribDivisor(4, 1);
        gl.VertexAttribDivisor(5, 1);
        gl.BindBuffer(GL_ARRAY_BUFFER, 0);
        gl.BindVertexArray(0);
    }

    private void loop() {
        try (var arena = Arena.ofConfined()) {
            var matrix = new Matrix4f();
            var pRotationMat = Matrixn.allocate(arena, matrix);

            var timer = Timer.ofGetter(20, GLFW::glfwGetTime);

            while (!glfwWindowShouldClose(window)) {
                timer.advanceTime();
                timer.performTicks(null);

                gl.Clear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

                // Draw triangle
                gl.UseProgram(program);

                // rotate 90deg per second
                matrix.rotateZ((float) Math.toRadians(90 * timer.deltaTime()));
                Matrixn.put(matrix, pRotationMat);

                gl.UniformMatrix4fv(rotationMat, 1, false, pRotationMat);
                gl.BindVertexArray(vao);
                gl.DrawElementsInstanced(GL_TRIANGLES, 6, GL_UNSIGNED_BYTE, MemorySegment.NULL, INSTANCE_COUNT);
                gl.BindVertexArray(0);
                gl.UseProgram(0);

                glfwSwapBuffers(window);

                glfwPollEvents();

                timer.calcFPS(fps -> glfwSetWindowTitle(window, WND_TITLE + " FPS: " + fps));
            }
        }
    }

    public static void main(String[] args) {
        new GL33Test().run();
    }
}
