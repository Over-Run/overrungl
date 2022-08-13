package org.overrun.glib;

import java.lang.invoke.MethodHandle;

/**
 * The overrun game library utils.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GameLib {
    /**
     * Invoke a method handle and catch {@link Throwable} implicitly.
     *
     * @param handle the method handle
     * @param args   the arguments
     * @return the return value; may be ignored
     * @throws RuntimeException caught {@link Throwable}
     * @see MethodHandle#invoke(Object...)
     */
    public static Object invoke(MethodHandle handle,
                                Object... args)
        throws RuntimeException {
        try {
            return handle.invoke(args);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
