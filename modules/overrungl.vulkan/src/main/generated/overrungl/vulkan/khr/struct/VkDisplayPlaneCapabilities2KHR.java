// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplayPlaneCapabilities2KHR`.
/// ## Layout
/// ```
/// struct VkDisplayPlaneCapabilities2KHR {
///     VkStructureType sType;
///     void* pNext;
///     VkDisplayPlaneCapabilitiesKHR capabilities;
/// }
/// ```
public final class VkDisplayPlaneCapabilities2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.struct.VkDisplayPlaneCapabilitiesKHR.LAYOUT.withName("capabilities")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_capabilities = LAYOUT.byteOffset(PathElement.groupElement("capabilities"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_capabilities = LAYOUT.select(PathElement.groupElement("capabilities"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_capabilities$supportedAlpha = LAYOUT.arrayElementVarHandle(PathElement.groupElement("capabilities"), PathElement.groupElement("supportedAlpha"));
    public static final VarHandle VH_capabilities$minSrcPosition$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("capabilities"), PathElement.groupElement("minSrcPosition"), PathElement.groupElement("x"));
    public static final VarHandle VH_capabilities$minSrcPosition$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("capabilities"), PathElement.groupElement("minSrcPosition"), PathElement.groupElement("y"));
    public static final VarHandle VH_capabilities$maxSrcPosition$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("capabilities"), PathElement.groupElement("maxSrcPosition"), PathElement.groupElement("x"));
    public static final VarHandle VH_capabilities$maxSrcPosition$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("capabilities"), PathElement.groupElement("maxSrcPosition"), PathElement.groupElement("y"));
    public static final VarHandle VH_capabilities$minSrcExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("capabilities"), PathElement.groupElement("minSrcExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_capabilities$minSrcExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("capabilities"), PathElement.groupElement("minSrcExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_capabilities$maxSrcExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("capabilities"), PathElement.groupElement("maxSrcExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_capabilities$maxSrcExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("capabilities"), PathElement.groupElement("maxSrcExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_capabilities$minDstPosition$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("capabilities"), PathElement.groupElement("minDstPosition"), PathElement.groupElement("x"));
    public static final VarHandle VH_capabilities$minDstPosition$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("capabilities"), PathElement.groupElement("minDstPosition"), PathElement.groupElement("y"));
    public static final VarHandle VH_capabilities$maxDstPosition$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("capabilities"), PathElement.groupElement("maxDstPosition"), PathElement.groupElement("x"));
    public static final VarHandle VH_capabilities$maxDstPosition$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("capabilities"), PathElement.groupElement("maxDstPosition"), PathElement.groupElement("y"));
    public static final VarHandle VH_capabilities$minDstExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("capabilities"), PathElement.groupElement("minDstExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_capabilities$minDstExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("capabilities"), PathElement.groupElement("minDstExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_capabilities$maxDstExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("capabilities"), PathElement.groupElement("maxDstExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_capabilities$maxDstExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("capabilities"), PathElement.groupElement("maxDstExtent"), PathElement.groupElement("height"));

    public VkDisplayPlaneCapabilities2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDisplayPlaneCapabilities2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlaneCapabilities2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDisplayPlaneCapabilities2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlaneCapabilities2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDisplayPlaneCapabilities2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlaneCapabilities2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDisplayPlaneCapabilities2KHR alloc(SegmentAllocator allocator) { return new VkDisplayPlaneCapabilities2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkDisplayPlaneCapabilities2KHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayPlaneCapabilities2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkDisplayPlaneCapabilities2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR); }
    public static VkDisplayPlaneCapabilities2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR);
        return s;
    }
    public VkDisplayPlaneCapabilities2KHR copyFrom(VkDisplayPlaneCapabilities2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDisplayPlaneCapabilities2KHR reinterpret(long count) { return new VkDisplayPlaneCapabilities2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDisplayPlaneCapabilities2KHR asSlice(long index) { return new VkDisplayPlaneCapabilities2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDisplayPlaneCapabilities2KHR asSlice(long index, long count) { return new VkDisplayPlaneCapabilities2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDisplayPlaneCapabilities2KHR at(long index, Consumer<VkDisplayPlaneCapabilities2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int capabilities$supportedAlphaAt(long index) { return (int) VH_capabilities$supportedAlpha.get(this.segment(), 0L, index); }
    public int capabilities$minSrcPosition$xAt(long index) { return (int) VH_capabilities$minSrcPosition$x.get(this.segment(), 0L, index); }
    public int capabilities$minSrcPosition$yAt(long index) { return (int) VH_capabilities$minSrcPosition$y.get(this.segment(), 0L, index); }
    public int capabilities$maxSrcPosition$xAt(long index) { return (int) VH_capabilities$maxSrcPosition$x.get(this.segment(), 0L, index); }
    public int capabilities$maxSrcPosition$yAt(long index) { return (int) VH_capabilities$maxSrcPosition$y.get(this.segment(), 0L, index); }
    public int capabilities$minSrcExtent$widthAt(long index) { return (int) VH_capabilities$minSrcExtent$width.get(this.segment(), 0L, index); }
    public int capabilities$minSrcExtent$heightAt(long index) { return (int) VH_capabilities$minSrcExtent$height.get(this.segment(), 0L, index); }
    public int capabilities$maxSrcExtent$widthAt(long index) { return (int) VH_capabilities$maxSrcExtent$width.get(this.segment(), 0L, index); }
    public int capabilities$maxSrcExtent$heightAt(long index) { return (int) VH_capabilities$maxSrcExtent$height.get(this.segment(), 0L, index); }
    public int capabilities$minDstPosition$xAt(long index) { return (int) VH_capabilities$minDstPosition$x.get(this.segment(), 0L, index); }
    public int capabilities$minDstPosition$yAt(long index) { return (int) VH_capabilities$minDstPosition$y.get(this.segment(), 0L, index); }
    public int capabilities$maxDstPosition$xAt(long index) { return (int) VH_capabilities$maxDstPosition$x.get(this.segment(), 0L, index); }
    public int capabilities$maxDstPosition$yAt(long index) { return (int) VH_capabilities$maxDstPosition$y.get(this.segment(), 0L, index); }
    public int capabilities$minDstExtent$widthAt(long index) { return (int) VH_capabilities$minDstExtent$width.get(this.segment(), 0L, index); }
    public int capabilities$minDstExtent$heightAt(long index) { return (int) VH_capabilities$minDstExtent$height.get(this.segment(), 0L, index); }
    public int capabilities$maxDstExtent$widthAt(long index) { return (int) VH_capabilities$maxDstExtent$width.get(this.segment(), 0L, index); }
    public int capabilities$maxDstExtent$heightAt(long index) { return (int) VH_capabilities$maxDstExtent$height.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int capabilities$supportedAlpha() { return (int) VH_capabilities$supportedAlpha.get(this.segment(), 0L, 0L); }
    public int capabilities$minSrcPosition$x() { return (int) VH_capabilities$minSrcPosition$x.get(this.segment(), 0L, 0L); }
    public int capabilities$minSrcPosition$y() { return (int) VH_capabilities$minSrcPosition$y.get(this.segment(), 0L, 0L); }
    public int capabilities$maxSrcPosition$x() { return (int) VH_capabilities$maxSrcPosition$x.get(this.segment(), 0L, 0L); }
    public int capabilities$maxSrcPosition$y() { return (int) VH_capabilities$maxSrcPosition$y.get(this.segment(), 0L, 0L); }
    public int capabilities$minSrcExtent$width() { return (int) VH_capabilities$minSrcExtent$width.get(this.segment(), 0L, 0L); }
    public int capabilities$minSrcExtent$height() { return (int) VH_capabilities$minSrcExtent$height.get(this.segment(), 0L, 0L); }
    public int capabilities$maxSrcExtent$width() { return (int) VH_capabilities$maxSrcExtent$width.get(this.segment(), 0L, 0L); }
    public int capabilities$maxSrcExtent$height() { return (int) VH_capabilities$maxSrcExtent$height.get(this.segment(), 0L, 0L); }
    public int capabilities$minDstPosition$x() { return (int) VH_capabilities$minDstPosition$x.get(this.segment(), 0L, 0L); }
    public int capabilities$minDstPosition$y() { return (int) VH_capabilities$minDstPosition$y.get(this.segment(), 0L, 0L); }
    public int capabilities$maxDstPosition$x() { return (int) VH_capabilities$maxDstPosition$x.get(this.segment(), 0L, 0L); }
    public int capabilities$maxDstPosition$y() { return (int) VH_capabilities$maxDstPosition$y.get(this.segment(), 0L, 0L); }
    public int capabilities$minDstExtent$width() { return (int) VH_capabilities$minDstExtent$width.get(this.segment(), 0L, 0L); }
    public int capabilities$minDstExtent$height() { return (int) VH_capabilities$minDstExtent$height.get(this.segment(), 0L, 0L); }
    public int capabilities$maxDstExtent$width() { return (int) VH_capabilities$maxDstExtent$width.get(this.segment(), 0L, 0L); }
    public int capabilities$maxDstExtent$height() { return (int) VH_capabilities$maxDstExtent$height.get(this.segment(), 0L, 0L); }
    public VkDisplayPlaneCapabilities2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$supportedAlphaAt(long index, int value) { VH_capabilities$supportedAlpha.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$minSrcPosition$xAt(long index, int value) { VH_capabilities$minSrcPosition$x.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$minSrcPosition$yAt(long index, int value) { VH_capabilities$minSrcPosition$y.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$maxSrcPosition$xAt(long index, int value) { VH_capabilities$maxSrcPosition$x.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$maxSrcPosition$yAt(long index, int value) { VH_capabilities$maxSrcPosition$y.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$minSrcExtent$widthAt(long index, int value) { VH_capabilities$minSrcExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$minSrcExtent$heightAt(long index, int value) { VH_capabilities$minSrcExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$maxSrcExtent$widthAt(long index, int value) { VH_capabilities$maxSrcExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$maxSrcExtent$heightAt(long index, int value) { VH_capabilities$maxSrcExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$minDstPosition$xAt(long index, int value) { VH_capabilities$minDstPosition$x.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$minDstPosition$yAt(long index, int value) { VH_capabilities$minDstPosition$y.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$maxDstPosition$xAt(long index, int value) { VH_capabilities$maxDstPosition$x.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$maxDstPosition$yAt(long index, int value) { VH_capabilities$maxDstPosition$y.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$minDstExtent$widthAt(long index, int value) { VH_capabilities$minDstExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$minDstExtent$heightAt(long index, int value) { VH_capabilities$minDstExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$maxDstExtent$widthAt(long index, int value) { VH_capabilities$maxDstExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$maxDstExtent$heightAt(long index, int value) { VH_capabilities$maxDstExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilities2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilities2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$supportedAlpha(int value) { VH_capabilities$supportedAlpha.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$minSrcPosition$x(int value) { VH_capabilities$minSrcPosition$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$minSrcPosition$y(int value) { VH_capabilities$minSrcPosition$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$maxSrcPosition$x(int value) { VH_capabilities$maxSrcPosition$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$maxSrcPosition$y(int value) { VH_capabilities$maxSrcPosition$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$minSrcExtent$width(int value) { VH_capabilities$minSrcExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$minSrcExtent$height(int value) { VH_capabilities$minSrcExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$maxSrcExtent$width(int value) { VH_capabilities$maxSrcExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$maxSrcExtent$height(int value) { VH_capabilities$maxSrcExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$minDstPosition$x(int value) { VH_capabilities$minDstPosition$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$minDstPosition$y(int value) { VH_capabilities$minDstPosition$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$maxDstPosition$x(int value) { VH_capabilities$maxDstPosition$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$maxDstPosition$y(int value) { VH_capabilities$maxDstPosition$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$minDstExtent$width(int value) { VH_capabilities$minDstExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$minDstExtent$height(int value) { VH_capabilities$minDstExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$maxDstExtent$width(int value) { VH_capabilities$maxDstExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilities2KHR capabilities$maxDstExtent$height(int value) { VH_capabilities$maxDstExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDisplayPlaneCapabilities2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDisplayPlaneCapabilities2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDisplayPlaneCapabilities2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDisplayPlaneCapabilities2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _capabilitiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_capabilities, index), LAYOUT_capabilities); }
    public MemorySegment _capabilities() { return _capabilitiesAt(0L); }
    public VkDisplayPlaneCapabilities2KHR _capabilitiesAt(long index, MemorySegment src) { _capabilitiesAt(index).copyFrom(src); return this; }
    public VkDisplayPlaneCapabilities2KHR _capabilities(MemorySegment src) { return _capabilitiesAt(0L, src); }
}
