// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.opengl;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `GLDrawArraysIndirectCommand`.
/// ## Layout
/// ```
/// struct GLDrawArraysIndirectCommand {
///     unsigned int count;
///     unsigned int instanceCount;
///     unsigned int first;
///     unsigned int baseInstance;
/// };
/// ```
public final class GLDrawArraysIndirectCommand extends GroupType {
    /// The struct layout of `GLDrawArraysIndirectCommand`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("count"),
        ValueLayout.JAVA_INT.withName("instanceCount"),
        ValueLayout.JAVA_INT.withName("first"),
        ValueLayout.JAVA_INT.withName("baseInstance")
    );
    /// The byte offset of `count`.
    public static final long OFFSET_count = LAYOUT.byteOffset(PathElement.groupElement("count"));
    /// The memory layout of `count`.
    public static final MemoryLayout LAYOUT_count = LAYOUT.select(PathElement.groupElement("count"));
    /// The [VarHandle] of `count` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_count = LAYOUT.arrayElementVarHandle(PathElement.groupElement("count"));
    /// The byte offset of `instanceCount`.
    public static final long OFFSET_instanceCount = LAYOUT.byteOffset(PathElement.groupElement("instanceCount"));
    /// The memory layout of `instanceCount`.
    public static final MemoryLayout LAYOUT_instanceCount = LAYOUT.select(PathElement.groupElement("instanceCount"));
    /// The [VarHandle] of `instanceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_instanceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceCount"));
    /// The byte offset of `first`.
    public static final long OFFSET_first = LAYOUT.byteOffset(PathElement.groupElement("first"));
    /// The memory layout of `first`.
    public static final MemoryLayout LAYOUT_first = LAYOUT.select(PathElement.groupElement("first"));
    /// The [VarHandle] of `first` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_first = LAYOUT.arrayElementVarHandle(PathElement.groupElement("first"));
    /// The byte offset of `baseInstance`.
    public static final long OFFSET_baseInstance = LAYOUT.byteOffset(PathElement.groupElement("baseInstance"));
    /// The memory layout of `baseInstance`.
    public static final MemoryLayout LAYOUT_baseInstance = LAYOUT.select(PathElement.groupElement("baseInstance"));
    /// The [VarHandle] of `baseInstance` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_baseInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseInstance"));

    /// Creates `GLDrawArraysIndirectCommand` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public GLDrawArraysIndirectCommand(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `GLDrawArraysIndirectCommand` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLDrawArraysIndirectCommand of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new GLDrawArraysIndirectCommand(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `GLDrawArraysIndirectCommand` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLDrawArraysIndirectCommand ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new GLDrawArraysIndirectCommand(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `GLDrawArraysIndirectCommand` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static GLDrawArraysIndirectCommand ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new GLDrawArraysIndirectCommand(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `GLDrawArraysIndirectCommand` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `GLDrawArraysIndirectCommand`
    public static GLDrawArraysIndirectCommand alloc(SegmentAllocator allocator) { return new GLDrawArraysIndirectCommand(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `GLDrawArraysIndirectCommand` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `GLDrawArraysIndirectCommand`
    public static GLDrawArraysIndirectCommand alloc(SegmentAllocator allocator, long count) { return new GLDrawArraysIndirectCommand(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public GLDrawArraysIndirectCommand copyFrom(GLDrawArraysIndirectCommand src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public GLDrawArraysIndirectCommand reinterpret(long count) { return new GLDrawArraysIndirectCommand(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `count` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int count(MemorySegment segment, long index) { return (int) VH_count.get(segment, 0L, index); }
    /// {@return `count`}
    public int count() { return count(this.segment(), 0L); }
    /// Sets `count` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void count(MemorySegment segment, long index, int value) { VH_count.set(segment, 0L, index, value); }
    /// Sets `count` with the given value.
    /// @param value the value
    /// @return `this`
    public GLDrawArraysIndirectCommand count(int value) { count(this.segment(), 0L, value); return this; }

    /// {@return `instanceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int instanceCount(MemorySegment segment, long index) { return (int) VH_instanceCount.get(segment, 0L, index); }
    /// {@return `instanceCount`}
    public int instanceCount() { return instanceCount(this.segment(), 0L); }
    /// Sets `instanceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void instanceCount(MemorySegment segment, long index, int value) { VH_instanceCount.set(segment, 0L, index, value); }
    /// Sets `instanceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public GLDrawArraysIndirectCommand instanceCount(int value) { instanceCount(this.segment(), 0L, value); return this; }

    /// {@return `first` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int first(MemorySegment segment, long index) { return (int) VH_first.get(segment, 0L, index); }
    /// {@return `first`}
    public int first() { return first(this.segment(), 0L); }
    /// Sets `first` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void first(MemorySegment segment, long index, int value) { VH_first.set(segment, 0L, index, value); }
    /// Sets `first` with the given value.
    /// @param value the value
    /// @return `this`
    public GLDrawArraysIndirectCommand first(int value) { first(this.segment(), 0L, value); return this; }

    /// {@return `baseInstance` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int baseInstance(MemorySegment segment, long index) { return (int) VH_baseInstance.get(segment, 0L, index); }
    /// {@return `baseInstance`}
    public int baseInstance() { return baseInstance(this.segment(), 0L); }
    /// Sets `baseInstance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void baseInstance(MemorySegment segment, long index, int value) { VH_baseInstance.set(segment, 0L, index, value); }
    /// Sets `baseInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public GLDrawArraysIndirectCommand baseInstance(int value) { baseInstance(this.segment(), 0L, value); return this; }

    /// Creates a slice of `GLDrawArraysIndirectCommand`.
    /// @param index the index of the struct buffer
    /// @return the slice of `GLDrawArraysIndirectCommand`
    public GLDrawArraysIndirectCommand asSlice(long index) { return new GLDrawArraysIndirectCommand(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `GLDrawArraysIndirectCommand`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `GLDrawArraysIndirectCommand`
    public GLDrawArraysIndirectCommand asSlice(long index, long count) { return new GLDrawArraysIndirectCommand(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `GLDrawArraysIndirectCommand` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public GLDrawArraysIndirectCommand at(long index, Consumer<GLDrawArraysIndirectCommand> func) { func.accept(asSlice(index)); return this; }

    /// {@return `count` at the given index}
    /// @param index the index of the struct buffer
    public int countAt(long index) { return count(this.segment(), index); }
    /// Sets `count` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public GLDrawArraysIndirectCommand countAt(long index, int value) { count(this.segment(), index, value); return this; }

    /// {@return `instanceCount` at the given index}
    /// @param index the index of the struct buffer
    public int instanceCountAt(long index) { return instanceCount(this.segment(), index); }
    /// Sets `instanceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public GLDrawArraysIndirectCommand instanceCountAt(long index, int value) { instanceCount(this.segment(), index, value); return this; }

    /// {@return `first` at the given index}
    /// @param index the index of the struct buffer
    public int firstAt(long index) { return first(this.segment(), index); }
    /// Sets `first` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public GLDrawArraysIndirectCommand firstAt(long index, int value) { first(this.segment(), index, value); return this; }

    /// {@return `baseInstance` at the given index}
    /// @param index the index of the struct buffer
    public int baseInstanceAt(long index) { return baseInstance(this.segment(), index); }
    /// Sets `baseInstance` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public GLDrawArraysIndirectCommand baseInstanceAt(long index, int value) { baseInstance(this.segment(), index, value); return this; }

}
