// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceTransformFeedbackFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTransformFeedbackFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 transformFeedback;
///     VkBool32 geometryStreams;
/// }
/// ```
public final class VkPhysicalDeviceTransformFeedbackFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("transformFeedback"),
        ValueLayout.JAVA_INT.withName("geometryStreams")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_transformFeedback = LAYOUT.byteOffset(PathElement.groupElement("transformFeedback"));
    public static final long OFFSET_geometryStreams = LAYOUT.byteOffset(PathElement.groupElement("geometryStreams"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_transformFeedback = LAYOUT.select(PathElement.groupElement("transformFeedback"));
    public static final MemoryLayout LAYOUT_geometryStreams = LAYOUT.select(PathElement.groupElement("geometryStreams"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_transformFeedback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedback"));
    public static final VarHandle VH_geometryStreams = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometryStreams"));

    public VkPhysicalDeviceTransformFeedbackFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTransformFeedbackFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTransformFeedbackFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTransformFeedbackFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTTransformFeedback.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT); }
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTTransformFeedback.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT copyFrom(VkPhysicalDeviceTransformFeedbackFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT at(long index, Consumer<VkPhysicalDeviceTransformFeedbackFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int transformFeedbackAt(long index) { return (int) VH_transformFeedback.get(this.segment(), 0L, index); }
    public int geometryStreamsAt(long index) { return (int) VH_geometryStreams.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int transformFeedback() { return (int) VH_transformFeedback.get(this.segment(), 0L, 0L); }
    public int geometryStreams() { return (int) VH_geometryStreams.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT transformFeedbackAt(long index, int value) { VH_transformFeedback.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT geometryStreamsAt(long index, int value) { VH_geometryStreams.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT transformFeedback(int value) { VH_transformFeedback.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT geometryStreams(int value) { VH_geometryStreams.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _transformFeedbackAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_transformFeedback, index), LAYOUT_transformFeedback); }
    public MemorySegment _transformFeedback() { return _transformFeedbackAt(0L); }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT _transformFeedbackAt(long index, MemorySegment src) { _transformFeedbackAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT _transformFeedback(MemorySegment src) { return _transformFeedbackAt(0L, src); }
    public MemorySegment _geometryStreamsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_geometryStreams, index), LAYOUT_geometryStreams); }
    public MemorySegment _geometryStreams() { return _geometryStreamsAt(0L); }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT _geometryStreamsAt(long index, MemorySegment src) { _geometryStreamsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT _geometryStreams(MemorySegment src) { return _geometryStreamsAt(0L, src); }
}
