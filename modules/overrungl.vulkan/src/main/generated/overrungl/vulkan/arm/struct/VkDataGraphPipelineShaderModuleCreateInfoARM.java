// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelineShaderModuleCreateInfoARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineShaderModuleCreateInfoARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkShaderModule module;
///     const char* pName;
///     const VkSpecializationInfo* pSpecializationInfo;
///     uint32_t constantCount;
///     const VkDataGraphPipelineConstantARM* pConstants;
/// };
/// ```
public final class VkDataGraphPipelineShaderModuleCreateInfoARM extends GroupType {
    /// The struct layout of `VkDataGraphPipelineShaderModuleCreateInfoARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("module"),
        ValueLayout.ADDRESS.withName("pName"),
        ValueLayout.ADDRESS.withName("pSpecializationInfo"),
        ValueLayout.JAVA_INT.withName("constantCount"),
        ValueLayout.ADDRESS.withName("pConstants")
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
    /// The byte offset of `module`.
    public static final long OFFSET_module = LAYOUT.byteOffset(PathElement.groupElement("module"));
    /// The memory layout of `module`.
    public static final MemoryLayout LAYOUT_module = LAYOUT.select(PathElement.groupElement("module"));
    /// The [VarHandle] of `module` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_module = LAYOUT.arrayElementVarHandle(PathElement.groupElement("module"));
    /// The byte offset of `pName`.
    public static final long OFFSET_pName = LAYOUT.byteOffset(PathElement.groupElement("pName"));
    /// The memory layout of `pName`.
    public static final MemoryLayout LAYOUT_pName = LAYOUT.select(PathElement.groupElement("pName"));
    /// The [VarHandle] of `pName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pName"));
    /// The byte offset of `pSpecializationInfo`.
    public static final long OFFSET_pSpecializationInfo = LAYOUT.byteOffset(PathElement.groupElement("pSpecializationInfo"));
    /// The memory layout of `pSpecializationInfo`.
    public static final MemoryLayout LAYOUT_pSpecializationInfo = LAYOUT.select(PathElement.groupElement("pSpecializationInfo"));
    /// The [VarHandle] of `pSpecializationInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSpecializationInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSpecializationInfo"));
    /// The byte offset of `constantCount`.
    public static final long OFFSET_constantCount = LAYOUT.byteOffset(PathElement.groupElement("constantCount"));
    /// The memory layout of `constantCount`.
    public static final MemoryLayout LAYOUT_constantCount = LAYOUT.select(PathElement.groupElement("constantCount"));
    /// The [VarHandle] of `constantCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_constantCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constantCount"));
    /// The byte offset of `pConstants`.
    public static final long OFFSET_pConstants = LAYOUT.byteOffset(PathElement.groupElement("pConstants"));
    /// The memory layout of `pConstants`.
    public static final MemoryLayout LAYOUT_pConstants = LAYOUT.select(PathElement.groupElement("pConstants"));
    /// The [VarHandle] of `pConstants` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pConstants = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pConstants"));

    /// Creates `VkDataGraphPipelineShaderModuleCreateInfoARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDataGraphPipelineShaderModuleCreateInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDataGraphPipelineShaderModuleCreateInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineShaderModuleCreateInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineShaderModuleCreateInfoARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDataGraphPipelineShaderModuleCreateInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineShaderModuleCreateInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineShaderModuleCreateInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDataGraphPipelineShaderModuleCreateInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineShaderModuleCreateInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineShaderModuleCreateInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDataGraphPipelineShaderModuleCreateInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDataGraphPipelineShaderModuleCreateInfoARM`
    public static VkDataGraphPipelineShaderModuleCreateInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineShaderModuleCreateInfoARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDataGraphPipelineShaderModuleCreateInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDataGraphPipelineShaderModuleCreateInfoARM`
    public static VkDataGraphPipelineShaderModuleCreateInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineShaderModuleCreateInfoARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDataGraphPipelineShaderModuleCreateInfoARM copyFrom(VkDataGraphPipelineShaderModuleCreateInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDataGraphPipelineShaderModuleCreateInfoARM reinterpret(long count) { return new VkDataGraphPipelineShaderModuleCreateInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDataGraphPipelineShaderModuleCreateInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDataGraphPipelineShaderModuleCreateInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `module` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long module(MemorySegment segment, long index) { return (long) VH_module.get(segment, 0L, index); }
    /// {@return `module`}
    public long module() { return module(this.segment(), 0L); }
    /// Sets `module` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void module(MemorySegment segment, long index, long value) { VH_module.set(segment, 0L, index, value); }
    /// Sets `module` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineShaderModuleCreateInfoARM module(long value) { module(this.segment(), 0L, value); return this; }

    /// {@return `pName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pName(MemorySegment segment, long index) { return (MemorySegment) VH_pName.get(segment, 0L, index); }
    /// {@return `pName`}
    public MemorySegment pName() { return pName(this.segment(), 0L); }
    /// Sets `pName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pName(MemorySegment segment, long index, MemorySegment value) { VH_pName.set(segment, 0L, index, value); }
    /// Sets `pName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineShaderModuleCreateInfoARM pName(MemorySegment value) { pName(this.segment(), 0L, value); return this; }

    /// {@return `pSpecializationInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSpecializationInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pSpecializationInfo.get(segment, 0L, index); }
    /// {@return `pSpecializationInfo`}
    public MemorySegment pSpecializationInfo() { return pSpecializationInfo(this.segment(), 0L); }
    /// Sets `pSpecializationInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSpecializationInfo(MemorySegment segment, long index, MemorySegment value) { VH_pSpecializationInfo.set(segment, 0L, index, value); }
    /// Sets `pSpecializationInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineShaderModuleCreateInfoARM pSpecializationInfo(MemorySegment value) { pSpecializationInfo(this.segment(), 0L, value); return this; }

    /// {@return `constantCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int constantCount(MemorySegment segment, long index) { return (int) VH_constantCount.get(segment, 0L, index); }
    /// {@return `constantCount`}
    public int constantCount() { return constantCount(this.segment(), 0L); }
    /// Sets `constantCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void constantCount(MemorySegment segment, long index, int value) { VH_constantCount.set(segment, 0L, index, value); }
    /// Sets `constantCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineShaderModuleCreateInfoARM constantCount(int value) { constantCount(this.segment(), 0L, value); return this; }

    /// {@return `pConstants` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pConstants(MemorySegment segment, long index) { return (MemorySegment) VH_pConstants.get(segment, 0L, index); }
    /// {@return `pConstants`}
    public MemorySegment pConstants() { return pConstants(this.segment(), 0L); }
    /// Sets `pConstants` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pConstants(MemorySegment segment, long index, MemorySegment value) { VH_pConstants.set(segment, 0L, index, value); }
    /// Sets `pConstants` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineShaderModuleCreateInfoARM pConstants(MemorySegment value) { pConstants(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDataGraphPipelineShaderModuleCreateInfoARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDataGraphPipelineShaderModuleCreateInfoARM`
    public VkDataGraphPipelineShaderModuleCreateInfoARM asSlice(long index) { return new VkDataGraphPipelineShaderModuleCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDataGraphPipelineShaderModuleCreateInfoARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDataGraphPipelineShaderModuleCreateInfoARM`
    public VkDataGraphPipelineShaderModuleCreateInfoARM asSlice(long index, long count) { return new VkDataGraphPipelineShaderModuleCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDataGraphPipelineShaderModuleCreateInfoARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDataGraphPipelineShaderModuleCreateInfoARM at(long index, Consumer<VkDataGraphPipelineShaderModuleCreateInfoARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineShaderModuleCreateInfoARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineShaderModuleCreateInfoARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `module` at the given index}
    /// @param index the index of the struct buffer
    public long moduleAt(long index) { return module(this.segment(), index); }
    /// Sets `module` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineShaderModuleCreateInfoARM moduleAt(long index, long value) { module(this.segment(), index, value); return this; }

    /// {@return `pName` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNameAt(long index) { return pName(this.segment(), index); }
    /// Sets `pName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineShaderModuleCreateInfoARM pNameAt(long index, MemorySegment value) { pName(this.segment(), index, value); return this; }

    /// {@return `pSpecializationInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSpecializationInfoAt(long index) { return pSpecializationInfo(this.segment(), index); }
    /// Sets `pSpecializationInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineShaderModuleCreateInfoARM pSpecializationInfoAt(long index, MemorySegment value) { pSpecializationInfo(this.segment(), index, value); return this; }

    /// {@return `constantCount` at the given index}
    /// @param index the index of the struct buffer
    public int constantCountAt(long index) { return constantCount(this.segment(), index); }
    /// Sets `constantCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineShaderModuleCreateInfoARM constantCountAt(long index, int value) { constantCount(this.segment(), index, value); return this; }

    /// {@return `pConstants` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pConstantsAt(long index) { return pConstants(this.segment(), index); }
    /// Sets `pConstants` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineShaderModuleCreateInfoARM pConstantsAt(long index, MemorySegment value) { pConstants(this.segment(), index, value); return this; }

}
