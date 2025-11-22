// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkOpaqueCaptureDescriptorDataCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkOpaqueCaptureDescriptorDataCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     const void* opaqueCaptureDescriptorData;
/// }
/// ```
public final class VkOpaqueCaptureDescriptorDataCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("opaqueCaptureDescriptorData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_opaqueCaptureDescriptorData = LAYOUT.byteOffset(PathElement.groupElement("opaqueCaptureDescriptorData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_opaqueCaptureDescriptorData = LAYOUT.select(PathElement.groupElement("opaqueCaptureDescriptorData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_opaqueCaptureDescriptorData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("opaqueCaptureDescriptorData"));

    public VkOpaqueCaptureDescriptorDataCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpaqueCaptureDescriptorDataCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpaqueCaptureDescriptorDataCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpaqueCaptureDescriptorDataCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT); }
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT);
        return s;
    }
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT copyFrom(VkOpaqueCaptureDescriptorDataCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT reinterpret(long count) { return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT asSlice(long index) { return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT asSlice(long index, long count) { return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT at(long index, Consumer<VkOpaqueCaptureDescriptorDataCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment opaqueCaptureDescriptorDataAt(long index) { return (MemorySegment) VH_opaqueCaptureDescriptorData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment opaqueCaptureDescriptorData() { return (MemorySegment) VH_opaqueCaptureDescriptorData.get(this.segment(), 0L, 0L); }
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT opaqueCaptureDescriptorDataAt(long index, MemorySegment value) { VH_opaqueCaptureDescriptorData.set(this.segment(), 0L, index, value); return this; }
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT opaqueCaptureDescriptorData(MemorySegment value) { VH_opaqueCaptureDescriptorData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _opaqueCaptureDescriptorDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_opaqueCaptureDescriptorData, index), LAYOUT_opaqueCaptureDescriptorData); }
    public MemorySegment _opaqueCaptureDescriptorData() { return _opaqueCaptureDescriptorDataAt(0L); }
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT _opaqueCaptureDescriptorDataAt(long index, MemorySegment src) { _opaqueCaptureDescriptorDataAt(index).copyFrom(src); return this; }
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT _opaqueCaptureDescriptorData(MemorySegment src) { return _opaqueCaptureDescriptorDataAt(0L, src); }
}
