// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImportMetalBufferInfoEXT`.
/// ## Layout
/// ```
/// struct VkImportMetalBufferInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     MTLBuffer_id mtlBuffer;
/// }
/// ```
public final class VkImportMetalBufferInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("mtlBuffer")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_mtlBuffer = LAYOUT.byteOffset(PathElement.groupElement("mtlBuffer"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_mtlBuffer = LAYOUT.select(PathElement.groupElement("mtlBuffer"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_mtlBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlBuffer"));

    public VkImportMetalBufferInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImportMetalBufferInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalBufferInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkImportMetalBufferInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalBufferInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImportMetalBufferInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalBufferInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImportMetalBufferInfoEXT alloc(SegmentAllocator allocator) { return new VkImportMetalBufferInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkImportMetalBufferInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImportMetalBufferInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkImportMetalBufferInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT); }
    public static VkImportMetalBufferInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT);
        return s;
    }
    public VkImportMetalBufferInfoEXT copyFrom(VkImportMetalBufferInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImportMetalBufferInfoEXT reinterpret(long count) { return new VkImportMetalBufferInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImportMetalBufferInfoEXT asSlice(long index) { return new VkImportMetalBufferInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImportMetalBufferInfoEXT asSlice(long index, long count) { return new VkImportMetalBufferInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImportMetalBufferInfoEXT at(long index, Consumer<VkImportMetalBufferInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment mtlBufferAt(long index) { return (MemorySegment) VH_mtlBuffer.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment mtlBuffer() { return (MemorySegment) VH_mtlBuffer.get(this.segment(), 0L, 0L); }
    public VkImportMetalBufferInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImportMetalBufferInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImportMetalBufferInfoEXT mtlBufferAt(long index, MemorySegment value) { VH_mtlBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkImportMetalBufferInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMetalBufferInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMetalBufferInfoEXT mtlBuffer(MemorySegment value) { VH_mtlBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImportMetalBufferInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImportMetalBufferInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImportMetalBufferInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImportMetalBufferInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _mtlBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mtlBuffer, index), LAYOUT_mtlBuffer); }
    public MemorySegment _mtlBuffer() { return _mtlBufferAt(0L); }
    public VkImportMetalBufferInfoEXT _mtlBufferAt(long index, MemorySegment src) { _mtlBufferAt(index).copyFrom(src); return this; }
    public VkImportMetalBufferInfoEXT _mtlBuffer(MemorySegment src) { return _mtlBufferAt(0L, src); }
}
