// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDebugUtilsMessengerCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkDebugUtilsMessengerCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkDebugUtilsMessengerCreateFlagsEXT flags;
///     ((uint32_t) VkFlags) VkDebugUtilsMessageSeverityFlagsEXT messageSeverity;
///     ((uint32_t) VkFlags) VkDebugUtilsMessageTypeFlagsEXT messageType;
///     ((uint32_t) VkBool32 (*VkDebugUtilsMessengerCallbackEXT)((int) VkDebugUtilsMessageSeverityFlagBitsEXT messageSeverity, ((uint32_t) VkFlags) VkDebugUtilsMessageTypeFlagsEXT messageTypes, const VkDebugUtilsMessengerCallbackDataEXT* pCallbackData, void* pUserData)) PFN_vkDebugUtilsMessengerCallbackEXT pfnUserCallback;
///     void* pUserData;
/// };
/// ```
public final class VkDebugUtilsMessengerCreateInfoEXT extends GroupType {
    /// The struct layout of `VkDebugUtilsMessengerCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("messageSeverity"),
        ValueLayout.JAVA_INT.withName("messageType"),
        ValueLayout.ADDRESS.withName("pfnUserCallback"),
        ValueLayout.ADDRESS.withName("pUserData")
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
    /// The byte offset of `messageSeverity`.
    public static final long OFFSET_messageSeverity = LAYOUT.byteOffset(PathElement.groupElement("messageSeverity"));
    /// The memory layout of `messageSeverity`.
    public static final MemoryLayout LAYOUT_messageSeverity = LAYOUT.select(PathElement.groupElement("messageSeverity"));
    /// The [VarHandle] of `messageSeverity` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_messageSeverity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("messageSeverity"));
    /// The byte offset of `messageType`.
    public static final long OFFSET_messageType = LAYOUT.byteOffset(PathElement.groupElement("messageType"));
    /// The memory layout of `messageType`.
    public static final MemoryLayout LAYOUT_messageType = LAYOUT.select(PathElement.groupElement("messageType"));
    /// The [VarHandle] of `messageType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_messageType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("messageType"));
    /// The byte offset of `pfnUserCallback`.
    public static final long OFFSET_pfnUserCallback = LAYOUT.byteOffset(PathElement.groupElement("pfnUserCallback"));
    /// The memory layout of `pfnUserCallback`.
    public static final MemoryLayout LAYOUT_pfnUserCallback = LAYOUT.select(PathElement.groupElement("pfnUserCallback"));
    /// The [VarHandle] of `pfnUserCallback` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pfnUserCallback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnUserCallback"));
    /// The byte offset of `pUserData`.
    public static final long OFFSET_pUserData = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
    /// The memory layout of `pUserData`.
    public static final MemoryLayout LAYOUT_pUserData = LAYOUT.select(PathElement.groupElement("pUserData"));
    /// The [VarHandle] of `pUserData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pUserData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUserData"));

    /// Creates `VkDebugUtilsMessengerCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDebugUtilsMessengerCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDebugUtilsMessengerCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsMessengerCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsMessengerCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDebugUtilsMessengerCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsMessengerCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsMessengerCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDebugUtilsMessengerCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsMessengerCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsMessengerCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDebugUtilsMessengerCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugUtilsMessengerCreateInfoEXT`
    public static VkDebugUtilsMessengerCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkDebugUtilsMessengerCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDebugUtilsMessengerCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDebugUtilsMessengerCreateInfoEXT`
    public static VkDebugUtilsMessengerCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDebugUtilsMessengerCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT copyFrom(VkDebugUtilsMessengerCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDebugUtilsMessengerCreateInfoEXT reinterpret(long count) { return new VkDebugUtilsMessengerCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDebugUtilsMessengerCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDebugUtilsMessengerCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkDebugUtilsMessengerCreateInfoEXT flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `messageSeverity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int messageSeverity(MemorySegment segment, long index) { return (int) VH_messageSeverity.get(segment, 0L, index); }
    /// {@return `messageSeverity`}
    public int messageSeverity() { return messageSeverity(this.segment(), 0L); }
    /// Sets `messageSeverity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void messageSeverity(MemorySegment segment, long index, int value) { VH_messageSeverity.set(segment, 0L, index, value); }
    /// Sets `messageSeverity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT messageSeverity(int value) { messageSeverity(this.segment(), 0L, value); return this; }

    /// {@return `messageType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int messageType(MemorySegment segment, long index) { return (int) VH_messageType.get(segment, 0L, index); }
    /// {@return `messageType`}
    public int messageType() { return messageType(this.segment(), 0L); }
    /// Sets `messageType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void messageType(MemorySegment segment, long index, int value) { VH_messageType.set(segment, 0L, index, value); }
    /// Sets `messageType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT messageType(int value) { messageType(this.segment(), 0L, value); return this; }

    /// {@return `pfnUserCallback` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pfnUserCallback(MemorySegment segment, long index) { return (MemorySegment) VH_pfnUserCallback.get(segment, 0L, index); }
    /// {@return `pfnUserCallback`}
    public MemorySegment pfnUserCallback() { return pfnUserCallback(this.segment(), 0L); }
    /// Sets `pfnUserCallback` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pfnUserCallback(MemorySegment segment, long index, MemorySegment value) { VH_pfnUserCallback.set(segment, 0L, index, value); }
    /// Sets `pfnUserCallback` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT pfnUserCallback(MemorySegment value) { pfnUserCallback(this.segment(), 0L, value); return this; }

    /// {@return `pUserData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pUserData(MemorySegment segment, long index) { return (MemorySegment) VH_pUserData.get(segment, 0L, index); }
    /// {@return `pUserData`}
    public MemorySegment pUserData() { return pUserData(this.segment(), 0L); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pUserData(MemorySegment segment, long index, MemorySegment value) { VH_pUserData.set(segment, 0L, index, value); }
    /// Sets `pUserData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT pUserData(MemorySegment value) { pUserData(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDebugUtilsMessengerCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDebugUtilsMessengerCreateInfoEXT`
    public VkDebugUtilsMessengerCreateInfoEXT asSlice(long index) { return new VkDebugUtilsMessengerCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDebugUtilsMessengerCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDebugUtilsMessengerCreateInfoEXT`
    public VkDebugUtilsMessengerCreateInfoEXT asSlice(long index, long count) { return new VkDebugUtilsMessengerCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDebugUtilsMessengerCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT at(long index, Consumer<VkDebugUtilsMessengerCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `messageSeverity` at the given index}
    /// @param index the index of the struct buffer
    public int messageSeverityAt(long index) { return messageSeverity(this.segment(), index); }
    /// Sets `messageSeverity` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT messageSeverityAt(long index, int value) { messageSeverity(this.segment(), index, value); return this; }

    /// {@return `messageType` at the given index}
    /// @param index the index of the struct buffer
    public int messageTypeAt(long index) { return messageType(this.segment(), index); }
    /// Sets `messageType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT messageTypeAt(long index, int value) { messageType(this.segment(), index, value); return this; }

    /// {@return `pfnUserCallback` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pfnUserCallbackAt(long index) { return pfnUserCallback(this.segment(), index); }
    /// Sets `pfnUserCallback` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT pfnUserCallbackAt(long index, MemorySegment value) { pfnUserCallback(this.segment(), index, value); return this; }

    /// {@return `pUserData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pUserDataAt(long index) { return pUserData(this.segment(), index); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT pUserDataAt(long index, MemorySegment value) { pUserData(this.segment(), index, value); return this; }

}
