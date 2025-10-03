// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.ext.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorDataEXT`.
/// ## Layout
/// ```
/// union VkDescriptorDataEXT {
///     const VkSampler* pSampler;
///     const VkDescriptorImageInfo* pCombinedImageSampler;
///     const VkDescriptorImageInfo* pInputAttachmentImage;
///     const VkDescriptorImageInfo* pSampledImage;
///     const VkDescriptorImageInfo* pStorageImage;
///     const VkDescriptorAddressInfoEXT* pUniformTexelBuffer;
///     const VkDescriptorAddressInfoEXT* pStorageTexelBuffer;
///     const VkDescriptorAddressInfoEXT* pUniformBuffer;
///     const VkDescriptorAddressInfoEXT* pStorageBuffer;
///     (uint64_t) VkDeviceAddress accelerationStructure;
/// };
/// ```
public final class VkDescriptorDataEXT extends GroupType {
    /// The union layout of `VkDescriptorDataEXT`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.ADDRESS.withName("pSampler"),
        ValueLayout.ADDRESS.withName("pCombinedImageSampler"),
        ValueLayout.ADDRESS.withName("pInputAttachmentImage"),
        ValueLayout.ADDRESS.withName("pSampledImage"),
        ValueLayout.ADDRESS.withName("pStorageImage"),
        ValueLayout.ADDRESS.withName("pUniformTexelBuffer"),
        ValueLayout.ADDRESS.withName("pStorageTexelBuffer"),
        ValueLayout.ADDRESS.withName("pUniformBuffer"),
        ValueLayout.ADDRESS.withName("pStorageBuffer"),
        ValueLayout.JAVA_LONG.withName("accelerationStructure")
    );
    /// The byte offset of `pSampler`.
    public static final long OFFSET_pSampler = LAYOUT.byteOffset(PathElement.groupElement("pSampler"));
    /// The memory layout of `pSampler`.
    public static final MemoryLayout LAYOUT_pSampler = LAYOUT.select(PathElement.groupElement("pSampler"));
    /// The [VarHandle] of `pSampler` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pSampler = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSampler")));
    /// The byte offset of `pCombinedImageSampler`.
    public static final long OFFSET_pCombinedImageSampler = LAYOUT.byteOffset(PathElement.groupElement("pCombinedImageSampler"));
    /// The memory layout of `pCombinedImageSampler`.
    public static final MemoryLayout LAYOUT_pCombinedImageSampler = LAYOUT.select(PathElement.groupElement("pCombinedImageSampler"));
    /// The [VarHandle] of `pCombinedImageSampler` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pCombinedImageSampler = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCombinedImageSampler")));
    /// The byte offset of `pInputAttachmentImage`.
    public static final long OFFSET_pInputAttachmentImage = LAYOUT.byteOffset(PathElement.groupElement("pInputAttachmentImage"));
    /// The memory layout of `pInputAttachmentImage`.
    public static final MemoryLayout LAYOUT_pInputAttachmentImage = LAYOUT.select(PathElement.groupElement("pInputAttachmentImage"));
    /// The [VarHandle] of `pInputAttachmentImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pInputAttachmentImage = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInputAttachmentImage")));
    /// The byte offset of `pSampledImage`.
    public static final long OFFSET_pSampledImage = LAYOUT.byteOffset(PathElement.groupElement("pSampledImage"));
    /// The memory layout of `pSampledImage`.
    public static final MemoryLayout LAYOUT_pSampledImage = LAYOUT.select(PathElement.groupElement("pSampledImage"));
    /// The [VarHandle] of `pSampledImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pSampledImage = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSampledImage")));
    /// The byte offset of `pStorageImage`.
    public static final long OFFSET_pStorageImage = LAYOUT.byteOffset(PathElement.groupElement("pStorageImage"));
    /// The memory layout of `pStorageImage`.
    public static final MemoryLayout LAYOUT_pStorageImage = LAYOUT.select(PathElement.groupElement("pStorageImage"));
    /// The [VarHandle] of `pStorageImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pStorageImage = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStorageImage")));
    /// The byte offset of `pUniformTexelBuffer`.
    public static final long OFFSET_pUniformTexelBuffer = LAYOUT.byteOffset(PathElement.groupElement("pUniformTexelBuffer"));
    /// The memory layout of `pUniformTexelBuffer`.
    public static final MemoryLayout LAYOUT_pUniformTexelBuffer = LAYOUT.select(PathElement.groupElement("pUniformTexelBuffer"));
    /// The [VarHandle] of `pUniformTexelBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pUniformTexelBuffer = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUniformTexelBuffer")));
    /// The byte offset of `pStorageTexelBuffer`.
    public static final long OFFSET_pStorageTexelBuffer = LAYOUT.byteOffset(PathElement.groupElement("pStorageTexelBuffer"));
    /// The memory layout of `pStorageTexelBuffer`.
    public static final MemoryLayout LAYOUT_pStorageTexelBuffer = LAYOUT.select(PathElement.groupElement("pStorageTexelBuffer"));
    /// The [VarHandle] of `pStorageTexelBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pStorageTexelBuffer = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStorageTexelBuffer")));
    /// The byte offset of `pUniformBuffer`.
    public static final long OFFSET_pUniformBuffer = LAYOUT.byteOffset(PathElement.groupElement("pUniformBuffer"));
    /// The memory layout of `pUniformBuffer`.
    public static final MemoryLayout LAYOUT_pUniformBuffer = LAYOUT.select(PathElement.groupElement("pUniformBuffer"));
    /// The [VarHandle] of `pUniformBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pUniformBuffer = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUniformBuffer")));
    /// The byte offset of `pStorageBuffer`.
    public static final long OFFSET_pStorageBuffer = LAYOUT.byteOffset(PathElement.groupElement("pStorageBuffer"));
    /// The memory layout of `pStorageBuffer`.
    public static final MemoryLayout LAYOUT_pStorageBuffer = LAYOUT.select(PathElement.groupElement("pStorageBuffer"));
    /// The [VarHandle] of `pStorageBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pStorageBuffer = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStorageBuffer")));
    /// The byte offset of `accelerationStructure`.
    public static final long OFFSET_accelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
    /// The memory layout of `accelerationStructure`.
    public static final MemoryLayout LAYOUT_accelerationStructure = LAYOUT.select(PathElement.groupElement("accelerationStructure"));
    /// The [VarHandle] of `accelerationStructure` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_accelerationStructure = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure")));

    /// Creates `VkDescriptorDataEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this union buffer
    public VkDescriptorDataEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDescriptorDataEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorDataEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorDataEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorDataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorDataEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorDataEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDescriptorDataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorDataEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorDataEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDescriptorDataEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorDataEXT`
    public static VkDescriptorDataEXT alloc(SegmentAllocator allocator) { return new VkDescriptorDataEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDescriptorDataEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorDataEXT`
    public static VkDescriptorDataEXT alloc(SegmentAllocator allocator, long count) { return new VkDescriptorDataEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorDataEXT copyFrom(VkDescriptorDataEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDescriptorDataEXT reinterpret(long count) { return new VkDescriptorDataEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `pSampler` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pSampler(MemorySegment segment, long index) { return (MemorySegment) VH_pSampler.get().get(segment, 0L, index); }
    /// {@return `pSampler`}
    public MemorySegment pSampler() { return pSampler(this.segment(), 0L); }
    /// Sets `pSampler` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pSampler(MemorySegment segment, long index, MemorySegment value) { VH_pSampler.get().set(segment, 0L, index, value); }
    /// Sets `pSampler` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pSampler(MemorySegment value) { pSampler(this.segment(), 0L, value); return this; }

    /// {@return `pCombinedImageSampler` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pCombinedImageSampler(MemorySegment segment, long index) { return (MemorySegment) VH_pCombinedImageSampler.get().get(segment, 0L, index); }
    /// {@return `pCombinedImageSampler`}
    public MemorySegment pCombinedImageSampler() { return pCombinedImageSampler(this.segment(), 0L); }
    /// Sets `pCombinedImageSampler` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pCombinedImageSampler(MemorySegment segment, long index, MemorySegment value) { VH_pCombinedImageSampler.get().set(segment, 0L, index, value); }
    /// Sets `pCombinedImageSampler` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pCombinedImageSampler(MemorySegment value) { pCombinedImageSampler(this.segment(), 0L, value); return this; }

    /// {@return `pInputAttachmentImage` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pInputAttachmentImage(MemorySegment segment, long index) { return (MemorySegment) VH_pInputAttachmentImage.get().get(segment, 0L, index); }
    /// {@return `pInputAttachmentImage`}
    public MemorySegment pInputAttachmentImage() { return pInputAttachmentImage(this.segment(), 0L); }
    /// Sets `pInputAttachmentImage` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pInputAttachmentImage(MemorySegment segment, long index, MemorySegment value) { VH_pInputAttachmentImage.get().set(segment, 0L, index, value); }
    /// Sets `pInputAttachmentImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pInputAttachmentImage(MemorySegment value) { pInputAttachmentImage(this.segment(), 0L, value); return this; }

    /// {@return `pSampledImage` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pSampledImage(MemorySegment segment, long index) { return (MemorySegment) VH_pSampledImage.get().get(segment, 0L, index); }
    /// {@return `pSampledImage`}
    public MemorySegment pSampledImage() { return pSampledImage(this.segment(), 0L); }
    /// Sets `pSampledImage` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pSampledImage(MemorySegment segment, long index, MemorySegment value) { VH_pSampledImage.get().set(segment, 0L, index, value); }
    /// Sets `pSampledImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pSampledImage(MemorySegment value) { pSampledImage(this.segment(), 0L, value); return this; }

    /// {@return `pStorageImage` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pStorageImage(MemorySegment segment, long index) { return (MemorySegment) VH_pStorageImage.get().get(segment, 0L, index); }
    /// {@return `pStorageImage`}
    public MemorySegment pStorageImage() { return pStorageImage(this.segment(), 0L); }
    /// Sets `pStorageImage` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pStorageImage(MemorySegment segment, long index, MemorySegment value) { VH_pStorageImage.get().set(segment, 0L, index, value); }
    /// Sets `pStorageImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pStorageImage(MemorySegment value) { pStorageImage(this.segment(), 0L, value); return this; }

    /// {@return `pUniformTexelBuffer` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pUniformTexelBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_pUniformTexelBuffer.get().get(segment, 0L, index); }
    /// {@return `pUniformTexelBuffer`}
    public MemorySegment pUniformTexelBuffer() { return pUniformTexelBuffer(this.segment(), 0L); }
    /// Sets `pUniformTexelBuffer` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pUniformTexelBuffer(MemorySegment segment, long index, MemorySegment value) { VH_pUniformTexelBuffer.get().set(segment, 0L, index, value); }
    /// Sets `pUniformTexelBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pUniformTexelBuffer(MemorySegment value) { pUniformTexelBuffer(this.segment(), 0L, value); return this; }

    /// {@return `pStorageTexelBuffer` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pStorageTexelBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_pStorageTexelBuffer.get().get(segment, 0L, index); }
    /// {@return `pStorageTexelBuffer`}
    public MemorySegment pStorageTexelBuffer() { return pStorageTexelBuffer(this.segment(), 0L); }
    /// Sets `pStorageTexelBuffer` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pStorageTexelBuffer(MemorySegment segment, long index, MemorySegment value) { VH_pStorageTexelBuffer.get().set(segment, 0L, index, value); }
    /// Sets `pStorageTexelBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pStorageTexelBuffer(MemorySegment value) { pStorageTexelBuffer(this.segment(), 0L, value); return this; }

    /// {@return `pUniformBuffer` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pUniformBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_pUniformBuffer.get().get(segment, 0L, index); }
    /// {@return `pUniformBuffer`}
    public MemorySegment pUniformBuffer() { return pUniformBuffer(this.segment(), 0L); }
    /// Sets `pUniformBuffer` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pUniformBuffer(MemorySegment segment, long index, MemorySegment value) { VH_pUniformBuffer.get().set(segment, 0L, index, value); }
    /// Sets `pUniformBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pUniformBuffer(MemorySegment value) { pUniformBuffer(this.segment(), 0L, value); return this; }

    /// {@return `pStorageBuffer` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pStorageBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_pStorageBuffer.get().get(segment, 0L, index); }
    /// {@return `pStorageBuffer`}
    public MemorySegment pStorageBuffer() { return pStorageBuffer(this.segment(), 0L); }
    /// Sets `pStorageBuffer` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pStorageBuffer(MemorySegment segment, long index, MemorySegment value) { VH_pStorageBuffer.get().set(segment, 0L, index, value); }
    /// Sets `pStorageBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pStorageBuffer(MemorySegment value) { pStorageBuffer(this.segment(), 0L, value); return this; }

    /// {@return `accelerationStructure` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static long accelerationStructure(MemorySegment segment, long index) { return (long) VH_accelerationStructure.get().get(segment, 0L, index); }
    /// {@return `accelerationStructure`}
    public long accelerationStructure() { return accelerationStructure(this.segment(), 0L); }
    /// Sets `accelerationStructure` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void accelerationStructure(MemorySegment segment, long index, long value) { VH_accelerationStructure.get().set(segment, 0L, index, value); }
    /// Sets `accelerationStructure` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT accelerationStructure(long value) { accelerationStructure(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDescriptorDataEXT`.
    /// @param index the index of the union buffer
    /// @return the slice of `VkDescriptorDataEXT`
    public VkDescriptorDataEXT asSlice(long index) { return new VkDescriptorDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDescriptorDataEXT`.
    /// @param index the index of the union buffer
    /// @param count the count
    /// @return the slice of `VkDescriptorDataEXT`
    public VkDescriptorDataEXT asSlice(long index, long count) { return new VkDescriptorDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDescriptorDataEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDescriptorDataEXT at(long index, Consumer<VkDescriptorDataEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `pSampler` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment pSamplerAt(long index) { return pSampler(this.segment(), index); }
    /// Sets `pSampler` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pSamplerAt(long index, MemorySegment value) { pSampler(this.segment(), index, value); return this; }

    /// {@return `pCombinedImageSampler` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment pCombinedImageSamplerAt(long index) { return pCombinedImageSampler(this.segment(), index); }
    /// Sets `pCombinedImageSampler` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pCombinedImageSamplerAt(long index, MemorySegment value) { pCombinedImageSampler(this.segment(), index, value); return this; }

    /// {@return `pInputAttachmentImage` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment pInputAttachmentImageAt(long index) { return pInputAttachmentImage(this.segment(), index); }
    /// Sets `pInputAttachmentImage` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pInputAttachmentImageAt(long index, MemorySegment value) { pInputAttachmentImage(this.segment(), index, value); return this; }

    /// {@return `pSampledImage` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment pSampledImageAt(long index) { return pSampledImage(this.segment(), index); }
    /// Sets `pSampledImage` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pSampledImageAt(long index, MemorySegment value) { pSampledImage(this.segment(), index, value); return this; }

    /// {@return `pStorageImage` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment pStorageImageAt(long index) { return pStorageImage(this.segment(), index); }
    /// Sets `pStorageImage` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pStorageImageAt(long index, MemorySegment value) { pStorageImage(this.segment(), index, value); return this; }

    /// {@return `pUniformTexelBuffer` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment pUniformTexelBufferAt(long index) { return pUniformTexelBuffer(this.segment(), index); }
    /// Sets `pUniformTexelBuffer` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pUniformTexelBufferAt(long index, MemorySegment value) { pUniformTexelBuffer(this.segment(), index, value); return this; }

    /// {@return `pStorageTexelBuffer` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment pStorageTexelBufferAt(long index) { return pStorageTexelBuffer(this.segment(), index); }
    /// Sets `pStorageTexelBuffer` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pStorageTexelBufferAt(long index, MemorySegment value) { pStorageTexelBuffer(this.segment(), index, value); return this; }

    /// {@return `pUniformBuffer` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment pUniformBufferAt(long index) { return pUniformBuffer(this.segment(), index); }
    /// Sets `pUniformBuffer` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pUniformBufferAt(long index, MemorySegment value) { pUniformBuffer(this.segment(), index, value); return this; }

    /// {@return `pStorageBuffer` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment pStorageBufferAt(long index) { return pStorageBuffer(this.segment(), index); }
    /// Sets `pStorageBuffer` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pStorageBufferAt(long index, MemorySegment value) { pStorageBuffer(this.segment(), index, value); return this; }

    /// {@return `accelerationStructure` at the given index}
    /// @param index the index of the union buffer
    public long accelerationStructureAt(long index) { return accelerationStructure(this.segment(), index); }
    /// Sets `accelerationStructure` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT accelerationStructureAt(long index, long value) { accelerationStructure(this.segment(), index, value); return this; }

}
