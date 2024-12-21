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

import overrungl.demo.util.IOUtil;
import overrungl.glfw.GLFW;
import overrungl.glfw.GLFWCallbacks;
import overrungl.glfw.GLFWErrorCallback;
import overrungl.opengl.GL;
import overrungl.opengl.GL11;
import overrungl.opengl.GLLegacy;
import overrungl.opengl.GLLoader;
import overrungl.util.Unmarshal;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Objects;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static overrungl.stb.STBImage.*;

/**
 * Tests OpenGL 1.5 buffers
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL15Test {
    private final GLFW glfw = GLFW.INSTANCE;
    private MemorySegment window;
    private GLLegacy gl;
    private int vbo, tex;

    public void run() {
        try (var arena = Arena.ofShared()) {
            init();
            load(arena);
        }
        loop();

        gl.deleteBuffers(vbo);
        gl.deleteTextures(tex);

        GLFWCallbacks.free(window);
        glfw.destroyWindow(window);

        glfw.terminate();
        glfw.setErrorCallback(null);
    }

    private void init() {
        GLFWErrorCallback.createPrint().set();
        if (!glfw.init()) throw new IllegalStateException("Unable to initialize GLFW");
        glfw.defaultWindowHints();
        glfw.windowHint(GLFW.VISIBLE, false);
        glfw.windowHint(GLFW.RESIZABLE, true);
        window = glfw.createWindow(640, 480, "OpenGL 1.5", MemorySegment.NULL, MemorySegment.NULL);
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
        glfw.swapInterval(1);

        glfw.showWindow(window);
    }

    private void load(Arena arena) {
        gl = Objects.requireNonNull(GLLoader.loadLegacy(GLLoader.loadFlags(glfw::getProcAddress)), "Failed to load OpenGL");

        gl.clearColor(0.4f, 0.6f, 0.9f, 1.0f);
        gl.enable(GL.TEXTURE_2D);

        vbo = gl.genBuffers();
        gl.bindBuffer(GL.ARRAY_BUFFER, vbo);
        gl.bufferData(arena, GL.ARRAY_BUFFER, new float[]{
            // Vertex          Color             Tex-coord
            0.0f, 0.5f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            -0.5f, -0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f,
            0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f
        }, GL.STATIC_DRAW);
        gl.bindBuffer(GL.ARRAY_BUFFER, 0);

        tex = gl.genTextures();
        gl.bindTexture(GL.TEXTURE_2D, tex);
        gl.texParameteri(GL.TEXTURE_2D, GL.TEXTURE_MAG_FILTER, GL.NEAREST);
        gl.texParameteri(GL.TEXTURE_2D, GL.TEXTURE_MIN_FILTER, GL.NEAREST);
        try {
            var px = arena.allocate(JAVA_INT);
            var py = arena.allocate(JAVA_INT);
            var pc = arena.allocate(JAVA_INT);
            var data = stbi_load_from_memory(
                IOUtil.ioResourceToSegment(arena, "image.png"),
                px, py, pc, STBI_rgb
            );
            if (Unmarshal.isNullPointer(data)) {
                System.err.println("Failed to load image.png: " + stbi_failure_reason());
            }
            gl.texImage2D(GL.TEXTURE_2D,
                0,
                GL.RGB,
                px.get(JAVA_INT, 0),
                py.get(JAVA_INT, 0),
                0,
                GL.RGB,
                GL.UNSIGNED_BYTE,
                data);
            stbi_image_free(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        gl.bindTexture(GL.TEXTURE_2D, 0);
    }

    private void loop() {
        while (!glfw.windowShouldClose(window)) {
            gl.clear(GL.COLOR_BUFFER_BIT | GL.DEPTH_BUFFER_BIT);

            // Draw triangle
            gl.bindTexture(GL.TEXTURE_2D, tex);
            gl.bindBuffer(GL.ARRAY_BUFFER, vbo);
            gl.enableClientState(GL11.VERTEX_ARRAY);
            gl.enableClientState(GL11.COLOR_ARRAY);
            gl.enableClientState(GL11.TEXTURE_COORD_ARRAY);
            // 8 floats = 32 bytes
            final int stride = 8 << 2;
            gl.vertexPointer(3, GL.FLOAT, stride, MemorySegment.NULL);
            gl.colorPointer(3, GL.FLOAT, stride, MemorySegment.ofAddress(3 << 2));
            gl.texCoordPointer(2, GL.FLOAT, stride, MemorySegment.ofAddress(6 << 2));
            gl.drawArrays(GL.TRIANGLES, 0, 3);
            gl.disableClientState(GL11.VERTEX_ARRAY);
            gl.disableClientState(GL11.COLOR_ARRAY);
            gl.disableClientState(GL11.TEXTURE_COORD_ARRAY);
            gl.bindBuffer(GL.ARRAY_BUFFER, 0);
            gl.bindTexture(GL.TEXTURE_2D, 0);

            glfw.swapBuffers(window);

            glfw.pollEvents();
        }
    }

    public static void main(String[] args) {
        new GL15Test().run();
    }
}
