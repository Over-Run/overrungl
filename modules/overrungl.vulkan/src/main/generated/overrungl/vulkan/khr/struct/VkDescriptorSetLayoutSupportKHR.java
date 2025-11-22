// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorSetLayoutSupportKHR`.
/// ## Layout
/// ```
/// struct VkDescriptorSetLayoutSupportKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 supported;
/// }
/// ```
public final class VkDescriptorSetLayoutSupportKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supported")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_supported = LAYOUT.byteOffset(PathElement.groupElement("supported"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_supported = LAYOUT.select(PathElement.groupElement("supported"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_supported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supported"));

    public VkDescriptorSetLayoutSupportKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorSetLayoutSupportKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutSupportKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorSetLayoutSupportKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutSupportKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorSetLayoutSupportKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutSupportKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorSetLayoutSupportKHR alloc(SegmentAllocator allocator) { return new VkDescriptorSetLayoutSupportKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorSetLayoutSupportKHR alloc(SegmentAllocator allocator, long count) { return new VkDescriptorSetLayoutSupportKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkDescriptorSetLayoutSupportKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT); }
    public static VkDescriptorSetLayoutSupportKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT);
        return s;
    }
    public VkDescriptorSetLayoutSupportKHR copyFrom(VkDescriptorSetLayoutSupportKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorSetLayoutSupportKHR reinterpret(long count) { return new VkDescriptorSetLayoutSupportKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorSetLayoutSupportKHR asSlice(long index) { return new VkDescriptorSetLayoutSupportKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorSetLayoutSupportKHR asSlice(long index, long count) { return new VkDescriptorSetLayoutSupportKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorSetLayoutSupportKHR at(long index, Consumer<VkDescriptorSetLayoutSupportKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int supportedAt(long index) { return (int) VH_supported.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int supported() { return (int) VH_supported.get(this.segment(), 0L, 0L); }
    public VkDescriptorSetLayoutSupportKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutSupportKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutSupportKHR supportedAt(long index, int value) { VH_supported.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutSupportKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetLayoutSupportKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetLayoutSupportKHR supported(int value) { VH_supported.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDescriptorSetLayoutSupportKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutSupportKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDescriptorSetLayoutSupportKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutSupportKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _supportedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supported, index), LAYOUT_supported); }
    public MemorySegment _supported() { return _supportedAt(0L); }
    public VkDescriptorSetLayoutSupportKHR _supportedAt(long index, MemorySegment src) { _supportedAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutSupportKHR _supported(MemorySegment src) { return _supportedAt(0L, src); }
}
