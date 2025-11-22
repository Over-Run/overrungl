// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDebugUtilsMessengerCallbackDataEXT`.
/// ## Layout
/// ```
/// struct VkDebugUtilsMessengerCallbackDataEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDebugUtilsMessengerCallbackDataFlagsEXT flags;
///     const char* pMessageIdName;
///     int32_t messageIdNumber;
///     const char* pMessage;
///     uint32_t queueLabelCount;
///     const VkDebugUtilsLabelEXT* pQueueLabels;
///     uint32_t cmdBufLabelCount;
///     const VkDebugUtilsLabelEXT* pCmdBufLabels;
///     uint32_t objectCount;
///     const VkDebugUtilsObjectNameInfoEXT* pObjects;
/// }
/// ```
public final class VkDebugUtilsMessengerCallbackDataEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pMessageIdName"),
        ValueLayout.JAVA_INT.withName("messageIdNumber"),
        ValueLayout.ADDRESS.withName("pMessage"),
        ValueLayout.JAVA_INT.withName("queueLabelCount"),
        ValueLayout.ADDRESS.withName("pQueueLabels"),
        ValueLayout.JAVA_INT.withName("cmdBufLabelCount"),
        ValueLayout.ADDRESS.withName("pCmdBufLabels"),
        ValueLayout.JAVA_INT.withName("objectCount"),
        ValueLayout.ADDRESS.withName("pObjects")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_pMessageIdName = LAYOUT.byteOffset(PathElement.groupElement("pMessageIdName"));
    public static final long OFFSET_messageIdNumber = LAYOUT.byteOffset(PathElement.groupElement("messageIdNumber"));
    public static final long OFFSET_pMessage = LAYOUT.byteOffset(PathElement.groupElement("pMessage"));
    public static final long OFFSET_queueLabelCount = LAYOUT.byteOffset(PathElement.groupElement("queueLabelCount"));
    public static final long OFFSET_pQueueLabels = LAYOUT.byteOffset(PathElement.groupElement("pQueueLabels"));
    public static final long OFFSET_cmdBufLabelCount = LAYOUT.byteOffset(PathElement.groupElement("cmdBufLabelCount"));
    public static final long OFFSET_pCmdBufLabels = LAYOUT.byteOffset(PathElement.groupElement("pCmdBufLabels"));
    public static final long OFFSET_objectCount = LAYOUT.byteOffset(PathElement.groupElement("objectCount"));
    public static final long OFFSET_pObjects = LAYOUT.byteOffset(PathElement.groupElement("pObjects"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_pMessageIdName = LAYOUT.select(PathElement.groupElement("pMessageIdName"));
    public static final MemoryLayout LAYOUT_messageIdNumber = LAYOUT.select(PathElement.groupElement("messageIdNumber"));
    public static final MemoryLayout LAYOUT_pMessage = LAYOUT.select(PathElement.groupElement("pMessage"));
    public static final MemoryLayout LAYOUT_queueLabelCount = LAYOUT.select(PathElement.groupElement("queueLabelCount"));
    public static final MemoryLayout LAYOUT_pQueueLabels = LAYOUT.select(PathElement.groupElement("pQueueLabels"));
    public static final MemoryLayout LAYOUT_cmdBufLabelCount = LAYOUT.select(PathElement.groupElement("cmdBufLabelCount"));
    public static final MemoryLayout LAYOUT_pCmdBufLabels = LAYOUT.select(PathElement.groupElement("pCmdBufLabels"));
    public static final MemoryLayout LAYOUT_objectCount = LAYOUT.select(PathElement.groupElement("objectCount"));
    public static final MemoryLayout LAYOUT_pObjects = LAYOUT.select(PathElement.groupElement("pObjects"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_pMessageIdName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMessageIdName"));
    public static final VarHandle VH_messageIdNumber = LAYOUT.arrayElementVarHandle(PathElement.groupElement("messageIdNumber"));
    public static final VarHandle VH_pMessage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMessage"));
    public static final VarHandle VH_queueLabelCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueLabelCount"));
    public static final VarHandle VH_pQueueLabels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueueLabels"));
    public static final VarHandle VH_cmdBufLabelCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cmdBufLabelCount"));
    public static final VarHandle VH_pCmdBufLabels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCmdBufLabels"));
    public static final VarHandle VH_objectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectCount"));
    public static final VarHandle VH_pObjects = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pObjects"));

    public VkDebugUtilsMessengerCallbackDataEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDebugUtilsMessengerCallbackDataEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsMessengerCallbackDataEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDebugUtilsMessengerCallbackDataEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsMessengerCallbackDataEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDebugUtilsMessengerCallbackDataEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsMessengerCallbackDataEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDebugUtilsMessengerCallbackDataEXT alloc(SegmentAllocator allocator) { return new VkDebugUtilsMessengerCallbackDataEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDebugUtilsMessengerCallbackDataEXT alloc(SegmentAllocator allocator, long count) { return new VkDebugUtilsMessengerCallbackDataEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDebugUtilsMessengerCallbackDataEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT); }
    public static VkDebugUtilsMessengerCallbackDataEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT);
        return s;
    }
    public VkDebugUtilsMessengerCallbackDataEXT copyFrom(VkDebugUtilsMessengerCallbackDataEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT reinterpret(long count) { return new VkDebugUtilsMessengerCallbackDataEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDebugUtilsMessengerCallbackDataEXT asSlice(long index) { return new VkDebugUtilsMessengerCallbackDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDebugUtilsMessengerCallbackDataEXT asSlice(long index, long count) { return new VkDebugUtilsMessengerCallbackDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDebugUtilsMessengerCallbackDataEXT at(long index, Consumer<VkDebugUtilsMessengerCallbackDataEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public MemorySegment pMessageIdNameAt(long index) { return (MemorySegment) VH_pMessageIdName.get(this.segment(), 0L, index); }
    public int messageIdNumberAt(long index) { return (int) VH_messageIdNumber.get(this.segment(), 0L, index); }
    public MemorySegment pMessageAt(long index) { return (MemorySegment) VH_pMessage.get(this.segment(), 0L, index); }
    public int queueLabelCountAt(long index) { return (int) VH_queueLabelCount.get(this.segment(), 0L, index); }
    public MemorySegment pQueueLabelsAt(long index) { return (MemorySegment) VH_pQueueLabels.get(this.segment(), 0L, index); }
    public int cmdBufLabelCountAt(long index) { return (int) VH_cmdBufLabelCount.get(this.segment(), 0L, index); }
    public MemorySegment pCmdBufLabelsAt(long index) { return (MemorySegment) VH_pCmdBufLabels.get(this.segment(), 0L, index); }
    public int objectCountAt(long index) { return (int) VH_objectCount.get(this.segment(), 0L, index); }
    public MemorySegment pObjectsAt(long index) { return (MemorySegment) VH_pObjects.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public MemorySegment pMessageIdName() { return (MemorySegment) VH_pMessageIdName.get(this.segment(), 0L, 0L); }
    public int messageIdNumber() { return (int) VH_messageIdNumber.get(this.segment(), 0L, 0L); }
    public MemorySegment pMessage() { return (MemorySegment) VH_pMessage.get(this.segment(), 0L, 0L); }
    public int queueLabelCount() { return (int) VH_queueLabelCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pQueueLabels() { return (MemorySegment) VH_pQueueLabels.get(this.segment(), 0L, 0L); }
    public int cmdBufLabelCount() { return (int) VH_cmdBufLabelCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pCmdBufLabels() { return (MemorySegment) VH_pCmdBufLabels.get(this.segment(), 0L, 0L); }
    public int objectCount() { return (int) VH_objectCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pObjects() { return (MemorySegment) VH_pObjects.get(this.segment(), 0L, 0L); }
    public VkDebugUtilsMessengerCallbackDataEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT pMessageIdNameAt(long index, MemorySegment value) { VH_pMessageIdName.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT messageIdNumberAt(long index, int value) { VH_messageIdNumber.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT pMessageAt(long index, MemorySegment value) { VH_pMessage.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT queueLabelCountAt(long index, int value) { VH_queueLabelCount.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT pQueueLabelsAt(long index, MemorySegment value) { VH_pQueueLabels.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT cmdBufLabelCountAt(long index, int value) { VH_cmdBufLabelCount.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT pCmdBufLabelsAt(long index, MemorySegment value) { VH_pCmdBufLabels.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT objectCountAt(long index, int value) { VH_objectCount.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT pObjectsAt(long index, MemorySegment value) { VH_pObjects.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT pMessageIdName(MemorySegment value) { VH_pMessageIdName.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT messageIdNumber(int value) { VH_messageIdNumber.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT pMessage(MemorySegment value) { VH_pMessage.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT queueLabelCount(int value) { VH_queueLabelCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT pQueueLabels(MemorySegment value) { VH_pQueueLabels.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT cmdBufLabelCount(int value) { VH_cmdBufLabelCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT pCmdBufLabels(MemorySegment value) { VH_pCmdBufLabels.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT objectCount(int value) { VH_objectCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT pObjects(MemorySegment value) { VH_pObjects.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDebugUtilsMessengerCallbackDataEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDebugUtilsMessengerCallbackDataEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkDebugUtilsMessengerCallbackDataEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _pMessageIdNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pMessageIdName, index), LAYOUT_pMessageIdName); }
    public MemorySegment _pMessageIdName() { return _pMessageIdNameAt(0L); }
    public VkDebugUtilsMessengerCallbackDataEXT _pMessageIdNameAt(long index, MemorySegment src) { _pMessageIdNameAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT _pMessageIdName(MemorySegment src) { return _pMessageIdNameAt(0L, src); }
    public MemorySegment _messageIdNumberAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_messageIdNumber, index), LAYOUT_messageIdNumber); }
    public MemorySegment _messageIdNumber() { return _messageIdNumberAt(0L); }
    public VkDebugUtilsMessengerCallbackDataEXT _messageIdNumberAt(long index, MemorySegment src) { _messageIdNumberAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT _messageIdNumber(MemorySegment src) { return _messageIdNumberAt(0L, src); }
    public MemorySegment _pMessageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pMessage, index), LAYOUT_pMessage); }
    public MemorySegment _pMessage() { return _pMessageAt(0L); }
    public VkDebugUtilsMessengerCallbackDataEXT _pMessageAt(long index, MemorySegment src) { _pMessageAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT _pMessage(MemorySegment src) { return _pMessageAt(0L, src); }
    public MemorySegment _queueLabelCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueLabelCount, index), LAYOUT_queueLabelCount); }
    public MemorySegment _queueLabelCount() { return _queueLabelCountAt(0L); }
    public VkDebugUtilsMessengerCallbackDataEXT _queueLabelCountAt(long index, MemorySegment src) { _queueLabelCountAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT _queueLabelCount(MemorySegment src) { return _queueLabelCountAt(0L, src); }
    public MemorySegment _pQueueLabelsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pQueueLabels, index), LAYOUT_pQueueLabels); }
    public MemorySegment _pQueueLabels() { return _pQueueLabelsAt(0L); }
    public VkDebugUtilsMessengerCallbackDataEXT _pQueueLabelsAt(long index, MemorySegment src) { _pQueueLabelsAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT _pQueueLabels(MemorySegment src) { return _pQueueLabelsAt(0L, src); }
    public MemorySegment _cmdBufLabelCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cmdBufLabelCount, index), LAYOUT_cmdBufLabelCount); }
    public MemorySegment _cmdBufLabelCount() { return _cmdBufLabelCountAt(0L); }
    public VkDebugUtilsMessengerCallbackDataEXT _cmdBufLabelCountAt(long index, MemorySegment src) { _cmdBufLabelCountAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT _cmdBufLabelCount(MemorySegment src) { return _cmdBufLabelCountAt(0L, src); }
    public MemorySegment _pCmdBufLabelsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCmdBufLabels, index), LAYOUT_pCmdBufLabels); }
    public MemorySegment _pCmdBufLabels() { return _pCmdBufLabelsAt(0L); }
    public VkDebugUtilsMessengerCallbackDataEXT _pCmdBufLabelsAt(long index, MemorySegment src) { _pCmdBufLabelsAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT _pCmdBufLabels(MemorySegment src) { return _pCmdBufLabelsAt(0L, src); }
    public MemorySegment _objectCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_objectCount, index), LAYOUT_objectCount); }
    public MemorySegment _objectCount() { return _objectCountAt(0L); }
    public VkDebugUtilsMessengerCallbackDataEXT _objectCountAt(long index, MemorySegment src) { _objectCountAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT _objectCount(MemorySegment src) { return _objectCountAt(0L, src); }
    public MemorySegment _pObjectsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pObjects, index), LAYOUT_pObjects); }
    public MemorySegment _pObjects() { return _pObjectsAt(0L); }
    public VkDebugUtilsMessengerCallbackDataEXT _pObjectsAt(long index, MemorySegment src) { _pObjectsAt(index).copyFrom(src); return this; }
    public VkDebugUtilsMessengerCallbackDataEXT _pObjects(MemorySegment src) { return _pObjectsAt(0L, src); }
}
