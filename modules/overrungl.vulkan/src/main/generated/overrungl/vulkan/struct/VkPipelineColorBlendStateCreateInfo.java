// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineColorBlendStateCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineColorBlendStateCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineColorBlendStateCreateFlags flags;
///     VkBool32 logicOpEnable;
///     VkLogicOp logicOp;
///     uint32_t attachmentCount;
///     const VkPipelineColorBlendAttachmentState* pAttachments;
///     float blendConstants[4];
/// }
/// ```
public final class VkPipelineColorBlendStateCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("logicOpEnable"),
        ValueLayout.JAVA_INT.withName("logicOp"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withName("pAttachments"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT).withName("blendConstants")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_logicOpEnable = LAYOUT.byteOffset(PathElement.groupElement("logicOpEnable"));
    public static final long OFFSET_logicOp = LAYOUT.byteOffset(PathElement.groupElement("logicOp"));
    public static final long OFFSET_attachmentCount = LAYOUT.byteOffset(PathElement.groupElement("attachmentCount"));
    public static final long OFFSET_pAttachments = LAYOUT.byteOffset(PathElement.groupElement("pAttachments"));
    public static final long OFFSET_blendConstants = LAYOUT.byteOffset(PathElement.groupElement("blendConstants"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_logicOpEnable = LAYOUT.select(PathElement.groupElement("logicOpEnable"));
    public static final MemoryLayout LAYOUT_logicOp = LAYOUT.select(PathElement.groupElement("logicOp"));
    public static final MemoryLayout LAYOUT_attachmentCount = LAYOUT.select(PathElement.groupElement("attachmentCount"));
    public static final MemoryLayout LAYOUT_pAttachments = LAYOUT.select(PathElement.groupElement("pAttachments"));
    public static final MemoryLayout LAYOUT_blendConstants = LAYOUT.select(PathElement.groupElement("blendConstants"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_logicOpEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("logicOpEnable"));
    public static final VarHandle VH_logicOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("logicOp"));
    public static final VarHandle VH_attachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentCount"));
    public static final VarHandle VH_pAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachments"));
    public static final VarHandle VH_blendConstants = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blendConstants"), PathElement.sequenceElement());

    public VkPipelineColorBlendStateCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineColorBlendStateCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorBlendStateCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineColorBlendStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorBlendStateCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineColorBlendStateCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorBlendStateCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineColorBlendStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineColorBlendStateCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineColorBlendStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineColorBlendStateCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineColorBlendStateCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO); }
    public static VkPipelineColorBlendStateCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO);
        return s;
    }
    public VkPipelineColorBlendStateCreateInfo copyFrom(VkPipelineColorBlendStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineColorBlendStateCreateInfo reinterpret(long count) { return new VkPipelineColorBlendStateCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineColorBlendStateCreateInfo asSlice(long index) { return new VkPipelineColorBlendStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineColorBlendStateCreateInfo asSlice(long index, long count) { return new VkPipelineColorBlendStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineColorBlendStateCreateInfo at(long index, Consumer<VkPipelineColorBlendStateCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int logicOpEnableAt(long index) { return (int) VH_logicOpEnable.get(this.segment(), 0L, index); }
    public int logicOpAt(long index) { return (int) VH_logicOp.get(this.segment(), 0L, index); }
    public int attachmentCountAt(long index) { return (int) VH_attachmentCount.get(this.segment(), 0L, index); }
    public MemorySegment pAttachmentsAt(long index) { return (MemorySegment) VH_pAttachments.get(this.segment(), 0L, index); }
    public float blendConstantsAt(long index, long index0) { return (float) VH_blendConstants.get(this.segment(), 0L, index, index0); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int logicOpEnable() { return (int) VH_logicOpEnable.get(this.segment(), 0L, 0L); }
    public int logicOp() { return (int) VH_logicOp.get(this.segment(), 0L, 0L); }
    public int attachmentCount() { return (int) VH_attachmentCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pAttachments() { return (MemorySegment) VH_pAttachments.get(this.segment(), 0L, 0L); }
    public float blendConstants(long index0) { return (float) VH_blendConstants.get(this.segment(), 0L, 0L, index0); }
    public VkPipelineColorBlendStateCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendStateCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendStateCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendStateCreateInfo logicOpEnableAt(long index, int value) { VH_logicOpEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendStateCreateInfo logicOpAt(long index, int value) { VH_logicOp.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendStateCreateInfo attachmentCountAt(long index, int value) { VH_attachmentCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendStateCreateInfo pAttachmentsAt(long index, MemorySegment value) { VH_pAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendStateCreateInfo blendConstantsAt(long index, long index0, float value) { VH_blendConstants.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPipelineColorBlendStateCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorBlendStateCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorBlendStateCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorBlendStateCreateInfo logicOpEnable(int value) { VH_logicOpEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorBlendStateCreateInfo logicOp(int value) { VH_logicOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorBlendStateCreateInfo attachmentCount(int value) { VH_attachmentCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorBlendStateCreateInfo pAttachments(MemorySegment value) { VH_pAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorBlendStateCreateInfo blendConstants(long index0, float value) { VH_blendConstants.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineColorBlendStateCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendStateCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineColorBlendStateCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendStateCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineColorBlendStateCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendStateCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _logicOpEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_logicOpEnable, index), LAYOUT_logicOpEnable); }
    public MemorySegment _logicOpEnable() { return _logicOpEnableAt(0L); }
    public VkPipelineColorBlendStateCreateInfo _logicOpEnableAt(long index, MemorySegment src) { _logicOpEnableAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendStateCreateInfo _logicOpEnable(MemorySegment src) { return _logicOpEnableAt(0L, src); }
    public MemorySegment _logicOpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_logicOp, index), LAYOUT_logicOp); }
    public MemorySegment _logicOp() { return _logicOpAt(0L); }
    public VkPipelineColorBlendStateCreateInfo _logicOpAt(long index, MemorySegment src) { _logicOpAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendStateCreateInfo _logicOp(MemorySegment src) { return _logicOpAt(0L, src); }
    public MemorySegment _attachmentCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_attachmentCount, index), LAYOUT_attachmentCount); }
    public MemorySegment _attachmentCount() { return _attachmentCountAt(0L); }
    public VkPipelineColorBlendStateCreateInfo _attachmentCountAt(long index, MemorySegment src) { _attachmentCountAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendStateCreateInfo _attachmentCount(MemorySegment src) { return _attachmentCountAt(0L, src); }
    public MemorySegment _pAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pAttachments, index), LAYOUT_pAttachments); }
    public MemorySegment _pAttachments() { return _pAttachmentsAt(0L); }
    public VkPipelineColorBlendStateCreateInfo _pAttachmentsAt(long index, MemorySegment src) { _pAttachmentsAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendStateCreateInfo _pAttachments(MemorySegment src) { return _pAttachmentsAt(0L, src); }
    public MemorySegment _blendConstantsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_blendConstants, index), LAYOUT_blendConstants); }
    public MemorySegment _blendConstants() { return _blendConstantsAt(0L); }
    public VkPipelineColorBlendStateCreateInfo _blendConstantsAt(long index, MemorySegment src) { _blendConstantsAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendStateCreateInfo _blendConstants(MemorySegment src) { return _blendConstantsAt(0L, src); }
}
