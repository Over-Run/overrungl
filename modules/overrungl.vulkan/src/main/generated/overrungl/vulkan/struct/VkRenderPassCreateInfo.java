// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassCreateInfo`.
/// ## Layout
/// ```
/// struct VkRenderPassCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkRenderPassCreateFlags flags;
///     uint32_t attachmentCount;
///     const VkAttachmentDescription* pAttachments;
///     uint32_t subpassCount;
///     const VkSubpassDescription* pSubpasses;
///     uint32_t dependencyCount;
///     const VkSubpassDependency* pDependencies;
/// };
/// ```
public final class VkRenderPassCreateInfo extends GroupType {
    /// The struct layout of `VkRenderPassCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withName("pAttachments"),
        ValueLayout.JAVA_INT.withName("subpassCount"),
        ValueLayout.ADDRESS.withName("pSubpasses"),
        ValueLayout.JAVA_INT.withName("dependencyCount"),
        ValueLayout.ADDRESS.withName("pDependencies")
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
    /// The byte offset of `attachmentCount`.
    public static final long OFFSET_attachmentCount = LAYOUT.byteOffset(PathElement.groupElement("attachmentCount"));
    /// The memory layout of `attachmentCount`.
    public static final MemoryLayout LAYOUT_attachmentCount = LAYOUT.select(PathElement.groupElement("attachmentCount"));
    /// The [VarHandle] of `attachmentCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_attachmentCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentCount")));
    /// The byte offset of `pAttachments`.
    public static final long OFFSET_pAttachments = LAYOUT.byteOffset(PathElement.groupElement("pAttachments"));
    /// The memory layout of `pAttachments`.
    public static final MemoryLayout LAYOUT_pAttachments = LAYOUT.select(PathElement.groupElement("pAttachments"));
    /// The [VarHandle] of `pAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pAttachments = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachments")));
    /// The byte offset of `subpassCount`.
    public static final long OFFSET_subpassCount = LAYOUT.byteOffset(PathElement.groupElement("subpassCount"));
    /// The memory layout of `subpassCount`.
    public static final MemoryLayout LAYOUT_subpassCount = LAYOUT.select(PathElement.groupElement("subpassCount"));
    /// The [VarHandle] of `subpassCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_subpassCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpassCount")));
    /// The byte offset of `pSubpasses`.
    public static final long OFFSET_pSubpasses = LAYOUT.byteOffset(PathElement.groupElement("pSubpasses"));
    /// The memory layout of `pSubpasses`.
    public static final MemoryLayout LAYOUT_pSubpasses = LAYOUT.select(PathElement.groupElement("pSubpasses"));
    /// The [VarHandle] of `pSubpasses` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pSubpasses = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSubpasses")));
    /// The byte offset of `dependencyCount`.
    public static final long OFFSET_dependencyCount = LAYOUT.byteOffset(PathElement.groupElement("dependencyCount"));
    /// The memory layout of `dependencyCount`.
    public static final MemoryLayout LAYOUT_dependencyCount = LAYOUT.select(PathElement.groupElement("dependencyCount"));
    /// The [VarHandle] of `dependencyCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dependencyCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dependencyCount")));
    /// The byte offset of `pDependencies`.
    public static final long OFFSET_pDependencies = LAYOUT.byteOffset(PathElement.groupElement("pDependencies"));
    /// The memory layout of `pDependencies`.
    public static final MemoryLayout LAYOUT_pDependencies = LAYOUT.select(PathElement.groupElement("pDependencies"));
    /// The [VarHandle] of `pDependencies` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pDependencies = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDependencies")));

    /// Creates `VkRenderPassCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRenderPassCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRenderPassCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRenderPassCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRenderPassCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassCreateInfo`
    public static VkRenderPassCreateInfo alloc(SegmentAllocator allocator) { return new VkRenderPassCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRenderPassCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassCreateInfo`
    public static VkRenderPassCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkRenderPassCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassCreateInfo copyFrom(VkRenderPassCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRenderPassCreateInfo reinterpret(long count) { return new VkRenderPassCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkRenderPassCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRenderPassCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkRenderPassCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `attachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int attachmentCount(MemorySegment segment, long index) { return (int) VH_attachmentCount.get().get(segment, 0L, index); }
    /// {@return `attachmentCount`}
    public int attachmentCount() { return attachmentCount(this.segment(), 0L); }
    /// Sets `attachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void attachmentCount(MemorySegment segment, long index, int value) { VH_attachmentCount.get().set(segment, 0L, index, value); }
    /// Sets `attachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo attachmentCount(int value) { attachmentCount(this.segment(), 0L, value); return this; }

    /// {@return `pAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAttachments(MemorySegment segment, long index) { return (MemorySegment) VH_pAttachments.get().get(segment, 0L, index); }
    /// {@return `pAttachments`}
    public MemorySegment pAttachments() { return pAttachments(this.segment(), 0L); }
    /// Sets `pAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAttachments(MemorySegment segment, long index, MemorySegment value) { VH_pAttachments.get().set(segment, 0L, index, value); }
    /// Sets `pAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo pAttachments(MemorySegment value) { pAttachments(this.segment(), 0L, value); return this; }

    /// {@return `subpassCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subpassCount(MemorySegment segment, long index) { return (int) VH_subpassCount.get().get(segment, 0L, index); }
    /// {@return `subpassCount`}
    public int subpassCount() { return subpassCount(this.segment(), 0L); }
    /// Sets `subpassCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subpassCount(MemorySegment segment, long index, int value) { VH_subpassCount.get().set(segment, 0L, index, value); }
    /// Sets `subpassCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo subpassCount(int value) { subpassCount(this.segment(), 0L, value); return this; }

    /// {@return `pSubpasses` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSubpasses(MemorySegment segment, long index) { return (MemorySegment) VH_pSubpasses.get().get(segment, 0L, index); }
    /// {@return `pSubpasses`}
    public MemorySegment pSubpasses() { return pSubpasses(this.segment(), 0L); }
    /// Sets `pSubpasses` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSubpasses(MemorySegment segment, long index, MemorySegment value) { VH_pSubpasses.get().set(segment, 0L, index, value); }
    /// Sets `pSubpasses` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo pSubpasses(MemorySegment value) { pSubpasses(this.segment(), 0L, value); return this; }

    /// {@return `dependencyCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dependencyCount(MemorySegment segment, long index) { return (int) VH_dependencyCount.get().get(segment, 0L, index); }
    /// {@return `dependencyCount`}
    public int dependencyCount() { return dependencyCount(this.segment(), 0L); }
    /// Sets `dependencyCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dependencyCount(MemorySegment segment, long index, int value) { VH_dependencyCount.get().set(segment, 0L, index, value); }
    /// Sets `dependencyCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo dependencyCount(int value) { dependencyCount(this.segment(), 0L, value); return this; }

    /// {@return `pDependencies` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDependencies(MemorySegment segment, long index) { return (MemorySegment) VH_pDependencies.get().get(segment, 0L, index); }
    /// {@return `pDependencies`}
    public MemorySegment pDependencies() { return pDependencies(this.segment(), 0L); }
    /// Sets `pDependencies` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDependencies(MemorySegment segment, long index, MemorySegment value) { VH_pDependencies.get().set(segment, 0L, index, value); }
    /// Sets `pDependencies` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo pDependencies(MemorySegment value) { pDependencies(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkRenderPassCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderPassCreateInfo`
    public VkRenderPassCreateInfo asSlice(long index) { return new VkRenderPassCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRenderPassCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderPassCreateInfo`
    public VkRenderPassCreateInfo asSlice(long index, long count) { return new VkRenderPassCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRenderPassCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRenderPassCreateInfo at(long index, Consumer<VkRenderPassCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `attachmentCount` at the given index}
    /// @param index the index of the struct buffer
    public int attachmentCountAt(long index) { return attachmentCount(this.segment(), index); }
    /// Sets `attachmentCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo attachmentCountAt(long index, int value) { attachmentCount(this.segment(), index, value); return this; }

    /// {@return `pAttachments` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pAttachmentsAt(long index) { return pAttachments(this.segment(), index); }
    /// Sets `pAttachments` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo pAttachmentsAt(long index, MemorySegment value) { pAttachments(this.segment(), index, value); return this; }

    /// {@return `subpassCount` at the given index}
    /// @param index the index of the struct buffer
    public int subpassCountAt(long index) { return subpassCount(this.segment(), index); }
    /// Sets `subpassCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo subpassCountAt(long index, int value) { subpassCount(this.segment(), index, value); return this; }

    /// {@return `pSubpasses` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSubpassesAt(long index) { return pSubpasses(this.segment(), index); }
    /// Sets `pSubpasses` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo pSubpassesAt(long index, MemorySegment value) { pSubpasses(this.segment(), index, value); return this; }

    /// {@return `dependencyCount` at the given index}
    /// @param index the index of the struct buffer
    public int dependencyCountAt(long index) { return dependencyCount(this.segment(), index); }
    /// Sets `dependencyCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo dependencyCountAt(long index, int value) { dependencyCount(this.segment(), index, value); return this; }

    /// {@return `pDependencies` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDependenciesAt(long index) { return pDependencies(this.segment(), index); }
    /// Sets `pDependencies` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo pDependenciesAt(long index, MemorySegment value) { pDependencies(this.segment(), index, value); return this; }

}
