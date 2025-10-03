// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.huawei.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSubpassShadingPipelineCreateInfoHUAWEI`.
/// ## Layout
/// ```
/// struct VkSubpassShadingPipelineCreateInfoHUAWEI {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint64_t) VkRenderPass renderPass;
///     uint32_t subpass;
/// };
/// ```
public final class VkSubpassShadingPipelineCreateInfoHUAWEI extends GroupType {
    /// The struct layout of `VkSubpassShadingPipelineCreateInfoHUAWEI`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("renderPass"),
        ValueLayout.JAVA_INT.withName("subpass")
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
    /// The byte offset of `renderPass`.
    public static final long OFFSET_renderPass = LAYOUT.byteOffset(PathElement.groupElement("renderPass"));
    /// The memory layout of `renderPass`.
    public static final MemoryLayout LAYOUT_renderPass = LAYOUT.select(PathElement.groupElement("renderPass"));
    /// The [VarHandle] of `renderPass` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_renderPass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPass"));
    /// The byte offset of `subpass`.
    public static final long OFFSET_subpass = LAYOUT.byteOffset(PathElement.groupElement("subpass"));
    /// The memory layout of `subpass`.
    public static final MemoryLayout LAYOUT_subpass = LAYOUT.select(PathElement.groupElement("subpass"));
    /// The [VarHandle] of `subpass` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpass"));

    /// Creates `VkSubpassShadingPipelineCreateInfoHUAWEI` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSubpassShadingPipelineCreateInfoHUAWEI(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSubpassShadingPipelineCreateInfoHUAWEI` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassShadingPipelineCreateInfoHUAWEI of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassShadingPipelineCreateInfoHUAWEI(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubpassShadingPipelineCreateInfoHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassShadingPipelineCreateInfoHUAWEI ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassShadingPipelineCreateInfoHUAWEI(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSubpassShadingPipelineCreateInfoHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassShadingPipelineCreateInfoHUAWEI ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassShadingPipelineCreateInfoHUAWEI(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSubpassShadingPipelineCreateInfoHUAWEI` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassShadingPipelineCreateInfoHUAWEI`
    public static VkSubpassShadingPipelineCreateInfoHUAWEI alloc(SegmentAllocator allocator) { return new VkSubpassShadingPipelineCreateInfoHUAWEI(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSubpassShadingPipelineCreateInfoHUAWEI` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubpassShadingPipelineCreateInfoHUAWEI`
    public static VkSubpassShadingPipelineCreateInfoHUAWEI alloc(SegmentAllocator allocator, long count) { return new VkSubpassShadingPipelineCreateInfoHUAWEI(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubpassShadingPipelineCreateInfoHUAWEI copyFrom(VkSubpassShadingPipelineCreateInfoHUAWEI src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSubpassShadingPipelineCreateInfoHUAWEI reinterpret(long count) { return new VkSubpassShadingPipelineCreateInfoHUAWEI(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSubpassShadingPipelineCreateInfoHUAWEI sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSubpassShadingPipelineCreateInfoHUAWEI pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `renderPass` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long renderPass(MemorySegment segment, long index) { return (long) VH_renderPass.get(segment, 0L, index); }
    /// {@return `renderPass`}
    public long renderPass() { return renderPass(this.segment(), 0L); }
    /// Sets `renderPass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void renderPass(MemorySegment segment, long index, long value) { VH_renderPass.set(segment, 0L, index, value); }
    /// Sets `renderPass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassShadingPipelineCreateInfoHUAWEI renderPass(long value) { renderPass(this.segment(), 0L, value); return this; }

    /// {@return `subpass` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subpass(MemorySegment segment, long index) { return (int) VH_subpass.get(segment, 0L, index); }
    /// {@return `subpass`}
    public int subpass() { return subpass(this.segment(), 0L); }
    /// Sets `subpass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subpass(MemorySegment segment, long index, int value) { VH_subpass.set(segment, 0L, index, value); }
    /// Sets `subpass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassShadingPipelineCreateInfoHUAWEI subpass(int value) { subpass(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSubpassShadingPipelineCreateInfoHUAWEI`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSubpassShadingPipelineCreateInfoHUAWEI`
    public VkSubpassShadingPipelineCreateInfoHUAWEI asSlice(long index) { return new VkSubpassShadingPipelineCreateInfoHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSubpassShadingPipelineCreateInfoHUAWEI`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSubpassShadingPipelineCreateInfoHUAWEI`
    public VkSubpassShadingPipelineCreateInfoHUAWEI asSlice(long index, long count) { return new VkSubpassShadingPipelineCreateInfoHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSubpassShadingPipelineCreateInfoHUAWEI` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSubpassShadingPipelineCreateInfoHUAWEI at(long index, Consumer<VkSubpassShadingPipelineCreateInfoHUAWEI> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubpassShadingPipelineCreateInfoHUAWEI sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubpassShadingPipelineCreateInfoHUAWEI pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `renderPass` at the given index}
    /// @param index the index of the struct buffer
    public long renderPassAt(long index) { return renderPass(this.segment(), index); }
    /// Sets `renderPass` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubpassShadingPipelineCreateInfoHUAWEI renderPassAt(long index, long value) { renderPass(this.segment(), index, value); return this; }

    /// {@return `subpass` at the given index}
    /// @param index the index of the struct buffer
    public int subpassAt(long index) { return subpass(this.segment(), index); }
    /// Sets `subpass` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubpassShadingPipelineCreateInfoHUAWEI subpassAt(long index, int value) { subpass(this.segment(), index, value); return this; }

}
