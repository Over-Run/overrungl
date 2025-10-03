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

/// Represents `VkPushDescriptorSetWithTemplateInfoKHR`.
/// ## Layout
/// ```
/// struct VkPushDescriptorSetWithTemplateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkDescriptorUpdateTemplate descriptorUpdateTemplate;
///     (uint64_t) VkPipelineLayout layout;
///     uint32_t set;
///     const void* pData;
/// };
/// ```
public final class VkPushDescriptorSetWithTemplateInfoKHR extends GroupType {
    /// The struct layout of `VkPushDescriptorSetWithTemplateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("descriptorUpdateTemplate"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_INT.withName("set"),
        ValueLayout.ADDRESS.withName("pData")
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
    /// The byte offset of `descriptorUpdateTemplate`.
    public static final long OFFSET_descriptorUpdateTemplate = LAYOUT.byteOffset(PathElement.groupElement("descriptorUpdateTemplate"));
    /// The memory layout of `descriptorUpdateTemplate`.
    public static final MemoryLayout LAYOUT_descriptorUpdateTemplate = LAYOUT.select(PathElement.groupElement("descriptorUpdateTemplate"));
    /// The [VarHandle] of `descriptorUpdateTemplate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_descriptorUpdateTemplate = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorUpdateTemplate")));
    /// The byte offset of `layout`.
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    /// The memory layout of `layout`.
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_layout = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout")));
    /// The byte offset of `set`.
    public static final long OFFSET_set = LAYOUT.byteOffset(PathElement.groupElement("set"));
    /// The memory layout of `set`.
    public static final MemoryLayout LAYOUT_set = LAYOUT.select(PathElement.groupElement("set"));
    /// The [VarHandle] of `set` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_set = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("set")));
    /// The byte offset of `pData`.
    public static final long OFFSET_pData = LAYOUT.byteOffset(PathElement.groupElement("pData"));
    /// The memory layout of `pData`.
    public static final MemoryLayout LAYOUT_pData = LAYOUT.select(PathElement.groupElement("pData"));
    /// The [VarHandle] of `pData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pData = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData")));

    /// Creates `VkPushDescriptorSetWithTemplateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPushDescriptorSetWithTemplateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPushDescriptorSetWithTemplateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushDescriptorSetWithTemplateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushDescriptorSetWithTemplateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPushDescriptorSetWithTemplateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushDescriptorSetWithTemplateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushDescriptorSetWithTemplateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPushDescriptorSetWithTemplateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushDescriptorSetWithTemplateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushDescriptorSetWithTemplateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPushDescriptorSetWithTemplateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPushDescriptorSetWithTemplateInfoKHR`
    public static VkPushDescriptorSetWithTemplateInfoKHR alloc(SegmentAllocator allocator) { return new VkPushDescriptorSetWithTemplateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPushDescriptorSetWithTemplateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPushDescriptorSetWithTemplateInfoKHR`
    public static VkPushDescriptorSetWithTemplateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPushDescriptorSetWithTemplateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfoKHR copyFrom(VkPushDescriptorSetWithTemplateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPushDescriptorSetWithTemplateInfoKHR reinterpret(long count) { return new VkPushDescriptorSetWithTemplateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPushDescriptorSetWithTemplateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPushDescriptorSetWithTemplateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `descriptorUpdateTemplate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long descriptorUpdateTemplate(MemorySegment segment, long index) { return (long) VH_descriptorUpdateTemplate.get().get(segment, 0L, index); }
    /// {@return `descriptorUpdateTemplate`}
    public long descriptorUpdateTemplate() { return descriptorUpdateTemplate(this.segment(), 0L); }
    /// Sets `descriptorUpdateTemplate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorUpdateTemplate(MemorySegment segment, long index, long value) { VH_descriptorUpdateTemplate.get().set(segment, 0L, index, value); }
    /// Sets `descriptorUpdateTemplate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfoKHR descriptorUpdateTemplate(long value) { descriptorUpdateTemplate(this.segment(), 0L, value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long layout(MemorySegment segment, long index) { return (long) VH_layout.get().get(segment, 0L, index); }
    /// {@return `layout`}
    public long layout() { return layout(this.segment(), 0L); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layout(MemorySegment segment, long index, long value) { VH_layout.get().set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfoKHR layout(long value) { layout(this.segment(), 0L, value); return this; }

    /// {@return `set` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int set(MemorySegment segment, long index) { return (int) VH_set.get().get(segment, 0L, index); }
    /// {@return `set`}
    public int set() { return set(this.segment(), 0L); }
    /// Sets `set` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void set(MemorySegment segment, long index, int value) { VH_set.get().set(segment, 0L, index, value); }
    /// Sets `set` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfoKHR set(int value) { set(this.segment(), 0L, value); return this; }

    /// {@return `pData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pData(MemorySegment segment, long index) { return (MemorySegment) VH_pData.get().get(segment, 0L, index); }
    /// {@return `pData`}
    public MemorySegment pData() { return pData(this.segment(), 0L); }
    /// Sets `pData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pData(MemorySegment segment, long index, MemorySegment value) { VH_pData.get().set(segment, 0L, index, value); }
    /// Sets `pData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfoKHR pData(MemorySegment value) { pData(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPushDescriptorSetWithTemplateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPushDescriptorSetWithTemplateInfoKHR`
    public VkPushDescriptorSetWithTemplateInfoKHR asSlice(long index) { return new VkPushDescriptorSetWithTemplateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPushDescriptorSetWithTemplateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPushDescriptorSetWithTemplateInfoKHR`
    public VkPushDescriptorSetWithTemplateInfoKHR asSlice(long index, long count) { return new VkPushDescriptorSetWithTemplateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPushDescriptorSetWithTemplateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfoKHR at(long index, Consumer<VkPushDescriptorSetWithTemplateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `descriptorUpdateTemplate` at the given index}
    /// @param index the index of the struct buffer
    public long descriptorUpdateTemplateAt(long index) { return descriptorUpdateTemplate(this.segment(), index); }
    /// Sets `descriptorUpdateTemplate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfoKHR descriptorUpdateTemplateAt(long index, long value) { descriptorUpdateTemplate(this.segment(), index, value); return this; }

    /// {@return `layout` at the given index}
    /// @param index the index of the struct buffer
    public long layoutAt(long index) { return layout(this.segment(), index); }
    /// Sets `layout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfoKHR layoutAt(long index, long value) { layout(this.segment(), index, value); return this; }

    /// {@return `set` at the given index}
    /// @param index the index of the struct buffer
    public int setAt(long index) { return set(this.segment(), index); }
    /// Sets `set` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfoKHR setAt(long index, int value) { set(this.segment(), index, value); return this; }

    /// {@return `pData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDataAt(long index) { return pData(this.segment(), index); }
    /// Sets `pData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfoKHR pDataAt(long index, MemorySegment value) { pData(this.segment(), index, value); return this; }

}
