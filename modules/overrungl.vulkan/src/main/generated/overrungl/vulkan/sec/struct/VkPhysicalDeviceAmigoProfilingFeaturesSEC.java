// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.sec.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceAmigoProfilingFeaturesSEC`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceAmigoProfilingFeaturesSEC {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 amigoProfiling;
/// }
/// ```
public final class VkPhysicalDeviceAmigoProfilingFeaturesSEC extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("amigoProfiling")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_amigoProfiling = LAYOUT.byteOffset(PathElement.groupElement("amigoProfiling"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_amigoProfiling = LAYOUT.select(PathElement.groupElement("amigoProfiling"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_amigoProfiling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("amigoProfiling"));

    public VkPhysicalDeviceAmigoProfilingFeaturesSEC(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAmigoProfilingFeaturesSEC(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAmigoProfilingFeaturesSEC(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAmigoProfilingFeaturesSEC(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.sec.VKSECAmigoProfiling.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC); }
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.sec.VKSECAmigoProfiling.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC);
        return s;
    }
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC copyFrom(VkPhysicalDeviceAmigoProfilingFeaturesSEC src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC reinterpret(long count) { return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC asSlice(long index) { return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC asSlice(long index, long count) { return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC at(long index, Consumer<VkPhysicalDeviceAmigoProfilingFeaturesSEC> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int amigoProfilingAt(long index) { return (int) VH_amigoProfiling.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int amigoProfiling() { return (int) VH_amigoProfiling.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC amigoProfilingAt(long index, int value) { VH_amigoProfiling.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC amigoProfiling(int value) { VH_amigoProfiling.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _amigoProfilingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_amigoProfiling, index), LAYOUT_amigoProfiling); }
    public MemorySegment _amigoProfiling() { return _amigoProfilingAt(0L); }
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC _amigoProfilingAt(long index, MemorySegment src) { _amigoProfilingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC _amigoProfiling(MemorySegment src) { return _amigoProfilingAt(0L, src); }
}
