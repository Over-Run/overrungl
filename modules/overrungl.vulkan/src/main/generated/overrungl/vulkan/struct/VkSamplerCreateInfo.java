// This file is auto-generated. DO NOT EDIT!
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
///     VkStructureType sType;
///     const void* pNext;
///     VkSamplerCreateFlags flags;
///     VkFilter magFilter;
///     VkFilter minFilter;
///     VkSamplerMipmapMode mipmapMode;
///     VkSamplerAddressMode addressModeU;
///     VkSamplerAddressMode addressModeV;
///     VkSamplerAddressMode addressModeW;
///     float mipLodBias;
///     VkBool32 anisotropyEnable;
///     float maxAnisotropy;
///     VkBool32 compareEnable;
///     VkCompareOp compareOp;
///     float minLod;
///     float maxLod;
///     VkBorderColor borderColor;
///     VkBool32 unnormalizedCoordinates;
/// }
/// ```
public final class VkSamplerCreateInfo extends GroupType {
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
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_magFilter = LAYOUT.byteOffset(PathElement.groupElement("magFilter"));
    public static final long OFFSET_minFilter = LAYOUT.byteOffset(PathElement.groupElement("minFilter"));
    public static final long OFFSET_mipmapMode = LAYOUT.byteOffset(PathElement.groupElement("mipmapMode"));
    public static final long OFFSET_addressModeU = LAYOUT.byteOffset(PathElement.groupElement("addressModeU"));
    public static final long OFFSET_addressModeV = LAYOUT.byteOffset(PathElement.groupElement("addressModeV"));
    public static final long OFFSET_addressModeW = LAYOUT.byteOffset(PathElement.groupElement("addressModeW"));
    public static final long OFFSET_mipLodBias = LAYOUT.byteOffset(PathElement.groupElement("mipLodBias"));
    public static final long OFFSET_anisotropyEnable = LAYOUT.byteOffset(PathElement.groupElement("anisotropyEnable"));
    public static final long OFFSET_maxAnisotropy = LAYOUT.byteOffset(PathElement.groupElement("maxAnisotropy"));
    public static final long OFFSET_compareEnable = LAYOUT.byteOffset(PathElement.groupElement("compareEnable"));
    public static final long OFFSET_compareOp = LAYOUT.byteOffset(PathElement.groupElement("compareOp"));
    public static final long OFFSET_minLod = LAYOUT.byteOffset(PathElement.groupElement("minLod"));
    public static final long OFFSET_maxLod = LAYOUT.byteOffset(PathElement.groupElement("maxLod"));
    public static final long OFFSET_borderColor = LAYOUT.byteOffset(PathElement.groupElement("borderColor"));
    public static final long OFFSET_unnormalizedCoordinates = LAYOUT.byteOffset(PathElement.groupElement("unnormalizedCoordinates"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_magFilter = LAYOUT.select(PathElement.groupElement("magFilter"));
    public static final MemoryLayout LAYOUT_minFilter = LAYOUT.select(PathElement.groupElement("minFilter"));
    public static final MemoryLayout LAYOUT_mipmapMode = LAYOUT.select(PathElement.groupElement("mipmapMode"));
    public static final MemoryLayout LAYOUT_addressModeU = LAYOUT.select(PathElement.groupElement("addressModeU"));
    public static final MemoryLayout LAYOUT_addressModeV = LAYOUT.select(PathElement.groupElement("addressModeV"));
    public static final MemoryLayout LAYOUT_addressModeW = LAYOUT.select(PathElement.groupElement("addressModeW"));
    public static final MemoryLayout LAYOUT_mipLodBias = LAYOUT.select(PathElement.groupElement("mipLodBias"));
    public static final MemoryLayout LAYOUT_anisotropyEnable = LAYOUT.select(PathElement.groupElement("anisotropyEnable"));
    public static final MemoryLayout LAYOUT_maxAnisotropy = LAYOUT.select(PathElement.groupElement("maxAnisotropy"));
    public static final MemoryLayout LAYOUT_compareEnable = LAYOUT.select(PathElement.groupElement("compareEnable"));
    public static final MemoryLayout LAYOUT_compareOp = LAYOUT.select(PathElement.groupElement("compareOp"));
    public static final MemoryLayout LAYOUT_minLod = LAYOUT.select(PathElement.groupElement("minLod"));
    public static final MemoryLayout LAYOUT_maxLod = LAYOUT.select(PathElement.groupElement("maxLod"));
    public static final MemoryLayout LAYOUT_borderColor = LAYOUT.select(PathElement.groupElement("borderColor"));
    public static final MemoryLayout LAYOUT_unnormalizedCoordinates = LAYOUT.select(PathElement.groupElement("unnormalizedCoordinates"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_magFilter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("magFilter"));
    public static final VarHandle VH_minFilter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minFilter"));
    public static final VarHandle VH_mipmapMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mipmapMode"));
    public static final VarHandle VH_addressModeU = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressModeU"));
    public static final VarHandle VH_addressModeV = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressModeV"));
    public static final VarHandle VH_addressModeW = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressModeW"));
    public static final VarHandle VH_mipLodBias = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mipLodBias"));
    public static final VarHandle VH_anisotropyEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("anisotropyEnable"));
    public static final VarHandle VH_maxAnisotropy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxAnisotropy"));
    public static final VarHandle VH_compareEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compareEnable"));
    public static final VarHandle VH_compareOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compareOp"));
    public static final VarHandle VH_minLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minLod"));
    public static final VarHandle VH_maxLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLod"));
    public static final VarHandle VH_borderColor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("borderColor"));
    public static final VarHandle VH_unnormalizedCoordinates = LAYOUT.arrayElementVarHandle(PathElement.groupElement("unnormalizedCoordinates"));

    public VkSamplerCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSamplerCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkSamplerCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSamplerCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSamplerCreateInfo alloc(SegmentAllocator allocator) { return new VkSamplerCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkSamplerCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkSamplerCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkSamplerCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO); }
    public static VkSamplerCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO);
        return s;
    }
    public VkSamplerCreateInfo copyFrom(VkSamplerCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSamplerCreateInfo reinterpret(long count) { return new VkSamplerCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSamplerCreateInfo asSlice(long index) { return new VkSamplerCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSamplerCreateInfo asSlice(long index, long count) { return new VkSamplerCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSamplerCreateInfo at(long index, Consumer<VkSamplerCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int magFilterAt(long index) { return (int) VH_magFilter.get(this.segment(), 0L, index); }
    public int minFilterAt(long index) { return (int) VH_minFilter.get(this.segment(), 0L, index); }
    public int mipmapModeAt(long index) { return (int) VH_mipmapMode.get(this.segment(), 0L, index); }
    public int addressModeUAt(long index) { return (int) VH_addressModeU.get(this.segment(), 0L, index); }
    public int addressModeVAt(long index) { return (int) VH_addressModeV.get(this.segment(), 0L, index); }
    public int addressModeWAt(long index) { return (int) VH_addressModeW.get(this.segment(), 0L, index); }
    public float mipLodBiasAt(long index) { return (float) VH_mipLodBias.get(this.segment(), 0L, index); }
    public int anisotropyEnableAt(long index) { return (int) VH_anisotropyEnable.get(this.segment(), 0L, index); }
    public float maxAnisotropyAt(long index) { return (float) VH_maxAnisotropy.get(this.segment(), 0L, index); }
    public int compareEnableAt(long index) { return (int) VH_compareEnable.get(this.segment(), 0L, index); }
    public int compareOpAt(long index) { return (int) VH_compareOp.get(this.segment(), 0L, index); }
    public float minLodAt(long index) { return (float) VH_minLod.get(this.segment(), 0L, index); }
    public float maxLodAt(long index) { return (float) VH_maxLod.get(this.segment(), 0L, index); }
    public int borderColorAt(long index) { return (int) VH_borderColor.get(this.segment(), 0L, index); }
    public int unnormalizedCoordinatesAt(long index) { return (int) VH_unnormalizedCoordinates.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int magFilter() { return (int) VH_magFilter.get(this.segment(), 0L, 0L); }
    public int minFilter() { return (int) VH_minFilter.get(this.segment(), 0L, 0L); }
    public int mipmapMode() { return (int) VH_mipmapMode.get(this.segment(), 0L, 0L); }
    public int addressModeU() { return (int) VH_addressModeU.get(this.segment(), 0L, 0L); }
    public int addressModeV() { return (int) VH_addressModeV.get(this.segment(), 0L, 0L); }
    public int addressModeW() { return (int) VH_addressModeW.get(this.segment(), 0L, 0L); }
    public float mipLodBias() { return (float) VH_mipLodBias.get(this.segment(), 0L, 0L); }
    public int anisotropyEnable() { return (int) VH_anisotropyEnable.get(this.segment(), 0L, 0L); }
    public float maxAnisotropy() { return (float) VH_maxAnisotropy.get(this.segment(), 0L, 0L); }
    public int compareEnable() { return (int) VH_compareEnable.get(this.segment(), 0L, 0L); }
    public int compareOp() { return (int) VH_compareOp.get(this.segment(), 0L, 0L); }
    public float minLod() { return (float) VH_minLod.get(this.segment(), 0L, 0L); }
    public float maxLod() { return (float) VH_maxLod.get(this.segment(), 0L, 0L); }
    public int borderColor() { return (int) VH_borderColor.get(this.segment(), 0L, 0L); }
    public int unnormalizedCoordinates() { return (int) VH_unnormalizedCoordinates.get(this.segment(), 0L, 0L); }
    public VkSamplerCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCreateInfo magFilterAt(long index, int value) { VH_magFilter.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCreateInfo minFilterAt(long index, int value) { VH_minFilter.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCreateInfo mipmapModeAt(long index, int value) { VH_mipmapMode.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCreateInfo addressModeUAt(long index, int value) { VH_addressModeU.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCreateInfo addressModeVAt(long index, int value) { VH_addressModeV.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCreateInfo addressModeWAt(long index, int value) { VH_addressModeW.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCreateInfo mipLodBiasAt(long index, float value) { VH_mipLodBias.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCreateInfo anisotropyEnableAt(long index, int value) { VH_anisotropyEnable.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCreateInfo maxAnisotropyAt(long index, float value) { VH_maxAnisotropy.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCreateInfo compareEnableAt(long index, int value) { VH_compareEnable.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCreateInfo compareOpAt(long index, int value) { VH_compareOp.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCreateInfo minLodAt(long index, float value) { VH_minLod.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCreateInfo maxLodAt(long index, float value) { VH_maxLod.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCreateInfo borderColorAt(long index, int value) { VH_borderColor.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCreateInfo unnormalizedCoordinatesAt(long index, int value) { VH_unnormalizedCoordinates.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCreateInfo magFilter(int value) { VH_magFilter.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCreateInfo minFilter(int value) { VH_minFilter.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCreateInfo mipmapMode(int value) { VH_mipmapMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCreateInfo addressModeU(int value) { VH_addressModeU.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCreateInfo addressModeV(int value) { VH_addressModeV.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCreateInfo addressModeW(int value) { VH_addressModeW.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCreateInfo mipLodBias(float value) { VH_mipLodBias.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCreateInfo anisotropyEnable(int value) { VH_anisotropyEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCreateInfo maxAnisotropy(float value) { VH_maxAnisotropy.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCreateInfo compareEnable(int value) { VH_compareEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCreateInfo compareOp(int value) { VH_compareOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCreateInfo minLod(float value) { VH_minLod.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCreateInfo maxLod(float value) { VH_maxLod.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCreateInfo borderColor(int value) { VH_borderColor.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCreateInfo unnormalizedCoordinates(int value) { VH_unnormalizedCoordinates.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSamplerCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSamplerCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSamplerCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSamplerCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkSamplerCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkSamplerCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _magFilterAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_magFilter, index), LAYOUT_magFilter); }
    public MemorySegment _magFilter() { return _magFilterAt(0L); }
    public VkSamplerCreateInfo _magFilterAt(long index, MemorySegment src) { _magFilterAt(index).copyFrom(src); return this; }
    public VkSamplerCreateInfo _magFilter(MemorySegment src) { return _magFilterAt(0L, src); }
    public MemorySegment _minFilterAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minFilter, index), LAYOUT_minFilter); }
    public MemorySegment _minFilter() { return _minFilterAt(0L); }
    public VkSamplerCreateInfo _minFilterAt(long index, MemorySegment src) { _minFilterAt(index).copyFrom(src); return this; }
    public VkSamplerCreateInfo _minFilter(MemorySegment src) { return _minFilterAt(0L, src); }
    public MemorySegment _mipmapModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mipmapMode, index), LAYOUT_mipmapMode); }
    public MemorySegment _mipmapMode() { return _mipmapModeAt(0L); }
    public VkSamplerCreateInfo _mipmapModeAt(long index, MemorySegment src) { _mipmapModeAt(index).copyFrom(src); return this; }
    public VkSamplerCreateInfo _mipmapMode(MemorySegment src) { return _mipmapModeAt(0L, src); }
    public MemorySegment _addressModeUAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_addressModeU, index), LAYOUT_addressModeU); }
    public MemorySegment _addressModeU() { return _addressModeUAt(0L); }
    public VkSamplerCreateInfo _addressModeUAt(long index, MemorySegment src) { _addressModeUAt(index).copyFrom(src); return this; }
    public VkSamplerCreateInfo _addressModeU(MemorySegment src) { return _addressModeUAt(0L, src); }
    public MemorySegment _addressModeVAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_addressModeV, index), LAYOUT_addressModeV); }
    public MemorySegment _addressModeV() { return _addressModeVAt(0L); }
    public VkSamplerCreateInfo _addressModeVAt(long index, MemorySegment src) { _addressModeVAt(index).copyFrom(src); return this; }
    public VkSamplerCreateInfo _addressModeV(MemorySegment src) { return _addressModeVAt(0L, src); }
    public MemorySegment _addressModeWAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_addressModeW, index), LAYOUT_addressModeW); }
    public MemorySegment _addressModeW() { return _addressModeWAt(0L); }
    public VkSamplerCreateInfo _addressModeWAt(long index, MemorySegment src) { _addressModeWAt(index).copyFrom(src); return this; }
    public VkSamplerCreateInfo _addressModeW(MemorySegment src) { return _addressModeWAt(0L, src); }
    public MemorySegment _mipLodBiasAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mipLodBias, index), LAYOUT_mipLodBias); }
    public MemorySegment _mipLodBias() { return _mipLodBiasAt(0L); }
    public VkSamplerCreateInfo _mipLodBiasAt(long index, MemorySegment src) { _mipLodBiasAt(index).copyFrom(src); return this; }
    public VkSamplerCreateInfo _mipLodBias(MemorySegment src) { return _mipLodBiasAt(0L, src); }
    public MemorySegment _anisotropyEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_anisotropyEnable, index), LAYOUT_anisotropyEnable); }
    public MemorySegment _anisotropyEnable() { return _anisotropyEnableAt(0L); }
    public VkSamplerCreateInfo _anisotropyEnableAt(long index, MemorySegment src) { _anisotropyEnableAt(index).copyFrom(src); return this; }
    public VkSamplerCreateInfo _anisotropyEnable(MemorySegment src) { return _anisotropyEnableAt(0L, src); }
    public MemorySegment _maxAnisotropyAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxAnisotropy, index), LAYOUT_maxAnisotropy); }
    public MemorySegment _maxAnisotropy() { return _maxAnisotropyAt(0L); }
    public VkSamplerCreateInfo _maxAnisotropyAt(long index, MemorySegment src) { _maxAnisotropyAt(index).copyFrom(src); return this; }
    public VkSamplerCreateInfo _maxAnisotropy(MemorySegment src) { return _maxAnisotropyAt(0L, src); }
    public MemorySegment _compareEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_compareEnable, index), LAYOUT_compareEnable); }
    public MemorySegment _compareEnable() { return _compareEnableAt(0L); }
    public VkSamplerCreateInfo _compareEnableAt(long index, MemorySegment src) { _compareEnableAt(index).copyFrom(src); return this; }
    public VkSamplerCreateInfo _compareEnable(MemorySegment src) { return _compareEnableAt(0L, src); }
    public MemorySegment _compareOpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_compareOp, index), LAYOUT_compareOp); }
    public MemorySegment _compareOp() { return _compareOpAt(0L); }
    public VkSamplerCreateInfo _compareOpAt(long index, MemorySegment src) { _compareOpAt(index).copyFrom(src); return this; }
    public VkSamplerCreateInfo _compareOp(MemorySegment src) { return _compareOpAt(0L, src); }
    public MemorySegment _minLodAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minLod, index), LAYOUT_minLod); }
    public MemorySegment _minLod() { return _minLodAt(0L); }
    public VkSamplerCreateInfo _minLodAt(long index, MemorySegment src) { _minLodAt(index).copyFrom(src); return this; }
    public VkSamplerCreateInfo _minLod(MemorySegment src) { return _minLodAt(0L, src); }
    public MemorySegment _maxLodAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxLod, index), LAYOUT_maxLod); }
    public MemorySegment _maxLod() { return _maxLodAt(0L); }
    public VkSamplerCreateInfo _maxLodAt(long index, MemorySegment src) { _maxLodAt(index).copyFrom(src); return this; }
    public VkSamplerCreateInfo _maxLod(MemorySegment src) { return _maxLodAt(0L, src); }
    public MemorySegment _borderColorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_borderColor, index), LAYOUT_borderColor); }
    public MemorySegment _borderColor() { return _borderColorAt(0L); }
    public VkSamplerCreateInfo _borderColorAt(long index, MemorySegment src) { _borderColorAt(index).copyFrom(src); return this; }
    public VkSamplerCreateInfo _borderColor(MemorySegment src) { return _borderColorAt(0L, src); }
    public MemorySegment _unnormalizedCoordinatesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_unnormalizedCoordinates, index), LAYOUT_unnormalizedCoordinates); }
    public MemorySegment _unnormalizedCoordinates() { return _unnormalizedCoordinatesAt(0L); }
    public VkSamplerCreateInfo _unnormalizedCoordinatesAt(long index, MemorySegment src) { _unnormalizedCoordinatesAt(index).copyFrom(src); return this; }
    public VkSamplerCreateInfo _unnormalizedCoordinates(MemorySegment src) { return _unnormalizedCoordinatesAt(0L, src); }
}
