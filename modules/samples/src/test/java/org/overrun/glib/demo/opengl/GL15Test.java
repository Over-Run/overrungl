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

import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.demo.util.IOUtil;
import org.overrun.glib.gl.GL;
import org.overrun.glib.gl.GL11;
import org.overrun.glib.gl.GLLoader;
import org.overrun.glib.glfw.Callbacks;
import org.overrun.glib.glfw.GLFW;
import org.overrun.glib.glfw.GLFWErrorCallback;
import org.overrun.glib.stb.STBImage;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static org.overrun.glib.gl.GLConst.*;

/**
 * Tests OpenGL 1.5 buffers
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL15Test {
    private MemorySegment window;
    private int vbo, tex;

    public void run() {
        try (var arena = Arena.openShared()) {
            init(arena);
            load(arena);
        }
        loop();

        GL.deleteBuffer(vbo);
        GL.deleteTexture(tex);

        Callbacks.free(window);
        GLFW.destroyWindow(window);

        GLFW.terminate();
        GLFW.setErrorCallback(null);
    }

    private void init(Arena arena) {
        GLFWErrorCallback.createPrint().set();
        if (!GLFW.init()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }
        GLFW.defaultWindowHints();
        GLFW.windowHint(GLFW.VISIBLE, false);
        GLFW.windowHint(GLFW.RESIZABLE, true);
        window = GLFW.createWindow(arena, 640, 480, "OpenGL 1.5", MemorySegment.NULL, MemorySegment.NULL);
        if (window.address() == RuntimeHelper.NULL_ADDR)
            throw new RuntimeException("Failed to create the GLFW window");
        GLFW.setKeyCallback(window, (handle, key, scancode, action, mods) -> {
            if (key == GLFW.KEY_ESCAPE && action == GLFW.RELEASE) {
                GLFW.setWindowShouldClose(window, true);
            }
        });
        GLFW.setFramebufferSizeCallback(window, (handle, width, height) ->
            GL.viewport(0, 0, width, height));
        var vidMode = GLFW.getVideoMode(arena.scope(), GLFW.getPrimaryMonitor());
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
        if (GLLoader.loadConfined(GLFW::getProcAddress) == null)
            throw new IllegalStateException("Failed to load OpenGL");

        GL.clearColor(0.4f, 0.6f, 0.9f, 1.0f);
        GL.enable(GL_TEXTURE_2D);

        vbo = GL.genBuffer();
        GL.bindBuffer(GL_ARRAY_BUFFER, vbo);
        GL.bufferData(arena, GL_ARRAY_BUFFER, new float[]{
            // Vertex          Color             Tex-coord
            0.0f, 0.5f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            -0.5f, -0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f,
            0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f
        }, GL_STATIC_DRAW);
        GL.bindBuffer(GL_ARRAY_BUFFER, 0);

        tex = GL.genTexture();
        GL.bindTexture(GL_TEXTURE_2D, tex);
        GL.texParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
        GL.texParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
        try {
            var px = arena.allocate(JAVA_INT);
            var py = arena.allocate(JAVA_INT);
            var pc = arena.allocate(JAVA_INT);
            var data = STBImage.loadFromMemory(
                IOUtil.ioResourceToSegment(arena.scope(), "image.png", 256),
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
    }

    private void loop() {
        while (!GLFW.windowShouldClose(window)) {
            GL.clear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

            // Draw triangle
            GL.bindTexture(GL_TEXTURE_2D, tex);
            GL.bindBuffer(GL_ARRAY_BUFFER, vbo);
            GL11.enableClientState(GL_VERTEX_ARRAY);
            GL11.enableClientState(GL_COLOR_ARRAY);
            GL11.enableClientState(GL_TEXTURE_COORD_ARRAY);
            // 8 double words = 32 bytes
            final int stride = 8 << 2;
            GL11.vertexPointer(3, GL_FLOAT, stride, MemorySegment.NULL);
            GL11.colorPointer(3, GL_FLOAT, stride, MemorySegment.ofAddress(3 << 2));
            GL11.texCoordPointer(2, GL_FLOAT, stride, MemorySegment.ofAddress(6 << 2));
            GL.drawArrays(GL_TRIANGLES, 0, 3);
            GL11.disableClientState(GL_VERTEX_ARRAY);
            GL11.disableClientState(GL_COLOR_ARRAY);
            GL11.disableClientState(GL_TEXTURE_COORD_ARRAY);
            GL.bindBuffer(GL_ARRAY_BUFFER, 0);
            GL.bindTexture(GL_TEXTURE_2D, 0);

            GLFW.swapBuffers(window);

            GLFW.pollEvents();
        }
    }

    public static void main(String[] args) {
        new GL15Test().run();
    }
}
