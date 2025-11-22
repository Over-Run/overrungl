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
///     VkShaderStageFlags shaderStageMask;
///     VkShaderResourceUsageAMD resourceUsage;
///     uint32_t numPhysicalVgprs;
///     uint32_t numPhysicalSgprs;
///     uint32_t numAvailableVgprs;
///     uint32_t numAvailableSgprs;
///     uint32_t computeWorkGroupSize[3];
/// }
/// ```
public final class VkShaderStatisticsInfoAMD extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("shaderStageMask"),
        overrungl.vulkan.amd.struct.VkShaderResourceUsageAMD.LAYOUT.withName("resourceUsage"),
        ValueLayout.JAVA_INT.withName("numPhysicalVgprs"),
        ValueLayout.JAVA_INT.withName("numPhysicalSgprs"),
        ValueLayout.JAVA_INT.withName("numAvailableVgprs"),
        ValueLayout.JAVA_INT.withName("numAvailableSgprs"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("computeWorkGroupSize")
    );
    public static final long OFFSET_shaderStageMask = LAYOUT.byteOffset(PathElement.groupElement("shaderStageMask"));
    public static final long OFFSET_resourceUsage = LAYOUT.byteOffset(PathElement.groupElement("resourceUsage"));
    public static final long OFFSET_numPhysicalVgprs = LAYOUT.byteOffset(PathElement.groupElement("numPhysicalVgprs"));
    public static final long OFFSET_numPhysicalSgprs = LAYOUT.byteOffset(PathElement.groupElement("numPhysicalSgprs"));
    public static final long OFFSET_numAvailableVgprs = LAYOUT.byteOffset(PathElement.groupElement("numAvailableVgprs"));
    public static final long OFFSET_numAvailableSgprs = LAYOUT.byteOffset(PathElement.groupElement("numAvailableSgprs"));
    public static final long OFFSET_computeWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("computeWorkGroupSize"));
    public static final MemoryLayout LAYOUT_shaderStageMask = LAYOUT.select(PathElement.groupElement("shaderStageMask"));
    public static final MemoryLayout LAYOUT_resourceUsage = LAYOUT.select(PathElement.groupElement("resourceUsage"));
    public static final MemoryLayout LAYOUT_numPhysicalVgprs = LAYOUT.select(PathElement.groupElement("numPhysicalVgprs"));
    public static final MemoryLayout LAYOUT_numPhysicalSgprs = LAYOUT.select(PathElement.groupElement("numPhysicalSgprs"));
    public static final MemoryLayout LAYOUT_numAvailableVgprs = LAYOUT.select(PathElement.groupElement("numAvailableVgprs"));
    public static final MemoryLayout LAYOUT_numAvailableSgprs = LAYOUT.select(PathElement.groupElement("numAvailableSgprs"));
    public static final MemoryLayout LAYOUT_computeWorkGroupSize = LAYOUT.select(PathElement.groupElement("computeWorkGroupSize"));
    public static final VarHandle VH_shaderStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStageMask"));
    public static final VarHandle VH_resourceUsage$numUsedVgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resourceUsage"), PathElement.groupElement("numUsedVgprs"));
    public static final VarHandle VH_resourceUsage$numUsedSgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resourceUsage"), PathElement.groupElement("numUsedSgprs"));
    public static final VarHandle VH_resourceUsage$ldsSizePerLocalWorkGroup = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resourceUsage"), PathElement.groupElement("ldsSizePerLocalWorkGroup"));
    public static final VarHandle VH_resourceUsage$ldsUsageSizeInBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resourceUsage"), PathElement.groupElement("ldsUsageSizeInBytes"));
    public static final VarHandle VH_resourceUsage$scratchMemUsageInBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resourceUsage"), PathElement.groupElement("scratchMemUsageInBytes"));
    public static final VarHandle VH_numPhysicalVgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numPhysicalVgprs"));
    public static final VarHandle VH_numPhysicalSgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numPhysicalSgprs"));
    public static final VarHandle VH_numAvailableVgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numAvailableVgprs"));
    public static final VarHandle VH_numAvailableSgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numAvailableSgprs"));
    public static final VarHandle VH_computeWorkGroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeWorkGroupSize"), PathElement.sequenceElement());

    public VkShaderStatisticsInfoAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkShaderStatisticsInfoAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderStatisticsInfoAMD(segment, estimateCount(segment, LAYOUT)); }
    public static VkShaderStatisticsInfoAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderStatisticsInfoAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkShaderStatisticsInfoAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderStatisticsInfoAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkShaderStatisticsInfoAMD alloc(SegmentAllocator allocator) { return new VkShaderStatisticsInfoAMD(allocator.allocate(LAYOUT), 1); }
    public static VkShaderStatisticsInfoAMD alloc(SegmentAllocator allocator, long count) { return new VkShaderStatisticsInfoAMD(allocator.allocate(LAYOUT, count), count); }
    public VkShaderStatisticsInfoAMD copyFrom(VkShaderStatisticsInfoAMD src) { this.segment().copyFrom(src.segment()); return this; }
    public VkShaderStatisticsInfoAMD reinterpret(long count) { return new VkShaderStatisticsInfoAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkShaderStatisticsInfoAMD asSlice(long index) { return new VkShaderStatisticsInfoAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkShaderStatisticsInfoAMD asSlice(long index, long count) { return new VkShaderStatisticsInfoAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkShaderStatisticsInfoAMD at(long index, Consumer<VkShaderStatisticsInfoAMD> func) { func.accept(asSlice(index)); return this; }
    public int shaderStageMaskAt(long index) { return (int) VH_shaderStageMask.get(this.segment(), 0L, index); }
    public int resourceUsage$numUsedVgprsAt(long index) { return (int) VH_resourceUsage$numUsedVgprs.get(this.segment(), 0L, index); }
    public int resourceUsage$numUsedSgprsAt(long index) { return (int) VH_resourceUsage$numUsedSgprs.get(this.segment(), 0L, index); }
    public int resourceUsage$ldsSizePerLocalWorkGroupAt(long index) { return (int) VH_resourceUsage$ldsSizePerLocalWorkGroup.get(this.segment(), 0L, index); }
    public long resourceUsage$ldsUsageSizeInBytesAt(long index) { return (long) VH_resourceUsage$ldsUsageSizeInBytes.get(this.segment(), 0L, index); }
    public long resourceUsage$scratchMemUsageInBytesAt(long index) { return (long) VH_resourceUsage$scratchMemUsageInBytes.get(this.segment(), 0L, index); }
    public int numPhysicalVgprsAt(long index) { return (int) VH_numPhysicalVgprs.get(this.segment(), 0L, index); }
    public int numPhysicalSgprsAt(long index) { return (int) VH_numPhysicalSgprs.get(this.segment(), 0L, index); }
    public int numAvailableVgprsAt(long index) { return (int) VH_numAvailableVgprs.get(this.segment(), 0L, index); }
    public int numAvailableSgprsAt(long index) { return (int) VH_numAvailableSgprs.get(this.segment(), 0L, index); }
    public int computeWorkGroupSizeAt(long index, long index0) { return (int) VH_computeWorkGroupSize.get(this.segment(), 0L, index, index0); }
    public int shaderStageMask() { return (int) VH_shaderStageMask.get(this.segment(), 0L, 0L); }
    public int resourceUsage$numUsedVgprs() { return (int) VH_resourceUsage$numUsedVgprs.get(this.segment(), 0L, 0L); }
    public int resourceUsage$numUsedSgprs() { return (int) VH_resourceUsage$numUsedSgprs.get(this.segment(), 0L, 0L); }
    public int resourceUsage$ldsSizePerLocalWorkGroup() { return (int) VH_resourceUsage$ldsSizePerLocalWorkGroup.get(this.segment(), 0L, 0L); }
    public long resourceUsage$ldsUsageSizeInBytes() { return (long) VH_resourceUsage$ldsUsageSizeInBytes.get(this.segment(), 0L, 0L); }
    public long resourceUsage$scratchMemUsageInBytes() { return (long) VH_resourceUsage$scratchMemUsageInBytes.get(this.segment(), 0L, 0L); }
    public int numPhysicalVgprs() { return (int) VH_numPhysicalVgprs.get(this.segment(), 0L, 0L); }
    public int numPhysicalSgprs() { return (int) VH_numPhysicalSgprs.get(this.segment(), 0L, 0L); }
    public int numAvailableVgprs() { return (int) VH_numAvailableVgprs.get(this.segment(), 0L, 0L); }
    public int numAvailableSgprs() { return (int) VH_numAvailableSgprs.get(this.segment(), 0L, 0L); }
    public int computeWorkGroupSize(long index0) { return (int) VH_computeWorkGroupSize.get(this.segment(), 0L, 0L, index0); }
    public VkShaderStatisticsInfoAMD shaderStageMaskAt(long index, int value) { VH_shaderStageMask.set(this.segment(), 0L, index, value); return this; }
    public VkShaderStatisticsInfoAMD resourceUsage$numUsedVgprsAt(long index, int value) { VH_resourceUsage$numUsedVgprs.set(this.segment(), 0L, index, value); return this; }
    public VkShaderStatisticsInfoAMD resourceUsage$numUsedSgprsAt(long index, int value) { VH_resourceUsage$numUsedSgprs.set(this.segment(), 0L, index, value); return this; }
    public VkShaderStatisticsInfoAMD resourceUsage$ldsSizePerLocalWorkGroupAt(long index, int value) { VH_resourceUsage$ldsSizePerLocalWorkGroup.set(this.segment(), 0L, index, value); return this; }
    public VkShaderStatisticsInfoAMD resourceUsage$ldsUsageSizeInBytesAt(long index, long value) { VH_resourceUsage$ldsUsageSizeInBytes.set(this.segment(), 0L, index, value); return this; }
    public VkShaderStatisticsInfoAMD resourceUsage$scratchMemUsageInBytesAt(long index, long value) { VH_resourceUsage$scratchMemUsageInBytes.set(this.segment(), 0L, index, value); return this; }
    public VkShaderStatisticsInfoAMD numPhysicalVgprsAt(long index, int value) { VH_numPhysicalVgprs.set(this.segment(), 0L, index, value); return this; }
    public VkShaderStatisticsInfoAMD numPhysicalSgprsAt(long index, int value) { VH_numPhysicalSgprs.set(this.segment(), 0L, index, value); return this; }
    public VkShaderStatisticsInfoAMD numAvailableVgprsAt(long index, int value) { VH_numAvailableVgprs.set(this.segment(), 0L, index, value); return this; }
    public VkShaderStatisticsInfoAMD numAvailableSgprsAt(long index, int value) { VH_numAvailableSgprs.set(this.segment(), 0L, index, value); return this; }
    public VkShaderStatisticsInfoAMD computeWorkGroupSizeAt(long index, long index0, int value) { VH_computeWorkGroupSize.set(this.segment(), 0L, index, index0, value); return this; }
    public VkShaderStatisticsInfoAMD shaderStageMask(int value) { VH_shaderStageMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderStatisticsInfoAMD resourceUsage$numUsedVgprs(int value) { VH_resourceUsage$numUsedVgprs.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderStatisticsInfoAMD resourceUsage$numUsedSgprs(int value) { VH_resourceUsage$numUsedSgprs.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderStatisticsInfoAMD resourceUsage$ldsSizePerLocalWorkGroup(int value) { VH_resourceUsage$ldsSizePerLocalWorkGroup.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderStatisticsInfoAMD resourceUsage$ldsUsageSizeInBytes(long value) { VH_resourceUsage$ldsUsageSizeInBytes.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderStatisticsInfoAMD resourceUsage$scratchMemUsageInBytes(long value) { VH_resourceUsage$scratchMemUsageInBytes.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderStatisticsInfoAMD numPhysicalVgprs(int value) { VH_numPhysicalVgprs.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderStatisticsInfoAMD numPhysicalSgprs(int value) { VH_numPhysicalSgprs.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderStatisticsInfoAMD numAvailableVgprs(int value) { VH_numAvailableVgprs.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderStatisticsInfoAMD numAvailableSgprs(int value) { VH_numAvailableSgprs.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderStatisticsInfoAMD computeWorkGroupSize(long index0, int value) { VH_computeWorkGroupSize.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _shaderStageMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStageMask, index), LAYOUT_shaderStageMask); }
    public MemorySegment _shaderStageMask() { return _shaderStageMaskAt(0L); }
    public VkShaderStatisticsInfoAMD _shaderStageMaskAt(long index, MemorySegment src) { _shaderStageMaskAt(index).copyFrom(src); return this; }
    public VkShaderStatisticsInfoAMD _shaderStageMask(MemorySegment src) { return _shaderStageMaskAt(0L, src); }
    public MemorySegment _resourceUsageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_resourceUsage, index), LAYOUT_resourceUsage); }
    public MemorySegment _resourceUsage() { return _resourceUsageAt(0L); }
    public VkShaderStatisticsInfoAMD _resourceUsageAt(long index, MemorySegment src) { _resourceUsageAt(index).copyFrom(src); return this; }
    public VkShaderStatisticsInfoAMD _resourceUsage(MemorySegment src) { return _resourceUsageAt(0L, src); }
    public MemorySegment _numPhysicalVgprsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_numPhysicalVgprs, index), LAYOUT_numPhysicalVgprs); }
    public MemorySegment _numPhysicalVgprs() { return _numPhysicalVgprsAt(0L); }
    public VkShaderStatisticsInfoAMD _numPhysicalVgprsAt(long index, MemorySegment src) { _numPhysicalVgprsAt(index).copyFrom(src); return this; }
    public VkShaderStatisticsInfoAMD _numPhysicalVgprs(MemorySegment src) { return _numPhysicalVgprsAt(0L, src); }
    public MemorySegment _numPhysicalSgprsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_numPhysicalSgprs, index), LAYOUT_numPhysicalSgprs); }
    public MemorySegment _numPhysicalSgprs() { return _numPhysicalSgprsAt(0L); }
    public VkShaderStatisticsInfoAMD _numPhysicalSgprsAt(long index, MemorySegment src) { _numPhysicalSgprsAt(index).copyFrom(src); return this; }
    public VkShaderStatisticsInfoAMD _numPhysicalSgprs(MemorySegment src) { return _numPhysicalSgprsAt(0L, src); }
    public MemorySegment _numAvailableVgprsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_numAvailableVgprs, index), LAYOUT_numAvailableVgprs); }
    public MemorySegment _numAvailableVgprs() { return _numAvailableVgprsAt(0L); }
    public VkShaderStatisticsInfoAMD _numAvailableVgprsAt(long index, MemorySegment src) { _numAvailableVgprsAt(index).copyFrom(src); return this; }
    public VkShaderStatisticsInfoAMD _numAvailableVgprs(MemorySegment src) { return _numAvailableVgprsAt(0L, src); }
    public MemorySegment _numAvailableSgprsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_numAvailableSgprs, index), LAYOUT_numAvailableSgprs); }
    public MemorySegment _numAvailableSgprs() { return _numAvailableSgprsAt(0L); }
    public VkShaderStatisticsInfoAMD _numAvailableSgprsAt(long index, MemorySegment src) { _numAvailableSgprsAt(index).copyFrom(src); return this; }
    public VkShaderStatisticsInfoAMD _numAvailableSgprs(MemorySegment src) { return _numAvailableSgprsAt(0L, src); }
    public MemorySegment _computeWorkGroupSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_computeWorkGroupSize, index), LAYOUT_computeWorkGroupSize); }
    public MemorySegment _computeWorkGroupSize() { return _computeWorkGroupSizeAt(0L); }
    public VkShaderStatisticsInfoAMD _computeWorkGroupSizeAt(long index, MemorySegment src) { _computeWorkGroupSizeAt(index).copyFrom(src); return this; }
    public VkShaderStatisticsInfoAMD _computeWorkGroupSize(MemorySegment src) { return _computeWorkGroupSizeAt(0L, src); }
}
