// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkApplicationInfo`.
/// ## Layout
/// ```
/// struct VkApplicationInfo {
///     VkStructureType sType;
///     const void* pNext;
///     const char* pApplicationName;
///     uint32_t applicationVersion;
///     const char* pEngineName;
///     uint32_t engineVersion;
///     uint32_t apiVersion;
/// }
/// ```
public final class VkApplicationInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pApplicationName"),
        ValueLayout.JAVA_INT.withName("applicationVersion"),
        ValueLayout.ADDRESS.withName("pEngineName"),
        ValueLayout.JAVA_INT.withName("engineVersion"),
        ValueLayout.JAVA_INT.withName("apiVersion")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pApplicationName = LAYOUT.byteOffset(PathElement.groupElement("pApplicationName"));
    public static final long OFFSET_applicationVersion = LAYOUT.byteOffset(PathElement.groupElement("applicationVersion"));
    public static final long OFFSET_pEngineName = LAYOUT.byteOffset(PathElement.groupElement("pEngineName"));
    public static final long OFFSET_engineVersion = LAYOUT.byteOffset(PathElement.groupElement("engineVersion"));
    public static final long OFFSET_apiVersion = LAYOUT.byteOffset(PathElement.groupElement("apiVersion"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pApplicationName = LAYOUT.select(PathElement.groupElement("pApplicationName"));
    public static final MemoryLayout LAYOUT_applicationVersion = LAYOUT.select(PathElement.groupElement("applicationVersion"));
    public static final MemoryLayout LAYOUT_pEngineName = LAYOUT.select(PathElement.groupElement("pEngineName"));
    public static final MemoryLayout LAYOUT_engineVersion = LAYOUT.select(PathElement.groupElement("engineVersion"));
    public static final MemoryLayout LAYOUT_apiVersion = LAYOUT.select(PathElement.groupElement("apiVersion"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pApplicationName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pApplicationName"));
    public static final VarHandle VH_applicationVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("applicationVersion"));
    public static final VarHandle VH_pEngineName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pEngineName"));
    public static final VarHandle VH_engineVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("engineVersion"));
    public static final VarHandle VH_apiVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("apiVersion"));

    public VkApplicationInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkApplicationInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkApplicationInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkApplicationInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkApplicationInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkApplicationInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkApplicationInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkApplicationInfo alloc(SegmentAllocator allocator) { return new VkApplicationInfo(allocator.allocate(LAYOUT), 1); }
    public static VkApplicationInfo alloc(SegmentAllocator allocator, long count) { return new VkApplicationInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkApplicationInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_APPLICATION_INFO); }
    public static VkApplicationInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_APPLICATION_INFO);
        return s;
    }
    public VkApplicationInfo copyFrom(VkApplicationInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkApplicationInfo reinterpret(long count) { return new VkApplicationInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkApplicationInfo asSlice(long index) { return new VkApplicationInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkApplicationInfo asSlice(long index, long count) { return new VkApplicationInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkApplicationInfo at(long index, Consumer<VkApplicationInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pApplicationNameAt(long index) { return (MemorySegment) VH_pApplicationName.get(this.segment(), 0L, index); }
    public int applicationVersionAt(long index) { return (int) VH_applicationVersion.get(this.segment(), 0L, index); }
    public MemorySegment pEngineNameAt(long index) { return (MemorySegment) VH_pEngineName.get(this.segment(), 0L, index); }
    public int engineVersionAt(long index) { return (int) VH_engineVersion.get(this.segment(), 0L, index); }
    public int apiVersionAt(long index) { return (int) VH_apiVersion.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pApplicationName() { return (MemorySegment) VH_pApplicationName.get(this.segment(), 0L, 0L); }
    public int applicationVersion() { return (int) VH_applicationVersion.get(this.segment(), 0L, 0L); }
    public MemorySegment pEngineName() { return (MemorySegment) VH_pEngineName.get(this.segment(), 0L, 0L); }
    public int engineVersion() { return (int) VH_engineVersion.get(this.segment(), 0L, 0L); }
    public int apiVersion() { return (int) VH_apiVersion.get(this.segment(), 0L, 0L); }
    public VkApplicationInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkApplicationInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkApplicationInfo pApplicationNameAt(long index, MemorySegment value) { VH_pApplicationName.set(this.segment(), 0L, index, value); return this; }
    public VkApplicationInfo applicationVersionAt(long index, int value) { VH_applicationVersion.set(this.segment(), 0L, index, value); return this; }
    public VkApplicationInfo pEngineNameAt(long index, MemorySegment value) { VH_pEngineName.set(this.segment(), 0L, index, value); return this; }
    public VkApplicationInfo engineVersionAt(long index, int value) { VH_engineVersion.set(this.segment(), 0L, index, value); return this; }
    public VkApplicationInfo apiVersionAt(long index, int value) { VH_apiVersion.set(this.segment(), 0L, index, value); return this; }
    public VkApplicationInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkApplicationInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkApplicationInfo pApplicationName(MemorySegment value) { VH_pApplicationName.set(this.segment(), 0L, 0L, value); return this; }
    public VkApplicationInfo applicationVersion(int value) { VH_applicationVersion.set(this.segment(), 0L, 0L, value); return this; }
    public VkApplicationInfo pEngineName(MemorySegment value) { VH_pEngineName.set(this.segment(), 0L, 0L, value); return this; }
    public VkApplicationInfo engineVersion(int value) { VH_engineVersion.set(this.segment(), 0L, 0L, value); return this; }
    public VkApplicationInfo apiVersion(int value) { VH_apiVersion.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkApplicationInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkApplicationInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkApplicationInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkApplicationInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pApplicationNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pApplicationName, index), LAYOUT_pApplicationName); }
    public MemorySegment _pApplicationName() { return _pApplicationNameAt(0L); }
    public VkApplicationInfo _pApplicationNameAt(long index, MemorySegment src) { _pApplicationNameAt(index).copyFrom(src); return this; }
    public VkApplicationInfo _pApplicationName(MemorySegment src) { return _pApplicationNameAt(0L, src); }
    public MemorySegment _applicationVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_applicationVersion, index), LAYOUT_applicationVersion); }
    public MemorySegment _applicationVersion() { return _applicationVersionAt(0L); }
    public VkApplicationInfo _applicationVersionAt(long index, MemorySegment src) { _applicationVersionAt(index).copyFrom(src); return this; }
    public VkApplicationInfo _applicationVersion(MemorySegment src) { return _applicationVersionAt(0L, src); }
    public MemorySegment _pEngineNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pEngineName, index), LAYOUT_pEngineName); }
    public MemorySegment _pEngineName() { return _pEngineNameAt(0L); }
    public VkApplicationInfo _pEngineNameAt(long index, MemorySegment src) { _pEngineNameAt(index).copyFrom(src); return this; }
    public VkApplicationInfo _pEngineName(MemorySegment src) { return _pEngineNameAt(0L, src); }
    public MemorySegment _engineVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_engineVersion, index), LAYOUT_engineVersion); }
    public MemorySegment _engineVersion() { return _engineVersionAt(0L); }
    public VkApplicationInfo _engineVersionAt(long index, MemorySegment src) { _engineVersionAt(index).copyFrom(src); return this; }
    public VkApplicationInfo _engineVersion(MemorySegment src) { return _engineVersionAt(0L, src); }
    public MemorySegment _apiVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_apiVersion, index), LAYOUT_apiVersion); }
    public MemorySegment _apiVersion() { return _apiVersionAt(0L); }
    public VkApplicationInfo _apiVersionAt(long index, MemorySegment src) { _apiVersionAt(index).copyFrom(src); return this; }
    public VkApplicationInfo _apiVersion(MemorySegment src) { return _apiVersionAt(0L, src); }
}
