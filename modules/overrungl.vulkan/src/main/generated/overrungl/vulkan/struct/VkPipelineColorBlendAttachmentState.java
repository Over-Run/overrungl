// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineColorBlendAttachmentState`.
/// ## Layout
/// ```
/// struct VkPipelineColorBlendAttachmentState {
///     VkBool32 blendEnable;
///     VkBlendFactor srcColorBlendFactor;
///     VkBlendFactor dstColorBlendFactor;
///     VkBlendOp colorBlendOp;
///     VkBlendFactor srcAlphaBlendFactor;
///     VkBlendFactor dstAlphaBlendFactor;
///     VkBlendOp alphaBlendOp;
///     VkColorComponentFlags colorWriteMask;
/// }
/// ```
public final class VkPipelineColorBlendAttachmentState extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("blendEnable"),
        ValueLayout.JAVA_INT.withName("srcColorBlendFactor"),
        ValueLayout.JAVA_INT.withName("dstColorBlendFactor"),
        ValueLayout.JAVA_INT.withName("colorBlendOp"),
        ValueLayout.JAVA_INT.withName("srcAlphaBlendFactor"),
        ValueLayout.JAVA_INT.withName("dstAlphaBlendFactor"),
        ValueLayout.JAVA_INT.withName("alphaBlendOp"),
        ValueLayout.JAVA_INT.withName("colorWriteMask")
    );
    public static final long OFFSET_blendEnable = LAYOUT.byteOffset(PathElement.groupElement("blendEnable"));
    public static final long OFFSET_srcColorBlendFactor = LAYOUT.byteOffset(PathElement.groupElement("srcColorBlendFactor"));
    public static final long OFFSET_dstColorBlendFactor = LAYOUT.byteOffset(PathElement.groupElement("dstColorBlendFactor"));
    public static final long OFFSET_colorBlendOp = LAYOUT.byteOffset(PathElement.groupElement("colorBlendOp"));
    public static final long OFFSET_srcAlphaBlendFactor = LAYOUT.byteOffset(PathElement.groupElement("srcAlphaBlendFactor"));
    public static final long OFFSET_dstAlphaBlendFactor = LAYOUT.byteOffset(PathElement.groupElement("dstAlphaBlendFactor"));
    public static final long OFFSET_alphaBlendOp = LAYOUT.byteOffset(PathElement.groupElement("alphaBlendOp"));
    public static final long OFFSET_colorWriteMask = LAYOUT.byteOffset(PathElement.groupElement("colorWriteMask"));
    public static final MemoryLayout LAYOUT_blendEnable = LAYOUT.select(PathElement.groupElement("blendEnable"));
    public static final MemoryLayout LAYOUT_srcColorBlendFactor = LAYOUT.select(PathElement.groupElement("srcColorBlendFactor"));
    public static final MemoryLayout LAYOUT_dstColorBlendFactor = LAYOUT.select(PathElement.groupElement("dstColorBlendFactor"));
    public static final MemoryLayout LAYOUT_colorBlendOp = LAYOUT.select(PathElement.groupElement("colorBlendOp"));
    public static final MemoryLayout LAYOUT_srcAlphaBlendFactor = LAYOUT.select(PathElement.groupElement("srcAlphaBlendFactor"));
    public static final MemoryLayout LAYOUT_dstAlphaBlendFactor = LAYOUT.select(PathElement.groupElement("dstAlphaBlendFactor"));
    public static final MemoryLayout LAYOUT_alphaBlendOp = LAYOUT.select(PathElement.groupElement("alphaBlendOp"));
    public static final MemoryLayout LAYOUT_colorWriteMask = LAYOUT.select(PathElement.groupElement("colorWriteMask"));
    public static final VarHandle VH_blendEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blendEnable"));
    public static final VarHandle VH_srcColorBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcColorBlendFactor"));
    public static final VarHandle VH_dstColorBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstColorBlendFactor"));
    public static final VarHandle VH_colorBlendOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorBlendOp"));
    public static final VarHandle VH_srcAlphaBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAlphaBlendFactor"));
    public static final VarHandle VH_dstAlphaBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAlphaBlendFactor"));
    public static final VarHandle VH_alphaBlendOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alphaBlendOp"));
    public static final VarHandle VH_colorWriteMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorWriteMask"));

    public VkPipelineColorBlendAttachmentState(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineColorBlendAttachmentState of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorBlendAttachmentState(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineColorBlendAttachmentState ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorBlendAttachmentState(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineColorBlendAttachmentState ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorBlendAttachmentState(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineColorBlendAttachmentState alloc(SegmentAllocator allocator) { return new VkPipelineColorBlendAttachmentState(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineColorBlendAttachmentState alloc(SegmentAllocator allocator, long count) { return new VkPipelineColorBlendAttachmentState(allocator.allocate(LAYOUT, count), count); }
    public VkPipelineColorBlendAttachmentState copyFrom(VkPipelineColorBlendAttachmentState src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineColorBlendAttachmentState reinterpret(long count) { return new VkPipelineColorBlendAttachmentState(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineColorBlendAttachmentState asSlice(long index) { return new VkPipelineColorBlendAttachmentState(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineColorBlendAttachmentState asSlice(long index, long count) { return new VkPipelineColorBlendAttachmentState(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineColorBlendAttachmentState at(long index, Consumer<VkPipelineColorBlendAttachmentState> func) { func.accept(asSlice(index)); return this; }
    public int blendEnableAt(long index) { return (int) VH_blendEnable.get(this.segment(), 0L, index); }
    public int srcColorBlendFactorAt(long index) { return (int) VH_srcColorBlendFactor.get(this.segment(), 0L, index); }
    public int dstColorBlendFactorAt(long index) { return (int) VH_dstColorBlendFactor.get(this.segment(), 0L, index); }
    public int colorBlendOpAt(long index) { return (int) VH_colorBlendOp.get(this.segment(), 0L, index); }
    public int srcAlphaBlendFactorAt(long index) { return (int) VH_srcAlphaBlendFactor.get(this.segment(), 0L, index); }
    public int dstAlphaBlendFactorAt(long index) { return (int) VH_dstAlphaBlendFactor.get(this.segment(), 0L, index); }
    public int alphaBlendOpAt(long index) { return (int) VH_alphaBlendOp.get(this.segment(), 0L, index); }
    public int colorWriteMaskAt(long index) { return (int) VH_colorWriteMask.get(this.segment(), 0L, index); }
    public int blendEnable() { return (int) VH_blendEnable.get(this.segment(), 0L, 0L); }
    public int srcColorBlendFactor() { return (int) VH_srcColorBlendFactor.get(this.segment(), 0L, 0L); }
    public int dstColorBlendFactor() { return (int) VH_dstColorBlendFactor.get(this.segment(), 0L, 0L); }
    public int colorBlendOp() { return (int) VH_colorBlendOp.get(this.segment(), 0L, 0L); }
    public int srcAlphaBlendFactor() { return (int) VH_srcAlphaBlendFactor.get(this.segment(), 0L, 0L); }
    public int dstAlphaBlendFactor() { return (int) VH_dstAlphaBlendFactor.get(this.segment(), 0L, 0L); }
    public int alphaBlendOp() { return (int) VH_alphaBlendOp.get(this.segment(), 0L, 0L); }
    public int colorWriteMask() { return (int) VH_colorWriteMask.get(this.segment(), 0L, 0L); }
    public VkPipelineColorBlendAttachmentState blendEnableAt(long index, int value) { VH_blendEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendAttachmentState srcColorBlendFactorAt(long index, int value) { VH_srcColorBlendFactor.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendAttachmentState dstColorBlendFactorAt(long index, int value) { VH_dstColorBlendFactor.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendAttachmentState colorBlendOpAt(long index, int value) { VH_colorBlendOp.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendAttachmentState srcAlphaBlendFactorAt(long index, int value) { VH_srcAlphaBlendFactor.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendAttachmentState dstAlphaBlendFactorAt(long index, int value) { VH_dstAlphaBlendFactor.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendAttachmentState alphaBlendOpAt(long index, int value) { VH_alphaBlendOp.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendAttachmentState colorWriteMaskAt(long index, int value) { VH_colorWriteMask.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendAttachmentState blendEnable(int value) { VH_blendEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorBlendAttachmentState srcColorBlendFactor(int value) { VH_srcColorBlendFactor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorBlendAttachmentState dstColorBlendFactor(int value) { VH_dstColorBlendFactor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorBlendAttachmentState colorBlendOp(int value) { VH_colorBlendOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorBlendAttachmentState srcAlphaBlendFactor(int value) { VH_srcAlphaBlendFactor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorBlendAttachmentState dstAlphaBlendFactor(int value) { VH_dstAlphaBlendFactor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorBlendAttachmentState alphaBlendOp(int value) { VH_alphaBlendOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorBlendAttachmentState colorWriteMask(int value) { VH_colorWriteMask.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _blendEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_blendEnable, index), LAYOUT_blendEnable); }
    public MemorySegment _blendEnable() { return _blendEnableAt(0L); }
    public VkPipelineColorBlendAttachmentState _blendEnableAt(long index, MemorySegment src) { _blendEnableAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendAttachmentState _blendEnable(MemorySegment src) { return _blendEnableAt(0L, src); }
    public MemorySegment _srcColorBlendFactorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcColorBlendFactor, index), LAYOUT_srcColorBlendFactor); }
    public MemorySegment _srcColorBlendFactor() { return _srcColorBlendFactorAt(0L); }
    public VkPipelineColorBlendAttachmentState _srcColorBlendFactorAt(long index, MemorySegment src) { _srcColorBlendFactorAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendAttachmentState _srcColorBlendFactor(MemorySegment src) { return _srcColorBlendFactorAt(0L, src); }
    public MemorySegment _dstColorBlendFactorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstColorBlendFactor, index), LAYOUT_dstColorBlendFactor); }
    public MemorySegment _dstColorBlendFactor() { return _dstColorBlendFactorAt(0L); }
    public VkPipelineColorBlendAttachmentState _dstColorBlendFactorAt(long index, MemorySegment src) { _dstColorBlendFactorAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendAttachmentState _dstColorBlendFactor(MemorySegment src) { return _dstColorBlendFactorAt(0L, src); }
    public MemorySegment _colorBlendOpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_colorBlendOp, index), LAYOUT_colorBlendOp); }
    public MemorySegment _colorBlendOp() { return _colorBlendOpAt(0L); }
    public VkPipelineColorBlendAttachmentState _colorBlendOpAt(long index, MemorySegment src) { _colorBlendOpAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendAttachmentState _colorBlendOp(MemorySegment src) { return _colorBlendOpAt(0L, src); }
    public MemorySegment _srcAlphaBlendFactorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcAlphaBlendFactor, index), LAYOUT_srcAlphaBlendFactor); }
    public MemorySegment _srcAlphaBlendFactor() { return _srcAlphaBlendFactorAt(0L); }
    public VkPipelineColorBlendAttachmentState _srcAlphaBlendFactorAt(long index, MemorySegment src) { _srcAlphaBlendFactorAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendAttachmentState _srcAlphaBlendFactor(MemorySegment src) { return _srcAlphaBlendFactorAt(0L, src); }
    public MemorySegment _dstAlphaBlendFactorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstAlphaBlendFactor, index), LAYOUT_dstAlphaBlendFactor); }
    public MemorySegment _dstAlphaBlendFactor() { return _dstAlphaBlendFactorAt(0L); }
    public VkPipelineColorBlendAttachmentState _dstAlphaBlendFactorAt(long index, MemorySegment src) { _dstAlphaBlendFactorAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendAttachmentState _dstAlphaBlendFactor(MemorySegment src) { return _dstAlphaBlendFactorAt(0L, src); }
    public MemorySegment _alphaBlendOpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_alphaBlendOp, index), LAYOUT_alphaBlendOp); }
    public MemorySegment _alphaBlendOp() { return _alphaBlendOpAt(0L); }
    public VkPipelineColorBlendAttachmentState _alphaBlendOpAt(long index, MemorySegment src) { _alphaBlendOpAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendAttachmentState _alphaBlendOp(MemorySegment src) { return _alphaBlendOpAt(0L, src); }
    public MemorySegment _colorWriteMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_colorWriteMask, index), LAYOUT_colorWriteMask); }
    public MemorySegment _colorWriteMask() { return _colorWriteMaskAt(0L); }
    public VkPipelineColorBlendAttachmentState _colorWriteMaskAt(long index, MemorySegment src) { _colorWriteMaskAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendAttachmentState _colorWriteMask(MemorySegment src) { return _colorWriteMaskAt(0L, src); }
}
