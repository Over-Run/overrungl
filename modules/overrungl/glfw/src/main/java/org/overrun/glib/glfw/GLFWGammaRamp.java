package org.overrun.glib.glfw;

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
public class GLFWGammaRamp extends Pointer {
    /**
     * The struct layout.
     */
    public static final GroupLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.ADDRESS.withName("red"),
        ValueLayout.ADDRESS.withName("green"),
        ValueLayout.ADDRESS.withName("blue"),
        ValueLayout.JAVA_INT.withName("size")
    );

    /**
     * Create a {@code GLFWgammaramp} instance.
     *
     * @param address the address
     */
    public GLFWGammaRamp(Addressable address) {
        super(address);
    }

    /**
     * Creates a {@code GLFWgammaramp} instance with the given memory session.
     *
     * @param session the memory session
     * @return the instance
     */
    public static GLFWGammaRamp create(MemorySession session) {
        return new GLFWGammaRamp(session.allocate(LAYOUT));
    }

    /**
     * Sets the red value array.
     *
     * @param reds the array
     * @return this
     */
    public GLFWGammaRamp red(short[] reds) {
        var addr = MemorySession.openImplicit().allocateArray(ValueLayout.JAVA_SHORT, reds.length);
        for (int i = 0; i < reds.length; i++) {
            addr.setAtIndex(ValueLayout.JAVA_SHORT, i, reds[i]);
        }
        address().set(ValueLayout.ADDRESS, 0L, addr);
        return this;
    }

    /**
     * Sets the green value array.
     *
     * @param greens the array
     * @return this
     */
    public GLFWGammaRamp green(short[] greens) {
        var addr = MemorySession.openImplicit().allocateArray(ValueLayout.JAVA_SHORT, greens.length);
        for (int i = 0; i < greens.length; i++) {
            addr.setAtIndex(ValueLayout.JAVA_SHORT, i, greens[i]);
        }
        address().setAtIndex(ValueLayout.ADDRESS, 1L, addr);
        return this;
    }

    /**
     * Sets the blue value array.
     *
     * @param blues the array
     * @return this
     */
    public GLFWGammaRamp blue(short[] blues) {
        var addr = MemorySession.openImplicit().allocateArray(ValueLayout.JAVA_SHORT, blues.length);
        for (int i = 0; i < blues.length; i++) {
            addr.setAtIndex(ValueLayout.JAVA_SHORT, i, blues[i]);
        }
        address().setAtIndex(ValueLayout.ADDRESS, 2L, addr);
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
}
