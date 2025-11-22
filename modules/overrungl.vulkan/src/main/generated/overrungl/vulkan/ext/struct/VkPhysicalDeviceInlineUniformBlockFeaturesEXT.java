// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceInlineUniformBlockFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceInlineUniformBlockFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 inlineUniformBlock;
///     VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind;
/// }
/// ```
public final class VkPhysicalDeviceInlineUniformBlockFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("inlineUniformBlock"),
        ValueLayout.JAVA_INT.withName("descriptorBindingInlineUniformBlockUpdateAfterBind")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_inlineUniformBlock = LAYOUT.byteOffset(PathElement.groupElement("inlineUniformBlock"));
    public static final long OFFSET_descriptorBindingInlineUniformBlockUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_inlineUniformBlock = LAYOUT.select(PathElement.groupElement("inlineUniformBlock"));
    public static final MemoryLayout LAYOUT_descriptorBindingInlineUniformBlockUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_inlineUniformBlock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inlineUniformBlock"));
    public static final VarHandle VH_descriptorBindingInlineUniformBlockUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));

    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceInlineUniformBlockFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceInlineUniformBlockFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceInlineUniformBlockFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceInlineUniformBlockFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceInlineUniformBlockFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES); }
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES);
        return s;
    }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT copyFrom(VkPhysicalDeviceInlineUniformBlockFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceInlineUniformBlockFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceInlineUniformBlockFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceInlineUniformBlockFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT at(long index, Consumer<VkPhysicalDeviceInlineUniformBlockFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int inlineUniformBlockAt(long index) { return (int) VH_inlineUniformBlock.get(this.segment(), 0L, index); }
    public int descriptorBindingInlineUniformBlockUpdateAfterBindAt(long index) { return (int) VH_descriptorBindingInlineUniformBlockUpdateAfterBind.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int inlineUniformBlock() { return (int) VH_inlineUniformBlock.get(this.segment(), 0L, 0L); }
    public int descriptorBindingInlineUniformBlockUpdateAfterBind() { return (int) VH_descriptorBindingInlineUniformBlockUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT inlineUniformBlockAt(long index, int value) { VH_inlineUniformBlock.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT descriptorBindingInlineUniformBlockUpdateAfterBindAt(long index, int value) { VH_descriptorBindingInlineUniformBlockUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT inlineUniformBlock(int value) { VH_inlineUniformBlock.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT descriptorBindingInlineUniformBlockUpdateAfterBind(int value) { VH_descriptorBindingInlineUniformBlockUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _inlineUniformBlockAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_inlineUniformBlock, index), LAYOUT_inlineUniformBlock); }
    public MemorySegment _inlineUniformBlock() { return _inlineUniformBlockAt(0L); }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT _inlineUniformBlockAt(long index, MemorySegment src) { _inlineUniformBlockAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT _inlineUniformBlock(MemorySegment src) { return _inlineUniformBlockAt(0L, src); }
    public MemorySegment _descriptorBindingInlineUniformBlockUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingInlineUniformBlockUpdateAfterBind, index), LAYOUT_descriptorBindingInlineUniformBlockUpdateAfterBind); }
    public MemorySegment _descriptorBindingInlineUniformBlockUpdateAfterBind() { return _descriptorBindingInlineUniformBlockUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT _descriptorBindingInlineUniformBlockUpdateAfterBindAt(long index, MemorySegment src) { _descriptorBindingInlineUniformBlockUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT _descriptorBindingInlineUniformBlockUpdateAfterBind(MemorySegment src) { return _descriptorBindingInlineUniformBlockUpdateAfterBindAt(0L, src); }
}
