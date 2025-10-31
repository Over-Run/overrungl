// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCommandBufferInheritanceRenderPassTransformInfoQCOM`.
/// ## Layout
/// ```
/// struct VkCommandBufferInheritanceRenderPassTransformInfoQCOM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkSurfaceTransformFlagBitsKHR transform;
///     (struct VkRect2D) VkRect2D renderArea;
/// };
/// ```
public final class VkCommandBufferInheritanceRenderPassTransformInfoQCOM extends GroupType {
    /// The struct layout of `VkCommandBufferInheritanceRenderPassTransformInfoQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("transform"),
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("renderArea")
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
    /// The byte offset of `transform`.
    public static final long OFFSET_transform = LAYOUT.byteOffset(PathElement.groupElement("transform"));
    /// The memory layout of `transform`.
    public static final MemoryLayout LAYOUT_transform = LAYOUT.select(PathElement.groupElement("transform"));
    /// The [VarHandle] of `transform` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_transform = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transform"));
    /// The byte offset of `renderArea`.
    public static final long OFFSET_renderArea = LAYOUT.byteOffset(PathElement.groupElement("renderArea"));
    /// The memory layout of `renderArea`.
    public static final MemoryLayout LAYOUT_renderArea = LAYOUT.select(PathElement.groupElement("renderArea"));

    /// Creates `VkCommandBufferInheritanceRenderPassTransformInfoQCOM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCommandBufferInheritanceRenderPassTransformInfoQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCommandBufferInheritanceRenderPassTransformInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCommandBufferInheritanceRenderPassTransformInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCommandBufferInheritanceRenderPassTransformInfoQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandBufferInheritanceRenderPassTransformInfoQCOM`
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM alloc(SegmentAllocator allocator) { return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCommandBufferInheritanceRenderPassTransformInfoQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCommandBufferInheritanceRenderPassTransformInfoQCOM`
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM copyFrom(VkCommandBufferInheritanceRenderPassTransformInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM reinterpret(long count) { return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `transform` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int transform(MemorySegment segment, long index) { return (int) VH_transform.get(segment, 0L, index); }
    /// {@return `transform`}
    public int transform() { return transform(this.segment(), 0L); }
    /// Sets `transform` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transform(MemorySegment segment, long index, int value) { VH_transform.set(segment, 0L, index, value); }
    /// Sets `transform` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM transform(int value) { transform(this.segment(), 0L, value); return this; }

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
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderArea(MemorySegment value) { renderArea(this.segment(), 0L, value); return this; }
    /// Accepts `renderArea` with the given function.
    /// @param func the function
    /// @return `this`
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderArea(Consumer<overrungl.vulkan.struct.VkRect2D> func) { func.accept(overrungl.vulkan.struct.VkRect2D.of(renderArea())); return this; }

    /// Creates a slice of `VkCommandBufferInheritanceRenderPassTransformInfoQCOM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCommandBufferInheritanceRenderPassTransformInfoQCOM`
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM asSlice(long index) { return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCommandBufferInheritanceRenderPassTransformInfoQCOM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCommandBufferInheritanceRenderPassTransformInfoQCOM`
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM asSlice(long index, long count) { return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCommandBufferInheritanceRenderPassTransformInfoQCOM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM at(long index, Consumer<VkCommandBufferInheritanceRenderPassTransformInfoQCOM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `transform` at the given index}
    /// @param index the index of the struct buffer
    public int transformAt(long index) { return transform(this.segment(), index); }
    /// Sets `transform` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM transformAt(long index, int value) { transform(this.segment(), index, value); return this; }

    /// {@return `renderArea` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment renderAreaAt(long index) { return renderArea(this.segment(), index); }
    /// Sets `renderArea` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderAreaAt(long index, MemorySegment value) { renderArea(this.segment(), index, value); return this; }
    /// Accepts `renderArea` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderAreaAt(long index, Consumer<overrungl.vulkan.struct.VkRect2D> func) { func.accept(overrungl.vulkan.struct.VkRect2D.of(renderAreaAt(index))); return this; }

}
