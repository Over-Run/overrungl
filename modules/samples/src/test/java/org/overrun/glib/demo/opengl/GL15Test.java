package org.overrun.glib.demo.opengl;

import org.overrun.glib.gl.GL;
import org.overrun.glib.gl.GL11;
import org.overrun.glib.gl.GL15C;
import org.overrun.glib.glfw.Callbacks;
import org.overrun.glib.glfw.GLFW;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;

import static org.overrun.glib.gl.GLConst.*;

/**
 * Tests OpenGL 1.5 buffers
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL15Test {
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
        window = GLFW.createWindow(640, 480, "OpenGL 1.5", MemoryAddress.NULL, MemoryAddress.NULL);
        if (window == MemoryAddress.NULL)
            throw new RuntimeException("Failed to create the GLFW window");
        GLFW.setKeyCallback(window, (handle, key, scancode, action, mods) -> {
            if (key == GLFW.KEY_ESCAPE && action == GLFW.RELEASE) {
                GLFW.setWindowShouldClose(window, true);
            }
        });
        GLFW.setFramebufferSizeCallback(window, (handle, width, height) ->
            GL15C.viewport(0, 0, width, height));
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
        if (GL.load(GLFW::getProcAddress) == 0)
            throw new IllegalStateException("Failed to load OpenGL");

        GL15C.clearColor(0.4f, 0.6f, 0.9f, 1.0f);
        int vbo = GL15C.genBuffer();
        GL15C.bindBuffer(GL_ARRAY_BUFFER, vbo);
        GL15C.bufferData(GL_ARRAY_BUFFER, new float[]{
            // Vertex          Color
            0.0f, 0.5f, 0.0f, 1.0f, 0.0f, 0.0f,
            -0.5f, -0.5f, 0.0f, 0.0f, 1.0f, 0.0f,
            0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 1.0f
        }, GL_STATIC_DRAW);
        GL15C.bindBuffer(GL_ARRAY_BUFFER, 0);

        while (!GLFW.windowShouldClose(window)) {
            GL15C.clear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

            // Draw triangle
            GL15C.bindBuffer(GL_ARRAY_BUFFER, vbo);
            GL11.enableClientState(GL_VERTEX_ARRAY);
            GL11.enableClientState(GL_COLOR_ARRAY);
            GL11.vertexPointer(3, GL_FLOAT, 24, MemoryAddress.NULL);
            GL11.colorPointer(3, GL_FLOAT, 24, MemoryAddress.ofLong(12L));
            GL15C.drawArrays(GL_TRIANGLES, 0, 3);
            GL11.disableClientState(GL_VERTEX_ARRAY);
            GL11.disableClientState(GL_COLOR_ARRAY);
            GL15C.bindBuffer(GL_ARRAY_BUFFER, 0);

            GLFW.swapBuffers(window);

            GLFW.pollEvents();
        }

        GL15C.deleteBuffer(vbo);
    }

    public static void main(String[] args) {
        new GL15Test().run();
    }
}
