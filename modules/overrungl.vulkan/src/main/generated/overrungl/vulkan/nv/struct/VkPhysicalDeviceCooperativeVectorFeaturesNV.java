// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCooperativeVectorFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCooperativeVectorFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 cooperativeVector;
///     VkBool32 cooperativeVectorTraining;
/// }
/// ```
public final class VkPhysicalDeviceCooperativeVectorFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeVector"),
        ValueLayout.JAVA_INT.withName("cooperativeVectorTraining")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_cooperativeVector = LAYOUT.byteOffset(PathElement.groupElement("cooperativeVector"));
    public static final long OFFSET_cooperativeVectorTraining = LAYOUT.byteOffset(PathElement.groupElement("cooperativeVectorTraining"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_cooperativeVector = LAYOUT.select(PathElement.groupElement("cooperativeVector"));
    public static final MemoryLayout LAYOUT_cooperativeVectorTraining = LAYOUT.select(PathElement.groupElement("cooperativeVectorTraining"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_cooperativeVector = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeVector"));
    public static final VarHandle VH_cooperativeVectorTraining = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeVectorTraining"));

    public VkPhysicalDeviceCooperativeVectorFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeVectorFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeVectorFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeVectorFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCooperativeVectorFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCooperativeVectorFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCooperativeVector.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_FEATURES_NV); }
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCooperativeVector.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV copyFrom(VkPhysicalDeviceCooperativeVectorFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceCooperativeVectorFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV asSlice(long index) { return new VkPhysicalDeviceCooperativeVectorFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceCooperativeVectorFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV at(long index, Consumer<VkPhysicalDeviceCooperativeVectorFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int cooperativeVectorAt(long index) { return (int) VH_cooperativeVector.get(this.segment(), 0L, index); }
    public int cooperativeVectorTrainingAt(long index) { return (int) VH_cooperativeVectorTraining.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int cooperativeVector() { return (int) VH_cooperativeVector.get(this.segment(), 0L, 0L); }
    public int cooperativeVectorTraining() { return (int) VH_cooperativeVectorTraining.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV cooperativeVectorAt(long index, int value) { VH_cooperativeVector.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV cooperativeVectorTrainingAt(long index, int value) { VH_cooperativeVectorTraining.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV cooperativeVector(int value) { VH_cooperativeVector.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV cooperativeVectorTraining(int value) { VH_cooperativeVectorTraining.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _cooperativeVectorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeVector, index), LAYOUT_cooperativeVector); }
    public MemorySegment _cooperativeVector() { return _cooperativeVectorAt(0L); }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV _cooperativeVectorAt(long index, MemorySegment src) { _cooperativeVectorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV _cooperativeVector(MemorySegment src) { return _cooperativeVectorAt(0L, src); }
    public MemorySegment _cooperativeVectorTrainingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeVectorTraining, index), LAYOUT_cooperativeVectorTraining); }
    public MemorySegment _cooperativeVectorTraining() { return _cooperativeVectorTrainingAt(0L); }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV _cooperativeVectorTrainingAt(long index, MemorySegment src) { _cooperativeVectorTrainingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeVectorFeaturesNV _cooperativeVectorTraining(MemorySegment src) { return _cooperativeVectorTrainingAt(0L, src); }
}
