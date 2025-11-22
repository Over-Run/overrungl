// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePipelineOpacityMicromapFeaturesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePipelineOpacityMicromapFeaturesARM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 pipelineOpacityMicromap;
/// }
/// ```
public final class VkPhysicalDevicePipelineOpacityMicromapFeaturesARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineOpacityMicromap")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pipelineOpacityMicromap = LAYOUT.byteOffset(PathElement.groupElement("pipelineOpacityMicromap"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pipelineOpacityMicromap = LAYOUT.select(PathElement.groupElement("pipelineOpacityMicromap"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pipelineOpacityMicromap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineOpacityMicromap"));

    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMPipelineOpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_OPACITY_MICROMAP_FEATURES_ARM); }
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMPipelineOpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_OPACITY_MICROMAP_FEATURES_ARM);
        return s;
    }
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM copyFrom(VkPhysicalDevicePipelineOpacityMicromapFeaturesARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM reinterpret(long count) { return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM asSlice(long index) { return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM asSlice(long index, long count) { return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM at(long index, Consumer<VkPhysicalDevicePipelineOpacityMicromapFeaturesARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int pipelineOpacityMicromapAt(long index) { return (int) VH_pipelineOpacityMicromap.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int pipelineOpacityMicromap() { return (int) VH_pipelineOpacityMicromap.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM pipelineOpacityMicromapAt(long index, int value) { VH_pipelineOpacityMicromap.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM pipelineOpacityMicromap(int value) { VH_pipelineOpacityMicromap.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelineOpacityMicromapAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineOpacityMicromap, index), LAYOUT_pipelineOpacityMicromap); }
    public MemorySegment _pipelineOpacityMicromap() { return _pipelineOpacityMicromapAt(0L); }
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM _pipelineOpacityMicromapAt(long index, MemorySegment src) { _pipelineOpacityMicromapAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM _pipelineOpacityMicromap(MemorySegment src) { return _pipelineOpacityMicromapAt(0L, src); }
}
