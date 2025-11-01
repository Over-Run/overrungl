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

// ported from scripts/vulkan_object.py

data class FeatureRequirement(
    val struct: String,
    val field: String,
    val depends: String?
)

data class Extension(
    val name: String,
    val nameString: String,
    val specVersion: String,

    val instance: Boolean,
    val device: Boolean,

    val depends: String?,
    val vendorTag: String?,
    val platform: String?,
    val protect: String?,
    val provisional: Boolean,
    val promotedTo: String?,
    val deprecatedBy: String?,
    val obsoletedBy: String?,
    val specialUse: List<String>,
    val featureRequirement: List<FeatureRequirement>,
    val ratified: Boolean,

    val handles: MutableMap<String, MutableList<Handle>>,
    val commands: MutableList<Command>,
    val structs: MutableList<Struct>,
    val enums: MutableList<VkEnum>,
    val bitmasks: MutableList<Bitmask>,
    val flags: MutableMap<String, MutableList<Flags>>,
    val enumFields: MutableMap<String, MutableList<EnumField>>,
    val flagBits: MutableMap<String, MutableList<Flag>>
)

data class Version(
    val name: String,
    val nameString: String,
    val nameApi: String,

    val featureRequirement: List<FeatureRequirement>
)

data class Handle(
    val name: String,
    val aliases: List<String>,

    val type: String,
    val protect: String?,

    val parent: Handle?,

    val instance: Boolean,
    val device: Boolean,

    val dispatchable: Boolean,

    val extensions: MutableList<String>
) {
    operator fun compareTo(other: Handle): Int = name.compareTo(other.name)
}

enum class ExternSync {
    NONE,
    ALWAYS,
    MAYBE,
    SUBTYPE,
    SUBTYPE_MAYBE,
}

data class Param(
    val name: String,
    val alias: String,

    val type: String,
    val fullType: String,

    val noAutoValidity: Boolean,

    val const: Boolean,
    val length: String?,
    val nullTerminated: Boolean,
    val pointer: Boolean,
    val fixedSizeArray: List<String>,

    val optional: Boolean,
    val optionalPointer: Boolean,

    val externSync: ExternSync,
    val externSyncPointer: String?,

    val cDeclaration: String
) {
    operator fun compareTo(other: Param): Int = name.compareTo(other.name)
}

enum class CommandScope {
    NONE,
    INSIDE,
    OUTSIDE,
    BOTH,
}

data class Command(
    val name: String,
    val alias: String?,
    val protect: String?,

    val extensions: MutableList<String>,
    val version: Version?,

    val returnType: String,

    val params: List<Param>,

    val instance: Boolean,
    val device: Boolean,

    val tasks: List<String>,
    val queues: List<String>,
    val allowNoQueues: Boolean,
    val successCodes: List<String>,
    val errorCodes: List<String>,

    val primary: Boolean,
    val secondary: Boolean,

    val renderPass: CommandScope,
    val videoCoding: CommandScope,

    val implicitExternSyncParams: List<String>,

    // val legacy: Legacy?,

    val cPrototype: String,
    val cFunctionPointer: String
) {
    operator fun compareTo(other: Param): Int = name.compareTo(other.name)
}

data class Member(
    val name: String,

    val type: String,
    val fullType: String,

    val noAutoValidity: Boolean,
    val limitType: String?,

    val const: Boolean,
    val length: String?,
    val nullTerminated: Boolean,
    val pointer: Boolean,
    val fixedSizeArray: List<String>,

    val optional: Boolean,
    val optionalPointer: Boolean,

    val externSync: ExternSync,

    val cDeclaration: String,

    val bitFieldWidth: Int?,

    val selector: String?,
    val selection: List<String>
) {
    operator fun compareTo(other: Param): Int = name.compareTo(other.name)
}

data class Struct(
    val name: String,
    val aliases: List<String>,

    val extensions: List<String>,
    val version: Version?,
    val protect: String?,

    val members: List<Member>,

    val union: Boolean,
    val returnedOnly: Boolean,

    val sType: String?,
    val allowDuplicate: Boolean,

    val extends: List<String>,
    val extendedBy: List<String>,

    var videoStdHeader: String? = null,
) {
    operator fun compareTo(other: Param): Int = name.compareTo(other.name)
}

data class EnumField(
    val name: String,
    val aliases: List<String>,

    val protect: String?,

    val negative: Boolean,
    val value: Int,
    val valueStr: String,

    val extensions: MutableList<String>
) {
    operator fun compareTo(other: Param): Int = name.compareTo(other.name)
}

data class VkEnum(
    val name: String,
    val aliases: List<String>,

    val protect: String?,

    val bitWidth: Int,
    val returnedOnly: Boolean,

    val fields: List<EnumField>,

    val extensions: List<String>,
    val fieldExtensions: MutableList<String>,

    val videoStdHeader: String? = null
) {
    operator fun compareTo(other: Param): Int = name.compareTo(other.name)
}

data class Flag(
    val name: String,
    val aliases: List<String>,

    val protect: String?,

    val value: Int,
    val valueStr: String,
    val multiBit: Boolean,
    val zero: Boolean,

    val extensions: MutableList<String>
) {
    operator fun compareTo(other: Param): Int = name.compareTo(other.name)
}

data class Bitmask(
    val name: String,
    val aliases: List<String>,

    val flagName: String,
    val protect: String?,

    val bitWidth: Int,
    val returnedOnly: Boolean,

    val flags: List<Flag>,

    val extensions: List<String>,
    val flagExtensions: MutableList<String>
) {
    operator fun compareTo(other: Param): Int = name.compareTo(other.name)
}

data class Flags(
    val name: String,
    val aliases: List<String>,

    val bitmaskName: String?,
    val protect: String?,

    val baseFlagsType: String,
    val bitWidth: Int,
    val returnedOnly: Boolean,

    val extensions: MutableList<String>
) {
    operator fun compareTo(other: Param): Int = name.compareTo(other.name)
}

sealed interface ConstantValue
data class ConstantValueInt(val value: Int) : ConstantValue
data class ConstantValueUInt(val value: UInt) : ConstantValue
data class ConstantValueULong(val value: ULong) : ConstantValue
data class ConstantValueFloat(val value: Float) : ConstantValue

data class Constant(
    val name: String,
    val type: String,
    val value: ConstantValue,
    val valueStr: String,

    var videoStdHeader: String? = null
)


data class VideoStdHeader(
    val name: String,
    val version: String?,

    val headerFile: String,

    val depends: List<String>
)

data class VideoStd(
    val headers: MutableMap<String, VideoStdHeader> = mutableMapOf(),

    var enums: MutableMap<String, VkEnum> = mutableMapOf(),
    var structs: MutableMap<String, Struct> = mutableMapOf(),
    var constants: MutableMap<String, Constant> = mutableMapOf()
)

data class VulkanObject(
    var headerVersion: Int = 0,
    var headerVersionComplete: String = "",

    val extensions: MutableMap<String, Extension> = mutableMapOf(),
    val versions: MutableMap<String, Version> = mutableMapOf(),

    val handles: MutableMap<String, Handle> = mutableMapOf(),
    val commands: MutableMap<String, Command> = mutableMapOf(),
    val structs: MutableMap<String, Struct> = mutableMapOf(),
    val enums: MutableMap<String, VkEnum> = mutableMapOf(),
    val bitmasks: MutableMap<String, Bitmask> = mutableMapOf(),
    val flags: MutableMap<String, Flags> = mutableMapOf(),
    val constants: MutableMap<String, Constant> = mutableMapOf(),

    val platforms: MutableMap<String, String> = mutableMapOf(),
    val vendorTags: MutableList<String> = mutableListOf(),

    var videoStd: VideoStd? = null,
)
