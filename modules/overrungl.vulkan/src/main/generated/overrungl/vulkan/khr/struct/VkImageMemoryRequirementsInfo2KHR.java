// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageMemoryRequirementsInfo2KHR`.
/// ## Layout
/// ```
/// struct VkImageMemoryRequirementsInfo2KHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkImage image;
/// }
/// ```
public final class VkImageMemoryRequirementsInfo2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("image")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_image = LAYOUT.byteOffset(PathElement.groupElement("image"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_image = LAYOUT.select(PathElement.groupElement("image"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));

    public VkImageMemoryRequirementsInfo2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageMemoryRequirementsInfo2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageMemoryRequirementsInfo2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageMemoryRequirementsInfo2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageMemoryRequirementsInfo2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageMemoryRequirementsInfo2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageMemoryRequirementsInfo2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageMemoryRequirementsInfo2KHR alloc(SegmentAllocator allocator) { return new VkImageMemoryRequirementsInfo2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkImageMemoryRequirementsInfo2KHR alloc(SegmentAllocator allocator, long count) { return new VkImageMemoryRequirementsInfo2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkImageMemoryRequirementsInfo2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2); }
    public static VkImageMemoryRequirementsInfo2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2);
        return s;
    }
    public VkImageMemoryRequirementsInfo2KHR copyFrom(VkImageMemoryRequirementsInfo2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageMemoryRequirementsInfo2KHR reinterpret(long count) { return new VkImageMemoryRequirementsInfo2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageMemoryRequirementsInfo2KHR asSlice(long index) { return new VkImageMemoryRequirementsInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageMemoryRequirementsInfo2KHR asSlice(long index, long count) { return new VkImageMemoryRequirementsInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageMemoryRequirementsInfo2KHR at(long index, Consumer<VkImageMemoryRequirementsInfo2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long imageAt(long index) { return (long) VH_image.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long image() { return (long) VH_image.get(this.segment(), 0L, 0L); }
    public VkImageMemoryRequirementsInfo2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryRequirementsInfo2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryRequirementsInfo2KHR imageAt(long index, long value) { VH_image.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryRequirementsInfo2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageMemoryRequirementsInfo2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageMemoryRequirementsInfo2KHR image(long value) { VH_image.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageMemoryRequirementsInfo2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageMemoryRequirementsInfo2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageMemoryRequirementsInfo2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageMemoryRequirementsInfo2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_image, index), LAYOUT_image); }
    public MemorySegment _image() { return _imageAt(0L); }
    public VkImageMemoryRequirementsInfo2KHR _imageAt(long index, MemorySegment src) { _imageAt(index).copyFrom(src); return this; }
    public VkImageMemoryRequirementsInfo2KHR _image(MemorySegment src) { return _imageAt(0L, src); }
}
