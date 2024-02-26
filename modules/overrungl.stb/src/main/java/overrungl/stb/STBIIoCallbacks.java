/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

import overrun.marshal.Upcall;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructHandle;

import java.lang.foreign.*;

/**
 * The IO callback of STB image.
 * <h2>Layout</h2>
 * <pre><code>
 * struct stbi_io_callbacks {
 *     int (*{@link #read})(void* user, char* data, int size);
 *     void (*{@link #skip})(void* user, int n);
 *     int (*{@link #eof})(void* user);
 * }</code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBIIoCallbacks extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.ADDRESS.withName("read"),
        ValueLayout.ADDRESS.withName("skip"),
        ValueLayout.ADDRESS.withName("eof")
    );
    /**
     * the read callback
     */
    public static final StructHandle.Upcall<Read> read = StructHandle.ofUpcall(LAYOUT, "read", Read::wrap);
    /**
     * the skip callback
     */
    public static final StructHandle.Upcall<Skip> skip = StructHandle.ofUpcall(LAYOUT, "skip", Skip::wrap);
    /**
     * the eof callback
     */
    public static final StructHandle.Upcall<Eof> eof = StructHandle.ofUpcall(LAYOUT, "eof", Eof::wrap);

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public STBIIoCallbacks(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public STBIIoCallbacks(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public STBIIoCallbacks(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public STBIIoCallbacks(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }

    /**
     * The read callback interface
     *
     * @author squid233
     * @since 0.1.0
     */
    @FunctionalInterface
    public interface Read extends Upcall {
        /**
         * the type
         */
        Type<Read> TYPE = Upcall.type("ninvoke", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));

        /**
         * Fill {@code data} with {@code size} bytes.
         *
         * @param user userdata
         * @param data data buffer to be filled
         * @return number of bytes actually read
         */
        int invoke(MemorySegment user, MemorySegment data);

        /**
         * Fill {@code data} with {@code size} bytes.
         *
         * @param user userdata
         * @param data data buffer to be filled
         * @param size byte size to fill
         * @return number of bytes actually read
         */
        default int ninvoke(MemorySegment user, MemorySegment data, int size) {
            return invoke(user, data.reinterpret(size));
        }

        @Override
        default MemorySegment stub(Arena arena) {
            return TYPE.of(arena, this);
        }

        static int invoke(MemorySegment stub, MemorySegment user, MemorySegment data, int size) {
            try {
                return (int) TYPE.downcallTarget().invokeExact(stub, user, data, size);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        static Read wrap(MemorySegment stub) {
            return (user, data) -> invoke(stub, user, data, Math.toIntExact(data.byteSize()));
        }
    }

    /**
     * The skip callback interface
     *
     * @author squid233
     * @since 0.1.0
     */
    @FunctionalInterface
    public interface Skip extends Upcall {
        /**
         * the type
         */
        Type<Skip> TYPE = Upcall.type("invoke", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));

        /**
         * Skip the next {@code n} bytes, or “unget” the last {@code -n} bytes if negative
         *
         * @param user userdata
         * @param n    byte size to skip
         */
        void invoke(MemorySegment user, int n);


        @Override
        default MemorySegment stub(Arena arena) {
            return TYPE.of(arena, this);
        }

        static void invoke(MemorySegment stub, MemorySegment user, int n) {
            try {
                TYPE.downcallTarget().invokeExact(stub, user, n);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        static Skip wrap(MemorySegment stub) {
            return (user, n) -> invoke(stub, user, n);
        }
    }

    /**
     * The eof callback interface
     *
     * @author squid233
     * @since 0.1.0
     */
    @FunctionalInterface
    public interface Eof extends Upcall {
        /**
         * the type
         */
        Type<Eof> TYPE = Upcall.type("invoke", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));

        /**
         * {@return nonzero if we are at end of file/data}
         *
         * @param user userdata
         */
        int invoke(MemorySegment user);

        @Override
        default MemorySegment stub(Arena arena) {
            return TYPE.of(arena, this);
        }

        static int invoke(MemorySegment stub, MemorySegment user) {
            try {
                return (int) TYPE.downcallTarget().invokeExact(stub, user);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        static Eof wrap(MemorySegment stub) {
            return user -> invoke(stub, user);
        }
    }
}
