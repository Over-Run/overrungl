package org.overrun.glib.glfw;

import org.overrun.glib.Pointer;

import java.lang.foreign.*;

/**
 * This describes a single video mode.
 *
 * <h3>Layout</h3>
 * <pre><code>
 * struct GLFWvidmode {
 *     int {@link #width};
 *     int {@link #height};
 *     int {@link #redBits};
 *     int {@link #greenBits};
 *     int {@link #blueBits};
 *     int {@link #refreshRate};
 * }</code></pre>
 *
 * @author squid233
 * @see GLFW#getVideoMode
 * @see GLFW#getVideoModes
 * @since 0.1.0
 */
public class GLFWVidMode extends Pointer {
    /**
     * The struct layout.
     */
    public static final GroupLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("redBits"),
        ValueLayout.JAVA_INT.withName("greenBits"),
        ValueLayout.JAVA_INT.withName("blueBits"),
        ValueLayout.JAVA_INT.withName("refreshRate")
    );

    /**
     * Create a {@code GLFWvidmode} instance.
     *
     * @param address the address
     */
    public GLFWVidMode(Addressable address) {
        super(address);
    }

    /**
     * Gets the width.
     *
     * @return The width, in screen coordinates, of the video mode.
     */
    public int width() {
        return address().get(ValueLayout.JAVA_INT, 0L);
    }

    /**
     * Gets the height.
     *
     * @return The height, in screen coordinates, of the video mode.
     */
    public int height() {
        return address().getAtIndex(ValueLayout.JAVA_INT, 1L);
    }

    /**
     * Gets the red bits.
     *
     * @return The bit depth of the red channel of the video mode.
     */
    public int redBits() {
        return address().getAtIndex(ValueLayout.JAVA_INT, 2L);
    }

    /**
     * Gets the green bits.
     *
     * @return The bit depth of the green channel of the video mode.
     */
    public int greenBits() {
        return address().getAtIndex(ValueLayout.JAVA_INT, 3L);
    }

    /**
     * Gets the blue bits.
     *
     * @return The bit depth of the blue channel of the video mode.
     */
    public int blueBits() {
        return address().getAtIndex(ValueLayout.JAVA_INT, 4L);
    }

    /**
     * Gets the refresh rate.
     *
     * @return The refresh rate, in Hz, of the video mode.
     */
    public int refreshRate() {
        return address().getAtIndex(ValueLayout.JAVA_INT, 5L);
    }
}
