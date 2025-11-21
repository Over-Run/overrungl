// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineDepthStencilStateCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineDepthStencilStateCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineDepthStencilStateCreateFlags flags;
///     VkBool32 depthTestEnable;
///     VkBool32 depthWriteEnable;
///     VkCompareOp depthCompareOp;
///     VkBool32 depthBoundsTestEnable;
///     VkBool32 stencilTestEnable;
///     VkStencilOpState front;
///     VkStencilOpState back;
///     float minDepthBounds;
///     float maxDepthBounds;
/// }
/// ```
public final class VkPipelineDepthStencilStateCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("depthTestEnable"),
        ValueLayout.JAVA_INT.withName("depthWriteEnable"),
        ValueLayout.JAVA_INT.withName("depthCompareOp"),
        ValueLayout.JAVA_INT.withName("depthBoundsTestEnable"),
        ValueLayout.JAVA_INT.withName("stencilTestEnable"),
        overrungl.vulkan.struct.VkStencilOpState.LAYOUT.withName("front"),
        overrungl.vulkan.struct.VkStencilOpState.LAYOUT.withName("back"),
        ValueLayout.JAVA_FLOAT.withName("minDepthBounds"),
        ValueLayout.JAVA_FLOAT.withName("maxDepthBounds")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_depthTestEnable = LAYOUT.byteOffset(PathElement.groupElement("depthTestEnable"));
    public static final long OFFSET_depthWriteEnable = LAYOUT.byteOffset(PathElement.groupElement("depthWriteEnable"));
    public static final long OFFSET_depthCompareOp = LAYOUT.byteOffset(PathElement.groupElement("depthCompareOp"));
    public static final long OFFSET_depthBoundsTestEnable = LAYOUT.byteOffset(PathElement.groupElement("depthBoundsTestEnable"));
    public static final long OFFSET_stencilTestEnable = LAYOUT.byteOffset(PathElement.groupElement("stencilTestEnable"));
    public static final long OFFSET_front = LAYOUT.byteOffset(PathElement.groupElement("front"));
    public static final long OFFSET_back = LAYOUT.byteOffset(PathElement.groupElement("back"));
    public static final long OFFSET_minDepthBounds = LAYOUT.byteOffset(PathElement.groupElement("minDepthBounds"));
    public static final long OFFSET_maxDepthBounds = LAYOUT.byteOffset(PathElement.groupElement("maxDepthBounds"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_depthTestEnable = LAYOUT.select(PathElement.groupElement("depthTestEnable"));
    public static final MemoryLayout LAYOUT_depthWriteEnable = LAYOUT.select(PathElement.groupElement("depthWriteEnable"));
    public static final MemoryLayout LAYOUT_depthCompareOp = LAYOUT.select(PathElement.groupElement("depthCompareOp"));
    public static final MemoryLayout LAYOUT_depthBoundsTestEnable = LAYOUT.select(PathElement.groupElement("depthBoundsTestEnable"));
    public static final MemoryLayout LAYOUT_stencilTestEnable = LAYOUT.select(PathElement.groupElement("stencilTestEnable"));
    public static final MemoryLayout LAYOUT_front = LAYOUT.select(PathElement.groupElement("front"));
    public static final MemoryLayout LAYOUT_back = LAYOUT.select(PathElement.groupElement("back"));
    public static final MemoryLayout LAYOUT_minDepthBounds = LAYOUT.select(PathElement.groupElement("minDepthBounds"));
    public static final MemoryLayout LAYOUT_maxDepthBounds = LAYOUT.select(PathElement.groupElement("maxDepthBounds"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_depthTestEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthTestEnable"));
    public static final VarHandle VH_depthWriteEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthWriteEnable"));
    public static final VarHandle VH_depthCompareOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthCompareOp"));
    public static final VarHandle VH_depthBoundsTestEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBoundsTestEnable"));
    public static final VarHandle VH_stencilTestEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilTestEnable"));
    public static final VarHandle VH_front$failOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("front"), PathElement.groupElement("failOp"));
    public static final VarHandle VH_front$passOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("front"), PathElement.groupElement("passOp"));
    public static final VarHandle VH_front$depthFailOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("front"), PathElement.groupElement("depthFailOp"));
    public static final VarHandle VH_front$compareOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("front"), PathElement.groupElement("compareOp"));
    public static final VarHandle VH_front$compareMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("front"), PathElement.groupElement("compareMask"));
    public static final VarHandle VH_front$writeMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("front"), PathElement.groupElement("writeMask"));
    public static final VarHandle VH_front$reference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("front"), PathElement.groupElement("reference"));
    public static final VarHandle VH_back$failOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("back"), PathElement.groupElement("failOp"));
    public static final VarHandle VH_back$passOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("back"), PathElement.groupElement("passOp"));
    public static final VarHandle VH_back$depthFailOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("back"), PathElement.groupElement("depthFailOp"));
    public static final VarHandle VH_back$compareOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("back"), PathElement.groupElement("compareOp"));
    public static final VarHandle VH_back$compareMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("back"), PathElement.groupElement("compareMask"));
    public static final VarHandle VH_back$writeMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("back"), PathElement.groupElement("writeMask"));
    public static final VarHandle VH_back$reference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("back"), PathElement.groupElement("reference"));
    public static final VarHandle VH_minDepthBounds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minDepthBounds"));
    public static final VarHandle VH_maxDepthBounds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDepthBounds"));

    public VkPipelineDepthStencilStateCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineDepthStencilStateCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineDepthStencilStateCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineDepthStencilStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineDepthStencilStateCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineDepthStencilStateCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineDepthStencilStateCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineDepthStencilStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineDepthStencilStateCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineDepthStencilStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineDepthStencilStateCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineDepthStencilStateCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO); }
    public static VkPipelineDepthStencilStateCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO);
        return s;
    }
    public VkPipelineDepthStencilStateCreateInfo copyFrom(VkPipelineDepthStencilStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineDepthStencilStateCreateInfo reinterpret(long count) { return new VkPipelineDepthStencilStateCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineDepthStencilStateCreateInfo asSlice(long index) { return new VkPipelineDepthStencilStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineDepthStencilStateCreateInfo asSlice(long index, long count) { return new VkPipelineDepthStencilStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineDepthStencilStateCreateInfo at(long index, Consumer<VkPipelineDepthStencilStateCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int depthTestEnableAt(long index) { return (int) VH_depthTestEnable.get(this.segment(), 0L, index); }
    public int depthWriteEnableAt(long index) { return (int) VH_depthWriteEnable.get(this.segment(), 0L, index); }
    public int depthCompareOpAt(long index) { return (int) VH_depthCompareOp.get(this.segment(), 0L, index); }
    public int depthBoundsTestEnableAt(long index) { return (int) VH_depthBoundsTestEnable.get(this.segment(), 0L, index); }
    public int stencilTestEnableAt(long index) { return (int) VH_stencilTestEnable.get(this.segment(), 0L, index); }
    public int front$failOpAt(long index) { return (int) VH_front$failOp.get(this.segment(), 0L, index); }
    public int front$passOpAt(long index) { return (int) VH_front$passOp.get(this.segment(), 0L, index); }
    public int front$depthFailOpAt(long index) { return (int) VH_front$depthFailOp.get(this.segment(), 0L, index); }
    public int front$compareOpAt(long index) { return (int) VH_front$compareOp.get(this.segment(), 0L, index); }
    public int front$compareMaskAt(long index) { return (int) VH_front$compareMask.get(this.segment(), 0L, index); }
    public int front$writeMaskAt(long index) { return (int) VH_front$writeMask.get(this.segment(), 0L, index); }
    public int front$referenceAt(long index) { return (int) VH_front$reference.get(this.segment(), 0L, index); }
    public int back$failOpAt(long index) { return (int) VH_back$failOp.get(this.segment(), 0L, index); }
    public int back$passOpAt(long index) { return (int) VH_back$passOp.get(this.segment(), 0L, index); }
    public int back$depthFailOpAt(long index) { return (int) VH_back$depthFailOp.get(this.segment(), 0L, index); }
    public int back$compareOpAt(long index) { return (int) VH_back$compareOp.get(this.segment(), 0L, index); }
    public int back$compareMaskAt(long index) { return (int) VH_back$compareMask.get(this.segment(), 0L, index); }
    public int back$writeMaskAt(long index) { return (int) VH_back$writeMask.get(this.segment(), 0L, index); }
    public int back$referenceAt(long index) { return (int) VH_back$reference.get(this.segment(), 0L, index); }
    public float minDepthBoundsAt(long index) { return (float) VH_minDepthBounds.get(this.segment(), 0L, index); }
    public float maxDepthBoundsAt(long index) { return (float) VH_maxDepthBounds.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int depthTestEnable() { return (int) VH_depthTestEnable.get(this.segment(), 0L, 0L); }
    public int depthWriteEnable() { return (int) VH_depthWriteEnable.get(this.segment(), 0L, 0L); }
    public int depthCompareOp() { return (int) VH_depthCompareOp.get(this.segment(), 0L, 0L); }
    public int depthBoundsTestEnable() { return (int) VH_depthBoundsTestEnable.get(this.segment(), 0L, 0L); }
    public int stencilTestEnable() { return (int) VH_stencilTestEnable.get(this.segment(), 0L, 0L); }
    public int front$failOp() { return (int) VH_front$failOp.get(this.segment(), 0L, 0L); }
    public int front$passOp() { return (int) VH_front$passOp.get(this.segment(), 0L, 0L); }
    public int front$depthFailOp() { return (int) VH_front$depthFailOp.get(this.segment(), 0L, 0L); }
    public int front$compareOp() { return (int) VH_front$compareOp.get(this.segment(), 0L, 0L); }
    public int front$compareMask() { return (int) VH_front$compareMask.get(this.segment(), 0L, 0L); }
    public int front$writeMask() { return (int) VH_front$writeMask.get(this.segment(), 0L, 0L); }
    public int front$reference() { return (int) VH_front$reference.get(this.segment(), 0L, 0L); }
    public int back$failOp() { return (int) VH_back$failOp.get(this.segment(), 0L, 0L); }
    public int back$passOp() { return (int) VH_back$passOp.get(this.segment(), 0L, 0L); }
    public int back$depthFailOp() { return (int) VH_back$depthFailOp.get(this.segment(), 0L, 0L); }
    public int back$compareOp() { return (int) VH_back$compareOp.get(this.segment(), 0L, 0L); }
    public int back$compareMask() { return (int) VH_back$compareMask.get(this.segment(), 0L, 0L); }
    public int back$writeMask() { return (int) VH_back$writeMask.get(this.segment(), 0L, 0L); }
    public int back$reference() { return (int) VH_back$reference.get(this.segment(), 0L, 0L); }
    public float minDepthBounds() { return (float) VH_minDepthBounds.get(this.segment(), 0L, 0L); }
    public float maxDepthBounds() { return (float) VH_maxDepthBounds.get(this.segment(), 0L, 0L); }
    public VkPipelineDepthStencilStateCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo depthTestEnableAt(long index, int value) { VH_depthTestEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo depthWriteEnableAt(long index, int value) { VH_depthWriteEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo depthCompareOpAt(long index, int value) { VH_depthCompareOp.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo depthBoundsTestEnableAt(long index, int value) { VH_depthBoundsTestEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo stencilTestEnableAt(long index, int value) { VH_stencilTestEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo front$failOpAt(long index, int value) { VH_front$failOp.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo front$passOpAt(long index, int value) { VH_front$passOp.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo front$depthFailOpAt(long index, int value) { VH_front$depthFailOp.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo front$compareOpAt(long index, int value) { VH_front$compareOp.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo front$compareMaskAt(long index, int value) { VH_front$compareMask.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo front$writeMaskAt(long index, int value) { VH_front$writeMask.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo front$referenceAt(long index, int value) { VH_front$reference.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo back$failOpAt(long index, int value) { VH_back$failOp.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo back$passOpAt(long index, int value) { VH_back$passOp.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo back$depthFailOpAt(long index, int value) { VH_back$depthFailOp.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo back$compareOpAt(long index, int value) { VH_back$compareOp.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo back$compareMaskAt(long index, int value) { VH_back$compareMask.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo back$writeMaskAt(long index, int value) { VH_back$writeMask.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo back$referenceAt(long index, int value) { VH_back$reference.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo minDepthBoundsAt(long index, float value) { VH_minDepthBounds.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo maxDepthBoundsAt(long index, float value) { VH_maxDepthBounds.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo depthTestEnable(int value) { VH_depthTestEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo depthWriteEnable(int value) { VH_depthWriteEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo depthCompareOp(int value) { VH_depthCompareOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo depthBoundsTestEnable(int value) { VH_depthBoundsTestEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo stencilTestEnable(int value) { VH_stencilTestEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo front$failOp(int value) { VH_front$failOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo front$passOp(int value) { VH_front$passOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo front$depthFailOp(int value) { VH_front$depthFailOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo front$compareOp(int value) { VH_front$compareOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo front$compareMask(int value) { VH_front$compareMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo front$writeMask(int value) { VH_front$writeMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo front$reference(int value) { VH_front$reference.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo back$failOp(int value) { VH_back$failOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo back$passOp(int value) { VH_back$passOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo back$depthFailOp(int value) { VH_back$depthFailOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo back$compareOp(int value) { VH_back$compareOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo back$compareMask(int value) { VH_back$compareMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo back$writeMask(int value) { VH_back$writeMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo back$reference(int value) { VH_back$reference.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo minDepthBounds(float value) { VH_minDepthBounds.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDepthStencilStateCreateInfo maxDepthBounds(float value) { VH_maxDepthBounds.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineDepthStencilStateCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineDepthStencilStateCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineDepthStencilStateCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineDepthStencilStateCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineDepthStencilStateCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineDepthStencilStateCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _depthTestEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthTestEnable, index), LAYOUT_depthTestEnable); }
    public MemorySegment _depthTestEnable() { return _depthTestEnableAt(0L); }
    public VkPipelineDepthStencilStateCreateInfo _depthTestEnableAt(long index, MemorySegment src) { _depthTestEnableAt(index).copyFrom(src); return this; }
    public VkPipelineDepthStencilStateCreateInfo _depthTestEnable(MemorySegment src) { return _depthTestEnableAt(0L, src); }
    public MemorySegment _depthWriteEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthWriteEnable, index), LAYOUT_depthWriteEnable); }
    public MemorySegment _depthWriteEnable() { return _depthWriteEnableAt(0L); }
    public VkPipelineDepthStencilStateCreateInfo _depthWriteEnableAt(long index, MemorySegment src) { _depthWriteEnableAt(index).copyFrom(src); return this; }
    public VkPipelineDepthStencilStateCreateInfo _depthWriteEnable(MemorySegment src) { return _depthWriteEnableAt(0L, src); }
    public MemorySegment _depthCompareOpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthCompareOp, index), LAYOUT_depthCompareOp); }
    public MemorySegment _depthCompareOp() { return _depthCompareOpAt(0L); }
    public VkPipelineDepthStencilStateCreateInfo _depthCompareOpAt(long index, MemorySegment src) { _depthCompareOpAt(index).copyFrom(src); return this; }
    public VkPipelineDepthStencilStateCreateInfo _depthCompareOp(MemorySegment src) { return _depthCompareOpAt(0L, src); }
    public MemorySegment _depthBoundsTestEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthBoundsTestEnable, index), LAYOUT_depthBoundsTestEnable); }
    public MemorySegment _depthBoundsTestEnable() { return _depthBoundsTestEnableAt(0L); }
    public VkPipelineDepthStencilStateCreateInfo _depthBoundsTestEnableAt(long index, MemorySegment src) { _depthBoundsTestEnableAt(index).copyFrom(src); return this; }
    public VkPipelineDepthStencilStateCreateInfo _depthBoundsTestEnable(MemorySegment src) { return _depthBoundsTestEnableAt(0L, src); }
    public MemorySegment _stencilTestEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stencilTestEnable, index), LAYOUT_stencilTestEnable); }
    public MemorySegment _stencilTestEnable() { return _stencilTestEnableAt(0L); }
    public VkPipelineDepthStencilStateCreateInfo _stencilTestEnableAt(long index, MemorySegment src) { _stencilTestEnableAt(index).copyFrom(src); return this; }
    public VkPipelineDepthStencilStateCreateInfo _stencilTestEnable(MemorySegment src) { return _stencilTestEnableAt(0L, src); }
    public MemorySegment _frontAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_front, index), LAYOUT_front); }
    public MemorySegment _front() { return _frontAt(0L); }
    public VkPipelineDepthStencilStateCreateInfo _frontAt(long index, MemorySegment src) { _frontAt(index).copyFrom(src); return this; }
    public VkPipelineDepthStencilStateCreateInfo _front(MemorySegment src) { return _frontAt(0L, src); }
    public MemorySegment _backAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_back, index), LAYOUT_back); }
    public MemorySegment _back() { return _backAt(0L); }
    public VkPipelineDepthStencilStateCreateInfo _backAt(long index, MemorySegment src) { _backAt(index).copyFrom(src); return this; }
    public VkPipelineDepthStencilStateCreateInfo _back(MemorySegment src) { return _backAt(0L, src); }
    public MemorySegment _minDepthBoundsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minDepthBounds, index), LAYOUT_minDepthBounds); }
    public MemorySegment _minDepthBounds() { return _minDepthBoundsAt(0L); }
    public VkPipelineDepthStencilStateCreateInfo _minDepthBoundsAt(long index, MemorySegment src) { _minDepthBoundsAt(index).copyFrom(src); return this; }
    public VkPipelineDepthStencilStateCreateInfo _minDepthBounds(MemorySegment src) { return _minDepthBoundsAt(0L, src); }
    public MemorySegment _maxDepthBoundsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDepthBounds, index), LAYOUT_maxDepthBounds); }
    public MemorySegment _maxDepthBounds() { return _maxDepthBoundsAt(0L); }
    public VkPipelineDepthStencilStateCreateInfo _maxDepthBoundsAt(long index, MemorySegment src) { _maxDepthBoundsAt(index).copyFrom(src); return this; }
    public VkPipelineDepthStencilStateCreateInfo _maxDepthBounds(MemorySegment src) { return _maxDepthBoundsAt(0L, src); }
}
