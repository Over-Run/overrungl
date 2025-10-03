// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceLayeredApiPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceLayeredApiPropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t vendorID;
///     uint32_t deviceID;
///     (int) VkPhysicalDeviceLayeredApiKHR layeredAPI;
///     char deviceName[256];
/// };
/// ```
public final class VkPhysicalDeviceLayeredApiPropertiesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceLayeredApiPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("layeredAPI"),
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("deviceName")
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
    /// The byte offset of `vendorID`.
    public static final long OFFSET_vendorID = LAYOUT.byteOffset(PathElement.groupElement("vendorID"));
    /// The memory layout of `vendorID`.
    public static final MemoryLayout LAYOUT_vendorID = LAYOUT.select(PathElement.groupElement("vendorID"));
    /// The [VarHandle] of `vendorID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_vendorID = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorID")));
    /// The byte offset of `deviceID`.
    public static final long OFFSET_deviceID = LAYOUT.byteOffset(PathElement.groupElement("deviceID"));
    /// The memory layout of `deviceID`.
    public static final MemoryLayout LAYOUT_deviceID = LAYOUT.select(PathElement.groupElement("deviceID"));
    /// The [VarHandle] of `deviceID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_deviceID = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceID")));
    /// The byte offset of `layeredAPI`.
    public static final long OFFSET_layeredAPI = LAYOUT.byteOffset(PathElement.groupElement("layeredAPI"));
    /// The memory layout of `layeredAPI`.
    public static final MemoryLayout LAYOUT_layeredAPI = LAYOUT.select(PathElement.groupElement("layeredAPI"));
    /// The [VarHandle] of `layeredAPI` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_layeredAPI = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("layeredAPI")));
    /// The byte offset of `deviceName`.
    public static final long OFFSET_deviceName = LAYOUT.byteOffset(PathElement.groupElement("deviceName"));
    /// The memory layout of `deviceName`.
    public static final MemoryLayout LAYOUT_deviceName = LAYOUT.select(PathElement.groupElement("deviceName"));
    /// The [VarHandle] of `deviceName` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_deviceName = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceName"), PathElement.sequenceElement()));

    /// Creates `VkPhysicalDeviceLayeredApiPropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceLayeredApiPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceLayeredApiPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLayeredApiPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredApiPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceLayeredApiPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLayeredApiPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredApiPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceLayeredApiPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLayeredApiPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredApiPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceLayeredApiPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLayeredApiPropertiesKHR`
    public static VkPhysicalDeviceLayeredApiPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLayeredApiPropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceLayeredApiPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceLayeredApiPropertiesKHR`
    public static VkPhysicalDeviceLayeredApiPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLayeredApiPropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR copyFrom(VkPhysicalDeviceLayeredApiPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceLayeredApiPropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceLayeredApiPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceLayeredApiPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceLayeredApiPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `vendorID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vendorID(MemorySegment segment, long index) { return (int) VH_vendorID.get().get(segment, 0L, index); }
    /// {@return `vendorID`}
    public int vendorID() { return vendorID(this.segment(), 0L); }
    /// Sets `vendorID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vendorID(MemorySegment segment, long index, int value) { VH_vendorID.get().set(segment, 0L, index, value); }
    /// Sets `vendorID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR vendorID(int value) { vendorID(this.segment(), 0L, value); return this; }

    /// {@return `deviceID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceID(MemorySegment segment, long index) { return (int) VH_deviceID.get().get(segment, 0L, index); }
    /// {@return `deviceID`}
    public int deviceID() { return deviceID(this.segment(), 0L); }
    /// Sets `deviceID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceID(MemorySegment segment, long index, int value) { VH_deviceID.get().set(segment, 0L, index, value); }
    /// Sets `deviceID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR deviceID(int value) { deviceID(this.segment(), 0L, value); return this; }

    /// {@return `layeredAPI` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int layeredAPI(MemorySegment segment, long index) { return (int) VH_layeredAPI.get().get(segment, 0L, index); }
    /// {@return `layeredAPI`}
    public int layeredAPI() { return layeredAPI(this.segment(), 0L); }
    /// Sets `layeredAPI` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layeredAPI(MemorySegment segment, long index, int value) { VH_layeredAPI.get().set(segment, 0L, index, value); }
    /// Sets `layeredAPI` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR layeredAPI(int value) { layeredAPI(this.segment(), 0L, value); return this; }

    /// {@return `deviceName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment deviceName(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_deviceName, index), LAYOUT_deviceName); }
    /// {@return `deviceName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte deviceName(MemorySegment segment, long index, long index0) { return (byte) VH_deviceName.get().get(segment, 0L, index, index0); }
    /// {@return `deviceName`}
    public MemorySegment deviceName() { return deviceName(this.segment(), 0L); }
    /// {@return `deviceName`}
    /// @param index0 the Index 0 of the array
    public byte deviceName(long index0) { return deviceName(this.segment(), 0L, index0); }
    /// Sets `deviceName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceName(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_deviceName, index), LAYOUT_deviceName.byteSize()); }
    /// Sets `deviceName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void deviceName(MemorySegment segment, long index, long index0, byte value) { VH_deviceName.get().set(segment, 0L, index, index0, value); }
    /// Sets `deviceName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR deviceName(MemorySegment value) { deviceName(this.segment(), 0L, value); return this; }
    /// Sets `deviceName` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR deviceName(long index0, byte value) { deviceName(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceLayeredApiPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceLayeredApiPropertiesKHR`
    public VkPhysicalDeviceLayeredApiPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceLayeredApiPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceLayeredApiPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceLayeredApiPropertiesKHR`
    public VkPhysicalDeviceLayeredApiPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceLayeredApiPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceLayeredApiPropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR at(long index, Consumer<VkPhysicalDeviceLayeredApiPropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `vendorID` at the given index}
    /// @param index the index of the struct buffer
    public int vendorIDAt(long index) { return vendorID(this.segment(), index); }
    /// Sets `vendorID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR vendorIDAt(long index, int value) { vendorID(this.segment(), index, value); return this; }

    /// {@return `deviceID` at the given index}
    /// @param index the index of the struct buffer
    public int deviceIDAt(long index) { return deviceID(this.segment(), index); }
    /// Sets `deviceID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR deviceIDAt(long index, int value) { deviceID(this.segment(), index, value); return this; }

    /// {@return `layeredAPI` at the given index}
    /// @param index the index of the struct buffer
    public int layeredAPIAt(long index) { return layeredAPI(this.segment(), index); }
    /// Sets `layeredAPI` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR layeredAPIAt(long index, int value) { layeredAPI(this.segment(), index, value); return this; }

    /// {@return `deviceName` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment deviceNameAt(long index) { return deviceName(this.segment(), index); }
    /// {@return `deviceName` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte deviceNameAt(long index, long index0) { return deviceName(this.segment(), index, index0); }
    /// Sets `deviceName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR deviceNameAt(long index, MemorySegment value) { deviceName(this.segment(), index, value); return this; }
    /// Sets `deviceName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR deviceNameAt(long index, long index0, byte value) { deviceName(this.segment(), index, index0, value); return this; }

}
