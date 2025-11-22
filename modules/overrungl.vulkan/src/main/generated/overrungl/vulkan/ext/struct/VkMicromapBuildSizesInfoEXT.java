// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMicromapBuildSizesInfoEXT`.
/// ## Layout
/// ```
/// struct VkMicromapBuildSizesInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceSize micromapSize;
///     VkDeviceSize buildScratchSize;
///     VkBool32 discardable;
/// }
/// ```
public final class VkMicromapBuildSizesInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("micromapSize"),
        ValueLayout.JAVA_LONG.withName("buildScratchSize"),
        ValueLayout.JAVA_INT.withName("discardable")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_micromapSize = LAYOUT.byteOffset(PathElement.groupElement("micromapSize"));
    public static final long OFFSET_buildScratchSize = LAYOUT.byteOffset(PathElement.groupElement("buildScratchSize"));
    public static final long OFFSET_discardable = LAYOUT.byteOffset(PathElement.groupElement("discardable"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_micromapSize = LAYOUT.select(PathElement.groupElement("micromapSize"));
    public static final MemoryLayout LAYOUT_buildScratchSize = LAYOUT.select(PathElement.groupElement("buildScratchSize"));
    public static final MemoryLayout LAYOUT_discardable = LAYOUT.select(PathElement.groupElement("discardable"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_micromapSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("micromapSize"));
    public static final VarHandle VH_buildScratchSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buildScratchSize"));
    public static final VarHandle VH_discardable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("discardable"));

    public VkMicromapBuildSizesInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMicromapBuildSizesInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapBuildSizesInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkMicromapBuildSizesInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapBuildSizesInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMicromapBuildSizesInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapBuildSizesInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMicromapBuildSizesInfoEXT alloc(SegmentAllocator allocator) { return new VkMicromapBuildSizesInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkMicromapBuildSizesInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMicromapBuildSizesInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkMicromapBuildSizesInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT); }
    public static VkMicromapBuildSizesInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT);
        return s;
    }
    public VkMicromapBuildSizesInfoEXT copyFrom(VkMicromapBuildSizesInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMicromapBuildSizesInfoEXT reinterpret(long count) { return new VkMicromapBuildSizesInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMicromapBuildSizesInfoEXT asSlice(long index) { return new VkMicromapBuildSizesInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMicromapBuildSizesInfoEXT asSlice(long index, long count) { return new VkMicromapBuildSizesInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMicromapBuildSizesInfoEXT at(long index, Consumer<VkMicromapBuildSizesInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long micromapSizeAt(long index) { return (long) VH_micromapSize.get(this.segment(), 0L, index); }
    public long buildScratchSizeAt(long index) { return (long) VH_buildScratchSize.get(this.segment(), 0L, index); }
    public int discardableAt(long index) { return (int) VH_discardable.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long micromapSize() { return (long) VH_micromapSize.get(this.segment(), 0L, 0L); }
    public long buildScratchSize() { return (long) VH_buildScratchSize.get(this.segment(), 0L, 0L); }
    public int discardable() { return (int) VH_discardable.get(this.segment(), 0L, 0L); }
    public VkMicromapBuildSizesInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildSizesInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildSizesInfoEXT micromapSizeAt(long index, long value) { VH_micromapSize.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildSizesInfoEXT buildScratchSizeAt(long index, long value) { VH_buildScratchSize.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildSizesInfoEXT discardableAt(long index, int value) { VH_discardable.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildSizesInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildSizesInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildSizesInfoEXT micromapSize(long value) { VH_micromapSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildSizesInfoEXT buildScratchSize(long value) { VH_buildScratchSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildSizesInfoEXT discardable(int value) { VH_discardable.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMicromapBuildSizesInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMicromapBuildSizesInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMicromapBuildSizesInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMicromapBuildSizesInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _micromapSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_micromapSize, index), LAYOUT_micromapSize); }
    public MemorySegment _micromapSize() { return _micromapSizeAt(0L); }
    public VkMicromapBuildSizesInfoEXT _micromapSizeAt(long index, MemorySegment src) { _micromapSizeAt(index).copyFrom(src); return this; }
    public VkMicromapBuildSizesInfoEXT _micromapSize(MemorySegment src) { return _micromapSizeAt(0L, src); }
    public MemorySegment _buildScratchSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_buildScratchSize, index), LAYOUT_buildScratchSize); }
    public MemorySegment _buildScratchSize() { return _buildScratchSizeAt(0L); }
    public VkMicromapBuildSizesInfoEXT _buildScratchSizeAt(long index, MemorySegment src) { _buildScratchSizeAt(index).copyFrom(src); return this; }
    public VkMicromapBuildSizesInfoEXT _buildScratchSize(MemorySegment src) { return _buildScratchSizeAt(0L, src); }
    public MemorySegment _discardableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_discardable, index), LAYOUT_discardable); }
    public MemorySegment _discardable() { return _discardableAt(0L); }
    public VkMicromapBuildSizesInfoEXT _discardableAt(long index, MemorySegment src) { _discardableAt(index).copyFrom(src); return this; }
    public VkMicromapBuildSizesInfoEXT _discardable(MemorySegment src) { return _discardableAt(0L, src); }
}
