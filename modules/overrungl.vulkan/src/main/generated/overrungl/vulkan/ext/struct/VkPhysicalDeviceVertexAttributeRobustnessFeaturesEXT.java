// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 vertexAttributeRobustness;
/// }
/// ```
public final class VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexAttributeRobustness")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_vertexAttributeRobustness = LAYOUT.byteOffset(PathElement.groupElement("vertexAttributeRobustness"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_vertexAttributeRobustness = LAYOUT.select(PathElement.groupElement("vertexAttributeRobustness"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_vertexAttributeRobustness = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeRobustness"));

    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTVertexAttributeRobustness.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_ROBUSTNESS_FEATURES_EXT); }
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTVertexAttributeRobustness.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_ROBUSTNESS_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT copyFrom(VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT at(long index, Consumer<VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int vertexAttributeRobustnessAt(long index) { return (int) VH_vertexAttributeRobustness.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int vertexAttributeRobustness() { return (int) VH_vertexAttributeRobustness.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT vertexAttributeRobustnessAt(long index, int value) { VH_vertexAttributeRobustness.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT vertexAttributeRobustness(int value) { VH_vertexAttributeRobustness.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _vertexAttributeRobustnessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexAttributeRobustness, index), LAYOUT_vertexAttributeRobustness); }
    public MemorySegment _vertexAttributeRobustness() { return _vertexAttributeRobustnessAt(0L); }
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT _vertexAttributeRobustnessAt(long index, MemorySegment src) { _vertexAttributeRobustnessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT _vertexAttributeRobustness(MemorySegment src) { return _vertexAttributeRobustnessAt(0L, src); }
}
