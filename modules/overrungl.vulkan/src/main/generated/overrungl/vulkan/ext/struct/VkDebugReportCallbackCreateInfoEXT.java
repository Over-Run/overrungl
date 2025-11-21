// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDebugReportCallbackCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkDebugReportCallbackCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDebugReportFlagsEXT flags;
///     PFN_vkDebugReportCallbackEXT pfnCallback;
///     void* pUserData;
/// }
/// ```
public final class VkDebugReportCallbackCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pfnCallback"),
        ValueLayout.ADDRESS.withName("pUserData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_pfnCallback = LAYOUT.byteOffset(PathElement.groupElement("pfnCallback"));
    public static final long OFFSET_pUserData = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_pfnCallback = LAYOUT.select(PathElement.groupElement("pfnCallback"));
    public static final MemoryLayout LAYOUT_pUserData = LAYOUT.select(PathElement.groupElement("pUserData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_pfnCallback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnCallback"));
    public static final VarHandle VH_pUserData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUserData"));

    public VkDebugReportCallbackCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDebugReportCallbackCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugReportCallbackCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDebugReportCallbackCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugReportCallbackCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDebugReportCallbackCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugReportCallbackCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDebugReportCallbackCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkDebugReportCallbackCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDebugReportCallbackCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDebugReportCallbackCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDebugReportCallbackCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDebugReport.VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT); }
    public static VkDebugReportCallbackCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDebugReport.VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT);
        return s;
    }
    public VkDebugReportCallbackCreateInfoEXT copyFrom(VkDebugReportCallbackCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDebugReportCallbackCreateInfoEXT reinterpret(long count) { return new VkDebugReportCallbackCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDebugReportCallbackCreateInfoEXT asSlice(long index) { return new VkDebugReportCallbackCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDebugReportCallbackCreateInfoEXT asSlice(long index, long count) { return new VkDebugReportCallbackCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDebugReportCallbackCreateInfoEXT at(long index, Consumer<VkDebugReportCallbackCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public MemorySegment pfnCallbackAt(long index) { return (MemorySegment) VH_pfnCallback.get(this.segment(), 0L, index); }
    public MemorySegment pUserDataAt(long index) { return (MemorySegment) VH_pUserData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public MemorySegment pfnCallback() { return (MemorySegment) VH_pfnCallback.get(this.segment(), 0L, 0L); }
    public MemorySegment pUserData() { return (MemorySegment) VH_pUserData.get(this.segment(), 0L, 0L); }
    public VkDebugReportCallbackCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDebugReportCallbackCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDebugReportCallbackCreateInfoEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkDebugReportCallbackCreateInfoEXT pfnCallbackAt(long index, MemorySegment value) { VH_pfnCallback.set(this.segment(), 0L, index, value); return this; }
    public VkDebugReportCallbackCreateInfoEXT pUserDataAt(long index, MemorySegment value) { VH_pUserData.set(this.segment(), 0L, index, value); return this; }
    public VkDebugReportCallbackCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugReportCallbackCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugReportCallbackCreateInfoEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugReportCallbackCreateInfoEXT pfnCallback(MemorySegment value) { VH_pfnCallback.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugReportCallbackCreateInfoEXT pUserData(MemorySegment value) { VH_pUserData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDebugReportCallbackCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDebugReportCallbackCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDebugReportCallbackCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDebugReportCallbackCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkDebugReportCallbackCreateInfoEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkDebugReportCallbackCreateInfoEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _pfnCallbackAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pfnCallback, index), LAYOUT_pfnCallback); }
    public MemorySegment _pfnCallback() { return _pfnCallbackAt(0L); }
    public VkDebugReportCallbackCreateInfoEXT _pfnCallbackAt(long index, MemorySegment src) { _pfnCallbackAt(index).copyFrom(src); return this; }
    public VkDebugReportCallbackCreateInfoEXT _pfnCallback(MemorySegment src) { return _pfnCallbackAt(0L, src); }
    public MemorySegment _pUserDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pUserData, index), LAYOUT_pUserData); }
    public MemorySegment _pUserData() { return _pUserDataAt(0L); }
    public VkDebugReportCallbackCreateInfoEXT _pUserDataAt(long index, MemorySegment src) { _pUserDataAt(index).copyFrom(src); return this; }
    public VkDebugReportCallbackCreateInfoEXT _pUserData(MemorySegment src) { return _pUserDataAt(0L, src); }
}
