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

/// Represents `VkPhysicalDeviceDriverPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDriverPropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkDriverId driverID;
///     char driverName[256];
///     char driverInfo[256];
///     (struct VkConformanceVersion) VkConformanceVersion conformanceVersion;
/// };
/// ```
public final class VkPhysicalDeviceDriverPropertiesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDriverPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("driverID"),
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("driverName"),
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("driverInfo"),
        overrungl.vulkan.struct.VkConformanceVersion.LAYOUT.withName("conformanceVersion")
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
    /// The byte offset of `driverID`.
    public static final long OFFSET_driverID = LAYOUT.byteOffset(PathElement.groupElement("driverID"));
    /// The memory layout of `driverID`.
    public static final MemoryLayout LAYOUT_driverID = LAYOUT.select(PathElement.groupElement("driverID"));
    /// The [VarHandle] of `driverID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_driverID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverID"));
    /// The byte offset of `driverName`.
    public static final long OFFSET_driverName = LAYOUT.byteOffset(PathElement.groupElement("driverName"));
    /// The memory layout of `driverName`.
    public static final MemoryLayout LAYOUT_driverName = LAYOUT.select(PathElement.groupElement("driverName"));
    /// The [VarHandle] of `driverName` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_driverName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverName"), PathElement.sequenceElement());
    /// The byte offset of `driverInfo`.
    public static final long OFFSET_driverInfo = LAYOUT.byteOffset(PathElement.groupElement("driverInfo"));
    /// The memory layout of `driverInfo`.
    public static final MemoryLayout LAYOUT_driverInfo = LAYOUT.select(PathElement.groupElement("driverInfo"));
    /// The [VarHandle] of `driverInfo` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_driverInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverInfo"), PathElement.sequenceElement());
    /// The byte offset of `conformanceVersion`.
    public static final long OFFSET_conformanceVersion = LAYOUT.byteOffset(PathElement.groupElement("conformanceVersion"));
    /// The memory layout of `conformanceVersion`.
    public static final MemoryLayout LAYOUT_conformanceVersion = LAYOUT.select(PathElement.groupElement("conformanceVersion"));

    /// Creates `VkPhysicalDeviceDriverPropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceDriverPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceDriverPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDriverPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDriverPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDriverPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDriverPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDriverPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceDriverPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDriverPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDriverPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceDriverPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDriverPropertiesKHR`
    public static VkPhysicalDeviceDriverPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDriverPropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceDriverPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDriverPropertiesKHR`
    public static VkPhysicalDeviceDriverPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDriverPropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDriverPropertiesKHR copyFrom(VkPhysicalDeviceDriverPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceDriverPropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceDriverPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceDriverPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceDriverPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `driverID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int driverID(MemorySegment segment, long index) { return (int) VH_driverID.get(segment, 0L, index); }
    /// {@return `driverID`}
    public int driverID() { return driverID(this.segment(), 0L); }
    /// Sets `driverID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void driverID(MemorySegment segment, long index, int value) { VH_driverID.set(segment, 0L, index, value); }
    /// Sets `driverID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverPropertiesKHR driverID(int value) { driverID(this.segment(), 0L, value); return this; }

    /// {@return `driverName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment driverName(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_driverName, index), LAYOUT_driverName); }
    /// {@return `driverName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte driverName(MemorySegment segment, long index, long index0) { return (byte) VH_driverName.get(segment, 0L, index, index0); }
    /// {@return `driverName`}
    public MemorySegment driverName() { return driverName(this.segment(), 0L); }
    /// {@return `driverName`}
    /// @param index0 the Index 0 of the array
    public byte driverName(long index0) { return driverName(this.segment(), 0L, index0); }
    /// Sets `driverName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void driverName(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_driverName, index), LAYOUT_driverName.byteSize()); }
    /// Sets `driverName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void driverName(MemorySegment segment, long index, long index0, byte value) { VH_driverName.set(segment, 0L, index, index0, value); }
    /// Sets `driverName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverPropertiesKHR driverName(MemorySegment value) { driverName(this.segment(), 0L, value); return this; }
    /// Sets `driverName` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverPropertiesKHR driverName(long index0, byte value) { driverName(this.segment(), 0L, index0, value); return this; }

    /// {@return `driverInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment driverInfo(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_driverInfo, index), LAYOUT_driverInfo); }
    /// {@return `driverInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte driverInfo(MemorySegment segment, long index, long index0) { return (byte) VH_driverInfo.get(segment, 0L, index, index0); }
    /// {@return `driverInfo`}
    public MemorySegment driverInfo() { return driverInfo(this.segment(), 0L); }
    /// {@return `driverInfo`}
    /// @param index0 the Index 0 of the array
    public byte driverInfo(long index0) { return driverInfo(this.segment(), 0L, index0); }
    /// Sets `driverInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void driverInfo(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_driverInfo, index), LAYOUT_driverInfo.byteSize()); }
    /// Sets `driverInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void driverInfo(MemorySegment segment, long index, long index0, byte value) { VH_driverInfo.set(segment, 0L, index, index0, value); }
    /// Sets `driverInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverPropertiesKHR driverInfo(MemorySegment value) { driverInfo(this.segment(), 0L, value); return this; }
    /// Sets `driverInfo` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverPropertiesKHR driverInfo(long index0, byte value) { driverInfo(this.segment(), 0L, index0, value); return this; }

    /// {@return `conformanceVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment conformanceVersion(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_conformanceVersion, index), LAYOUT_conformanceVersion); }
    /// {@return `conformanceVersion`}
    public MemorySegment conformanceVersion() { return conformanceVersion(this.segment(), 0L); }
    /// Sets `conformanceVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void conformanceVersion(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_conformanceVersion, index), LAYOUT_conformanceVersion.byteSize()); }
    /// Sets `conformanceVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverPropertiesKHR conformanceVersion(MemorySegment value) { conformanceVersion(this.segment(), 0L, value); return this; }
    /// Accepts `conformanceVersion` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceDriverPropertiesKHR conformanceVersion(Consumer<overrungl.vulkan.struct.VkConformanceVersion> func) { func.accept(overrungl.vulkan.struct.VkConformanceVersion.of(conformanceVersion())); return this; }

    /// Creates a slice of `VkPhysicalDeviceDriverPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceDriverPropertiesKHR`
    public VkPhysicalDeviceDriverPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceDriverPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceDriverPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceDriverPropertiesKHR`
    public VkPhysicalDeviceDriverPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceDriverPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceDriverPropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceDriverPropertiesKHR at(long index, Consumer<VkPhysicalDeviceDriverPropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverPropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverPropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `driverID` at the given index}
    /// @param index the index of the struct buffer
    public int driverIDAt(long index) { return driverID(this.segment(), index); }
    /// Sets `driverID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverPropertiesKHR driverIDAt(long index, int value) { driverID(this.segment(), index, value); return this; }

    /// {@return `driverName` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment driverNameAt(long index) { return driverName(this.segment(), index); }
    /// {@return `driverName` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte driverNameAt(long index, long index0) { return driverName(this.segment(), index, index0); }
    /// Sets `driverName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverPropertiesKHR driverNameAt(long index, MemorySegment value) { driverName(this.segment(), index, value); return this; }
    /// Sets `driverName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverPropertiesKHR driverNameAt(long index, long index0, byte value) { driverName(this.segment(), index, index0, value); return this; }

    /// {@return `driverInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment driverInfoAt(long index) { return driverInfo(this.segment(), index); }
    /// {@return `driverInfo` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte driverInfoAt(long index, long index0) { return driverInfo(this.segment(), index, index0); }
    /// Sets `driverInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverPropertiesKHR driverInfoAt(long index, MemorySegment value) { driverInfo(this.segment(), index, value); return this; }
    /// Sets `driverInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverPropertiesKHR driverInfoAt(long index, long index0, byte value) { driverInfo(this.segment(), index, index0, value); return this; }

    /// {@return `conformanceVersion` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment conformanceVersionAt(long index) { return conformanceVersion(this.segment(), index); }
    /// Sets `conformanceVersion` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverPropertiesKHR conformanceVersionAt(long index, MemorySegment value) { conformanceVersion(this.segment(), index, value); return this; }
    /// Accepts `conformanceVersion` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceDriverPropertiesKHR conformanceVersionAt(long index, Consumer<overrungl.vulkan.struct.VkConformanceVersion> func) { func.accept(overrungl.vulkan.struct.VkConformanceVersion.of(conformanceVersionAt(index))); return this; }

}
