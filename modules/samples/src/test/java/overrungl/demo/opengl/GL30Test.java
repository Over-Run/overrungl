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

import overrungl.demo.util.IOUtil;
import overrungl.glfw.Callbacks;
import overrungl.glfw.GLFW;
import overrungl.glfw.GLFWErrorCallback;
import overrungl.opengl.GL;
import overrungl.opengl.GLLoader;
import overrungl.stb.STBImage;
import overrungl.util.MemoryStack;
import overrungl.util.CheckUtil;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static java.lang.foreign.ValueLayout.JAVA_INT;

/**
 * Tests OpenGL 3.0 vertex arrays
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL30Test {
    private MemorySegment window;
    private int program;
    private int colorFactor;
    private int vao, vbo, ebo;
    private int tex;

    public void run() {
        try (var arena = Arena.ofShared()) {
            init();
            load(arena);
        }
        loop();

        GL.deleteProgram(program);
        GL.deleteVertexArray(vao);
        GL.deleteBuffer(vbo);
        GL.deleteBuffer(ebo);
        GL.deleteTexture(tex);

        Callbacks.free(window);
        GLFW.destroyWindow(window);

        GLFW.terminate();
        GLFW.setErrorCallback(null);
    }

    private void init() {
        GLFWErrorCallback.createPrint().set();
        CheckUtil.check(GLFW.init(), "Unable to initialize GLFW");
        GLFW.defaultWindowHints();
        GLFW.windowHint(GLFW.VISIBLE, false);
        GLFW.windowHint(GLFW.RESIZABLE, true);
        window = GLFW.createWindow(640, 480, "OpenGL 3.0", MemorySegment.NULL, MemorySegment.NULL);
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
        GLFW.swapInterval(1);

        GLFW.showWindow(window);
    }

    private void load(Arena arena) {
        CheckUtil.check(GLLoader.load(GLFW::getProcAddress, true) != null,
            "Failed to load OpenGL");

        GL.clearColor(0.4f, 0.6f, 0.9f, 1.0f);

        tex = GL.genTexture();
        GL.bindTexture(GL.TEXTURE_2D, tex);
        GL.texParameteri(GL.TEXTURE_2D, GL.TEXTURE_MAG_FILTER, GL.NEAREST);
        GL.texParameteri(GL.TEXTURE_2D, GL.TEXTURE_MIN_FILTER, GL.NEAREST);
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var px = stack.allocate(JAVA_INT);
            var py = stack.allocate(JAVA_INT);
            var pc = stack.allocate(JAVA_INT);
            var data = STBImage.loadFromMemory(
                IOUtil.ioResourceToSegment(arena, "image.png", 256),
                px, py, pc, STBImage.RGB
            );
            GL.texImage2D(GL.TEXTURE_2D,
                0,
                GL.RGB,
                px.get(JAVA_INT, 0),
                py.get(JAVA_INT, 0),
                0,
                GL.RGB,
                GL.UNSIGNED_BYTE,
                data);
            STBImage.free(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        GL.bindTexture(GL.TEXTURE_2D, 0);
        program = GL.createProgram();
        int vsh = GL.createShader(GL.VERTEX_SHADER);
        int fsh = GL.createShader(GL.FRAGMENT_SHADER);
        GL.shaderSource(vsh, """
            #version 130

            in vec3 position;
            in vec2 uv;

            out vec2 texCoord;

            void main() {
                gl_Position = vec4(position, 1.0);
                texCoord = uv;
            }
            """);
        GL.shaderSource(fsh, """
            #version 130

            in vec2 texCoord;

            out vec4 fragColor;

            uniform sampler2D sampler;
            uniform float colorFactor;

            void main() {
                fragColor = colorFactor * texture(sampler, texCoord);
            }
            """);
        GL.compileShader(vsh);
        GL.compileShader(fsh);
        GL.attachShader(program, vsh);
        GL.attachShader(program, fsh);
        GL.bindAttribLocation(program, 0, "position");
        GL.bindAttribLocation(program, 1, "uv");
        GL.linkProgram(program);
        GL.detachShader(program, vsh);
        GL.detachShader(program, fsh);
        GL.deleteShader(vsh);
        GL.deleteShader(fsh);
        GL.useProgram(program);
        GL.uniform1i(GL.getUniformLocation(program, "sampler"), 0);
        GL.useProgram(0);

        vao = GL.genVertexArray();
        GL.bindVertexArray(vao);
        vbo = GL.genBuffer();
        GL.bindBuffer(GL.ARRAY_BUFFER, vbo);
        GL.bufferData(arena, GL.ARRAY_BUFFER, new float[]{
            // Vertex          UV
            -0.5f, 0.5f, 0.0f, 0.0f, 0.0f,
            -0.5f, -0.5f, 0.0f, 0.0f, 1.0f,
            0.5f, -0.5f, 0.0f, 1.0f, 1.0f,
            0.5f, 0.5f, 0.0f, 1.0f, 0.0f
        }, GL.STATIC_DRAW);
        ebo = GL.genBuffer();
        GL.bindBuffer(GL.ELEMENT_ARRAY_BUFFER, ebo);
        GL.bufferData(arena, GL.ELEMENT_ARRAY_BUFFER, new byte[]{
            0, 1, 2, 0, 2, 3
        }, GL.STATIC_DRAW);
        GL.enableVertexAttribArray(0);
        GL.enableVertexAttribArray(1);
        GL.vertexAttribPointer(0, 3, GL.FLOAT, false, 20, MemorySegment.NULL);
        GL.vertexAttribPointer(1, 2, GL.FLOAT, false, 20, MemorySegment.ofAddress(12));
        GL.bindBuffer(GL.ARRAY_BUFFER, 0);
        GL.bindVertexArray(0);

        colorFactor = GL.getUniformLocation(program, "colorFactor");
    }

    private void loop() {
        while (!GLFW.windowShouldClose(window)) {
            GL.clear(GL.COLOR_BUFFER_BIT | GL.DEPTH_BUFFER_BIT);

            // Draw triangle
            GL.bindTexture(GL.TEXTURE_2D, tex);
            GL.useProgram(program);
            GL.uniform1f(colorFactor, (float) ((Math.sin(GLFW.getTime() * 2) + 1 * 0.5) * 0.6 + 0.4));
            GL.bindVertexArray(vao);
            GL.drawElements(GL.TRIANGLES, 6, GL.UNSIGNED_BYTE, MemorySegment.NULL);
            GL.bindVertexArray(0);
            GL.useProgram(0);
            GL.bindTexture(GL.TEXTURE_2D, 0);

            GLFW.swapBuffers(window);

            GLFW.pollEvents();
        }
    }

    public static void main(String[] args) {
        new GL30Test().run();
    }
}
