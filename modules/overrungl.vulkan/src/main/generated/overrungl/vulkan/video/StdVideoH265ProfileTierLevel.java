// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoH265ProfileTierLevel`.
/// ## Layout
/// ```
/// struct StdVideoH265ProfileTierLevel {
///     (struct StdVideoH265ProfileTierLevelFlags) StdVideoH265ProfileTierLevelFlags flags;
///     (int) StdVideoH265ProfileIdc general_profile_idc;
///     (int) StdVideoH265LevelIdc general_level_idc;
/// };
/// ```
public final class StdVideoH265ProfileTierLevel extends GroupType {
    /// The struct layout of `StdVideoH265ProfileTierLevel`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoH265ProfileTierLevelFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("general_profile_idc"),
        ValueLayout.JAVA_INT.withName("general_level_idc")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `general_profile_idc`.
    public static final long OFFSET_general_profile_idc = LAYOUT.byteOffset(PathElement.groupElement("general_profile_idc"));
    /// The memory layout of `general_profile_idc`.
    public static final MemoryLayout LAYOUT_general_profile_idc = LAYOUT.select(PathElement.groupElement("general_profile_idc"));
    /// The [VarHandle] of `general_profile_idc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_general_profile_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("general_profile_idc"));
    /// The byte offset of `general_level_idc`.
    public static final long OFFSET_general_level_idc = LAYOUT.byteOffset(PathElement.groupElement("general_level_idc"));
    /// The memory layout of `general_level_idc`.
    public static final MemoryLayout LAYOUT_general_level_idc = LAYOUT.select(PathElement.groupElement("general_level_idc"));
    /// The [VarHandle] of `general_level_idc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_general_level_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("general_level_idc"));

    /// Creates `StdVideoH265ProfileTierLevel` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH265ProfileTierLevel(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH265ProfileTierLevel` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ProfileTierLevel of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ProfileTierLevel(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265ProfileTierLevel` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ProfileTierLevel ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ProfileTierLevel(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH265ProfileTierLevel` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ProfileTierLevel ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ProfileTierLevel(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265ProfileTierLevel` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265ProfileTierLevel`
    public static StdVideoH265ProfileTierLevel alloc(SegmentAllocator allocator) { return new StdVideoH265ProfileTierLevel(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH265ProfileTierLevel` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265ProfileTierLevel`
    public static StdVideoH265ProfileTierLevel alloc(SegmentAllocator allocator, long count) { return new StdVideoH265ProfileTierLevel(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265ProfileTierLevel copyFrom(StdVideoH265ProfileTierLevel src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH265ProfileTierLevel reinterpret(long count) { return new StdVideoH265ProfileTierLevel(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment flags(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    /// {@return `flags`}
    public MemorySegment flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags.byteSize()); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ProfileTierLevel flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoH265ProfileTierLevel flags(Consumer<overrungl.vulkan.video.StdVideoH265ProfileTierLevelFlags> func) { func.accept(overrungl.vulkan.video.StdVideoH265ProfileTierLevelFlags.of(flags())); return this; }

    /// {@return `general_profile_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int general_profile_idc(MemorySegment segment, long index) { return (int) VH_general_profile_idc.get(segment, 0L, index); }
    /// {@return `general_profile_idc`}
    public int general_profile_idc() { return general_profile_idc(this.segment(), 0L); }
    /// Sets `general_profile_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void general_profile_idc(MemorySegment segment, long index, int value) { VH_general_profile_idc.set(segment, 0L, index, value); }
    /// Sets `general_profile_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ProfileTierLevel general_profile_idc(int value) { general_profile_idc(this.segment(), 0L, value); return this; }

    /// {@return `general_level_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int general_level_idc(MemorySegment segment, long index) { return (int) VH_general_level_idc.get(segment, 0L, index); }
    /// {@return `general_level_idc`}
    public int general_level_idc() { return general_level_idc(this.segment(), 0L); }
    /// Sets `general_level_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void general_level_idc(MemorySegment segment, long index, int value) { VH_general_level_idc.set(segment, 0L, index, value); }
    /// Sets `general_level_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ProfileTierLevel general_level_idc(int value) { general_level_idc(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoH265ProfileTierLevel`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH265ProfileTierLevel`
    public StdVideoH265ProfileTierLevel asSlice(long index) { return new StdVideoH265ProfileTierLevel(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH265ProfileTierLevel`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH265ProfileTierLevel`
    public StdVideoH265ProfileTierLevel asSlice(long index, long count) { return new StdVideoH265ProfileTierLevel(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH265ProfileTierLevel` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH265ProfileTierLevel at(long index, Consumer<StdVideoH265ProfileTierLevel> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ProfileTierLevel flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoH265ProfileTierLevel flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoH265ProfileTierLevelFlags> func) { func.accept(overrungl.vulkan.video.StdVideoH265ProfileTierLevelFlags.of(flagsAt(index))); return this; }

    /// {@return `general_profile_idc` at the given index}
    /// @param index the index of the struct buffer
    public int general_profile_idcAt(long index) { return general_profile_idc(this.segment(), index); }
    /// Sets `general_profile_idc` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ProfileTierLevel general_profile_idcAt(long index, int value) { general_profile_idc(this.segment(), index, value); return this; }

    /// {@return `general_level_idc` at the given index}
    /// @param index the index of the struct buffer
    public int general_level_idcAt(long index) { return general_level_idc(this.segment(), index); }
    /// Sets `general_level_idc` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ProfileTierLevel general_level_idcAt(long index, int value) { general_level_idc(this.segment(), index, value); return this; }

}
