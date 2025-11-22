// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceTileShadingFeaturesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTileShadingFeaturesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 tileShading;
///     VkBool32 tileShadingFragmentStage;
///     VkBool32 tileShadingColorAttachments;
///     VkBool32 tileShadingDepthAttachments;
///     VkBool32 tileShadingStencilAttachments;
///     VkBool32 tileShadingInputAttachments;
///     VkBool32 tileShadingSampledAttachments;
///     VkBool32 tileShadingPerTileDraw;
///     VkBool32 tileShadingPerTileDispatch;
///     VkBool32 tileShadingDispatchTile;
///     VkBool32 tileShadingApron;
///     VkBool32 tileShadingAnisotropicApron;
///     VkBool32 tileShadingAtomicOps;
///     VkBool32 tileShadingImageProcessing;
/// }
/// ```
public final class VkPhysicalDeviceTileShadingFeaturesQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tileShading"),
        ValueLayout.JAVA_INT.withName("tileShadingFragmentStage"),
        ValueLayout.JAVA_INT.withName("tileShadingColorAttachments"),
        ValueLayout.JAVA_INT.withName("tileShadingDepthAttachments"),
        ValueLayout.JAVA_INT.withName("tileShadingStencilAttachments"),
        ValueLayout.JAVA_INT.withName("tileShadingInputAttachments"),
        ValueLayout.JAVA_INT.withName("tileShadingSampledAttachments"),
        ValueLayout.JAVA_INT.withName("tileShadingPerTileDraw"),
        ValueLayout.JAVA_INT.withName("tileShadingPerTileDispatch"),
        ValueLayout.JAVA_INT.withName("tileShadingDispatchTile"),
        ValueLayout.JAVA_INT.withName("tileShadingApron"),
        ValueLayout.JAVA_INT.withName("tileShadingAnisotropicApron"),
        ValueLayout.JAVA_INT.withName("tileShadingAtomicOps"),
        ValueLayout.JAVA_INT.withName("tileShadingImageProcessing")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_tileShading = LAYOUT.byteOffset(PathElement.groupElement("tileShading"));
    public static final long OFFSET_tileShadingFragmentStage = LAYOUT.byteOffset(PathElement.groupElement("tileShadingFragmentStage"));
    public static final long OFFSET_tileShadingColorAttachments = LAYOUT.byteOffset(PathElement.groupElement("tileShadingColorAttachments"));
    public static final long OFFSET_tileShadingDepthAttachments = LAYOUT.byteOffset(PathElement.groupElement("tileShadingDepthAttachments"));
    public static final long OFFSET_tileShadingStencilAttachments = LAYOUT.byteOffset(PathElement.groupElement("tileShadingStencilAttachments"));
    public static final long OFFSET_tileShadingInputAttachments = LAYOUT.byteOffset(PathElement.groupElement("tileShadingInputAttachments"));
    public static final long OFFSET_tileShadingSampledAttachments = LAYOUT.byteOffset(PathElement.groupElement("tileShadingSampledAttachments"));
    public static final long OFFSET_tileShadingPerTileDraw = LAYOUT.byteOffset(PathElement.groupElement("tileShadingPerTileDraw"));
    public static final long OFFSET_tileShadingPerTileDispatch = LAYOUT.byteOffset(PathElement.groupElement("tileShadingPerTileDispatch"));
    public static final long OFFSET_tileShadingDispatchTile = LAYOUT.byteOffset(PathElement.groupElement("tileShadingDispatchTile"));
    public static final long OFFSET_tileShadingApron = LAYOUT.byteOffset(PathElement.groupElement("tileShadingApron"));
    public static final long OFFSET_tileShadingAnisotropicApron = LAYOUT.byteOffset(PathElement.groupElement("tileShadingAnisotropicApron"));
    public static final long OFFSET_tileShadingAtomicOps = LAYOUT.byteOffset(PathElement.groupElement("tileShadingAtomicOps"));
    public static final long OFFSET_tileShadingImageProcessing = LAYOUT.byteOffset(PathElement.groupElement("tileShadingImageProcessing"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_tileShading = LAYOUT.select(PathElement.groupElement("tileShading"));
    public static final MemoryLayout LAYOUT_tileShadingFragmentStage = LAYOUT.select(PathElement.groupElement("tileShadingFragmentStage"));
    public static final MemoryLayout LAYOUT_tileShadingColorAttachments = LAYOUT.select(PathElement.groupElement("tileShadingColorAttachments"));
    public static final MemoryLayout LAYOUT_tileShadingDepthAttachments = LAYOUT.select(PathElement.groupElement("tileShadingDepthAttachments"));
    public static final MemoryLayout LAYOUT_tileShadingStencilAttachments = LAYOUT.select(PathElement.groupElement("tileShadingStencilAttachments"));
    public static final MemoryLayout LAYOUT_tileShadingInputAttachments = LAYOUT.select(PathElement.groupElement("tileShadingInputAttachments"));
    public static final MemoryLayout LAYOUT_tileShadingSampledAttachments = LAYOUT.select(PathElement.groupElement("tileShadingSampledAttachments"));
    public static final MemoryLayout LAYOUT_tileShadingPerTileDraw = LAYOUT.select(PathElement.groupElement("tileShadingPerTileDraw"));
    public static final MemoryLayout LAYOUT_tileShadingPerTileDispatch = LAYOUT.select(PathElement.groupElement("tileShadingPerTileDispatch"));
    public static final MemoryLayout LAYOUT_tileShadingDispatchTile = LAYOUT.select(PathElement.groupElement("tileShadingDispatchTile"));
    public static final MemoryLayout LAYOUT_tileShadingApron = LAYOUT.select(PathElement.groupElement("tileShadingApron"));
    public static final MemoryLayout LAYOUT_tileShadingAnisotropicApron = LAYOUT.select(PathElement.groupElement("tileShadingAnisotropicApron"));
    public static final MemoryLayout LAYOUT_tileShadingAtomicOps = LAYOUT.select(PathElement.groupElement("tileShadingAtomicOps"));
    public static final MemoryLayout LAYOUT_tileShadingImageProcessing = LAYOUT.select(PathElement.groupElement("tileShadingImageProcessing"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_tileShading = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShading"));
    public static final VarHandle VH_tileShadingFragmentStage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingFragmentStage"));
    public static final VarHandle VH_tileShadingColorAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingColorAttachments"));
    public static final VarHandle VH_tileShadingDepthAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingDepthAttachments"));
    public static final VarHandle VH_tileShadingStencilAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingStencilAttachments"));
    public static final VarHandle VH_tileShadingInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingInputAttachments"));
    public static final VarHandle VH_tileShadingSampledAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingSampledAttachments"));
    public static final VarHandle VH_tileShadingPerTileDraw = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingPerTileDraw"));
    public static final VarHandle VH_tileShadingPerTileDispatch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingPerTileDispatch"));
    public static final VarHandle VH_tileShadingDispatchTile = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingDispatchTile"));
    public static final VarHandle VH_tileShadingApron = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingApron"));
    public static final VarHandle VH_tileShadingAnisotropicApron = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingAnisotropicApron"));
    public static final VarHandle VH_tileShadingAtomicOps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingAtomicOps"));
    public static final VarHandle VH_tileShadingImageProcessing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingImageProcessing"));

    public VkPhysicalDeviceTileShadingFeaturesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceTileShadingFeaturesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileShadingFeaturesQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceTileShadingFeaturesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileShadingFeaturesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceTileShadingFeaturesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileShadingFeaturesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceTileShadingFeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTileShadingFeaturesQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceTileShadingFeaturesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTileShadingFeaturesQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMTileShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM); }
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMTileShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM);
        return s;
    }
    public VkPhysicalDeviceTileShadingFeaturesQCOM copyFrom(VkPhysicalDeviceTileShadingFeaturesQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM reinterpret(long count) { return new VkPhysicalDeviceTileShadingFeaturesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM asSlice(long index) { return new VkPhysicalDeviceTileShadingFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceTileShadingFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM at(long index, Consumer<VkPhysicalDeviceTileShadingFeaturesQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int tileShadingAt(long index) { return (int) VH_tileShading.get(this.segment(), 0L, index); }
    public int tileShadingFragmentStageAt(long index) { return (int) VH_tileShadingFragmentStage.get(this.segment(), 0L, index); }
    public int tileShadingColorAttachmentsAt(long index) { return (int) VH_tileShadingColorAttachments.get(this.segment(), 0L, index); }
    public int tileShadingDepthAttachmentsAt(long index) { return (int) VH_tileShadingDepthAttachments.get(this.segment(), 0L, index); }
    public int tileShadingStencilAttachmentsAt(long index) { return (int) VH_tileShadingStencilAttachments.get(this.segment(), 0L, index); }
    public int tileShadingInputAttachmentsAt(long index) { return (int) VH_tileShadingInputAttachments.get(this.segment(), 0L, index); }
    public int tileShadingSampledAttachmentsAt(long index) { return (int) VH_tileShadingSampledAttachments.get(this.segment(), 0L, index); }
    public int tileShadingPerTileDrawAt(long index) { return (int) VH_tileShadingPerTileDraw.get(this.segment(), 0L, index); }
    public int tileShadingPerTileDispatchAt(long index) { return (int) VH_tileShadingPerTileDispatch.get(this.segment(), 0L, index); }
    public int tileShadingDispatchTileAt(long index) { return (int) VH_tileShadingDispatchTile.get(this.segment(), 0L, index); }
    public int tileShadingApronAt(long index) { return (int) VH_tileShadingApron.get(this.segment(), 0L, index); }
    public int tileShadingAnisotropicApronAt(long index) { return (int) VH_tileShadingAnisotropicApron.get(this.segment(), 0L, index); }
    public int tileShadingAtomicOpsAt(long index) { return (int) VH_tileShadingAtomicOps.get(this.segment(), 0L, index); }
    public int tileShadingImageProcessingAt(long index) { return (int) VH_tileShadingImageProcessing.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int tileShading() { return (int) VH_tileShading.get(this.segment(), 0L, 0L); }
    public int tileShadingFragmentStage() { return (int) VH_tileShadingFragmentStage.get(this.segment(), 0L, 0L); }
    public int tileShadingColorAttachments() { return (int) VH_tileShadingColorAttachments.get(this.segment(), 0L, 0L); }
    public int tileShadingDepthAttachments() { return (int) VH_tileShadingDepthAttachments.get(this.segment(), 0L, 0L); }
    public int tileShadingStencilAttachments() { return (int) VH_tileShadingStencilAttachments.get(this.segment(), 0L, 0L); }
    public int tileShadingInputAttachments() { return (int) VH_tileShadingInputAttachments.get(this.segment(), 0L, 0L); }
    public int tileShadingSampledAttachments() { return (int) VH_tileShadingSampledAttachments.get(this.segment(), 0L, 0L); }
    public int tileShadingPerTileDraw() { return (int) VH_tileShadingPerTileDraw.get(this.segment(), 0L, 0L); }
    public int tileShadingPerTileDispatch() { return (int) VH_tileShadingPerTileDispatch.get(this.segment(), 0L, 0L); }
    public int tileShadingDispatchTile() { return (int) VH_tileShadingDispatchTile.get(this.segment(), 0L, 0L); }
    public int tileShadingApron() { return (int) VH_tileShadingApron.get(this.segment(), 0L, 0L); }
    public int tileShadingAnisotropicApron() { return (int) VH_tileShadingAnisotropicApron.get(this.segment(), 0L, 0L); }
    public int tileShadingAtomicOps() { return (int) VH_tileShadingAtomicOps.get(this.segment(), 0L, 0L); }
    public int tileShadingImageProcessing() { return (int) VH_tileShadingImageProcessing.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingAt(long index, int value) { VH_tileShading.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingFragmentStageAt(long index, int value) { VH_tileShadingFragmentStage.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingColorAttachmentsAt(long index, int value) { VH_tileShadingColorAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingDepthAttachmentsAt(long index, int value) { VH_tileShadingDepthAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingStencilAttachmentsAt(long index, int value) { VH_tileShadingStencilAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingInputAttachmentsAt(long index, int value) { VH_tileShadingInputAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingSampledAttachmentsAt(long index, int value) { VH_tileShadingSampledAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingPerTileDrawAt(long index, int value) { VH_tileShadingPerTileDraw.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingPerTileDispatchAt(long index, int value) { VH_tileShadingPerTileDispatch.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingDispatchTileAt(long index, int value) { VH_tileShadingDispatchTile.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingApronAt(long index, int value) { VH_tileShadingApron.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingAnisotropicApronAt(long index, int value) { VH_tileShadingAnisotropicApron.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingAtomicOpsAt(long index, int value) { VH_tileShadingAtomicOps.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingImageProcessingAt(long index, int value) { VH_tileShadingImageProcessing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShading(int value) { VH_tileShading.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingFragmentStage(int value) { VH_tileShadingFragmentStage.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingColorAttachments(int value) { VH_tileShadingColorAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingDepthAttachments(int value) { VH_tileShadingDepthAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingStencilAttachments(int value) { VH_tileShadingStencilAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingInputAttachments(int value) { VH_tileShadingInputAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingSampledAttachments(int value) { VH_tileShadingSampledAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingPerTileDraw(int value) { VH_tileShadingPerTileDraw.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingPerTileDispatch(int value) { VH_tileShadingPerTileDispatch.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingDispatchTile(int value) { VH_tileShadingDispatchTile.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingApron(int value) { VH_tileShadingApron.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingAnisotropicApron(int value) { VH_tileShadingAnisotropicApron.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingAtomicOps(int value) { VH_tileShadingAtomicOps.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingImageProcessing(int value) { VH_tileShadingImageProcessing.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _tileShadingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileShading, index), LAYOUT_tileShading); }
    public MemorySegment _tileShading() { return _tileShadingAt(0L); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingAt(long index, MemorySegment src) { _tileShadingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShading(MemorySegment src) { return _tileShadingAt(0L, src); }
    public MemorySegment _tileShadingFragmentStageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileShadingFragmentStage, index), LAYOUT_tileShadingFragmentStage); }
    public MemorySegment _tileShadingFragmentStage() { return _tileShadingFragmentStageAt(0L); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingFragmentStageAt(long index, MemorySegment src) { _tileShadingFragmentStageAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingFragmentStage(MemorySegment src) { return _tileShadingFragmentStageAt(0L, src); }
    public MemorySegment _tileShadingColorAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileShadingColorAttachments, index), LAYOUT_tileShadingColorAttachments); }
    public MemorySegment _tileShadingColorAttachments() { return _tileShadingColorAttachmentsAt(0L); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingColorAttachmentsAt(long index, MemorySegment src) { _tileShadingColorAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingColorAttachments(MemorySegment src) { return _tileShadingColorAttachmentsAt(0L, src); }
    public MemorySegment _tileShadingDepthAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileShadingDepthAttachments, index), LAYOUT_tileShadingDepthAttachments); }
    public MemorySegment _tileShadingDepthAttachments() { return _tileShadingDepthAttachmentsAt(0L); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingDepthAttachmentsAt(long index, MemorySegment src) { _tileShadingDepthAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingDepthAttachments(MemorySegment src) { return _tileShadingDepthAttachmentsAt(0L, src); }
    public MemorySegment _tileShadingStencilAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileShadingStencilAttachments, index), LAYOUT_tileShadingStencilAttachments); }
    public MemorySegment _tileShadingStencilAttachments() { return _tileShadingStencilAttachmentsAt(0L); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingStencilAttachmentsAt(long index, MemorySegment src) { _tileShadingStencilAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingStencilAttachments(MemorySegment src) { return _tileShadingStencilAttachmentsAt(0L, src); }
    public MemorySegment _tileShadingInputAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileShadingInputAttachments, index), LAYOUT_tileShadingInputAttachments); }
    public MemorySegment _tileShadingInputAttachments() { return _tileShadingInputAttachmentsAt(0L); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingInputAttachmentsAt(long index, MemorySegment src) { _tileShadingInputAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingInputAttachments(MemorySegment src) { return _tileShadingInputAttachmentsAt(0L, src); }
    public MemorySegment _tileShadingSampledAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileShadingSampledAttachments, index), LAYOUT_tileShadingSampledAttachments); }
    public MemorySegment _tileShadingSampledAttachments() { return _tileShadingSampledAttachmentsAt(0L); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingSampledAttachmentsAt(long index, MemorySegment src) { _tileShadingSampledAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingSampledAttachments(MemorySegment src) { return _tileShadingSampledAttachmentsAt(0L, src); }
    public MemorySegment _tileShadingPerTileDrawAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileShadingPerTileDraw, index), LAYOUT_tileShadingPerTileDraw); }
    public MemorySegment _tileShadingPerTileDraw() { return _tileShadingPerTileDrawAt(0L); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingPerTileDrawAt(long index, MemorySegment src) { _tileShadingPerTileDrawAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingPerTileDraw(MemorySegment src) { return _tileShadingPerTileDrawAt(0L, src); }
    public MemorySegment _tileShadingPerTileDispatchAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileShadingPerTileDispatch, index), LAYOUT_tileShadingPerTileDispatch); }
    public MemorySegment _tileShadingPerTileDispatch() { return _tileShadingPerTileDispatchAt(0L); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingPerTileDispatchAt(long index, MemorySegment src) { _tileShadingPerTileDispatchAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingPerTileDispatch(MemorySegment src) { return _tileShadingPerTileDispatchAt(0L, src); }
    public MemorySegment _tileShadingDispatchTileAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileShadingDispatchTile, index), LAYOUT_tileShadingDispatchTile); }
    public MemorySegment _tileShadingDispatchTile() { return _tileShadingDispatchTileAt(0L); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingDispatchTileAt(long index, MemorySegment src) { _tileShadingDispatchTileAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingDispatchTile(MemorySegment src) { return _tileShadingDispatchTileAt(0L, src); }
    public MemorySegment _tileShadingApronAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileShadingApron, index), LAYOUT_tileShadingApron); }
    public MemorySegment _tileShadingApron() { return _tileShadingApronAt(0L); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingApronAt(long index, MemorySegment src) { _tileShadingApronAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingApron(MemorySegment src) { return _tileShadingApronAt(0L, src); }
    public MemorySegment _tileShadingAnisotropicApronAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileShadingAnisotropicApron, index), LAYOUT_tileShadingAnisotropicApron); }
    public MemorySegment _tileShadingAnisotropicApron() { return _tileShadingAnisotropicApronAt(0L); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingAnisotropicApronAt(long index, MemorySegment src) { _tileShadingAnisotropicApronAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingAnisotropicApron(MemorySegment src) { return _tileShadingAnisotropicApronAt(0L, src); }
    public MemorySegment _tileShadingAtomicOpsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileShadingAtomicOps, index), LAYOUT_tileShadingAtomicOps); }
    public MemorySegment _tileShadingAtomicOps() { return _tileShadingAtomicOpsAt(0L); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingAtomicOpsAt(long index, MemorySegment src) { _tileShadingAtomicOpsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingAtomicOps(MemorySegment src) { return _tileShadingAtomicOpsAt(0L, src); }
    public MemorySegment _tileShadingImageProcessingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileShadingImageProcessing, index), LAYOUT_tileShadingImageProcessing); }
    public MemorySegment _tileShadingImageProcessing() { return _tileShadingImageProcessingAt(0L); }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingImageProcessingAt(long index, MemorySegment src) { _tileShadingImageProcessingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingFeaturesQCOM _tileShadingImageProcessing(MemorySegment src) { return _tileShadingImageProcessingAt(0L, src); }
}
