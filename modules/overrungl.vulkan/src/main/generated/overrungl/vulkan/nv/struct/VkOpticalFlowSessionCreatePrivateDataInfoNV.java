// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkOpticalFlowSessionCreatePrivateDataInfoNV`.
/// ## Layout
/// ```
/// struct VkOpticalFlowSessionCreatePrivateDataInfoNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t id;
///     uint32_t size;
///     const void* pPrivateData;
/// }
/// ```
public final class VkOpticalFlowSessionCreatePrivateDataInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("id"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.ADDRESS.withName("pPrivateData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_id = LAYOUT.byteOffset(PathElement.groupElement("id"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final long OFFSET_pPrivateData = LAYOUT.byteOffset(PathElement.groupElement("pPrivateData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_id = LAYOUT.select(PathElement.groupElement("id"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_pPrivateData = LAYOUT.select(PathElement.groupElement("pPrivateData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("id"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    public static final VarHandle VH_pPrivateData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPrivateData"));

    public VkOpticalFlowSessionCreatePrivateDataInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowSessionCreatePrivateDataInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowSessionCreatePrivateDataInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowSessionCreatePrivateDataInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV alloc(SegmentAllocator allocator) { return new VkOpticalFlowSessionCreatePrivateDataInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV alloc(SegmentAllocator allocator, long count) { return new VkOpticalFlowSessionCreatePrivateDataInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV); }
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV);
        return s;
    }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV copyFrom(VkOpticalFlowSessionCreatePrivateDataInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV reinterpret(long count) { return new VkOpticalFlowSessionCreatePrivateDataInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV asSlice(long index) { return new VkOpticalFlowSessionCreatePrivateDataInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV asSlice(long index, long count) { return new VkOpticalFlowSessionCreatePrivateDataInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV at(long index, Consumer<VkOpticalFlowSessionCreatePrivateDataInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int idAt(long index) { return (int) VH_id.get(this.segment(), 0L, index); }
    public int sizeAt(long index) { return (int) VH_size.get(this.segment(), 0L, index); }
    public MemorySegment pPrivateDataAt(long index) { return (MemorySegment) VH_pPrivateData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int id() { return (int) VH_id.get(this.segment(), 0L, 0L); }
    public int size() { return (int) VH_size.get(this.segment(), 0L, 0L); }
    public MemorySegment pPrivateData() { return (MemorySegment) VH_pPrivateData.get(this.segment(), 0L, 0L); }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV idAt(long index, int value) { VH_id.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV sizeAt(long index, int value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV pPrivateDataAt(long index, MemorySegment value) { VH_pPrivateData.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV id(int value) { VH_id.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV size(int value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV pPrivateData(MemorySegment value) { VH_pPrivateData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _idAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_id, index), LAYOUT_id); }
    public MemorySegment _id() { return _idAt(0L); }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV _idAt(long index, MemorySegment src) { _idAt(index).copyFrom(src); return this; }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV _id(MemorySegment src) { return _idAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV _size(MemorySegment src) { return _sizeAt(0L, src); }
    public MemorySegment _pPrivateDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPrivateData, index), LAYOUT_pPrivateData); }
    public MemorySegment _pPrivateData() { return _pPrivateDataAt(0L); }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV _pPrivateDataAt(long index, MemorySegment src) { _pPrivateDataAt(index).copyFrom(src); return this; }
    public VkOpticalFlowSessionCreatePrivateDataInfoNV _pPrivateData(MemorySegment src) { return _pPrivateDataAt(0L, src); }
}
