// This file is auto-generated. DO NOT EDIT!
package overrungl.shaderc;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `ShadercIncludeResult`.
/// ## Layout
/// ```
/// struct ShadercIncludeResult {
///     const char* source_name;
///     size_t source_name_length;
///     const char* content;
///     size_t content_length;
///     void* user_data;
/// };
/// ```
public final class ShadercIncludeResult extends GroupType {
    /// The struct layout of `ShadercIncludeResult`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("source_name"),
        CanonicalTypes.SIZE_T.withName("source_name_length"),
        ValueLayout.ADDRESS.withName("content"),
        CanonicalTypes.SIZE_T.withName("content_length"),
        ValueLayout.ADDRESS.withName("user_data")
    );
    /// The byte offset of `source_name`.
    public static final long OFFSET_source_name = LAYOUT.byteOffset(PathElement.groupElement("source_name"));
    /// The memory layout of `source_name`.
    public static final MemoryLayout LAYOUT_source_name = LAYOUT.select(PathElement.groupElement("source_name"));
    /// The [VarHandle] of `source_name` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_source_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("source_name"));
    /// The byte offset of `source_name_length`.
    public static final long OFFSET_source_name_length = LAYOUT.byteOffset(PathElement.groupElement("source_name_length"));
    /// The memory layout of `source_name_length`.
    public static final MemoryLayout LAYOUT_source_name_length = LAYOUT.select(PathElement.groupElement("source_name_length"));
    /// The [VarHandle] of `source_name_length` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_source_name_length = LAYOUT.arrayElementVarHandle(PathElement.groupElement("source_name_length"));
    /// The byte offset of `content`.
    public static final long OFFSET_content = LAYOUT.byteOffset(PathElement.groupElement("content"));
    /// The memory layout of `content`.
    public static final MemoryLayout LAYOUT_content = LAYOUT.select(PathElement.groupElement("content"));
    /// The [VarHandle] of `content` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_content = LAYOUT.arrayElementVarHandle(PathElement.groupElement("content"));
    /// The byte offset of `content_length`.
    public static final long OFFSET_content_length = LAYOUT.byteOffset(PathElement.groupElement("content_length"));
    /// The memory layout of `content_length`.
    public static final MemoryLayout LAYOUT_content_length = LAYOUT.select(PathElement.groupElement("content_length"));
    /// The [VarHandle] of `content_length` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_content_length = LAYOUT.arrayElementVarHandle(PathElement.groupElement("content_length"));
    /// The byte offset of `user_data`.
    public static final long OFFSET_user_data = LAYOUT.byteOffset(PathElement.groupElement("user_data"));
    /// The memory layout of `user_data`.
    public static final MemoryLayout LAYOUT_user_data = LAYOUT.select(PathElement.groupElement("user_data"));
    /// The [VarHandle] of `user_data` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_user_data = LAYOUT.arrayElementVarHandle(PathElement.groupElement("user_data"));

    /// Creates `ShadercIncludeResult` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public ShadercIncludeResult(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `ShadercIncludeResult` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static ShadercIncludeResult of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new ShadercIncludeResult(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `ShadercIncludeResult` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static ShadercIncludeResult ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new ShadercIncludeResult(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `ShadercIncludeResult` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static ShadercIncludeResult ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new ShadercIncludeResult(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `ShadercIncludeResult` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `ShadercIncludeResult`
    public static ShadercIncludeResult alloc(SegmentAllocator allocator) { return new ShadercIncludeResult(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `ShadercIncludeResult` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `ShadercIncludeResult`
    public static ShadercIncludeResult alloc(SegmentAllocator allocator, long count) { return new ShadercIncludeResult(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public ShadercIncludeResult copyFrom(ShadercIncludeResult src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public ShadercIncludeResult reinterpret(long count) { return new ShadercIncludeResult(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `source_name` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment source_name(MemorySegment segment, long index) { return (MemorySegment) VH_source_name.get(segment, 0L, index); }
    /// {@return `source_name`}
    public MemorySegment source_name() { return source_name(this.segment(), 0L); }
    /// Sets `source_name` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void source_name(MemorySegment segment, long index, MemorySegment value) { VH_source_name.set(segment, 0L, index, value); }
    /// Sets `source_name` with the given value.
    /// @param value the value
    /// @return `this`
    public ShadercIncludeResult source_name(MemorySegment value) { source_name(this.segment(), 0L, value); return this; }

    /// {@return `source_name_length` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long source_name_length(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_source_name_length.get(segment, 0L, index)); }
    /// {@return `source_name_length`}
    public long source_name_length() { return source_name_length(this.segment(), 0L); }
    /// Sets `source_name_length` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void source_name_length(MemorySegment segment, long index, long value) { VH_source_name_length.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `source_name_length` with the given value.
    /// @param value the value
    /// @return `this`
    public ShadercIncludeResult source_name_length(long value) { source_name_length(this.segment(), 0L, value); return this; }

    /// {@return `content` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment content(MemorySegment segment, long index) { return (MemorySegment) VH_content.get(segment, 0L, index); }
    /// {@return `content`}
    public MemorySegment content() { return content(this.segment(), 0L); }
    /// Sets `content` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void content(MemorySegment segment, long index, MemorySegment value) { VH_content.set(segment, 0L, index, value); }
    /// Sets `content` with the given value.
    /// @param value the value
    /// @return `this`
    public ShadercIncludeResult content(MemorySegment value) { content(this.segment(), 0L, value); return this; }

    /// {@return `content_length` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long content_length(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_content_length.get(segment, 0L, index)); }
    /// {@return `content_length`}
    public long content_length() { return content_length(this.segment(), 0L); }
    /// Sets `content_length` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void content_length(MemorySegment segment, long index, long value) { VH_content_length.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `content_length` with the given value.
    /// @param value the value
    /// @return `this`
    public ShadercIncludeResult content_length(long value) { content_length(this.segment(), 0L, value); return this; }

    /// {@return `user_data` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment user_data(MemorySegment segment, long index) { return (MemorySegment) VH_user_data.get(segment, 0L, index); }
    /// {@return `user_data`}
    public MemorySegment user_data() { return user_data(this.segment(), 0L); }
    /// Sets `user_data` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void user_data(MemorySegment segment, long index, MemorySegment value) { VH_user_data.set(segment, 0L, index, value); }
    /// Sets `user_data` with the given value.
    /// @param value the value
    /// @return `this`
    public ShadercIncludeResult user_data(MemorySegment value) { user_data(this.segment(), 0L, value); return this; }

    /// Creates a slice of `ShadercIncludeResult`.
    /// @param index the index of the struct buffer
    /// @return the slice of `ShadercIncludeResult`
    public ShadercIncludeResult asSlice(long index) { return new ShadercIncludeResult(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `ShadercIncludeResult`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `ShadercIncludeResult`
    public ShadercIncludeResult asSlice(long index, long count) { return new ShadercIncludeResult(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `ShadercIncludeResult` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public ShadercIncludeResult at(long index, Consumer<ShadercIncludeResult> func) { func.accept(asSlice(index)); return this; }

    /// {@return `source_name` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment source_nameAt(long index) { return source_name(this.segment(), index); }
    /// Sets `source_name` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public ShadercIncludeResult source_nameAt(long index, MemorySegment value) { source_name(this.segment(), index, value); return this; }

    /// {@return `source_name_length` at the given index}
    /// @param index the index of the struct buffer
    public long source_name_lengthAt(long index) { return source_name_length(this.segment(), index); }
    /// Sets `source_name_length` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public ShadercIncludeResult source_name_lengthAt(long index, long value) { source_name_length(this.segment(), index, value); return this; }

    /// {@return `content` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment contentAt(long index) { return content(this.segment(), index); }
    /// Sets `content` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public ShadercIncludeResult contentAt(long index, MemorySegment value) { content(this.segment(), index, value); return this; }

    /// {@return `content_length` at the given index}
    /// @param index the index of the struct buffer
    public long content_lengthAt(long index) { return content_length(this.segment(), index); }
    /// Sets `content_length` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public ShadercIncludeResult content_lengthAt(long index, long value) { content_length(this.segment(), index, value); return this; }

    /// {@return `user_data` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment user_dataAt(long index) { return user_data(this.segment(), index); }
    /// Sets `user_data` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public ShadercIncludeResult user_dataAt(long index, MemorySegment value) { user_data(this.segment(), index, value); return this; }

}
