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
package overrungl.vulkan.lunarg;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKLUNARGDirectDriverLoading {
    public static final int VK_DIRECT_DRIVER_LOADING_MODE_EXCLUSIVE_LUNARG = 0;
    public static final int VK_DIRECT_DRIVER_LOADING_MODE_INCLUSIVE_LUNARG = 1;
    public static final int VK_LUNARG_DIRECT_DRIVER_LOADING_SPEC_VERSION = 1;
    public static final String VK_LUNARG_DIRECT_DRIVER_LOADING_EXTENSION_NAME = "VK_LUNARG_direct_driver_loading";
    public static final int VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_INFO_LUNARG = 1000459000;
    public static final int VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_LIST_LUNARG = 1000459001;

    public VKLUNARGDirectDriverLoading(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
    }

}
