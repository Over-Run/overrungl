// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.qcom.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSamplerBlockMatchWindowCreateInfoQCOM`.
/// ## Layout
/// ```
/// struct VkSamplerBlockMatchWindowCreateInfoQCOM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (struct VkExtent2D) VkExtent2D windowExtent;
///     (int) VkBlockMatchWindowCompareModeQCOM windowCompareMode;
/// };
/// ```
public final class VkSamplerBlockMatchWindowCreateInfoQCOM extends GroupType {
    /// The struct layout of `VkSamplerBlockMatchWindowCreateInfoQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("windowExtent"),
        ValueLayout.JAVA_INT.withName("windowCompareMode")
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
    /// The byte offset of `windowExtent`.
    public static final long OFFSET_windowExtent = LAYOUT.byteOffset(PathElement.groupElement("windowExtent"));
    /// The memory layout of `windowExtent`.
    public static final MemoryLayout LAYOUT_windowExtent = LAYOUT.select(PathElement.groupElement("windowExtent"));
    /// The byte offset of `windowCompareMode`.
    public static final long OFFSET_windowCompareMode = LAYOUT.byteOffset(PathElement.groupElement("windowCompareMode"));
    /// The memory layout of `windowCompareMode`.
    public static final MemoryLayout LAYOUT_windowCompareMode = LAYOUT.select(PathElement.groupElement("windowCompareMode"));
    /// The [VarHandle] of `windowCompareMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_windowCompareMode = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("windowCompareMode")));

    /// Creates `VkSamplerBlockMatchWindowCreateInfoQCOM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSamplerBlockMatchWindowCreateInfoQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSamplerBlockMatchWindowCreateInfoQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerBlockMatchWindowCreateInfoQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerBlockMatchWindowCreateInfoQCOM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSamplerBlockMatchWindowCreateInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerBlockMatchWindowCreateInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerBlockMatchWindowCreateInfoQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSamplerBlockMatchWindowCreateInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerBlockMatchWindowCreateInfoQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerBlockMatchWindowCreateInfoQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSamplerBlockMatchWindowCreateInfoQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerBlockMatchWindowCreateInfoQCOM`
    public static VkSamplerBlockMatchWindowCreateInfoQCOM alloc(SegmentAllocator allocator) { return new VkSamplerBlockMatchWindowCreateInfoQCOM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSamplerBlockMatchWindowCreateInfoQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerBlockMatchWindowCreateInfoQCOM`
    public static VkSamplerBlockMatchWindowCreateInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkSamplerBlockMatchWindowCreateInfoQCOM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSamplerBlockMatchWindowCreateInfoQCOM copyFrom(VkSamplerBlockMatchWindowCreateInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSamplerBlockMatchWindowCreateInfoQCOM reinterpret(long count) { return new VkSamplerBlockMatchWindowCreateInfoQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSamplerBlockMatchWindowCreateInfoQCOM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSamplerBlockMatchWindowCreateInfoQCOM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `windowExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment windowExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_windowExtent, index), LAYOUT_windowExtent); }
    /// {@return `windowExtent`}
    public MemorySegment windowExtent() { return windowExtent(this.segment(), 0L); }
    /// Sets `windowExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void windowExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_windowExtent, index), LAYOUT_windowExtent.byteSize()); }
    /// Sets `windowExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowExtent(MemorySegment value) { windowExtent(this.segment(), 0L, value); return this; }
    /// Accepts `windowExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowExtent(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(windowExtent())); return this; }

    /// {@return `windowCompareMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int windowCompareMode(MemorySegment segment, long index) { return (int) VH_windowCompareMode.get().get(segment, 0L, index); }
    /// {@return `windowCompareMode`}
    public int windowCompareMode() { return windowCompareMode(this.segment(), 0L); }
    /// Sets `windowCompareMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void windowCompareMode(MemorySegment segment, long index, int value) { VH_windowCompareMode.get().set(segment, 0L, index, value); }
    /// Sets `windowCompareMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowCompareMode(int value) { windowCompareMode(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSamplerBlockMatchWindowCreateInfoQCOM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSamplerBlockMatchWindowCreateInfoQCOM`
    public VkSamplerBlockMatchWindowCreateInfoQCOM asSlice(long index) { return new VkSamplerBlockMatchWindowCreateInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSamplerBlockMatchWindowCreateInfoQCOM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSamplerBlockMatchWindowCreateInfoQCOM`
    public VkSamplerBlockMatchWindowCreateInfoQCOM asSlice(long index, long count) { return new VkSamplerBlockMatchWindowCreateInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSamplerBlockMatchWindowCreateInfoQCOM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSamplerBlockMatchWindowCreateInfoQCOM at(long index, Consumer<VkSamplerBlockMatchWindowCreateInfoQCOM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerBlockMatchWindowCreateInfoQCOM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerBlockMatchWindowCreateInfoQCOM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `windowExtent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment windowExtentAt(long index) { return windowExtent(this.segment(), index); }
    /// Sets `windowExtent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowExtentAt(long index, MemorySegment value) { windowExtent(this.segment(), index, value); return this; }
    /// Accepts `windowExtent` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(windowExtentAt(index))); return this; }

    /// {@return `windowCompareMode` at the given index}
    /// @param index the index of the struct buffer
    public int windowCompareModeAt(long index) { return windowCompareMode(this.segment(), index); }
    /// Sets `windowCompareMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowCompareModeAt(long index, int value) { windowCompareMode(this.segment(), index, value); return this; }

}
