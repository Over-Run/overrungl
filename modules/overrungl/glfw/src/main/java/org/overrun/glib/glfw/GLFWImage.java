package org.overrun.glib.glfw;

import org.overrun.glib.Pointer;

import java.lang.foreign.*;

/**
 * This describes a single 2D image. See the documentation for each related
 * function what the expected pixel format is.
 *
 * <h3>Layout</h3>
 * <pre><code>
 * struct GLFWimage {
 *     int {@link #width};
 *     int {@link #height};
 *     unsigned char* {@link #pixels};
 * }</code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public class GLFWImage extends Pointer {
    /**
     * The struct layout.
     */
    public static final GroupLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.ADDRESS.withName("pixels")
    );

    /**
     * Create a {@code GLFWimage} instance.
     *
     * @param address the address
     */
    public GLFWImage(Addressable address) {
        super(address);
    }

    /**
     * Creates a {@code GLFWimage} instance with the given memory session.
     *
     * @param session the memory session
     * @return the instance
     */
    public static GLFWImage create(MemorySession session) {
        return new GLFWImage(session.allocate(LAYOUT));
    }

    /**
     * Sets the image width.
     *
     * @param width The width, in pixels, of this image.
     * @return this
     */
    public GLFWImage width(int width) {
        address().set(ValueLayout.JAVA_INT, 0L, width);
        return this;
    }

    /**
     * Sets the image height.
     *
     * @param height The height, in pixels, of this image.
     * @return this
     */
    public GLFWImage height(int height) {
        address().setAtIndex(ValueLayout.JAVA_INT, 1L, height);
        return this;
    }

    /**
     * Sets the image pixels address.
     *
     * @param pixels The pixel data address of this image, arranged left-to-right, top-to-bottom.
     * @return this
     */
    public GLFWImage pixels(Addressable pixels) {
        address().set(ValueLayout.ADDRESS, ValueLayout.JAVA_INT.byteSize() * 2L, pixels);
        return this;
    }

    /**
     * Gets the image width.
     *
     * @return The width, in pixels, of this image.
     */
    public int width() {
        return address().get(ValueLayout.JAVA_INT, 0L);
    }

    /**
     * Gets the image height.
     *
     * @return The height, in pixels, of this image.
     */
    public int height() {
        return address().getAtIndex(ValueLayout.JAVA_INT, 1L);
    }

    /**
     * Gets the image pixels address.
     *
     * @return The pixel data address of this image, arranged left-to-right, top-to-bottom.
     */
    public MemoryAddress pixels() {
        return address().get(ValueLayout.ADDRESS, ValueLayout.JAVA_INT.byteSize() * 2L);
    }
}
