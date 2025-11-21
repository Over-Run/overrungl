// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 vertexInputDynamicState;
/// }
/// ```
public final class VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexInputDynamicState")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_vertexInputDynamicState = LAYOUT.byteOffset(PathElement.groupElement("vertexInputDynamicState"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_vertexInputDynamicState = LAYOUT.select(PathElement.groupElement("vertexInputDynamicState"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_vertexInputDynamicState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexInputDynamicState"));

    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTVertexInputDynamicState.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_INPUT_DYNAMIC_STATE_FEATURES_EXT); }
    public static VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTVertexInputDynamicState.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_INPUT_DYNAMIC_STATE_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT copyFrom(VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT at(long index, Consumer<VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int vertexInputDynamicStateAt(long index) { return (int) VH_vertexInputDynamicState.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int vertexInputDynamicState() { return (int) VH_vertexInputDynamicState.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT vertexInputDynamicStateAt(long index, int value) { VH_vertexInputDynamicState.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT vertexInputDynamicState(int value) { VH_vertexInputDynamicState.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _vertexInputDynamicStateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexInputDynamicState, index), LAYOUT_vertexInputDynamicState); }
    public MemorySegment _vertexInputDynamicState() { return _vertexInputDynamicStateAt(0L); }
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT _vertexInputDynamicStateAt(long index, MemorySegment src) { _vertexInputDynamicStateAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT _vertexInputDynamicState(MemorySegment src) { return _vertexInputDynamicStateAt(0L, src); }
}
