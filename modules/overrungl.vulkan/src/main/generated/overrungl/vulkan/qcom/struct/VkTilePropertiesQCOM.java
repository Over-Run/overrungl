// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTilePropertiesQCOM`.
/// ## Layout
/// ```
/// struct VkTilePropertiesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkExtent3D tileSize;
///     VkExtent2D apronSize;
///     VkOffset2D origin;
/// }
/// ```
public final class VkTilePropertiesQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("tileSize"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("apronSize"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("origin")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_tileSize = LAYOUT.byteOffset(PathElement.groupElement("tileSize"));
    public static final long OFFSET_apronSize = LAYOUT.byteOffset(PathElement.groupElement("apronSize"));
    public static final long OFFSET_origin = LAYOUT.byteOffset(PathElement.groupElement("origin"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_tileSize = LAYOUT.select(PathElement.groupElement("tileSize"));
    public static final MemoryLayout LAYOUT_apronSize = LAYOUT.select(PathElement.groupElement("apronSize"));
    public static final MemoryLayout LAYOUT_origin = LAYOUT.select(PathElement.groupElement("origin"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_tileSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_tileSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileSize"), PathElement.groupElement("height"));
    public static final VarHandle VH_tileSize$depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileSize"), PathElement.groupElement("depth"));
    public static final VarHandle VH_apronSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("apronSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_apronSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("apronSize"), PathElement.groupElement("height"));
    public static final VarHandle VH_origin$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("origin"), PathElement.groupElement("x"));
    public static final VarHandle VH_origin$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("origin"), PathElement.groupElement("y"));

    public VkTilePropertiesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkTilePropertiesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTilePropertiesQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkTilePropertiesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTilePropertiesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkTilePropertiesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTilePropertiesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkTilePropertiesQCOM alloc(SegmentAllocator allocator) { return new VkTilePropertiesQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkTilePropertiesQCOM alloc(SegmentAllocator allocator, long count) { return new VkTilePropertiesQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkTilePropertiesQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMTileProperties.VK_STRUCTURE_TYPE_TILE_PROPERTIES_QCOM); }
    public static VkTilePropertiesQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMTileProperties.VK_STRUCTURE_TYPE_TILE_PROPERTIES_QCOM);
        return s;
    }
    public VkTilePropertiesQCOM copyFrom(VkTilePropertiesQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkTilePropertiesQCOM reinterpret(long count) { return new VkTilePropertiesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkTilePropertiesQCOM asSlice(long index) { return new VkTilePropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkTilePropertiesQCOM asSlice(long index, long count) { return new VkTilePropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkTilePropertiesQCOM at(long index, Consumer<VkTilePropertiesQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int tileSize$widthAt(long index) { return (int) VH_tileSize$width.get(this.segment(), 0L, index); }
    public int tileSize$heightAt(long index) { return (int) VH_tileSize$height.get(this.segment(), 0L, index); }
    public int tileSize$depthAt(long index) { return (int) VH_tileSize$depth.get(this.segment(), 0L, index); }
    public int apronSize$widthAt(long index) { return (int) VH_apronSize$width.get(this.segment(), 0L, index); }
    public int apronSize$heightAt(long index) { return (int) VH_apronSize$height.get(this.segment(), 0L, index); }
    public int origin$xAt(long index) { return (int) VH_origin$x.get(this.segment(), 0L, index); }
    public int origin$yAt(long index) { return (int) VH_origin$y.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int tileSize$width() { return (int) VH_tileSize$width.get(this.segment(), 0L, 0L); }
    public int tileSize$height() { return (int) VH_tileSize$height.get(this.segment(), 0L, 0L); }
    public int tileSize$depth() { return (int) VH_tileSize$depth.get(this.segment(), 0L, 0L); }
    public int apronSize$width() { return (int) VH_apronSize$width.get(this.segment(), 0L, 0L); }
    public int apronSize$height() { return (int) VH_apronSize$height.get(this.segment(), 0L, 0L); }
    public int origin$x() { return (int) VH_origin$x.get(this.segment(), 0L, 0L); }
    public int origin$y() { return (int) VH_origin$y.get(this.segment(), 0L, 0L); }
    public VkTilePropertiesQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkTilePropertiesQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkTilePropertiesQCOM tileSize$widthAt(long index, int value) { VH_tileSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkTilePropertiesQCOM tileSize$heightAt(long index, int value) { VH_tileSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkTilePropertiesQCOM tileSize$depthAt(long index, int value) { VH_tileSize$depth.set(this.segment(), 0L, index, value); return this; }
    public VkTilePropertiesQCOM apronSize$widthAt(long index, int value) { VH_apronSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkTilePropertiesQCOM apronSize$heightAt(long index, int value) { VH_apronSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkTilePropertiesQCOM origin$xAt(long index, int value) { VH_origin$x.set(this.segment(), 0L, index, value); return this; }
    public VkTilePropertiesQCOM origin$yAt(long index, int value) { VH_origin$y.set(this.segment(), 0L, index, value); return this; }
    public VkTilePropertiesQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkTilePropertiesQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkTilePropertiesQCOM tileSize$width(int value) { VH_tileSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkTilePropertiesQCOM tileSize$height(int value) { VH_tileSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkTilePropertiesQCOM tileSize$depth(int value) { VH_tileSize$depth.set(this.segment(), 0L, 0L, value); return this; }
    public VkTilePropertiesQCOM apronSize$width(int value) { VH_apronSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkTilePropertiesQCOM apronSize$height(int value) { VH_apronSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkTilePropertiesQCOM origin$x(int value) { VH_origin$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkTilePropertiesQCOM origin$y(int value) { VH_origin$y.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkTilePropertiesQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkTilePropertiesQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkTilePropertiesQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkTilePropertiesQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _tileSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileSize, index), LAYOUT_tileSize); }
    public MemorySegment _tileSize() { return _tileSizeAt(0L); }
    public VkTilePropertiesQCOM _tileSizeAt(long index, MemorySegment src) { _tileSizeAt(index).copyFrom(src); return this; }
    public VkTilePropertiesQCOM _tileSize(MemorySegment src) { return _tileSizeAt(0L, src); }
    public MemorySegment _apronSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_apronSize, index), LAYOUT_apronSize); }
    public MemorySegment _apronSize() { return _apronSizeAt(0L); }
    public VkTilePropertiesQCOM _apronSizeAt(long index, MemorySegment src) { _apronSizeAt(index).copyFrom(src); return this; }
    public VkTilePropertiesQCOM _apronSize(MemorySegment src) { return _apronSizeAt(0L, src); }
    public MemorySegment _originAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_origin, index), LAYOUT_origin); }
    public MemorySegment _origin() { return _originAt(0L); }
    public VkTilePropertiesQCOM _originAt(long index, MemorySegment src) { _originAt(index).copyFrom(src); return this; }
    public VkTilePropertiesQCOM _origin(MemorySegment src) { return _originAt(0L, src); }
}
