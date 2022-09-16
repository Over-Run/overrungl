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
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySession;

import static java.lang.foreign.MemoryLayout.PathElement.sequenceElement;
import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static org.overrun.glib.gl.GLConstC.*;

/**
 * Tests OpenGL 3.3 instanced rendering
 *
 * @author squid233
 * @since 0.1.0
 */
public class GL33Test {
    private static final int INSTANCE_COUNT = 10 * 10;
    private static final String WND_TITLE = "OpenGL 3.3";
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
        GLFW.windowHint(GLFW.CONTEXT_VERSION_MAJOR, 3);
        GLFW.windowHint(GLFW.CONTEXT_VERSION_MINOR, 3);
        GLFW.windowHint(GLFW.OPENGL_PROFILE, GLFW.OPENGL_CORE_PROFILE);
        window = GLFW.createWindow(640, 480, WND_TITLE, MemoryAddress.NULL, MemoryAddress.NULL);
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

        int rotationMat = GL.getUniformLocation(program, "rotationMat");

        int vao = GL.genVertexArray();
        GL.bindVertexArray(vao);
        int vbo = GL.genBuffer();
        GL.bindBuffer(GL_ARRAY_BUFFER, vbo);
        GL.bufferData(GL_ARRAY_BUFFER, new float[]{
            // Vertex          Color
            -0.5f, 0.5f, 0.0f, 1.0f, 0.0f, 0.0f,
            -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 1.0f,
            0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f,
            0.5f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f
        }, GL_STATIC_DRAW);
        int ebo = GL.genBuffer();
        GL.bindBuffer(GL_ELEMENT_ARRAY_BUFFER, ebo);
        GL.bufferData(GL_ELEMENT_ARRAY_BUFFER, new byte[]{
            0, 1, 2, 2, 3, 0
        }, GL_STATIC_DRAW);
        GL.enableVertexAttribArray(0);
        GL.enableVertexAttribArray(1);
        GL.vertexAttribPointer(0, 3, GL_FLOAT, false, 24, MemoryAddress.NULL);
        GL.vertexAttribPointer(1, 3, GL_FLOAT, false, 24, MemoryAddress.ofLong(12));
        int mbo = GL.genBuffer();
        GL.bindBuffer(GL_ARRAY_BUFFER, mbo);
        try (var session = MemorySession.openShared()) {
            var iseq = MemoryLayout.sequenceLayout(
                INSTANCE_COUNT,
                MemoryLayout.sequenceLayout(4 * 4, JAVA_FLOAT)
            );
            //region Var handles
            var handle00 = iseq.varHandle(sequenceElement(), sequenceElement(0));
            var handle01 = iseq.varHandle(sequenceElement(), sequenceElement(1));
            var handle02 = iseq.varHandle(sequenceElement(), sequenceElement(2));
            var handle03 = iseq.varHandle(sequenceElement(), sequenceElement(3));
            var handle10 = iseq.varHandle(sequenceElement(), sequenceElement(4));
            var handle11 = iseq.varHandle(sequenceElement(), sequenceElement(5));
            var handle12 = iseq.varHandle(sequenceElement(), sequenceElement(6));
            var handle13 = iseq.varHandle(sequenceElement(), sequenceElement(7));
            var handle20 = iseq.varHandle(sequenceElement(), sequenceElement(8));
            var handle21 = iseq.varHandle(sequenceElement(), sequenceElement(9));
            var handle22 = iseq.varHandle(sequenceElement(), sequenceElement(10));
            var handle23 = iseq.varHandle(sequenceElement(), sequenceElement(11));
            var handle30 = iseq.varHandle(sequenceElement(), sequenceElement(12));
            var handle31 = iseq.varHandle(sequenceElement(), sequenceElement(13));
            var handle32 = iseq.varHandle(sequenceElement(), sequenceElement(14));
            var handle33 = iseq.varHandle(sequenceElement(), sequenceElement(15));
            //endregion
            var matrices = session.allocate(iseq);
            float mul = (float) Math.sqrt(INSTANCE_COUNT);
            float scaling = 1f / mul;
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
                handle00.set(matrices, i, scaling);
                handle01.set(matrices, i, 0.0f);
                handle02.set(matrices, i, 0.0f);
                handle03.set(matrices, i, 0.0f);
                handle10.set(matrices, i, 0.0f);
                handle11.set(matrices, i, scaling);
                handle12.set(matrices, i, 0.0f);
                handle13.set(matrices, i, 0.0f);
                handle20.set(matrices, i, 0.0f);
                handle21.set(matrices, i, 0.0f);
                handle22.set(matrices, i, 1.0f);
                handle23.set(matrices, i, 0.0f);
                handle30.set(matrices, i, translations[i * 2]);
                handle31.set(matrices, i, translations[i * 2 + 1]);
                handle32.set(matrices, i, 0.0f);
                handle33.set(matrices, i, 1.0f);
            }
            GL.bufferData(GL_ARRAY_BUFFER, matrices.byteSize(), matrices, GL_STATIC_DRAW);
        }
        GL.enableVertexAttribArray(2);
        GL.enableVertexAttribArray(3);
        GL.enableVertexAttribArray(4);
        GL.enableVertexAttribArray(5);
        GL.vertexAttribPointer(2, 4, GL_FLOAT, false, 64, MemoryAddress.NULL);
        GL.vertexAttribPointer(3, 4, GL_FLOAT, false, 64, MemoryAddress.ofLong(16));
        GL.vertexAttribPointer(4, 4, GL_FLOAT, false, 64, MemoryAddress.ofLong(32));
        GL.vertexAttribPointer(5, 4, GL_FLOAT, false, 64, MemoryAddress.ofLong(48));
        GL.vertexAttribDivisor(2, 1);
        GL.vertexAttribDivisor(3, 1);
        GL.vertexAttribDivisor(4, 1);
        GL.vertexAttribDivisor(5, 1);
        GL.bindBuffer(GL_ARRAY_BUFFER, 0);
        GL.bindVertexArray(0);

        var pRotationMat = MemorySession.openImplicit().allocateArray(JAVA_FLOAT,
            1f, 0f, 0f, 0f,
            0f, 1f, 0f, 0f,
            0f, 0f, 1f, 0f,
            0f, 0f, 0f, 1f
        );

        double lastTime;
        double time;

        while (!GLFW.windowShouldClose(window)) {
            time = GLFW.getTime();

            GL.clear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

            // Draw triangle
            GL.useProgram(program);

            double rotXY = GLFW.getTime() * 0.01;
            //region Rotation matrix
            float sin = (float) Math.sin(rotXY);
            float cos = (float) Math.cos(rotXY);
            float nm00 = pRotationMat.get(JAVA_FLOAT, 0) * cos + pRotationMat.getAtIndex(JAVA_FLOAT, 4) * sin;
            float nm01 = pRotationMat.getAtIndex(JAVA_FLOAT, 1) * cos + pRotationMat.getAtIndex(JAVA_FLOAT, 5) * sin;
            float nm02 = pRotationMat.getAtIndex(JAVA_FLOAT, 2) * cos + pRotationMat.getAtIndex(JAVA_FLOAT, 6) * sin;
            float nm03 = pRotationMat.getAtIndex(JAVA_FLOAT, 3) * cos + pRotationMat.getAtIndex(JAVA_FLOAT, 7) * sin;
            pRotationMat.setAtIndex(JAVA_FLOAT, 4, pRotationMat.get(JAVA_FLOAT, 0) * -sin + pRotationMat.getAtIndex(JAVA_FLOAT, 4) * cos);
            pRotationMat.setAtIndex(JAVA_FLOAT, 5, pRotationMat.getAtIndex(JAVA_FLOAT, 1) * -sin + pRotationMat.getAtIndex(JAVA_FLOAT, 5) * cos);
            pRotationMat.setAtIndex(JAVA_FLOAT, 6, pRotationMat.getAtIndex(JAVA_FLOAT, 2) * -sin + pRotationMat.getAtIndex(JAVA_FLOAT, 6) * cos);
            pRotationMat.setAtIndex(JAVA_FLOAT, 7, pRotationMat.getAtIndex(JAVA_FLOAT, 3) * -sin + pRotationMat.getAtIndex(JAVA_FLOAT, 7) * cos);
            pRotationMat.set(JAVA_FLOAT, 0, nm00);
            pRotationMat.setAtIndex(JAVA_FLOAT, 1, nm01);
            pRotationMat.setAtIndex(JAVA_FLOAT, 2, nm02);
            pRotationMat.setAtIndex(JAVA_FLOAT, 3, nm03);
            //endregion

            GL.uniformMatrix4fv(rotationMat, 1, false, pRotationMat);
            GL.bindVertexArray(vao);
            GL.drawElementsInstanced(GL_TRIANGLES, 6, GL_UNSIGNED_BYTE, MemoryAddress.NULL, INSTANCE_COUNT);
            GL.bindVertexArray(0);
            GL.useProgram(0);

            GLFW.swapBuffers(window);

            GLFW.pollEvents();

            lastTime = time;
            time = GLFW.getTime();
            double dt = time - lastTime;
            GLFW.setWindowTitle(window, WND_TITLE + " Delta time: " + dt + ", Frequency: " + (int) (1.0 / dt));
        }

        GL.deleteProgram(program);
        GL.deleteVertexArray(vao);
        GL.deleteBuffer(vbo);
        GL.deleteBuffer(ebo);
        GL.deleteBuffer(mbo);
    }

    public static void main(String[] args) {
        new GL33Test().run();
    }
}
