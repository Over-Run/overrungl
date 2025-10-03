// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxGraphicsShaderGroupCount;
///     uint32_t maxIndirectSequenceCount;
///     uint32_t maxIndirectCommandsTokenCount;
///     uint32_t maxIndirectCommandsStreamCount;
///     uint32_t maxIndirectCommandsTokenOffset;
///     uint32_t maxIndirectCommandsStreamStride;
///     uint32_t minSequencesCountBufferOffsetAlignment;
///     uint32_t minSequencesIndexBufferOffsetAlignment;
///     uint32_t minIndirectCommandsBufferOffsetAlignment;
/// };
/// ```
public final class VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxGraphicsShaderGroupCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectSequenceCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsTokenCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsStreamCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsTokenOffset"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsStreamStride"),
        ValueLayout.JAVA_INT.withName("minSequencesCountBufferOffsetAlignment"),
        ValueLayout.JAVA_INT.withName("minSequencesIndexBufferOffsetAlignment"),
        ValueLayout.JAVA_INT.withName("minIndirectCommandsBufferOffsetAlignment")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `maxGraphicsShaderGroupCount`.
    public static final long OFFSET_maxGraphicsShaderGroupCount = LAYOUT.byteOffset(PathElement.groupElement("maxGraphicsShaderGroupCount"));
    /// The memory layout of `maxGraphicsShaderGroupCount`.
    public static final MemoryLayout LAYOUT_maxGraphicsShaderGroupCount = LAYOUT.select(PathElement.groupElement("maxGraphicsShaderGroupCount"));
    /// The [VarHandle] of `maxGraphicsShaderGroupCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxGraphicsShaderGroupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGraphicsShaderGroupCount"));
    /// The byte offset of `maxIndirectSequenceCount`.
    public static final long OFFSET_maxIndirectSequenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectSequenceCount"));
    /// The memory layout of `maxIndirectSequenceCount`.
    public static final MemoryLayout LAYOUT_maxIndirectSequenceCount = LAYOUT.select(PathElement.groupElement("maxIndirectSequenceCount"));
    /// The [VarHandle] of `maxIndirectSequenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxIndirectSequenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectSequenceCount"));
    /// The byte offset of `maxIndirectCommandsTokenCount`.
    public static final long OFFSET_maxIndirectCommandsTokenCount = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsTokenCount"));
    /// The memory layout of `maxIndirectCommandsTokenCount`.
    public static final MemoryLayout LAYOUT_maxIndirectCommandsTokenCount = LAYOUT.select(PathElement.groupElement("maxIndirectCommandsTokenCount"));
    /// The [VarHandle] of `maxIndirectCommandsTokenCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxIndirectCommandsTokenCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsTokenCount"));
    /// The byte offset of `maxIndirectCommandsStreamCount`.
    public static final long OFFSET_maxIndirectCommandsStreamCount = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsStreamCount"));
    /// The memory layout of `maxIndirectCommandsStreamCount`.
    public static final MemoryLayout LAYOUT_maxIndirectCommandsStreamCount = LAYOUT.select(PathElement.groupElement("maxIndirectCommandsStreamCount"));
    /// The [VarHandle] of `maxIndirectCommandsStreamCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxIndirectCommandsStreamCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsStreamCount"));
    /// The byte offset of `maxIndirectCommandsTokenOffset`.
    public static final long OFFSET_maxIndirectCommandsTokenOffset = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsTokenOffset"));
    /// The memory layout of `maxIndirectCommandsTokenOffset`.
    public static final MemoryLayout LAYOUT_maxIndirectCommandsTokenOffset = LAYOUT.select(PathElement.groupElement("maxIndirectCommandsTokenOffset"));
    /// The [VarHandle] of `maxIndirectCommandsTokenOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxIndirectCommandsTokenOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsTokenOffset"));
    /// The byte offset of `maxIndirectCommandsStreamStride`.
    public static final long OFFSET_maxIndirectCommandsStreamStride = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsStreamStride"));
    /// The memory layout of `maxIndirectCommandsStreamStride`.
    public static final MemoryLayout LAYOUT_maxIndirectCommandsStreamStride = LAYOUT.select(PathElement.groupElement("maxIndirectCommandsStreamStride"));
    /// The [VarHandle] of `maxIndirectCommandsStreamStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxIndirectCommandsStreamStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsStreamStride"));
    /// The byte offset of `minSequencesCountBufferOffsetAlignment`.
    public static final long OFFSET_minSequencesCountBufferOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("minSequencesCountBufferOffsetAlignment"));
    /// The memory layout of `minSequencesCountBufferOffsetAlignment`.
    public static final MemoryLayout LAYOUT_minSequencesCountBufferOffsetAlignment = LAYOUT.select(PathElement.groupElement("minSequencesCountBufferOffsetAlignment"));
    /// The [VarHandle] of `minSequencesCountBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minSequencesCountBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSequencesCountBufferOffsetAlignment"));
    /// The byte offset of `minSequencesIndexBufferOffsetAlignment`.
    public static final long OFFSET_minSequencesIndexBufferOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("minSequencesIndexBufferOffsetAlignment"));
    /// The memory layout of `minSequencesIndexBufferOffsetAlignment`.
    public static final MemoryLayout LAYOUT_minSequencesIndexBufferOffsetAlignment = LAYOUT.select(PathElement.groupElement("minSequencesIndexBufferOffsetAlignment"));
    /// The [VarHandle] of `minSequencesIndexBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minSequencesIndexBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSequencesIndexBufferOffsetAlignment"));
    /// The byte offset of `minIndirectCommandsBufferOffsetAlignment`.
    public static final long OFFSET_minIndirectCommandsBufferOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("minIndirectCommandsBufferOffsetAlignment"));
    /// The memory layout of `minIndirectCommandsBufferOffsetAlignment`.
    public static final MemoryLayout LAYOUT_minIndirectCommandsBufferOffsetAlignment = LAYOUT.select(PathElement.groupElement("minIndirectCommandsBufferOffsetAlignment"));
    /// The [VarHandle] of `minIndirectCommandsBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minIndirectCommandsBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minIndirectCommandsBufferOffsetAlignment"));

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV`
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV`
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV copyFrom(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV reinterpret(long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxGraphicsShaderGroupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxGraphicsShaderGroupCount(MemorySegment segment, long index) { return (int) VH_maxGraphicsShaderGroupCount.get(segment, 0L, index); }
    /// {@return `maxGraphicsShaderGroupCount`}
    public int maxGraphicsShaderGroupCount() { return maxGraphicsShaderGroupCount(this.segment(), 0L); }
    /// Sets `maxGraphicsShaderGroupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxGraphicsShaderGroupCount(MemorySegment segment, long index, int value) { VH_maxGraphicsShaderGroupCount.set(segment, 0L, index, value); }
    /// Sets `maxGraphicsShaderGroupCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxGraphicsShaderGroupCount(int value) { maxGraphicsShaderGroupCount(this.segment(), 0L, value); return this; }

    /// {@return `maxIndirectSequenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxIndirectSequenceCount(MemorySegment segment, long index) { return (int) VH_maxIndirectSequenceCount.get(segment, 0L, index); }
    /// {@return `maxIndirectSequenceCount`}
    public int maxIndirectSequenceCount() { return maxIndirectSequenceCount(this.segment(), 0L); }
    /// Sets `maxIndirectSequenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxIndirectSequenceCount(MemorySegment segment, long index, int value) { VH_maxIndirectSequenceCount.set(segment, 0L, index, value); }
    /// Sets `maxIndirectSequenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectSequenceCount(int value) { maxIndirectSequenceCount(this.segment(), 0L, value); return this; }

    /// {@return `maxIndirectCommandsTokenCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxIndirectCommandsTokenCount(MemorySegment segment, long index) { return (int) VH_maxIndirectCommandsTokenCount.get(segment, 0L, index); }
    /// {@return `maxIndirectCommandsTokenCount`}
    public int maxIndirectCommandsTokenCount() { return maxIndirectCommandsTokenCount(this.segment(), 0L); }
    /// Sets `maxIndirectCommandsTokenCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxIndirectCommandsTokenCount(MemorySegment segment, long index, int value) { VH_maxIndirectCommandsTokenCount.set(segment, 0L, index, value); }
    /// Sets `maxIndirectCommandsTokenCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsTokenCount(int value) { maxIndirectCommandsTokenCount(this.segment(), 0L, value); return this; }

    /// {@return `maxIndirectCommandsStreamCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxIndirectCommandsStreamCount(MemorySegment segment, long index) { return (int) VH_maxIndirectCommandsStreamCount.get(segment, 0L, index); }
    /// {@return `maxIndirectCommandsStreamCount`}
    public int maxIndirectCommandsStreamCount() { return maxIndirectCommandsStreamCount(this.segment(), 0L); }
    /// Sets `maxIndirectCommandsStreamCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxIndirectCommandsStreamCount(MemorySegment segment, long index, int value) { VH_maxIndirectCommandsStreamCount.set(segment, 0L, index, value); }
    /// Sets `maxIndirectCommandsStreamCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsStreamCount(int value) { maxIndirectCommandsStreamCount(this.segment(), 0L, value); return this; }

    /// {@return `maxIndirectCommandsTokenOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxIndirectCommandsTokenOffset(MemorySegment segment, long index) { return (int) VH_maxIndirectCommandsTokenOffset.get(segment, 0L, index); }
    /// {@return `maxIndirectCommandsTokenOffset`}
    public int maxIndirectCommandsTokenOffset() { return maxIndirectCommandsTokenOffset(this.segment(), 0L); }
    /// Sets `maxIndirectCommandsTokenOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxIndirectCommandsTokenOffset(MemorySegment segment, long index, int value) { VH_maxIndirectCommandsTokenOffset.set(segment, 0L, index, value); }
    /// Sets `maxIndirectCommandsTokenOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsTokenOffset(int value) { maxIndirectCommandsTokenOffset(this.segment(), 0L, value); return this; }

    /// {@return `maxIndirectCommandsStreamStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxIndirectCommandsStreamStride(MemorySegment segment, long index) { return (int) VH_maxIndirectCommandsStreamStride.get(segment, 0L, index); }
    /// {@return `maxIndirectCommandsStreamStride`}
    public int maxIndirectCommandsStreamStride() { return maxIndirectCommandsStreamStride(this.segment(), 0L); }
    /// Sets `maxIndirectCommandsStreamStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxIndirectCommandsStreamStride(MemorySegment segment, long index, int value) { VH_maxIndirectCommandsStreamStride.set(segment, 0L, index, value); }
    /// Sets `maxIndirectCommandsStreamStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsStreamStride(int value) { maxIndirectCommandsStreamStride(this.segment(), 0L, value); return this; }

    /// {@return `minSequencesCountBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minSequencesCountBufferOffsetAlignment(MemorySegment segment, long index) { return (int) VH_minSequencesCountBufferOffsetAlignment.get(segment, 0L, index); }
    /// {@return `minSequencesCountBufferOffsetAlignment`}
    public int minSequencesCountBufferOffsetAlignment() { return minSequencesCountBufferOffsetAlignment(this.segment(), 0L); }
    /// Sets `minSequencesCountBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minSequencesCountBufferOffsetAlignment(MemorySegment segment, long index, int value) { VH_minSequencesCountBufferOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `minSequencesCountBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV minSequencesCountBufferOffsetAlignment(int value) { minSequencesCountBufferOffsetAlignment(this.segment(), 0L, value); return this; }

    /// {@return `minSequencesIndexBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minSequencesIndexBufferOffsetAlignment(MemorySegment segment, long index) { return (int) VH_minSequencesIndexBufferOffsetAlignment.get(segment, 0L, index); }
    /// {@return `minSequencesIndexBufferOffsetAlignment`}
    public int minSequencesIndexBufferOffsetAlignment() { return minSequencesIndexBufferOffsetAlignment(this.segment(), 0L); }
    /// Sets `minSequencesIndexBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minSequencesIndexBufferOffsetAlignment(MemorySegment segment, long index, int value) { VH_minSequencesIndexBufferOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `minSequencesIndexBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV minSequencesIndexBufferOffsetAlignment(int value) { minSequencesIndexBufferOffsetAlignment(this.segment(), 0L, value); return this; }

    /// {@return `minIndirectCommandsBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minIndirectCommandsBufferOffsetAlignment(MemorySegment segment, long index) { return (int) VH_minIndirectCommandsBufferOffsetAlignment.get(segment, 0L, index); }
    /// {@return `minIndirectCommandsBufferOffsetAlignment`}
    public int minIndirectCommandsBufferOffsetAlignment() { return minIndirectCommandsBufferOffsetAlignment(this.segment(), 0L); }
    /// Sets `minIndirectCommandsBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minIndirectCommandsBufferOffsetAlignment(MemorySegment segment, long index, int value) { VH_minIndirectCommandsBufferOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `minIndirectCommandsBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV minIndirectCommandsBufferOffsetAlignment(int value) { minIndirectCommandsBufferOffsetAlignment(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV asSlice(long index) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV at(long index, Consumer<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxGraphicsShaderGroupCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxGraphicsShaderGroupCountAt(long index) { return maxGraphicsShaderGroupCount(this.segment(), index); }
    /// Sets `maxGraphicsShaderGroupCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxGraphicsShaderGroupCountAt(long index, int value) { maxGraphicsShaderGroupCount(this.segment(), index, value); return this; }

    /// {@return `maxIndirectSequenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxIndirectSequenceCountAt(long index) { return maxIndirectSequenceCount(this.segment(), index); }
    /// Sets `maxIndirectSequenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectSequenceCountAt(long index, int value) { maxIndirectSequenceCount(this.segment(), index, value); return this; }

    /// {@return `maxIndirectCommandsTokenCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxIndirectCommandsTokenCountAt(long index) { return maxIndirectCommandsTokenCount(this.segment(), index); }
    /// Sets `maxIndirectCommandsTokenCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsTokenCountAt(long index, int value) { maxIndirectCommandsTokenCount(this.segment(), index, value); return this; }

    /// {@return `maxIndirectCommandsStreamCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxIndirectCommandsStreamCountAt(long index) { return maxIndirectCommandsStreamCount(this.segment(), index); }
    /// Sets `maxIndirectCommandsStreamCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsStreamCountAt(long index, int value) { maxIndirectCommandsStreamCount(this.segment(), index, value); return this; }

    /// {@return `maxIndirectCommandsTokenOffset` at the given index}
    /// @param index the index of the struct buffer
    public int maxIndirectCommandsTokenOffsetAt(long index) { return maxIndirectCommandsTokenOffset(this.segment(), index); }
    /// Sets `maxIndirectCommandsTokenOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsTokenOffsetAt(long index, int value) { maxIndirectCommandsTokenOffset(this.segment(), index, value); return this; }

    /// {@return `maxIndirectCommandsStreamStride` at the given index}
    /// @param index the index of the struct buffer
    public int maxIndirectCommandsStreamStrideAt(long index) { return maxIndirectCommandsStreamStride(this.segment(), index); }
    /// Sets `maxIndirectCommandsStreamStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsStreamStrideAt(long index, int value) { maxIndirectCommandsStreamStride(this.segment(), index, value); return this; }

    /// {@return `minSequencesCountBufferOffsetAlignment` at the given index}
    /// @param index the index of the struct buffer
    public int minSequencesCountBufferOffsetAlignmentAt(long index) { return minSequencesCountBufferOffsetAlignment(this.segment(), index); }
    /// Sets `minSequencesCountBufferOffsetAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV minSequencesCountBufferOffsetAlignmentAt(long index, int value) { minSequencesCountBufferOffsetAlignment(this.segment(), index, value); return this; }

    /// {@return `minSequencesIndexBufferOffsetAlignment` at the given index}
    /// @param index the index of the struct buffer
    public int minSequencesIndexBufferOffsetAlignmentAt(long index) { return minSequencesIndexBufferOffsetAlignment(this.segment(), index); }
    /// Sets `minSequencesIndexBufferOffsetAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV minSequencesIndexBufferOffsetAlignmentAt(long index, int value) { minSequencesIndexBufferOffsetAlignment(this.segment(), index, value); return this; }

    /// {@return `minIndirectCommandsBufferOffsetAlignment` at the given index}
    /// @param index the index of the struct buffer
    public int minIndirectCommandsBufferOffsetAlignmentAt(long index) { return minIndirectCommandsBufferOffsetAlignment(this.segment(), index); }
    /// Sets `minIndirectCommandsBufferOffsetAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV minIndirectCommandsBufferOffsetAlignmentAt(long index, int value) { minIndirectCommandsBufferOffsetAlignment(this.segment(), index, value); return this; }

}
