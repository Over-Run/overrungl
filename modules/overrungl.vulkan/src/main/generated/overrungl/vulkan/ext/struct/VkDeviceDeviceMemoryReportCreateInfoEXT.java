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

/// Represents `VkDeviceDeviceMemoryReportCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkDeviceDeviceMemoryReportCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkDeviceMemoryReportFlagsEXT flags;
///     (void (*VkDeviceMemoryReportCallbackEXT)(const VkDeviceMemoryReportCallbackDataEXT* pCallbackData, void* pUserData)) PFN_vkDeviceMemoryReportCallbackEXT pfnUserCallback;
///     void* pUserData;
/// };
/// ```
public final class VkDeviceDeviceMemoryReportCreateInfoEXT extends GroupType {
    /// The struct layout of `VkDeviceDeviceMemoryReportCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pfnUserCallback"),
        ValueLayout.ADDRESS.withName("pUserData")
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
    /// The byte offset of `pfnUserCallback`.
    public static final long OFFSET_pfnUserCallback = LAYOUT.byteOffset(PathElement.groupElement("pfnUserCallback"));
    /// The memory layout of `pfnUserCallback`.
    public static final MemoryLayout LAYOUT_pfnUserCallback = LAYOUT.select(PathElement.groupElement("pfnUserCallback"));
    /// The [VarHandle] of `pfnUserCallback` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pfnUserCallback = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnUserCallback")));
    /// The byte offset of `pUserData`.
    public static final long OFFSET_pUserData = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
    /// The memory layout of `pUserData`.
    public static final MemoryLayout LAYOUT_pUserData = LAYOUT.select(PathElement.groupElement("pUserData"));
    /// The [VarHandle] of `pUserData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pUserData = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUserData")));

    /// Creates `VkDeviceDeviceMemoryReportCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDeviceDeviceMemoryReportCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDeviceDeviceMemoryReportCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceDeviceMemoryReportCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceDeviceMemoryReportCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceDeviceMemoryReportCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceDeviceMemoryReportCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceDeviceMemoryReportCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDeviceDeviceMemoryReportCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceDeviceMemoryReportCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceDeviceMemoryReportCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceDeviceMemoryReportCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceDeviceMemoryReportCreateInfoEXT`
    public static VkDeviceDeviceMemoryReportCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkDeviceDeviceMemoryReportCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDeviceDeviceMemoryReportCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceDeviceMemoryReportCreateInfoEXT`
    public static VkDeviceDeviceMemoryReportCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDeviceDeviceMemoryReportCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceDeviceMemoryReportCreateInfoEXT copyFrom(VkDeviceDeviceMemoryReportCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDeviceDeviceMemoryReportCreateInfoEXT reinterpret(long count) { return new VkDeviceDeviceMemoryReportCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDeviceDeviceMemoryReportCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDeviceDeviceMemoryReportCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get().get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.get().set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceDeviceMemoryReportCreateInfoEXT flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `pfnUserCallback` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pfnUserCallback(MemorySegment segment, long index) { return (MemorySegment) VH_pfnUserCallback.get().get(segment, 0L, index); }
    /// {@return `pfnUserCallback`}
    public MemorySegment pfnUserCallback() { return pfnUserCallback(this.segment(), 0L); }
    /// Sets `pfnUserCallback` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pfnUserCallback(MemorySegment segment, long index, MemorySegment value) { VH_pfnUserCallback.get().set(segment, 0L, index, value); }
    /// Sets `pfnUserCallback` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceDeviceMemoryReportCreateInfoEXT pfnUserCallback(MemorySegment value) { pfnUserCallback(this.segment(), 0L, value); return this; }

    /// {@return `pUserData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pUserData(MemorySegment segment, long index) { return (MemorySegment) VH_pUserData.get().get(segment, 0L, index); }
    /// {@return `pUserData`}
    public MemorySegment pUserData() { return pUserData(this.segment(), 0L); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pUserData(MemorySegment segment, long index, MemorySegment value) { VH_pUserData.get().set(segment, 0L, index, value); }
    /// Sets `pUserData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceDeviceMemoryReportCreateInfoEXT pUserData(MemorySegment value) { pUserData(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDeviceDeviceMemoryReportCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDeviceDeviceMemoryReportCreateInfoEXT`
    public VkDeviceDeviceMemoryReportCreateInfoEXT asSlice(long index) { return new VkDeviceDeviceMemoryReportCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDeviceDeviceMemoryReportCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDeviceDeviceMemoryReportCreateInfoEXT`
    public VkDeviceDeviceMemoryReportCreateInfoEXT asSlice(long index, long count) { return new VkDeviceDeviceMemoryReportCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDeviceDeviceMemoryReportCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDeviceDeviceMemoryReportCreateInfoEXT at(long index, Consumer<VkDeviceDeviceMemoryReportCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceDeviceMemoryReportCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceDeviceMemoryReportCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceDeviceMemoryReportCreateInfoEXT flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `pfnUserCallback` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pfnUserCallbackAt(long index) { return pfnUserCallback(this.segment(), index); }
    /// Sets `pfnUserCallback` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceDeviceMemoryReportCreateInfoEXT pfnUserCallbackAt(long index, MemorySegment value) { pfnUserCallback(this.segment(), index, value); return this; }

    /// {@return `pUserData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pUserDataAt(long index) { return pUserData(this.segment(), index); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceDeviceMemoryReportCreateInfoEXT pUserDataAt(long index, MemorySegment value) { pUserData(this.segment(), index, value); return this; }

}
