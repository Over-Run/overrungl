package org.overrun.glib.glfw;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.Pointer;

import java.lang.foreign.*;

/**
 * This describes the gamma ramp for a monitor.
 *
 * <h3>Layout</h3>
 * <pre><code>
 * struct GLFWgammaramp {
 *     unsigned short* {@link #red() red};
 *     unsigned short* {@link #green() green};
 *     unsigned short* {@link #blue() blue};
 *     unsigned int {@link #size};
 * }</code></pre>
 *
 * @author squid233
 * @see GLFW#setGammaRamp
 * @see GLFW#setGammaRamp
 * @since 0.1.0
 */
public class GLFWGammaRamp extends Pointer implements AutoCloseable {
    /**
     * The struct layout.
     */
    public static final GroupLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.ADDRESS.withName("red"),
        ValueLayout.ADDRESS.withName("green"),
        ValueLayout.ADDRESS.withName("blue"),
        ValueLayout.JAVA_INT.withName("size")
    );
    @Nullable
    private final MemorySession session;

    /**
     * Create a {@code GLFWgammaramp} instance with the memory session.
     * <p>
     * If you create a mutable instance with a memory session
     * in a try-with-resources statement block, the session
     * should be {@link MemorySession#asNonCloseable() non-closeable}.
     *
     * @param address the address
     * @param session the memory session or {@code null}
     */
    public GLFWGammaRamp(Addressable address, @Nullable MemorySession session) {
        super(address);
        this.session = session;
    }

    /**
     * Create a {@code GLFWgammaramp const} instance.
     *
     * @param address the address
     */
    public GLFWGammaRamp(Addressable address) {
        this(address, null);
    }

    /**
     * Creates a {@code GLFWgammaramp} instance with the given memory session.
     *
     * @param session the memory session
     * @return the instance
     */
    public static GLFWGammaRamp create(MemorySession session) {
        return new GLFWGammaRamp(session.allocate(LAYOUT), session);
    }

    /**
     * Sets the red value array.
     *
     * @param reds the array
     * @return this
     */
    public GLFWGammaRamp red(short[] reds) {
        if (session == null) throw new IllegalStateException("The struct is const!");
        address().set(ValueLayout.ADDRESS, 0L, session.allocateArray(ValueLayout.JAVA_SHORT, reds));
        return this;
    }

    /**
     * Sets the green value array.
     *
     * @param greens the array
     * @return this
     */
    public GLFWGammaRamp green(short[] greens) {
        if (session == null) throw new IllegalStateException("The struct is const!");
        address().setAtIndex(ValueLayout.ADDRESS, 1L, session.allocateArray(ValueLayout.JAVA_SHORT, greens));
        return this;
    }

    /**
     * Sets the blue value array.
     *
     * @param blues the array
     * @return this
     */
    public GLFWGammaRamp blue(short[] blues) {
        if (session == null) throw new IllegalStateException("The struct is const!");
        address().setAtIndex(ValueLayout.ADDRESS, 2L, session.allocateArray(ValueLayout.JAVA_SHORT, blues));
        return this;
    }

    /**
     * Sets the arrays size.
     *
     * @param size The number of elements in each array.
     * @return this
     */
    public GLFWGammaRamp size(int size) {
        address().set(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.byteSize() * 3L, size);
        return this;
    }

    /**
     * Gets a red value at the given index.
     *
     * @param index the index
     * @return the red value
     */
    public short red(int index) {
        return nred().getAtIndex(ValueLayout.JAVA_SHORT, index);
    }

    /**
     * Gets a green value at the given index.
     *
     * @param index the index
     * @return the green value
     */
    public short green(int index) {
        return ngreen().getAtIndex(ValueLayout.JAVA_SHORT, index);
    }

    /**
     * Gets a blue value at the given index.
     *
     * @param index the index
     * @return the blue value
     */
    public short blue(int index) {
        return nblue().getAtIndex(ValueLayout.JAVA_SHORT, index);
    }

    /**
     * Gets the red value array.
     *
     * @param size the array size
     * @return the array
     */
    public short[] reds(int size) {
        short[] arr = new short[size];
        var addr = nred();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = addr.getAtIndex(ValueLayout.JAVA_SHORT, i);
        }
        return arr;
    }

    /**
     * Gets the green value array.
     *
     * @param size the array size
     * @return the array
     */
    public short[] greens(int size) {
        short[] arr = new short[size];
        var addr = ngreen();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = addr.getAtIndex(ValueLayout.JAVA_SHORT, i);
        }
        return arr;
    }

    /**
     * Gets the blue value array.
     *
     * @param size the array size
     * @return the array
     */
    public short[] blues(int size) {
        short[] arr = new short[size];
        var addr = nblue();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = addr.getAtIndex(ValueLayout.JAVA_SHORT, i);
        }
        return arr;
    }

    /**
     * Gets the red value array.
     *
     * @return An array of value describing the response of the red channel.
     */
    public short[] red() {
        return reds(size());
    }

    /**
     * Gets the green value array.
     *
     * @return An array of value describing the response of the green channel.
     */
    public short[] green() {
        return greens(size());
    }

    /**
     * Gets the blue value array.
     *
     * @return An array of value describing the response of the blue channel.
     */
    public short[] blue() {
        return blues(size());
    }

    /**
     * Gets the arrays size.
     *
     * @return The number of elements in each array.
     */
    public int size() {
        return address().get(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.byteSize() * 3L);
    }

    public MemoryAddress nred() {
        return address().get(ValueLayout.ADDRESS, 0L);
    }

    public MemoryAddress ngreen() {
        return address().getAtIndex(ValueLayout.ADDRESS, 1L);
    }

    public MemoryAddress nblue() {
        return address().getAtIndex(ValueLayout.ADDRESS, 2L);
    }

    @Override
    public void close() {
        if (session != null && session.isCloseable()) session.close();
    }
}
