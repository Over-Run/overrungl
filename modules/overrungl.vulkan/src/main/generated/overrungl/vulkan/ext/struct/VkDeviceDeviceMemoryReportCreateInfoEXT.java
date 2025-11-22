// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceDeviceMemoryReportCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkDeviceDeviceMemoryReportCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceMemoryReportFlagsEXT flags;
///     PFN_vkDeviceMemoryReportCallbackEXT pfnUserCallback;
///     void* pUserData;
/// }
/// ```
public final class VkDeviceDeviceMemoryReportCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pfnUserCallback"),
        ValueLayout.ADDRESS.withName("pUserData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_pfnUserCallback = LAYOUT.byteOffset(PathElement.groupElement("pfnUserCallback"));
    public static final long OFFSET_pUserData = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_pfnUserCallback = LAYOUT.select(PathElement.groupElement("pfnUserCallback"));
    public static final MemoryLayout LAYOUT_pUserData = LAYOUT.select(PathElement.groupElement("pUserData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_pfnUserCallback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnUserCallback"));
    public static final VarHandle VH_pUserData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUserData"));

    public VkDeviceDeviceMemoryReportCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceDeviceMemoryReportCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceDeviceMemoryReportCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceDeviceMemoryReportCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceDeviceMemoryReportCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceDeviceMemoryReportCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceDeviceMemoryReportCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceDeviceMemoryReportCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkDeviceDeviceMemoryReportCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceDeviceMemoryReportCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDeviceDeviceMemoryReportCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceDeviceMemoryReportCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceMemoryReport.VK_STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT); }
    public static VkDeviceDeviceMemoryReportCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceMemoryReport.VK_STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT);
        return s;
    }
    public VkDeviceDeviceMemoryReportCreateInfoEXT copyFrom(VkDeviceDeviceMemoryReportCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceDeviceMemoryReportCreateInfoEXT reinterpret(long count) { return new VkDeviceDeviceMemoryReportCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceDeviceMemoryReportCreateInfoEXT asSlice(long index) { return new VkDeviceDeviceMemoryReportCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceDeviceMemoryReportCreateInfoEXT asSlice(long index, long count) { return new VkDeviceDeviceMemoryReportCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceDeviceMemoryReportCreateInfoEXT at(long index, Consumer<VkDeviceDeviceMemoryReportCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public MemorySegment pfnUserCallbackAt(long index) { return (MemorySegment) VH_pfnUserCallback.get(this.segment(), 0L, index); }
    public MemorySegment pUserDataAt(long index) { return (MemorySegment) VH_pUserData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public MemorySegment pfnUserCallback() { return (MemorySegment) VH_pfnUserCallback.get(this.segment(), 0L, 0L); }
    public MemorySegment pUserData() { return (MemorySegment) VH_pUserData.get(this.segment(), 0L, 0L); }
    public VkDeviceDeviceMemoryReportCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceDeviceMemoryReportCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceDeviceMemoryReportCreateInfoEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceDeviceMemoryReportCreateInfoEXT pfnUserCallbackAt(long index, MemorySegment value) { VH_pfnUserCallback.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceDeviceMemoryReportCreateInfoEXT pUserDataAt(long index, MemorySegment value) { VH_pUserData.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceDeviceMemoryReportCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceDeviceMemoryReportCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceDeviceMemoryReportCreateInfoEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceDeviceMemoryReportCreateInfoEXT pfnUserCallback(MemorySegment value) { VH_pfnUserCallback.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceDeviceMemoryReportCreateInfoEXT pUserData(MemorySegment value) { VH_pUserData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceDeviceMemoryReportCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceDeviceMemoryReportCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceDeviceMemoryReportCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceDeviceMemoryReportCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkDeviceDeviceMemoryReportCreateInfoEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkDeviceDeviceMemoryReportCreateInfoEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _pfnUserCallbackAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pfnUserCallback, index), LAYOUT_pfnUserCallback); }
    public MemorySegment _pfnUserCallback() { return _pfnUserCallbackAt(0L); }
    public VkDeviceDeviceMemoryReportCreateInfoEXT _pfnUserCallbackAt(long index, MemorySegment src) { _pfnUserCallbackAt(index).copyFrom(src); return this; }
    public VkDeviceDeviceMemoryReportCreateInfoEXT _pfnUserCallback(MemorySegment src) { return _pfnUserCallbackAt(0L, src); }
    public MemorySegment _pUserDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pUserData, index), LAYOUT_pUserData); }
    public MemorySegment _pUserData() { return _pUserDataAt(0L); }
    public VkDeviceDeviceMemoryReportCreateInfoEXT _pUserDataAt(long index, MemorySegment src) { _pUserDataAt(index).copyFrom(src); return this; }
    public VkDeviceDeviceMemoryReportCreateInfoEXT _pUserData(MemorySegment src) { return _pUserDataAt(0L, src); }
}
