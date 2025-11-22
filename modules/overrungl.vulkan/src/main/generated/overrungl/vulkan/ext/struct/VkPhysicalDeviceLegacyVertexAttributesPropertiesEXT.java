// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 nativeUnalignedPerformance;
/// }
/// ```
public final class VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("nativeUnalignedPerformance")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_nativeUnalignedPerformance = LAYOUT.byteOffset(PathElement.groupElement("nativeUnalignedPerformance"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_nativeUnalignedPerformance = LAYOUT.select(PathElement.groupElement("nativeUnalignedPerformance"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_nativeUnalignedPerformance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nativeUnalignedPerformance"));

    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTLegacyVertexAttributes.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_PROPERTIES_EXT); }
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTLegacyVertexAttributes.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT copyFrom(VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT at(long index, Consumer<VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int nativeUnalignedPerformanceAt(long index) { return (int) VH_nativeUnalignedPerformance.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int nativeUnalignedPerformance() { return (int) VH_nativeUnalignedPerformance.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT nativeUnalignedPerformanceAt(long index, int value) { VH_nativeUnalignedPerformance.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT nativeUnalignedPerformance(int value) { VH_nativeUnalignedPerformance.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _nativeUnalignedPerformanceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_nativeUnalignedPerformance, index), LAYOUT_nativeUnalignedPerformance); }
    public MemorySegment _nativeUnalignedPerformance() { return _nativeUnalignedPerformanceAt(0L); }
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT _nativeUnalignedPerformanceAt(long index, MemorySegment src) { _nativeUnalignedPerformanceAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT _nativeUnalignedPerformance(MemorySegment src) { return _nativeUnalignedPerformanceAt(0L, src); }
}
