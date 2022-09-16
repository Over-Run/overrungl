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

import java.lang.foreign.MemoryAddress;

import static org.overrun.glib.gl.GLConstC.*;

/**
 * Tests OpenGL 3.0 vertex arrays
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL30Test {
    private MemoryAddress window;

    public void run() {
        init();
        loop();

        Callbacks.free(window);
        GLFW.destroyWindow(window);

        GLFW.terminate();
        GLFW.setErrorCallback(null);
    }

    private void init() {
        GLFWErrorCallback.createPrint().set();
        if (!GLFW.init()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }
        GLFW.defaultWindowHints();
        GLFW.windowHint(GLFW.VISIBLE, false);
        GLFW.windowHint(GLFW.RESIZABLE, true);
        window = GLFW.createWindow(640, 480, "OpenGL 3.0", MemoryAddress.NULL, MemoryAddress.NULL);
        if (window == MemoryAddress.NULL)
            throw new RuntimeException("Failed to create the GLFW window");
        GLFW.setKeyCallback(window, (handle, key, scancode, action, mods) -> {
            if (key == GLFW.KEY_ESCAPE && action == GLFW.RELEASE) {
                GLFW.setWindowShouldClose(window, true);
            }
        });
        GLFW.setFramebufferSizeCallback(window, (handle, width, height) ->
            GL.viewport(0, 0, width, height));
        var vidMode = GLFW.getVideoMode(GLFW.getPrimaryMonitor());
        if (vidMode != null) {
            int[] pWidth = new int[1], pHeight = new int[1];
            GLFW.getWindowSize(window, pWidth, pHeight);
            GLFW.setWindowPos(
                window,
                (vidMode.width() - pWidth[0]) / 2,
                (vidMode.height() - pHeight[0]) / 2
            );
        }

        GLFW.makeContextCurrent(window);
        GLFW.swapInterval(1);

        GLFW.showWindow(window);
    }

    private void loop() {
        if (GLCaps.load(true, GLFW::getProcAddress) == 0)
            throw new IllegalStateException("Failed to load OpenGL");

        GL.clearColor(0.4f, 0.6f, 0.9f, 1.0f);
        int program = GL.createProgram();
        int vsh = GL.createShader(GL_VERTEX_SHADER);
        int fsh = GL.createShader(GL_FRAGMENT_SHADER);
        GL.shaderSource(vsh, """
            #version 130

            in vec3 position;
            in vec3 color;

            out vec3 vertexColor;

            void main() {
                gl_Position = vec4(position, 1.0);
                vertexColor = color;
            }
            """);
        GL.shaderSource(fsh, """
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
        GL.bindAttribLocation(program, 0, "position");
        GL.bindAttribLocation(program, 1, "color");
        GL.linkProgram(program);
        GL.detachShader(program, vsh);
        GL.detachShader(program, fsh);
        GL.deleteShader(vsh);
        GL.deleteShader(fsh);
        int vao = GL.genVertexArray();
        GL.bindVertexArray(vao);
        int vbo = GL.genBuffer();
        GL.bindBuffer(GL_ARRAY_BUFFER, vbo);
        GL.bufferData(GL_ARRAY_BUFFER, new float[]{
            // Vertex          Color
            0.0f, 0.5f, 0.0f, 1.0f, 0.0f, 0.0f,
            -0.5f, -0.5f, 0.0f, 0.0f, 1.0f, 0.0f,
            0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 1.0f
        }, GL_STATIC_DRAW);
        GL.enableVertexAttribArray(0);
        GL.enableVertexAttribArray(1);
        GL.vertexAttribPointer(0, 3, GL_FLOAT, false, 24, MemoryAddress.NULL);
        GL.vertexAttribPointer(1, 3, GL_FLOAT, false, 24, MemoryAddress.ofLong(12));
        GL.bindBuffer(GL_ARRAY_BUFFER, 0);
        GL.bindVertexArray(0);

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

        GL.deleteProgram(program);
        GL.deleteVertexArray(vao);
        GL.deleteBuffer(vbo);
    }

    public static void main(String[] args) {
        new GL30Test().run();
    }
}
