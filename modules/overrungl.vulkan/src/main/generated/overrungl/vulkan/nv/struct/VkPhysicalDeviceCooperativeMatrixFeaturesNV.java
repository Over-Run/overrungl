// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCooperativeMatrixFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCooperativeMatrixFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 cooperativeMatrix;
///     VkBool32 cooperativeMatrixRobustBufferAccess;
/// }
/// ```
public final class VkPhysicalDeviceCooperativeMatrixFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrix"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixRobustBufferAccess")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_cooperativeMatrix = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrix"));
    public static final long OFFSET_cooperativeMatrixRobustBufferAccess = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixRobustBufferAccess"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_cooperativeMatrix = LAYOUT.select(PathElement.groupElement("cooperativeMatrix"));
    public static final MemoryLayout LAYOUT_cooperativeMatrixRobustBufferAccess = LAYOUT.select(PathElement.groupElement("cooperativeMatrixRobustBufferAccess"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_cooperativeMatrix = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrix"));
    public static final VarHandle VH_cooperativeMatrixRobustBufferAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixRobustBufferAccess"));

    public VkPhysicalDeviceCooperativeMatrixFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrixFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrixFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrixFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCooperativeMatrixFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCooperativeMatrixFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCooperativeMatrix.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV); }
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCooperativeMatrix.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV copyFrom(VkPhysicalDeviceCooperativeMatrixFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceCooperativeMatrixFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV asSlice(long index) { return new VkPhysicalDeviceCooperativeMatrixFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceCooperativeMatrixFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV at(long index, Consumer<VkPhysicalDeviceCooperativeMatrixFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int cooperativeMatrixAt(long index) { return (int) VH_cooperativeMatrix.get(this.segment(), 0L, index); }
    public int cooperativeMatrixRobustBufferAccessAt(long index) { return (int) VH_cooperativeMatrixRobustBufferAccess.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int cooperativeMatrix() { return (int) VH_cooperativeMatrix.get(this.segment(), 0L, 0L); }
    public int cooperativeMatrixRobustBufferAccess() { return (int) VH_cooperativeMatrixRobustBufferAccess.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV cooperativeMatrixAt(long index, int value) { VH_cooperativeMatrix.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV cooperativeMatrixRobustBufferAccessAt(long index, int value) { VH_cooperativeMatrixRobustBufferAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV cooperativeMatrix(int value) { VH_cooperativeMatrix.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV cooperativeMatrixRobustBufferAccess(int value) { VH_cooperativeMatrixRobustBufferAccess.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _cooperativeMatrixAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeMatrix, index), LAYOUT_cooperativeMatrix); }
    public MemorySegment _cooperativeMatrix() { return _cooperativeMatrixAt(0L); }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV _cooperativeMatrixAt(long index, MemorySegment src) { _cooperativeMatrixAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV _cooperativeMatrix(MemorySegment src) { return _cooperativeMatrixAt(0L, src); }
    public MemorySegment _cooperativeMatrixRobustBufferAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeMatrixRobustBufferAccess, index), LAYOUT_cooperativeMatrixRobustBufferAccess); }
    public MemorySegment _cooperativeMatrixRobustBufferAccess() { return _cooperativeMatrixRobustBufferAccessAt(0L); }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV _cooperativeMatrixRobustBufferAccessAt(long index, MemorySegment src) { _cooperativeMatrixRobustBufferAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV _cooperativeMatrixRobustBufferAccess(MemorySegment src) { return _cooperativeMatrixRobustBufferAccessAt(0L, src); }
}
