// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.amd.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderCoreProperties2AMD`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderCoreProperties2AMD {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkShaderCorePropertiesFlagsAMD shaderCoreFeatures;
///     uint32_t activeComputeUnitCount;
/// };
/// ```
public final class VkPhysicalDeviceShaderCoreProperties2AMD extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderCoreProperties2AMD`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderCoreFeatures"),
        ValueLayout.JAVA_INT.withName("activeComputeUnitCount")
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
    /// The byte offset of `shaderCoreFeatures`.
    public static final long OFFSET_shaderCoreFeatures = LAYOUT.byteOffset(PathElement.groupElement("shaderCoreFeatures"));
    /// The memory layout of `shaderCoreFeatures`.
    public static final MemoryLayout LAYOUT_shaderCoreFeatures = LAYOUT.select(PathElement.groupElement("shaderCoreFeatures"));
    /// The [VarHandle] of `shaderCoreFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderCoreFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCoreFeatures"));
    /// The byte offset of `activeComputeUnitCount`.
    public static final long OFFSET_activeComputeUnitCount = LAYOUT.byteOffset(PathElement.groupElement("activeComputeUnitCount"));
    /// The memory layout of `activeComputeUnitCount`.
    public static final MemoryLayout LAYOUT_activeComputeUnitCount = LAYOUT.select(PathElement.groupElement("activeComputeUnitCount"));
    /// The [VarHandle] of `activeComputeUnitCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_activeComputeUnitCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("activeComputeUnitCount"));

    /// Creates `VkPhysicalDeviceShaderCoreProperties2AMD` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderCoreProperties2AMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderCoreProperties2AMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCoreProperties2AMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreProperties2AMD(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderCoreProperties2AMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCoreProperties2AMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreProperties2AMD(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderCoreProperties2AMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCoreProperties2AMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreProperties2AMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderCoreProperties2AMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderCoreProperties2AMD`
    public static VkPhysicalDeviceShaderCoreProperties2AMD alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderCoreProperties2AMD(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderCoreProperties2AMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderCoreProperties2AMD`
    public static VkPhysicalDeviceShaderCoreProperties2AMD alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderCoreProperties2AMD(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderCoreProperties2AMD copyFrom(VkPhysicalDeviceShaderCoreProperties2AMD src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderCoreProperties2AMD reinterpret(long count) { return new VkPhysicalDeviceShaderCoreProperties2AMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceShaderCoreProperties2AMD sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderCoreProperties2AMD pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderCoreFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderCoreFeatures(MemorySegment segment, long index) { return (int) VH_shaderCoreFeatures.get(segment, 0L, index); }
    /// {@return `shaderCoreFeatures`}
    public int shaderCoreFeatures() { return shaderCoreFeatures(this.segment(), 0L); }
    /// Sets `shaderCoreFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderCoreFeatures(MemorySegment segment, long index, int value) { VH_shaderCoreFeatures.set(segment, 0L, index, value); }
    /// Sets `shaderCoreFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreProperties2AMD shaderCoreFeatures(int value) { shaderCoreFeatures(this.segment(), 0L, value); return this; }

    /// {@return `activeComputeUnitCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int activeComputeUnitCount(MemorySegment segment, long index) { return (int) VH_activeComputeUnitCount.get(segment, 0L, index); }
    /// {@return `activeComputeUnitCount`}
    public int activeComputeUnitCount() { return activeComputeUnitCount(this.segment(), 0L); }
    /// Sets `activeComputeUnitCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void activeComputeUnitCount(MemorySegment segment, long index, int value) { VH_activeComputeUnitCount.set(segment, 0L, index, value); }
    /// Sets `activeComputeUnitCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreProperties2AMD activeComputeUnitCount(int value) { activeComputeUnitCount(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderCoreProperties2AMD`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderCoreProperties2AMD`
    public VkPhysicalDeviceShaderCoreProperties2AMD asSlice(long index) { return new VkPhysicalDeviceShaderCoreProperties2AMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderCoreProperties2AMD`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderCoreProperties2AMD`
    public VkPhysicalDeviceShaderCoreProperties2AMD asSlice(long index, long count) { return new VkPhysicalDeviceShaderCoreProperties2AMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderCoreProperties2AMD` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderCoreProperties2AMD at(long index, Consumer<VkPhysicalDeviceShaderCoreProperties2AMD> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreProperties2AMD sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreProperties2AMD pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderCoreFeatures` at the given index}
    /// @param index the index of the struct buffer
    public int shaderCoreFeaturesAt(long index) { return shaderCoreFeatures(this.segment(), index); }
    /// Sets `shaderCoreFeatures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreProperties2AMD shaderCoreFeaturesAt(long index, int value) { shaderCoreFeatures(this.segment(), index, value); return this; }

    /// {@return `activeComputeUnitCount` at the given index}
    /// @param index the index of the struct buffer
    public int activeComputeUnitCountAt(long index) { return activeComputeUnitCount(this.segment(), index); }
    /// Sets `activeComputeUnitCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreProperties2AMD activeComputeUnitCountAt(long index, int value) { activeComputeUnitCount(this.segment(), index, value); return this; }

}
