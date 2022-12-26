/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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

package org.overrun.glib.stb;

import org.overrun.glib.ICallback;
import org.overrun.glib.Pointer;
import org.overrun.glib.RuntimeHelper;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.VarHandle;

/**
 * The IO callback of STB image.
 *
 * <h2>Layout</h2>
 * <pre><code>
 * struct stbi_io_callbacks {
 *     int (*{@link #read() read})(void* user, char* data, int size);
 *     void (*{@link #skip() skip})(void* user, int n);
 *     int (*{@link #eof() eof})(void* user);
 * }
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public class STBIIoCallbacks extends Pointer {
    /**
     * The struct layout.
     */
    public static final GroupLayout LAYOUT =
        MemoryLayout.structLayout(
            ValueLayout.ADDRESS.withName("read"),
            ValueLayout.ADDRESS.withName("skip"),
            ValueLayout.ADDRESS.withName("eof")
        ).withName("stbi_io_callbacks");
    private static final VarHandle
        pRead = LAYOUT.varHandle(PathElement.groupElement("read")),
        pSkip = LAYOUT.varHandle(PathElement.groupElement("skip")),
        pEof = LAYOUT.varHandle(PathElement.groupElement("eof"));

    /**
     * Create a {@code stbi_io_callbacks} instance.
     *
     * @param address the address
     * @param scope   the segment scope
     */
    public STBIIoCallbacks(MemorySegment address, SegmentScope scope) {
        super(address, scope);
    }

    /**
     * The read callback interface
     *
     * @author squid233
     * @since 0.1.0
     */
    @FunctionalInterface
    public interface Read extends ICallback {
        FunctionDescriptor DESC = FunctionDescriptor.of(ValueLayout.JAVA_INT, RuntimeHelper.ADDRESS_UNBOUNDED, RuntimeHelper.ADDRESS_UNBOUNDED, ValueLayout.JAVA_INT);
        MethodType MTYPE = DESC.toMethodType();

        /**
         * Fill {@code data} with {@code size} bytes.
         *
         * @param user userdata
         * @param data data buffer to be filled
         * @param size bytes size to fill
         * @return number of bytes actually read
         */
        int invoke(MemorySegment user, MemorySegment data, int size);

        @Override
        default FunctionDescriptor descriptor() {
            return DESC;
        }

        @Override
        default MethodHandle handle(MethodHandles.Lookup lookup) throws NoSuchMethodException, IllegalAccessException {
            return lookup.findVirtual(Read.class, "invoke", MTYPE);
        }
    }

    /**
     * The skip callback interface
     *
     * @author squid233
     * @since 0.1.0
     */
    @FunctionalInterface
    public interface Skip extends ICallback {
        FunctionDescriptor DESC = FunctionDescriptor.ofVoid(RuntimeHelper.ADDRESS_UNBOUNDED, ValueLayout.JAVA_INT);
        MethodType MTYPE = DESC.toMethodType();

        /**
         * Skip the next {@code n} bytes, or “unget” the last {@code -n} bytes if negative
         *
         * @param user userdata
         * @param n    bytes size to skip
         */
        void invoke(MemorySegment user, int n);

        @Override
        default FunctionDescriptor descriptor() {
            return DESC;
        }

        @Override
        default MethodHandle handle(MethodHandles.Lookup lookup) throws NoSuchMethodException, IllegalAccessException {
            return lookup.findVirtual(Skip.class, "invoke", MTYPE);
        }
    }

    /**
     * The eof callback interface
     *
     * @author squid233
     * @since 0.1.0
     */
    @FunctionalInterface
    public interface Eof extends ICallback {
        FunctionDescriptor DESC = FunctionDescriptor.of(ValueLayout.JAVA_INT, RuntimeHelper.ADDRESS_UNBOUNDED);
        MethodType MTYPE = DESC.toMethodType();

        /**
         * Returns nonzero if we are at end of file/data
         *
         * @param user userdata
         * @return nonzero if we are at end of file/data
         */
        int invoke(MemorySegment user);

        @Override
        default FunctionDescriptor descriptor() {
            return DESC;
        }

        @Override
        default MethodHandle handle(MethodHandles.Lookup lookup) throws NoSuchMethodException, IllegalAccessException {
            return lookup.findVirtual(Eof.class, "invoke", MTYPE);
        }
    }

    /**
     * Creates a {@code stbi_io_callbacks} instance with the given segment scope.
     *
     * @param scope the segment scope
     * @return the instance
     */
    public static STBIIoCallbacks create(SegmentScope scope) {
        return new STBIIoCallbacks(MemorySegment.allocateNative(LAYOUT, scope), scope);
    }

    /**
     * Returns the read callback
     *
     * @return the read callback
     */
    public MemorySegment read() {
        return (MemorySegment) pRead.get(segment(LAYOUT, scope));
    }

    /**
     * Returns the skip callback
     *
     * @return the skip callback
     */
    public MemorySegment skip() {
        return (MemorySegment) pSkip.get(segment(LAYOUT, scope));
    }

    /**
     * Returns the eof callback
     *
     * @return the eof callback
     */
    public MemorySegment eof() {
        return (MemorySegment) pEof.get(segment(LAYOUT, scope));
    }

    /**
     * Sets the read callback.
     *
     * @param read the read callback
     * @return this
     */
    public STBIIoCallbacks read(Read read) {
        pRead.set(segment(LAYOUT, scope), read.address(scope));
        return this;
    }

    /**
     * Sets the skip callback.
     *
     * @param skip the skip callback
     * @return this
     */
    public STBIIoCallbacks skip(Skip skip) {
        pSkip.set(segment(LAYOUT, scope), skip.address(scope));
        return this;
    }

    /**
     * Sets the eof callback.
     *
     * @param eof the eof callback
     * @return this
     */
    public STBIIoCallbacks eof(Eof eof) {
        pEof.set(segment(LAYOUT, scope), eof.address(scope));
        return this;
    }
}
