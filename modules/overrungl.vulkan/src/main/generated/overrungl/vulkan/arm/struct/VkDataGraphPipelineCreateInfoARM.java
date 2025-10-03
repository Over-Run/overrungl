// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelineCreateInfoARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineCreateInfoARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (((uint64_t) VkFlags64) VkPipelineCreateFlags2) VkPipelineCreateFlags2KHR flags;
///     (uint64_t) VkPipelineLayout layout;
///     uint32_t resourceInfoCount;
///     const VkDataGraphPipelineResourceInfoARM* pResourceInfos;
/// };
/// ```
public final class VkDataGraphPipelineCreateInfoARM extends GroupType {
    /// The struct layout of `VkDataGraphPipelineCreateInfoARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("flags"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_INT.withName("resourceInfoCount"),
        ValueLayout.ADDRESS.withName("pResourceInfos")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_flags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags")));
    /// The byte offset of `layout`.
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    /// The memory layout of `layout`.
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_layout = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout")));
    /// The byte offset of `resourceInfoCount`.
    public static final long OFFSET_resourceInfoCount = LAYOUT.byteOffset(PathElement.groupElement("resourceInfoCount"));
    /// The memory layout of `resourceInfoCount`.
    public static final MemoryLayout LAYOUT_resourceInfoCount = LAYOUT.select(PathElement.groupElement("resourceInfoCount"));
    /// The [VarHandle] of `resourceInfoCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_resourceInfoCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("resourceInfoCount")));
    /// The byte offset of `pResourceInfos`.
    public static final long OFFSET_pResourceInfos = LAYOUT.byteOffset(PathElement.groupElement("pResourceInfos"));
    /// The memory layout of `pResourceInfos`.
    public static final MemoryLayout LAYOUT_pResourceInfos = LAYOUT.select(PathElement.groupElement("pResourceInfos"));
    /// The [VarHandle] of `pResourceInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pResourceInfos = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pResourceInfos")));

    /// Creates `VkDataGraphPipelineCreateInfoARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDataGraphPipelineCreateInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDataGraphPipelineCreateInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineCreateInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineCreateInfoARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDataGraphPipelineCreateInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineCreateInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineCreateInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDataGraphPipelineCreateInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineCreateInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineCreateInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDataGraphPipelineCreateInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDataGraphPipelineCreateInfoARM`
    public static VkDataGraphPipelineCreateInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineCreateInfoARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDataGraphPipelineCreateInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDataGraphPipelineCreateInfoARM`
    public static VkDataGraphPipelineCreateInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineCreateInfoARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDataGraphPipelineCreateInfoARM copyFrom(VkDataGraphPipelineCreateInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDataGraphPipelineCreateInfoARM reinterpret(long count) { return new VkDataGraphPipelineCreateInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDataGraphPipelineCreateInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDataGraphPipelineCreateInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long flags(MemorySegment segment, long index) { return (long) VH_flags.get().get(segment, 0L, index); }
    /// {@return `flags`}
    public long flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, long value) { VH_flags.get().set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineCreateInfoARM flags(long value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long layout(MemorySegment segment, long index) { return (long) VH_layout.get().get(segment, 0L, index); }
    /// {@return `layout`}
    public long layout() { return layout(this.segment(), 0L); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layout(MemorySegment segment, long index, long value) { VH_layout.get().set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineCreateInfoARM layout(long value) { layout(this.segment(), 0L, value); return this; }

    /// {@return `resourceInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int resourceInfoCount(MemorySegment segment, long index) { return (int) VH_resourceInfoCount.get().get(segment, 0L, index); }
    /// {@return `resourceInfoCount`}
    public int resourceInfoCount() { return resourceInfoCount(this.segment(), 0L); }
    /// Sets `resourceInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void resourceInfoCount(MemorySegment segment, long index, int value) { VH_resourceInfoCount.get().set(segment, 0L, index, value); }
    /// Sets `resourceInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineCreateInfoARM resourceInfoCount(int value) { resourceInfoCount(this.segment(), 0L, value); return this; }

    /// {@return `pResourceInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pResourceInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pResourceInfos.get().get(segment, 0L, index); }
    /// {@return `pResourceInfos`}
    public MemorySegment pResourceInfos() { return pResourceInfos(this.segment(), 0L); }
    /// Sets `pResourceInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pResourceInfos(MemorySegment segment, long index, MemorySegment value) { VH_pResourceInfos.get().set(segment, 0L, index, value); }
    /// Sets `pResourceInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineCreateInfoARM pResourceInfos(MemorySegment value) { pResourceInfos(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDataGraphPipelineCreateInfoARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDataGraphPipelineCreateInfoARM`
    public VkDataGraphPipelineCreateInfoARM asSlice(long index) { return new VkDataGraphPipelineCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDataGraphPipelineCreateInfoARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDataGraphPipelineCreateInfoARM`
    public VkDataGraphPipelineCreateInfoARM asSlice(long index, long count) { return new VkDataGraphPipelineCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDataGraphPipelineCreateInfoARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDataGraphPipelineCreateInfoARM at(long index, Consumer<VkDataGraphPipelineCreateInfoARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineCreateInfoARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineCreateInfoARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public long flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineCreateInfoARM flagsAt(long index, long value) { flags(this.segment(), index, value); return this; }

    /// {@return `layout` at the given index}
    /// @param index the index of the struct buffer
    public long layoutAt(long index) { return layout(this.segment(), index); }
    /// Sets `layout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineCreateInfoARM layoutAt(long index, long value) { layout(this.segment(), index, value); return this; }

    /// {@return `resourceInfoCount` at the given index}
    /// @param index the index of the struct buffer
    public int resourceInfoCountAt(long index) { return resourceInfoCount(this.segment(), index); }
    /// Sets `resourceInfoCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineCreateInfoARM resourceInfoCountAt(long index, int value) { resourceInfoCount(this.segment(), index, value); return this; }

    /// {@return `pResourceInfos` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pResourceInfosAt(long index) { return pResourceInfos(this.segment(), index); }
    /// Sets `pResourceInfos` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineCreateInfoARM pResourceInfosAt(long index, MemorySegment value) { pResourceInfos(this.segment(), index, value); return this; }

}
