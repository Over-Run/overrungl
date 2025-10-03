// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkConformanceVersion`.
/// ## Layout
/// ```
/// struct VkConformanceVersion {
///     uint8_t major;
///     uint8_t minor;
///     uint8_t subminor;
///     uint8_t patch;
/// };
/// ```
public final class VkConformanceVersion extends GroupType {
    /// The struct layout of `VkConformanceVersion`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("major"),
        ValueLayout.JAVA_BYTE.withName("minor"),
        ValueLayout.JAVA_BYTE.withName("subminor"),
        ValueLayout.JAVA_BYTE.withName("patch")
    );
    /// The byte offset of `major`.
    public static final long OFFSET_major = LAYOUT.byteOffset(PathElement.groupElement("major"));
    /// The memory layout of `major`.
    public static final MemoryLayout LAYOUT_major = LAYOUT.select(PathElement.groupElement("major"));
    /// The [VarHandle] of `major` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_major = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("major")));
    /// The byte offset of `minor`.
    public static final long OFFSET_minor = LAYOUT.byteOffset(PathElement.groupElement("minor"));
    /// The memory layout of `minor`.
    public static final MemoryLayout LAYOUT_minor = LAYOUT.select(PathElement.groupElement("minor"));
    /// The [VarHandle] of `minor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_minor = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("minor")));
    /// The byte offset of `subminor`.
    public static final long OFFSET_subminor = LAYOUT.byteOffset(PathElement.groupElement("subminor"));
    /// The memory layout of `subminor`.
    public static final MemoryLayout LAYOUT_subminor = LAYOUT.select(PathElement.groupElement("subminor"));
    /// The [VarHandle] of `subminor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_subminor = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("subminor")));
    /// The byte offset of `patch`.
    public static final long OFFSET_patch = LAYOUT.byteOffset(PathElement.groupElement("patch"));
    /// The memory layout of `patch`.
    public static final MemoryLayout LAYOUT_patch = LAYOUT.select(PathElement.groupElement("patch"));
    /// The [VarHandle] of `patch` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_patch = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("patch")));

    /// Creates `VkConformanceVersion` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkConformanceVersion(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkConformanceVersion` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkConformanceVersion of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkConformanceVersion(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkConformanceVersion` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkConformanceVersion ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkConformanceVersion(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkConformanceVersion` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkConformanceVersion ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkConformanceVersion(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkConformanceVersion` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkConformanceVersion`
    public static VkConformanceVersion alloc(SegmentAllocator allocator) { return new VkConformanceVersion(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkConformanceVersion` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkConformanceVersion`
    public static VkConformanceVersion alloc(SegmentAllocator allocator, long count) { return new VkConformanceVersion(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkConformanceVersion copyFrom(VkConformanceVersion src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkConformanceVersion reinterpret(long count) { return new VkConformanceVersion(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `major` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte major(MemorySegment segment, long index) { return (byte) VH_major.get().get(segment, 0L, index); }
    /// {@return `major`}
    public byte major() { return major(this.segment(), 0L); }
    /// Sets `major` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void major(MemorySegment segment, long index, byte value) { VH_major.get().set(segment, 0L, index, value); }
    /// Sets `major` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion major(byte value) { major(this.segment(), 0L, value); return this; }

    /// {@return `minor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte minor(MemorySegment segment, long index) { return (byte) VH_minor.get().get(segment, 0L, index); }
    /// {@return `minor`}
    public byte minor() { return minor(this.segment(), 0L); }
    /// Sets `minor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minor(MemorySegment segment, long index, byte value) { VH_minor.get().set(segment, 0L, index, value); }
    /// Sets `minor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion minor(byte value) { minor(this.segment(), 0L, value); return this; }

    /// {@return `subminor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte subminor(MemorySegment segment, long index) { return (byte) VH_subminor.get().get(segment, 0L, index); }
    /// {@return `subminor`}
    public byte subminor() { return subminor(this.segment(), 0L); }
    /// Sets `subminor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subminor(MemorySegment segment, long index, byte value) { VH_subminor.get().set(segment, 0L, index, value); }
    /// Sets `subminor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion subminor(byte value) { subminor(this.segment(), 0L, value); return this; }

    /// {@return `patch` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte patch(MemorySegment segment, long index) { return (byte) VH_patch.get().get(segment, 0L, index); }
    /// {@return `patch`}
    public byte patch() { return patch(this.segment(), 0L); }
    /// Sets `patch` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void patch(MemorySegment segment, long index, byte value) { VH_patch.get().set(segment, 0L, index, value); }
    /// Sets `patch` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion patch(byte value) { patch(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkConformanceVersion`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkConformanceVersion`
    public VkConformanceVersion asSlice(long index) { return new VkConformanceVersion(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkConformanceVersion`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkConformanceVersion`
    public VkConformanceVersion asSlice(long index, long count) { return new VkConformanceVersion(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkConformanceVersion` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkConformanceVersion at(long index, Consumer<VkConformanceVersion> func) { func.accept(asSlice(index)); return this; }

    /// {@return `major` at the given index}
    /// @param index the index of the struct buffer
    public byte majorAt(long index) { return major(this.segment(), index); }
    /// Sets `major` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion majorAt(long index, byte value) { major(this.segment(), index, value); return this; }

    /// {@return `minor` at the given index}
    /// @param index the index of the struct buffer
    public byte minorAt(long index) { return minor(this.segment(), index); }
    /// Sets `minor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion minorAt(long index, byte value) { minor(this.segment(), index, value); return this; }

    /// {@return `subminor` at the given index}
    /// @param index the index of the struct buffer
    public byte subminorAt(long index) { return subminor(this.segment(), index); }
    /// Sets `subminor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion subminorAt(long index, byte value) { subminor(this.segment(), index, value); return this; }

    /// {@return `patch` at the given index}
    /// @param index the index of the struct buffer
    public byte patchAt(long index) { return patch(this.segment(), index); }
    /// Sets `patch` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion patchAt(long index, byte value) { patch(this.segment(), index, value); return this; }

}
