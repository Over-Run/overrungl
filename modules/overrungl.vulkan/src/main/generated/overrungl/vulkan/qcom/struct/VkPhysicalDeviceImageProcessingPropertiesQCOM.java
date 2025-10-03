// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.qcom.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImageProcessingPropertiesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageProcessingPropertiesQCOM {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxWeightFilterPhases;
///     (struct VkExtent2D) VkExtent2D maxWeightFilterDimension;
///     (struct VkExtent2D) VkExtent2D maxBlockMatchRegion;
///     (struct VkExtent2D) VkExtent2D maxBoxFilterBlockSize;
/// };
/// ```
public final class VkPhysicalDeviceImageProcessingPropertiesQCOM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceImageProcessingPropertiesQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxWeightFilterPhases"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxWeightFilterDimension"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxBlockMatchRegion"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxBoxFilterBlockSize")
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
    /// The byte offset of `maxWeightFilterPhases`.
    public static final long OFFSET_maxWeightFilterPhases = LAYOUT.byteOffset(PathElement.groupElement("maxWeightFilterPhases"));
    /// The memory layout of `maxWeightFilterPhases`.
    public static final MemoryLayout LAYOUT_maxWeightFilterPhases = LAYOUT.select(PathElement.groupElement("maxWeightFilterPhases"));
    /// The [VarHandle] of `maxWeightFilterPhases` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxWeightFilterPhases = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxWeightFilterPhases"));
    /// The byte offset of `maxWeightFilterDimension`.
    public static final long OFFSET_maxWeightFilterDimension = LAYOUT.byteOffset(PathElement.groupElement("maxWeightFilterDimension"));
    /// The memory layout of `maxWeightFilterDimension`.
    public static final MemoryLayout LAYOUT_maxWeightFilterDimension = LAYOUT.select(PathElement.groupElement("maxWeightFilterDimension"));
    /// The byte offset of `maxBlockMatchRegion`.
    public static final long OFFSET_maxBlockMatchRegion = LAYOUT.byteOffset(PathElement.groupElement("maxBlockMatchRegion"));
    /// The memory layout of `maxBlockMatchRegion`.
    public static final MemoryLayout LAYOUT_maxBlockMatchRegion = LAYOUT.select(PathElement.groupElement("maxBlockMatchRegion"));
    /// The byte offset of `maxBoxFilterBlockSize`.
    public static final long OFFSET_maxBoxFilterBlockSize = LAYOUT.byteOffset(PathElement.groupElement("maxBoxFilterBlockSize"));
    /// The memory layout of `maxBoxFilterBlockSize`.
    public static final MemoryLayout LAYOUT_maxBoxFilterBlockSize = LAYOUT.select(PathElement.groupElement("maxBoxFilterBlockSize"));

    /// Creates `VkPhysicalDeviceImageProcessingPropertiesQCOM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceImageProcessingPropertiesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceImageProcessingPropertiesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessingPropertiesQCOM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceImageProcessingPropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessingPropertiesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceImageProcessingPropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessingPropertiesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceImageProcessingPropertiesQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceImageProcessingPropertiesQCOM`
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageProcessingPropertiesQCOM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceImageProcessingPropertiesQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceImageProcessingPropertiesQCOM`
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageProcessingPropertiesQCOM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM copyFrom(VkPhysicalDeviceImageProcessingPropertiesQCOM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceImageProcessingPropertiesQCOM reinterpret(long count) { return new VkPhysicalDeviceImageProcessingPropertiesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceImageProcessingPropertiesQCOM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceImageProcessingPropertiesQCOM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxWeightFilterPhases` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxWeightFilterPhases(MemorySegment segment, long index) { return (int) VH_maxWeightFilterPhases.get(segment, 0L, index); }
    /// {@return `maxWeightFilterPhases`}
    public int maxWeightFilterPhases() { return maxWeightFilterPhases(this.segment(), 0L); }
    /// Sets `maxWeightFilterPhases` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxWeightFilterPhases(MemorySegment segment, long index, int value) { VH_maxWeightFilterPhases.set(segment, 0L, index, value); }
    /// Sets `maxWeightFilterPhases` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxWeightFilterPhases(int value) { maxWeightFilterPhases(this.segment(), 0L, value); return this; }

    /// {@return `maxWeightFilterDimension` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxWeightFilterDimension(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxWeightFilterDimension, index), LAYOUT_maxWeightFilterDimension); }
    /// {@return `maxWeightFilterDimension`}
    public MemorySegment maxWeightFilterDimension() { return maxWeightFilterDimension(this.segment(), 0L); }
    /// Sets `maxWeightFilterDimension` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxWeightFilterDimension(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxWeightFilterDimension, index), LAYOUT_maxWeightFilterDimension.byteSize()); }
    /// Sets `maxWeightFilterDimension` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxWeightFilterDimension(MemorySegment value) { maxWeightFilterDimension(this.segment(), 0L, value); return this; }
    /// Accepts `maxWeightFilterDimension` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxWeightFilterDimension(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxWeightFilterDimension())); return this; }

    /// {@return `maxBlockMatchRegion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxBlockMatchRegion(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxBlockMatchRegion, index), LAYOUT_maxBlockMatchRegion); }
    /// {@return `maxBlockMatchRegion`}
    public MemorySegment maxBlockMatchRegion() { return maxBlockMatchRegion(this.segment(), 0L); }
    /// Sets `maxBlockMatchRegion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxBlockMatchRegion(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxBlockMatchRegion, index), LAYOUT_maxBlockMatchRegion.byteSize()); }
    /// Sets `maxBlockMatchRegion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBlockMatchRegion(MemorySegment value) { maxBlockMatchRegion(this.segment(), 0L, value); return this; }
    /// Accepts `maxBlockMatchRegion` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBlockMatchRegion(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxBlockMatchRegion())); return this; }

    /// {@return `maxBoxFilterBlockSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxBoxFilterBlockSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxBoxFilterBlockSize, index), LAYOUT_maxBoxFilterBlockSize); }
    /// {@return `maxBoxFilterBlockSize`}
    public MemorySegment maxBoxFilterBlockSize() { return maxBoxFilterBlockSize(this.segment(), 0L); }
    /// Sets `maxBoxFilterBlockSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxBoxFilterBlockSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxBoxFilterBlockSize, index), LAYOUT_maxBoxFilterBlockSize.byteSize()); }
    /// Sets `maxBoxFilterBlockSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBoxFilterBlockSize(MemorySegment value) { maxBoxFilterBlockSize(this.segment(), 0L, value); return this; }
    /// Accepts `maxBoxFilterBlockSize` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBoxFilterBlockSize(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxBoxFilterBlockSize())); return this; }

    /// Creates a slice of `VkPhysicalDeviceImageProcessingPropertiesQCOM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceImageProcessingPropertiesQCOM`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM asSlice(long index) { return new VkPhysicalDeviceImageProcessingPropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceImageProcessingPropertiesQCOM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceImageProcessingPropertiesQCOM`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceImageProcessingPropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceImageProcessingPropertiesQCOM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM at(long index, Consumer<VkPhysicalDeviceImageProcessingPropertiesQCOM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxWeightFilterPhases` at the given index}
    /// @param index the index of the struct buffer
    public int maxWeightFilterPhasesAt(long index) { return maxWeightFilterPhases(this.segment(), index); }
    /// Sets `maxWeightFilterPhases` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxWeightFilterPhasesAt(long index, int value) { maxWeightFilterPhases(this.segment(), index, value); return this; }

    /// {@return `maxWeightFilterDimension` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxWeightFilterDimensionAt(long index) { return maxWeightFilterDimension(this.segment(), index); }
    /// Sets `maxWeightFilterDimension` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxWeightFilterDimensionAt(long index, MemorySegment value) { maxWeightFilterDimension(this.segment(), index, value); return this; }
    /// Accepts `maxWeightFilterDimension` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxWeightFilterDimensionAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxWeightFilterDimensionAt(index))); return this; }

    /// {@return `maxBlockMatchRegion` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxBlockMatchRegionAt(long index) { return maxBlockMatchRegion(this.segment(), index); }
    /// Sets `maxBlockMatchRegion` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBlockMatchRegionAt(long index, MemorySegment value) { maxBlockMatchRegion(this.segment(), index, value); return this; }
    /// Accepts `maxBlockMatchRegion` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBlockMatchRegionAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxBlockMatchRegionAt(index))); return this; }

    /// {@return `maxBoxFilterBlockSize` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxBoxFilterBlockSizeAt(long index) { return maxBoxFilterBlockSize(this.segment(), index); }
    /// Sets `maxBoxFilterBlockSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBoxFilterBlockSizeAt(long index, MemorySegment value) { maxBoxFilterBlockSize(this.segment(), index, value); return this; }
    /// Accepts `maxBoxFilterBlockSize` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBoxFilterBlockSizeAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxBoxFilterBlockSizeAt(index))); return this; }

}
