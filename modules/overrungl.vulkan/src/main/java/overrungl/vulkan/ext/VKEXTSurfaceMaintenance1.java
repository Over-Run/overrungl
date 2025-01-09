/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKEXTSurfaceMaintenance1 {
    public static final int VK_PRESENT_SCALING_ONE_TO_ONE_BIT_EXT = 0x00000001;
    public static final int VK_PRESENT_SCALING_ASPECT_RATIO_STRETCH_BIT_EXT = 0x00000002;
    public static final int VK_PRESENT_SCALING_STRETCH_BIT_EXT = 0x00000004;
    public static final int VK_PRESENT_GRAVITY_MIN_BIT_EXT = 0x00000001;
    public static final int VK_PRESENT_GRAVITY_MAX_BIT_EXT = 0x00000002;
    public static final int VK_PRESENT_GRAVITY_CENTERED_BIT_EXT = 0x00000004;
    public static final int VK_EXT_SURFACE_MAINTENANCE_1_SPEC_VERSION = 1;
    public static final String VK_EXT_SURFACE_MAINTENANCE_1_EXTENSION_NAME = "VK_EXT_surface_maintenance1";
    public static final int VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT = 1000274000;
    public static final int VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT = 1000274001;
    public static final int VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_EXT = 1000274002;

    public VKEXTSurfaceMaintenance1(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
    }

}
