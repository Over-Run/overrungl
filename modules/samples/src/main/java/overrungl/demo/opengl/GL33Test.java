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

package overrungl.demo.opengl;

import org.joml.Matrix4f;
import org.overrun.timer.Timer;
import overrun.marshal.Unmarshal;
import overrungl.glfw.GLFW;
import overrungl.glfw.GLFWCallbacks;
import overrungl.glfw.GLFWErrorCallback;
import overrungl.joml.Matrixn;
import overrungl.opengl.*;
import overrungl.opengl.ext.amd.GLAMDDebugOutput;
import overrungl.opengl.ext.arb.GLARBDebugOutput;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.util.Objects;

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
    private final GLFW glfw = GLFW.INSTANCE;
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

        gl.deleteProgram(program);
        gl.deleteVertexArrays(vao);
        gl.deleteBuffers(vbo, ebo, mbo);

        GLFWCallbacks.free(window);
        glfw.destroyWindow(window);
        debugProc.close();

        glfw.terminate();
        glfw.setErrorCallback(null);
    }

    private void init() {
        GLFWErrorCallback.createPrint().set();
        if (!glfw.init()) throw new IllegalStateException("Unable to initialize GLFW");
        glfw.defaultWindowHints();
        glfw.windowHint(GLFW.VISIBLE, false);
        glfw.windowHint(GLFW.RESIZABLE, true);
        glfw.windowHint(GLFW.CONTEXT_VERSION_MAJOR, 3);
        glfw.windowHint(GLFW.CONTEXT_VERSION_MINOR, 3);
        glfw.windowHint(GLFW.OPENGL_PROFILE, GLFW.OPENGL_CORE_PROFILE);
        glfw.windowHint(GLFW.OPENGL_DEBUG_CONTEXT, true);
        window = glfw.createWindow(640, 480, WND_TITLE, MemorySegment.NULL, MemorySegment.NULL);
        if (Unmarshal.isNullPointer(window)) throw new IllegalStateException("Failed to create the GLFW window");
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
        if (VSYNC) glfw.swapInterval(1);

        glfw.showWindow(window);
    }

    private void load(Arena arena) {
        final GLFlags flags = GLLoader.loadFlags(GLLoadFunc.withAlias(glfw::getProcAddress));
        gl = Objects.requireNonNull(GLLoader.load(flags), "Failed to load OpenGL");

        debugProc = GLUtil.setupDebugMessageCallback(gl,
            flags,
            () -> GLLoader.loadBuiltin(flags, GLARBDebugOutput.class),
            () -> GLLoader.loadBuiltin(flags, GLAMDDebugOutput.class));
        gl.clearColor(0.4f, 0.6f, 0.9f, 1.0f);
        program = gl.createProgram();
        int vsh = gl.createShader(GL.VERTEX_SHADER);
        int fsh = gl.createShader(GL.FRAGMENT_SHADER);
        gl.shaderSource(vsh, """
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
        gl.shaderSource(fsh, """
            #version 330

            in vec3 vertexColor;

            out vec4 fragColor;

            void main() {
                fragColor = vec4(vertexColor, 1.0);
            }
            """);
        gl.compileShader(vsh);
        gl.compileShader(fsh);
        gl.attachShader(program, vsh);
        gl.attachShader(program, fsh);
        gl.linkProgram(program);
        gl.detachShader(program, vsh);
        gl.detachShader(program, fsh);
        gl.deleteShader(vsh);
        gl.deleteShader(fsh);
        rotationMat = gl.getUniformLocation(program, "rotationMat");

        vao = gl.genVertexArrays();
        gl.bindVertexArray(vao);
        vbo = gl.genBuffers();
        gl.bindBuffer(GL.ARRAY_BUFFER, vbo);
        gl.bufferData(arena, GL.ARRAY_BUFFER, new float[]{
            // Vertex          Color
            -0.5f, 0.5f, 0.0f, 1.0f, 0.0f, 0.0f,
            -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 1.0f,
            0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f,
            0.5f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f
        }, GL.STATIC_DRAW);
        ebo = gl.genBuffers();
        gl.bindBuffer(GL.ELEMENT_ARRAY_BUFFER, ebo);
        gl.bufferData(arena, GL.ELEMENT_ARRAY_BUFFER, new byte[]{
            0, 1, 2, 2, 3, 0
        }, GL.STATIC_DRAW);
        gl.enableVertexAttribArray(0);
        gl.enableVertexAttribArray(1);
        gl.vertexAttribPointer(0, 3, GL.FLOAT, false, 24, MemorySegment.NULL);
        gl.vertexAttribPointer(1, 3, GL.FLOAT, false, 24, MemorySegment.ofAddress(12));
        mbo = gl.genBuffers();
        gl.bindBuffer(GL.ARRAY_BUFFER, mbo);
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
        gl.bufferData(GL.ARRAY_BUFFER, matrices, GL.STATIC_DRAW);
        gl.enableVertexAttribArray(2);
        gl.enableVertexAttribArray(3);
        gl.enableVertexAttribArray(4);
        gl.enableVertexAttribArray(5);
        gl.vertexAttribPointer(2, 4, GL.FLOAT, false, 64, MemorySegment.NULL);
        gl.vertexAttribPointer(3, 4, GL.FLOAT, false, 64, MemorySegment.ofAddress(16));
        gl.vertexAttribPointer(4, 4, GL.FLOAT, false, 64, MemorySegment.ofAddress(32));
        gl.vertexAttribPointer(5, 4, GL.FLOAT, false, 64, MemorySegment.ofAddress(48));
        gl.vertexAttribDivisor(2, 1);
        gl.vertexAttribDivisor(3, 1);
        gl.vertexAttribDivisor(4, 1);
        gl.vertexAttribDivisor(5, 1);
        gl.bindBuffer(GL.ARRAY_BUFFER, 0);
        gl.bindVertexArray(0);
    }

    private void loop() {
        try (var arena = Arena.ofConfined()) {
            var matrix = new Matrix4f();
            var pRotationMat = Matrixn.allocate(arena, matrix);

            var timer = Timer.ofGetter(20, glfw::getTime);

            while (!glfw.windowShouldClose(window)) {
                timer.advanceTime();
                timer.performTicks(null);

                gl.clear(GL.COLOR_BUFFER_BIT | GL.DEPTH_BUFFER_BIT);

                // Draw triangle
                gl.useProgram(program);

                // rotate 90deg per second
                matrix.rotateZ((float) Math.toRadians(90 * timer.deltaTime()));
                Matrixn.put(matrix, pRotationMat);

                gl.uniformMatrix4fv(rotationMat, 1, false, pRotationMat);
                gl.bindVertexArray(vao);
                gl.drawElementsInstanced(GL.TRIANGLES, 6, GL.UNSIGNED_BYTE, MemorySegment.NULL, INSTANCE_COUNT);
                gl.bindVertexArray(0);
                gl.useProgram(0);

                glfw.swapBuffers(window);

                glfw.pollEvents();

                // using lambda gets higher FPS ??
                timer.calcFPS(fps -> {
                    glfw.setWindowTitle(window, STR."\{WND_TITLE} FPS: \{fps}");
                });
            }
        }
    }

    public static void main(String[] args) {
        new GL33Test().run();
    }
}
