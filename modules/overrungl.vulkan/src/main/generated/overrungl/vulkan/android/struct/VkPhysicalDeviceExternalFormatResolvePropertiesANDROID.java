// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.android.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExternalFormatResolvePropertiesANDROID {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 nullColorAttachmentWithExternalFormatResolve;
///     (int) VkChromaLocation externalFormatResolveChromaOffsetX;
///     (int) VkChromaLocation externalFormatResolveChromaOffsetY;
/// };
/// ```
public final class VkPhysicalDeviceExternalFormatResolvePropertiesANDROID extends GroupType {
    /// The struct layout of `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("nullColorAttachmentWithExternalFormatResolve"),
        ValueLayout.JAVA_INT.withName("externalFormatResolveChromaOffsetX"),
        ValueLayout.JAVA_INT.withName("externalFormatResolveChromaOffsetY")
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
    /// The byte offset of `nullColorAttachmentWithExternalFormatResolve`.
    public static final long OFFSET_nullColorAttachmentWithExternalFormatResolve = LAYOUT.byteOffset(PathElement.groupElement("nullColorAttachmentWithExternalFormatResolve"));
    /// The memory layout of `nullColorAttachmentWithExternalFormatResolve`.
    public static final MemoryLayout LAYOUT_nullColorAttachmentWithExternalFormatResolve = LAYOUT.select(PathElement.groupElement("nullColorAttachmentWithExternalFormatResolve"));
    /// The [VarHandle] of `nullColorAttachmentWithExternalFormatResolve` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_nullColorAttachmentWithExternalFormatResolve = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("nullColorAttachmentWithExternalFormatResolve")));
    /// The byte offset of `externalFormatResolveChromaOffsetX`.
    public static final long OFFSET_externalFormatResolveChromaOffsetX = LAYOUT.byteOffset(PathElement.groupElement("externalFormatResolveChromaOffsetX"));
    /// The memory layout of `externalFormatResolveChromaOffsetX`.
    public static final MemoryLayout LAYOUT_externalFormatResolveChromaOffsetX = LAYOUT.select(PathElement.groupElement("externalFormatResolveChromaOffsetX"));
    /// The [VarHandle] of `externalFormatResolveChromaOffsetX` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_externalFormatResolveChromaOffsetX = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFormatResolveChromaOffsetX")));
    /// The byte offset of `externalFormatResolveChromaOffsetY`.
    public static final long OFFSET_externalFormatResolveChromaOffsetY = LAYOUT.byteOffset(PathElement.groupElement("externalFormatResolveChromaOffsetY"));
    /// The memory layout of `externalFormatResolveChromaOffsetY`.
    public static final MemoryLayout LAYOUT_externalFormatResolveChromaOffsetY = LAYOUT.select(PathElement.groupElement("externalFormatResolveChromaOffsetY"));
    /// The [VarHandle] of `externalFormatResolveChromaOffsetY` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_externalFormatResolveChromaOffsetY = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFormatResolveChromaOffsetY")));

    /// Creates `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID`
    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID`
    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID copyFrom(VkPhysicalDeviceExternalFormatResolvePropertiesANDROID src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID reinterpret(long count) { return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `nullColorAttachmentWithExternalFormatResolve` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int nullColorAttachmentWithExternalFormatResolve(MemorySegment segment, long index) { return (int) VH_nullColorAttachmentWithExternalFormatResolve.get().get(segment, 0L, index); }
    /// {@return `nullColorAttachmentWithExternalFormatResolve`}
    public int nullColorAttachmentWithExternalFormatResolve() { return nullColorAttachmentWithExternalFormatResolve(this.segment(), 0L); }
    /// Sets `nullColorAttachmentWithExternalFormatResolve` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void nullColorAttachmentWithExternalFormatResolve(MemorySegment segment, long index, int value) { VH_nullColorAttachmentWithExternalFormatResolve.get().set(segment, 0L, index, value); }
    /// Sets `nullColorAttachmentWithExternalFormatResolve` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID nullColorAttachmentWithExternalFormatResolve(int value) { nullColorAttachmentWithExternalFormatResolve(this.segment(), 0L, value); return this; }

    /// {@return `externalFormatResolveChromaOffsetX` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int externalFormatResolveChromaOffsetX(MemorySegment segment, long index) { return (int) VH_externalFormatResolveChromaOffsetX.get().get(segment, 0L, index); }
    /// {@return `externalFormatResolveChromaOffsetX`}
    public int externalFormatResolveChromaOffsetX() { return externalFormatResolveChromaOffsetX(this.segment(), 0L); }
    /// Sets `externalFormatResolveChromaOffsetX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void externalFormatResolveChromaOffsetX(MemorySegment segment, long index, int value) { VH_externalFormatResolveChromaOffsetX.get().set(segment, 0L, index, value); }
    /// Sets `externalFormatResolveChromaOffsetX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID externalFormatResolveChromaOffsetX(int value) { externalFormatResolveChromaOffsetX(this.segment(), 0L, value); return this; }

    /// {@return `externalFormatResolveChromaOffsetY` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int externalFormatResolveChromaOffsetY(MemorySegment segment, long index) { return (int) VH_externalFormatResolveChromaOffsetY.get().get(segment, 0L, index); }
    /// {@return `externalFormatResolveChromaOffsetY`}
    public int externalFormatResolveChromaOffsetY() { return externalFormatResolveChromaOffsetY(this.segment(), 0L); }
    /// Sets `externalFormatResolveChromaOffsetY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void externalFormatResolveChromaOffsetY(MemorySegment segment, long index, int value) { VH_externalFormatResolveChromaOffsetY.get().set(segment, 0L, index, value); }
    /// Sets `externalFormatResolveChromaOffsetY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID externalFormatResolveChromaOffsetY(int value) { externalFormatResolveChromaOffsetY(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID`
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID asSlice(long index) { return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID`
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID asSlice(long index, long count) { return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID at(long index, Consumer<VkPhysicalDeviceExternalFormatResolvePropertiesANDROID> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `nullColorAttachmentWithExternalFormatResolve` at the given index}
    /// @param index the index of the struct buffer
    public int nullColorAttachmentWithExternalFormatResolveAt(long index) { return nullColorAttachmentWithExternalFormatResolve(this.segment(), index); }
    /// Sets `nullColorAttachmentWithExternalFormatResolve` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID nullColorAttachmentWithExternalFormatResolveAt(long index, int value) { nullColorAttachmentWithExternalFormatResolve(this.segment(), index, value); return this; }

    /// {@return `externalFormatResolveChromaOffsetX` at the given index}
    /// @param index the index of the struct buffer
    public int externalFormatResolveChromaOffsetXAt(long index) { return externalFormatResolveChromaOffsetX(this.segment(), index); }
    /// Sets `externalFormatResolveChromaOffsetX` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID externalFormatResolveChromaOffsetXAt(long index, int value) { externalFormatResolveChromaOffsetX(this.segment(), index, value); return this; }

    /// {@return `externalFormatResolveChromaOffsetY` at the given index}
    /// @param index the index of the struct buffer
    public int externalFormatResolveChromaOffsetYAt(long index) { return externalFormatResolveChromaOffsetY(this.segment(), index); }
    /// Sets `externalFormatResolveChromaOffsetY` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID externalFormatResolveChromaOffsetYAt(long index, int value) { externalFormatResolveChromaOffsetY(this.segment(), index, value); return this; }

}
