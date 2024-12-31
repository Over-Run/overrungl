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

// This file is auto-generated. DO NOT EDIT!
package overrungl.glfw;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Custom heap memory allocator.
/// 
/// This describes a custom heap memory allocator for GLFW.  To set an allocator, pass it
/// to [glfwInitAllocator][GLFW#glfwInitAllocator(MemorySegment)] before initializing the library.
///
/// ## Members
/// ### allocate
/// [VarHandle][#VH_allocate] - [Getter][#allocate()] - [Setter][#allocate(java.lang.foreign.MemorySegment)]
///
/// The memory allocation function.  See [GLFWAllocateFun] for details about
/// allocation function.
///
/// ### reallocate
/// [VarHandle][#VH_reallocate] - [Getter][#reallocate()] - [Setter][#reallocate(java.lang.foreign.MemorySegment)]
///
/// The memory reallocation function.  See [GLFWReallocateFun] for details about
/// reallocation function.
///
/// ### deallocate
/// [VarHandle][#VH_deallocate] - [Getter][#deallocate()] - [Setter][#deallocate(java.lang.foreign.MemorySegment)]
///
/// The memory deallocation function.  See [GLFWDeallocateFun] for details about
/// deallocation function.
///
/// ### user
/// [VarHandle][#VH_user] - [Getter][#user()] - [Setter][#user(java.lang.foreign.MemorySegment)]
///
/// The user pointer for this custom allocator.  This value will be passed to the
/// allocator functions.
///
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
public final class GLFWAllocator extends Struct {
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

    /// Allocates a `GLFWAllocator` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `GLFWAllocator`
    public static GLFWAllocator alloc(SegmentAllocator allocator) { return new GLFWAllocator(allocator.allocate(LAYOUT)); }

    /// Allocates a `GLFWAllocator` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `GLFWAllocator`
    public static GLFWAllocator alloc(SegmentAllocator allocator, long count) { return new GLFWAllocator(allocator.allocate(LAYOUT, count)); }

    /// {@return `allocate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("GLFWallocatefun") java.lang.foreign.MemorySegment get_allocate(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_allocate.get(segment, 0L, index); }
    /// {@return `allocate`}
    /// @param segment the segment of the struct
    public static @CType("GLFWallocatefun") java.lang.foreign.MemorySegment get_allocate(MemorySegment segment) { return GLFWAllocator.get_allocate(segment, 0L); }
    /// {@return `allocate` at the given index}
    /// @param index the index
    public @CType("GLFWallocatefun") java.lang.foreign.MemorySegment allocateAt(long index) { return GLFWAllocator.get_allocate(this.segment(), index); }
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
    /// Sets `allocate` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public GLFWAllocator allocateAt(long index, @CType("GLFWallocatefun") java.lang.foreign.MemorySegment value) { GLFWAllocator.set_allocate(this.segment(), index, value); return this; }
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
    /// {@return `reallocate` at the given index}
    /// @param index the index
    public @CType("GLFWreallocatefun") java.lang.foreign.MemorySegment reallocateAt(long index) { return GLFWAllocator.get_reallocate(this.segment(), index); }
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
    /// Sets `reallocate` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public GLFWAllocator reallocateAt(long index, @CType("GLFWreallocatefun") java.lang.foreign.MemorySegment value) { GLFWAllocator.set_reallocate(this.segment(), index, value); return this; }
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
    /// {@return `deallocate` at the given index}
    /// @param index the index
    public @CType("GLFWdeallocatefun") java.lang.foreign.MemorySegment deallocateAt(long index) { return GLFWAllocator.get_deallocate(this.segment(), index); }
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
    /// Sets `deallocate` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public GLFWAllocator deallocateAt(long index, @CType("GLFWdeallocatefun") java.lang.foreign.MemorySegment value) { GLFWAllocator.set_deallocate(this.segment(), index, value); return this; }
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
    /// {@return `user` at the given index}
    /// @param index the index
    public @CType("void*") java.lang.foreign.MemorySegment userAt(long index) { return GLFWAllocator.get_user(this.segment(), index); }
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
    /// Sets `user` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public GLFWAllocator userAt(long index, @CType("void*") java.lang.foreign.MemorySegment value) { GLFWAllocator.set_user(this.segment(), index, value); return this; }
    /// Sets `user` with the given value.
    /// @param value the value
    /// @return `this`
    public GLFWAllocator user(@CType("void*") java.lang.foreign.MemorySegment value) { GLFWAllocator.set_user(this.segment(), value); return this; }

}
