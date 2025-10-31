// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkApplicationInfo`.
/// ## Layout
/// ```
/// struct VkApplicationInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const char* pApplicationName;
///     uint32_t applicationVersion;
///     const char* pEngineName;
///     uint32_t engineVersion;
///     uint32_t apiVersion;
/// };
/// ```
public final class VkApplicationInfo extends GroupType {
    /// The struct layout of `VkApplicationInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pApplicationName"),
        ValueLayout.JAVA_INT.withName("applicationVersion"),
        ValueLayout.ADDRESS.withName("pEngineName"),
        ValueLayout.JAVA_INT.withName("engineVersion"),
        ValueLayout.JAVA_INT.withName("apiVersion")
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
    /// The byte offset of `pApplicationName`.
    public static final long OFFSET_pApplicationName = LAYOUT.byteOffset(PathElement.groupElement("pApplicationName"));
    /// The memory layout of `pApplicationName`.
    public static final MemoryLayout LAYOUT_pApplicationName = LAYOUT.select(PathElement.groupElement("pApplicationName"));
    /// The [VarHandle] of `pApplicationName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pApplicationName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pApplicationName"));
    /// The byte offset of `applicationVersion`.
    public static final long OFFSET_applicationVersion = LAYOUT.byteOffset(PathElement.groupElement("applicationVersion"));
    /// The memory layout of `applicationVersion`.
    public static final MemoryLayout LAYOUT_applicationVersion = LAYOUT.select(PathElement.groupElement("applicationVersion"));
    /// The [VarHandle] of `applicationVersion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_applicationVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("applicationVersion"));
    /// The byte offset of `pEngineName`.
    public static final long OFFSET_pEngineName = LAYOUT.byteOffset(PathElement.groupElement("pEngineName"));
    /// The memory layout of `pEngineName`.
    public static final MemoryLayout LAYOUT_pEngineName = LAYOUT.select(PathElement.groupElement("pEngineName"));
    /// The [VarHandle] of `pEngineName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pEngineName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pEngineName"));
    /// The byte offset of `engineVersion`.
    public static final long OFFSET_engineVersion = LAYOUT.byteOffset(PathElement.groupElement("engineVersion"));
    /// The memory layout of `engineVersion`.
    public static final MemoryLayout LAYOUT_engineVersion = LAYOUT.select(PathElement.groupElement("engineVersion"));
    /// The [VarHandle] of `engineVersion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_engineVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("engineVersion"));
    /// The byte offset of `apiVersion`.
    public static final long OFFSET_apiVersion = LAYOUT.byteOffset(PathElement.groupElement("apiVersion"));
    /// The memory layout of `apiVersion`.
    public static final MemoryLayout LAYOUT_apiVersion = LAYOUT.select(PathElement.groupElement("apiVersion"));
    /// The [VarHandle] of `apiVersion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_apiVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("apiVersion"));

    /// Creates `VkApplicationInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkApplicationInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkApplicationInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkApplicationInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkApplicationInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkApplicationInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkApplicationInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkApplicationInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkApplicationInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkApplicationInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkApplicationInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkApplicationInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkApplicationInfo`
    public static VkApplicationInfo alloc(SegmentAllocator allocator) { return new VkApplicationInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkApplicationInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkApplicationInfo`
    public static VkApplicationInfo alloc(SegmentAllocator allocator, long count) { return new VkApplicationInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkApplicationInfo copyFrom(VkApplicationInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkApplicationInfo reinterpret(long count) { return new VkApplicationInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkApplicationInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkApplicationInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pApplicationName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pApplicationName(MemorySegment segment, long index) { return (MemorySegment) VH_pApplicationName.get(segment, 0L, index); }
    /// {@return `pApplicationName`}
    public MemorySegment pApplicationName() { return pApplicationName(this.segment(), 0L); }
    /// Sets `pApplicationName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pApplicationName(MemorySegment segment, long index, MemorySegment value) { VH_pApplicationName.set(segment, 0L, index, value); }
    /// Sets `pApplicationName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo pApplicationName(MemorySegment value) { pApplicationName(this.segment(), 0L, value); return this; }

    /// {@return `applicationVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int applicationVersion(MemorySegment segment, long index) { return (int) VH_applicationVersion.get(segment, 0L, index); }
    /// {@return `applicationVersion`}
    public int applicationVersion() { return applicationVersion(this.segment(), 0L); }
    /// Sets `applicationVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void applicationVersion(MemorySegment segment, long index, int value) { VH_applicationVersion.set(segment, 0L, index, value); }
    /// Sets `applicationVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo applicationVersion(int value) { applicationVersion(this.segment(), 0L, value); return this; }

    /// {@return `pEngineName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pEngineName(MemorySegment segment, long index) { return (MemorySegment) VH_pEngineName.get(segment, 0L, index); }
    /// {@return `pEngineName`}
    public MemorySegment pEngineName() { return pEngineName(this.segment(), 0L); }
    /// Sets `pEngineName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pEngineName(MemorySegment segment, long index, MemorySegment value) { VH_pEngineName.set(segment, 0L, index, value); }
    /// Sets `pEngineName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo pEngineName(MemorySegment value) { pEngineName(this.segment(), 0L, value); return this; }

    /// {@return `engineVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int engineVersion(MemorySegment segment, long index) { return (int) VH_engineVersion.get(segment, 0L, index); }
    /// {@return `engineVersion`}
    public int engineVersion() { return engineVersion(this.segment(), 0L); }
    /// Sets `engineVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void engineVersion(MemorySegment segment, long index, int value) { VH_engineVersion.set(segment, 0L, index, value); }
    /// Sets `engineVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo engineVersion(int value) { engineVersion(this.segment(), 0L, value); return this; }

    /// {@return `apiVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int apiVersion(MemorySegment segment, long index) { return (int) VH_apiVersion.get(segment, 0L, index); }
    /// {@return `apiVersion`}
    public int apiVersion() { return apiVersion(this.segment(), 0L); }
    /// Sets `apiVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void apiVersion(MemorySegment segment, long index, int value) { VH_apiVersion.set(segment, 0L, index, value); }
    /// Sets `apiVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo apiVersion(int value) { apiVersion(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkApplicationInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkApplicationInfo`
    public VkApplicationInfo asSlice(long index) { return new VkApplicationInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkApplicationInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkApplicationInfo`
    public VkApplicationInfo asSlice(long index, long count) { return new VkApplicationInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkApplicationInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkApplicationInfo at(long index, Consumer<VkApplicationInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pApplicationName` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pApplicationNameAt(long index) { return pApplicationName(this.segment(), index); }
    /// Sets `pApplicationName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo pApplicationNameAt(long index, MemorySegment value) { pApplicationName(this.segment(), index, value); return this; }

    /// {@return `applicationVersion` at the given index}
    /// @param index the index of the struct buffer
    public int applicationVersionAt(long index) { return applicationVersion(this.segment(), index); }
    /// Sets `applicationVersion` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo applicationVersionAt(long index, int value) { applicationVersion(this.segment(), index, value); return this; }

    /// {@return `pEngineName` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pEngineNameAt(long index) { return pEngineName(this.segment(), index); }
    /// Sets `pEngineName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo pEngineNameAt(long index, MemorySegment value) { pEngineName(this.segment(), index, value); return this; }

    /// {@return `engineVersion` at the given index}
    /// @param index the index of the struct buffer
    public int engineVersionAt(long index) { return engineVersion(this.segment(), index); }
    /// Sets `engineVersion` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo engineVersionAt(long index, int value) { engineVersion(this.segment(), index, value); return this; }

    /// {@return `apiVersion` at the given index}
    /// @param index the index of the struct buffer
    public int apiVersionAt(long index) { return apiVersion(this.segment(), index); }
    /// Sets `apiVersion` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo apiVersionAt(long index, int value) { apiVersion(this.segment(), index, value); return this; }

}
