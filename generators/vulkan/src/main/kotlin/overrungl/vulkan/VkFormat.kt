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

import org.w3c.dom.Element
import overrungl.gen.commentedFileHeader
import overrungl.gen.writeString
import kotlin.io.path.Path

data class VkFormat(
    val enumName: String,
    val enumClass: String,
    val blockSize: String,
    val texelsPerBlock: String,
    val blockExtent: String?,
    val packed: String?,
    val compressed: String?,
    val chroma: String?,
    val components: List<VkFormatComponent>?,
    val planes: List<VkFormatPlane>?,
    val spirvImageFormats: List<VkFormatSpirvImageFormat>?
)

data class VkFormatComponent(
    val name: String,
    val bits: String,
    val numericFormat: String,
    val planeIndex: String?
)

data class VkFormatPlane(
    val index: String,
    val widthDivisor: String,
    val heightDivisor: String,
    val compatible: String
)

data class VkFormatSpirvImageFormat(
    val name: String
)

fun formatTraits(formatsNode: Element) {
    val formats = mutableListOf<VkFormat>()
    formats.add(
        VkFormat(
            enumName = "VK_FORMAT_UNDEFINED",
            enumClass = "",
            blockSize = "0",
            texelsPerBlock = "0",
            blockExtent = null,
            packed = null,
            compressed = null,
            chroma = null,
            components = null,
            planes = null,
            spirvImageFormats = null
        )
    )
    val formatNodes = formatsNode.getElementsByTagName("format")
    for (i in 0 until formatNodes.length) {
        val formatElement = formatNodes.item(i) as Element
        val components = mutableListOf<VkFormatComponent>()
        val planes = mutableListOf<VkFormatPlane>()
        val spirvImageFormats = mutableListOf<VkFormatSpirvImageFormat>()

        val componentElements = formatElement.getElementsByTagName("component")
        val planeElements = formatElement.getElementsByTagName("plane")
        val spirvimageformatElements = formatElement.getElementsByTagName("spirvimageformat")

        for (n in 0 until componentElements.length) {
            val componentElement = componentElements.item(n) as Element
            components.add(
                VkFormatComponent(
                    name = componentElement.getAttribute("name"),
                    bits = componentElement.getAttribute("bits"),
                    numericFormat = componentElement.getAttribute("numericFormat"),
                    planeIndex = if (componentElement.hasAttribute("planeIndex"))
                        componentElement.getAttribute("planeIndex")
                    else null
                )
            )
        }
        for (n in 0 until planeElements.length) {
            val planeElement = planeElements.item(n) as Element
            planes.add(
                VkFormatPlane(
                    index = planeElement.getAttribute("index"),
                    widthDivisor = planeElement.getAttribute("widthDivisor"),
                    heightDivisor = planeElement.getAttribute("heightDivisor"),
                    compatible = planeElement.getAttribute("compatible")
                )
            )
        }
        for (n in 0 until spirvimageformatElements.length) {
            val spirvimageformatElement = spirvimageformatElements.item(n) as Element
            spirvImageFormats.add(VkFormatSpirvImageFormat(name = spirvimageformatElement.getAttribute("name")))
        }

        formats.add(
            VkFormat(
                enumName = formatElement.getAttribute("name"),
                enumClass = formatElement.getAttribute("class"),
                blockSize = formatElement.getAttribute("blockSize"),
                texelsPerBlock = formatElement.getAttribute("texelsPerBlock"),
                blockExtent = if (formatElement.hasAttribute("blockExtent"))
                    formatElement.getAttribute("blockExtent") else null,
                packed = if (formatElement.hasAttribute("packed"))
                    formatElement.getAttribute("packed") else null,
                compressed = if (formatElement.hasAttribute("compressed"))
                    formatElement.getAttribute("compressed") else null,
                chroma = if (formatElement.hasAttribute("chroma"))
                    formatElement.getAttribute("chroma") else null,
                components = components,
                planes = planes,
                spirvImageFormats = spirvImageFormats
            )
        )
    }

    writeString(Path("src/main/generated/overrungl/vulkan/VkFormat.java"), buildString {
        appendLine(commentedFileHeader)
        appendLine()
        appendLine("package $vulkanPackage;")
        appendLine()
        appendLine("import java.util.*;")
        val imports = mutableSetOf<String>()
        generatedEnumToClass.forEach { (enumName, classFullName) ->
            if (enumName.startsWith("VK_FORMAT_")) {
                imports.add(classFullName)
            }
        }
        imports.sorted().forEach { appendLine("import static $it.*;") }
        appendLine()
        appendLine("/// `VkFormat` adapted from [vulkan_format_traits.hpp](https://github.com/KhronosGroup/Vulkan-Hpp/blob/32f2957efcb552aebcfca3a6e66675ead4d1a240/vulkan/vulkan_format_traits.hpp)")
        appendLine("public enum VkFormat {")
        formats.forEach {
            append("    ${it.enumName.substringAfter("VK_FORMAT_")}(")

            // value
            append("${it.enumName}, ")

            // blockExtent
            append("new int[]{${it.blockExtent ?: "1,1,1"}}, ")

            // blockSize
            append("${it.blockSize}, ")

            // compatibilityClass
            append("\"${it.enumClass}\", ")

            // componentBits
            if (it.components?.any { c -> c.bits == "compressed" } ?: true) {
                append("null, ")
            } else {
                append("new int[]{${it.components.joinToString { c -> c.bits }}}, ")
            }

            // componentCount
            append(it.components?.size ?: 0)
            append(", ")

            // componentName
            if (it.components == null) {
                append("null, ")
            } else {
                append("new String[]{${it.components.joinToString { c -> "\"${c.name}\"" }}}, ")
            }

            // componentNumericFormat
            if (it.components == null) {
                append("null, ")
            } else {
                append("new String[]{${it.components.joinToString { c -> "\"${c.numericFormat}\"" }}}, ")
            }

            // componentPlaneIndex
            if (it.components?.any { c -> c.planeIndex == null } ?: true) {
                append("null, ")
            } else {
                append("new int[]{${it.components.joinToString { c -> c.planeIndex.toString() }}}, ")
            }

            // componentsAreCompressed
            if (it.components == null) {
                append("false, ")
            } else {
                append(it.components.any { c -> c.bits == "compressed" })
                append(", ")
            }

            // compressionScheme
            if (it.compressed == null) {
                append("null, ")
            } else {
                append("\"")
                append(it.compressed)
                append("\", ")
            }

            // hasAlphaComponent
            if (it.components == null) {
                append("false, ")
            } else {
                append(it.components.any { c -> c.name == "A" })
                append(", ")
            }
            // hasBlueComponent
            if (it.components == null) {
                append("false, ")
            } else {
                append(it.components.any { c -> c.name == "B" })
                append(", ")
            }
            // hasDepthComponent
            if (it.components == null) {
                append("false, ")
            } else {
                append(it.components.any { c -> c.name == "D" })
                append(", ")
            }
            // hasGreenComponent
            if (it.components == null) {
                append("false, ")
            } else {
                append(it.components.any { c -> c.name == "G" })
                append(", ")
            }
            // hasRedComponent
            if (it.components == null) {
                append("false, ")
            } else {
                append(it.components.any { c -> c.name == "R" })
                append(", ")
            }
            // hasStencilComponent
            if (it.components == null) {
                append("false, ")
            } else {
                append(it.components.any { c -> c.name == "S" })
                append(", ")
            }

            // packed
            if (it.packed == null) {
                append("0, ")
            } else {
                append("${it.packed}, ")
            }

            // planeCount
            if (it.planes == null) {
                append("0, ")
            } else if (it.planes.isEmpty()) {
                append("1, ")
            } else {
                append("${it.planes.size}, ")
            }

            // planeHeightDivisor
            if (it.planes == null) {
                append("null, ")
            } else if (it.planes.isEmpty()) {
                append("new int[]{1}, ")
            } else {
                append("new int[]{${it.planes.joinToString { p -> p.heightDivisor }}}, ")
            }

            // planeWidthDivisor
            if (it.planes == null) {
                append("null, ")
            } else if (it.planes.isEmpty()) {
                append("new int[]{1}, ")
            } else {
                append("new int[]{${it.planes.joinToString { p -> p.widthDivisor }}}, ")
            }

            // texelsPerBlock
            append(it.texelsPerBlock)


            appendLine("),")
        }
        appendLine("    ;")

        appendLine(
            """
                |    private final int value;
                |    private final int[] blockExtent;
                |    private final int blockSize;
                |    private final String compatibilityClass;
                |    private final int[] componentBits;
                |    private final int componentCount;
                |    private final String[] componentName;
                |    private final String[] componentNumericFormat;
                |    private final int[] componentPlaneIndex;
                |    private final boolean componentsAreCompressed;
                |    private final String compressionScheme;
                |    private final boolean hasAlphaComponent;
                |    private final boolean hasBlueComponent;
                |    private final boolean hasDepthComponent;
                |    private final boolean hasGreenComponent;
                |    private final boolean hasRedComponent;
                |    private final boolean hasStencilComponent;
                |    private final int packed;
                |    private final int planeCount;
                |    private final int[] planeHeightDivisor;
                |    private final int[] planeWidthDivisor;
                |    private final int texelsPerBlock;
                |    VkFormat(
                |        int value,
                |        int[] blockExtent,
                |        int blockSize,
                |        String compatibilityClass,
                |        int[] componentBits,
                |        int componentCount,
                |        String[] componentName,
                |        String[] componentNumericFormat,
                |        int[] componentPlaneIndex,
                |        boolean componentsAreCompressed,
                |        String compressionScheme,
                |        boolean hasAlphaComponent,
                |        boolean hasBlueComponent,
                |        boolean hasDepthComponent,
                |        boolean hasGreenComponent,
                |        boolean hasRedComponent,
                |        boolean hasStencilComponent,
                |        int packed,
                |        int planeCount,
                |        int[] planeHeightDivisor,
                |        int[] planeWidthDivisor,
                |        int texelsPerBlock
                |    ) {
                |        this.value = value;
                |        this.blockExtent = blockExtent;
                |        this.blockSize = blockSize;
                |        this.compatibilityClass = compatibilityClass;
                |        this.componentBits = componentBits;
                |        this.componentCount = componentCount;
                |        this.componentName = componentName;
                |        this.componentNumericFormat = componentNumericFormat;
                |        this.componentPlaneIndex = componentPlaneIndex;
                |        this.componentsAreCompressed = componentsAreCompressed;
                |        this.compressionScheme = compressionScheme;
                |        this.hasAlphaComponent = hasAlphaComponent;
                |        this.hasBlueComponent = hasBlueComponent;
                |        this.hasDepthComponent = hasDepthComponent;
                |        this.hasGreenComponent = hasGreenComponent;
                |        this.hasRedComponent = hasRedComponent;
                |        this.hasStencilComponent = hasStencilComponent;
                |        this.packed = packed;
                |        this.planeCount = planeCount;
                |        this.planeHeightDivisor = planeHeightDivisor;
                |        this.planeWidthDivisor = planeWidthDivisor;
                |        this.texelsPerBlock = texelsPerBlock;
                |    }
                |
                |    /// {@return the Vulkan enum value}
                |    public int value() { return value; };
                |    /// Gets [VkFormat] from the given enum value.
                |    /// @param value the enum value of the format
                |    /// @return the [VkFormat]
                |    public static VkFormat fromValue(int value) { return switch (value) {
            """.trimMargin()
        )
        formats.forEach {
            appendLine("        case ${it.enumName} -> ${it.enumName.substringAfter("VK_FORMAT_")};")
        }
        appendLine("        default -> throw new IllegalArgumentException(\"Unexpected value: \" + value); };")
        appendLine("    }")
        appendLine()

        appendLine(
            """
                |    /// The three-dimensional extent of a texel block.
                |    public int[] blockExtent() { return blockExtent.clone(); };
                |    /// The texel block size in bytes.
                |    public int blockSize() { return blockSize; };
                |    /// The class of the format (can't be just named "class"!)
                |    public String compatibilityClass() { return compatibilityClass; };
                |    /// The number of bits in this component, if not compressed, otherwise 0.
                |    public int componentBits(int component) { if (componentsAreCompressed) return 0; return componentBits[component]; }
                |    /// The number of components of this format.
                |    public int componentCount() { return componentCount; }
                |    /// The name of the component
                |    public String componentName(int component) { return componentName[component]; }
                |    /// The numeric format of the component
                |    public String componentNumericFormat(int component) { return componentNumericFormat[component]; }
                |    /// The plane this component lies in.
                |    public int componentPlaneIndex(int component) { return componentPlaneIndex != null ? componentPlaneIndex[component] : 0; }
                |    /// True, if the components of this format are compressed, otherwise false.
                |    public boolean componentsAreCompressed() { return componentsAreCompressed; }
                |    /// A textual description of the compression scheme, or an empty string if it is not compressed
                |    public String compressionScheme() { return compressionScheme != null ? compressionScheme : ""; }
            """.trimMargin()
        )
        appendLine()

        appendLine("    private static final List<VkFormat> allFormats = List.of(")
        appendLine(formats.filter { it.enumName != "VK_FORMAT_UNDEFINED" }
            .joinToString(separator = ",\n") { "        ${it.enumName.substringAfter("VK_FORMAT_")}" })
        appendLine("    );")
        appendLine(
            """
                |    /// Get all formats
                |    public static List<VkFormat> getAllFormats() { return allFormats; }
            """.trimMargin()
        )
        appendLine()

        appendLine("    private static final List<VkFormat> colorFormats = List.of(")
        appendLine(formats.filter {
            it.components?.any { c -> c.name == "R" || c.name == "G" || c.name == "B" || c.name == "A" } ?: false
        }.joinToString(separator = ",\n") { "        ${it.enumName.substringAfter("VK_FORMAT_")}" })
        appendLine("    );")
        appendLine(
            """
                |    /// Get all formats with a color component
                |    public static List<VkFormat> getColorFormats() { return colorFormats; }
            """.trimMargin()
        )
        appendLine()

        appendLine("    private static final List<VkFormat> depthFormats = List.of(")
        appendLine(formats.filter {
            it.components?.any { c -> c.name == "D" } ?: false
        }.joinToString(separator = ",\n") { "        ${it.enumName.substringAfter("VK_FORMAT_")}" })
        appendLine("    );")
        appendLine(
            """
                |    /// Get all formats with a depth component
                |    public static List<VkFormat> getDepthFormats() { return depthFormats; }
            """.trimMargin()
        )
        appendLine()

        appendLine("    private static final List<VkFormat> depthStencilFormats = List.of(")
        appendLine(formats.filter {
            (it.components?.any { c -> c.name == "D" } ?: false && it.components.any { c -> c.name == "S" })
        }.joinToString(separator = ",\n") { "        ${it.enumName.substringAfter("VK_FORMAT_")}" })
        appendLine("    );")
        appendLine(
            """
                |    /// Get all formats with a depth and a stencil component
                |    public static List<VkFormat> getDepthStencilFormats() { return depthStencilFormats; }
            """.trimMargin()
        )
        appendLine()

        appendLine("    private static final List<VkFormat> stencilFormats = List.of(")
        appendLine(formats.filter {
            it.components?.any { c -> c.name == "S" } ?: false
        }.joinToString(separator = ",\n") { "        ${it.enumName.substringAfter("VK_FORMAT_")}" })
        appendLine("    );")
        appendLine(
            """
                |    /// Get all formats with a stencil component
                |    public static List<VkFormat> getStencilFormats() { return stencilFormats; }
            """.trimMargin()
        )
        appendLine()

        appendLine(
            """
                |    /// True, if this format has an alpha component
                |    public boolean hasAlphaComponent() { return hasAlphaComponent; }
                |    /// True, if this format has an blue component
                |    public boolean hasBlueComponent() { return hasBlueComponent; }
                |    /// True, if this format has an depth component
                |    public boolean hasDepthComponent() { return hasDepthComponent; }
                |    /// True, if this format has an green component
                |    public boolean hasGreenComponent() { return hasGreenComponent; }
                |    /// True, if this format has an red component
                |    public boolean hasRedComponent() { return hasRedComponent; }
                |    /// True, if this format has an stencil component
                |    public boolean hasStencilComponent() { return hasStencilComponent; }
                |    /// True, if this format is a color
                |    public boolean isColor() { return hasRedComponent || hasGreenComponent || hasBlueComponent || hasAlphaComponent; }
                |    /// True, if this format is a compressed one.
                |    public boolean isCompressed() { return compressionScheme != null; }
                |    /// The number of bits into which the format is packed.
                |    /// A single image element in this format can be stored in the same space as a scalar type of this bit width.
                |    public int packed() { return packed; }
            """.trimMargin()
        )

        appendLine("    /// The single-plane format that this plane is compatible with.")
        appendLine("    public VkFormat planeCompatibleFormat(int plane) { return switch (this) {")
        formats.forEach {
            append("        case ${it.enumName.substringAfter("VK_FORMAT_")} -> ")
            if (it.planes == null || it.planes.isEmpty()) {
                appendLine("this;")
            } else {
                appendLine("switch (plane) {")
                it.planes.forEach { p ->
                    appendLine("            case ${p.index} -> ${p.compatible.substringAfter("VK_FORMAT_")};")
                }
                appendLine("            default -> throw new IllegalArgumentException(\"Unexpected plane \" + plane + \" for format \" + this);")
                appendLine("        };")
            }
        }
        appendLine("    }; }")

        appendLine(
            """
                |    /// The number of image planes of this format.
                |    public int planeCount() { return planeCount; }
                |    /// The relative height of this plane. A value of k means that this plane is 1/k the height of the overall format.
                |    public int planeHeightDivisor(int plane) { return planeHeightDivisor[plane]; }
                |    /// The relative width of this plane. A value of k means that this plane is 1/k the width of the overall format.
                |    public int planeWidthDivisor(int plane) { return planeWidthDivisor[plane]; }
                |    /// The number of texels in a texel block.
                |    public int texelsPerBlock() { return texelsPerBlock; }
            """.trimMargin()
        )

        appendLine("}")
    })
}
