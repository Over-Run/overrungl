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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.vulkan

// ported from scripts/vkconventions.py

private val CATEGORIES_REQUIRING_VALIDATION = setOf("handle", "enum", "bitmask")
val SPECIAL_WORDS = setOf(
    "16Bit",
    "2D",
    "3D",
    "8Bit",
    "AABB",
    "ASTC",
    "D3D12",
    "Float16",
    "Bfloat16",
    "Float8",
    "ImagePipe",
    "Int64",
    "Int8",
    "MacOS",
    "RGBA10X6",
    "Uint8",
    "Win32",
)
val EXCEPTION_PATTERN = Regex("(?<exception>${SPECIAL_WORDS.joinToString(separator = "|") { Regex.escape(it) }})")
val MAIN_RE = Regex(
    "(${EXCEPTION_PATTERN}|([0-9]+)|([A-Z][a-z]+)|([A-Z][A-Z]*(?![a-z])))"
)

class VulkanConventions : ConventionsBase() {
    override val xmlApiName: String = "vulkan"
}
