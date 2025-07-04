/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
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

/// The Vulkan Memory Allocator binding.
///
/// - [Source](https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator)
/// - [Document](https://gpuopen-librariesandsdks.github.io/VulkanMemoryAllocator/html/)
///
/// @author squid233
/// @since 0.1.0
module overrungl.vma {
    exports overrungl.vma;

    requires transitive overrungl.core;
    requires overrungl.vulkan;
    requires static org.graalvm.nativeimage;
}
