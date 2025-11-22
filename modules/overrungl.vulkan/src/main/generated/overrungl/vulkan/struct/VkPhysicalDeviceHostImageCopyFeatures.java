// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceHostImageCopyFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceHostImageCopyFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 hostImageCopy;
/// }
/// ```
public final class VkPhysicalDeviceHostImageCopyFeatures extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hostImageCopy")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_hostImageCopy = LAYOUT.byteOffset(PathElement.groupElement("hostImageCopy"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_hostImageCopy = LAYOUT.select(PathElement.groupElement("hostImageCopy"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_hostImageCopy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hostImageCopy"));

    public VkPhysicalDeviceHostImageCopyFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceHostImageCopyFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceHostImageCopyFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceHostImageCopyFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceHostImageCopyFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceHostImageCopyFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceHostImageCopyFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceHostImageCopyFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceHostImageCopyFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceHostImageCopyFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceHostImageCopyFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceHostImageCopyFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES); }
    public static VkPhysicalDeviceHostImageCopyFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES);
        return s;
    }
    public VkPhysicalDeviceHostImageCopyFeatures copyFrom(VkPhysicalDeviceHostImageCopyFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceHostImageCopyFeatures reinterpret(long count) { return new VkPhysicalDeviceHostImageCopyFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceHostImageCopyFeatures asSlice(long index) { return new VkPhysicalDeviceHostImageCopyFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceHostImageCopyFeatures asSlice(long index, long count) { return new VkPhysicalDeviceHostImageCopyFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceHostImageCopyFeatures at(long index, Consumer<VkPhysicalDeviceHostImageCopyFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int hostImageCopyAt(long index) { return (int) VH_hostImageCopy.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int hostImageCopy() { return (int) VH_hostImageCopy.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceHostImageCopyFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceHostImageCopyFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceHostImageCopyFeatures hostImageCopyAt(long index, int value) { VH_hostImageCopy.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceHostImageCopyFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceHostImageCopyFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceHostImageCopyFeatures hostImageCopy(int value) { VH_hostImageCopy.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceHostImageCopyFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceHostImageCopyFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceHostImageCopyFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceHostImageCopyFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _hostImageCopyAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hostImageCopy, index), LAYOUT_hostImageCopy); }
    public MemorySegment _hostImageCopy() { return _hostImageCopyAt(0L); }
    public VkPhysicalDeviceHostImageCopyFeatures _hostImageCopyAt(long index, MemorySegment src) { _hostImageCopyAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceHostImageCopyFeatures _hostImageCopy(MemorySegment src) { return _hostImageCopyAt(0L, src); }
}
