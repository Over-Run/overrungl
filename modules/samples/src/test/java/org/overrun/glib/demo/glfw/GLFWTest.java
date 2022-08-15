package org.overrun.glib.demo.glfw;

import org.overrun.glib.glfw.Callbacks;
import org.overrun.glib.glfw.GLFW;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;

/**
 * Tests basic GLFW and OpenGL
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFWTest {
    private MemoryAddress window;

    public void run() throws Throwable {
        init();
        loop();

        Callbacks.glfwFreeCallbacks(window);
        GLFW.destroyWindow(window);

        GLFW.terminate();
        GLFW.setErrorCallback(null);
    }

    private void init() throws Throwable {
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
                try {
                    GLFW.setWindowShouldClose(window, true);
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
        });
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

    private void loop() throws Throwable {
        //load gl

        //clear color

        while (!GLFW.windowShouldClose(window)) {
            //clear

            GLFW.swapBuffers(window);

            GLFW.pollEvents();
        }
    }

    public static void main(String[] args) throws Throwable {
        new GLFWTest().run();
    }
}
