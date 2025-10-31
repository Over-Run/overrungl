// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExtensionProperties`.
/// ## Layout
/// ```
/// struct VkExtensionProperties {
///     char extensionName[256];
///     uint32_t specVersion;
/// };
/// ```
public final class VkExtensionProperties extends GroupType {
    /// The struct layout of `VkExtensionProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("extensionName"),
        ValueLayout.JAVA_INT.withName("specVersion")
    );
    /// The byte offset of `extensionName`.
    public static final long OFFSET_extensionName = LAYOUT.byteOffset(PathElement.groupElement("extensionName"));
    /// The memory layout of `extensionName`.
    public static final MemoryLayout LAYOUT_extensionName = LAYOUT.select(PathElement.groupElement("extensionName"));
    /// The [VarHandle] of `extensionName` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_extensionName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extensionName"), PathElement.sequenceElement());
    /// The byte offset of `specVersion`.
    public static final long OFFSET_specVersion = LAYOUT.byteOffset(PathElement.groupElement("specVersion"));
    /// The memory layout of `specVersion`.
    public static final MemoryLayout LAYOUT_specVersion = LAYOUT.select(PathElement.groupElement("specVersion"));
    /// The [VarHandle] of `specVersion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_specVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("specVersion"));

    /// Creates `VkExtensionProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkExtensionProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkExtensionProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExtensionProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExtensionProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExtensionProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExtensionProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExtensionProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkExtensionProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExtensionProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExtensionProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExtensionProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExtensionProperties`
    public static VkExtensionProperties alloc(SegmentAllocator allocator) { return new VkExtensionProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkExtensionProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExtensionProperties`
    public static VkExtensionProperties alloc(SegmentAllocator allocator, long count) { return new VkExtensionProperties(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExtensionProperties copyFrom(VkExtensionProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkExtensionProperties reinterpret(long count) { return new VkExtensionProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `extensionName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment extensionName(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_extensionName, index), LAYOUT_extensionName); }
    /// {@return `extensionName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte extensionName(MemorySegment segment, long index, long index0) { return (byte) VH_extensionName.get(segment, 0L, index, index0); }
    /// {@return `extensionName`}
    public MemorySegment extensionName() { return extensionName(this.segment(), 0L); }
    /// {@return `extensionName`}
    /// @param index0 the Index 0 of the array
    public byte extensionName(long index0) { return extensionName(this.segment(), 0L, index0); }
    /// Sets `extensionName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extensionName(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_extensionName, index), LAYOUT_extensionName.byteSize()); }
    /// Sets `extensionName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void extensionName(MemorySegment segment, long index, long index0, byte value) { VH_extensionName.set(segment, 0L, index, index0, value); }
    /// Sets `extensionName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExtensionProperties extensionName(MemorySegment value) { extensionName(this.segment(), 0L, value); return this; }
    /// Sets `extensionName` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkExtensionProperties extensionName(long index0, byte value) { extensionName(this.segment(), 0L, index0, value); return this; }

    /// {@return `specVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int specVersion(MemorySegment segment, long index) { return (int) VH_specVersion.get(segment, 0L, index); }
    /// {@return `specVersion`}
    public int specVersion() { return specVersion(this.segment(), 0L); }
    /// Sets `specVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void specVersion(MemorySegment segment, long index, int value) { VH_specVersion.set(segment, 0L, index, value); }
    /// Sets `specVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExtensionProperties specVersion(int value) { specVersion(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkExtensionProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExtensionProperties`
    public VkExtensionProperties asSlice(long index) { return new VkExtensionProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkExtensionProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExtensionProperties`
    public VkExtensionProperties asSlice(long index, long count) { return new VkExtensionProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkExtensionProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkExtensionProperties at(long index, Consumer<VkExtensionProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `extensionName` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment extensionNameAt(long index) { return extensionName(this.segment(), index); }
    /// {@return `extensionName` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte extensionNameAt(long index, long index0) { return extensionName(this.segment(), index, index0); }
    /// Sets `extensionName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExtensionProperties extensionNameAt(long index, MemorySegment value) { extensionName(this.segment(), index, value); return this; }
    /// Sets `extensionName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkExtensionProperties extensionNameAt(long index, long index0, byte value) { extensionName(this.segment(), index, index0, value); return this; }

    /// {@return `specVersion` at the given index}
    /// @param index the index of the struct buffer
    public int specVersionAt(long index) { return specVersion(this.segment(), index); }
    /// Sets `specVersion` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExtensionProperties specVersionAt(long index, int value) { specVersion(this.segment(), index, value); return this; }

}
