// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTextureLODGatherFormatPropertiesAMD`.
/// ## Layout
/// ```
/// struct VkTextureLODGatherFormatPropertiesAMD {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 supportsTextureGatherLODBiasAMD;
/// }
/// ```
public final class VkTextureLODGatherFormatPropertiesAMD extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportsTextureGatherLODBiasAMD")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_supportsTextureGatherLODBiasAMD = LAYOUT.byteOffset(PathElement.groupElement("supportsTextureGatherLODBiasAMD"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_supportsTextureGatherLODBiasAMD = LAYOUT.select(PathElement.groupElement("supportsTextureGatherLODBiasAMD"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_supportsTextureGatherLODBiasAMD = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportsTextureGatherLODBiasAMD"));

    public VkTextureLODGatherFormatPropertiesAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkTextureLODGatherFormatPropertiesAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTextureLODGatherFormatPropertiesAMD(segment, estimateCount(segment, LAYOUT)); }
    public static VkTextureLODGatherFormatPropertiesAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTextureLODGatherFormatPropertiesAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkTextureLODGatherFormatPropertiesAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTextureLODGatherFormatPropertiesAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkTextureLODGatherFormatPropertiesAMD alloc(SegmentAllocator allocator) { return new VkTextureLODGatherFormatPropertiesAMD(allocator.allocate(LAYOUT), 1); }
    public static VkTextureLODGatherFormatPropertiesAMD alloc(SegmentAllocator allocator, long count) { return new VkTextureLODGatherFormatPropertiesAMD(allocator.allocate(LAYOUT, count), count); }
    public static VkTextureLODGatherFormatPropertiesAMD allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amd.VKAMDTextureGatherBiasLod.VK_STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD); }
    public static VkTextureLODGatherFormatPropertiesAMD allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amd.VKAMDTextureGatherBiasLod.VK_STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD);
        return s;
    }
    public VkTextureLODGatherFormatPropertiesAMD copyFrom(VkTextureLODGatherFormatPropertiesAMD src) { this.segment().copyFrom(src.segment()); return this; }
    public VkTextureLODGatherFormatPropertiesAMD reinterpret(long count) { return new VkTextureLODGatherFormatPropertiesAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkTextureLODGatherFormatPropertiesAMD asSlice(long index) { return new VkTextureLODGatherFormatPropertiesAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkTextureLODGatherFormatPropertiesAMD asSlice(long index, long count) { return new VkTextureLODGatherFormatPropertiesAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkTextureLODGatherFormatPropertiesAMD at(long index, Consumer<VkTextureLODGatherFormatPropertiesAMD> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int supportsTextureGatherLODBiasAMDAt(long index) { return (int) VH_supportsTextureGatherLODBiasAMD.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int supportsTextureGatherLODBiasAMD() { return (int) VH_supportsTextureGatherLODBiasAMD.get(this.segment(), 0L, 0L); }
    public VkTextureLODGatherFormatPropertiesAMD sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkTextureLODGatherFormatPropertiesAMD pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkTextureLODGatherFormatPropertiesAMD supportsTextureGatherLODBiasAMDAt(long index, int value) { VH_supportsTextureGatherLODBiasAMD.set(this.segment(), 0L, index, value); return this; }
    public VkTextureLODGatherFormatPropertiesAMD sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkTextureLODGatherFormatPropertiesAMD pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkTextureLODGatherFormatPropertiesAMD supportsTextureGatherLODBiasAMD(int value) { VH_supportsTextureGatherLODBiasAMD.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkTextureLODGatherFormatPropertiesAMD _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkTextureLODGatherFormatPropertiesAMD _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkTextureLODGatherFormatPropertiesAMD _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkTextureLODGatherFormatPropertiesAMD _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _supportsTextureGatherLODBiasAMDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportsTextureGatherLODBiasAMD, index), LAYOUT_supportsTextureGatherLODBiasAMD); }
    public MemorySegment _supportsTextureGatherLODBiasAMD() { return _supportsTextureGatherLODBiasAMDAt(0L); }
    public VkTextureLODGatherFormatPropertiesAMD _supportsTextureGatherLODBiasAMDAt(long index, MemorySegment src) { _supportsTextureGatherLODBiasAMDAt(index).copyFrom(src); return this; }
    public VkTextureLODGatherFormatPropertiesAMD _supportsTextureGatherLODBiasAMD(MemorySegment src) { return _supportsTextureGatherLODBiasAMDAt(0L, src); }
}
