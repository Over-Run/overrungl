// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceOpacityMicromapFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceOpacityMicromapFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 micromap;
///     (uint32_t) VkBool32 micromapCaptureReplay;
///     (uint32_t) VkBool32 micromapHostCommands;
/// };
/// ```
public final class VkPhysicalDeviceOpacityMicromapFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceOpacityMicromapFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("micromap"),
        ValueLayout.JAVA_INT.withName("micromapCaptureReplay"),
        ValueLayout.JAVA_INT.withName("micromapHostCommands")
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
    /// The byte offset of `micromap`.
    public static final long OFFSET_micromap = LAYOUT.byteOffset(PathElement.groupElement("micromap"));
    /// The memory layout of `micromap`.
    public static final MemoryLayout LAYOUT_micromap = LAYOUT.select(PathElement.groupElement("micromap"));
    /// The [VarHandle] of `micromap` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_micromap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("micromap"));
    /// The byte offset of `micromapCaptureReplay`.
    public static final long OFFSET_micromapCaptureReplay = LAYOUT.byteOffset(PathElement.groupElement("micromapCaptureReplay"));
    /// The memory layout of `micromapCaptureReplay`.
    public static final MemoryLayout LAYOUT_micromapCaptureReplay = LAYOUT.select(PathElement.groupElement("micromapCaptureReplay"));
    /// The [VarHandle] of `micromapCaptureReplay` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_micromapCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("micromapCaptureReplay"));
    /// The byte offset of `micromapHostCommands`.
    public static final long OFFSET_micromapHostCommands = LAYOUT.byteOffset(PathElement.groupElement("micromapHostCommands"));
    /// The memory layout of `micromapHostCommands`.
    public static final MemoryLayout LAYOUT_micromapHostCommands = LAYOUT.select(PathElement.groupElement("micromapHostCommands"));
    /// The [VarHandle] of `micromapHostCommands` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_micromapHostCommands = LAYOUT.arrayElementVarHandle(PathElement.groupElement("micromapHostCommands"));

    /// Creates `VkPhysicalDeviceOpacityMicromapFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceOpacityMicromapFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpacityMicromapFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceOpacityMicromapFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpacityMicromapFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceOpacityMicromapFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpacityMicromapFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceOpacityMicromapFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceOpacityMicromapFeaturesEXT`
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceOpacityMicromapFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceOpacityMicromapFeaturesEXT`
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT copyFrom(VkPhysicalDeviceOpacityMicromapFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `micromap` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int micromap(MemorySegment segment, long index) { return (int) VH_micromap.get(segment, 0L, index); }
    /// {@return `micromap`}
    public int micromap() { return micromap(this.segment(), 0L); }
    /// Sets `micromap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void micromap(MemorySegment segment, long index, int value) { VH_micromap.set(segment, 0L, index, value); }
    /// Sets `micromap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromap(int value) { micromap(this.segment(), 0L, value); return this; }

    /// {@return `micromapCaptureReplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int micromapCaptureReplay(MemorySegment segment, long index) { return (int) VH_micromapCaptureReplay.get(segment, 0L, index); }
    /// {@return `micromapCaptureReplay`}
    public int micromapCaptureReplay() { return micromapCaptureReplay(this.segment(), 0L); }
    /// Sets `micromapCaptureReplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void micromapCaptureReplay(MemorySegment segment, long index, int value) { VH_micromapCaptureReplay.set(segment, 0L, index, value); }
    /// Sets `micromapCaptureReplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapCaptureReplay(int value) { micromapCaptureReplay(this.segment(), 0L, value); return this; }

    /// {@return `micromapHostCommands` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int micromapHostCommands(MemorySegment segment, long index) { return (int) VH_micromapHostCommands.get(segment, 0L, index); }
    /// {@return `micromapHostCommands`}
    public int micromapHostCommands() { return micromapHostCommands(this.segment(), 0L); }
    /// Sets `micromapHostCommands` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void micromapHostCommands(MemorySegment segment, long index, int value) { VH_micromapHostCommands.set(segment, 0L, index, value); }
    /// Sets `micromapHostCommands` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapHostCommands(int value) { micromapHostCommands(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceOpacityMicromapFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceOpacityMicromapFeaturesEXT`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceOpacityMicromapFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceOpacityMicromapFeaturesEXT`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceOpacityMicromapFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT at(long index, Consumer<VkPhysicalDeviceOpacityMicromapFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `micromap` at the given index}
    /// @param index the index of the struct buffer
    public int micromapAt(long index) { return micromap(this.segment(), index); }
    /// Sets `micromap` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapAt(long index, int value) { micromap(this.segment(), index, value); return this; }

    /// {@return `micromapCaptureReplay` at the given index}
    /// @param index the index of the struct buffer
    public int micromapCaptureReplayAt(long index) { return micromapCaptureReplay(this.segment(), index); }
    /// Sets `micromapCaptureReplay` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapCaptureReplayAt(long index, int value) { micromapCaptureReplay(this.segment(), index, value); return this; }

    /// {@return `micromapHostCommands` at the given index}
    /// @param index the index of the struct buffer
    public int micromapHostCommandsAt(long index) { return micromapHostCommands(this.segment(), index); }
    /// Sets `micromapHostCommands` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapHostCommandsAt(long index, int value) { micromapHostCommands(this.segment(), index, value); return this; }

}
