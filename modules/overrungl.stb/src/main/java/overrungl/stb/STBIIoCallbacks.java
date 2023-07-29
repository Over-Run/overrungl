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

package overrungl.stb;

import overrungl.Callback;
import overrungl.internal.RuntimeHelper;
import overrungl.Struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.VarHandle;

/**
 * The IO callback of STB image.
 * <h2>Layout</h2>
 * <pre><code>
 * struct stbi_io_callbacks {
 *     int (*{@link #read() read})(void* user, char* data, int size);
 *     void (*{@link #skip() skip})(void* user, int n);
 *     int (*{@link #eof() eof})(void* user);
 * }</code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public class STBIIoCallbacks extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.ADDRESS.withName("read"),
        ValueLayout.ADDRESS.withName("skip"),
        ValueLayout.ADDRESS.withName("eof")
    );
    private static final VarHandle
        pRead = LAYOUT.varHandle(PathElement.groupElement("read")),
        pSkip = LAYOUT.varHandle(PathElement.groupElement("skip")),
        pEof = LAYOUT.varHandle(PathElement.groupElement("eof"));

    /**
     * Create a {@code stbi_io_callbacks} instance.
     *
     * @param address the address.
     */
    public STBIIoCallbacks(MemorySegment address) {
        super(address, LAYOUT);
    }

    /**
     * The read callback interface
     *
     * @author squid233
     * @since 0.1.0
     */
    @FunctionalInterface
    public interface Read extends Callback {
        FunctionDescriptor DESC = FunctionDescriptor.of(ValueLayout.JAVA_INT, RuntimeHelper.ADDRESS_UNBOUNDED, RuntimeHelper.ADDRESS_UNBOUNDED, ValueLayout.JAVA_INT);
        MethodType MTYPE = DESC.toMethodType();

        /**
         * Fill {@code data} with {@code size} bytes.
         *
         * @param user userdata
         * @param data data buffer to be filled
         * @param size byte size to fill
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
    public interface Skip extends Callback {
        FunctionDescriptor DESC = FunctionDescriptor.ofVoid(RuntimeHelper.ADDRESS_UNBOUNDED, ValueLayout.JAVA_INT);
        MethodType MTYPE = DESC.toMethodType();

        /**
         * Skip the next {@code n} bytes, or “unget” the last {@code -n} bytes if negative
         *
         * @param user userdata
         * @param n    byte size to skip
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
    public interface Eof extends Callback {
        FunctionDescriptor DESC = FunctionDescriptor.of(ValueLayout.JAVA_INT, RuntimeHelper.ADDRESS_UNBOUNDED);
        MethodType MTYPE = DESC.toMethodType();

        /**
         * {@return nonzero if we are at end of file/data}
         *
         * @param user userdata
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
     * Creates a {@code stbi_io_callbacks} instance with the given allocator.
     *
     * @param allocator the allocator
     * @return the instance
     */
    public static STBIIoCallbacks create(SegmentAllocator allocator) {
        return new STBIIoCallbacks(allocator.allocate(LAYOUT));
    }

    /**
     * {@return the read callback}
     */
    public MemorySegment read() {
        return (MemorySegment) pRead.get(segment());
    }

    /**
     * {@return the skip callback}
     */
    public MemorySegment skip() {
        return (MemorySegment) pSkip.get(segment());
    }

    /**
     * {@return the eof callback}
     */
    public MemorySegment eof() {
        return (MemorySegment) pEof.get(segment());
    }

    /**
     * Sets the read callback.
     *
     * @param arena the arena of the callback.
     * @param read  the read callback
     * @return this
     */
    public STBIIoCallbacks read(Arena arena, Read read) {
        pRead.set(segment(), read.address(arena));
        return this;
    }

    /**
     * Sets the skip callback.
     *
     * @param arena the arena of the callback.
     * @param skip  the skip callback
     * @return this
     */
    public STBIIoCallbacks skip(Arena arena, Skip skip) {
        pSkip.set(segment(), skip.address(arena));
        return this;
    }

    /**
     * Sets the eof callback.
     *
     * @param arena the arena of the callback.
     * @param eof   the eof callback
     * @return this
     */
    public STBIIoCallbacks eof(Arena arena, Eof eof) {
        pEof.set(segment(), eof.address(arena));
        return this;
    }
}
