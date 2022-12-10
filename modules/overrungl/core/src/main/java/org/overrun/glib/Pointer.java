package org.overrun.glib;

import org.jetbrains.annotations.Nullable;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentScope;

/**
 * A {@link MemorySegment} wrapper.
 *
 * @author squid233
 * @since 0.1.0
 */
public class Pointer implements HasAddress {
    /**
     * The pointer address.
     */
    protected final MemorySegment address;
    /**
     * The pointer segment scope.
     */
    protected final SegmentScope scope;
    /**
     * The managed memory segment.
     */
    protected @Nullable MemorySegment managed;

    /**
     * Create the pointer instance.
     *
     * @param address the address
     * @param scope   the segment scope
     */
    public Pointer(MemorySegment address, SegmentScope scope) {
        this.address = address;
        this.scope = scope;
    }

    /**
     * Gets the address.
     *
     * @return the memory address
     */
    @Override
    public MemorySegment address() {
        return address;
    }

    /**
     * Gets the segment scope.
     *
     * @return the segment scope
     */
    public SegmentScope scope() {
        return scope;
    }

    /**
     * Gets as memory segment.
     *
     * @param bytesSize the bytes size
     * @param scope     the segment scope to allocate
     * @return the memory segment
     */
    public MemorySegment segment(long bytesSize, SegmentScope scope) {
        if (address().byteSize() == 0) {
            return MemorySegment.ofAddress(address().address(), bytesSize, scope);
        }
        return address();
    }

    /**
     * Gets as memory segment.
     *
     * @param layout the memory layout
     * @param scope  the segment scope to allocate
     * @return the memory segment
     */
    public MemorySegment segment(MemoryLayout layout, SegmentScope scope) {
        return segment(layout.byteSize(), scope);
    }
}
