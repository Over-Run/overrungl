package org.overrun.glib.glfw;

import org.overrun.glib.Pointer;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;

/**
 * This describes the input state of a gamepad.
 *
 * <h3>Layout</h3>
 * <pre><code>
 * struct GLFWgamepadstate {
 *     unsigned char {@link #buttons() buttons}[15];
 *     float {@link #axes() axes}[6];
 * }</code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public class GLFWGamepadState extends Pointer {
    /**
     * The struct member layout.
     */
    public static final SequenceLayout
        BUTTONS_LAYOUT = MemoryLayout.sequenceLayout(15L, ValueLayout.JAVA_BYTE).withName("buttons"),
        AXES_LAYOUT = MemoryLayout.sequenceLayout(6L, ValueLayout.JAVA_FLOAT).withName("axes");
    /**
     * The struct layout.
     */
    public static final GroupLayout LAYOUT = MemoryLayout.structLayout(
        BUTTONS_LAYOUT,
        AXES_LAYOUT
    );
    /**
     * The struct path elements.
     */
    public static final PathElement BUTTONS = PathElement.groupElement("buttons"),
        AXES = PathElement.groupElement("axes");

    /**
     * Create a {@code GLFWgamepadstate} instance.
     *
     * @param address the address
     */
    public GLFWGamepadState(Addressable address) {
        super(address);
    }

    /**
     * Gets the button state array by the memory session.
     *
     * @param session the memory session
     * @return The states of each <a href="https://www.glfw.org/docs/latest/group__gamepad__buttons.html">gamepad button</a>,
     * {@code PRESS} or {@code RELEASE}.
     */
    public byte[] buttons(MemorySession session) {
        var seg = MemorySegment.ofAddress(address(), LAYOUT.byteSize(), session);
        byte[] arr = new byte[15];
        var handle = LAYOUT.varHandle(BUTTONS, PathElement.sequenceElement());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (byte) handle.get(seg, (long) i);
        }
        return arr;
    }

    /**
     * Gets the button state array.
     *
     * @return The states of each <a href="https://www.glfw.org/docs/latest/group__gamepad__buttons.html">gamepad button</a>,
     * {@code PRESS} or {@code RELEASE}.
     */
    public byte[] buttons() {
        try (var session = MemorySession.openShared()) {
            return buttons(session);
        }
    }

    /**
     * Gets the button state at the given index.
     *
     * @param index the index
     * @return the state, {@code PRESS} or {@code RELEASE}
     */
    public boolean button(int index) {
        try (var session = MemorySession.openShared()) {
            var seg = MemorySegment.ofAddress(address(), LAYOUT.byteSize(), session);
            return (byte) LAYOUT.varHandle(BUTTONS, PathElement.sequenceElement()).get(seg, (long) index) == GLFW.PRESS;
        }
    }

    /**
     * Gets the axe state array by the memory session.
     *
     * @param session the memory session
     * @return The states of each <a href="https://www.glfw.org/docs/latest/group__gamepad__axes.html">gamepad axis</a>,
     * in the range -1.0 to 1.0 inclusive.
     */
    public float[] axes(MemorySession session) {
        var seg = MemorySegment.ofAddress(address(), LAYOUT.byteSize(), session);
        float[] arr = new float[6];
        var handle = LAYOUT.varHandle(AXES, PathElement.sequenceElement());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) handle.get(seg, (long) i);
        }
        return arr;
    }

    /**
     * Gets the axe state array.
     *
     * @return The states of each <a href="https://www.glfw.org/docs/latest/group__gamepad__axes.html">gamepad axis</a>,
     * in the range -1.0 to 1.0 inclusive.
     */
    public float[] axes() {
        try (var session = MemorySession.openShared()) {
            return axes(session);
        }
    }

    /**
     * Gets the axe state at the given index.
     *
     * @param index the index
     * @return the state, in the range -1.0 to 1.0 inclusive
     */
    public float axe(int index) {
        try (var session = MemorySession.openShared()) {
            var seg = MemorySegment.ofAddress(address(), LAYOUT.byteSize(), session);
            return (float) LAYOUT.varHandle(AXES, PathElement.sequenceElement()).get(seg, (long) index);
        }
    }
}
