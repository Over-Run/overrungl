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

/// Represents `VkPhysicalDeviceMaintenance5Properties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMaintenance5Properties {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 earlyFragmentMultisampleCoverageAfterSampleCounting;
///     (uint32_t) VkBool32 earlyFragmentSampleMaskTestBeforeSampleCounting;
///     (uint32_t) VkBool32 depthStencilSwizzleOneSupport;
///     (uint32_t) VkBool32 polygonModePointSize;
///     (uint32_t) VkBool32 nonStrictSinglePixelWideLinesUseParallelogram;
///     (uint32_t) VkBool32 nonStrictWideLinesUseParallelogram;
/// };
/// ```
public final class VkPhysicalDeviceMaintenance5Properties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMaintenance5Properties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("earlyFragmentMultisampleCoverageAfterSampleCounting"),
        ValueLayout.JAVA_INT.withName("earlyFragmentSampleMaskTestBeforeSampleCounting"),
        ValueLayout.JAVA_INT.withName("depthStencilSwizzleOneSupport"),
        ValueLayout.JAVA_INT.withName("polygonModePointSize"),
        ValueLayout.JAVA_INT.withName("nonStrictSinglePixelWideLinesUseParallelogram"),
        ValueLayout.JAVA_INT.withName("nonStrictWideLinesUseParallelogram")
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
    /// The byte offset of `earlyFragmentMultisampleCoverageAfterSampleCounting`.
    public static final long OFFSET_earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT.byteOffset(PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting"));
    /// The memory layout of `earlyFragmentMultisampleCoverageAfterSampleCounting`.
    public static final MemoryLayout LAYOUT_earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT.select(PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting"));
    /// The [VarHandle] of `earlyFragmentMultisampleCoverageAfterSampleCounting` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT.arrayElementVarHandle(PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting"));
    /// The byte offset of `earlyFragmentSampleMaskTestBeforeSampleCounting`.
    public static final long OFFSET_earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT.byteOffset(PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting"));
    /// The memory layout of `earlyFragmentSampleMaskTestBeforeSampleCounting`.
    public static final MemoryLayout LAYOUT_earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT.select(PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting"));
    /// The [VarHandle] of `earlyFragmentSampleMaskTestBeforeSampleCounting` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT.arrayElementVarHandle(PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting"));
    /// The byte offset of `depthStencilSwizzleOneSupport`.
    public static final long OFFSET_depthStencilSwizzleOneSupport = LAYOUT.byteOffset(PathElement.groupElement("depthStencilSwizzleOneSupport"));
    /// The memory layout of `depthStencilSwizzleOneSupport`.
    public static final MemoryLayout LAYOUT_depthStencilSwizzleOneSupport = LAYOUT.select(PathElement.groupElement("depthStencilSwizzleOneSupport"));
    /// The [VarHandle] of `depthStencilSwizzleOneSupport` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthStencilSwizzleOneSupport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthStencilSwizzleOneSupport"));
    /// The byte offset of `polygonModePointSize`.
    public static final long OFFSET_polygonModePointSize = LAYOUT.byteOffset(PathElement.groupElement("polygonModePointSize"));
    /// The memory layout of `polygonModePointSize`.
    public static final MemoryLayout LAYOUT_polygonModePointSize = LAYOUT.select(PathElement.groupElement("polygonModePointSize"));
    /// The [VarHandle] of `polygonModePointSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_polygonModePointSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("polygonModePointSize"));
    /// The byte offset of `nonStrictSinglePixelWideLinesUseParallelogram`.
    public static final long OFFSET_nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT.byteOffset(PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram"));
    /// The memory layout of `nonStrictSinglePixelWideLinesUseParallelogram`.
    public static final MemoryLayout LAYOUT_nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT.select(PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram"));
    /// The [VarHandle] of `nonStrictSinglePixelWideLinesUseParallelogram` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram"));
    /// The byte offset of `nonStrictWideLinesUseParallelogram`.
    public static final long OFFSET_nonStrictWideLinesUseParallelogram = LAYOUT.byteOffset(PathElement.groupElement("nonStrictWideLinesUseParallelogram"));
    /// The memory layout of `nonStrictWideLinesUseParallelogram`.
    public static final MemoryLayout LAYOUT_nonStrictWideLinesUseParallelogram = LAYOUT.select(PathElement.groupElement("nonStrictWideLinesUseParallelogram"));
    /// The [VarHandle] of `nonStrictWideLinesUseParallelogram` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_nonStrictWideLinesUseParallelogram = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nonStrictWideLinesUseParallelogram"));

    /// Creates `VkPhysicalDeviceMaintenance5Properties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceMaintenance5Properties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceMaintenance5Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance5Properties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance5Properties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMaintenance5Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance5Properties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance5Properties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceMaintenance5Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance5Properties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance5Properties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMaintenance5Properties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMaintenance5Properties`
    public static VkPhysicalDeviceMaintenance5Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance5Properties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceMaintenance5Properties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMaintenance5Properties`
    public static VkPhysicalDeviceMaintenance5Properties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance5Properties(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties copyFrom(VkPhysicalDeviceMaintenance5Properties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceMaintenance5Properties reinterpret(long count) { return new VkPhysicalDeviceMaintenance5Properties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceMaintenance5Properties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMaintenance5Properties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `earlyFragmentMultisampleCoverageAfterSampleCounting` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int earlyFragmentMultisampleCoverageAfterSampleCounting(MemorySegment segment, long index) { return (int) VH_earlyFragmentMultisampleCoverageAfterSampleCounting.get(segment, 0L, index); }
    /// {@return `earlyFragmentMultisampleCoverageAfterSampleCounting`}
    public int earlyFragmentMultisampleCoverageAfterSampleCounting() { return earlyFragmentMultisampleCoverageAfterSampleCounting(this.segment(), 0L); }
    /// Sets `earlyFragmentMultisampleCoverageAfterSampleCounting` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void earlyFragmentMultisampleCoverageAfterSampleCounting(MemorySegment segment, long index, int value) { VH_earlyFragmentMultisampleCoverageAfterSampleCounting.set(segment, 0L, index, value); }
    /// Sets `earlyFragmentMultisampleCoverageAfterSampleCounting` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties earlyFragmentMultisampleCoverageAfterSampleCounting(int value) { earlyFragmentMultisampleCoverageAfterSampleCounting(this.segment(), 0L, value); return this; }

    /// {@return `earlyFragmentSampleMaskTestBeforeSampleCounting` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int earlyFragmentSampleMaskTestBeforeSampleCounting(MemorySegment segment, long index) { return (int) VH_earlyFragmentSampleMaskTestBeforeSampleCounting.get(segment, 0L, index); }
    /// {@return `earlyFragmentSampleMaskTestBeforeSampleCounting`}
    public int earlyFragmentSampleMaskTestBeforeSampleCounting() { return earlyFragmentSampleMaskTestBeforeSampleCounting(this.segment(), 0L); }
    /// Sets `earlyFragmentSampleMaskTestBeforeSampleCounting` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void earlyFragmentSampleMaskTestBeforeSampleCounting(MemorySegment segment, long index, int value) { VH_earlyFragmentSampleMaskTestBeforeSampleCounting.set(segment, 0L, index, value); }
    /// Sets `earlyFragmentSampleMaskTestBeforeSampleCounting` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties earlyFragmentSampleMaskTestBeforeSampleCounting(int value) { earlyFragmentSampleMaskTestBeforeSampleCounting(this.segment(), 0L, value); return this; }

    /// {@return `depthStencilSwizzleOneSupport` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthStencilSwizzleOneSupport(MemorySegment segment, long index) { return (int) VH_depthStencilSwizzleOneSupport.get(segment, 0L, index); }
    /// {@return `depthStencilSwizzleOneSupport`}
    public int depthStencilSwizzleOneSupport() { return depthStencilSwizzleOneSupport(this.segment(), 0L); }
    /// Sets `depthStencilSwizzleOneSupport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthStencilSwizzleOneSupport(MemorySegment segment, long index, int value) { VH_depthStencilSwizzleOneSupport.set(segment, 0L, index, value); }
    /// Sets `depthStencilSwizzleOneSupport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties depthStencilSwizzleOneSupport(int value) { depthStencilSwizzleOneSupport(this.segment(), 0L, value); return this; }

    /// {@return `polygonModePointSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int polygonModePointSize(MemorySegment segment, long index) { return (int) VH_polygonModePointSize.get(segment, 0L, index); }
    /// {@return `polygonModePointSize`}
    public int polygonModePointSize() { return polygonModePointSize(this.segment(), 0L); }
    /// Sets `polygonModePointSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void polygonModePointSize(MemorySegment segment, long index, int value) { VH_polygonModePointSize.set(segment, 0L, index, value); }
    /// Sets `polygonModePointSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties polygonModePointSize(int value) { polygonModePointSize(this.segment(), 0L, value); return this; }

    /// {@return `nonStrictSinglePixelWideLinesUseParallelogram` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int nonStrictSinglePixelWideLinesUseParallelogram(MemorySegment segment, long index) { return (int) VH_nonStrictSinglePixelWideLinesUseParallelogram.get(segment, 0L, index); }
    /// {@return `nonStrictSinglePixelWideLinesUseParallelogram`}
    public int nonStrictSinglePixelWideLinesUseParallelogram() { return nonStrictSinglePixelWideLinesUseParallelogram(this.segment(), 0L); }
    /// Sets `nonStrictSinglePixelWideLinesUseParallelogram` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void nonStrictSinglePixelWideLinesUseParallelogram(MemorySegment segment, long index, int value) { VH_nonStrictSinglePixelWideLinesUseParallelogram.set(segment, 0L, index, value); }
    /// Sets `nonStrictSinglePixelWideLinesUseParallelogram` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties nonStrictSinglePixelWideLinesUseParallelogram(int value) { nonStrictSinglePixelWideLinesUseParallelogram(this.segment(), 0L, value); return this; }

    /// {@return `nonStrictWideLinesUseParallelogram` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int nonStrictWideLinesUseParallelogram(MemorySegment segment, long index) { return (int) VH_nonStrictWideLinesUseParallelogram.get(segment, 0L, index); }
    /// {@return `nonStrictWideLinesUseParallelogram`}
    public int nonStrictWideLinesUseParallelogram() { return nonStrictWideLinesUseParallelogram(this.segment(), 0L); }
    /// Sets `nonStrictWideLinesUseParallelogram` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void nonStrictWideLinesUseParallelogram(MemorySegment segment, long index, int value) { VH_nonStrictWideLinesUseParallelogram.set(segment, 0L, index, value); }
    /// Sets `nonStrictWideLinesUseParallelogram` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties nonStrictWideLinesUseParallelogram(int value) { nonStrictWideLinesUseParallelogram(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceMaintenance5Properties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMaintenance5Properties`
    public VkPhysicalDeviceMaintenance5Properties asSlice(long index) { return new VkPhysicalDeviceMaintenance5Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceMaintenance5Properties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMaintenance5Properties`
    public VkPhysicalDeviceMaintenance5Properties asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance5Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceMaintenance5Properties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties at(long index, Consumer<VkPhysicalDeviceMaintenance5Properties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `earlyFragmentMultisampleCoverageAfterSampleCounting` at the given index}
    /// @param index the index of the struct buffer
    public int earlyFragmentMultisampleCoverageAfterSampleCountingAt(long index) { return earlyFragmentMultisampleCoverageAfterSampleCounting(this.segment(), index); }
    /// Sets `earlyFragmentMultisampleCoverageAfterSampleCounting` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties earlyFragmentMultisampleCoverageAfterSampleCountingAt(long index, int value) { earlyFragmentMultisampleCoverageAfterSampleCounting(this.segment(), index, value); return this; }

    /// {@return `earlyFragmentSampleMaskTestBeforeSampleCounting` at the given index}
    /// @param index the index of the struct buffer
    public int earlyFragmentSampleMaskTestBeforeSampleCountingAt(long index) { return earlyFragmentSampleMaskTestBeforeSampleCounting(this.segment(), index); }
    /// Sets `earlyFragmentSampleMaskTestBeforeSampleCounting` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties earlyFragmentSampleMaskTestBeforeSampleCountingAt(long index, int value) { earlyFragmentSampleMaskTestBeforeSampleCounting(this.segment(), index, value); return this; }

    /// {@return `depthStencilSwizzleOneSupport` at the given index}
    /// @param index the index of the struct buffer
    public int depthStencilSwizzleOneSupportAt(long index) { return depthStencilSwizzleOneSupport(this.segment(), index); }
    /// Sets `depthStencilSwizzleOneSupport` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties depthStencilSwizzleOneSupportAt(long index, int value) { depthStencilSwizzleOneSupport(this.segment(), index, value); return this; }

    /// {@return `polygonModePointSize` at the given index}
    /// @param index the index of the struct buffer
    public int polygonModePointSizeAt(long index) { return polygonModePointSize(this.segment(), index); }
    /// Sets `polygonModePointSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties polygonModePointSizeAt(long index, int value) { polygonModePointSize(this.segment(), index, value); return this; }

    /// {@return `nonStrictSinglePixelWideLinesUseParallelogram` at the given index}
    /// @param index the index of the struct buffer
    public int nonStrictSinglePixelWideLinesUseParallelogramAt(long index) { return nonStrictSinglePixelWideLinesUseParallelogram(this.segment(), index); }
    /// Sets `nonStrictSinglePixelWideLinesUseParallelogram` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties nonStrictSinglePixelWideLinesUseParallelogramAt(long index, int value) { nonStrictSinglePixelWideLinesUseParallelogram(this.segment(), index, value); return this; }

    /// {@return `nonStrictWideLinesUseParallelogram` at the given index}
    /// @param index the index of the struct buffer
    public int nonStrictWideLinesUseParallelogramAt(long index) { return nonStrictWideLinesUseParallelogram(this.segment(), index); }
    /// Sets `nonStrictWideLinesUseParallelogram` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties nonStrictWideLinesUseParallelogramAt(long index, int value) { nonStrictWideLinesUseParallelogram(this.segment(), index, value); return this; }

}
