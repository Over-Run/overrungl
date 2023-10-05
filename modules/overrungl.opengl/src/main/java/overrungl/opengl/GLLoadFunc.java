/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package overrungl.opengl;

import org.jetbrains.annotations.Nullable;
import overrungl.FunctionDescriptors;
import overrungl.internal.RuntimeHelper;

import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

/**
 * The OpenGL loading function.
 * <h2>Example</h2>
 * {@snippet lang = java:
 * // loads OpenGL forward-compatible profile
 * import java.util.Objects;
 * Objects.requireNonNull(GLLoader.load(GLFW::getProcAddress, true), "Failed to load OpenGL");
 * }
 *
 * @author squid233
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLLoadFunc {
    /**
     * Gets the function pointer of the given GL function.
     *
     * @param string the name of the function.
     * @return the function pointer.
     */
    MemorySegment invoke(String string);

    /**
     * Load a function by the given name and creates a downcall handle or {@code null}.
     *
     * @param procName the function name
     * @param function the function descriptor of the target function.
     * @param options  the linker options associated with this linkage request.
     * @return a downcall method handle,  or {@code null} if the symbol is {@link MemorySegment#NULL}
     */
    @Nullable
    default MethodHandle invoke(String procName, FunctionDescriptors function, Linker.Option... options) {
        return RuntimeHelper.downcallSafe(invoke(procName), function, options);
    }
}
