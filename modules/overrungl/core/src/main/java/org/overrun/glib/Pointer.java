package org.overrun.glib;

import java.lang.foreign.*;

/**
 * A {@link MemoryAddress} wrapper.
 *
 * @author squid233
 * @since 0.1.0
 */
public class Pointer implements HasAddress {
    /**
     * The pointer address.
     */
    protected final Addressable address;
    /**
     * The pointer memory session.
     */
    protected final MemorySession session;

    /**
     * Create the pointer instance.
     *
     * @param address the address
     * @param session the memory session
     */
    public Pointer(Addressable address, MemorySession session) {
        this.address = address;
        this.session = session;
    }

    /**
     * Gets the address as {@link Addressable}.
     *
     * @return the address
     */
    @Override
    public Addressable rawAddress() {
        return address;
    }

    /**
     * Gets the address.
     *
     * @return the memory address
     */
    @Override
    public MemoryAddress address() {
        return rawAddress().address();
    }

    /**
     * Gets the memory session.
     *
     * @return the memory session
     */
    public MemorySession session() {
        return session;
    }

    /**
     * Gets as memory segment.
     *
     * @param bytesSize the bytes size
     * @param session   the memory session to allocate
     * @return the memory segment
     */
    public MemorySegment segment(long bytesSize, MemorySession session) {
        if (rawAddress() instanceof MemorySegment segment) {
            return segment;
        }
        return MemorySegment.ofAddress(address(), bytesSize, session);
    }

    /**
     * Gets as memory segment.
     *
     * @param layout  the memory layout
     * @param session the memory session to allocate
     * @return the memory segment
     */
    public MemorySegment segment(MemoryLayout layout, MemorySession session) {
        return segment(layout.byteSize(), session);
    }
}
