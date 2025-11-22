// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCooperativeMatrixFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCooperativeMatrixFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 cooperativeMatrix;
///     VkBool32 cooperativeMatrixRobustBufferAccess;
/// }
/// ```
public final class VkPhysicalDeviceCooperativeMatrixFeaturesKHR extends GroupType {
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

    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRCooperativeMatrix.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_KHR); }
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRCooperativeMatrix.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR copyFrom(VkPhysicalDeviceCooperativeMatrixFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR at(long index, Consumer<VkPhysicalDeviceCooperativeMatrixFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int cooperativeMatrixAt(long index) { return (int) VH_cooperativeMatrix.get(this.segment(), 0L, index); }
    public int cooperativeMatrixRobustBufferAccessAt(long index) { return (int) VH_cooperativeMatrixRobustBufferAccess.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int cooperativeMatrix() { return (int) VH_cooperativeMatrix.get(this.segment(), 0L, 0L); }
    public int cooperativeMatrixRobustBufferAccess() { return (int) VH_cooperativeMatrixRobustBufferAccess.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR cooperativeMatrixAt(long index, int value) { VH_cooperativeMatrix.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR cooperativeMatrixRobustBufferAccessAt(long index, int value) { VH_cooperativeMatrixRobustBufferAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR cooperativeMatrix(int value) { VH_cooperativeMatrix.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR cooperativeMatrixRobustBufferAccess(int value) { VH_cooperativeMatrixRobustBufferAccess.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _cooperativeMatrixAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeMatrix, index), LAYOUT_cooperativeMatrix); }
    public MemorySegment _cooperativeMatrix() { return _cooperativeMatrixAt(0L); }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR _cooperativeMatrixAt(long index, MemorySegment src) { _cooperativeMatrixAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR _cooperativeMatrix(MemorySegment src) { return _cooperativeMatrixAt(0L, src); }
    public MemorySegment _cooperativeMatrixRobustBufferAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeMatrixRobustBufferAccess, index), LAYOUT_cooperativeMatrixRobustBufferAccess); }
    public MemorySegment _cooperativeMatrixRobustBufferAccess() { return _cooperativeMatrixRobustBufferAccessAt(0L); }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR _cooperativeMatrixRobustBufferAccessAt(long index, MemorySegment src) { _cooperativeMatrixRobustBufferAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR _cooperativeMatrixRobustBufferAccess(MemorySegment src) { return _cooperativeMatrixRobustBufferAccessAt(0L, src); }
}
