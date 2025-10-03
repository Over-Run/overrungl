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

/// Represents `VkRenderPassBeginInfo`.
/// ## Layout
/// ```
/// struct VkRenderPassBeginInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkRenderPass renderPass;
///     (uint64_t) VkFramebuffer framebuffer;
///     (struct VkRect2D) VkRect2D renderArea;
///     uint32_t clearValueCount;
///     const VkClearValue* pClearValues;
/// };
/// ```
public final class VkRenderPassBeginInfo extends GroupType {
    /// The struct layout of `VkRenderPassBeginInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("renderPass"),
        ValueLayout.JAVA_LONG.withName("framebuffer"),
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("renderArea"),
        ValueLayout.JAVA_INT.withName("clearValueCount"),
        ValueLayout.ADDRESS.withName("pClearValues")
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
    /// The byte offset of `framebuffer`.
    public static final long OFFSET_framebuffer = LAYOUT.byteOffset(PathElement.groupElement("framebuffer"));
    /// The memory layout of `framebuffer`.
    public static final MemoryLayout LAYOUT_framebuffer = LAYOUT.select(PathElement.groupElement("framebuffer"));
    /// The [VarHandle] of `framebuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_framebuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebuffer"));
    /// The byte offset of `renderArea`.
    public static final long OFFSET_renderArea = LAYOUT.byteOffset(PathElement.groupElement("renderArea"));
    /// The memory layout of `renderArea`.
    public static final MemoryLayout LAYOUT_renderArea = LAYOUT.select(PathElement.groupElement("renderArea"));
    /// The byte offset of `clearValueCount`.
    public static final long OFFSET_clearValueCount = LAYOUT.byteOffset(PathElement.groupElement("clearValueCount"));
    /// The memory layout of `clearValueCount`.
    public static final MemoryLayout LAYOUT_clearValueCount = LAYOUT.select(PathElement.groupElement("clearValueCount"));
    /// The [VarHandle] of `clearValueCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_clearValueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clearValueCount"));
    /// The byte offset of `pClearValues`.
    public static final long OFFSET_pClearValues = LAYOUT.byteOffset(PathElement.groupElement("pClearValues"));
    /// The memory layout of `pClearValues`.
    public static final MemoryLayout LAYOUT_pClearValues = LAYOUT.select(PathElement.groupElement("pClearValues"));
    /// The [VarHandle] of `pClearValues` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pClearValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pClearValues"));

    /// Creates `VkRenderPassBeginInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRenderPassBeginInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRenderPassBeginInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassBeginInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassBeginInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassBeginInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassBeginInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassBeginInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRenderPassBeginInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassBeginInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassBeginInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRenderPassBeginInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassBeginInfo`
    public static VkRenderPassBeginInfo alloc(SegmentAllocator allocator) { return new VkRenderPassBeginInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRenderPassBeginInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassBeginInfo`
    public static VkRenderPassBeginInfo alloc(SegmentAllocator allocator, long count) { return new VkRenderPassBeginInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassBeginInfo copyFrom(VkRenderPassBeginInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRenderPassBeginInfo reinterpret(long count) { return new VkRenderPassBeginInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkRenderPassBeginInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRenderPassBeginInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkRenderPassBeginInfo renderPass(long value) { renderPass(this.segment(), 0L, value); return this; }

    /// {@return `framebuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long framebuffer(MemorySegment segment, long index) { return (long) VH_framebuffer.get(segment, 0L, index); }
    /// {@return `framebuffer`}
    public long framebuffer() { return framebuffer(this.segment(), 0L); }
    /// Sets `framebuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void framebuffer(MemorySegment segment, long index, long value) { VH_framebuffer.set(segment, 0L, index, value); }
    /// Sets `framebuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo framebuffer(long value) { framebuffer(this.segment(), 0L, value); return this; }

    /// {@return `renderArea` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment renderArea(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_renderArea, index), LAYOUT_renderArea); }
    /// {@return `renderArea`}
    public MemorySegment renderArea() { return renderArea(this.segment(), 0L); }
    /// Sets `renderArea` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void renderArea(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_renderArea, index), LAYOUT_renderArea.byteSize()); }
    /// Sets `renderArea` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo renderArea(MemorySegment value) { renderArea(this.segment(), 0L, value); return this; }
    /// Accepts `renderArea` with the given function.
    /// @param func the function
    /// @return `this`
    public VkRenderPassBeginInfo renderArea(Consumer<overrungl.vulkan.struct.VkRect2D> func) { func.accept(overrungl.vulkan.struct.VkRect2D.of(renderArea())); return this; }

    /// {@return `clearValueCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int clearValueCount(MemorySegment segment, long index) { return (int) VH_clearValueCount.get(segment, 0L, index); }
    /// {@return `clearValueCount`}
    public int clearValueCount() { return clearValueCount(this.segment(), 0L); }
    /// Sets `clearValueCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clearValueCount(MemorySegment segment, long index, int value) { VH_clearValueCount.set(segment, 0L, index, value); }
    /// Sets `clearValueCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo clearValueCount(int value) { clearValueCount(this.segment(), 0L, value); return this; }

    /// {@return `pClearValues` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pClearValues(MemorySegment segment, long index) { return (MemorySegment) VH_pClearValues.get(segment, 0L, index); }
    /// {@return `pClearValues`}
    public MemorySegment pClearValues() { return pClearValues(this.segment(), 0L); }
    /// Sets `pClearValues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pClearValues(MemorySegment segment, long index, MemorySegment value) { VH_pClearValues.set(segment, 0L, index, value); }
    /// Sets `pClearValues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo pClearValues(MemorySegment value) { pClearValues(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkRenderPassBeginInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderPassBeginInfo`
    public VkRenderPassBeginInfo asSlice(long index) { return new VkRenderPassBeginInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRenderPassBeginInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderPassBeginInfo`
    public VkRenderPassBeginInfo asSlice(long index, long count) { return new VkRenderPassBeginInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRenderPassBeginInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRenderPassBeginInfo at(long index, Consumer<VkRenderPassBeginInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `renderPass` at the given index}
    /// @param index the index of the struct buffer
    public long renderPassAt(long index) { return renderPass(this.segment(), index); }
    /// Sets `renderPass` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo renderPassAt(long index, long value) { renderPass(this.segment(), index, value); return this; }

    /// {@return `framebuffer` at the given index}
    /// @param index the index of the struct buffer
    public long framebufferAt(long index) { return framebuffer(this.segment(), index); }
    /// Sets `framebuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo framebufferAt(long index, long value) { framebuffer(this.segment(), index, value); return this; }

    /// {@return `renderArea` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment renderAreaAt(long index) { return renderArea(this.segment(), index); }
    /// Sets `renderArea` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo renderAreaAt(long index, MemorySegment value) { renderArea(this.segment(), index, value); return this; }
    /// Accepts `renderArea` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkRenderPassBeginInfo renderAreaAt(long index, Consumer<overrungl.vulkan.struct.VkRect2D> func) { func.accept(overrungl.vulkan.struct.VkRect2D.of(renderAreaAt(index))); return this; }

    /// {@return `clearValueCount` at the given index}
    /// @param index the index of the struct buffer
    public int clearValueCountAt(long index) { return clearValueCount(this.segment(), index); }
    /// Sets `clearValueCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo clearValueCountAt(long index, int value) { clearValueCount(this.segment(), index, value); return this; }

    /// {@return `pClearValues` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pClearValuesAt(long index) { return pClearValues(this.segment(), index); }
    /// Sets `pClearValues` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo pClearValuesAt(long index, MemorySegment value) { pClearValues(this.segment(), index, value); return this; }

}
