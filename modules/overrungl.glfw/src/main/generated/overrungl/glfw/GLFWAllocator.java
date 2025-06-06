/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.glfw;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct GLFWAllocator {
///     (void* (*GLFWAllocateFun)(size_t size, void* user)) GLFWallocatefun allocate;
///     (void* (*GLFWReallocateFun)(void* block, size_t size, void* user)) GLFWreallocatefun reallocate;
///     (void (*GLFWDeallocateFun)(void* block, void* user)) GLFWdeallocatefun deallocate;
///     void* user;
/// };
/// ```
public sealed class GLFWAllocator extends GroupType {
    /// The struct layout of `GLFWAllocator`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("allocate"),
        ValueLayout.ADDRESS.withName("reallocate"),
        ValueLayout.ADDRESS.withName("deallocate"),
        ValueLayout.ADDRESS.withName("user")
    );
    /// The byte offset of `allocate`.
    public static final long OFFSET_allocate = LAYOUT.byteOffset(PathElement.groupElement("allocate"));
    /// The memory layout of `allocate`.
    public static final MemoryLayout LAYOUT_allocate = LAYOUT.select(PathElement.groupElement("allocate"));
    /// The [VarHandle] of `allocate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_allocate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allocate"));
    /// The byte offset of `reallocate`.
    public static final long OFFSET_reallocate = LAYOUT.byteOffset(PathElement.groupElement("reallocate"));
    /// The memory layout of `reallocate`.
    public static final MemoryLayout LAYOUT_reallocate = LAYOUT.select(PathElement.groupElement("reallocate"));
    /// The [VarHandle] of `reallocate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reallocate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reallocate"));
    /// The byte offset of `deallocate`.
    public static final long OFFSET_deallocate = LAYOUT.byteOffset(PathElement.groupElement("deallocate"));
    /// The memory layout of `deallocate`.
    public static final MemoryLayout LAYOUT_deallocate = LAYOUT.select(PathElement.groupElement("deallocate"));
    /// The [VarHandle] of `deallocate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deallocate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deallocate"));
    /// The byte offset of `user`.
    public static final long OFFSET_user = LAYOUT.byteOffset(PathElement.groupElement("user"));
    /// The memory layout of `user`.
    public static final MemoryLayout LAYOUT_user = LAYOUT.select(PathElement.groupElement("user"));
    /// The [VarHandle] of `user` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_user = LAYOUT.arrayElementVarHandle(PathElement.groupElement("user"));

    /// Creates `GLFWAllocator` with the given segment.
    /// @param segment the memory segment
    public GLFWAllocator(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `GLFWAllocator` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `GLFWAllocator` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWAllocator ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new GLFWAllocator(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `GLFWAllocator` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `GLFWAllocator` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `GLFWAllocator`
    public static GLFWAllocator alloc(SegmentAllocator allocator) { return new GLFWAllocator(allocator.allocate(LAYOUT)); }

    /// Allocates a `GLFWAllocator` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `GLFWAllocator`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `GLFWAllocator` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param allocate `allocate`
    /// @param reallocate `reallocate`
    /// @param deallocate `deallocate`
    /// @param user `user`
    /// @return the allocated `GLFWAllocator`
    public static GLFWAllocator allocInit(SegmentAllocator allocator, MemorySegment allocate, MemorySegment reallocate, MemorySegment deallocate, MemorySegment user) {
        return alloc(allocator).allocate(allocate).reallocate(reallocate).deallocate(deallocate).user(user);
    }

    /// Allocates a `GLFWAllocator` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param allocate `allocate`
    /// @param reallocate `reallocate`
    /// @param deallocate `deallocate`
    /// @return the allocated `GLFWAllocator`
    public static GLFWAllocator allocInit(SegmentAllocator allocator, MemorySegment allocate, MemorySegment reallocate, MemorySegment deallocate) {
        return alloc(allocator).allocate(allocate).reallocate(reallocate).deallocate(deallocate);
    }

    /// Allocates a `GLFWAllocator` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param allocate `allocate`
    /// @param reallocate `reallocate`
    /// @return the allocated `GLFWAllocator`
    public static GLFWAllocator allocInit(SegmentAllocator allocator, MemorySegment allocate, MemorySegment reallocate) {
        return alloc(allocator).allocate(allocate).reallocate(reallocate);
    }

    /// Allocates a `GLFWAllocator` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param allocate `allocate`
    /// @return the allocated `GLFWAllocator`
    public static GLFWAllocator allocInit(SegmentAllocator allocator, MemorySegment allocate) {
        return alloc(allocator).allocate(allocate);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public GLFWAllocator copyFrom(GLFWAllocator src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `allocate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment allocate(MemorySegment segment, long index) { return (MemorySegment) VH_allocate.get(segment, 0L, index); }
    /// {@return `allocate`}
    public MemorySegment allocate() { return allocate(this.segment(), 0L); }
    /// Sets `allocate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void allocate(MemorySegment segment, long index, MemorySegment value) { VH_allocate.set(segment, 0L, index, value); }
    /// Sets `allocate` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWAllocator allocate(MemorySegment value) { allocate(this.segment(), 0L, value); return this; }

    /// {@return `reallocate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment reallocate(MemorySegment segment, long index) { return (MemorySegment) VH_reallocate.get(segment, 0L, index); }
    /// {@return `reallocate`}
    public MemorySegment reallocate() { return reallocate(this.segment(), 0L); }
    /// Sets `reallocate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reallocate(MemorySegment segment, long index, MemorySegment value) { VH_reallocate.set(segment, 0L, index, value); }
    /// Sets `reallocate` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWAllocator reallocate(MemorySegment value) { reallocate(this.segment(), 0L, value); return this; }

    /// {@return `deallocate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment deallocate(MemorySegment segment, long index) { return (MemorySegment) VH_deallocate.get(segment, 0L, index); }
    /// {@return `deallocate`}
    public MemorySegment deallocate() { return deallocate(this.segment(), 0L); }
    /// Sets `deallocate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deallocate(MemorySegment segment, long index, MemorySegment value) { VH_deallocate.set(segment, 0L, index, value); }
    /// Sets `deallocate` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWAllocator deallocate(MemorySegment value) { deallocate(this.segment(), 0L, value); return this; }

    /// {@return `user` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment user(MemorySegment segment, long index) { return (MemorySegment) VH_user.get(segment, 0L, index); }
    /// {@return `user`}
    public MemorySegment user() { return user(this.segment(), 0L); }
    /// Sets `user` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void user(MemorySegment segment, long index, MemorySegment value) { VH_user.set(segment, 0L, index, value); }
    /// Sets `user` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWAllocator user(MemorySegment value) { user(this.segment(), 0L, value); return this; }

    /// A buffer of [GLFWAllocator].
    public static final class Buffer extends GLFWAllocator {
        private final long elementCount;

        /// Creates `GLFWAllocator.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `GLFWAllocator`.
        /// @param index the index of the struct buffer
        /// @return the slice of `GLFWAllocator`
        public GLFWAllocator asSlice(long index) { return new GLFWAllocator(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `GLFWAllocator`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `GLFWAllocator`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `allocate` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment allocateAt(long index) { return allocate(this.segment(), index); }
        /// Sets `allocate` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer allocateAt(long index, MemorySegment value) { allocate(this.segment(), index, value); return this; }

        /// {@return `reallocate` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment reallocateAt(long index) { return reallocate(this.segment(), index); }
        /// Sets `reallocate` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer reallocateAt(long index, MemorySegment value) { reallocate(this.segment(), index, value); return this; }

        /// {@return `deallocate` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment deallocateAt(long index) { return deallocate(this.segment(), index); }
        /// Sets `deallocate` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deallocateAt(long index, MemorySegment value) { deallocate(this.segment(), index, value); return this; }

        /// {@return `user` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment userAt(long index) { return user(this.segment(), index); }
        /// Sets `user` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer userAt(long index, MemorySegment value) { user(this.segment(), index, value); return this; }

    }
}
