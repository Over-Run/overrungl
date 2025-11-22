// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceInheritedViewportScissorFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceInheritedViewportScissorFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 inheritedViewportScissor2D;
/// }
/// ```
public final class VkPhysicalDeviceInheritedViewportScissorFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("inheritedViewportScissor2D")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_inheritedViewportScissor2D = LAYOUT.byteOffset(PathElement.groupElement("inheritedViewportScissor2D"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_inheritedViewportScissor2D = LAYOUT.select(PathElement.groupElement("inheritedViewportScissor2D"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_inheritedViewportScissor2D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inheritedViewportScissor2D"));

    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVInheritedViewportScissor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INHERITED_VIEWPORT_SCISSOR_FEATURES_NV); }
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVInheritedViewportScissor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INHERITED_VIEWPORT_SCISSOR_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV copyFrom(VkPhysicalDeviceInheritedViewportScissorFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV asSlice(long index) { return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV at(long index, Consumer<VkPhysicalDeviceInheritedViewportScissorFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int inheritedViewportScissor2DAt(long index) { return (int) VH_inheritedViewportScissor2D.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int inheritedViewportScissor2D() { return (int) VH_inheritedViewportScissor2D.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV inheritedViewportScissor2DAt(long index, int value) { VH_inheritedViewportScissor2D.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV inheritedViewportScissor2D(int value) { VH_inheritedViewportScissor2D.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _inheritedViewportScissor2DAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_inheritedViewportScissor2D, index), LAYOUT_inheritedViewportScissor2D); }
    public MemorySegment _inheritedViewportScissor2D() { return _inheritedViewportScissor2DAt(0L); }
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV _inheritedViewportScissor2DAt(long index, MemorySegment src) { _inheritedViewportScissor2DAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV _inheritedViewportScissor2D(MemorySegment src) { return _inheritedViewportScissor2DAt(0L, src); }
}
