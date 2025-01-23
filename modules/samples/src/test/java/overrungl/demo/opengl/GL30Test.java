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

import overrungl.demo.util.IOUtil;
import overrungl.glfw.*;
import overrungl.opengl.GL;
import overrungl.util.MemoryStack;
import overrungl.util.MemoryUtil;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.glfw.GLFW.*;
import static overrungl.opengl.GL.*;
import static overrungl.stb.STBImage.*;

/**
 * Tests OpenGL 3.0 vertex arrays
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL30Test {
    private Arena windowArena;
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

        gl.DeleteProgram(program);
        gl.DeleteVertexArrays(vao);
        gl.DeleteBuffers(vbo);
        gl.DeleteBuffers(ebo);
        gl.DeleteTextures(tex);

        glfwDestroyWindow(window);
        windowArena.close();

        glfwTerminate();
        glfwSetErrorCallback(MemorySegment.NULL);
    }

    private void init() {
        glfwSetErrorCallback(GLFWErrorCallback.createPrint().stub(Arena.global()));
        if (!glfwInit()) throw new IllegalStateException("Unable to initialize GLFW");
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        windowArena = Arena.ofConfined();
        window = glfwCreateWindow(640, 480, MemoryUtil.allocString("OpenGL 3.0"), MemorySegment.NULL, MemorySegment.NULL);
        if (MemoryUtil.isNullPointer(window)) throw new IllegalStateException("Failed to create the GLFW window");
        glfwSetKeyCallback(window, GLFWKeyFun.alloc(windowArena, (_, key, _, action, _) -> {
            if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                glfwSetWindowShouldClose(window, true);
            }
        }));
        glfwSetFramebufferSizeCallback(window, GLFWFramebufferSizeFun.alloc(windowArena, (_, width, height) ->
            gl.Viewport(0, 0, width, height)));
        var vidMode = GLFWVidMode.ofNative(glfwGetVideoMode(glfwGetPrimaryMonitor()));
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
        glfwSwapInterval(1);

        glfwShowWindow(window);
    }

    private void load(Arena arena) {
        gl = new GL(GLFW::glfwGetProcAddress);

        gl.ClearColor(0.4f, 0.6f, 0.9f, 1.0f);

        tex = gl.GenTextures();
        gl.BindTexture(GL_TEXTURE_2D, tex);
        gl.TexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
        gl.TexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var px = stack.allocate(JAVA_INT);
            var py = stack.allocate(JAVA_INT);
            var pc = stack.allocate(JAVA_INT);
            var data = stbi_load_from_memory(
                IOUtil.ioResourceToSegment(arena, "image.png"),
                px, py, pc, STBI_rgb
            );
            gl.TexImage2D(GL_TEXTURE_2D,
                0,
                GL_RGB,
                px.get(JAVA_INT, 0),
                py.get(JAVA_INT, 0),
                0,
                GL_RGB,
                GL_UNSIGNED_BYTE,
                data);
            stbi_image_free(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        gl.BindTexture(GL_TEXTURE_2D, 0);
        program = gl.CreateProgram();
        int vsh = gl.CreateShader(GL_VERTEX_SHADER);
        int fsh = gl.CreateShader(GL_FRAGMENT_SHADER);
        gl.ShaderSource(vsh, """
            #version 130

            in vec3 position;
            in vec2 uv;

            out vec2 texCoord;

            void main() {
                gl_Position = vec4(position, 1.0);
                texCoord = uv;
            }
            """);
        gl.ShaderSource(fsh, """
            #version 130

            in vec2 texCoord;

            out vec4 fragColor;

            uniform sampler2D sampler;
            uniform float colorFactor;

            void main() {
                fragColor = colorFactor * texture(sampler, texCoord);
            }
            """);
        gl.CompileShader(vsh);
        gl.CompileShader(fsh);
        gl.AttachShader(program, vsh);
        gl.AttachShader(program, fsh);
        gl.BindAttribLocation(program, 0, "position");
        gl.BindAttribLocation(program, 1, "uv");
        gl.LinkProgram(program);
        gl.DetachShader(program, vsh);
        gl.DetachShader(program, fsh);
        gl.DeleteShader(vsh);
        gl.DeleteShader(fsh);
        gl.UseProgram(program);
        gl.Uniform1i(gl.GetUniformLocation(program, "sampler"), 0);
        gl.UseProgram(0);

        vao = gl.GenVertexArrays();
        gl.BindVertexArray(vao);
        vbo = gl.GenBuffers();
        gl.BindBuffer(GL_ARRAY_BUFFER, vbo);
        gl.BufferData(GL_ARRAY_BUFFER, arena.allocateFrom(JAVA_FLOAT,
            // Vertex          UV
            -0.5f, 0.5f, 0.0f, 0.0f, 0.0f,
            -0.5f, -0.5f, 0.0f, 0.0f, 1.0f,
            0.5f, -0.5f, 0.0f, 1.0f, 1.0f,
            0.5f, 0.5f, 0.0f, 1.0f, 0.0f
        ), GL_STATIC_DRAW);
        ebo = gl.GenBuffers();
        gl.BindBuffer(GL_ELEMENT_ARRAY_BUFFER, ebo);
        gl.BufferData(GL_ELEMENT_ARRAY_BUFFER, arena.allocateFrom(JAVA_BYTE, new byte[]{
            0, 1, 2, 0, 2, 3
        }), GL_STATIC_DRAW);
        gl.EnableVertexAttribArray(0);
        gl.EnableVertexAttribArray(1);
        gl.VertexAttribPointer(0, 3, GL_FLOAT, false, 20, MemorySegment.NULL);
        gl.VertexAttribPointer(1, 2, GL_FLOAT, false, 20, MemorySegment.ofAddress(12));
        gl.BindBuffer(GL_ARRAY_BUFFER, 0);
        gl.BindVertexArray(0);

        colorFactor = gl.GetUniformLocation(program, "colorFactor");
    }

    private void loop() {
        while (!glfwWindowShouldClose(window)) {
            gl.Clear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

            // Draw triangle
            gl.BindTexture(GL_TEXTURE_2D, tex);
            gl.UseProgram(program);
            gl.Uniform1f(colorFactor, (float) ((Math.sin(glfwGetTime() * 2) + 1 * 0.5) * 0.6 + 0.4));
            gl.BindVertexArray(vao);
            gl.DrawElements(GL_TRIANGLES, 6, GL_UNSIGNED_BYTE, MemorySegment.NULL);
            gl.BindVertexArray(0);
            gl.UseProgram(0);
            gl.BindTexture(GL_TEXTURE_2D, 0);

            glfwSwapBuffers(window);

            glfwPollEvents();
        }
    }

    public static void main(String[] args) {
        new GL30Test().run();
    }
}
