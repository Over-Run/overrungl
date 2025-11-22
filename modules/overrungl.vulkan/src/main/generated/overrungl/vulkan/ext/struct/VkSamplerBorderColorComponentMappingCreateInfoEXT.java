// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSamplerBorderColorComponentMappingCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkSamplerBorderColorComponentMappingCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkComponentMapping components;
///     VkBool32 srgb;
/// }
/// ```
public final class VkSamplerBorderColorComponentMappingCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkComponentMapping.LAYOUT.withName("components"),
        ValueLayout.JAVA_INT.withName("srgb")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_components = LAYOUT.byteOffset(PathElement.groupElement("components"));
    public static final long OFFSET_srgb = LAYOUT.byteOffset(PathElement.groupElement("srgb"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_components = LAYOUT.select(PathElement.groupElement("components"));
    public static final MemoryLayout LAYOUT_srgb = LAYOUT.select(PathElement.groupElement("srgb"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_components$r = LAYOUT.arrayElementVarHandle(PathElement.groupElement("components"), PathElement.groupElement("r"));
    public static final VarHandle VH_components$g = LAYOUT.arrayElementVarHandle(PathElement.groupElement("components"), PathElement.groupElement("g"));
    public static final VarHandle VH_components$b = LAYOUT.arrayElementVarHandle(PathElement.groupElement("components"), PathElement.groupElement("b"));
    public static final VarHandle VH_components$a = LAYOUT.arrayElementVarHandle(PathElement.groupElement("components"), PathElement.groupElement("a"));
    public static final VarHandle VH_srgb = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srgb"));

    public VkSamplerBorderColorComponentMappingCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerBorderColorComponentMappingCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerBorderColorComponentMappingCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerBorderColorComponentMappingCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkSamplerBorderColorComponentMappingCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSamplerBorderColorComponentMappingCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTBorderColorSwizzle.VK_STRUCTURE_TYPE_SAMPLER_BORDER_COLOR_COMPONENT_MAPPING_CREATE_INFO_EXT); }
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTBorderColorSwizzle.VK_STRUCTURE_TYPE_SAMPLER_BORDER_COLOR_COMPONENT_MAPPING_CREATE_INFO_EXT);
        return s;
    }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT copyFrom(VkSamplerBorderColorComponentMappingCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT reinterpret(long count) { return new VkSamplerBorderColorComponentMappingCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT asSlice(long index) { return new VkSamplerBorderColorComponentMappingCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT asSlice(long index, long count) { return new VkSamplerBorderColorComponentMappingCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT at(long index, Consumer<VkSamplerBorderColorComponentMappingCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int components$rAt(long index) { return (int) VH_components$r.get(this.segment(), 0L, index); }
    public int components$gAt(long index) { return (int) VH_components$g.get(this.segment(), 0L, index); }
    public int components$bAt(long index) { return (int) VH_components$b.get(this.segment(), 0L, index); }
    public int components$aAt(long index) { return (int) VH_components$a.get(this.segment(), 0L, index); }
    public int srgbAt(long index) { return (int) VH_srgb.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int components$r() { return (int) VH_components$r.get(this.segment(), 0L, 0L); }
    public int components$g() { return (int) VH_components$g.get(this.segment(), 0L, 0L); }
    public int components$b() { return (int) VH_components$b.get(this.segment(), 0L, 0L); }
    public int components$a() { return (int) VH_components$a.get(this.segment(), 0L, 0L); }
    public int srgb() { return (int) VH_srgb.get(this.segment(), 0L, 0L); }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT components$rAt(long index, int value) { VH_components$r.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT components$gAt(long index, int value) { VH_components$g.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT components$bAt(long index, int value) { VH_components$b.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT components$aAt(long index, int value) { VH_components$a.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT srgbAt(long index, int value) { VH_srgb.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT components$r(int value) { VH_components$r.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT components$g(int value) { VH_components$g.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT components$b(int value) { VH_components$b.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT components$a(int value) { VH_components$a.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT srgb(int value) { VH_srgb.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _componentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_components, index), LAYOUT_components); }
    public MemorySegment _components() { return _componentsAt(0L); }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT _componentsAt(long index, MemorySegment src) { _componentsAt(index).copyFrom(src); return this; }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT _components(MemorySegment src) { return _componentsAt(0L, src); }
    public MemorySegment _srgbAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srgb, index), LAYOUT_srgb); }
    public MemorySegment _srgb() { return _srgbAt(0L); }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT _srgbAt(long index, MemorySegment src) { _srgbAt(index).copyFrom(src); return this; }
    public VkSamplerBorderColorComponentMappingCreateInfoEXT _srgb(MemorySegment src) { return _srgbAt(0L, src); }
}
