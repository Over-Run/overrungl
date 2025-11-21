// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorImageInfo`.
/// ## Layout
/// ```
/// struct VkDescriptorImageInfo {
///     VkSampler sampler;
///     VkImageView imageView;
///     VkImageLayout imageLayout;
/// }
/// ```
public final class VkDescriptorImageInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("sampler"),
        ValueLayout.JAVA_LONG.withName("imageView"),
        ValueLayout.JAVA_INT.withName("imageLayout")
    );
    public static final long OFFSET_sampler = LAYOUT.byteOffset(PathElement.groupElement("sampler"));
    public static final long OFFSET_imageView = LAYOUT.byteOffset(PathElement.groupElement("imageView"));
    public static final long OFFSET_imageLayout = LAYOUT.byteOffset(PathElement.groupElement("imageLayout"));
    public static final MemoryLayout LAYOUT_sampler = LAYOUT.select(PathElement.groupElement("sampler"));
    public static final MemoryLayout LAYOUT_imageView = LAYOUT.select(PathElement.groupElement("imageView"));
    public static final MemoryLayout LAYOUT_imageLayout = LAYOUT.select(PathElement.groupElement("imageLayout"));
    public static final VarHandle VH_sampler = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampler"));
    public static final VarHandle VH_imageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView"));
    public static final VarHandle VH_imageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageLayout"));

    public VkDescriptorImageInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorImageInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorImageInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorImageInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorImageInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorImageInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorImageInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorImageInfo alloc(SegmentAllocator allocator) { return new VkDescriptorImageInfo(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorImageInfo alloc(SegmentAllocator allocator, long count) { return new VkDescriptorImageInfo(allocator.allocate(LAYOUT, count), count); }
    public VkDescriptorImageInfo copyFrom(VkDescriptorImageInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorImageInfo reinterpret(long count) { return new VkDescriptorImageInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorImageInfo asSlice(long index) { return new VkDescriptorImageInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorImageInfo asSlice(long index, long count) { return new VkDescriptorImageInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorImageInfo at(long index, Consumer<VkDescriptorImageInfo> func) { func.accept(asSlice(index)); return this; }
    public long samplerAt(long index) { return (long) VH_sampler.get(this.segment(), 0L, index); }
    public long imageViewAt(long index) { return (long) VH_imageView.get(this.segment(), 0L, index); }
    public int imageLayoutAt(long index) { return (int) VH_imageLayout.get(this.segment(), 0L, index); }
    public long sampler() { return (long) VH_sampler.get(this.segment(), 0L, 0L); }
    public long imageView() { return (long) VH_imageView.get(this.segment(), 0L, 0L); }
    public int imageLayout() { return (int) VH_imageLayout.get(this.segment(), 0L, 0L); }
    public VkDescriptorImageInfo samplerAt(long index, long value) { VH_sampler.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorImageInfo imageViewAt(long index, long value) { VH_imageView.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorImageInfo imageLayoutAt(long index, int value) { VH_imageLayout.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorImageInfo sampler(long value) { VH_sampler.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorImageInfo imageView(long value) { VH_imageView.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorImageInfo imageLayout(int value) { VH_imageLayout.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _samplerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampler, index), LAYOUT_sampler); }
    public MemorySegment _sampler() { return _samplerAt(0L); }
    public VkDescriptorImageInfo _samplerAt(long index, MemorySegment src) { _samplerAt(index).copyFrom(src); return this; }
    public VkDescriptorImageInfo _sampler(MemorySegment src) { return _samplerAt(0L, src); }
    public MemorySegment _imageViewAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageView, index), LAYOUT_imageView); }
    public MemorySegment _imageView() { return _imageViewAt(0L); }
    public VkDescriptorImageInfo _imageViewAt(long index, MemorySegment src) { _imageViewAt(index).copyFrom(src); return this; }
    public VkDescriptorImageInfo _imageView(MemorySegment src) { return _imageViewAt(0L, src); }
    public MemorySegment _imageLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageLayout, index), LAYOUT_imageLayout); }
    public MemorySegment _imageLayout() { return _imageLayoutAt(0L); }
    public VkDescriptorImageInfo _imageLayoutAt(long index, MemorySegment src) { _imageLayoutAt(index).copyFrom(src); return this; }
    public VkDescriptorImageInfo _imageLayout(MemorySegment src) { return _imageLayoutAt(0L, src); }
}
