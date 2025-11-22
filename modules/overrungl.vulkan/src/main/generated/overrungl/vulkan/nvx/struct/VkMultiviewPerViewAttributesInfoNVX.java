// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nvx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMultiviewPerViewAttributesInfoNVX`.
/// ## Layout
/// ```
/// struct VkMultiviewPerViewAttributesInfoNVX {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 perViewAttributes;
///     VkBool32 perViewAttributesPositionXOnly;
/// }
/// ```
public final class VkMultiviewPerViewAttributesInfoNVX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("perViewAttributes"),
        ValueLayout.JAVA_INT.withName("perViewAttributesPositionXOnly")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_perViewAttributes = LAYOUT.byteOffset(PathElement.groupElement("perViewAttributes"));
    public static final long OFFSET_perViewAttributesPositionXOnly = LAYOUT.byteOffset(PathElement.groupElement("perViewAttributesPositionXOnly"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_perViewAttributes = LAYOUT.select(PathElement.groupElement("perViewAttributes"));
    public static final MemoryLayout LAYOUT_perViewAttributesPositionXOnly = LAYOUT.select(PathElement.groupElement("perViewAttributesPositionXOnly"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_perViewAttributes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("perViewAttributes"));
    public static final VarHandle VH_perViewAttributesPositionXOnly = LAYOUT.arrayElementVarHandle(PathElement.groupElement("perViewAttributesPositionXOnly"));

    public VkMultiviewPerViewAttributesInfoNVX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMultiviewPerViewAttributesInfoNVX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultiviewPerViewAttributesInfoNVX(segment, estimateCount(segment, LAYOUT)); }
    public static VkMultiviewPerViewAttributesInfoNVX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultiviewPerViewAttributesInfoNVX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMultiviewPerViewAttributesInfoNVX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultiviewPerViewAttributesInfoNVX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMultiviewPerViewAttributesInfoNVX alloc(SegmentAllocator allocator) { return new VkMultiviewPerViewAttributesInfoNVX(allocator.allocate(LAYOUT), 1); }
    public static VkMultiviewPerViewAttributesInfoNVX alloc(SegmentAllocator allocator, long count) { return new VkMultiviewPerViewAttributesInfoNVX(allocator.allocate(LAYOUT, count), count); }
    public static VkMultiviewPerViewAttributesInfoNVX allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nvx.VKNVXMultiviewPerViewAttributes.VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX); }
    public static VkMultiviewPerViewAttributesInfoNVX allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nvx.VKNVXMultiviewPerViewAttributes.VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX);
        return s;
    }
    public VkMultiviewPerViewAttributesInfoNVX copyFrom(VkMultiviewPerViewAttributesInfoNVX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMultiviewPerViewAttributesInfoNVX reinterpret(long count) { return new VkMultiviewPerViewAttributesInfoNVX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMultiviewPerViewAttributesInfoNVX asSlice(long index) { return new VkMultiviewPerViewAttributesInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMultiviewPerViewAttributesInfoNVX asSlice(long index, long count) { return new VkMultiviewPerViewAttributesInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMultiviewPerViewAttributesInfoNVX at(long index, Consumer<VkMultiviewPerViewAttributesInfoNVX> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int perViewAttributesAt(long index) { return (int) VH_perViewAttributes.get(this.segment(), 0L, index); }
    public int perViewAttributesPositionXOnlyAt(long index) { return (int) VH_perViewAttributesPositionXOnly.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int perViewAttributes() { return (int) VH_perViewAttributes.get(this.segment(), 0L, 0L); }
    public int perViewAttributesPositionXOnly() { return (int) VH_perViewAttributesPositionXOnly.get(this.segment(), 0L, 0L); }
    public VkMultiviewPerViewAttributesInfoNVX sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMultiviewPerViewAttributesInfoNVX pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMultiviewPerViewAttributesInfoNVX perViewAttributesAt(long index, int value) { VH_perViewAttributes.set(this.segment(), 0L, index, value); return this; }
    public VkMultiviewPerViewAttributesInfoNVX perViewAttributesPositionXOnlyAt(long index, int value) { VH_perViewAttributesPositionXOnly.set(this.segment(), 0L, index, value); return this; }
    public VkMultiviewPerViewAttributesInfoNVX sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMultiviewPerViewAttributesInfoNVX pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMultiviewPerViewAttributesInfoNVX perViewAttributes(int value) { VH_perViewAttributes.set(this.segment(), 0L, 0L, value); return this; }
    public VkMultiviewPerViewAttributesInfoNVX perViewAttributesPositionXOnly(int value) { VH_perViewAttributesPositionXOnly.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMultiviewPerViewAttributesInfoNVX _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMultiviewPerViewAttributesInfoNVX _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMultiviewPerViewAttributesInfoNVX _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMultiviewPerViewAttributesInfoNVX _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _perViewAttributesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_perViewAttributes, index), LAYOUT_perViewAttributes); }
    public MemorySegment _perViewAttributes() { return _perViewAttributesAt(0L); }
    public VkMultiviewPerViewAttributesInfoNVX _perViewAttributesAt(long index, MemorySegment src) { _perViewAttributesAt(index).copyFrom(src); return this; }
    public VkMultiviewPerViewAttributesInfoNVX _perViewAttributes(MemorySegment src) { return _perViewAttributesAt(0L, src); }
    public MemorySegment _perViewAttributesPositionXOnlyAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_perViewAttributesPositionXOnly, index), LAYOUT_perViewAttributesPositionXOnly); }
    public MemorySegment _perViewAttributesPositionXOnly() { return _perViewAttributesPositionXOnlyAt(0L); }
    public VkMultiviewPerViewAttributesInfoNVX _perViewAttributesPositionXOnlyAt(long index, MemorySegment src) { _perViewAttributesPositionXOnlyAt(index).copyFrom(src); return this; }
    public VkMultiviewPerViewAttributesInfoNVX _perViewAttributesPositionXOnly(MemorySegment src) { return _perViewAttributesPositionXOnlyAt(0L, src); }
}
