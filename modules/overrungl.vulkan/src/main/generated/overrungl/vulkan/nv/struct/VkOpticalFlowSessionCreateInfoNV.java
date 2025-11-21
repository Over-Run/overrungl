// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkOpticalFlowSessionCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkOpticalFlowSessionCreateInfoNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t width;
///     uint32_t height;
///     VkFormat imageFormat;
///     VkFormat flowVectorFormat;
///     VkFormat costFormat;
///     VkOpticalFlowGridSizeFlagsNV outputGridSize;
///     VkOpticalFlowGridSizeFlagsNV hintGridSize;
///     VkOpticalFlowPerformanceLevelNV performanceLevel;
///     VkOpticalFlowSessionCreateFlagsNV flags;
/// }
/// ```
public final class VkOpticalFlowSessionCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("imageFormat"),
        ValueLayout.JAVA_INT.withName("flowVectorFormat"),
        ValueLayout.JAVA_INT.withName("costFormat"),
        ValueLayout.JAVA_INT.withName("outputGridSize"),
        ValueLayout.JAVA_INT.withName("hintGridSize"),
        ValueLayout.JAVA_INT.withName("performanceLevel"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_width = LAYOUT.byteOffset(PathElement.groupElement("width"));
    public static final long OFFSET_height = LAYOUT.byteOffset(PathElement.groupElement("height"));
    public static final long OFFSET_imageFormat = LAYOUT.byteOffset(PathElement.groupElement("imageFormat"));
    public static final long OFFSET_flowVectorFormat = LAYOUT.byteOffset(PathElement.groupElement("flowVectorFormat"));
    public static final long OFFSET_costFormat = LAYOUT.byteOffset(PathElement.groupElement("costFormat"));
    public static final long OFFSET_outputGridSize = LAYOUT.byteOffset(PathElement.groupElement("outputGridSize"));
    public static final long OFFSET_hintGridSize = LAYOUT.byteOffset(PathElement.groupElement("hintGridSize"));
    public static final long OFFSET_performanceLevel = LAYOUT.byteOffset(PathElement.groupElement("performanceLevel"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_width = LAYOUT.select(PathElement.groupElement("width"));
    public static final MemoryLayout LAYOUT_height = LAYOUT.select(PathElement.groupElement("height"));
    public static final MemoryLayout LAYOUT_imageFormat = LAYOUT.select(PathElement.groupElement("imageFormat"));
    public static final MemoryLayout LAYOUT_flowVectorFormat = LAYOUT.select(PathElement.groupElement("flowVectorFormat"));
    public static final MemoryLayout LAYOUT_costFormat = LAYOUT.select(PathElement.groupElement("costFormat"));
    public static final MemoryLayout LAYOUT_outputGridSize = LAYOUT.select(PathElement.groupElement("outputGridSize"));
    public static final MemoryLayout LAYOUT_hintGridSize = LAYOUT.select(PathElement.groupElement("hintGridSize"));
    public static final MemoryLayout LAYOUT_performanceLevel = LAYOUT.select(PathElement.groupElement("performanceLevel"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    public static final VarHandle VH_imageFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormat"));
    public static final VarHandle VH_flowVectorFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flowVectorFormat"));
    public static final VarHandle VH_costFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("costFormat"));
    public static final VarHandle VH_outputGridSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("outputGridSize"));
    public static final VarHandle VH_hintGridSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hintGridSize"));
    public static final VarHandle VH_performanceLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("performanceLevel"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    public VkOpticalFlowSessionCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkOpticalFlowSessionCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowSessionCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkOpticalFlowSessionCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowSessionCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkOpticalFlowSessionCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowSessionCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkOpticalFlowSessionCreateInfoNV alloc(SegmentAllocator allocator) { return new VkOpticalFlowSessionCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkOpticalFlowSessionCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkOpticalFlowSessionCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkOpticalFlowSessionCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV); }
    public static VkOpticalFlowSessionCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV);
        return s;
    }
    public VkOpticalFlowSessionCreateInfoNV copyFrom(VkOpticalFlowSessionCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkOpticalFlowSessionCreateInfoNV reinterpret(long count) { return new VkOpticalFlowSessionCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkOpticalFlowSessionCreateInfoNV asSlice(long index) { return new VkOpticalFlowSessionCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkOpticalFlowSessionCreateInfoNV asSlice(long index, long count) { return new VkOpticalFlowSessionCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkOpticalFlowSessionCreateInfoNV at(long index, Consumer<VkOpticalFlowSessionCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int widthAt(long index) { return (int) VH_width.get(this.segment(), 0L, index); }
    public int heightAt(long index) { return (int) VH_height.get(this.segment(), 0L, index); }
    public int imageFormatAt(long index) { return (int) VH_imageFormat.get(this.segment(), 0L, index); }
    public int flowVectorFormatAt(long index) { return (int) VH_flowVectorFormat.get(this.segment(), 0L, index); }
    public int costFormatAt(long index) { return (int) VH_costFormat.get(this.segment(), 0L, index); }
    public int outputGridSizeAt(long index) { return (int) VH_outputGridSize.get(this.segment(), 0L, index); }
    public int hintGridSizeAt(long index) { return (int) VH_hintGridSize.get(this.segment(), 0L, index); }
    public int performanceLevelAt(long index) { return (int) VH_performanceLevel.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int width() { return (int) VH_width.get(this.segment(), 0L, 0L); }
    public int height() { return (int) VH_height.get(this.segment(), 0L, 0L); }
    public int imageFormat() { return (int) VH_imageFormat.get(this.segment(), 0L, 0L); }
    public int flowVectorFormat() { return (int) VH_flowVectorFormat.get(this.segment(), 0L, 0L); }
    public int costFormat() { return (int) VH_costFormat.get(this.segment(), 0L, 0L); }
    public int outputGridSize() { return (int) VH_outputGridSize.get(this.segment(), 0L, 0L); }
    public int hintGridSize() { return (int) VH_hintGridSize.get(this.segment(), 0L, 0L); }
    public int performanceLevel() { return (int) VH_performanceLevel.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public VkOpticalFlowSessionCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV widthAt(long index, int value) { VH_width.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV heightAt(long index, int value) { VH_height.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV imageFormatAt(long index, int value) { VH_imageFormat.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV flowVectorFormatAt(long index, int value) { VH_flowVectorFormat.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV costFormatAt(long index, int value) { VH_costFormat.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV outputGridSizeAt(long index, int value) { VH_outputGridSize.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV hintGridSizeAt(long index, int value) { VH_hintGridSize.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV performanceLevelAt(long index, int value) { VH_performanceLevel.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV width(int value) { VH_width.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV height(int value) { VH_height.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV imageFormat(int value) { VH_imageFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV flowVectorFormat(int value) { VH_flowVectorFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV costFormat(int value) { VH_costFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV outputGridSize(int value) { VH_outputGridSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV hintGridSize(int value) { VH_hintGridSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV performanceLevel(int value) { VH_performanceLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowSessionCreateInfoNV flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkOpticalFlowSessionCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkOpticalFlowSessionCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkOpticalFlowSessionCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkOpticalFlowSessionCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _widthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_width, index), LAYOUT_width); }
    public MemorySegment _width() { return _widthAt(0L); }
    public VkOpticalFlowSessionCreateInfoNV _widthAt(long index, MemorySegment src) { _widthAt(index).copyFrom(src); return this; }
    public VkOpticalFlowSessionCreateInfoNV _width(MemorySegment src) { return _widthAt(0L, src); }
    public MemorySegment _heightAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_height, index), LAYOUT_height); }
    public MemorySegment _height() { return _heightAt(0L); }
    public VkOpticalFlowSessionCreateInfoNV _heightAt(long index, MemorySegment src) { _heightAt(index).copyFrom(src); return this; }
    public VkOpticalFlowSessionCreateInfoNV _height(MemorySegment src) { return _heightAt(0L, src); }
    public MemorySegment _imageFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageFormat, index), LAYOUT_imageFormat); }
    public MemorySegment _imageFormat() { return _imageFormatAt(0L); }
    public VkOpticalFlowSessionCreateInfoNV _imageFormatAt(long index, MemorySegment src) { _imageFormatAt(index).copyFrom(src); return this; }
    public VkOpticalFlowSessionCreateInfoNV _imageFormat(MemorySegment src) { return _imageFormatAt(0L, src); }
    public MemorySegment _flowVectorFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flowVectorFormat, index), LAYOUT_flowVectorFormat); }
    public MemorySegment _flowVectorFormat() { return _flowVectorFormatAt(0L); }
    public VkOpticalFlowSessionCreateInfoNV _flowVectorFormatAt(long index, MemorySegment src) { _flowVectorFormatAt(index).copyFrom(src); return this; }
    public VkOpticalFlowSessionCreateInfoNV _flowVectorFormat(MemorySegment src) { return _flowVectorFormatAt(0L, src); }
    public MemorySegment _costFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_costFormat, index), LAYOUT_costFormat); }
    public MemorySegment _costFormat() { return _costFormatAt(0L); }
    public VkOpticalFlowSessionCreateInfoNV _costFormatAt(long index, MemorySegment src) { _costFormatAt(index).copyFrom(src); return this; }
    public VkOpticalFlowSessionCreateInfoNV _costFormat(MemorySegment src) { return _costFormatAt(0L, src); }
    public MemorySegment _outputGridSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_outputGridSize, index), LAYOUT_outputGridSize); }
    public MemorySegment _outputGridSize() { return _outputGridSizeAt(0L); }
    public VkOpticalFlowSessionCreateInfoNV _outputGridSizeAt(long index, MemorySegment src) { _outputGridSizeAt(index).copyFrom(src); return this; }
    public VkOpticalFlowSessionCreateInfoNV _outputGridSize(MemorySegment src) { return _outputGridSizeAt(0L, src); }
    public MemorySegment _hintGridSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hintGridSize, index), LAYOUT_hintGridSize); }
    public MemorySegment _hintGridSize() { return _hintGridSizeAt(0L); }
    public VkOpticalFlowSessionCreateInfoNV _hintGridSizeAt(long index, MemorySegment src) { _hintGridSizeAt(index).copyFrom(src); return this; }
    public VkOpticalFlowSessionCreateInfoNV _hintGridSize(MemorySegment src) { return _hintGridSizeAt(0L, src); }
    public MemorySegment _performanceLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_performanceLevel, index), LAYOUT_performanceLevel); }
    public MemorySegment _performanceLevel() { return _performanceLevelAt(0L); }
    public VkOpticalFlowSessionCreateInfoNV _performanceLevelAt(long index, MemorySegment src) { _performanceLevelAt(index).copyFrom(src); return this; }
    public VkOpticalFlowSessionCreateInfoNV _performanceLevel(MemorySegment src) { return _performanceLevelAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkOpticalFlowSessionCreateInfoNV _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkOpticalFlowSessionCreateInfoNV _flags(MemorySegment src) { return _flagsAt(0L, src); }
}
