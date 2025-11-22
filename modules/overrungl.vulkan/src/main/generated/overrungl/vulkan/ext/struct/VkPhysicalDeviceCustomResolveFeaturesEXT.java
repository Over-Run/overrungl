// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCustomResolveFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCustomResolveFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 customResolve;
/// }
/// ```
public final class VkPhysicalDeviceCustomResolveFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("customResolve")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_customResolve = LAYOUT.byteOffset(PathElement.groupElement("customResolve"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_customResolve = LAYOUT.select(PathElement.groupElement("customResolve"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_customResolve = LAYOUT.arrayElementVarHandle(PathElement.groupElement("customResolve"));

    public VkPhysicalDeviceCustomResolveFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCustomResolveFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCustomResolveFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCustomResolveFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCustomResolveFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCustomResolveFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCustomResolveFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCustomResolveFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCustomResolveFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCustomResolveFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCustomResolveFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCustomResolveFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTCustomResolve.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_RESOLVE_FEATURES_EXT); }
    public static VkPhysicalDeviceCustomResolveFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTCustomResolve.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_RESOLVE_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceCustomResolveFeaturesEXT copyFrom(VkPhysicalDeviceCustomResolveFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCustomResolveFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceCustomResolveFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCustomResolveFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceCustomResolveFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCustomResolveFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceCustomResolveFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCustomResolveFeaturesEXT at(long index, Consumer<VkPhysicalDeviceCustomResolveFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int customResolveAt(long index) { return (int) VH_customResolve.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int customResolve() { return (int) VH_customResolve.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCustomResolveFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCustomResolveFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCustomResolveFeaturesEXT customResolveAt(long index, int value) { VH_customResolve.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCustomResolveFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCustomResolveFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCustomResolveFeaturesEXT customResolve(int value) { VH_customResolve.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCustomResolveFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCustomResolveFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCustomResolveFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCustomResolveFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _customResolveAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_customResolve, index), LAYOUT_customResolve); }
    public MemorySegment _customResolve() { return _customResolveAt(0L); }
    public VkPhysicalDeviceCustomResolveFeaturesEXT _customResolveAt(long index, MemorySegment src) { _customResolveAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCustomResolveFeaturesEXT _customResolve(MemorySegment src) { return _customResolveAt(0L, src); }
}
