// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkHostImageCopyDevicePerformanceQueryEXT`.
/// ## Layout
/// ```
/// struct VkHostImageCopyDevicePerformanceQueryEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 optimalDeviceAccess;
///     VkBool32 identicalMemoryLayout;
/// }
/// ```
public final class VkHostImageCopyDevicePerformanceQueryEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("optimalDeviceAccess"),
        ValueLayout.JAVA_INT.withName("identicalMemoryLayout")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_optimalDeviceAccess = LAYOUT.byteOffset(PathElement.groupElement("optimalDeviceAccess"));
    public static final long OFFSET_identicalMemoryLayout = LAYOUT.byteOffset(PathElement.groupElement("identicalMemoryLayout"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_optimalDeviceAccess = LAYOUT.select(PathElement.groupElement("optimalDeviceAccess"));
    public static final MemoryLayout LAYOUT_identicalMemoryLayout = LAYOUT.select(PathElement.groupElement("identicalMemoryLayout"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_optimalDeviceAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalDeviceAccess"));
    public static final VarHandle VH_identicalMemoryLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identicalMemoryLayout"));

    public VkHostImageCopyDevicePerformanceQueryEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkHostImageCopyDevicePerformanceQueryEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkHostImageCopyDevicePerformanceQueryEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkHostImageCopyDevicePerformanceQueryEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkHostImageCopyDevicePerformanceQueryEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkHostImageCopyDevicePerformanceQueryEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkHostImageCopyDevicePerformanceQueryEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkHostImageCopyDevicePerformanceQueryEXT alloc(SegmentAllocator allocator) { return new VkHostImageCopyDevicePerformanceQueryEXT(allocator.allocate(LAYOUT), 1); }
    public static VkHostImageCopyDevicePerformanceQueryEXT alloc(SegmentAllocator allocator, long count) { return new VkHostImageCopyDevicePerformanceQueryEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkHostImageCopyDevicePerformanceQueryEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY); }
    public static VkHostImageCopyDevicePerformanceQueryEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY);
        return s;
    }
    public VkHostImageCopyDevicePerformanceQueryEXT copyFrom(VkHostImageCopyDevicePerformanceQueryEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkHostImageCopyDevicePerformanceQueryEXT reinterpret(long count) { return new VkHostImageCopyDevicePerformanceQueryEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkHostImageCopyDevicePerformanceQueryEXT asSlice(long index) { return new VkHostImageCopyDevicePerformanceQueryEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkHostImageCopyDevicePerformanceQueryEXT asSlice(long index, long count) { return new VkHostImageCopyDevicePerformanceQueryEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkHostImageCopyDevicePerformanceQueryEXT at(long index, Consumer<VkHostImageCopyDevicePerformanceQueryEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int optimalDeviceAccessAt(long index) { return (int) VH_optimalDeviceAccess.get(this.segment(), 0L, index); }
    public int identicalMemoryLayoutAt(long index) { return (int) VH_identicalMemoryLayout.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int optimalDeviceAccess() { return (int) VH_optimalDeviceAccess.get(this.segment(), 0L, 0L); }
    public int identicalMemoryLayout() { return (int) VH_identicalMemoryLayout.get(this.segment(), 0L, 0L); }
    public VkHostImageCopyDevicePerformanceQueryEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkHostImageCopyDevicePerformanceQueryEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkHostImageCopyDevicePerformanceQueryEXT optimalDeviceAccessAt(long index, int value) { VH_optimalDeviceAccess.set(this.segment(), 0L, index, value); return this; }
    public VkHostImageCopyDevicePerformanceQueryEXT identicalMemoryLayoutAt(long index, int value) { VH_identicalMemoryLayout.set(this.segment(), 0L, index, value); return this; }
    public VkHostImageCopyDevicePerformanceQueryEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkHostImageCopyDevicePerformanceQueryEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkHostImageCopyDevicePerformanceQueryEXT optimalDeviceAccess(int value) { VH_optimalDeviceAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkHostImageCopyDevicePerformanceQueryEXT identicalMemoryLayout(int value) { VH_identicalMemoryLayout.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkHostImageCopyDevicePerformanceQueryEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkHostImageCopyDevicePerformanceQueryEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkHostImageCopyDevicePerformanceQueryEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkHostImageCopyDevicePerformanceQueryEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _optimalDeviceAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_optimalDeviceAccess, index), LAYOUT_optimalDeviceAccess); }
    public MemorySegment _optimalDeviceAccess() { return _optimalDeviceAccessAt(0L); }
    public VkHostImageCopyDevicePerformanceQueryEXT _optimalDeviceAccessAt(long index, MemorySegment src) { _optimalDeviceAccessAt(index).copyFrom(src); return this; }
    public VkHostImageCopyDevicePerformanceQueryEXT _optimalDeviceAccess(MemorySegment src) { return _optimalDeviceAccessAt(0L, src); }
    public MemorySegment _identicalMemoryLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_identicalMemoryLayout, index), LAYOUT_identicalMemoryLayout); }
    public MemorySegment _identicalMemoryLayout() { return _identicalMemoryLayoutAt(0L); }
    public VkHostImageCopyDevicePerformanceQueryEXT _identicalMemoryLayoutAt(long index, MemorySegment src) { _identicalMemoryLayoutAt(index).copyFrom(src); return this; }
    public VkHostImageCopyDevicePerformanceQueryEXT _identicalMemoryLayout(MemorySegment src) { return _identicalMemoryLayoutAt(0L, src); }
}
