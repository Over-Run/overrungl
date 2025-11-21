// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxVertexAttribDivisor;
///     VkBool32 supportsNonZeroFirstInstance;
/// }
/// ```
public final class VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxVertexAttribDivisor"),
        ValueLayout.JAVA_INT.withName("supportsNonZeroFirstInstance")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxVertexAttribDivisor = LAYOUT.byteOffset(PathElement.groupElement("maxVertexAttribDivisor"));
    public static final long OFFSET_supportsNonZeroFirstInstance = LAYOUT.byteOffset(PathElement.groupElement("supportsNonZeroFirstInstance"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxVertexAttribDivisor = LAYOUT.select(PathElement.groupElement("maxVertexAttribDivisor"));
    public static final MemoryLayout LAYOUT_supportsNonZeroFirstInstance = LAYOUT.select(PathElement.groupElement("supportsNonZeroFirstInstance"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxVertexAttribDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexAttribDivisor"));
    public static final VarHandle VH_supportsNonZeroFirstInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportsNonZeroFirstInstance"));

    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES); }
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR copyFrom(VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR at(long index, Consumer<VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxVertexAttribDivisorAt(long index) { return (int) VH_maxVertexAttribDivisor.get(this.segment(), 0L, index); }
    public int supportsNonZeroFirstInstanceAt(long index) { return (int) VH_supportsNonZeroFirstInstance.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxVertexAttribDivisor() { return (int) VH_maxVertexAttribDivisor.get(this.segment(), 0L, 0L); }
    public int supportsNonZeroFirstInstance() { return (int) VH_supportsNonZeroFirstInstance.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR maxVertexAttribDivisorAt(long index, int value) { VH_maxVertexAttribDivisor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR supportsNonZeroFirstInstanceAt(long index, int value) { VH_supportsNonZeroFirstInstance.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR maxVertexAttribDivisor(int value) { VH_maxVertexAttribDivisor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR supportsNonZeroFirstInstance(int value) { VH_supportsNonZeroFirstInstance.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxVertexAttribDivisorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxVertexAttribDivisor, index), LAYOUT_maxVertexAttribDivisor); }
    public MemorySegment _maxVertexAttribDivisor() { return _maxVertexAttribDivisorAt(0L); }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR _maxVertexAttribDivisorAt(long index, MemorySegment src) { _maxVertexAttribDivisorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR _maxVertexAttribDivisor(MemorySegment src) { return _maxVertexAttribDivisorAt(0L, src); }
    public MemorySegment _supportsNonZeroFirstInstanceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportsNonZeroFirstInstance, index), LAYOUT_supportsNonZeroFirstInstance); }
    public MemorySegment _supportsNonZeroFirstInstance() { return _supportsNonZeroFirstInstanceAt(0L); }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR _supportsNonZeroFirstInstanceAt(long index, MemorySegment src) { _supportsNonZeroFirstInstanceAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR _supportsNonZeroFirstInstance(MemorySegment src) { return _supportsNonZeroFirstInstanceAt(0L, src); }
}
