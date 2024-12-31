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
import overrungl.opengl.GLLoader;
import overrungl.util.MemoryStack;
import overrungl.util.Unmarshal;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Objects;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static overrungl.glfw.GLFW.*;
import static overrungl.stb.STBImage.*;

/**
 * Tests OpenGL 3.0 vertex arrays
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL30Test {
    private final GLFW glfw = GLFW.INSTANCE;
    private MemorySegment window;
    private GL gl;
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

        gl.deleteProgram(program);
        gl.deleteVertexArrays(vao);
        gl.deleteBuffers(vbo, ebo);
        gl.deleteTextures(tex);

        GLFWCallbacks.free(window);
        glfwDestroyWindow(window);

        glfwTerminate();
        glfwSetErrorCallback(MemorySegment.NULL);
    }

    private void init() {
        glfwSetErrorCallback(GLFWErrorCallback.createPrint());
        if (!glfwInit()) throw new IllegalStateException("Unable to initialize GLFW");
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        window = glfwCreateWindow(640, 480, "OpenGL 3.0", MemorySegment.NULL, MemorySegment.NULL);
        if (Unmarshal.isNullPointer(window)) throw new IllegalStateException("Failed to create the GLFW window");
        glfw.setKeyCallback(window, (_, key, _, action, _) -> {
            if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                glfwSetWindowShouldClose(window, true);
            }
        });
        glfwSetFramebufferSizeCallback(window, (_, width, height) ->
            gl.viewport(0, 0, width, height));
        var vidMode = glfwGetVideoMode(glfwGetPrimaryMonitor());
        if (vidMode != null) {
            var size = glfwGetWindowSize(window);
            glfwSetWindowPos(
                window,
                (vidMode.width() - size.x()) / 2,
                (vidMode.height() - size.y()) / 2
            );
        }

        glfw.makeContextCurrent(window);
        glfw.swapInterval(1);

        glfwShowWindow(window);
    }

    private void load(Arena arena) {
        gl = Objects.requireNonNull(GLLoader.load(GLLoader.loadFlags(glfw::getProcAddress)), "Failed to load OpenGL");

        gl.clearColor(0.4f, 0.6f, 0.9f, 1.0f);

        tex = gl.genTextures();
        gl.bindTexture(GL.TEXTURE_2D, tex);
        gl.texParameteri(GL.TEXTURE_2D, GL.TEXTURE_MAG_FILTER, GL.NEAREST);
        gl.texParameteri(GL.TEXTURE_2D, GL.TEXTURE_MIN_FILTER, GL.NEAREST);
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var px = stack.allocate(JAVA_INT);
            var py = stack.allocate(JAVA_INT);
            var pc = stack.allocate(JAVA_INT);
            var data = stbi_load_from_memory(
                IOUtil.ioResourceToSegment(arena, "image.png"),
                px, py, pc, STBI_rgb
            );
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
        program = gl.createProgram();
        int vsh = gl.createShader(GL.VERTEX_SHADER);
        int fsh = gl.createShader(GL.FRAGMENT_SHADER);
        gl.shaderSource(vsh, """
            #version 130

            in vec3 position;
            in vec2 uv;

            out vec2 texCoord;

            void main() {
                gl_Position = vec4(position, 1.0);
                texCoord = uv;
            }
            """);
        gl.shaderSource(fsh, """
            #version 130

            in vec2 texCoord;

            out vec4 fragColor;

            uniform sampler2D sampler;
            uniform float colorFactor;

            void main() {
                fragColor = colorFactor * texture(sampler, texCoord);
            }
            """);
        gl.compileShader(vsh);
        gl.compileShader(fsh);
        gl.attachShader(program, vsh);
        gl.attachShader(program, fsh);
        gl.bindAttribLocation(program, 0, "position");
        gl.bindAttribLocation(program, 1, "uv");
        gl.linkProgram(program);
        gl.detachShader(program, vsh);
        gl.detachShader(program, fsh);
        gl.deleteShader(vsh);
        gl.deleteShader(fsh);
        gl.useProgram(program);
        gl.uniform1i(gl.getUniformLocation(program, "sampler"), 0);
        gl.useProgram(0);

        vao = gl.genVertexArrays();
        gl.bindVertexArray(vao);
        vbo = gl.genBuffers();
        gl.bindBuffer(GL.ARRAY_BUFFER, vbo);
        gl.bufferData(arena, GL.ARRAY_BUFFER, new float[]{
            // Vertex          UV
            -0.5f, 0.5f, 0.0f, 0.0f, 0.0f,
            -0.5f, -0.5f, 0.0f, 0.0f, 1.0f,
            0.5f, -0.5f, 0.0f, 1.0f, 1.0f,
            0.5f, 0.5f, 0.0f, 1.0f, 0.0f
        }, GL.STATIC_DRAW);
        ebo = gl.genBuffers();
        gl.bindBuffer(GL.ELEMENT_ARRAY_BUFFER, ebo);
        gl.bufferData(arena, GL.ELEMENT_ARRAY_BUFFER, new byte[]{
            0, 1, 2, 0, 2, 3
        }, GL.STATIC_DRAW);
        gl.enableVertexAttribArray(0);
        gl.enableVertexAttribArray(1);
        gl.vertexAttribPointer(0, 3, GL.FLOAT, false, 20, MemorySegment.NULL);
        gl.vertexAttribPointer(1, 2, GL.FLOAT, false, 20, MemorySegment.ofAddress(12));
        gl.bindBuffer(GL.ARRAY_BUFFER, 0);
        gl.bindVertexArray(0);

        colorFactor = gl.getUniformLocation(program, "colorFactor");
    }

    private void loop() {
        while (!glfwWindowShouldClose(window)) {
            gl.clear(GL.COLOR_BUFFER_BIT | GL.DEPTH_BUFFER_BIT);

            // Draw triangle
            gl.bindTexture(GL.TEXTURE_2D, tex);
            gl.useProgram(program);
            gl.uniform1f(colorFactor, (float) ((Math.sin(glfw.getTime() * 2) + 1 * 0.5) * 0.6 + 0.4));
            gl.bindVertexArray(vao);
            gl.drawElements(GL.TRIANGLES, 6, GL.UNSIGNED_BYTE, MemorySegment.NULL);
            gl.bindVertexArray(0);
            gl.useProgram(0);
            gl.bindTexture(GL.TEXTURE_2D, 0);

            glfw.swapBuffers(window);

            glfwPollEvents();
        }
    }

    public static void main(String[] args) {
        new GL30Test().run();
    }
}
