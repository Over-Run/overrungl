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

import org.overrun.glib.demo.util.IOUtil;
import org.overrun.glib.gl.GL;
import org.overrun.glib.gl.GLLoader;
import org.overrun.glib.glfw.Callbacks;
import org.overrun.glib.glfw.GLFW;
import org.overrun.glib.glfw.GLFWErrorCallback;
import org.overrun.glib.stb.STBImage;

import java.io.IOException;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static org.overrun.glib.gl.GLConstC.*;

/**
 * Tests OpenGL 3.0 vertex arrays
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL30Test {
    private MemoryAddress window;
    private int program;
    private int colorFactor;
    private int vao, vbo, ebo;
    private int tex;

    public void run() {
        try (var arena = MemorySession.openShared()) {
            init(arena);
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

    private void init(MemorySession arena) {
        GLFWErrorCallback.createPrint().set();
        if (!GLFW.init()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }
        GLFW.defaultWindowHints();
        GLFW.windowHint(GLFW.VISIBLE, false);
        GLFW.windowHint(GLFW.RESIZABLE, true);
        window = GLFW.createWindow(arena, 640, 480, "OpenGL 3.0", MemoryAddress.NULL, MemoryAddress.NULL);
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
        if (GLLoader.loadConfined(true, GLFW::getProcAddress) == null)
            throw new IllegalStateException("Failed to load OpenGL");

        GL.clearColor(0.4f, 0.6f, 0.9f, 1.0f);

        tex = GL.genTexture();
        GL.bindTexture(GL_TEXTURE_2D, tex);
        GL.texParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
        GL.texParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
        try {
            var px = arena.allocate(JAVA_INT);
            var py = arena.allocate(JAVA_INT);
            var pc = arena.allocate(JAVA_INT);
            var data = STBImage.loadFromMemory(
                IOUtil.ioResourceToSegment(arena, "image.png", 256),
                px, py, pc, STBImage.RGB
            );
            GL.texImage2D(GL_TEXTURE_2D,
                0,
                GL_RGB,
                px.get(JAVA_INT, 0),
                py.get(JAVA_INT, 0),
                0,
                GL_RGB,
                GL_UNSIGNED_BYTE,
                data);
            STBImage.free(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        GL.bindTexture(GL_TEXTURE_2D, 0);
        program = GL.createProgram();
        int vsh = GL.createShader(GL_VERTEX_SHADER);
        int fsh = GL.createShader(GL_FRAGMENT_SHADER);
        GL.shaderSource(arena, vsh, """
            #version 130

            in vec3 position;
            in vec2 uv;

            out vec2 texCoord;

            void main() {
                gl_Position = vec4(position, 1.0);
                texCoord = uv;
            }
            """);
        GL.shaderSource(arena, fsh, """
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
        GL.bindAttribLocation(arena, program, 0, "position");
        GL.bindAttribLocation(arena, program, 1, "uv");
        GL.linkProgram(program);
        GL.detachShader(program, vsh);
        GL.detachShader(program, fsh);
        GL.deleteShader(vsh);
        GL.deleteShader(fsh);
        GL.useProgram(program);
        GL.uniform1i(GL.getUniformLocation(arena, program, "sampler"), 0);
        GL.useProgram(0);

        vao = GL.genVertexArray();
        GL.bindVertexArray(vao);
        vbo = GL.genBuffer();
        GL.bindBuffer(GL_ARRAY_BUFFER, vbo);
        GL.bufferData(arena, GL_ARRAY_BUFFER, new float[]{
            // Vertex          UV
            -0.5f, 0.5f, 0.0f, 0.0f, 0.0f,
            -0.5f, -0.5f, 0.0f, 0.0f, 1.0f,
            0.5f, -0.5f, 0.0f, 1.0f, 1.0f,
            0.5f, 0.5f, 0.0f, 1.0f, 0.0f
        }, GL_STATIC_DRAW);
        ebo = GL.genBuffer();
        GL.bindBuffer(GL_ELEMENT_ARRAY_BUFFER, ebo);
        GL.bufferData(arena, GL_ELEMENT_ARRAY_BUFFER, new byte[]{
            0, 1, 2, 0, 2, 3
        }, GL_STATIC_DRAW);
        GL.enableVertexAttribArray(0);
        GL.enableVertexAttribArray(1);
        GL.vertexAttribPointer(0, 3, GL_FLOAT, false, 20, MemoryAddress.NULL);
        GL.vertexAttribPointer(1, 2, GL_FLOAT, false, 20, MemoryAddress.ofLong(12));
        GL.bindBuffer(GL_ARRAY_BUFFER, 0);
        GL.bindVertexArray(0);

        colorFactor = GL.getUniformLocation(arena, program, "colorFactor");
    }

    private void loop() {
        while (!GLFW.windowShouldClose(window)) {
            GL.clear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

            // Draw triangle
            GL.bindTexture(GL_TEXTURE_2D, tex);
            GL.useProgram(program);
            GL.uniform1f(colorFactor, (float) ((Math.sin(GLFW.getTime() * 2) + 1 * 0.5) * 0.6 + 0.4));
            GL.bindVertexArray(vao);
            GL.drawElements(GL_TRIANGLES, 6, GL_UNSIGNED_BYTE, MemoryAddress.NULL);
            GL.bindVertexArray(0);
            GL.useProgram(0);
            GL.bindTexture(GL_TEXTURE_2D, 0);

            GLFW.swapBuffers(window);

            GLFW.pollEvents();
        }
    }

    public static void main(String[] args) {
        new GL30Test().run();
    }
}
