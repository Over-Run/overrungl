package org.overrun.glib;

import java.lang.foreign.Addressable;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

/**
 * The upcall stub which can be passed to other foreign functions as a function pointer,
 * with the given memory session.
 *
 * @author squid233
 * @since 0.1.0
 */
public interface ICallback {
    /**
     * Gets the address with the given memory session.
     *
     * @param session the memory session
     * @return the memory address
     */
    default Addressable address(MemorySession session) {
        return segment(session, descriptor());
    }

    /**
     * Returns the function descriptor of this callback.
     *
     * @return the function descriptor
     */
    FunctionDescriptor descriptor();

    /**
     * Find the method handle from the given method handles lookup.
     *
     * @param lookup the lookup
     * @return the method handle
     * @throws NoSuchMethodException  if the method does not exist
     * @throws IllegalAccessException if access checking fails, or if the method is {@code static}, or if the method's
     *                                variable arity modifier bit is set and {@code asVarargsCollector} fails
     */
    MethodHandle handle(MethodHandles.Lookup lookup) throws NoSuchMethodException, IllegalAccessException;

    /**
     * Gets the memory segment of the upcall stub with the given memory session.
     *
     * @param session  the memory session
     * @param function the function descriptor
     * @return the memory segment
     */
    default MemorySegment segment(MemorySession session,
                                  FunctionDescriptor function) {
        try {
            return RuntimeHelper.LINKER.upcallStub(handle(MethodHandles.publicLookup()).bindTo(this), function, session);
        } catch (NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
