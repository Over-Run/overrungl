// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxVertexAttribDivisor;
/// }
/// ```
public final class VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxVertexAttribDivisor")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxVertexAttribDivisor = LAYOUT.byteOffset(PathElement.groupElement("maxVertexAttribDivisor"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxVertexAttribDivisor = LAYOUT.select(PathElement.groupElement("maxVertexAttribDivisor"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxVertexAttribDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexAttribDivisor"));

    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTVertexAttributeDivisor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT); }
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTVertexAttributeDivisor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT copyFrom(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT at(long index, Consumer<VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxVertexAttribDivisorAt(long index) { return (int) VH_maxVertexAttribDivisor.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxVertexAttribDivisor() { return (int) VH_maxVertexAttribDivisor.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT maxVertexAttribDivisorAt(long index, int value) { VH_maxVertexAttribDivisor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT maxVertexAttribDivisor(int value) { VH_maxVertexAttribDivisor.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxVertexAttribDivisorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxVertexAttribDivisor, index), LAYOUT_maxVertexAttribDivisor); }
    public MemorySegment _maxVertexAttribDivisor() { return _maxVertexAttribDivisorAt(0L); }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT _maxVertexAttribDivisorAt(long index, MemorySegment src) { _maxVertexAttribDivisorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT _maxVertexAttribDivisor(MemorySegment src) { return _maxVertexAttribDivisorAt(0L, src); }
}
