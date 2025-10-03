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

/// Represents `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceBufferDeviceAddressFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 bufferDeviceAddress;
///     (uint32_t) VkBool32 bufferDeviceAddressCaptureReplay;
///     (uint32_t) VkBool32 bufferDeviceAddressMultiDevice;
/// };
/// ```
public final class VkPhysicalDeviceBufferDeviceAddressFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddress"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddressCaptureReplay"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddressMultiDevice")
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
    /// The byte offset of `bufferDeviceAddress`.
    public static final long OFFSET_bufferDeviceAddress = LAYOUT.byteOffset(PathElement.groupElement("bufferDeviceAddress"));
    /// The memory layout of `bufferDeviceAddress`.
    public static final MemoryLayout LAYOUT_bufferDeviceAddress = LAYOUT.select(PathElement.groupElement("bufferDeviceAddress"));
    /// The [VarHandle] of `bufferDeviceAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferDeviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddress"));
    /// The byte offset of `bufferDeviceAddressCaptureReplay`.
    public static final long OFFSET_bufferDeviceAddressCaptureReplay = LAYOUT.byteOffset(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
    /// The memory layout of `bufferDeviceAddressCaptureReplay`.
    public static final MemoryLayout LAYOUT_bufferDeviceAddressCaptureReplay = LAYOUT.select(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
    /// The [VarHandle] of `bufferDeviceAddressCaptureReplay` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferDeviceAddressCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
    /// The byte offset of `bufferDeviceAddressMultiDevice`.
    public static final long OFFSET_bufferDeviceAddressMultiDevice = LAYOUT.byteOffset(PathElement.groupElement("bufferDeviceAddressMultiDevice"));
    /// The memory layout of `bufferDeviceAddressMultiDevice`.
    public static final MemoryLayout LAYOUT_bufferDeviceAddressMultiDevice = LAYOUT.select(PathElement.groupElement("bufferDeviceAddressMultiDevice"));
    /// The [VarHandle] of `bufferDeviceAddressMultiDevice` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferDeviceAddressMultiDevice = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddressMultiDevice"));

    /// Creates `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT`
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT`
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT copyFrom(VkPhysicalDeviceBufferDeviceAddressFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `bufferDeviceAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bufferDeviceAddress(MemorySegment segment, long index) { return (int) VH_bufferDeviceAddress.get(segment, 0L, index); }
    /// {@return `bufferDeviceAddress`}
    public int bufferDeviceAddress() { return bufferDeviceAddress(this.segment(), 0L); }
    /// Sets `bufferDeviceAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferDeviceAddress(MemorySegment segment, long index, int value) { VH_bufferDeviceAddress.set(segment, 0L, index, value); }
    /// Sets `bufferDeviceAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT bufferDeviceAddress(int value) { bufferDeviceAddress(this.segment(), 0L, value); return this; }

    /// {@return `bufferDeviceAddressCaptureReplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bufferDeviceAddressCaptureReplay(MemorySegment segment, long index) { return (int) VH_bufferDeviceAddressCaptureReplay.get(segment, 0L, index); }
    /// {@return `bufferDeviceAddressCaptureReplay`}
    public int bufferDeviceAddressCaptureReplay() { return bufferDeviceAddressCaptureReplay(this.segment(), 0L); }
    /// Sets `bufferDeviceAddressCaptureReplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferDeviceAddressCaptureReplay(MemorySegment segment, long index, int value) { VH_bufferDeviceAddressCaptureReplay.set(segment, 0L, index, value); }
    /// Sets `bufferDeviceAddressCaptureReplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT bufferDeviceAddressCaptureReplay(int value) { bufferDeviceAddressCaptureReplay(this.segment(), 0L, value); return this; }

    /// {@return `bufferDeviceAddressMultiDevice` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bufferDeviceAddressMultiDevice(MemorySegment segment, long index) { return (int) VH_bufferDeviceAddressMultiDevice.get(segment, 0L, index); }
    /// {@return `bufferDeviceAddressMultiDevice`}
    public int bufferDeviceAddressMultiDevice() { return bufferDeviceAddressMultiDevice(this.segment(), 0L); }
    /// Sets `bufferDeviceAddressMultiDevice` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferDeviceAddressMultiDevice(MemorySegment segment, long index, int value) { VH_bufferDeviceAddressMultiDevice.set(segment, 0L, index, value); }
    /// Sets `bufferDeviceAddressMultiDevice` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT bufferDeviceAddressMultiDevice(int value) { bufferDeviceAddressMultiDevice(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT`
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT`
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT at(long index, Consumer<VkPhysicalDeviceBufferDeviceAddressFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `bufferDeviceAddress` at the given index}
    /// @param index the index of the struct buffer
    public int bufferDeviceAddressAt(long index) { return bufferDeviceAddress(this.segment(), index); }
    /// Sets `bufferDeviceAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT bufferDeviceAddressAt(long index, int value) { bufferDeviceAddress(this.segment(), index, value); return this; }

    /// {@return `bufferDeviceAddressCaptureReplay` at the given index}
    /// @param index the index of the struct buffer
    public int bufferDeviceAddressCaptureReplayAt(long index) { return bufferDeviceAddressCaptureReplay(this.segment(), index); }
    /// Sets `bufferDeviceAddressCaptureReplay` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT bufferDeviceAddressCaptureReplayAt(long index, int value) { bufferDeviceAddressCaptureReplay(this.segment(), index, value); return this; }

    /// {@return `bufferDeviceAddressMultiDevice` at the given index}
    /// @param index the index of the struct buffer
    public int bufferDeviceAddressMultiDeviceAt(long index) { return bufferDeviceAddressMultiDevice(this.segment(), index); }
    /// Sets `bufferDeviceAddressMultiDevice` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT bufferDeviceAddressMultiDeviceAt(long index, int value) { bufferDeviceAddressMultiDevice(this.segment(), index, value); return this; }

}
