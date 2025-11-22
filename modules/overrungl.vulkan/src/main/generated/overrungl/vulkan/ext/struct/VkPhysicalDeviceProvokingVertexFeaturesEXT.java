// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceProvokingVertexFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceProvokingVertexFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 provokingVertexLast;
///     VkBool32 transformFeedbackPreservesProvokingVertex;
/// }
/// ```
public final class VkPhysicalDeviceProvokingVertexFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("provokingVertexLast"),
        ValueLayout.JAVA_INT.withName("transformFeedbackPreservesProvokingVertex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_provokingVertexLast = LAYOUT.byteOffset(PathElement.groupElement("provokingVertexLast"));
    public static final long OFFSET_transformFeedbackPreservesProvokingVertex = LAYOUT.byteOffset(PathElement.groupElement("transformFeedbackPreservesProvokingVertex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_provokingVertexLast = LAYOUT.select(PathElement.groupElement("provokingVertexLast"));
    public static final MemoryLayout LAYOUT_transformFeedbackPreservesProvokingVertex = LAYOUT.select(PathElement.groupElement("transformFeedbackPreservesProvokingVertex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_provokingVertexLast = LAYOUT.arrayElementVarHandle(PathElement.groupElement("provokingVertexLast"));
    public static final VarHandle VH_transformFeedbackPreservesProvokingVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedbackPreservesProvokingVertex"));

    public VkPhysicalDeviceProvokingVertexFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProvokingVertexFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProvokingVertexFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProvokingVertexFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceProvokingVertexFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceProvokingVertexFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTProvokingVertex.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_FEATURES_EXT); }
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTProvokingVertex.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT copyFrom(VkPhysicalDeviceProvokingVertexFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceProvokingVertexFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceProvokingVertexFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceProvokingVertexFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT at(long index, Consumer<VkPhysicalDeviceProvokingVertexFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int provokingVertexLastAt(long index) { return (int) VH_provokingVertexLast.get(this.segment(), 0L, index); }
    public int transformFeedbackPreservesProvokingVertexAt(long index) { return (int) VH_transformFeedbackPreservesProvokingVertex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int provokingVertexLast() { return (int) VH_provokingVertexLast.get(this.segment(), 0L, 0L); }
    public int transformFeedbackPreservesProvokingVertex() { return (int) VH_transformFeedbackPreservesProvokingVertex.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT provokingVertexLastAt(long index, int value) { VH_provokingVertexLast.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT transformFeedbackPreservesProvokingVertexAt(long index, int value) { VH_transformFeedbackPreservesProvokingVertex.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT provokingVertexLast(int value) { VH_provokingVertexLast.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT transformFeedbackPreservesProvokingVertex(int value) { VH_transformFeedbackPreservesProvokingVertex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _provokingVertexLastAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_provokingVertexLast, index), LAYOUT_provokingVertexLast); }
    public MemorySegment _provokingVertexLast() { return _provokingVertexLastAt(0L); }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT _provokingVertexLastAt(long index, MemorySegment src) { _provokingVertexLastAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT _provokingVertexLast(MemorySegment src) { return _provokingVertexLastAt(0L, src); }
    public MemorySegment _transformFeedbackPreservesProvokingVertexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_transformFeedbackPreservesProvokingVertex, index), LAYOUT_transformFeedbackPreservesProvokingVertex); }
    public MemorySegment _transformFeedbackPreservesProvokingVertex() { return _transformFeedbackPreservesProvokingVertexAt(0L); }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT _transformFeedbackPreservesProvokingVertexAt(long index, MemorySegment src) { _transformFeedbackPreservesProvokingVertexAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProvokingVertexFeaturesEXT _transformFeedbackPreservesProvokingVertex(MemorySegment src) { return _transformFeedbackPreservesProvokingVertexAt(0L, src); }
}
