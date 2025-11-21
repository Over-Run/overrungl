// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoFormatPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoFormatPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkFormat format;
///     VkComponentMapping componentMapping;
///     VkImageCreateFlags imageCreateFlags;
///     VkImageType imageType;
///     VkImageTiling imageTiling;
///     VkImageUsageFlags imageUsageFlags;
/// }
/// ```
public final class VkVideoFormatPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        overrungl.vulkan.struct.VkComponentMapping.LAYOUT.withName("componentMapping"),
        ValueLayout.JAVA_INT.withName("imageCreateFlags"),
        ValueLayout.JAVA_INT.withName("imageType"),
        ValueLayout.JAVA_INT.withName("imageTiling"),
        ValueLayout.JAVA_INT.withName("imageUsageFlags")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final long OFFSET_componentMapping = LAYOUT.byteOffset(PathElement.groupElement("componentMapping"));
    public static final long OFFSET_imageCreateFlags = LAYOUT.byteOffset(PathElement.groupElement("imageCreateFlags"));
    public static final long OFFSET_imageType = LAYOUT.byteOffset(PathElement.groupElement("imageType"));
    public static final long OFFSET_imageTiling = LAYOUT.byteOffset(PathElement.groupElement("imageTiling"));
    public static final long OFFSET_imageUsageFlags = LAYOUT.byteOffset(PathElement.groupElement("imageUsageFlags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_componentMapping = LAYOUT.select(PathElement.groupElement("componentMapping"));
    public static final MemoryLayout LAYOUT_imageCreateFlags = LAYOUT.select(PathElement.groupElement("imageCreateFlags"));
    public static final MemoryLayout LAYOUT_imageType = LAYOUT.select(PathElement.groupElement("imageType"));
    public static final MemoryLayout LAYOUT_imageTiling = LAYOUT.select(PathElement.groupElement("imageTiling"));
    public static final MemoryLayout LAYOUT_imageUsageFlags = LAYOUT.select(PathElement.groupElement("imageUsageFlags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    public static final VarHandle VH_componentMapping$r = LAYOUT.arrayElementVarHandle(PathElement.groupElement("componentMapping"), PathElement.groupElement("r"));
    public static final VarHandle VH_componentMapping$g = LAYOUT.arrayElementVarHandle(PathElement.groupElement("componentMapping"), PathElement.groupElement("g"));
    public static final VarHandle VH_componentMapping$b = LAYOUT.arrayElementVarHandle(PathElement.groupElement("componentMapping"), PathElement.groupElement("b"));
    public static final VarHandle VH_componentMapping$a = LAYOUT.arrayElementVarHandle(PathElement.groupElement("componentMapping"), PathElement.groupElement("a"));
    public static final VarHandle VH_imageCreateFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateFlags"));
    public static final VarHandle VH_imageType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageType"));
    public static final VarHandle VH_imageTiling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageTiling"));
    public static final VarHandle VH_imageUsageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageUsageFlags"));

    public VkVideoFormatPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoFormatPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoFormatPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoFormatPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoFormatPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoFormatPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoFormatPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoFormatPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoFormatPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR); }
    public static VkVideoFormatPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR);
        return s;
    }
    public VkVideoFormatPropertiesKHR copyFrom(VkVideoFormatPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoFormatPropertiesKHR reinterpret(long count) { return new VkVideoFormatPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoFormatPropertiesKHR asSlice(long index) { return new VkVideoFormatPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoFormatPropertiesKHR asSlice(long index, long count) { return new VkVideoFormatPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoFormatPropertiesKHR at(long index, Consumer<VkVideoFormatPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public int componentMapping$rAt(long index) { return (int) VH_componentMapping$r.get(this.segment(), 0L, index); }
    public int componentMapping$gAt(long index) { return (int) VH_componentMapping$g.get(this.segment(), 0L, index); }
    public int componentMapping$bAt(long index) { return (int) VH_componentMapping$b.get(this.segment(), 0L, index); }
    public int componentMapping$aAt(long index) { return (int) VH_componentMapping$a.get(this.segment(), 0L, index); }
    public int imageCreateFlagsAt(long index) { return (int) VH_imageCreateFlags.get(this.segment(), 0L, index); }
    public int imageTypeAt(long index) { return (int) VH_imageType.get(this.segment(), 0L, index); }
    public int imageTilingAt(long index) { return (int) VH_imageTiling.get(this.segment(), 0L, index); }
    public int imageUsageFlagsAt(long index) { return (int) VH_imageUsageFlags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public int componentMapping$r() { return (int) VH_componentMapping$r.get(this.segment(), 0L, 0L); }
    public int componentMapping$g() { return (int) VH_componentMapping$g.get(this.segment(), 0L, 0L); }
    public int componentMapping$b() { return (int) VH_componentMapping$b.get(this.segment(), 0L, 0L); }
    public int componentMapping$a() { return (int) VH_componentMapping$a.get(this.segment(), 0L, 0L); }
    public int imageCreateFlags() { return (int) VH_imageCreateFlags.get(this.segment(), 0L, 0L); }
    public int imageType() { return (int) VH_imageType.get(this.segment(), 0L, 0L); }
    public int imageTiling() { return (int) VH_imageTiling.get(this.segment(), 0L, 0L); }
    public int imageUsageFlags() { return (int) VH_imageUsageFlags.get(this.segment(), 0L, 0L); }
    public VkVideoFormatPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatPropertiesKHR formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatPropertiesKHR componentMapping$rAt(long index, int value) { VH_componentMapping$r.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatPropertiesKHR componentMapping$gAt(long index, int value) { VH_componentMapping$g.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatPropertiesKHR componentMapping$bAt(long index, int value) { VH_componentMapping$b.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatPropertiesKHR componentMapping$aAt(long index, int value) { VH_componentMapping$a.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatPropertiesKHR imageCreateFlagsAt(long index, int value) { VH_imageCreateFlags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatPropertiesKHR imageTypeAt(long index, int value) { VH_imageType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatPropertiesKHR imageTilingAt(long index, int value) { VH_imageTiling.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatPropertiesKHR imageUsageFlagsAt(long index, int value) { VH_imageUsageFlags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoFormatPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoFormatPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoFormatPropertiesKHR format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoFormatPropertiesKHR componentMapping$r(int value) { VH_componentMapping$r.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoFormatPropertiesKHR componentMapping$g(int value) { VH_componentMapping$g.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoFormatPropertiesKHR componentMapping$b(int value) { VH_componentMapping$b.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoFormatPropertiesKHR componentMapping$a(int value) { VH_componentMapping$a.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoFormatPropertiesKHR imageCreateFlags(int value) { VH_imageCreateFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoFormatPropertiesKHR imageType(int value) { VH_imageType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoFormatPropertiesKHR imageTiling(int value) { VH_imageTiling.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoFormatPropertiesKHR imageUsageFlags(int value) { VH_imageUsageFlags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoFormatPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoFormatPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoFormatPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoFormatPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkVideoFormatPropertiesKHR _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkVideoFormatPropertiesKHR _format(MemorySegment src) { return _formatAt(0L, src); }
    public MemorySegment _componentMappingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_componentMapping, index), LAYOUT_componentMapping); }
    public MemorySegment _componentMapping() { return _componentMappingAt(0L); }
    public VkVideoFormatPropertiesKHR _componentMappingAt(long index, MemorySegment src) { _componentMappingAt(index).copyFrom(src); return this; }
    public VkVideoFormatPropertiesKHR _componentMapping(MemorySegment src) { return _componentMappingAt(0L, src); }
    public MemorySegment _imageCreateFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageCreateFlags, index), LAYOUT_imageCreateFlags); }
    public MemorySegment _imageCreateFlags() { return _imageCreateFlagsAt(0L); }
    public VkVideoFormatPropertiesKHR _imageCreateFlagsAt(long index, MemorySegment src) { _imageCreateFlagsAt(index).copyFrom(src); return this; }
    public VkVideoFormatPropertiesKHR _imageCreateFlags(MemorySegment src) { return _imageCreateFlagsAt(0L, src); }
    public MemorySegment _imageTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageType, index), LAYOUT_imageType); }
    public MemorySegment _imageType() { return _imageTypeAt(0L); }
    public VkVideoFormatPropertiesKHR _imageTypeAt(long index, MemorySegment src) { _imageTypeAt(index).copyFrom(src); return this; }
    public VkVideoFormatPropertiesKHR _imageType(MemorySegment src) { return _imageTypeAt(0L, src); }
    public MemorySegment _imageTilingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageTiling, index), LAYOUT_imageTiling); }
    public MemorySegment _imageTiling() { return _imageTilingAt(0L); }
    public VkVideoFormatPropertiesKHR _imageTilingAt(long index, MemorySegment src) { _imageTilingAt(index).copyFrom(src); return this; }
    public VkVideoFormatPropertiesKHR _imageTiling(MemorySegment src) { return _imageTilingAt(0L, src); }
    public MemorySegment _imageUsageFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageUsageFlags, index), LAYOUT_imageUsageFlags); }
    public MemorySegment _imageUsageFlags() { return _imageUsageFlagsAt(0L); }
    public VkVideoFormatPropertiesKHR _imageUsageFlagsAt(long index, MemorySegment src) { _imageUsageFlagsAt(index).copyFrom(src); return this; }
    public VkVideoFormatPropertiesKHR _imageUsageFlags(MemorySegment src) { return _imageUsageFlagsAt(0L, src); }
}
