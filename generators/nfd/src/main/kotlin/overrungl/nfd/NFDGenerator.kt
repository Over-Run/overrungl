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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.nfd

import overrungl.gen.file.*
import overrungl.gen.writeNativeImageRegistration

const val nfdPackage = "overrungl.nfd"
const val nfdLookup = "NFDLibrary.lookup()"
const val nfdnchar_t_LAYOUT = "NFDInternal.nfdnchar_t"
const val nfdpathsetsize_t_LAYOUT = "NFDInternal.nfdpathsetsize_t"

fun main() {
    registerDefType(
        "nfdnchar_t", DynamicValueType(
            "nfdnchar_t",
            "int",
            memoryLayout = DefTypeDynamicValueLayout(
                memoryLayout = nfdnchar_t_LAYOUT,
                possibleActualTypes = listOf("ValueLayout.OfByte", "ValueLayout.OfChar"),
                carrierMap = mapOf("ValueLayout.OfByte" to "byte", "ValueLayout.OfChar" to "char"),
                asCharMap = mapOf("ValueLayout.OfByte" to 'B', "ValueLayout.OfChar" to 'C'),
            ),
            processor = SizingProcessor(nfdnchar_t_LAYOUT, "Int")
        )
    )
    registerDefType(
        "nfdpathsetsize_t",
        size_t.copy(
            memoryLayout = (size_t.memoryLayout as DefTypeDynamicValueLayout)
                .copy(memoryLayout = nfdpathsetsize_t_LAYOUT),
            processor = SizingProcessor(nfdpathsetsize_t_LAYOUT, "Long")
        )
    )
    DefinitionFile("nfd.gen").compile(nfdPackage, "NFD", nfdLookup, hasDowncall = false)

    writeNativeImageRegistration(nfdPackage, hasForeignFeature = false)
}
