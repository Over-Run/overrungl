/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.demo.opengl;

import org.overrun.glib.gl.GL;
import org.overrun.glib.gl.GLCaps;
import org.overrun.glib.glfw.Callbacks;
import org.overrun.glib.glfw.GLFW;
import org.overrun.glib.glfw.GLFWErrorCallback;
import org.overrun.glib.util.BufferBuilder;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;

import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static org.overrun.glib.gl.GLConstC.*;

/**
 * Tests {@link BufferBuilder}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class BufferBuilderTest {
    private MemoryAddress window;
    private int program, vao, vbo;

    public void run() {
        try (var arena = MemorySession.openShared()) {
            init(arena);
            load(arena);
        }
        loop();

        GL.deleteProgram(program);
        GL.deleteVertexArray(vao);
        GL.deleteBuffer(vbo);

        Callbacks.free(window);
        GLFW.destroyWindow(window);

        GLFW.terminate();
        GLFW.setErrorCallback(null);
    }

    private void init(MemorySession arena) {
        GLFWErrorCallback.createPrint().set();
        if (!GLFW.init()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }
        GLFW.defaultWindowHints();
        GLFW.windowHint(GLFW.VISIBLE, false);
        GLFW.windowHint(GLFW.RESIZABLE, true);
        window = GLFW.createWindow(arena, 300, 300, "BufferBuilder Test", MemoryAddress.NULL, MemoryAddress.NULL);
        if (window == MemoryAddress.NULL)
            throw new RuntimeException("Failed to create the GLFW window");
        GLFW.setKeyCallback(window, (handle, key, scancode, action, mods) -> {
            if (key == GLFW.KEY_ESCAPE && action == GLFW.RELEASE) {
                GLFW.setWindowShouldClose(window, true);
            }
        });
        GLFW.setFramebufferSizeCallback(window, (handle, width, height) ->
            GL.viewport(0, 0, width, height));
        var vidMode = GLFW.getVideoMode(arena, GLFW.getPrimaryMonitor());
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

    private void load(MemorySession arena) {
        if (GLCaps.loadShared(GLFW::getProcAddress) == 0)
            throw new IllegalStateException("Failed to load OpenGL");

        GL.clearColor(0.4f, 0.6f, 0.9f, 1.0f);

        program = GL.createProgram();
        int vsh = GL.createShader(GL_VERTEX_SHADER);
        int fsh = GL.createShader(GL_FRAGMENT_SHADER);
        GL.shaderSource(arena, vsh, """
            #version 130

            in vec3 position;
            in vec3 color;

            out vec3 vertexColor;

            void main() {
                gl_Position = vec4(position, 1.0);
                vertexColor = color;
            }
            """);
        GL.shaderSource(arena, fsh, """
            #version 130

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
        GL.bindAttribLocation(arena, program, 0, "position");
        GL.bindAttribLocation(arena, program, 1, "color");
        GL.linkProgram(program);
        GL.detachShader(program, vsh);
        GL.detachShader(program, fsh);
        GL.deleteShader(vsh);
        GL.deleteShader(fsh);

        vao = GL.genVertexArray();
        GL.bindVertexArray(vao);
        vbo = GL.genBuffer();
        GL.bindBuffer(GL_ARRAY_BUFFER, vbo);
        int stride;
        try (var builder = new BufferBuilder(4 * 3 * 3 + 4 * 3)) {
            builder.begin()
                .putAll(JAVA_FLOAT, 0.0f, 0.5f, 0.0f)
                .putAll(JAVA_BYTE, (byte) 0xff, (byte) 0, (byte) 0)
                // For alignment reason, we put a padding byte
                .put(JAVA_BYTE, (byte) 0)
                .emit()
                .putAll(JAVA_FLOAT, -0.5f, -0.5f, 0.0f)
                .putAll(JAVA_BYTE, (byte) 0, (byte) 0xff, (byte) 0)
                .put(JAVA_BYTE, (byte) 0)
                .emit()
                .putAll(JAVA_FLOAT, 0.5f, -0.5f, 0.0f)
                .putAll(JAVA_BYTE, (byte) 0, (byte) 0, (byte) 0xff)
                .put(JAVA_BYTE, (byte) 0)
                .emit()
                .end();
            GL.bufferData(GL_ARRAY_BUFFER, builder, GL_STATIC_DRAW);
            stride = (int) builder.stride();
        }
        GL.enableVertexAttribArray(0);
        GL.enableVertexAttribArray(1);
        GL.vertexAttribPointer(0, 3, GL_FLOAT, false, stride, MemoryAddress.NULL);
        GL.vertexAttribPointer(1, 3, GL_UNSIGNED_BYTE, true, stride, MemoryAddress.ofLong(12));
        GL.bindBuffer(GL_ARRAY_BUFFER, 0);
        GL.bindVertexArray(0);
    }

    private void loop() {
        while (!GLFW.windowShouldClose(window)) {
            GL.clear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

            // Draw triangle
            GL.useProgram(program);
            GL.bindVertexArray(vao);
            GL.drawArrays(GL_TRIANGLES, 0, 3);
            GL.bindVertexArray(0);
            GL.useProgram(0);

            GLFW.swapBuffers(window);

            GLFW.pollEvents();
        }
    }

    public static void main(String[] args) {
        new BufferBuilderTest().run();
    }
}
