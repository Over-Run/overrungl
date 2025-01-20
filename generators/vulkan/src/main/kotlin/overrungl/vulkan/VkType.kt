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

package overrungl.vulkan

import overrungl.gen.CustomTypeSpec

data class VkType(
    val originalName: String,
    val javaName: String,
    val layout: String?,
    val struct: Boolean
) {
    fun toCustomTypeSpec(): CustomTypeSpec {
        val typeName = when (javaName) {
            "void" -> "void"
            "byte" -> "byte"
            "short" -> "short"
            "int" -> "int"
            "long" -> "long"
            "float" -> "float"
            "double" -> "double"
            "MemorySegment" -> "MemorySegment"
            else -> error(javaName)
        }
        return CustomTypeSpec(carrier = typeName, javaType = typeName, layout = layout, cType = originalName)
    }

    fun annotatedTypeName(): String {
        if (originalName == javaName) return javaName
        return """@CType("$originalName") $javaName"""
    }
}

val enumConstants = mutableMapOf<String, VkEnumConstant>()
val vkEnums = mutableMapOf<String, VkEnumType>()
val vkEnumClass = mutableMapOf<String, String>() // defines where they first appeared

data class VkEnumConstant(val type: String, val name: String, val value: String)
data class VkEnum(val name: String, val value: String?, val bitpos: String?, val alias: String?)
data class VkEnumType(val name: String, val type: String, val bitwidth: String?, val enums: MutableList<VkEnum>) {
    fun javaType(): String =
        if (bitwidth != null) {
            when (bitwidth) {
                "64" -> "long"
                else -> error(bitwidth)
            }
        } else "int"
}

data class VkCommandParam(val type: VkType, val name: String)
data class VkCommand(val type: VkType, val name: String, val params: List<VkCommandParam>)

data class VkRequireEnum(
    val extends: String?,
    val name: String,
    val extnumber: String?,
    val offset: String?,
    val dir: String?,
    val bitpos: String?,
    val value: String?,
    val alias: String?,
    val api: String?
)

val recordingErrorType = mutableSetOf<String>()
val typeMap = mutableMapOf<String, VkType>()

private fun basicType(originalName: String, javaName: String, layout: String?): VkType =
    VkType(originalName, javaName, layout, struct = false).also { typeMap[it.originalName] = it }

internal fun typedef(from: VkType, name: String): VkType =
    from.copy(originalName = name).also { typeMap[it.originalName] = it }

val void = basicType("void", "void", null)
val char = basicType("char", "byte", "ValueLayout.JAVA_BYTE")
val float = basicType("float", "float", "ValueLayout.JAVA_FLOAT")
val double = basicType("double", "double", "ValueLayout.JAVA_DOUBLE")
val int8_t = basicType("int8_t", "byte", "ValueLayout.JAVA_BYTE")
val uint8_t = basicType("uint8_t", "byte", "ValueLayout.JAVA_BYTE")
val int16_t = basicType("int16_t", "short", "ValueLayout.JAVA_SHORT")
val uint16_t = basicType("uint16_t", "short", "ValueLayout.JAVA_SHORT")
val uint32_t = basicType("uint32_t", "int", "ValueLayout.JAVA_INT")
val uint64_t = basicType("uint64_t", "long", "ValueLayout.JAVA_LONG")
val int32_t = basicType("int32_t", "int", "ValueLayout.JAVA_INT")
val int64_t = basicType("int64_t", "long", "ValueLayout.JAVA_LONG")
val size_t = basicType("size_t", "long", "ValueLayout.JAVA_LONG")
val int = basicType("int", "int", "ValueLayout.JAVA_INT")

val address = VkType("MemorySegment", "MemorySegment", "ValueLayout.ADDRESS", struct = false)

val ANativeWindow = typedef(address, "ANativeWindow")
val AHardwareBuffer = typedef(address, "AHardwareBuffer")
val CAMetalLayer = typedef(void, "CAMetalLayer")
val MTLDevice_id = typedef(address, "MTLDevice_id")
val MTLCommandQueue_id = typedef(address, "MTLCommandQueue_id")
val MTLBuffer_id = typedef(address, "MTLBuffer_id")
val MTLTexture_id = typedef(address, "MTLTexture_id")
val MTLSharedEvent_id = typedef(address, "MTLSharedEvent_id")
val IOSurfaceRef = typedef(address, "IOSurfaceRef")
val VkSampleMask = typedef(uint32_t, "VkSampleMask")
val VkBool32 = typedef(uint32_t, "VkBool32")
val VkFlags = typedef(uint32_t, "VkFlags")
val VkFlags64 = typedef(uint64_t, "VkFlags64")
val VkDeviceSize = typedef(uint64_t, "VkDeviceSize")
val VkDeviceAddress = typedef(uint64_t, "VkDeviceAddress")
val VkRemoteAddressNV = typedef(address, "VkRemoteAddressNV")

val Display = typedef(address, "Display")
val VisualID = typedef(uint64_t, "VisualID")
val Window = typedef(uint64_t, "Window")
val RROutput = typedef(uint64_t, "RROutput")
val wl_display = typedef(address, "wl_display")
val wl_surface = typedef(address, "wl_surface")
val HINSTANCE = typedef(address, "HINSTANCE")
val HWND = typedef(address, "HWND")
val HMONITOR = typedef(address, "HMONITOR")
val HANDLE = typedef(address, "HANDLE")
val SECURITY_ATTRIBUTES = typedef(address, "SECURITY_ATTRIBUTES")
val DWORD = typedef(int32_t, "DWORD")
val LPCWSTR = typedef(address, "LPCWSTR")
val xcb_connection_t = typedef(address, "xcb_connection_t")
val xcb_visualid_t = typedef(uint32_t, "xcb_visualid_t")
val xcb_window_t = typedef(uint32_t, "xcb_window_t")
val IDirectFB = typedef(address, "IDirectFB")
val IDirectFBSurface = typedef(address, "IDirectFBSurface")
val zx_handle_t = typedef(int32_t, "zx_handle_t")
val GgpStreamDescriptor = typedef(address, "GgpStreamDescriptor") // todo what type?
val GgpFrameToken = typedef(address, "GgpFrameToken")
val _screen_context = typedef(address, "_screen_context")
val _screen_window = typedef(address, "_screen_window")
val _screen_buffer = typedef(address, "_screen_buffer")
val NvSciSyncAttrList = typedef(address, "NvSciSyncAttrList")
val NvSciSyncObj = typedef(address, "NvSciSyncObj")
val NvSciSyncFence = typedef(address, "NvSciSyncFence")
val NvSciBufAttrList = typedef(address, "NvSciBufAttrList")
val NvSciBufObj = typedef(address, "NvSciBufObj")

sealed interface VkTypeComponent {
    val literal: String
}

data class VkTypeLiteral(override val literal: String) : VkTypeComponent
data class VkTypeResolving(override val literal: String) : VkTypeComponent

internal fun findType(typeResolving: VkTypeResolving): VkType {
    return typeMap[typeResolving.literal] ?: run {
        recordingErrorType.add(typeResolving.literal)
        int
    }
}

fun resolveType(components: List<VkTypeComponent>, selfReference: String? = null): VkType {
    val originalType = StringBuilder()
    var javaName: String? = null
    var layout: String? = null
    var struct = false
    components.forEachIndexed { index, it ->
        when (it) {
            is VkTypeLiteral -> {
                if (it.literal.isNotBlank()) {
                    if (index > 0) originalType.append(" ")
                    originalType.append(it.literal)
                }
            }

            is VkTypeResolving -> {
                if (index > 0) originalType.append(" ")
                originalType.append(it.literal)
                val find =
                    if (it.literal == selfReference) address
                    else findType(it)
                javaName = find.javaName
                layout = find.layout
                struct = find.struct
            }
        }
    }
    if (originalType.contains('*')) {
        javaName = "MemorySegment"
        layout = "ValueLayout.ADDRESS"
        struct = false
    }
    if (javaName == null) {
        error("""no Java name: "$originalType"""")
    }
    return VkType(originalType.toString(), javaName!!, layout, struct)
}
