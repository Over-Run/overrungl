// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceHostQueryResetFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceHostQueryResetFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 hostQueryReset;
/// }
/// ```
public final class VkPhysicalDeviceHostQueryResetFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hostQueryReset")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_hostQueryReset = LAYOUT.byteOffset(PathElement.groupElement("hostQueryReset"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_hostQueryReset = LAYOUT.select(PathElement.groupElement("hostQueryReset"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_hostQueryReset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hostQueryReset"));

    public VkPhysicalDeviceHostQueryResetFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceHostQueryResetFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceHostQueryResetFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceHostQueryResetFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceHostQueryResetFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceHostQueryResetFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceHostQueryResetFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceHostQueryResetFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceHostQueryResetFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceHostQueryResetFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceHostQueryResetFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceHostQueryResetFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES); }
    public static VkPhysicalDeviceHostQueryResetFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES);
        return s;
    }
    public VkPhysicalDeviceHostQueryResetFeaturesEXT copyFrom(VkPhysicalDeviceHostQueryResetFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceHostQueryResetFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceHostQueryResetFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceHostQueryResetFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceHostQueryResetFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceHostQueryResetFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceHostQueryResetFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceHostQueryResetFeaturesEXT at(long index, Consumer<VkPhysicalDeviceHostQueryResetFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int hostQueryResetAt(long index) { return (int) VH_hostQueryReset.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int hostQueryReset() { return (int) VH_hostQueryReset.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceHostQueryResetFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceHostQueryResetFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceHostQueryResetFeaturesEXT hostQueryResetAt(long index, int value) { VH_hostQueryReset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceHostQueryResetFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceHostQueryResetFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceHostQueryResetFeaturesEXT hostQueryReset(int value) { VH_hostQueryReset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceHostQueryResetFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceHostQueryResetFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceHostQueryResetFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceHostQueryResetFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _hostQueryResetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hostQueryReset, index), LAYOUT_hostQueryReset); }
    public MemorySegment _hostQueryReset() { return _hostQueryResetAt(0L); }
    public VkPhysicalDeviceHostQueryResetFeaturesEXT _hostQueryResetAt(long index, MemorySegment src) { _hostQueryResetAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceHostQueryResetFeaturesEXT _hostQueryReset(MemorySegment src) { return _hostQueryResetAt(0L, src); }
}
