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

package overrungl.vma

import overrungl.gen.file.DefinitionFile
import overrungl.gen.generateLookupAccessor
import overrungl.gen.writeNativeImageRegistration

const val vmaPackage = "overrungl.vma"
const val vmaLookup = "VulkanMemoryAllocatorLibrary.lookup()"

fun main() {
    DefinitionFile("vk_mem_alloc.gen").compile(vmaPackage, "VkMemAlloc", vmaLookup)

    writeNativeImageRegistration(vmaPackage)
    generateLookupAccessor(
        packageName = "vma",
        className = "VulkanMemoryAllocatorLibrary",
        moduleName = "vma",
        basename = "VulkanMemoryAllocator",
        versionRef = "VMA_VERSION"
    )
}
