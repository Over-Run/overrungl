// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSamplerBlockMatchWindowCreateInfoQCOM`.
/// ## Layout
/// ```
/// struct VkSamplerBlockMatchWindowCreateInfoQCOM {
///     VkStructureType sType;
///     const void* pNext;
///     VkExtent2D windowExtent;
///     VkBlockMatchWindowCompareModeQCOM windowCompareMode;
/// }
/// ```
public final class VkSamplerBlockMatchWindowCreateInfoQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("windowExtent"),
        ValueLayout.JAVA_INT.withName("windowCompareMode")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_windowExtent = LAYOUT.byteOffset(PathElement.groupElement("windowExtent"));
    public static final long OFFSET_windowCompareMode = LAYOUT.byteOffset(PathElement.groupElement("windowCompareMode"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_windowExtent = LAYOUT.select(PathElement.groupElement("windowExtent"));
    public static final MemoryLayout LAYOUT_windowCompareMode = LAYOUT.select(PathElement.groupElement("windowCompareMode"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_windowExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("windowExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_windowExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("windowExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_windowCompareMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("windowCompareMode"));

    public VkSamplerBlockMatchWindowCreateInfoQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSamplerBlockMatchWindowCreateInfoQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerBlockMatchWindowCreateInfoQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkSamplerBlockMatchWindowCreateInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerBlockMatchWindowCreateInfoQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSamplerBlockMatchWindowCreateInfoQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerBlockMatchWindowCreateInfoQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSamplerBlockMatchWindowCreateInfoQCOM alloc(SegmentAllocator allocator) { return new VkSamplerBlockMatchWindowCreateInfoQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkSamplerBlockMatchWindowCreateInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkSamplerBlockMatchWindowCreateInfoQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkSamplerBlockMatchWindowCreateInfoQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMImageProcessing2.VK_STRUCTURE_TYPE_SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM); }
    public static VkSamplerBlockMatchWindowCreateInfoQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMImageProcessing2.VK_STRUCTURE_TYPE_SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM);
        return s;
    }
    public VkSamplerBlockMatchWindowCreateInfoQCOM copyFrom(VkSamplerBlockMatchWindowCreateInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSamplerBlockMatchWindowCreateInfoQCOM reinterpret(long count) { return new VkSamplerBlockMatchWindowCreateInfoQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSamplerBlockMatchWindowCreateInfoQCOM asSlice(long index) { return new VkSamplerBlockMatchWindowCreateInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSamplerBlockMatchWindowCreateInfoQCOM asSlice(long index, long count) { return new VkSamplerBlockMatchWindowCreateInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSamplerBlockMatchWindowCreateInfoQCOM at(long index, Consumer<VkSamplerBlockMatchWindowCreateInfoQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int windowExtent$widthAt(long index) { return (int) VH_windowExtent$width.get(this.segment(), 0L, index); }
    public int windowExtent$heightAt(long index) { return (int) VH_windowExtent$height.get(this.segment(), 0L, index); }
    public int windowCompareModeAt(long index) { return (int) VH_windowCompareMode.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int windowExtent$width() { return (int) VH_windowExtent$width.get(this.segment(), 0L, 0L); }
    public int windowExtent$height() { return (int) VH_windowExtent$height.get(this.segment(), 0L, 0L); }
    public int windowCompareMode() { return (int) VH_windowCompareMode.get(this.segment(), 0L, 0L); }
    public VkSamplerBlockMatchWindowCreateInfoQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerBlockMatchWindowCreateInfoQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowExtent$widthAt(long index, int value) { VH_windowExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowExtent$heightAt(long index, int value) { VH_windowExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowCompareModeAt(long index, int value) { VH_windowCompareMode.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerBlockMatchWindowCreateInfoQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerBlockMatchWindowCreateInfoQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowExtent$width(int value) { VH_windowExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowExtent$height(int value) { VH_windowExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowCompareMode(int value) { VH_windowCompareMode.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSamplerBlockMatchWindowCreateInfoQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSamplerBlockMatchWindowCreateInfoQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSamplerBlockMatchWindowCreateInfoQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSamplerBlockMatchWindowCreateInfoQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _windowExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_windowExtent, index), LAYOUT_windowExtent); }
    public MemorySegment _windowExtent() { return _windowExtentAt(0L); }
    public VkSamplerBlockMatchWindowCreateInfoQCOM _windowExtentAt(long index, MemorySegment src) { _windowExtentAt(index).copyFrom(src); return this; }
    public VkSamplerBlockMatchWindowCreateInfoQCOM _windowExtent(MemorySegment src) { return _windowExtentAt(0L, src); }
    public MemorySegment _windowCompareModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_windowCompareMode, index), LAYOUT_windowCompareMode); }
    public MemorySegment _windowCompareMode() { return _windowCompareModeAt(0L); }
    public VkSamplerBlockMatchWindowCreateInfoQCOM _windowCompareModeAt(long index, MemorySegment src) { _windowCompareModeAt(index).copyFrom(src); return this; }
    public VkSamplerBlockMatchWindowCreateInfoQCOM _windowCompareMode(MemorySegment src) { return _windowCompareModeAt(0L, src); }
}
