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

/// Represents `VkSamplerCreateInfo`.
/// ## Layout
/// ```
/// struct VkSamplerCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkSamplerCreateFlags flags;
///     (int) VkFilter magFilter;
///     (int) VkFilter minFilter;
///     (int) VkSamplerMipmapMode mipmapMode;
///     (int) VkSamplerAddressMode addressModeU;
///     (int) VkSamplerAddressMode addressModeV;
///     (int) VkSamplerAddressMode addressModeW;
///     float mipLodBias;
///     (uint32_t) VkBool32 anisotropyEnable;
///     float maxAnisotropy;
///     (uint32_t) VkBool32 compareEnable;
///     (int) VkCompareOp compareOp;
///     float minLod;
///     float maxLod;
///     (int) VkBorderColor borderColor;
///     (uint32_t) VkBool32 unnormalizedCoordinates;
/// };
/// ```
public final class VkSamplerCreateInfo extends GroupType {
    /// The struct layout of `VkSamplerCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("magFilter"),
        ValueLayout.JAVA_INT.withName("minFilter"),
        ValueLayout.JAVA_INT.withName("mipmapMode"),
        ValueLayout.JAVA_INT.withName("addressModeU"),
        ValueLayout.JAVA_INT.withName("addressModeV"),
        ValueLayout.JAVA_INT.withName("addressModeW"),
        ValueLayout.JAVA_FLOAT.withName("mipLodBias"),
        ValueLayout.JAVA_INT.withName("anisotropyEnable"),
        ValueLayout.JAVA_FLOAT.withName("maxAnisotropy"),
        ValueLayout.JAVA_INT.withName("compareEnable"),
        ValueLayout.JAVA_INT.withName("compareOp"),
        ValueLayout.JAVA_FLOAT.withName("minLod"),
        ValueLayout.JAVA_FLOAT.withName("maxLod"),
        ValueLayout.JAVA_INT.withName("borderColor"),
        ValueLayout.JAVA_INT.withName("unnormalizedCoordinates")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `magFilter`.
    public static final long OFFSET_magFilter = LAYOUT.byteOffset(PathElement.groupElement("magFilter"));
    /// The memory layout of `magFilter`.
    public static final MemoryLayout LAYOUT_magFilter = LAYOUT.select(PathElement.groupElement("magFilter"));
    /// The [VarHandle] of `magFilter` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_magFilter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("magFilter"));
    /// The byte offset of `minFilter`.
    public static final long OFFSET_minFilter = LAYOUT.byteOffset(PathElement.groupElement("minFilter"));
    /// The memory layout of `minFilter`.
    public static final MemoryLayout LAYOUT_minFilter = LAYOUT.select(PathElement.groupElement("minFilter"));
    /// The [VarHandle] of `minFilter` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minFilter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minFilter"));
    /// The byte offset of `mipmapMode`.
    public static final long OFFSET_mipmapMode = LAYOUT.byteOffset(PathElement.groupElement("mipmapMode"));
    /// The memory layout of `mipmapMode`.
    public static final MemoryLayout LAYOUT_mipmapMode = LAYOUT.select(PathElement.groupElement("mipmapMode"));
    /// The [VarHandle] of `mipmapMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mipmapMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mipmapMode"));
    /// The byte offset of `addressModeU`.
    public static final long OFFSET_addressModeU = LAYOUT.byteOffset(PathElement.groupElement("addressModeU"));
    /// The memory layout of `addressModeU`.
    public static final MemoryLayout LAYOUT_addressModeU = LAYOUT.select(PathElement.groupElement("addressModeU"));
    /// The [VarHandle] of `addressModeU` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_addressModeU = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressModeU"));
    /// The byte offset of `addressModeV`.
    public static final long OFFSET_addressModeV = LAYOUT.byteOffset(PathElement.groupElement("addressModeV"));
    /// The memory layout of `addressModeV`.
    public static final MemoryLayout LAYOUT_addressModeV = LAYOUT.select(PathElement.groupElement("addressModeV"));
    /// The [VarHandle] of `addressModeV` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_addressModeV = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressModeV"));
    /// The byte offset of `addressModeW`.
    public static final long OFFSET_addressModeW = LAYOUT.byteOffset(PathElement.groupElement("addressModeW"));
    /// The memory layout of `addressModeW`.
    public static final MemoryLayout LAYOUT_addressModeW = LAYOUT.select(PathElement.groupElement("addressModeW"));
    /// The [VarHandle] of `addressModeW` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_addressModeW = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressModeW"));
    /// The byte offset of `mipLodBias`.
    public static final long OFFSET_mipLodBias = LAYOUT.byteOffset(PathElement.groupElement("mipLodBias"));
    /// The memory layout of `mipLodBias`.
    public static final MemoryLayout LAYOUT_mipLodBias = LAYOUT.select(PathElement.groupElement("mipLodBias"));
    /// The [VarHandle] of `mipLodBias` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mipLodBias = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mipLodBias"));
    /// The byte offset of `anisotropyEnable`.
    public static final long OFFSET_anisotropyEnable = LAYOUT.byteOffset(PathElement.groupElement("anisotropyEnable"));
    /// The memory layout of `anisotropyEnable`.
    public static final MemoryLayout LAYOUT_anisotropyEnable = LAYOUT.select(PathElement.groupElement("anisotropyEnable"));
    /// The [VarHandle] of `anisotropyEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_anisotropyEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("anisotropyEnable"));
    /// The byte offset of `maxAnisotropy`.
    public static final long OFFSET_maxAnisotropy = LAYOUT.byteOffset(PathElement.groupElement("maxAnisotropy"));
    /// The memory layout of `maxAnisotropy`.
    public static final MemoryLayout LAYOUT_maxAnisotropy = LAYOUT.select(PathElement.groupElement("maxAnisotropy"));
    /// The [VarHandle] of `maxAnisotropy` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxAnisotropy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxAnisotropy"));
    /// The byte offset of `compareEnable`.
    public static final long OFFSET_compareEnable = LAYOUT.byteOffset(PathElement.groupElement("compareEnable"));
    /// The memory layout of `compareEnable`.
    public static final MemoryLayout LAYOUT_compareEnable = LAYOUT.select(PathElement.groupElement("compareEnable"));
    /// The [VarHandle] of `compareEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_compareEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compareEnable"));
    /// The byte offset of `compareOp`.
    public static final long OFFSET_compareOp = LAYOUT.byteOffset(PathElement.groupElement("compareOp"));
    /// The memory layout of `compareOp`.
    public static final MemoryLayout LAYOUT_compareOp = LAYOUT.select(PathElement.groupElement("compareOp"));
    /// The [VarHandle] of `compareOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_compareOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compareOp"));
    /// The byte offset of `minLod`.
    public static final long OFFSET_minLod = LAYOUT.byteOffset(PathElement.groupElement("minLod"));
    /// The memory layout of `minLod`.
    public static final MemoryLayout LAYOUT_minLod = LAYOUT.select(PathElement.groupElement("minLod"));
    /// The [VarHandle] of `minLod` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minLod"));
    /// The byte offset of `maxLod`.
    public static final long OFFSET_maxLod = LAYOUT.byteOffset(PathElement.groupElement("maxLod"));
    /// The memory layout of `maxLod`.
    public static final MemoryLayout LAYOUT_maxLod = LAYOUT.select(PathElement.groupElement("maxLod"));
    /// The [VarHandle] of `maxLod` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLod"));
    /// The byte offset of `borderColor`.
    public static final long OFFSET_borderColor = LAYOUT.byteOffset(PathElement.groupElement("borderColor"));
    /// The memory layout of `borderColor`.
    public static final MemoryLayout LAYOUT_borderColor = LAYOUT.select(PathElement.groupElement("borderColor"));
    /// The [VarHandle] of `borderColor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_borderColor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("borderColor"));
    /// The byte offset of `unnormalizedCoordinates`.
    public static final long OFFSET_unnormalizedCoordinates = LAYOUT.byteOffset(PathElement.groupElement("unnormalizedCoordinates"));
    /// The memory layout of `unnormalizedCoordinates`.
    public static final MemoryLayout LAYOUT_unnormalizedCoordinates = LAYOUT.select(PathElement.groupElement("unnormalizedCoordinates"));
    /// The [VarHandle] of `unnormalizedCoordinates` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_unnormalizedCoordinates = LAYOUT.arrayElementVarHandle(PathElement.groupElement("unnormalizedCoordinates"));

    /// Creates `VkSamplerCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSamplerCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSamplerCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSamplerCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSamplerCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSamplerCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerCreateInfo`
    public static VkSamplerCreateInfo alloc(SegmentAllocator allocator) { return new VkSamplerCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSamplerCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerCreateInfo`
    public static VkSamplerCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkSamplerCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSamplerCreateInfo copyFrom(VkSamplerCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSamplerCreateInfo reinterpret(long count) { return new VkSamplerCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSamplerCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSamplerCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `magFilter` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int magFilter(MemorySegment segment, long index) { return (int) VH_magFilter.get(segment, 0L, index); }
    /// {@return `magFilter`}
    public int magFilter() { return magFilter(this.segment(), 0L); }
    /// Sets `magFilter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void magFilter(MemorySegment segment, long index, int value) { VH_magFilter.set(segment, 0L, index, value); }
    /// Sets `magFilter` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo magFilter(int value) { magFilter(this.segment(), 0L, value); return this; }

    /// {@return `minFilter` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minFilter(MemorySegment segment, long index) { return (int) VH_minFilter.get(segment, 0L, index); }
    /// {@return `minFilter`}
    public int minFilter() { return minFilter(this.segment(), 0L); }
    /// Sets `minFilter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minFilter(MemorySegment segment, long index, int value) { VH_minFilter.set(segment, 0L, index, value); }
    /// Sets `minFilter` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo minFilter(int value) { minFilter(this.segment(), 0L, value); return this; }

    /// {@return `mipmapMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mipmapMode(MemorySegment segment, long index) { return (int) VH_mipmapMode.get(segment, 0L, index); }
    /// {@return `mipmapMode`}
    public int mipmapMode() { return mipmapMode(this.segment(), 0L); }
    /// Sets `mipmapMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mipmapMode(MemorySegment segment, long index, int value) { VH_mipmapMode.set(segment, 0L, index, value); }
    /// Sets `mipmapMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo mipmapMode(int value) { mipmapMode(this.segment(), 0L, value); return this; }

    /// {@return `addressModeU` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int addressModeU(MemorySegment segment, long index) { return (int) VH_addressModeU.get(segment, 0L, index); }
    /// {@return `addressModeU`}
    public int addressModeU() { return addressModeU(this.segment(), 0L); }
    /// Sets `addressModeU` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void addressModeU(MemorySegment segment, long index, int value) { VH_addressModeU.set(segment, 0L, index, value); }
    /// Sets `addressModeU` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo addressModeU(int value) { addressModeU(this.segment(), 0L, value); return this; }

    /// {@return `addressModeV` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int addressModeV(MemorySegment segment, long index) { return (int) VH_addressModeV.get(segment, 0L, index); }
    /// {@return `addressModeV`}
    public int addressModeV() { return addressModeV(this.segment(), 0L); }
    /// Sets `addressModeV` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void addressModeV(MemorySegment segment, long index, int value) { VH_addressModeV.set(segment, 0L, index, value); }
    /// Sets `addressModeV` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo addressModeV(int value) { addressModeV(this.segment(), 0L, value); return this; }

    /// {@return `addressModeW` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int addressModeW(MemorySegment segment, long index) { return (int) VH_addressModeW.get(segment, 0L, index); }
    /// {@return `addressModeW`}
    public int addressModeW() { return addressModeW(this.segment(), 0L); }
    /// Sets `addressModeW` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void addressModeW(MemorySegment segment, long index, int value) { VH_addressModeW.set(segment, 0L, index, value); }
    /// Sets `addressModeW` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo addressModeW(int value) { addressModeW(this.segment(), 0L, value); return this; }

    /// {@return `mipLodBias` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float mipLodBias(MemorySegment segment, long index) { return (float) VH_mipLodBias.get(segment, 0L, index); }
    /// {@return `mipLodBias`}
    public float mipLodBias() { return mipLodBias(this.segment(), 0L); }
    /// Sets `mipLodBias` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mipLodBias(MemorySegment segment, long index, float value) { VH_mipLodBias.set(segment, 0L, index, value); }
    /// Sets `mipLodBias` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo mipLodBias(float value) { mipLodBias(this.segment(), 0L, value); return this; }

    /// {@return `anisotropyEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int anisotropyEnable(MemorySegment segment, long index) { return (int) VH_anisotropyEnable.get(segment, 0L, index); }
    /// {@return `anisotropyEnable`}
    public int anisotropyEnable() { return anisotropyEnable(this.segment(), 0L); }
    /// Sets `anisotropyEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void anisotropyEnable(MemorySegment segment, long index, int value) { VH_anisotropyEnable.set(segment, 0L, index, value); }
    /// Sets `anisotropyEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo anisotropyEnable(int value) { anisotropyEnable(this.segment(), 0L, value); return this; }

    /// {@return `maxAnisotropy` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float maxAnisotropy(MemorySegment segment, long index) { return (float) VH_maxAnisotropy.get(segment, 0L, index); }
    /// {@return `maxAnisotropy`}
    public float maxAnisotropy() { return maxAnisotropy(this.segment(), 0L); }
    /// Sets `maxAnisotropy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxAnisotropy(MemorySegment segment, long index, float value) { VH_maxAnisotropy.set(segment, 0L, index, value); }
    /// Sets `maxAnisotropy` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo maxAnisotropy(float value) { maxAnisotropy(this.segment(), 0L, value); return this; }

    /// {@return `compareEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int compareEnable(MemorySegment segment, long index) { return (int) VH_compareEnable.get(segment, 0L, index); }
    /// {@return `compareEnable`}
    public int compareEnable() { return compareEnable(this.segment(), 0L); }
    /// Sets `compareEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void compareEnable(MemorySegment segment, long index, int value) { VH_compareEnable.set(segment, 0L, index, value); }
    /// Sets `compareEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo compareEnable(int value) { compareEnable(this.segment(), 0L, value); return this; }

    /// {@return `compareOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int compareOp(MemorySegment segment, long index) { return (int) VH_compareOp.get(segment, 0L, index); }
    /// {@return `compareOp`}
    public int compareOp() { return compareOp(this.segment(), 0L); }
    /// Sets `compareOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void compareOp(MemorySegment segment, long index, int value) { VH_compareOp.set(segment, 0L, index, value); }
    /// Sets `compareOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo compareOp(int value) { compareOp(this.segment(), 0L, value); return this; }

    /// {@return `minLod` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float minLod(MemorySegment segment, long index) { return (float) VH_minLod.get(segment, 0L, index); }
    /// {@return `minLod`}
    public float minLod() { return minLod(this.segment(), 0L); }
    /// Sets `minLod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minLod(MemorySegment segment, long index, float value) { VH_minLod.set(segment, 0L, index, value); }
    /// Sets `minLod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo minLod(float value) { minLod(this.segment(), 0L, value); return this; }

    /// {@return `maxLod` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float maxLod(MemorySegment segment, long index) { return (float) VH_maxLod.get(segment, 0L, index); }
    /// {@return `maxLod`}
    public float maxLod() { return maxLod(this.segment(), 0L); }
    /// Sets `maxLod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxLod(MemorySegment segment, long index, float value) { VH_maxLod.set(segment, 0L, index, value); }
    /// Sets `maxLod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo maxLod(float value) { maxLod(this.segment(), 0L, value); return this; }

    /// {@return `borderColor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int borderColor(MemorySegment segment, long index) { return (int) VH_borderColor.get(segment, 0L, index); }
    /// {@return `borderColor`}
    public int borderColor() { return borderColor(this.segment(), 0L); }
    /// Sets `borderColor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void borderColor(MemorySegment segment, long index, int value) { VH_borderColor.set(segment, 0L, index, value); }
    /// Sets `borderColor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo borderColor(int value) { borderColor(this.segment(), 0L, value); return this; }

    /// {@return `unnormalizedCoordinates` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int unnormalizedCoordinates(MemorySegment segment, long index) { return (int) VH_unnormalizedCoordinates.get(segment, 0L, index); }
    /// {@return `unnormalizedCoordinates`}
    public int unnormalizedCoordinates() { return unnormalizedCoordinates(this.segment(), 0L); }
    /// Sets `unnormalizedCoordinates` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void unnormalizedCoordinates(MemorySegment segment, long index, int value) { VH_unnormalizedCoordinates.set(segment, 0L, index, value); }
    /// Sets `unnormalizedCoordinates` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo unnormalizedCoordinates(int value) { unnormalizedCoordinates(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSamplerCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSamplerCreateInfo`
    public VkSamplerCreateInfo asSlice(long index) { return new VkSamplerCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSamplerCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSamplerCreateInfo`
    public VkSamplerCreateInfo asSlice(long index, long count) { return new VkSamplerCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSamplerCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSamplerCreateInfo at(long index, Consumer<VkSamplerCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `magFilter` at the given index}
    /// @param index the index of the struct buffer
    public int magFilterAt(long index) { return magFilter(this.segment(), index); }
    /// Sets `magFilter` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo magFilterAt(long index, int value) { magFilter(this.segment(), index, value); return this; }

    /// {@return `minFilter` at the given index}
    /// @param index the index of the struct buffer
    public int minFilterAt(long index) { return minFilter(this.segment(), index); }
    /// Sets `minFilter` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo minFilterAt(long index, int value) { minFilter(this.segment(), index, value); return this; }

    /// {@return `mipmapMode` at the given index}
    /// @param index the index of the struct buffer
    public int mipmapModeAt(long index) { return mipmapMode(this.segment(), index); }
    /// Sets `mipmapMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo mipmapModeAt(long index, int value) { mipmapMode(this.segment(), index, value); return this; }

    /// {@return `addressModeU` at the given index}
    /// @param index the index of the struct buffer
    public int addressModeUAt(long index) { return addressModeU(this.segment(), index); }
    /// Sets `addressModeU` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo addressModeUAt(long index, int value) { addressModeU(this.segment(), index, value); return this; }

    /// {@return `addressModeV` at the given index}
    /// @param index the index of the struct buffer
    public int addressModeVAt(long index) { return addressModeV(this.segment(), index); }
    /// Sets `addressModeV` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo addressModeVAt(long index, int value) { addressModeV(this.segment(), index, value); return this; }

    /// {@return `addressModeW` at the given index}
    /// @param index the index of the struct buffer
    public int addressModeWAt(long index) { return addressModeW(this.segment(), index); }
    /// Sets `addressModeW` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo addressModeWAt(long index, int value) { addressModeW(this.segment(), index, value); return this; }

    /// {@return `mipLodBias` at the given index}
    /// @param index the index of the struct buffer
    public float mipLodBiasAt(long index) { return mipLodBias(this.segment(), index); }
    /// Sets `mipLodBias` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo mipLodBiasAt(long index, float value) { mipLodBias(this.segment(), index, value); return this; }

    /// {@return `anisotropyEnable` at the given index}
    /// @param index the index of the struct buffer
    public int anisotropyEnableAt(long index) { return anisotropyEnable(this.segment(), index); }
    /// Sets `anisotropyEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo anisotropyEnableAt(long index, int value) { anisotropyEnable(this.segment(), index, value); return this; }

    /// {@return `maxAnisotropy` at the given index}
    /// @param index the index of the struct buffer
    public float maxAnisotropyAt(long index) { return maxAnisotropy(this.segment(), index); }
    /// Sets `maxAnisotropy` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo maxAnisotropyAt(long index, float value) { maxAnisotropy(this.segment(), index, value); return this; }

    /// {@return `compareEnable` at the given index}
    /// @param index the index of the struct buffer
    public int compareEnableAt(long index) { return compareEnable(this.segment(), index); }
    /// Sets `compareEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo compareEnableAt(long index, int value) { compareEnable(this.segment(), index, value); return this; }

    /// {@return `compareOp` at the given index}
    /// @param index the index of the struct buffer
    public int compareOpAt(long index) { return compareOp(this.segment(), index); }
    /// Sets `compareOp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo compareOpAt(long index, int value) { compareOp(this.segment(), index, value); return this; }

    /// {@return `minLod` at the given index}
    /// @param index the index of the struct buffer
    public float minLodAt(long index) { return minLod(this.segment(), index); }
    /// Sets `minLod` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo minLodAt(long index, float value) { minLod(this.segment(), index, value); return this; }

    /// {@return `maxLod` at the given index}
    /// @param index the index of the struct buffer
    public float maxLodAt(long index) { return maxLod(this.segment(), index); }
    /// Sets `maxLod` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo maxLodAt(long index, float value) { maxLod(this.segment(), index, value); return this; }

    /// {@return `borderColor` at the given index}
    /// @param index the index of the struct buffer
    public int borderColorAt(long index) { return borderColor(this.segment(), index); }
    /// Sets `borderColor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo borderColorAt(long index, int value) { borderColor(this.segment(), index, value); return this; }

    /// {@return `unnormalizedCoordinates` at the given index}
    /// @param index the index of the struct buffer
    public int unnormalizedCoordinatesAt(long index) { return unnormalizedCoordinates(this.segment(), index); }
    /// Sets `unnormalizedCoordinates` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo unnormalizedCoordinatesAt(long index, int value) { unnormalizedCoordinates(this.segment(), index, value); return this; }

}
