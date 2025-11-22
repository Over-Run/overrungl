// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSamplerCaptureDescriptorDataInfoEXT`.
/// ## Layout
/// ```
/// struct VkSamplerCaptureDescriptorDataInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkSampler sampler;
/// }
/// ```
public final class VkSamplerCaptureDescriptorDataInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("sampler")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_sampler = LAYOUT.byteOffset(PathElement.groupElement("sampler"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_sampler = LAYOUT.select(PathElement.groupElement("sampler"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_sampler = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampler"));

    public VkSamplerCaptureDescriptorDataInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSamplerCaptureDescriptorDataInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCaptureDescriptorDataInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSamplerCaptureDescriptorDataInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCaptureDescriptorDataInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSamplerCaptureDescriptorDataInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCaptureDescriptorDataInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSamplerCaptureDescriptorDataInfoEXT alloc(SegmentAllocator allocator) { return new VkSamplerCaptureDescriptorDataInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSamplerCaptureDescriptorDataInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSamplerCaptureDescriptorDataInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSamplerCaptureDescriptorDataInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT); }
    public static VkSamplerCaptureDescriptorDataInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT);
        return s;
    }
    public VkSamplerCaptureDescriptorDataInfoEXT copyFrom(VkSamplerCaptureDescriptorDataInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSamplerCaptureDescriptorDataInfoEXT reinterpret(long count) { return new VkSamplerCaptureDescriptorDataInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSamplerCaptureDescriptorDataInfoEXT asSlice(long index) { return new VkSamplerCaptureDescriptorDataInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSamplerCaptureDescriptorDataInfoEXT asSlice(long index, long count) { return new VkSamplerCaptureDescriptorDataInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSamplerCaptureDescriptorDataInfoEXT at(long index, Consumer<VkSamplerCaptureDescriptorDataInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long samplerAt(long index) { return (long) VH_sampler.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long sampler() { return (long) VH_sampler.get(this.segment(), 0L, 0L); }
    public VkSamplerCaptureDescriptorDataInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCaptureDescriptorDataInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCaptureDescriptorDataInfoEXT samplerAt(long index, long value) { VH_sampler.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCaptureDescriptorDataInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCaptureDescriptorDataInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCaptureDescriptorDataInfoEXT sampler(long value) { VH_sampler.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSamplerCaptureDescriptorDataInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSamplerCaptureDescriptorDataInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSamplerCaptureDescriptorDataInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSamplerCaptureDescriptorDataInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _samplerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampler, index), LAYOUT_sampler); }
    public MemorySegment _sampler() { return _samplerAt(0L); }
    public VkSamplerCaptureDescriptorDataInfoEXT _samplerAt(long index, MemorySegment src) { _samplerAt(index).copyFrom(src); return this; }
    public VkSamplerCaptureDescriptorDataInfoEXT _sampler(MemorySegment src) { return _samplerAt(0L, src); }
}
