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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentScope;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

/**
 * The upcall stub which can be passed to other foreign functions as a function pointer,
 * with the given segment scope.
 *
 * @author squid233
 * @since 0.1.0
 */
public interface Callback {
    /**
     * Gets the address with the given segment scope.
     *
     * @param scope the segment scope
     * @return the memory address
     */
    default MemorySegment address(SegmentScope scope) {
        return segment(scope, descriptor());
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
     * Gets the memory segment of the upcall stub with the given segment scope.
     *
     * @param scope    the segment scope
     * @param function the function descriptor
     * @return the memory segment
     */
    default MemorySegment segment(SegmentScope scope,
                                  FunctionDescriptor function) {
        try {
            return RuntimeHelper.LINKER.upcallStub(handle(MethodHandles.publicLookup()).bindTo(this), function, scope);
        } catch (NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
