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

/// Represents `VkDeviceBufferMemoryRequirements`.
/// ## Layout
/// ```
/// struct VkDeviceBufferMemoryRequirements {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const VkBufferCreateInfo* pCreateInfo;
/// };
/// ```
public final class VkDeviceBufferMemoryRequirements extends GroupType {
    /// The struct layout of `VkDeviceBufferMemoryRequirements`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pCreateInfo")
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
    /// The byte offset of `pCreateInfo`.
    public static final long OFFSET_pCreateInfo = LAYOUT.byteOffset(PathElement.groupElement("pCreateInfo"));
    /// The memory layout of `pCreateInfo`.
    public static final MemoryLayout LAYOUT_pCreateInfo = LAYOUT.select(PathElement.groupElement("pCreateInfo"));
    /// The [VarHandle] of `pCreateInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCreateInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCreateInfo"));

    /// Creates `VkDeviceBufferMemoryRequirements` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDeviceBufferMemoryRequirements(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDeviceBufferMemoryRequirements` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceBufferMemoryRequirements of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceBufferMemoryRequirements(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceBufferMemoryRequirements` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceBufferMemoryRequirements ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceBufferMemoryRequirements(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDeviceBufferMemoryRequirements` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceBufferMemoryRequirements ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceBufferMemoryRequirements(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceBufferMemoryRequirements` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceBufferMemoryRequirements`
    public static VkDeviceBufferMemoryRequirements alloc(SegmentAllocator allocator) { return new VkDeviceBufferMemoryRequirements(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDeviceBufferMemoryRequirements` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceBufferMemoryRequirements`
    public static VkDeviceBufferMemoryRequirements alloc(SegmentAllocator allocator, long count) { return new VkDeviceBufferMemoryRequirements(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceBufferMemoryRequirements copyFrom(VkDeviceBufferMemoryRequirements src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDeviceBufferMemoryRequirements reinterpret(long count) { return new VkDeviceBufferMemoryRequirements(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDeviceBufferMemoryRequirements sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDeviceBufferMemoryRequirements pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pCreateInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCreateInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pCreateInfo.get(segment, 0L, index); }
    /// {@return `pCreateInfo`}
    public MemorySegment pCreateInfo() { return pCreateInfo(this.segment(), 0L); }
    /// Sets `pCreateInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCreateInfo(MemorySegment segment, long index, MemorySegment value) { VH_pCreateInfo.set(segment, 0L, index, value); }
    /// Sets `pCreateInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceBufferMemoryRequirements pCreateInfo(MemorySegment value) { pCreateInfo(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDeviceBufferMemoryRequirements`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDeviceBufferMemoryRequirements`
    public VkDeviceBufferMemoryRequirements asSlice(long index) { return new VkDeviceBufferMemoryRequirements(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDeviceBufferMemoryRequirements`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDeviceBufferMemoryRequirements`
    public VkDeviceBufferMemoryRequirements asSlice(long index, long count) { return new VkDeviceBufferMemoryRequirements(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDeviceBufferMemoryRequirements` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDeviceBufferMemoryRequirements at(long index, Consumer<VkDeviceBufferMemoryRequirements> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceBufferMemoryRequirements sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceBufferMemoryRequirements pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pCreateInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pCreateInfoAt(long index) { return pCreateInfo(this.segment(), index); }
    /// Sets `pCreateInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceBufferMemoryRequirements pCreateInfoAt(long index, MemorySegment value) { pCreateInfo(this.segment(), index, value); return this; }

}
