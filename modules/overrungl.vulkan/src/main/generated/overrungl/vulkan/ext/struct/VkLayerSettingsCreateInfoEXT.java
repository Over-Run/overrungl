// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkLayerSettingsCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkLayerSettingsCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t settingCount;
///     const VkLayerSettingEXT* pSettings;
/// }
/// ```
public final class VkLayerSettingsCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("settingCount"),
        ValueLayout.ADDRESS.withName("pSettings")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_settingCount = LAYOUT.byteOffset(PathElement.groupElement("settingCount"));
    public static final long OFFSET_pSettings = LAYOUT.byteOffset(PathElement.groupElement("pSettings"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_settingCount = LAYOUT.select(PathElement.groupElement("settingCount"));
    public static final MemoryLayout LAYOUT_pSettings = LAYOUT.select(PathElement.groupElement("pSettings"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_settingCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("settingCount"));
    public static final VarHandle VH_pSettings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSettings"));

    public VkLayerSettingsCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkLayerSettingsCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLayerSettingsCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkLayerSettingsCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLayerSettingsCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkLayerSettingsCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkLayerSettingsCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkLayerSettingsCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkLayerSettingsCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkLayerSettingsCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkLayerSettingsCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkLayerSettingsCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTLayerSettings.VK_STRUCTURE_TYPE_LAYER_SETTINGS_CREATE_INFO_EXT); }
    public static VkLayerSettingsCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTLayerSettings.VK_STRUCTURE_TYPE_LAYER_SETTINGS_CREATE_INFO_EXT);
        return s;
    }
    public VkLayerSettingsCreateInfoEXT copyFrom(VkLayerSettingsCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkLayerSettingsCreateInfoEXT reinterpret(long count) { return new VkLayerSettingsCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkLayerSettingsCreateInfoEXT asSlice(long index) { return new VkLayerSettingsCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkLayerSettingsCreateInfoEXT asSlice(long index, long count) { return new VkLayerSettingsCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkLayerSettingsCreateInfoEXT at(long index, Consumer<VkLayerSettingsCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int settingCountAt(long index) { return (int) VH_settingCount.get(this.segment(), 0L, index); }
    public MemorySegment pSettingsAt(long index) { return (MemorySegment) VH_pSettings.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int settingCount() { return (int) VH_settingCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSettings() { return (MemorySegment) VH_pSettings.get(this.segment(), 0L, 0L); }
    public VkLayerSettingsCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkLayerSettingsCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkLayerSettingsCreateInfoEXT settingCountAt(long index, int value) { VH_settingCount.set(this.segment(), 0L, index, value); return this; }
    public VkLayerSettingsCreateInfoEXT pSettingsAt(long index, MemorySegment value) { VH_pSettings.set(this.segment(), 0L, index, value); return this; }
    public VkLayerSettingsCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkLayerSettingsCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkLayerSettingsCreateInfoEXT settingCount(int value) { VH_settingCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkLayerSettingsCreateInfoEXT pSettings(MemorySegment value) { VH_pSettings.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkLayerSettingsCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkLayerSettingsCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkLayerSettingsCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkLayerSettingsCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _settingCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_settingCount, index), LAYOUT_settingCount); }
    public MemorySegment _settingCount() { return _settingCountAt(0L); }
    public VkLayerSettingsCreateInfoEXT _settingCountAt(long index, MemorySegment src) { _settingCountAt(index).copyFrom(src); return this; }
    public VkLayerSettingsCreateInfoEXT _settingCount(MemorySegment src) { return _settingCountAt(0L, src); }
    public MemorySegment _pSettingsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSettings, index), LAYOUT_pSettings); }
    public MemorySegment _pSettings() { return _pSettingsAt(0L); }
    public VkLayerSettingsCreateInfoEXT _pSettingsAt(long index, MemorySegment src) { _pSettingsAt(index).copyFrom(src); return this; }
    public VkLayerSettingsCreateInfoEXT _pSettings(MemorySegment src) { return _pSettingsAt(0L, src); }
}
