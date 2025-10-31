// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkShaderStatisticsInfoAMD`.
/// ## Layout
/// ```
/// struct VkShaderStatisticsInfoAMD {
///     ((uint32_t) VkFlags) VkShaderStageFlags shaderStageMask;
///     (struct VkShaderResourceUsageAMD) VkShaderResourceUsageAMD resourceUsage;
///     uint32_t numPhysicalVgprs;
///     uint32_t numPhysicalSgprs;
///     uint32_t numAvailableVgprs;
///     uint32_t numAvailableSgprs;
///     uint32_t computeWorkGroupSize[3];
/// };
/// ```
public final class VkShaderStatisticsInfoAMD extends GroupType {
    /// The struct layout of `VkShaderStatisticsInfoAMD`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("shaderStageMask"),
        overrungl.vulkan.amd.struct.VkShaderResourceUsageAMD.LAYOUT.withName("resourceUsage"),
        ValueLayout.JAVA_INT.withName("numPhysicalVgprs"),
        ValueLayout.JAVA_INT.withName("numPhysicalSgprs"),
        ValueLayout.JAVA_INT.withName("numAvailableVgprs"),
        ValueLayout.JAVA_INT.withName("numAvailableSgprs"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("computeWorkGroupSize")
    );
    /// The byte offset of `shaderStageMask`.
    public static final long OFFSET_shaderStageMask = LAYOUT.byteOffset(PathElement.groupElement("shaderStageMask"));
    /// The memory layout of `shaderStageMask`.
    public static final MemoryLayout LAYOUT_shaderStageMask = LAYOUT.select(PathElement.groupElement("shaderStageMask"));
    /// The [VarHandle] of `shaderStageMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStageMask"));
    /// The byte offset of `resourceUsage`.
    public static final long OFFSET_resourceUsage = LAYOUT.byteOffset(PathElement.groupElement("resourceUsage"));
    /// The memory layout of `resourceUsage`.
    public static final MemoryLayout LAYOUT_resourceUsage = LAYOUT.select(PathElement.groupElement("resourceUsage"));
    /// The byte offset of `numPhysicalVgprs`.
    public static final long OFFSET_numPhysicalVgprs = LAYOUT.byteOffset(PathElement.groupElement("numPhysicalVgprs"));
    /// The memory layout of `numPhysicalVgprs`.
    public static final MemoryLayout LAYOUT_numPhysicalVgprs = LAYOUT.select(PathElement.groupElement("numPhysicalVgprs"));
    /// The [VarHandle] of `numPhysicalVgprs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_numPhysicalVgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numPhysicalVgprs"));
    /// The byte offset of `numPhysicalSgprs`.
    public static final long OFFSET_numPhysicalSgprs = LAYOUT.byteOffset(PathElement.groupElement("numPhysicalSgprs"));
    /// The memory layout of `numPhysicalSgprs`.
    public static final MemoryLayout LAYOUT_numPhysicalSgprs = LAYOUT.select(PathElement.groupElement("numPhysicalSgprs"));
    /// The [VarHandle] of `numPhysicalSgprs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_numPhysicalSgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numPhysicalSgprs"));
    /// The byte offset of `numAvailableVgprs`.
    public static final long OFFSET_numAvailableVgprs = LAYOUT.byteOffset(PathElement.groupElement("numAvailableVgprs"));
    /// The memory layout of `numAvailableVgprs`.
    public static final MemoryLayout LAYOUT_numAvailableVgprs = LAYOUT.select(PathElement.groupElement("numAvailableVgprs"));
    /// The [VarHandle] of `numAvailableVgprs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_numAvailableVgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numAvailableVgprs"));
    /// The byte offset of `numAvailableSgprs`.
    public static final long OFFSET_numAvailableSgprs = LAYOUT.byteOffset(PathElement.groupElement("numAvailableSgprs"));
    /// The memory layout of `numAvailableSgprs`.
    public static final MemoryLayout LAYOUT_numAvailableSgprs = LAYOUT.select(PathElement.groupElement("numAvailableSgprs"));
    /// The [VarHandle] of `numAvailableSgprs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_numAvailableSgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numAvailableSgprs"));
    /// The byte offset of `computeWorkGroupSize`.
    public static final long OFFSET_computeWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("computeWorkGroupSize"));
    /// The memory layout of `computeWorkGroupSize`.
    public static final MemoryLayout LAYOUT_computeWorkGroupSize = LAYOUT.select(PathElement.groupElement("computeWorkGroupSize"));
    /// The [VarHandle] of `computeWorkGroupSize` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_computeWorkGroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeWorkGroupSize"), PathElement.sequenceElement());

    /// Creates `VkShaderStatisticsInfoAMD` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkShaderStatisticsInfoAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkShaderStatisticsInfoAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderStatisticsInfoAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderStatisticsInfoAMD(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkShaderStatisticsInfoAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderStatisticsInfoAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderStatisticsInfoAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkShaderStatisticsInfoAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderStatisticsInfoAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderStatisticsInfoAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkShaderStatisticsInfoAMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShaderStatisticsInfoAMD`
    public static VkShaderStatisticsInfoAMD alloc(SegmentAllocator allocator) { return new VkShaderStatisticsInfoAMD(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkShaderStatisticsInfoAMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkShaderStatisticsInfoAMD`
    public static VkShaderStatisticsInfoAMD alloc(SegmentAllocator allocator, long count) { return new VkShaderStatisticsInfoAMD(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkShaderStatisticsInfoAMD copyFrom(VkShaderStatisticsInfoAMD src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkShaderStatisticsInfoAMD reinterpret(long count) { return new VkShaderStatisticsInfoAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `shaderStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStageMask(MemorySegment segment, long index) { return (int) VH_shaderStageMask.get(segment, 0L, index); }
    /// {@return `shaderStageMask`}
    public int shaderStageMask() { return shaderStageMask(this.segment(), 0L); }
    /// Sets `shaderStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStageMask(MemorySegment segment, long index, int value) { VH_shaderStageMask.set(segment, 0L, index, value); }
    /// Sets `shaderStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD shaderStageMask(int value) { shaderStageMask(this.segment(), 0L, value); return this; }

    /// {@return `resourceUsage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment resourceUsage(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_resourceUsage, index), LAYOUT_resourceUsage); }
    /// {@return `resourceUsage`}
    public MemorySegment resourceUsage() { return resourceUsage(this.segment(), 0L); }
    /// Sets `resourceUsage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void resourceUsage(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_resourceUsage, index), LAYOUT_resourceUsage.byteSize()); }
    /// Sets `resourceUsage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD resourceUsage(MemorySegment value) { resourceUsage(this.segment(), 0L, value); return this; }
    /// Accepts `resourceUsage` with the given function.
    /// @param func the function
    /// @return `this`
    public VkShaderStatisticsInfoAMD resourceUsage(Consumer<overrungl.vulkan.amd.struct.VkShaderResourceUsageAMD> func) { func.accept(overrungl.vulkan.amd.struct.VkShaderResourceUsageAMD.of(resourceUsage())); return this; }

    /// {@return `numPhysicalVgprs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int numPhysicalVgprs(MemorySegment segment, long index) { return (int) VH_numPhysicalVgprs.get(segment, 0L, index); }
    /// {@return `numPhysicalVgprs`}
    public int numPhysicalVgprs() { return numPhysicalVgprs(this.segment(), 0L); }
    /// Sets `numPhysicalVgprs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void numPhysicalVgprs(MemorySegment segment, long index, int value) { VH_numPhysicalVgprs.set(segment, 0L, index, value); }
    /// Sets `numPhysicalVgprs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD numPhysicalVgprs(int value) { numPhysicalVgprs(this.segment(), 0L, value); return this; }

    /// {@return `numPhysicalSgprs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int numPhysicalSgprs(MemorySegment segment, long index) { return (int) VH_numPhysicalSgprs.get(segment, 0L, index); }
    /// {@return `numPhysicalSgprs`}
    public int numPhysicalSgprs() { return numPhysicalSgprs(this.segment(), 0L); }
    /// Sets `numPhysicalSgprs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void numPhysicalSgprs(MemorySegment segment, long index, int value) { VH_numPhysicalSgprs.set(segment, 0L, index, value); }
    /// Sets `numPhysicalSgprs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD numPhysicalSgprs(int value) { numPhysicalSgprs(this.segment(), 0L, value); return this; }

    /// {@return `numAvailableVgprs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int numAvailableVgprs(MemorySegment segment, long index) { return (int) VH_numAvailableVgprs.get(segment, 0L, index); }
    /// {@return `numAvailableVgprs`}
    public int numAvailableVgprs() { return numAvailableVgprs(this.segment(), 0L); }
    /// Sets `numAvailableVgprs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void numAvailableVgprs(MemorySegment segment, long index, int value) { VH_numAvailableVgprs.set(segment, 0L, index, value); }
    /// Sets `numAvailableVgprs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD numAvailableVgprs(int value) { numAvailableVgprs(this.segment(), 0L, value); return this; }

    /// {@return `numAvailableSgprs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int numAvailableSgprs(MemorySegment segment, long index) { return (int) VH_numAvailableSgprs.get(segment, 0L, index); }
    /// {@return `numAvailableSgprs`}
    public int numAvailableSgprs() { return numAvailableSgprs(this.segment(), 0L); }
    /// Sets `numAvailableSgprs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void numAvailableSgprs(MemorySegment segment, long index, int value) { VH_numAvailableSgprs.set(segment, 0L, index, value); }
    /// Sets `numAvailableSgprs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD numAvailableSgprs(int value) { numAvailableSgprs(this.segment(), 0L, value); return this; }

    /// {@return `computeWorkGroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment computeWorkGroupSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_computeWorkGroupSize, index), LAYOUT_computeWorkGroupSize); }
    /// {@return `computeWorkGroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int computeWorkGroupSize(MemorySegment segment, long index, long index0) { return (int) VH_computeWorkGroupSize.get(segment, 0L, index, index0); }
    /// {@return `computeWorkGroupSize`}
    public MemorySegment computeWorkGroupSize() { return computeWorkGroupSize(this.segment(), 0L); }
    /// {@return `computeWorkGroupSize`}
    /// @param index0 the Index 0 of the array
    public int computeWorkGroupSize(long index0) { return computeWorkGroupSize(this.segment(), 0L, index0); }
    /// Sets `computeWorkGroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void computeWorkGroupSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_computeWorkGroupSize, index), LAYOUT_computeWorkGroupSize.byteSize()); }
    /// Sets `computeWorkGroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void computeWorkGroupSize(MemorySegment segment, long index, long index0, int value) { VH_computeWorkGroupSize.set(segment, 0L, index, index0, value); }
    /// Sets `computeWorkGroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD computeWorkGroupSize(MemorySegment value) { computeWorkGroupSize(this.segment(), 0L, value); return this; }
    /// Sets `computeWorkGroupSize` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD computeWorkGroupSize(long index0, int value) { computeWorkGroupSize(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `VkShaderStatisticsInfoAMD`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkShaderStatisticsInfoAMD`
    public VkShaderStatisticsInfoAMD asSlice(long index) { return new VkShaderStatisticsInfoAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkShaderStatisticsInfoAMD`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkShaderStatisticsInfoAMD`
    public VkShaderStatisticsInfoAMD asSlice(long index, long count) { return new VkShaderStatisticsInfoAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkShaderStatisticsInfoAMD` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkShaderStatisticsInfoAMD at(long index, Consumer<VkShaderStatisticsInfoAMD> func) { func.accept(asSlice(index)); return this; }

    /// {@return `shaderStageMask` at the given index}
    /// @param index the index of the struct buffer
    public int shaderStageMaskAt(long index) { return shaderStageMask(this.segment(), index); }
    /// Sets `shaderStageMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD shaderStageMaskAt(long index, int value) { shaderStageMask(this.segment(), index, value); return this; }

    /// {@return `resourceUsage` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment resourceUsageAt(long index) { return resourceUsage(this.segment(), index); }
    /// Sets `resourceUsage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD resourceUsageAt(long index, MemorySegment value) { resourceUsage(this.segment(), index, value); return this; }
    /// Accepts `resourceUsage` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkShaderStatisticsInfoAMD resourceUsageAt(long index, Consumer<overrungl.vulkan.amd.struct.VkShaderResourceUsageAMD> func) { func.accept(overrungl.vulkan.amd.struct.VkShaderResourceUsageAMD.of(resourceUsageAt(index))); return this; }

    /// {@return `numPhysicalVgprs` at the given index}
    /// @param index the index of the struct buffer
    public int numPhysicalVgprsAt(long index) { return numPhysicalVgprs(this.segment(), index); }
    /// Sets `numPhysicalVgprs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD numPhysicalVgprsAt(long index, int value) { numPhysicalVgprs(this.segment(), index, value); return this; }

    /// {@return `numPhysicalSgprs` at the given index}
    /// @param index the index of the struct buffer
    public int numPhysicalSgprsAt(long index) { return numPhysicalSgprs(this.segment(), index); }
    /// Sets `numPhysicalSgprs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD numPhysicalSgprsAt(long index, int value) { numPhysicalSgprs(this.segment(), index, value); return this; }

    /// {@return `numAvailableVgprs` at the given index}
    /// @param index the index of the struct buffer
    public int numAvailableVgprsAt(long index) { return numAvailableVgprs(this.segment(), index); }
    /// Sets `numAvailableVgprs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD numAvailableVgprsAt(long index, int value) { numAvailableVgprs(this.segment(), index, value); return this; }

    /// {@return `numAvailableSgprs` at the given index}
    /// @param index the index of the struct buffer
    public int numAvailableSgprsAt(long index) { return numAvailableSgprs(this.segment(), index); }
    /// Sets `numAvailableSgprs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD numAvailableSgprsAt(long index, int value) { numAvailableSgprs(this.segment(), index, value); return this; }

    /// {@return `computeWorkGroupSize` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment computeWorkGroupSizeAt(long index) { return computeWorkGroupSize(this.segment(), index); }
    /// {@return `computeWorkGroupSize` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public int computeWorkGroupSizeAt(long index, long index0) { return computeWorkGroupSize(this.segment(), index, index0); }
    /// Sets `computeWorkGroupSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD computeWorkGroupSizeAt(long index, MemorySegment value) { computeWorkGroupSize(this.segment(), index, value); return this; }
    /// Sets `computeWorkGroupSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD computeWorkGroupSizeAt(long index, long index0, int value) { computeWorkGroupSize(this.segment(), index, index0, value); return this; }

}
