// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSwapchainDisplayNativeHdrCreateInfoAMD`.
/// ## Layout
/// ```
/// struct VkSwapchainDisplayNativeHdrCreateInfoAMD {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 localDimmingEnable;
/// }
/// ```
public final class VkSwapchainDisplayNativeHdrCreateInfoAMD extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("localDimmingEnable")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_localDimmingEnable = LAYOUT.byteOffset(PathElement.groupElement("localDimmingEnable"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_localDimmingEnable = LAYOUT.select(PathElement.groupElement("localDimmingEnable"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_localDimmingEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("localDimmingEnable"));

    public VkSwapchainDisplayNativeHdrCreateInfoAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSwapchainDisplayNativeHdrCreateInfoAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainDisplayNativeHdrCreateInfoAMD(segment, estimateCount(segment, LAYOUT)); }
    public static VkSwapchainDisplayNativeHdrCreateInfoAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainDisplayNativeHdrCreateInfoAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSwapchainDisplayNativeHdrCreateInfoAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainDisplayNativeHdrCreateInfoAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSwapchainDisplayNativeHdrCreateInfoAMD alloc(SegmentAllocator allocator) { return new VkSwapchainDisplayNativeHdrCreateInfoAMD(allocator.allocate(LAYOUT), 1); }
    public static VkSwapchainDisplayNativeHdrCreateInfoAMD alloc(SegmentAllocator allocator, long count) { return new VkSwapchainDisplayNativeHdrCreateInfoAMD(allocator.allocate(LAYOUT, count), count); }
    public static VkSwapchainDisplayNativeHdrCreateInfoAMD allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amd.VKAMDDisplayNativeHdr.VK_STRUCTURE_TYPE_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO_AMD); }
    public static VkSwapchainDisplayNativeHdrCreateInfoAMD allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amd.VKAMDDisplayNativeHdr.VK_STRUCTURE_TYPE_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO_AMD);
        return s;
    }
    public VkSwapchainDisplayNativeHdrCreateInfoAMD copyFrom(VkSwapchainDisplayNativeHdrCreateInfoAMD src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSwapchainDisplayNativeHdrCreateInfoAMD reinterpret(long count) { return new VkSwapchainDisplayNativeHdrCreateInfoAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSwapchainDisplayNativeHdrCreateInfoAMD asSlice(long index) { return new VkSwapchainDisplayNativeHdrCreateInfoAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSwapchainDisplayNativeHdrCreateInfoAMD asSlice(long index, long count) { return new VkSwapchainDisplayNativeHdrCreateInfoAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSwapchainDisplayNativeHdrCreateInfoAMD at(long index, Consumer<VkSwapchainDisplayNativeHdrCreateInfoAMD> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int localDimmingEnableAt(long index) { return (int) VH_localDimmingEnable.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int localDimmingEnable() { return (int) VH_localDimmingEnable.get(this.segment(), 0L, 0L); }
    public VkSwapchainDisplayNativeHdrCreateInfoAMD sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainDisplayNativeHdrCreateInfoAMD pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainDisplayNativeHdrCreateInfoAMD localDimmingEnableAt(long index, int value) { VH_localDimmingEnable.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainDisplayNativeHdrCreateInfoAMD sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainDisplayNativeHdrCreateInfoAMD pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainDisplayNativeHdrCreateInfoAMD localDimmingEnable(int value) { VH_localDimmingEnable.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSwapchainDisplayNativeHdrCreateInfoAMD _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSwapchainDisplayNativeHdrCreateInfoAMD _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSwapchainDisplayNativeHdrCreateInfoAMD _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSwapchainDisplayNativeHdrCreateInfoAMD _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _localDimmingEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_localDimmingEnable, index), LAYOUT_localDimmingEnable); }
    public MemorySegment _localDimmingEnable() { return _localDimmingEnableAt(0L); }
    public VkSwapchainDisplayNativeHdrCreateInfoAMD _localDimmingEnableAt(long index, MemorySegment src) { _localDimmingEnableAt(index).copyFrom(src); return this; }
    public VkSwapchainDisplayNativeHdrCreateInfoAMD _localDimmingEnable(MemorySegment src) { return _localDimmingEnableAt(0L, src); }
}
