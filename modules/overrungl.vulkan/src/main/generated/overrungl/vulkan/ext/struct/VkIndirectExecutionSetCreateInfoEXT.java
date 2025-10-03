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

/// Represents `VkIndirectExecutionSetCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkIndirectExecutionSetCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkIndirectExecutionSetInfoTypeEXT type;
///     (union VkIndirectExecutionSetInfoEXT) VkIndirectExecutionSetInfoEXT info;
/// };
/// ```
public final class VkIndirectExecutionSetCreateInfoEXT extends GroupType {
    /// The struct layout of `VkIndirectExecutionSetCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        overrungl.vulkan.ext.union.VkIndirectExecutionSetInfoEXT.LAYOUT.withName("info")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType")));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pNext = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext")));
    /// The byte offset of `type`.
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    /// The memory layout of `type`.
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_type = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("type")));
    /// The byte offset of `info`.
    public static final long OFFSET_info = LAYOUT.byteOffset(PathElement.groupElement("info"));
    /// The memory layout of `info`.
    public static final MemoryLayout LAYOUT_info = LAYOUT.select(PathElement.groupElement("info"));

    /// Creates `VkIndirectExecutionSetCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkIndirectExecutionSetCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkIndirectExecutionSetCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectExecutionSetCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkIndirectExecutionSetCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkIndirectExecutionSetCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectExecutionSetCreateInfoEXT`
    public static VkIndirectExecutionSetCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectExecutionSetCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkIndirectExecutionSetCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectExecutionSetCreateInfoEXT`
    public static VkIndirectExecutionSetCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectExecutionSetCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT copyFrom(VkIndirectExecutionSetCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkIndirectExecutionSetCreateInfoEXT reinterpret(long count) { return new VkIndirectExecutionSetCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get().get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.get().set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get().get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.get().set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkIndirectExecutionSetCreateInfoEXT type(int value) { type(this.segment(), 0L, value); return this; }

    /// {@return `info` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment info(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_info, index), LAYOUT_info); }
    /// {@return `info`}
    public MemorySegment info() { return info(this.segment(), 0L); }
    /// Sets `info` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void info(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_info, index), LAYOUT_info.byteSize()); }
    /// Sets `info` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT info(MemorySegment value) { info(this.segment(), 0L, value); return this; }
    /// Accepts `info` with the given function.
    /// @param func the function
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT info(Consumer<overrungl.vulkan.ext.union.VkIndirectExecutionSetInfoEXT> func) { func.accept(overrungl.vulkan.ext.union.VkIndirectExecutionSetInfoEXT.of(info())); return this; }

    /// Creates a slice of `VkIndirectExecutionSetCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkIndirectExecutionSetCreateInfoEXT`
    public VkIndirectExecutionSetCreateInfoEXT asSlice(long index) { return new VkIndirectExecutionSetCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkIndirectExecutionSetCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkIndirectExecutionSetCreateInfoEXT`
    public VkIndirectExecutionSetCreateInfoEXT asSlice(long index, long count) { return new VkIndirectExecutionSetCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkIndirectExecutionSetCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT at(long index, Consumer<VkIndirectExecutionSetCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `type` at the given index}
    /// @param index the index of the struct buffer
    public int typeAt(long index) { return type(this.segment(), index); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT typeAt(long index, int value) { type(this.segment(), index, value); return this; }

    /// {@return `info` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment infoAt(long index) { return info(this.segment(), index); }
    /// Sets `info` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT infoAt(long index, MemorySegment value) { info(this.segment(), index, value); return this; }
    /// Accepts `info` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkIndirectExecutionSetCreateInfoEXT infoAt(long index, Consumer<overrungl.vulkan.ext.union.VkIndirectExecutionSetInfoEXT> func) { func.accept(overrungl.vulkan.ext.union.VkIndirectExecutionSetInfoEXT.of(infoAt(index))); return this; }

}
