/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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

package overrungl.nfd

import overrungl.gen.file.*
import overrungl.gen.writeNativeImageRegistration

const val nfdPackage = "overrungl.nfd"
const val nfdLookup = "NFDInternal.lookup()"

fun main() {
    registerDefType(
        "nfdnchar_t", DynamicValueType(
            "nfdnchar_t",
            "int",
            memoryLayout = DefTypeDynamicValueLayout(
                memoryLayout = "NFDInternal.nfdnchar_t",
                possibleActualTypes = listOf("ValueLayout.OfByte", "ValueLayout.OfChar"),
                carrierMap = mapOf("ValueLayout.OfByte" to "byte", "ValueLayout.OfChar" to "char"),
                asCharMap = mapOf("ValueLayout.OfByte" to 'B', "ValueLayout.OfChar" to 'C'),
            ),
            processor = wchar_t.processor
        )
    )
    registerDefType(
        "nfdpathsetsize_t",
        size_t.copy(memoryLayout = (size_t.memoryLayout as DefTypeDynamicValueLayout)
            .copy(memoryLayout = "NFDInternal.nfdpathsetsize_t"))
    )
    DefinitionFile("nfd.gen").compile(nfdPackage, "NFD", nfdLookup)

    writeNativeImageRegistration(nfdPackage)
}
