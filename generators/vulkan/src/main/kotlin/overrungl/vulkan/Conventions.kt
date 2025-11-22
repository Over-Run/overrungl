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

// ported from scripts/spec_tools/conventions.py

private val CATEGORIES_REQUIRING_VALIDATION = setOf(
    "handle",
    "enum",
    "bitmask",
    "basetype",
    null
)

val TYPES_KNOWN_ALWAYS_VALID = setOf(
    "char",
    "float",
    "int8_t", "uint8_t",
    "int16_t", "uint16_t",
    "int32_t", "uint32_t",
    "int64_t", "uint64_t",
    "size_t",
    "intptr_t", "uintptr_t",
    "int",
)

val EXT_NAME_DECOMPOSE_RE = Regex("(?<prefix>[A-Za-z]+)_(?<vendor>[A-Za-z]+)_(?<name>[\\w_]+)")

val API_VERSION_NAME_RE =
    Regex("(?<apivariant>[A-Za-z]+)(?:_(?:BASE|COMPUTE|GRAPHICS))?_VERSION_(?<major>[0-9]+)_(?<minor>[0-9]+)")

// TODO: what does this do?
abstract class ConventionsBase {
    protected var commandPrefix = null
    protected var typePrefix = null

    abstract val xmlApiName: String

    fun isApiVersionName(name: String): Boolean =
        API_VERSION_NAME_RE.matches(name)
}
