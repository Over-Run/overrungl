package org.overrun.glib.demo.opengl;

import org.overrun.glib.gl.GLCaps;
import org.overrun.glib.gl.GL30C;
import org.overrun.glib.glfw.Callbacks;
import org.overrun.glib.glfw.GLFW;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;

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

        Callbacks.glfwFreeCallbacks(window);
        GLFW.destroyWindow(window);

        GLFW.terminate();
        GLFW.setErrorCallback(null);
    }

    private void init() {
        GLFW.setErrorCallback((errorCode, description) ->
            System.err.println("GLFW Error " + errorCode + ": " + description));
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
            GL30C.viewport(0, 0, width, height));
        var vidMode = GLFW.getVideoMode(GLFW.getPrimaryMonitor());
        if (vidMode != null) {
            try (var session = MemorySession.openShared()) {
                var pWidth = session.allocate(ValueLayout.JAVA_INT);
                var pHeight = session.allocate(ValueLayout.JAVA_INT);
                GLFW.ngetWindowSize(window, pWidth.address(), pHeight.address());
                GLFW.setWindowPos(
                    window,
                    (vidMode.width() - pWidth.get(ValueLayout.JAVA_INT, 0L)) / 2,
                    (vidMode.height() - pHeight.get(ValueLayout.JAVA_INT, 0L)) / 2
                );
            }
        }

        GLFW.makeContextCurrent(window);
        GLFW.swapInterval(1);

        GLFW.showWindow(window);
    }

    private void loop() {
        if (GLCaps.load(true, GLFW::getProcAddress) == 0)
            throw new IllegalStateException("Failed to load OpenGL");

        GL30C.clearColor(0.4f, 0.6f, 0.9f, 1.0f);
        int program = GL30C.createProgram();
        int vsh = GL30C.createShader(GL_VERTEX_SHADER);
        int fsh = GL30C.createShader(GL_FRAGMENT_SHADER);
        GL30C.shaderSource(vsh, """
            #version 130

            in vec3 position;
            in vec3 color;

            out vec3 vertexColor;

            void main() {
                gl_Position = vec4(position, 1.0);
                vertexColor = color;
            }
            """);
        GL30C.shaderSource(fsh, """
            #version 130

            in vec3 vertexColor;

            out vec4 fragColor;

            void main() {
                fragColor = vec4(vertexColor, 1.0);
            }
            """);
        GL30C.compileShader(vsh);
        GL30C.compileShader(fsh);
        GL30C.attachShader(program, vsh);
        GL30C.attachShader(program, fsh);
        GL30C.bindAttribLocation(program, 0, "position");
        GL30C.bindAttribLocation(program, 1, "color");
        GL30C.linkProgram(program);
        GL30C.detachShader(program, vsh);
        GL30C.detachShader(program, fsh);
        GL30C.deleteShader(vsh);
        GL30C.deleteShader(fsh);
        int vao = GL30C.genVertexArray();
        GL30C.bindVertexArray(vao);
        int vbo = GL30C.genBuffer();
        GL30C.bindBuffer(GL_ARRAY_BUFFER, vbo);
        GL30C.bufferData(GL_ARRAY_BUFFER, new float[]{
            // Vertex          Color
            0.0f, 0.5f, 0.0f, 1.0f, 0.0f, 0.0f,
            -0.5f, -0.5f, 0.0f, 0.0f, 1.0f, 0.0f,
            0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 1.0f
        }, GL_STATIC_DRAW);
        GL30C.enableVertexAttribArray(0);
        GL30C.enableVertexAttribArray(1);
        GL30C.vertexAttribPointer(0, 3, GL_FLOAT, false, 24, MemoryAddress.NULL);
        GL30C.vertexAttribPointer(1, 3, GL_FLOAT, false, 24, MemoryAddress.ofLong(12L));
        GL30C.bindBuffer(GL_ARRAY_BUFFER, 0);
        GL30C.bindVertexArray(0);

        while (!GLFW.windowShouldClose(window)) {
            GL30C.clear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

            // Draw triangle
            GL30C.useProgram(program);
            GL30C.bindVertexArray(vao);
            GL30C.drawArrays(GL_TRIANGLES, 0, 3);
            GL30C.bindVertexArray(0);
            GL30C.useProgram(0);

            GLFW.swapBuffers(window);

            GLFW.pollEvents();
        }

        GL30C.deleteProgram(program);
        GL30C.deleteVertexArray(vao);
        GL30C.deleteBuffer(vbo);
    }

    public static void main(String[] args) {
        new GL30Test().run();
    }
}
