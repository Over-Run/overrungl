// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDebugUtilsObjectNameInfoEXT`.
/// ## Layout
/// ```
/// struct VkDebugUtilsObjectNameInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkObjectType objectType;
///     uint64_t objectHandle;
///     const char* pObjectName;
/// }
/// ```
public final class VkDebugUtilsObjectNameInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("objectHandle"),
        ValueLayout.ADDRESS.withName("pObjectName")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_objectType = LAYOUT.byteOffset(PathElement.groupElement("objectType"));
    public static final long OFFSET_objectHandle = LAYOUT.byteOffset(PathElement.groupElement("objectHandle"));
    public static final long OFFSET_pObjectName = LAYOUT.byteOffset(PathElement.groupElement("pObjectName"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_objectType = LAYOUT.select(PathElement.groupElement("objectType"));
    public static final MemoryLayout LAYOUT_objectHandle = LAYOUT.select(PathElement.groupElement("objectHandle"));
    public static final MemoryLayout LAYOUT_pObjectName = LAYOUT.select(PathElement.groupElement("pObjectName"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_objectType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectType"));
    public static final VarHandle VH_objectHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectHandle"));
    public static final VarHandle VH_pObjectName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pObjectName"));

    public VkDebugUtilsObjectNameInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDebugUtilsObjectNameInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsObjectNameInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDebugUtilsObjectNameInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsObjectNameInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDebugUtilsObjectNameInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsObjectNameInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDebugUtilsObjectNameInfoEXT alloc(SegmentAllocator allocator) { return new VkDebugUtilsObjectNameInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDebugUtilsObjectNameInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDebugUtilsObjectNameInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDebugUtilsObjectNameInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT); }
    public static VkDebugUtilsObjectNameInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT);
        return s;
    }
    public VkDebugUtilsObjectNameInfoEXT copyFrom(VkDebugUtilsObjectNameInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDebugUtilsObjectNameInfoEXT reinterpret(long count) { return new VkDebugUtilsObjectNameInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDebugUtilsObjectNameInfoEXT asSlice(long index) { return new VkDebugUtilsObjectNameInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDebugUtilsObjectNameInfoEXT asSlice(long index, long count) { return new VkDebugUtilsObjectNameInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDebugUtilsObjectNameInfoEXT at(long index, Consumer<VkDebugUtilsObjectNameInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int objectTypeAt(long index) { return (int) VH_objectType.get(this.segment(), 0L, index); }
    public long objectHandleAt(long index) { return (long) VH_objectHandle.get(this.segment(), 0L, index); }
    public MemorySegment pObjectNameAt(long index) { return (MemorySegment) VH_pObjectName.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int objectType() { return (int) VH_objectType.get(this.segment(), 0L, 0L); }
    public long objectHandle() { return (long) VH_objectHandle.get(this.segment(), 0L, 0L); }
    public MemorySegment pObjectName() { return (MemorySegment) VH_pObjectName.get(this.segment(), 0L, 0L); }
    public VkDebugUtilsObjectNameInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsObjectNameInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsObjectNameInfoEXT objectTypeAt(long index, int value) { VH_objectType.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsObjectNameInfoEXT objectHandleAt(long index, long value) { VH_objectHandle.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsObjectNameInfoEXT pObjectNameAt(long index, MemorySegment value) { VH_pObjectName.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsObjectNameInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsObjectNameInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsObjectNameInfoEXT objectType(int value) { VH_objectType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsObjectNameInfoEXT objectHandle(long value) { VH_objectHandle.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsObjectNameInfoEXT pObjectName(MemorySegment value) { VH_pObjectName.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDebugUtilsObjectNameInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDebugUtilsObjectNameInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDebugUtilsObjectNameInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDebugUtilsObjectNameInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _objectTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_objectType, index), LAYOUT_objectType); }
    public MemorySegment _objectType() { return _objectTypeAt(0L); }
    public VkDebugUtilsObjectNameInfoEXT _objectTypeAt(long index, MemorySegment src) { _objectTypeAt(index).copyFrom(src); return this; }
    public VkDebugUtilsObjectNameInfoEXT _objectType(MemorySegment src) { return _objectTypeAt(0L, src); }
    public MemorySegment _objectHandleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_objectHandle, index), LAYOUT_objectHandle); }
    public MemorySegment _objectHandle() { return _objectHandleAt(0L); }
    public VkDebugUtilsObjectNameInfoEXT _objectHandleAt(long index, MemorySegment src) { _objectHandleAt(index).copyFrom(src); return this; }
    public VkDebugUtilsObjectNameInfoEXT _objectHandle(MemorySegment src) { return _objectHandleAt(0L, src); }
    public MemorySegment _pObjectNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pObjectName, index), LAYOUT_pObjectName); }
    public MemorySegment _pObjectName() { return _pObjectNameAt(0L); }
    public VkDebugUtilsObjectNameInfoEXT _pObjectNameAt(long index, MemorySegment src) { _pObjectNameAt(index).copyFrom(src); return this; }
    public VkDebugUtilsObjectNameInfoEXT _pObjectName(MemorySegment src) { return _pObjectNameAt(0L, src); }
}
