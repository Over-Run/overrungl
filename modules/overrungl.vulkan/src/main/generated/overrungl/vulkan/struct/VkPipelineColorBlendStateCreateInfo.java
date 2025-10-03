// This file is auto-generated. DO NOT EDIT!
//@formatter:off
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
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineColorBlendStateCreateFlags flags;
///     (uint32_t) VkBool32 logicOpEnable;
///     (int) VkLogicOp logicOp;
///     uint32_t attachmentCount;
///     const VkPipelineColorBlendAttachmentState* pAttachments;
///     float blendConstants[4];
/// };
/// ```
public final class VkPipelineColorBlendStateCreateInfo extends GroupType {
    /// The struct layout of `VkPipelineColorBlendStateCreateInfo`.
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
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `logicOpEnable`.
    public static final long OFFSET_logicOpEnable = LAYOUT.byteOffset(PathElement.groupElement("logicOpEnable"));
    /// The memory layout of `logicOpEnable`.
    public static final MemoryLayout LAYOUT_logicOpEnable = LAYOUT.select(PathElement.groupElement("logicOpEnable"));
    /// The [VarHandle] of `logicOpEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_logicOpEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("logicOpEnable"));
    /// The byte offset of `logicOp`.
    public static final long OFFSET_logicOp = LAYOUT.byteOffset(PathElement.groupElement("logicOp"));
    /// The memory layout of `logicOp`.
    public static final MemoryLayout LAYOUT_logicOp = LAYOUT.select(PathElement.groupElement("logicOp"));
    /// The [VarHandle] of `logicOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_logicOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("logicOp"));
    /// The byte offset of `attachmentCount`.
    public static final long OFFSET_attachmentCount = LAYOUT.byteOffset(PathElement.groupElement("attachmentCount"));
    /// The memory layout of `attachmentCount`.
    public static final MemoryLayout LAYOUT_attachmentCount = LAYOUT.select(PathElement.groupElement("attachmentCount"));
    /// The [VarHandle] of `attachmentCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_attachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentCount"));
    /// The byte offset of `pAttachments`.
    public static final long OFFSET_pAttachments = LAYOUT.byteOffset(PathElement.groupElement("pAttachments"));
    /// The memory layout of `pAttachments`.
    public static final MemoryLayout LAYOUT_pAttachments = LAYOUT.select(PathElement.groupElement("pAttachments"));
    /// The [VarHandle] of `pAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachments"));
    /// The byte offset of `blendConstants`.
    public static final long OFFSET_blendConstants = LAYOUT.byteOffset(PathElement.groupElement("blendConstants"));
    /// The memory layout of `blendConstants`.
    public static final MemoryLayout LAYOUT_blendConstants = LAYOUT.select(PathElement.groupElement("blendConstants"));
    /// The [VarHandle] of `blendConstants` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_blendConstants = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blendConstants"), PathElement.sequenceElement());

    /// Creates `VkPipelineColorBlendStateCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineColorBlendStateCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineColorBlendStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorBlendStateCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorBlendStateCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineColorBlendStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorBlendStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorBlendStateCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineColorBlendStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorBlendStateCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorBlendStateCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineColorBlendStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineColorBlendStateCreateInfo`
    public static VkPipelineColorBlendStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineColorBlendStateCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineColorBlendStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineColorBlendStateCreateInfo`
    public static VkPipelineColorBlendStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineColorBlendStateCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo copyFrom(VkPipelineColorBlendStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineColorBlendStateCreateInfo reinterpret(long count) { return new VkPipelineColorBlendStateCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `logicOpEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int logicOpEnable(MemorySegment segment, long index) { return (int) VH_logicOpEnable.get(segment, 0L, index); }
    /// {@return `logicOpEnable`}
    public int logicOpEnable() { return logicOpEnable(this.segment(), 0L); }
    /// Sets `logicOpEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void logicOpEnable(MemorySegment segment, long index, int value) { VH_logicOpEnable.set(segment, 0L, index, value); }
    /// Sets `logicOpEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo logicOpEnable(int value) { logicOpEnable(this.segment(), 0L, value); return this; }

    /// {@return `logicOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int logicOp(MemorySegment segment, long index) { return (int) VH_logicOp.get(segment, 0L, index); }
    /// {@return `logicOp`}
    public int logicOp() { return logicOp(this.segment(), 0L); }
    /// Sets `logicOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void logicOp(MemorySegment segment, long index, int value) { VH_logicOp.set(segment, 0L, index, value); }
    /// Sets `logicOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo logicOp(int value) { logicOp(this.segment(), 0L, value); return this; }

    /// {@return `attachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int attachmentCount(MemorySegment segment, long index) { return (int) VH_attachmentCount.get(segment, 0L, index); }
    /// {@return `attachmentCount`}
    public int attachmentCount() { return attachmentCount(this.segment(), 0L); }
    /// Sets `attachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void attachmentCount(MemorySegment segment, long index, int value) { VH_attachmentCount.set(segment, 0L, index, value); }
    /// Sets `attachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo attachmentCount(int value) { attachmentCount(this.segment(), 0L, value); return this; }

    /// {@return `pAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAttachments(MemorySegment segment, long index) { return (MemorySegment) VH_pAttachments.get(segment, 0L, index); }
    /// {@return `pAttachments`}
    public MemorySegment pAttachments() { return pAttachments(this.segment(), 0L); }
    /// Sets `pAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAttachments(MemorySegment segment, long index, MemorySegment value) { VH_pAttachments.set(segment, 0L, index, value); }
    /// Sets `pAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo pAttachments(MemorySegment value) { pAttachments(this.segment(), 0L, value); return this; }

    /// {@return `blendConstants` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment blendConstants(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_blendConstants, index), LAYOUT_blendConstants); }
    /// {@return `blendConstants` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static float blendConstants(MemorySegment segment, long index, long index0) { return (float) VH_blendConstants.get(segment, 0L, index, index0); }
    /// {@return `blendConstants`}
    public MemorySegment blendConstants() { return blendConstants(this.segment(), 0L); }
    /// {@return `blendConstants`}
    /// @param index0 the Index 0 of the array
    public float blendConstants(long index0) { return blendConstants(this.segment(), 0L, index0); }
    /// Sets `blendConstants` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void blendConstants(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_blendConstants, index), LAYOUT_blendConstants.byteSize()); }
    /// Sets `blendConstants` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void blendConstants(MemorySegment segment, long index, long index0, float value) { VH_blendConstants.set(segment, 0L, index, index0, value); }
    /// Sets `blendConstants` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo blendConstants(MemorySegment value) { blendConstants(this.segment(), 0L, value); return this; }
    /// Sets `blendConstants` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo blendConstants(long index0, float value) { blendConstants(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `VkPipelineColorBlendStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineColorBlendStateCreateInfo`
    public VkPipelineColorBlendStateCreateInfo asSlice(long index) { return new VkPipelineColorBlendStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineColorBlendStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineColorBlendStateCreateInfo`
    public VkPipelineColorBlendStateCreateInfo asSlice(long index, long count) { return new VkPipelineColorBlendStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineColorBlendStateCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo at(long index, Consumer<VkPipelineColorBlendStateCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `logicOpEnable` at the given index}
    /// @param index the index of the struct buffer
    public int logicOpEnableAt(long index) { return logicOpEnable(this.segment(), index); }
    /// Sets `logicOpEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo logicOpEnableAt(long index, int value) { logicOpEnable(this.segment(), index, value); return this; }

    /// {@return `logicOp` at the given index}
    /// @param index the index of the struct buffer
    public int logicOpAt(long index) { return logicOp(this.segment(), index); }
    /// Sets `logicOp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo logicOpAt(long index, int value) { logicOp(this.segment(), index, value); return this; }

    /// {@return `attachmentCount` at the given index}
    /// @param index the index of the struct buffer
    public int attachmentCountAt(long index) { return attachmentCount(this.segment(), index); }
    /// Sets `attachmentCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo attachmentCountAt(long index, int value) { attachmentCount(this.segment(), index, value); return this; }

    /// {@return `pAttachments` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pAttachmentsAt(long index) { return pAttachments(this.segment(), index); }
    /// Sets `pAttachments` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo pAttachmentsAt(long index, MemorySegment value) { pAttachments(this.segment(), index, value); return this; }

    /// {@return `blendConstants` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment blendConstantsAt(long index) { return blendConstants(this.segment(), index); }
    /// {@return `blendConstants` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public float blendConstantsAt(long index, long index0) { return blendConstants(this.segment(), index, index0); }
    /// Sets `blendConstants` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo blendConstantsAt(long index, MemorySegment value) { blendConstants(this.segment(), index, value); return this; }
    /// Sets `blendConstants` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo blendConstantsAt(long index, long index0, float value) { blendConstants(this.segment(), index, index0, value); return this; }

}
