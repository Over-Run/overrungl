// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCopyMemoryIndirectFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCopyMemoryIndirectFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 indirectCopy;
/// }
/// ```
public final class VkPhysicalDeviceCopyMemoryIndirectFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("indirectCopy")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_indirectCopy = LAYOUT.byteOffset(PathElement.groupElement("indirectCopy"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_indirectCopy = LAYOUT.select(PathElement.groupElement("indirectCopy"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_indirectCopy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectCopy"));

    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCopyMemoryIndirect.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_NV); }
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCopyMemoryIndirect.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV copyFrom(VkPhysicalDeviceCopyMemoryIndirectFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV asSlice(long index) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV at(long index, Consumer<VkPhysicalDeviceCopyMemoryIndirectFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int indirectCopyAt(long index) { return (int) VH_indirectCopy.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int indirectCopy() { return (int) VH_indirectCopy.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV indirectCopyAt(long index, int value) { VH_indirectCopy.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV indirectCopy(int value) { VH_indirectCopy.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _indirectCopyAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indirectCopy, index), LAYOUT_indirectCopy); }
    public MemorySegment _indirectCopy() { return _indirectCopyAt(0L); }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV _indirectCopyAt(long index, MemorySegment src) { _indirectCopyAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV _indirectCopy(MemorySegment src) { return _indirectCopyAt(0L, src); }
}
