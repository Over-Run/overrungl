package org.overrun.glib.glfw;

import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;

/**
 * The GLFW allocator.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFWAllocator {
    static SegmentAllocator segmentAllocator;

    /**
     * Sets the segment allocator.
     *
     * @param allocator the allocator
     */
    public static void set(SegmentAllocator allocator) {
        segmentAllocator = allocator;
    }

    /**
     * Releases the segment allocator if it is closeable.
     */
    public static void free() {
        if (segmentAllocator instanceof MemorySession session &&
            session.isCloseable()) {
            session.close();
        }
        segmentAllocator = null;
    }
}
