// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.lunarg.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDirectDriverLoadingInfoLUNARG`.
/// ## Layout
/// ```
/// struct VkDirectDriverLoadingInfoLUNARG {
///     VkStructureType sType;
///     void* pNext;
///     VkDirectDriverLoadingFlagsLUNARG flags;
///     PFN_vkGetInstanceProcAddrLUNARG pfnGetInstanceProcAddr;
/// }
/// ```
public final class VkDirectDriverLoadingInfoLUNARG extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pfnGetInstanceProcAddr")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_pfnGetInstanceProcAddr = LAYOUT.byteOffset(PathElement.groupElement("pfnGetInstanceProcAddr"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_pfnGetInstanceProcAddr = LAYOUT.select(PathElement.groupElement("pfnGetInstanceProcAddr"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_pfnGetInstanceProcAddr = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnGetInstanceProcAddr"));

    public VkDirectDriverLoadingInfoLUNARG(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDirectDriverLoadingInfoLUNARG of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDirectDriverLoadingInfoLUNARG(segment, estimateCount(segment, LAYOUT)); }
    public static VkDirectDriverLoadingInfoLUNARG ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDirectDriverLoadingInfoLUNARG(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDirectDriverLoadingInfoLUNARG ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDirectDriverLoadingInfoLUNARG(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDirectDriverLoadingInfoLUNARG alloc(SegmentAllocator allocator) { return new VkDirectDriverLoadingInfoLUNARG(allocator.allocate(LAYOUT), 1); }
    public static VkDirectDriverLoadingInfoLUNARG alloc(SegmentAllocator allocator, long count) { return new VkDirectDriverLoadingInfoLUNARG(allocator.allocate(LAYOUT, count), count); }
    public static VkDirectDriverLoadingInfoLUNARG allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.lunarg.VKLUNARGDirectDriverLoading.VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_INFO_LUNARG); }
    public static VkDirectDriverLoadingInfoLUNARG allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.lunarg.VKLUNARGDirectDriverLoading.VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_INFO_LUNARG);
        return s;
    }
    public VkDirectDriverLoadingInfoLUNARG copyFrom(VkDirectDriverLoadingInfoLUNARG src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDirectDriverLoadingInfoLUNARG reinterpret(long count) { return new VkDirectDriverLoadingInfoLUNARG(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDirectDriverLoadingInfoLUNARG asSlice(long index) { return new VkDirectDriverLoadingInfoLUNARG(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDirectDriverLoadingInfoLUNARG asSlice(long index, long count) { return new VkDirectDriverLoadingInfoLUNARG(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDirectDriverLoadingInfoLUNARG at(long index, Consumer<VkDirectDriverLoadingInfoLUNARG> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public MemorySegment pfnGetInstanceProcAddrAt(long index) { return (MemorySegment) VH_pfnGetInstanceProcAddr.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public MemorySegment pfnGetInstanceProcAddr() { return (MemorySegment) VH_pfnGetInstanceProcAddr.get(this.segment(), 0L, 0L); }
    public VkDirectDriverLoadingInfoLUNARG sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDirectDriverLoadingInfoLUNARG pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDirectDriverLoadingInfoLUNARG flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkDirectDriverLoadingInfoLUNARG pfnGetInstanceProcAddrAt(long index, MemorySegment value) { VH_pfnGetInstanceProcAddr.set(this.segment(), 0L, index, value); return this; }
    public VkDirectDriverLoadingInfoLUNARG sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDirectDriverLoadingInfoLUNARG pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDirectDriverLoadingInfoLUNARG flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDirectDriverLoadingInfoLUNARG pfnGetInstanceProcAddr(MemorySegment value) { VH_pfnGetInstanceProcAddr.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDirectDriverLoadingInfoLUNARG _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDirectDriverLoadingInfoLUNARG _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDirectDriverLoadingInfoLUNARG _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDirectDriverLoadingInfoLUNARG _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkDirectDriverLoadingInfoLUNARG _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkDirectDriverLoadingInfoLUNARG _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _pfnGetInstanceProcAddrAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pfnGetInstanceProcAddr, index), LAYOUT_pfnGetInstanceProcAddr); }
    public MemorySegment _pfnGetInstanceProcAddr() { return _pfnGetInstanceProcAddrAt(0L); }
    public VkDirectDriverLoadingInfoLUNARG _pfnGetInstanceProcAddrAt(long index, MemorySegment src) { _pfnGetInstanceProcAddrAt(index).copyFrom(src); return this; }
    public VkDirectDriverLoadingInfoLUNARG _pfnGetInstanceProcAddr(MemorySegment src) { return _pfnGetInstanceProcAddrAt(0L, src); }
}
