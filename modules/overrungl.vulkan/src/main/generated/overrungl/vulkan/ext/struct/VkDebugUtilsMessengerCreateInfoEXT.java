// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDebugUtilsMessengerCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkDebugUtilsMessengerCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDebugUtilsMessengerCreateFlagsEXT flags;
///     VkDebugUtilsMessageSeverityFlagsEXT messageSeverity;
///     VkDebugUtilsMessageTypeFlagsEXT messageType;
///     PFN_vkDebugUtilsMessengerCallbackEXT pfnUserCallback;
///     void* pUserData;
/// }
/// ```
public final class VkDebugUtilsMessengerCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("messageSeverity"),
        ValueLayout.JAVA_INT.withName("messageType"),
        ValueLayout.ADDRESS.withName("pfnUserCallback"),
        ValueLayout.ADDRESS.withName("pUserData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_messageSeverity = LAYOUT.byteOffset(PathElement.groupElement("messageSeverity"));
    public static final long OFFSET_messageType = LAYOUT.byteOffset(PathElement.groupElement("messageType"));
    public static final long OFFSET_pfnUserCallback = LAYOUT.byteOffset(PathElement.groupElement("pfnUserCallback"));
    public static final long OFFSET_pUserData = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_messageSeverity = LAYOUT.select(PathElement.groupElement("messageSeverity"));
    public static final MemoryLayout LAYOUT_messageType = LAYOUT.select(PathElement.groupElement("messageType"));
    public static final MemoryLayout LAYOUT_pfnUserCallback = LAYOUT.select(PathElement.groupElement("pfnUserCallback"));
    public static final MemoryLayout LAYOUT_pUserData = LAYOUT.select(PathElement.groupElement("pUserData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_messageSeverity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("messageSeverity"));
    public static final VarHandle VH_messageType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("messageType"));
    public static final VarHandle VH_pfnUserCallback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnUserCallback"));
    public static final VarHandle VH_pUserData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUserData"));

    public VkDebugUtilsMessengerCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDebugUtilsMessengerCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsMessengerCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDebugUtilsMessengerCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsMessengerCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDebugUtilsMessengerCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsMessengerCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDebugUtilsMessengerCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkDebugUtilsMessengerCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDebugUtilsMessengerCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDebugUtilsMessengerCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDebugUtilsMessengerCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT); }
    public static VkDebugUtilsMessengerCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT);
        return s;
    }
    public VkDebugUtilsMessengerCreateInfoEXT copyFrom(VkDebugUtilsMessengerCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT reinterpret(long count) { return new VkDebugUtilsMessengerCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDebugUtilsMessengerCreateInfoEXT asSlice(long index) { return new VkDebugUtilsMessengerCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDebugUtilsMessengerCreateInfoEXT asSlice(long index, long count) { return new VkDebugUtilsMessengerCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDebugUtilsMessengerCreateInfoEXT at(long index, Consumer<VkDebugUtilsMessengerCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int messageSeverityAt(long index) { return (int) VH_messageSeverity.get(this.segment(), 0L, index); }
    public int messageTypeAt(long index) { return (int) VH_messageType.get(this.segment(), 0L, index); }
    public MemorySegment pfnUserCallbackAt(long index) { return (MemorySegment) VH_pfnUserCallback.get(this.segment(), 0L, index); }
    public MemorySegment pUserDataAt(long index) { return (MemorySegment) VH_pUserData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int messageSeverity() { return (int) VH_messageSeverity.get(this.segment(), 0L, 0L); }
    public int messageType() { return (int) VH_messageType.get(this.segment(), 0L, 0L); }
    public MemorySegment pfnUserCallback() { return (MemorySegment) VH_pfnUserCallback.get(this.segment(), 0L, 0L); }
    public MemorySegment pUserData() { return (MemorySegment) VH_pUserData.get(this.segment(), 0L, 0L); }
    public VkDebugUtilsMessengerCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT messageSeverityAt(long index, int value) { VH_messageSeverity.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT messageTypeAt(long index, int value) { VH_messageType.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT pfnUserCallbackAt(long index, MemorySegment value) { VH_pfnUserCallback.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT pUserDataAt(long index, MemorySegment value) { VH_pUserData.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT messageSeverity(int value) { VH_messageSeverity.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT messageType(int value) { VH_messageType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT pfnUserCallback(MemorySegment value) { VH_pfnUserCallback.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT pUserData(MemorySegment value) { VH_pUserData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDebugUtilsMessengerCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDebugUtilsMessengerCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkDebugUtilsMessengerCreateInfoEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _messageSeverityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_messageSeverity, index), LAYOUT_messageSeverity); }
    public MemorySegment _messageSeverity() { return _messageSeverityAt(0L); }
    public VkDebugUtilsMessengerCreateInfoEXT _messageSeverityAt(long index, MemorySegment src) { _messageSeverityAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT _messageSeverity(MemorySegment src) { return _messageSeverityAt(0L, src); }
    public MemorySegment _messageTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_messageType, index), LAYOUT_messageType); }
    public MemorySegment _messageType() { return _messageTypeAt(0L); }
    public VkDebugUtilsMessengerCreateInfoEXT _messageTypeAt(long index, MemorySegment src) { _messageTypeAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT _messageType(MemorySegment src) { return _messageTypeAt(0L, src); }
    public MemorySegment _pfnUserCallbackAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pfnUserCallback, index), LAYOUT_pfnUserCallback); }
    public MemorySegment _pfnUserCallback() { return _pfnUserCallbackAt(0L); }
    public VkDebugUtilsMessengerCreateInfoEXT _pfnUserCallbackAt(long index, MemorySegment src) { _pfnUserCallbackAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT _pfnUserCallback(MemorySegment src) { return _pfnUserCallbackAt(0L, src); }
    public MemorySegment _pUserDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pUserData, index), LAYOUT_pUserData); }
    public MemorySegment _pUserData() { return _pUserDataAt(0L); }
    public VkDebugUtilsMessengerCreateInfoEXT _pUserDataAt(long index, MemorySegment src) { _pUserDataAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCreateInfoEXT _pUserData(MemorySegment src) { return _pUserDataAt(0L, src); }
}
