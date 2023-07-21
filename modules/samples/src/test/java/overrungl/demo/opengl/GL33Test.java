/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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
import overrungl.glfw.GLFWCallbacks;
import overrungl.glfw.GLFW;
import overrungl.glfw.GLFWErrorCallback;
import overrungl.joml.Matrixn;
import overrungl.opengl.GL;
import overrungl.opengl.GLLoader;
import overrungl.opengl.GLUtil;
import overrungl.util.MemoryStack;
import overrungl.util.CheckUtil;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;

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

        GL.deleteProgram(program);
        GL.deleteVertexArray(vao);
        // Optimization when many buffer objects need to be deleted
        try (final MemoryStack stack = MemoryStack.stackPush()) {
            GL.deleteBuffers(3, stack.ints(vbo, ebo, mbo));
        }

        GLFWCallbacks.free(window);
        GLFW.destroyWindow(window);
        debugProc.close();

        GLFW.terminate();
        GLFW.setErrorCallback(null);
    }

    private void init() {
        GLFWErrorCallback.createPrint().set();
        CheckUtil.check(GLFW.init(), "Unable to initialize GLFW");
        GLFW.defaultWindowHints();
        GLFW.windowHint(GLFW.VISIBLE, false);
        GLFW.windowHint(GLFW.RESIZABLE, true);
        GLFW.windowHint(GLFW.CONTEXT_VERSION_MAJOR, 3);
        GLFW.windowHint(GLFW.CONTEXT_VERSION_MINOR, 3);
        GLFW.windowHint(GLFW.OPENGL_PROFILE, GLFW.OPENGL_CORE_PROFILE);
        window = GLFW.createWindow(640, 480, WND_TITLE, MemorySegment.NULL, MemorySegment.NULL);
        CheckUtil.checkNotNullptr(window, "Failed to create the GLFW window");
        GLFW.setKeyCallback(window, (handle, key, scancode, action, mods) -> {
            if (key == GLFW.KEY_ESCAPE && action == GLFW.RELEASE) {
                GLFW.setWindowShouldClose(window, true);
            }
        });
        GLFW.setFramebufferSizeCallback(window, (handle, width, height) ->
            GL.viewport(0, 0, width, height));
        var vidMode = GLFW.getVideoMode(GLFW.getPrimaryMonitor());
        if (vidMode != null) {
            var size = GLFW.getWindowSize(window);
            GLFW.setWindowPos(
                window,
                (vidMode.width() - size.x()) / 2,
                (vidMode.height() - size.y()) / 2
            );
        }

        GLFW.makeContextCurrent(window);
        if (VSYNC) GLFW.swapInterval(1);

        GLFW.showWindow(window);
    }

    private void load(Arena arena) {
        CheckUtil.check(GLLoader.load(GLFW::getProcAddress, true) != null,
            "Failed to load OpenGL");

        debugProc = GLUtil.setupDebugMessageCallback();
        GL.clearColor(0.4f, 0.6f, 0.9f, 1.0f);
        program = GL.createProgram();
        int vsh = GL.createShader(GL.VERTEX_SHADER);
        int fsh = GL.createShader(GL.FRAGMENT_SHADER);
        GL.shaderSource(vsh, """
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
        GL.shaderSource(fsh, """
            #version 330

            in vec3 vertexColor;

            out vec4 fragColor;

            void main() {
                fragColor = vec4(vertexColor, 1.0);
            }
            """);
        GL.compileShader(vsh);
        GL.compileShader(fsh);
        GL.attachShader(program, vsh);
        GL.attachShader(program, fsh);
        GL.linkProgram(program);
        GL.detachShader(program, vsh);
        GL.detachShader(program, fsh);
        GL.deleteShader(vsh);
        GL.deleteShader(fsh);
        rotationMat = GL.getUniformLocation(program, "rotationMat");

        vao = GL.genVertexArray();
        GL.bindVertexArray(vao);
        vbo = GL.genBuffer();
        GL.bindBuffer(GL.ARRAY_BUFFER, vbo);
        GL.bufferData(arena, GL.ARRAY_BUFFER, new float[]{
            // Vertex          Color
            -0.5f, 0.5f, 0.0f, 1.0f, 0.0f, 0.0f,
            -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 1.0f,
            0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f,
            0.5f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f
        }, GL.STATIC_DRAW);
        ebo = GL.genBuffer();
        GL.bindBuffer(GL.ELEMENT_ARRAY_BUFFER, ebo);
        GL.bufferData(arena, GL.ELEMENT_ARRAY_BUFFER, new byte[]{
            0, 1, 2, 2, 3, 0
        }, GL.STATIC_DRAW);
        GL.enableVertexAttribArray(0);
        GL.enableVertexAttribArray(1);
        GL.vertexAttribPointer(0, 3, GL.FLOAT, false, 24, MemorySegment.NULL);
        GL.vertexAttribPointer(1, 3, GL.FLOAT, false, 24, MemorySegment.ofAddress(12));
        mbo = GL.genBuffer();
        GL.bindBuffer(GL.ARRAY_BUFFER, mbo);
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
        GL.bufferData(GL.ARRAY_BUFFER, matrices, GL.STATIC_DRAW);
        GL.enableVertexAttribArray(2);
        GL.enableVertexAttribArray(3);
        GL.enableVertexAttribArray(4);
        GL.enableVertexAttribArray(5);
        GL.vertexAttribPointer(2, 4, GL.FLOAT, false, 64, MemorySegment.NULL);
        GL.vertexAttribPointer(3, 4, GL.FLOAT, false, 64, MemorySegment.ofAddress(16));
        GL.vertexAttribPointer(4, 4, GL.FLOAT, false, 64, MemorySegment.ofAddress(32));
        GL.vertexAttribPointer(5, 4, GL.FLOAT, false, 64, MemorySegment.ofAddress(48));
        GL.vertexAttribDivisor(2, 1);
        GL.vertexAttribDivisor(3, 1);
        GL.vertexAttribDivisor(4, 1);
        GL.vertexAttribDivisor(5, 1);
        GL.bindBuffer(GL.ARRAY_BUFFER, 0);
        GL.bindVertexArray(0);
    }

    private void loop() {
        var matrix = new Matrix4f();
        var pRotationMat = Matrixn.allocate(Arena.ofAuto(), matrix);

        var timer = Timer.ofGetter(20, GLFW::getTime);

        while (!GLFW.windowShouldClose(window)) {
            timer.advanceTime();
            timer.performTicks(null);

            GL.clear(GL.COLOR_BUFFER_BIT | GL.DEPTH_BUFFER_BIT);

            // Draw triangle
            GL.useProgram(program);

            // rotate 90deg per second
            matrix.rotateZ((float) Math.toRadians(90 * timer.deltaTime()));
            Matrixn.put(matrix, pRotationMat);

            GL.uniformMatrix4fv(rotationMat, 1, false, pRotationMat);
            GL.bindVertexArray(vao);
            GL.drawElementsInstanced(GL.TRIANGLES, 6, GL.UNSIGNED_BYTE, MemorySegment.NULL, INSTANCE_COUNT);
            GL.bindVertexArray(0);
            GL.useProgram(0);

            GLFW.swapBuffers(window);

            GLFW.pollEvents();

            // using lambda gets higher FPS ??
            timer.calcFPS(fps -> {
                GLFW.setWindowTitle(window, STR."\{WND_TITLE} FPS: \{fps}");
            });
        }
    }

    public static void main(String[] args) {
        new GL33Test().run();
    }
}
