// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 vertexAttributeInstanceRateDivisor;
///     VkBool32 vertexAttributeInstanceRateZeroDivisor;
/// }
/// ```
public final class VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateDivisor"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateZeroDivisor")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_vertexAttributeInstanceRateDivisor = LAYOUT.byteOffset(PathElement.groupElement("vertexAttributeInstanceRateDivisor"));
    public static final long OFFSET_vertexAttributeInstanceRateZeroDivisor = LAYOUT.byteOffset(PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_vertexAttributeInstanceRateDivisor = LAYOUT.select(PathElement.groupElement("vertexAttributeInstanceRateDivisor"));
    public static final MemoryLayout LAYOUT_vertexAttributeInstanceRateZeroDivisor = LAYOUT.select(PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_vertexAttributeInstanceRateDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeInstanceRateDivisor"));
    public static final VarHandle VH_vertexAttributeInstanceRateZeroDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor"));

    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES); }
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES);
        return s;
    }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT copyFrom(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT at(long index, Consumer<VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int vertexAttributeInstanceRateDivisorAt(long index) { return (int) VH_vertexAttributeInstanceRateDivisor.get(this.segment(), 0L, index); }
    public int vertexAttributeInstanceRateZeroDivisorAt(long index) { return (int) VH_vertexAttributeInstanceRateZeroDivisor.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int vertexAttributeInstanceRateDivisor() { return (int) VH_vertexAttributeInstanceRateDivisor.get(this.segment(), 0L, 0L); }
    public int vertexAttributeInstanceRateZeroDivisor() { return (int) VH_vertexAttributeInstanceRateZeroDivisor.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT vertexAttributeInstanceRateDivisorAt(long index, int value) { VH_vertexAttributeInstanceRateDivisor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT vertexAttributeInstanceRateZeroDivisorAt(long index, int value) { VH_vertexAttributeInstanceRateZeroDivisor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT vertexAttributeInstanceRateDivisor(int value) { VH_vertexAttributeInstanceRateDivisor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT vertexAttributeInstanceRateZeroDivisor(int value) { VH_vertexAttributeInstanceRateZeroDivisor.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _vertexAttributeInstanceRateDivisorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexAttributeInstanceRateDivisor, index), LAYOUT_vertexAttributeInstanceRateDivisor); }
    public MemorySegment _vertexAttributeInstanceRateDivisor() { return _vertexAttributeInstanceRateDivisorAt(0L); }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT _vertexAttributeInstanceRateDivisorAt(long index, MemorySegment src) { _vertexAttributeInstanceRateDivisorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT _vertexAttributeInstanceRateDivisor(MemorySegment src) { return _vertexAttributeInstanceRateDivisorAt(0L, src); }
    public MemorySegment _vertexAttributeInstanceRateZeroDivisorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexAttributeInstanceRateZeroDivisor, index), LAYOUT_vertexAttributeInstanceRateZeroDivisor); }
    public MemorySegment _vertexAttributeInstanceRateZeroDivisor() { return _vertexAttributeInstanceRateZeroDivisorAt(0L); }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT _vertexAttributeInstanceRateZeroDivisorAt(long index, MemorySegment src) { _vertexAttributeInstanceRateZeroDivisorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT _vertexAttributeInstanceRateZeroDivisor(MemorySegment src) { return _vertexAttributeInstanceRateZeroDivisorAt(0L, src); }
}
