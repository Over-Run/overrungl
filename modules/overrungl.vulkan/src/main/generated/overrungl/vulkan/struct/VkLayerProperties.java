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

/// Represents `VkLayerProperties`.
/// ## Layout
/// ```
/// struct VkLayerProperties {
///     char layerName[256];
///     uint32_t specVersion;
///     uint32_t implementationVersion;
///     char description[256];
/// };
/// ```
public final class VkLayerProperties extends GroupType {
    /// The struct layout of `VkLayerProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("layerName"),
        ValueLayout.JAVA_INT.withName("specVersion"),
        ValueLayout.JAVA_INT.withName("implementationVersion"),
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("description")
    );
    /// The byte offset of `layerName`.
    public static final long OFFSET_layerName = LAYOUT.byteOffset(PathElement.groupElement("layerName"));
    /// The memory layout of `layerName`.
    public static final MemoryLayout LAYOUT_layerName = LAYOUT.select(PathElement.groupElement("layerName"));
    /// The [VarHandle] of `layerName` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_layerName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerName"), PathElement.sequenceElement());
    /// The byte offset of `specVersion`.
    public static final long OFFSET_specVersion = LAYOUT.byteOffset(PathElement.groupElement("specVersion"));
    /// The memory layout of `specVersion`.
    public static final MemoryLayout LAYOUT_specVersion = LAYOUT.select(PathElement.groupElement("specVersion"));
    /// The [VarHandle] of `specVersion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_specVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("specVersion"));
    /// The byte offset of `implementationVersion`.
    public static final long OFFSET_implementationVersion = LAYOUT.byteOffset(PathElement.groupElement("implementationVersion"));
    /// The memory layout of `implementationVersion`.
    public static final MemoryLayout LAYOUT_implementationVersion = LAYOUT.select(PathElement.groupElement("implementationVersion"));
    /// The [VarHandle] of `implementationVersion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_implementationVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("implementationVersion"));
    /// The byte offset of `description`.
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    /// The memory layout of `description`.
    public static final MemoryLayout LAYOUT_description = LAYOUT.select(PathElement.groupElement("description"));
    /// The [VarHandle] of `description` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_description = LAYOUT.arrayElementVarHandle(PathElement.groupElement("description"), PathElement.sequenceElement());

    /// Creates `VkLayerProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkLayerProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkLayerProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLayerProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLayerProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkLayerProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLayerProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLayerProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkLayerProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLayerProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkLayerProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkLayerProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLayerProperties`
    public static VkLayerProperties alloc(SegmentAllocator allocator) { return new VkLayerProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkLayerProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkLayerProperties`
    public static VkLayerProperties alloc(SegmentAllocator allocator, long count) { return new VkLayerProperties(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkLayerProperties copyFrom(VkLayerProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkLayerProperties reinterpret(long count) { return new VkLayerProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `layerName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment layerName(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_layerName, index), LAYOUT_layerName); }
    /// {@return `layerName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte layerName(MemorySegment segment, long index, long index0) { return (byte) VH_layerName.get(segment, 0L, index, index0); }
    /// {@return `layerName`}
    public MemorySegment layerName() { return layerName(this.segment(), 0L); }
    /// {@return `layerName`}
    /// @param index0 the Index 0 of the array
    public byte layerName(long index0) { return layerName(this.segment(), 0L, index0); }
    /// Sets `layerName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layerName(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_layerName, index), LAYOUT_layerName.byteSize()); }
    /// Sets `layerName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void layerName(MemorySegment segment, long index, long index0, byte value) { VH_layerName.set(segment, 0L, index, index0, value); }
    /// Sets `layerName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerProperties layerName(MemorySegment value) { layerName(this.segment(), 0L, value); return this; }
    /// Sets `layerName` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkLayerProperties layerName(long index0, byte value) { layerName(this.segment(), 0L, index0, value); return this; }

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
    public VkLayerProperties specVersion(int value) { specVersion(this.segment(), 0L, value); return this; }

    /// {@return `implementationVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int implementationVersion(MemorySegment segment, long index) { return (int) VH_implementationVersion.get(segment, 0L, index); }
    /// {@return `implementationVersion`}
    public int implementationVersion() { return implementationVersion(this.segment(), 0L); }
    /// Sets `implementationVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void implementationVersion(MemorySegment segment, long index, int value) { VH_implementationVersion.set(segment, 0L, index, value); }
    /// Sets `implementationVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerProperties implementationVersion(int value) { implementationVersion(this.segment(), 0L, value); return this; }

    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment description(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_description, index), LAYOUT_description); }
    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte description(MemorySegment segment, long index, long index0) { return (byte) VH_description.get(segment, 0L, index, index0); }
    /// {@return `description`}
    public MemorySegment description() { return description(this.segment(), 0L); }
    /// {@return `description`}
    /// @param index0 the Index 0 of the array
    public byte description(long index0) { return description(this.segment(), 0L, index0); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void description(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_description, index), LAYOUT_description.byteSize()); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void description(MemorySegment segment, long index, long index0, byte value) { VH_description.set(segment, 0L, index, index0, value); }
    /// Sets `description` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerProperties description(MemorySegment value) { description(this.segment(), 0L, value); return this; }
    /// Sets `description` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkLayerProperties description(long index0, byte value) { description(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `VkLayerProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkLayerProperties`
    public VkLayerProperties asSlice(long index) { return new VkLayerProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkLayerProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkLayerProperties`
    public VkLayerProperties asSlice(long index, long count) { return new VkLayerProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkLayerProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkLayerProperties at(long index, Consumer<VkLayerProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `layerName` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment layerNameAt(long index) { return layerName(this.segment(), index); }
    /// {@return `layerName` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte layerNameAt(long index, long index0) { return layerName(this.segment(), index, index0); }
    /// Sets `layerName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLayerProperties layerNameAt(long index, MemorySegment value) { layerName(this.segment(), index, value); return this; }
    /// Sets `layerName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkLayerProperties layerNameAt(long index, long index0, byte value) { layerName(this.segment(), index, index0, value); return this; }

    /// {@return `specVersion` at the given index}
    /// @param index the index of the struct buffer
    public int specVersionAt(long index) { return specVersion(this.segment(), index); }
    /// Sets `specVersion` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLayerProperties specVersionAt(long index, int value) { specVersion(this.segment(), index, value); return this; }

    /// {@return `implementationVersion` at the given index}
    /// @param index the index of the struct buffer
    public int implementationVersionAt(long index) { return implementationVersion(this.segment(), index); }
    /// Sets `implementationVersion` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLayerProperties implementationVersionAt(long index, int value) { implementationVersion(this.segment(), index, value); return this; }

    /// {@return `description` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment descriptionAt(long index) { return description(this.segment(), index); }
    /// {@return `description` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte descriptionAt(long index, long index0) { return description(this.segment(), index, index0); }
    /// Sets `description` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLayerProperties descriptionAt(long index, MemorySegment value) { description(this.segment(), index, value); return this; }
    /// Sets `description` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkLayerProperties descriptionAt(long index, long index0, byte value) { description(this.segment(), index, index0, value); return this; }

}
