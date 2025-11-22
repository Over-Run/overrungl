// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceExclusiveScissorFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExclusiveScissorFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 exclusiveScissor;
/// }
/// ```
public final class VkPhysicalDeviceExclusiveScissorFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("exclusiveScissor")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_exclusiveScissor = LAYOUT.byteOffset(PathElement.groupElement("exclusiveScissor"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_exclusiveScissor = LAYOUT.select(PathElement.groupElement("exclusiveScissor"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_exclusiveScissor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("exclusiveScissor"));

    public VkPhysicalDeviceExclusiveScissorFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExclusiveScissorFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExclusiveScissorFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExclusiveScissorFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExclusiveScissorFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExclusiveScissorFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVScissorExclusive.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV); }
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVScissorExclusive.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceExclusiveScissorFeaturesNV copyFrom(VkPhysicalDeviceExclusiveScissorFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceExclusiveScissorFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceExclusiveScissorFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceExclusiveScissorFeaturesNV asSlice(long index) { return new VkPhysicalDeviceExclusiveScissorFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceExclusiveScissorFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceExclusiveScissorFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceExclusiveScissorFeaturesNV at(long index, Consumer<VkPhysicalDeviceExclusiveScissorFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int exclusiveScissorAt(long index) { return (int) VH_exclusiveScissor.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int exclusiveScissor() { return (int) VH_exclusiveScissor.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceExclusiveScissorFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExclusiveScissorFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExclusiveScissorFeaturesNV exclusiveScissorAt(long index, int value) { VH_exclusiveScissor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExclusiveScissorFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExclusiveScissorFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExclusiveScissorFeaturesNV exclusiveScissor(int value) { VH_exclusiveScissor.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceExclusiveScissorFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExclusiveScissorFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceExclusiveScissorFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExclusiveScissorFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _exclusiveScissorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_exclusiveScissor, index), LAYOUT_exclusiveScissor); }
    public MemorySegment _exclusiveScissor() { return _exclusiveScissorAt(0L); }
    public VkPhysicalDeviceExclusiveScissorFeaturesNV _exclusiveScissorAt(long index, MemorySegment src) { _exclusiveScissorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExclusiveScissorFeaturesNV _exclusiveScissor(MemorySegment src) { return _exclusiveScissorAt(0L, src); }
}
