// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSubpassDependency2`.
/// ## Layout
/// ```
/// struct VkSubpassDependency2 {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t srcSubpass;
///     uint32_t dstSubpass;
///     VkPipelineStageFlags srcStageMask;
///     VkPipelineStageFlags dstStageMask;
///     VkAccessFlags srcAccessMask;
///     VkAccessFlags dstAccessMask;
///     VkDependencyFlags dependencyFlags;
///     int32_t viewOffset;
/// }
/// ```
public final class VkSubpassDependency2 extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("srcSubpass"),
        ValueLayout.JAVA_INT.withName("dstSubpass"),
        ValueLayout.JAVA_INT.withName("srcStageMask"),
        ValueLayout.JAVA_INT.withName("dstStageMask"),
        ValueLayout.JAVA_INT.withName("srcAccessMask"),
        ValueLayout.JAVA_INT.withName("dstAccessMask"),
        ValueLayout.JAVA_INT.withName("dependencyFlags"),
        ValueLayout.JAVA_INT.withName("viewOffset")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_srcSubpass = LAYOUT.byteOffset(PathElement.groupElement("srcSubpass"));
    public static final long OFFSET_dstSubpass = LAYOUT.byteOffset(PathElement.groupElement("dstSubpass"));
    public static final long OFFSET_srcStageMask = LAYOUT.byteOffset(PathElement.groupElement("srcStageMask"));
    public static final long OFFSET_dstStageMask = LAYOUT.byteOffset(PathElement.groupElement("dstStageMask"));
    public static final long OFFSET_srcAccessMask = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask"));
    public static final long OFFSET_dstAccessMask = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask"));
    public static final long OFFSET_dependencyFlags = LAYOUT.byteOffset(PathElement.groupElement("dependencyFlags"));
    public static final long OFFSET_viewOffset = LAYOUT.byteOffset(PathElement.groupElement("viewOffset"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_srcSubpass = LAYOUT.select(PathElement.groupElement("srcSubpass"));
    public static final MemoryLayout LAYOUT_dstSubpass = LAYOUT.select(PathElement.groupElement("dstSubpass"));
    public static final MemoryLayout LAYOUT_srcStageMask = LAYOUT.select(PathElement.groupElement("srcStageMask"));
    public static final MemoryLayout LAYOUT_dstStageMask = LAYOUT.select(PathElement.groupElement("dstStageMask"));
    public static final MemoryLayout LAYOUT_srcAccessMask = LAYOUT.select(PathElement.groupElement("srcAccessMask"));
    public static final MemoryLayout LAYOUT_dstAccessMask = LAYOUT.select(PathElement.groupElement("dstAccessMask"));
    public static final MemoryLayout LAYOUT_dependencyFlags = LAYOUT.select(PathElement.groupElement("dependencyFlags"));
    public static final MemoryLayout LAYOUT_viewOffset = LAYOUT.select(PathElement.groupElement("viewOffset"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_srcSubpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcSubpass"));
    public static final VarHandle VH_dstSubpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSubpass"));
    public static final VarHandle VH_srcStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcStageMask"));
    public static final VarHandle VH_dstStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstStageMask"));
    public static final VarHandle VH_srcAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask"));
    public static final VarHandle VH_dstAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccessMask"));
    public static final VarHandle VH_dependencyFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dependencyFlags"));
    public static final VarHandle VH_viewOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewOffset"));

    public VkSubpassDependency2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSubpassDependency2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassDependency2(segment, estimateCount(segment, LAYOUT)); }
    public static VkSubpassDependency2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassDependency2(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSubpassDependency2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassDependency2(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSubpassDependency2 alloc(SegmentAllocator allocator) { return new VkSubpassDependency2(allocator.allocate(LAYOUT), 1); }
    public static VkSubpassDependency2 alloc(SegmentAllocator allocator, long count) { return new VkSubpassDependency2(allocator.allocate(LAYOUT, count), count); }
    public static VkSubpassDependency2 allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2); }
    public static VkSubpassDependency2 allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2);
        return s;
    }
    public VkSubpassDependency2 copyFrom(VkSubpassDependency2 src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSubpassDependency2 reinterpret(long count) { return new VkSubpassDependency2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSubpassDependency2 asSlice(long index) { return new VkSubpassDependency2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSubpassDependency2 asSlice(long index, long count) { return new VkSubpassDependency2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSubpassDependency2 at(long index, Consumer<VkSubpassDependency2> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int srcSubpassAt(long index) { return (int) VH_srcSubpass.get(this.segment(), 0L, index); }
    public int dstSubpassAt(long index) { return (int) VH_dstSubpass.get(this.segment(), 0L, index); }
    public int srcStageMaskAt(long index) { return (int) VH_srcStageMask.get(this.segment(), 0L, index); }
    public int dstStageMaskAt(long index) { return (int) VH_dstStageMask.get(this.segment(), 0L, index); }
    public int srcAccessMaskAt(long index) { return (int) VH_srcAccessMask.get(this.segment(), 0L, index); }
    public int dstAccessMaskAt(long index) { return (int) VH_dstAccessMask.get(this.segment(), 0L, index); }
    public int dependencyFlagsAt(long index) { return (int) VH_dependencyFlags.get(this.segment(), 0L, index); }
    public int viewOffsetAt(long index) { return (int) VH_viewOffset.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int srcSubpass() { return (int) VH_srcSubpass.get(this.segment(), 0L, 0L); }
    public int dstSubpass() { return (int) VH_dstSubpass.get(this.segment(), 0L, 0L); }
    public int srcStageMask() { return (int) VH_srcStageMask.get(this.segment(), 0L, 0L); }
    public int dstStageMask() { return (int) VH_dstStageMask.get(this.segment(), 0L, 0L); }
    public int srcAccessMask() { return (int) VH_srcAccessMask.get(this.segment(), 0L, 0L); }
    public int dstAccessMask() { return (int) VH_dstAccessMask.get(this.segment(), 0L, 0L); }
    public int dependencyFlags() { return (int) VH_dependencyFlags.get(this.segment(), 0L, 0L); }
    public int viewOffset() { return (int) VH_viewOffset.get(this.segment(), 0L, 0L); }
    public VkSubpassDependency2 sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDependency2 pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDependency2 srcSubpassAt(long index, int value) { VH_srcSubpass.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDependency2 dstSubpassAt(long index, int value) { VH_dstSubpass.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDependency2 srcStageMaskAt(long index, int value) { VH_srcStageMask.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDependency2 dstStageMaskAt(long index, int value) { VH_dstStageMask.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDependency2 srcAccessMaskAt(long index, int value) { VH_srcAccessMask.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDependency2 dstAccessMaskAt(long index, int value) { VH_dstAccessMask.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDependency2 dependencyFlagsAt(long index, int value) { VH_dependencyFlags.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDependency2 viewOffsetAt(long index, int value) { VH_viewOffset.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDependency2 sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDependency2 pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDependency2 srcSubpass(int value) { VH_srcSubpass.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDependency2 dstSubpass(int value) { VH_dstSubpass.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDependency2 srcStageMask(int value) { VH_srcStageMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDependency2 dstStageMask(int value) { VH_dstStageMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDependency2 srcAccessMask(int value) { VH_srcAccessMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDependency2 dstAccessMask(int value) { VH_dstAccessMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDependency2 dependencyFlags(int value) { VH_dependencyFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDependency2 viewOffset(int value) { VH_viewOffset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSubpassDependency2 _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSubpassDependency2 _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSubpassDependency2 _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSubpassDependency2 _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcSubpassAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcSubpass, index), LAYOUT_srcSubpass); }
    public MemorySegment _srcSubpass() { return _srcSubpassAt(0L); }
    public VkSubpassDependency2 _srcSubpassAt(long index, MemorySegment src) { _srcSubpassAt(index).copyFrom(src); return this; }
    public VkSubpassDependency2 _srcSubpass(MemorySegment src) { return _srcSubpassAt(0L, src); }
    public MemorySegment _dstSubpassAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstSubpass, index), LAYOUT_dstSubpass); }
    public MemorySegment _dstSubpass() { return _dstSubpassAt(0L); }
    public VkSubpassDependency2 _dstSubpassAt(long index, MemorySegment src) { _dstSubpassAt(index).copyFrom(src); return this; }
    public VkSubpassDependency2 _dstSubpass(MemorySegment src) { return _dstSubpassAt(0L, src); }
    public MemorySegment _srcStageMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcStageMask, index), LAYOUT_srcStageMask); }
    public MemorySegment _srcStageMask() { return _srcStageMaskAt(0L); }
    public VkSubpassDependency2 _srcStageMaskAt(long index, MemorySegment src) { _srcStageMaskAt(index).copyFrom(src); return this; }
    public VkSubpassDependency2 _srcStageMask(MemorySegment src) { return _srcStageMaskAt(0L, src); }
    public MemorySegment _dstStageMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstStageMask, index), LAYOUT_dstStageMask); }
    public MemorySegment _dstStageMask() { return _dstStageMaskAt(0L); }
    public VkSubpassDependency2 _dstStageMaskAt(long index, MemorySegment src) { _dstStageMaskAt(index).copyFrom(src); return this; }
    public VkSubpassDependency2 _dstStageMask(MemorySegment src) { return _dstStageMaskAt(0L, src); }
    public MemorySegment _srcAccessMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcAccessMask, index), LAYOUT_srcAccessMask); }
    public MemorySegment _srcAccessMask() { return _srcAccessMaskAt(0L); }
    public VkSubpassDependency2 _srcAccessMaskAt(long index, MemorySegment src) { _srcAccessMaskAt(index).copyFrom(src); return this; }
    public VkSubpassDependency2 _srcAccessMask(MemorySegment src) { return _srcAccessMaskAt(0L, src); }
    public MemorySegment _dstAccessMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstAccessMask, index), LAYOUT_dstAccessMask); }
    public MemorySegment _dstAccessMask() { return _dstAccessMaskAt(0L); }
    public VkSubpassDependency2 _dstAccessMaskAt(long index, MemorySegment src) { _dstAccessMaskAt(index).copyFrom(src); return this; }
    public VkSubpassDependency2 _dstAccessMask(MemorySegment src) { return _dstAccessMaskAt(0L, src); }
    public MemorySegment _dependencyFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dependencyFlags, index), LAYOUT_dependencyFlags); }
    public MemorySegment _dependencyFlags() { return _dependencyFlagsAt(0L); }
    public VkSubpassDependency2 _dependencyFlagsAt(long index, MemorySegment src) { _dependencyFlagsAt(index).copyFrom(src); return this; }
    public VkSubpassDependency2 _dependencyFlags(MemorySegment src) { return _dependencyFlagsAt(0L, src); }
    public MemorySegment _viewOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_viewOffset, index), LAYOUT_viewOffset); }
    public MemorySegment _viewOffset() { return _viewOffsetAt(0L); }
    public VkSubpassDependency2 _viewOffsetAt(long index, MemorySegment src) { _viewOffsetAt(index).copyFrom(src); return this; }
    public VkSubpassDependency2 _viewOffset(MemorySegment src) { return _viewOffsetAt(0L, src); }
}
