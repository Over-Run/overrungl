package org.overrun.glib;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * The upcall stub which can be passed to other foreign functions as a function pointer,
 * with the given memory session.
 *
 * @author squid233
 * @since 0.1.0
 */
@FunctionalInterface
public interface ICallback {
    /**
     * Gets the address with the given memory session.
     *
     * @param session the memory session
     * @return the memory address
     */
    MemoryAddress address(MemorySession session);

    /**
     * Gets the memory address of the upcall stub with the given memory session.
     *
     * @param session  the memory session
     * @param refc     the callback class
     * @param name     the callback method name
     * @param type     the callback method type
     * @param function the function descriptor
     * @return the memory address
     */
    default MemoryAddress address(MemorySession session,
                                  Class<?> refc,
                                  String name,
                                  MethodType type,
                                  FunctionDescriptor function) {
        return segment(session, refc, name, type, function).address();
    }

    /**
     * Gets the memory segment of the upcall stub with the given memory session.
     *
     * @param session  the memory session
     * @param refc     the callback class
     * @param name     the callback method name
     * @param type     the callback method type
     * @param function the function descriptor
     * @return the memory segment
     */
    default MemorySegment segment(MemorySession session,
                                  Class<?> refc,
                                  String name,
                                  MethodType type,
                                  FunctionDescriptor function) {
        try {
            return Linker.nativeLinker().upcallStub(MethodHandles.publicLookup().findVirtual(refc, name, type).bindTo(this), function, session);
        } catch (NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
