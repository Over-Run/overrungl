// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 triStripVertexOrderIndependentOfProvokingVertex;
/// }
/// ```
public final class VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("triStripVertexOrderIndependentOfProvokingVertex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_triStripVertexOrderIndependentOfProvokingVertex = LAYOUT.byteOffset(PathElement.groupElement("triStripVertexOrderIndependentOfProvokingVertex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_triStripVertexOrderIndependentOfProvokingVertex = LAYOUT.select(PathElement.groupElement("triStripVertexOrderIndependentOfProvokingVertex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_triStripVertexOrderIndependentOfProvokingVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triStripVertexOrderIndependentOfProvokingVertex"));

    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRFragmentShaderBarycentric.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_PROPERTIES_KHR); }
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRFragmentShaderBarycentric.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_PROPERTIES_KHR);
        return s;
    }
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR copyFrom(VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR at(long index, Consumer<VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int triStripVertexOrderIndependentOfProvokingVertexAt(long index) { return (int) VH_triStripVertexOrderIndependentOfProvokingVertex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int triStripVertexOrderIndependentOfProvokingVertex() { return (int) VH_triStripVertexOrderIndependentOfProvokingVertex.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR triStripVertexOrderIndependentOfProvokingVertexAt(long index, int value) { VH_triStripVertexOrderIndependentOfProvokingVertex.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR triStripVertexOrderIndependentOfProvokingVertex(int value) { VH_triStripVertexOrderIndependentOfProvokingVertex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _triStripVertexOrderIndependentOfProvokingVertexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_triStripVertexOrderIndependentOfProvokingVertex, index), LAYOUT_triStripVertexOrderIndependentOfProvokingVertex); }
    public MemorySegment _triStripVertexOrderIndependentOfProvokingVertex() { return _triStripVertexOrderIndependentOfProvokingVertexAt(0L); }
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR _triStripVertexOrderIndependentOfProvokingVertexAt(long index, MemorySegment src) { _triStripVertexOrderIndependentOfProvokingVertexAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR _triStripVertexOrderIndependentOfProvokingVertex(MemorySegment src) { return _triStripVertexOrderIndependentOfProvokingVertexAt(0L, src); }
}
