// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIndirectCommandsExecutionSetTokenEXT`.
/// ## Layout
/// ```
/// struct VkIndirectCommandsExecutionSetTokenEXT {
///     (int) VkIndirectExecutionSetInfoTypeEXT type;
///     ((uint32_t) VkFlags) VkShaderStageFlags shaderStages;
/// };
/// ```
public final class VkIndirectCommandsExecutionSetTokenEXT extends GroupType {
    /// The struct layout of `VkIndirectCommandsExecutionSetTokenEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("shaderStages")
    );
    /// The byte offset of `type`.
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    /// The memory layout of `type`.
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_type = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("type")));
    /// The byte offset of `shaderStages`.
    public static final long OFFSET_shaderStages = LAYOUT.byteOffset(PathElement.groupElement("shaderStages"));
    /// The memory layout of `shaderStages`.
    public static final MemoryLayout LAYOUT_shaderStages = LAYOUT.select(PathElement.groupElement("shaderStages"));
    /// The [VarHandle] of `shaderStages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_shaderStages = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStages")));

    /// Creates `VkIndirectCommandsExecutionSetTokenEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkIndirectCommandsExecutionSetTokenEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkIndirectCommandsExecutionSetTokenEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsExecutionSetTokenEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsExecutionSetTokenEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectCommandsExecutionSetTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsExecutionSetTokenEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsExecutionSetTokenEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkIndirectCommandsExecutionSetTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsExecutionSetTokenEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsExecutionSetTokenEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkIndirectCommandsExecutionSetTokenEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsExecutionSetTokenEXT`
    public static VkIndirectCommandsExecutionSetTokenEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsExecutionSetTokenEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkIndirectCommandsExecutionSetTokenEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsExecutionSetTokenEXT`
    public static VkIndirectCommandsExecutionSetTokenEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsExecutionSetTokenEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectCommandsExecutionSetTokenEXT copyFrom(VkIndirectCommandsExecutionSetTokenEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkIndirectCommandsExecutionSetTokenEXT reinterpret(long count) { return new VkIndirectCommandsExecutionSetTokenEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int type(MemorySegment segment, long index) { return (int) VH_type.get().get(segment, 0L, index); }
    /// {@return `type`}
    public int type() { return type(this.segment(), 0L); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void type(MemorySegment segment, long index, int value) { VH_type.get().set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsExecutionSetTokenEXT type(int value) { type(this.segment(), 0L, value); return this; }

    /// {@return `shaderStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStages(MemorySegment segment, long index) { return (int) VH_shaderStages.get().get(segment, 0L, index); }
    /// {@return `shaderStages`}
    public int shaderStages() { return shaderStages(this.segment(), 0L); }
    /// Sets `shaderStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStages(MemorySegment segment, long index, int value) { VH_shaderStages.get().set(segment, 0L, index, value); }
    /// Sets `shaderStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsExecutionSetTokenEXT shaderStages(int value) { shaderStages(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkIndirectCommandsExecutionSetTokenEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkIndirectCommandsExecutionSetTokenEXT`
    public VkIndirectCommandsExecutionSetTokenEXT asSlice(long index) { return new VkIndirectCommandsExecutionSetTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkIndirectCommandsExecutionSetTokenEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkIndirectCommandsExecutionSetTokenEXT`
    public VkIndirectCommandsExecutionSetTokenEXT asSlice(long index, long count) { return new VkIndirectCommandsExecutionSetTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkIndirectCommandsExecutionSetTokenEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkIndirectCommandsExecutionSetTokenEXT at(long index, Consumer<VkIndirectCommandsExecutionSetTokenEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `type` at the given index}
    /// @param index the index of the struct buffer
    public int typeAt(long index) { return type(this.segment(), index); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsExecutionSetTokenEXT typeAt(long index, int value) { type(this.segment(), index, value); return this; }

    /// {@return `shaderStages` at the given index}
    /// @param index the index of the struct buffer
    public int shaderStagesAt(long index) { return shaderStages(this.segment(), index); }
    /// Sets `shaderStages` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsExecutionSetTokenEXT shaderStagesAt(long index, int value) { shaderStages(this.segment(), index, value); return this; }

}
