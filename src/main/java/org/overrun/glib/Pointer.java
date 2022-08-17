package org.overrun.glib;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;

/**
 * A {@link MemoryAddress} wrapper.
 *
 * @author squid233
 * @since 0.1.0
 */
public class Pointer {
    protected final Addressable address;

    /**
     * Create the pointer instance.
     *
     * @param address the address
     */
    public Pointer(Addressable address) {
        this.address = address;
    }

    /**
     * Gets the address as {@link Addressable}.
     *
     * @return the address
     */
    public Addressable rawAddress() {
        return address;
    }

    /**
     * Gets the address.
     *
     * @return the memory address
     */
    public MemoryAddress address() {
        return rawAddress().address();
    }
}
