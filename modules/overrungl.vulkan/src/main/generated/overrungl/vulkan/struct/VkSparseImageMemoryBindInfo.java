// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSparseImageMemoryBindInfo`.
/// ## Layout
/// ```
/// struct VkSparseImageMemoryBindInfo {
///     VkImage image;
///     uint32_t bindCount;
///     const VkSparseImageMemoryBind* pBinds;
/// }
/// ```
public final class VkSparseImageMemoryBindInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("image"),
        ValueLayout.JAVA_INT.withName("bindCount"),
        ValueLayout.ADDRESS.withName("pBinds")
    );
    public static final long OFFSET_image = LAYOUT.byteOffset(PathElement.groupElement("image"));
    public static final long OFFSET_bindCount = LAYOUT.byteOffset(PathElement.groupElement("bindCount"));
    public static final long OFFSET_pBinds = LAYOUT.byteOffset(PathElement.groupElement("pBinds"));
    public static final MemoryLayout LAYOUT_image = LAYOUT.select(PathElement.groupElement("image"));
    public static final MemoryLayout LAYOUT_bindCount = LAYOUT.select(PathElement.groupElement("bindCount"));
    public static final MemoryLayout LAYOUT_pBinds = LAYOUT.select(PathElement.groupElement("pBinds"));
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    public static final VarHandle VH_bindCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindCount"));
    public static final VarHandle VH_pBinds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBinds"));

    public VkSparseImageMemoryBindInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSparseImageMemoryBindInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageMemoryBindInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkSparseImageMemoryBindInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageMemoryBindInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSparseImageMemoryBindInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageMemoryBindInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSparseImageMemoryBindInfo alloc(SegmentAllocator allocator) { return new VkSparseImageMemoryBindInfo(allocator.allocate(LAYOUT), 1); }
    public static VkSparseImageMemoryBindInfo alloc(SegmentAllocator allocator, long count) { return new VkSparseImageMemoryBindInfo(allocator.allocate(LAYOUT, count), count); }
    public VkSparseImageMemoryBindInfo copyFrom(VkSparseImageMemoryBindInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSparseImageMemoryBindInfo reinterpret(long count) { return new VkSparseImageMemoryBindInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSparseImageMemoryBindInfo asSlice(long index) { return new VkSparseImageMemoryBindInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSparseImageMemoryBindInfo asSlice(long index, long count) { return new VkSparseImageMemoryBindInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSparseImageMemoryBindInfo at(long index, Consumer<VkSparseImageMemoryBindInfo> func) { func.accept(asSlice(index)); return this; }
    public long imageAt(long index) { return (long) VH_image.get(this.segment(), 0L, index); }
    public int bindCountAt(long index) { return (int) VH_bindCount.get(this.segment(), 0L, index); }
    public MemorySegment pBindsAt(long index) { return (MemorySegment) VH_pBinds.get(this.segment(), 0L, index); }
    public long image() { return (long) VH_image.get(this.segment(), 0L, 0L); }
    public int bindCount() { return (int) VH_bindCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pBinds() { return (MemorySegment) VH_pBinds.get(this.segment(), 0L, 0L); }
    public VkSparseImageMemoryBindInfo imageAt(long index, long value) { VH_image.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryBindInfo bindCountAt(long index, int value) { VH_bindCount.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryBindInfo pBindsAt(long index, MemorySegment value) { VH_pBinds.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryBindInfo image(long value) { VH_image.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryBindInfo bindCount(int value) { VH_bindCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryBindInfo pBinds(MemorySegment value) { VH_pBinds.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _imageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_image, index), LAYOUT_image); }
    public MemorySegment _image() { return _imageAt(0L); }
    public VkSparseImageMemoryBindInfo _imageAt(long index, MemorySegment src) { _imageAt(index).copyFrom(src); return this; }
    public VkSparseImageMemoryBindInfo _image(MemorySegment src) { return _imageAt(0L, src); }
    public MemorySegment _bindCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bindCount, index), LAYOUT_bindCount); }
    public MemorySegment _bindCount() { return _bindCountAt(0L); }
    public VkSparseImageMemoryBindInfo _bindCountAt(long index, MemorySegment src) { _bindCountAt(index).copyFrom(src); return this; }
    public VkSparseImageMemoryBindInfo _bindCount(MemorySegment src) { return _bindCountAt(0L, src); }
    public MemorySegment _pBindsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pBinds, index), LAYOUT_pBinds); }
    public MemorySegment _pBinds() { return _pBindsAt(0L); }
    public VkSparseImageMemoryBindInfo _pBindsAt(long index, MemorySegment src) { _pBindsAt(index).copyFrom(src); return this; }
    public VkSparseImageMemoryBindInfo _pBinds(MemorySegment src) { return _pBindsAt(0L, src); }
}
