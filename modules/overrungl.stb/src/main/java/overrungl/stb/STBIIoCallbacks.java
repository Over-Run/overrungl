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
    public final StructHandle.Upcall<Read> read = StructHandle.ofUpcall(this, "read", Read::wrap);
    /**
     * the skip callback
     */
    public final StructHandle.Upcall<Skip> skip = StructHandle.ofUpcall(this, "skip", Skip::wrap);
    /**
     * the eof callback
     */
    public final StructHandle.Upcall<Eof> eof = StructHandle.ofUpcall(this, "eof", Eof::wrap);

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
        Type<Read> TYPE = Upcall.type();

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
        @Stub
        default int ninvoke(MemorySegment user, MemorySegment data, int size) {
            return invoke(user, data.reinterpret(size));
        }

        @Override
        default MemorySegment stub(Arena arena) {
            return TYPE.of(arena, this);
        }

        @Wrapper
        static Read wrap(Arena arena, MemorySegment stub) {
            return TYPE.wrap(stub, handle -> (user, data) -> {
                try {
                    return (int) handle.invokeExact(user, data, Math.toIntExact(data.byteSize()));
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            });
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
        Type<Skip> TYPE = Upcall.type();

        /**
         * Skip the next {@code n} bytes, or “unget” the last {@code -n} bytes if negative
         *
         * @param user userdata
         * @param n    byte size to skip
         */
        @Stub
        void invoke(MemorySegment user, int n);


        @Override
        default MemorySegment stub(Arena arena) {
            return TYPE.of(arena, this);
        }

        @Wrapper
        static Skip wrap(Arena arena, MemorySegment stub) {
            return TYPE.wrap(stub, handle -> (user, n) -> {
                try {
                    handle.invokeExact(user, n);
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            });
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
        Type<Eof> TYPE = Upcall.type();

        /**
         * {@return nonzero if we are at end of file/data}
         *
         * @param user userdata
         */
        @Stub
        int invoke(MemorySegment user);

        @Override
        default MemorySegment stub(Arena arena) {
            return TYPE.of(arena, this);
        }

        @Wrapper
        static Eof wrap(Arena arena, MemorySegment segment) {
            return TYPE.wrap(segment, handle -> user -> {
                try {
                    return (int) handle.invokeExact(user);
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }
}
