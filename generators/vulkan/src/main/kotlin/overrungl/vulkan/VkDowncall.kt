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

import overrungl.gen.commentedFileHeader
import overrungl.gen.file.DefinitionFunction
import overrungl.gen.file.Interpreter
import overrungl.gen.file.functionDescriptor
import overrungl.gen.file.writeFunction
import overrungl.gen.nativeImageDowncallDescriptors
import overrungl.gen.writeString
import kotlin.io.path.Path
import kotlin.io.path.createParentDirectories

data class VkFunction(val function: DefinitionFunction, val handlesInstance: String)

class VkDowncall(
    private val packageName: String,
    private val className: String,
    private val description: String,
    action: VkDowncall.() -> Unit
) {
    val fields = mutableListOf<VkDowncallField>()
    private val handleFields = mutableListOf<VkDowncallField>()
    private val pfnFields = mutableListOf<VkDowncallField>()
    private val addedField = mutableSetOf<String>()
    private val methods = mutableListOf<VkFunction>()
    var customCode: String? = null

    init {
        action(this)
    }

    fun addReqTypes(interpreter: Interpreter, list: List<String>) {
        list.forEach { reqType ->
            vkEnumTypeMapping[reqType]?.forEach {
                val macro = interpreter.macros()[it]!!
                if (!addedField.contains(macro.name)) {
                    fields.add(VkDowncallField(macro.type, macro.name, macro.value))
                    addedField.add(macro.name)
                    vkEnumDefineClassMap.getOrPut(reqType) { mutableListOf() }
                        .add("$packageName.$className" to macro.name)
                }
            }
        }
    }

    fun addReqEnums(interpreter: Interpreter, list: List<String>) {
        list.forEach { reqEnum ->
            val macro = interpreter.macros()[reqEnum]!!
            if (!addedField.contains(macro.name)) {
                fields.add(VkDowncallField(macro.type, macro.name, macro.value))
                addedField.add(macro.name)
            }
        }
    }

    fun addReqCommand(
        interpreter: Interpreter,
        list: List<String>,
        commandAliasMap: Map<String, MutableList<String>>
    ) {
        list.forEach { reqCommand ->
            val functions = interpreter.functions()
            val cmd = functions[reqCommand]
                ?: functions[(commandAliasMap[reqCommand] ?: error(reqCommand)).find(functions::containsKey)]
                ?: error(reqCommand)
            val descriptor = functionDescriptor(cmd)
            nativeImageDowncallDescriptors.add(descriptor)
            handleFields.add(
                VkDowncallField(
                    "Supplier<MethodHandle>",
                    "MH_${reqCommand}",
                    "StableValue.supplier(() -> downcallHandle($descriptor))"
                )
            )
            pfnFields.add(
                VkDowncallField(
                    "MemorySegment",
                    "PFN_${reqCommand}",
                    null,
                    modifier = "public final"
                )
            )

            val first = cmd.parameters[0]
            val function = cmd.copy(
                name = reqCommand, entrypoint = reqCommand, parameters =
                    if (first.type is VkDispatchableHandleIntermediate) cmd.parameters.toMutableList()
                        .also {
                            it[0] = first.copy(
                                type = VkDispatchableHandle(
                                    name = (first.type as VkDispatchableHandleIntermediate).name,
                                    originalName = first.type.originalName
                                )
                            )
                        }
                    else cmd.parameters,
                symbolNotFoundError = "VKSymbolNotFoundError"
            )
            methods.add(
                VkFunction(
                    function,
                    handlesInstance =
                        if (first.type is VkDispatchableHandleIntermediate) "${first.name}.capabilities()"
                        else "VK.globalCommands()"
                )
            )
            if (first.type is VkDispatchableHandleIntermediate) {
                when (val it = (first.type as VkDispatchableHandleIntermediate).name) {
                    "VkInstance", "VkPhysicalDevice" -> instanceCommands.add(function.name)
                    "VkDevice", "VkQueue", "VkCommandBuffer", "VkExternalComputeQueueNV" -> deviceCommands.add(function.name)
                    else -> error(it)
                }
            }
        }
    }

    fun write() {
        val sb = StringBuilder()
        sb.appendLine(commentedFileHeader)
        sb.appendLine("package $packageName;")
        if (handleFields.isNotEmpty()) {
            sb.appendLine(
                """
                    import java.lang.foreign.*;
                    import java.lang.invoke.*;
                    import java.util.function.*;
                    import org.jspecify.annotations.*;
                    import overrungl.util.*;
                """.trimIndent()
            )
        }
        if (packageName != vulkanPackage) sb.appendLine("import overrungl.vulkan.*;")
        sb.appendLine("import static overrungl.internal.RuntimeHelper.*;")
        sb.appendLine("/// $description")
        sb.appendLine("public final class $className {")

        fun writeFields(list: List<VkDowncallField>, indent: Int) {
            list.forEach {
                sb.append(" ".repeat(indent))
                sb.append("${it.modifier} ${it.type} ${it.name}")
                if (it.value != null) {
                    sb.append(" = ")
                    sb.append(it.value)
                }
                sb.appendLine(";")
            }
        }
        writeFields(fields, 4)
        if (handleFields.isNotEmpty()) {
            sb.appendLine("    public static final class Handles {")
            writeFields(handleFields, 8)
            sb.appendLine("        private Handles() {}")
            sb.appendLine("    }")
        }
        sb.appendLine()

        sb.appendLine(
            """
                |    private $className() {}
            """.trimMargin()
        )
        sb.appendLine()

        methods.forEach { m ->
            writeFunction(sb, m.function, handlesInstance = m.handlesInstance)
        }

        if (customCode != null) {
            sb.appendLine("    // --- OverrunGL custom code ---")
            sb.appendLine(customCode!!.prependIndent("    "))
        }

        sb.appendLine("}")

        writeString(
            Path(
                "src/main/generated",
                packageName.replace('.', '/'),
                "$className.java"
            ).createParentDirectories(), sb.toString()
        )
    }
}

data class VkDowncallField(
    val type: String,
    val name: String,
    val value: String?,
    val modifier: String? = "public static final"
)
