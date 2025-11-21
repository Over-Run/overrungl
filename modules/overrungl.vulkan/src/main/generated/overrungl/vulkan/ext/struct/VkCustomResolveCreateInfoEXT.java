// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCustomResolveCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkCustomResolveCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 customResolve;
///     uint32_t colorAttachmentCount;
///     const VkFormat* pColorAttachmentFormats;
///     VkFormat depthAttachmentFormat;
///     VkFormat stencilAttachmentFormat;
/// }
/// ```
public final class VkCustomResolveCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("customResolve"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachmentFormats"),
        ValueLayout.JAVA_INT.withName("depthAttachmentFormat"),
        ValueLayout.JAVA_INT.withName("stencilAttachmentFormat")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_customResolve = LAYOUT.byteOffset(PathElement.groupElement("customResolve"));
    public static final long OFFSET_colorAttachmentCount = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
    public static final long OFFSET_pColorAttachmentFormats = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachmentFormats"));
    public static final long OFFSET_depthAttachmentFormat = LAYOUT.byteOffset(PathElement.groupElement("depthAttachmentFormat"));
    public static final long OFFSET_stencilAttachmentFormat = LAYOUT.byteOffset(PathElement.groupElement("stencilAttachmentFormat"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_customResolve = LAYOUT.select(PathElement.groupElement("customResolve"));
    public static final MemoryLayout LAYOUT_colorAttachmentCount = LAYOUT.select(PathElement.groupElement("colorAttachmentCount"));
    public static final MemoryLayout LAYOUT_pColorAttachmentFormats = LAYOUT.select(PathElement.groupElement("pColorAttachmentFormats"));
    public static final MemoryLayout LAYOUT_depthAttachmentFormat = LAYOUT.select(PathElement.groupElement("depthAttachmentFormat"));
    public static final MemoryLayout LAYOUT_stencilAttachmentFormat = LAYOUT.select(PathElement.groupElement("stencilAttachmentFormat"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_customResolve = LAYOUT.arrayElementVarHandle(PathElement.groupElement("customResolve"));
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    public static final VarHandle VH_pColorAttachmentFormats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachmentFormats"));
    public static final VarHandle VH_depthAttachmentFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthAttachmentFormat"));
    public static final VarHandle VH_stencilAttachmentFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilAttachmentFormat"));

    public VkCustomResolveCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCustomResolveCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCustomResolveCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkCustomResolveCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCustomResolveCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCustomResolveCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCustomResolveCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCustomResolveCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkCustomResolveCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkCustomResolveCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkCustomResolveCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkCustomResolveCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTCustomResolve.VK_STRUCTURE_TYPE_CUSTOM_RESOLVE_CREATE_INFO_EXT); }
    public static VkCustomResolveCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTCustomResolve.VK_STRUCTURE_TYPE_CUSTOM_RESOLVE_CREATE_INFO_EXT);
        return s;
    }
    public VkCustomResolveCreateInfoEXT copyFrom(VkCustomResolveCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCustomResolveCreateInfoEXT reinterpret(long count) { return new VkCustomResolveCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCustomResolveCreateInfoEXT asSlice(long index) { return new VkCustomResolveCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCustomResolveCreateInfoEXT asSlice(long index, long count) { return new VkCustomResolveCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCustomResolveCreateInfoEXT at(long index, Consumer<VkCustomResolveCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int customResolveAt(long index) { return (int) VH_customResolve.get(this.segment(), 0L, index); }
    public int colorAttachmentCountAt(long index) { return (int) VH_colorAttachmentCount.get(this.segment(), 0L, index); }
    public MemorySegment pColorAttachmentFormatsAt(long index) { return (MemorySegment) VH_pColorAttachmentFormats.get(this.segment(), 0L, index); }
    public int depthAttachmentFormatAt(long index) { return (int) VH_depthAttachmentFormat.get(this.segment(), 0L, index); }
    public int stencilAttachmentFormatAt(long index) { return (int) VH_stencilAttachmentFormat.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int customResolve() { return (int) VH_customResolve.get(this.segment(), 0L, 0L); }
    public int colorAttachmentCount() { return (int) VH_colorAttachmentCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pColorAttachmentFormats() { return (MemorySegment) VH_pColorAttachmentFormats.get(this.segment(), 0L, 0L); }
    public int depthAttachmentFormat() { return (int) VH_depthAttachmentFormat.get(this.segment(), 0L, 0L); }
    public int stencilAttachmentFormat() { return (int) VH_stencilAttachmentFormat.get(this.segment(), 0L, 0L); }
    public VkCustomResolveCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCustomResolveCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCustomResolveCreateInfoEXT customResolveAt(long index, int value) { VH_customResolve.set(this.segment(), 0L, index, value); return this; }
    public VkCustomResolveCreateInfoEXT colorAttachmentCountAt(long index, int value) { VH_colorAttachmentCount.set(this.segment(), 0L, index, value); return this; }
    public VkCustomResolveCreateInfoEXT pColorAttachmentFormatsAt(long index, MemorySegment value) { VH_pColorAttachmentFormats.set(this.segment(), 0L, index, value); return this; }
    public VkCustomResolveCreateInfoEXT depthAttachmentFormatAt(long index, int value) { VH_depthAttachmentFormat.set(this.segment(), 0L, index, value); return this; }
    public VkCustomResolveCreateInfoEXT stencilAttachmentFormatAt(long index, int value) { VH_stencilAttachmentFormat.set(this.segment(), 0L, index, value); return this; }
    public VkCustomResolveCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCustomResolveCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCustomResolveCreateInfoEXT customResolve(int value) { VH_customResolve.set(this.segment(), 0L, 0L, value); return this; }
    public VkCustomResolveCreateInfoEXT colorAttachmentCount(int value) { VH_colorAttachmentCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkCustomResolveCreateInfoEXT pColorAttachmentFormats(MemorySegment value) { VH_pColorAttachmentFormats.set(this.segment(), 0L, 0L, value); return this; }
    public VkCustomResolveCreateInfoEXT depthAttachmentFormat(int value) { VH_depthAttachmentFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkCustomResolveCreateInfoEXT stencilAttachmentFormat(int value) { VH_stencilAttachmentFormat.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCustomResolveCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCustomResolveCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCustomResolveCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCustomResolveCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _customResolveAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_customResolve, index), LAYOUT_customResolve); }
    public MemorySegment _customResolve() { return _customResolveAt(0L); }
    public VkCustomResolveCreateInfoEXT _customResolveAt(long index, MemorySegment src) { _customResolveAt(index).copyFrom(src); return this; }
    public VkCustomResolveCreateInfoEXT _customResolve(MemorySegment src) { return _customResolveAt(0L, src); }
    public MemorySegment _colorAttachmentCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_colorAttachmentCount, index), LAYOUT_colorAttachmentCount); }
    public MemorySegment _colorAttachmentCount() { return _colorAttachmentCountAt(0L); }
    public VkCustomResolveCreateInfoEXT _colorAttachmentCountAt(long index, MemorySegment src) { _colorAttachmentCountAt(index).copyFrom(src); return this; }
    public VkCustomResolveCreateInfoEXT _colorAttachmentCount(MemorySegment src) { return _colorAttachmentCountAt(0L, src); }
    public MemorySegment _pColorAttachmentFormatsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pColorAttachmentFormats, index), LAYOUT_pColorAttachmentFormats); }
    public MemorySegment _pColorAttachmentFormats() { return _pColorAttachmentFormatsAt(0L); }
    public VkCustomResolveCreateInfoEXT _pColorAttachmentFormatsAt(long index, MemorySegment src) { _pColorAttachmentFormatsAt(index).copyFrom(src); return this; }
    public VkCustomResolveCreateInfoEXT _pColorAttachmentFormats(MemorySegment src) { return _pColorAttachmentFormatsAt(0L, src); }
    public MemorySegment _depthAttachmentFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthAttachmentFormat, index), LAYOUT_depthAttachmentFormat); }
    public MemorySegment _depthAttachmentFormat() { return _depthAttachmentFormatAt(0L); }
    public VkCustomResolveCreateInfoEXT _depthAttachmentFormatAt(long index, MemorySegment src) { _depthAttachmentFormatAt(index).copyFrom(src); return this; }
    public VkCustomResolveCreateInfoEXT _depthAttachmentFormat(MemorySegment src) { return _depthAttachmentFormatAt(0L, src); }
    public MemorySegment _stencilAttachmentFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stencilAttachmentFormat, index), LAYOUT_stencilAttachmentFormat); }
    public MemorySegment _stencilAttachmentFormat() { return _stencilAttachmentFormatAt(0L); }
    public VkCustomResolveCreateInfoEXT _stencilAttachmentFormatAt(long index, MemorySegment src) { _stencilAttachmentFormatAt(index).copyFrom(src); return this; }
    public VkCustomResolveCreateInfoEXT _stencilAttachmentFormat(MemorySegment src) { return _stencilAttachmentFormatAt(0L, src); }
}
