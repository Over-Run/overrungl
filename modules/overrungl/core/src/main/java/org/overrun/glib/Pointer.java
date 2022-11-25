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
     * The pointer segment scope.
     */
    protected final MemorySession scope;

    /**
     * Create the pointer instance.
     *
     * @param address the address
     * @param scope   the segment scope
     */
    public Pointer(Addressable address, MemorySession scope) {
        this.address = address;
        this.scope = scope;
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
     * Gets the segment scope.
     *
     * @return the segment scope
     */
    public MemorySession scope() {
        return scope;
    }

    /**
     * Gets as memory segment.
     *
     * @param bytesSize the bytes size
     * @param scope     the segment scope to allocate
     * @return the memory segment
     */
    public MemorySegment segment(long bytesSize, MemorySession scope) {
        if (rawAddress() instanceof MemorySegment segment) {
            return segment;
        }
        return MemorySegment.ofAddress(address(), bytesSize, scope);
    }

    /**
     * Gets as memory segment.
     *
     * @param layout the memory layout
     * @param scope  the segment scope to allocate
     * @return the memory segment
     */
    public MemorySegment segment(MemoryLayout layout, MemorySession scope) {
        return segment(layout.byteSize(), scope);
    }
}
