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
package overrungl.glfw;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### allocate
/// [VarHandle][#VH_allocate] - [Getter][#allocate()] - [Setter][#allocate(java.lang.foreign.MemorySegment)]
/// ### reallocate
/// [VarHandle][#VH_reallocate] - [Getter][#reallocate()] - [Setter][#reallocate(java.lang.foreign.MemorySegment)]
/// ### deallocate
/// [VarHandle][#VH_deallocate] - [Getter][#deallocate()] - [Setter][#deallocate(java.lang.foreign.MemorySegment)]
/// ### user
/// [VarHandle][#VH_user] - [Getter][#user()] - [Setter][#user(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct GLFWallocator {
///     GLFWallocatefun allocate;
///     GLFWreallocatefun reallocate;
///     GLFWdeallocatefun deallocate;
///     void* user;
/// } GLFWAllocator;
/// ```
public sealed class GLFWAllocator extends Struct {
    /// The struct layout of `GLFWallocator`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("allocate"),
        ValueLayout.ADDRESS.withName("reallocate"),
        ValueLayout.ADDRESS.withName("deallocate"),
        ValueLayout.ADDRESS.withName("user")
    );
    /// The [VarHandle] of `allocate` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_allocate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allocate"));
    /// The [VarHandle] of `reallocate` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_reallocate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reallocate"));
    /// The [VarHandle] of `deallocate` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_deallocate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deallocate"));
    /// The [VarHandle] of `user` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_user = LAYOUT.arrayElementVarHandle(PathElement.groupElement("user"));

    /// Creates `GLFWAllocator` with the given segment.
    /// @param segment the memory segment
    public GLFWAllocator(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `GLFWAllocator` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWAllocator of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new GLFWAllocator(segment); }

    /// Creates `GLFWAllocator` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `GLFWAllocator` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLFWAllocator ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new GLFWAllocator(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `GLFWAllocator` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `GLFWAllocator` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `GLFWAllocator`
    public static GLFWAllocator alloc(SegmentAllocator allocator) { return new GLFWAllocator(allocator.allocate(LAYOUT)); }

    /// Allocates a `GLFWAllocator` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `GLFWAllocator`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `GLFWAllocator` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `GLFWAllocator`
    public static GLFWAllocator allocInit(SegmentAllocator allocator, @CType("GLFWallocatefun") java.lang.foreign.MemorySegment allocate, @CType("GLFWreallocatefun") java.lang.foreign.MemorySegment reallocate, @CType("GLFWdeallocatefun") java.lang.foreign.MemorySegment deallocate, @CType("void*") java.lang.foreign.MemorySegment user) { return alloc(allocator).allocate(allocate).reallocate(reallocate).deallocate(deallocate).user(user); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public GLFWAllocator copyFrom(GLFWAllocator src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `allocate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("GLFWallocatefun") java.lang.foreign.MemorySegment get_allocate(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_allocate.get(segment, 0L, index); }
    /// {@return `allocate`}
    /// @param segment the segment of the struct
    public static @CType("GLFWallocatefun") java.lang.foreign.MemorySegment get_allocate(MemorySegment segment) { return GLFWAllocator.get_allocate(segment, 0L); }
    /// {@return `allocate`}
    public @CType("GLFWallocatefun") java.lang.foreign.MemorySegment allocate() { return GLFWAllocator.get_allocate(this.segment()); }
    /// Sets `allocate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_allocate(MemorySegment segment, long index, @CType("GLFWallocatefun") java.lang.foreign.MemorySegment value) { VH_allocate.set(segment, 0L, index, value); }
    /// Sets `allocate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_allocate(MemorySegment segment, @CType("GLFWallocatefun") java.lang.foreign.MemorySegment value) { GLFWAllocator.set_allocate(segment, 0L, value); }
    /// Sets `allocate` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWAllocator allocate(@CType("GLFWallocatefun") java.lang.foreign.MemorySegment value) { GLFWAllocator.set_allocate(this.segment(), value); return this; }

    /// {@return `reallocate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("GLFWreallocatefun") java.lang.foreign.MemorySegment get_reallocate(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_reallocate.get(segment, 0L, index); }
    /// {@return `reallocate`}
    /// @param segment the segment of the struct
    public static @CType("GLFWreallocatefun") java.lang.foreign.MemorySegment get_reallocate(MemorySegment segment) { return GLFWAllocator.get_reallocate(segment, 0L); }
    /// {@return `reallocate`}
    public @CType("GLFWreallocatefun") java.lang.foreign.MemorySegment reallocate() { return GLFWAllocator.get_reallocate(this.segment()); }
    /// Sets `reallocate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reallocate(MemorySegment segment, long index, @CType("GLFWreallocatefun") java.lang.foreign.MemorySegment value) { VH_reallocate.set(segment, 0L, index, value); }
    /// Sets `reallocate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reallocate(MemorySegment segment, @CType("GLFWreallocatefun") java.lang.foreign.MemorySegment value) { GLFWAllocator.set_reallocate(segment, 0L, value); }
    /// Sets `reallocate` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWAllocator reallocate(@CType("GLFWreallocatefun") java.lang.foreign.MemorySegment value) { GLFWAllocator.set_reallocate(this.segment(), value); return this; }

    /// {@return `deallocate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("GLFWdeallocatefun") java.lang.foreign.MemorySegment get_deallocate(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_deallocate.get(segment, 0L, index); }
    /// {@return `deallocate`}
    /// @param segment the segment of the struct
    public static @CType("GLFWdeallocatefun") java.lang.foreign.MemorySegment get_deallocate(MemorySegment segment) { return GLFWAllocator.get_deallocate(segment, 0L); }
    /// {@return `deallocate`}
    public @CType("GLFWdeallocatefun") java.lang.foreign.MemorySegment deallocate() { return GLFWAllocator.get_deallocate(this.segment()); }
    /// Sets `deallocate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deallocate(MemorySegment segment, long index, @CType("GLFWdeallocatefun") java.lang.foreign.MemorySegment value) { VH_deallocate.set(segment, 0L, index, value); }
    /// Sets `deallocate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deallocate(MemorySegment segment, @CType("GLFWdeallocatefun") java.lang.foreign.MemorySegment value) { GLFWAllocator.set_deallocate(segment, 0L, value); }
    /// Sets `deallocate` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWAllocator deallocate(@CType("GLFWdeallocatefun") java.lang.foreign.MemorySegment value) { GLFWAllocator.set_deallocate(this.segment(), value); return this; }

    /// {@return `user` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void*") java.lang.foreign.MemorySegment get_user(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_user.get(segment, 0L, index); }
    /// {@return `user`}
    /// @param segment the segment of the struct
    public static @CType("void*") java.lang.foreign.MemorySegment get_user(MemorySegment segment) { return GLFWAllocator.get_user(segment, 0L); }
    /// {@return `user`}
    public @CType("void*") java.lang.foreign.MemorySegment user() { return GLFWAllocator.get_user(this.segment()); }
    /// Sets `user` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_user(MemorySegment segment, long index, @CType("void*") java.lang.foreign.MemorySegment value) { VH_user.set(segment, 0L, index, value); }
    /// Sets `user` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_user(MemorySegment segment, @CType("void*") java.lang.foreign.MemorySegment value) { GLFWAllocator.set_user(segment, 0L, value); }
    /// Sets `user` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWAllocator user(@CType("void*") java.lang.foreign.MemorySegment value) { GLFWAllocator.set_user(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("GLFWallocatefun") java.lang.foreign.MemorySegment allocateAt(long index) { return GLFWAllocator.get_allocate(this.segment(), index); }
        /// Sets `allocate` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer allocateAt(long index, @CType("GLFWallocatefun") java.lang.foreign.MemorySegment value) { GLFWAllocator.set_allocate(this.segment(), index, value); return this; }

        /// {@return `reallocate` at the given index}
        /// @param index the index
        public @CType("GLFWreallocatefun") java.lang.foreign.MemorySegment reallocateAt(long index) { return GLFWAllocator.get_reallocate(this.segment(), index); }
        /// Sets `reallocate` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reallocateAt(long index, @CType("GLFWreallocatefun") java.lang.foreign.MemorySegment value) { GLFWAllocator.set_reallocate(this.segment(), index, value); return this; }

        /// {@return `deallocate` at the given index}
        /// @param index the index
        public @CType("GLFWdeallocatefun") java.lang.foreign.MemorySegment deallocateAt(long index) { return GLFWAllocator.get_deallocate(this.segment(), index); }
        /// Sets `deallocate` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deallocateAt(long index, @CType("GLFWdeallocatefun") java.lang.foreign.MemorySegment value) { GLFWAllocator.set_deallocate(this.segment(), index, value); return this; }

        /// {@return `user` at the given index}
        /// @param index the index
        public @CType("void*") java.lang.foreign.MemorySegment userAt(long index) { return GLFWAllocator.get_user(this.segment(), index); }
        /// Sets `user` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer userAt(long index, @CType("void*") java.lang.foreign.MemorySegment value) { GLFWAllocator.set_user(this.segment(), index, value); return this; }

    }
}
