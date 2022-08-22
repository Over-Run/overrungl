package org.overrun.glib.demo.glfw;

import org.overrun.glib.gl.GLCaps;
import org.overrun.glib.gl.GL10;
import org.overrun.glib.gl.GL10C;
import org.overrun.glib.glfw.Callbacks;
import org.overrun.glib.glfw.GLFW;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;

import static org.overrun.glib.gl.GLConstC.*;

/**
 * Tests basic GLFW and OpenGL
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFWTest {
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
        window = GLFW.createWindow(300, 300, "Hello World!", MemoryAddress.NULL, MemoryAddress.NULL);
        if (window == MemoryAddress.NULL)
            throw new RuntimeException("Failed to create the GLFW window");
        GLFW.setKeyCallback(window, (handle, key, scancode, action, mods) -> {
            if (key == GLFW.KEY_ESCAPE && action == GLFW.RELEASE) {
                GLFW.setWindowShouldClose(window, true);
            }
        });
        GLFW.setFramebufferSizeCallback(window, (handle, width, height) ->
            GL10C.viewport(0, 0, width, height));
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
        if (GLCaps.load(GLFW::getProcAddress) == 0)
            throw new IllegalStateException("Failed to load OpenGL");

        GL10C.clearColor(0.4f, 0.6f, 0.9f, 1.0f);

        while (!GLFW.windowShouldClose(window)) {
            GL10C.clear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

            // Draw triangle
            GL10.begin(GL_TRIANGLES);
            GL10.color3f(1f, 0f, 0f);
            GL10.vertex2f(0.0f, 0.5f);
            GL10.color3f(0f, 1f, 0f);
            GL10.vertex2f(-0.5f, -0.5f);
            GL10.color3f(0f, 0f, 1f);
            GL10.vertex2f(0.5f, -0.5f);
            GL10.end();

            GLFW.swapBuffers(window);

            GLFW.pollEvents();
        }
    }

    public static void main(String[] args) {
        new GLFWTest().run();
    }
}
