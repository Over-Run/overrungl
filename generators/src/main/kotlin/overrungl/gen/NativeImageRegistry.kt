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

package overrungl.gen

import overrungl.gen.file.compiledUpcallTypes
import kotlin.io.path.Path
import kotlin.io.path.createDirectories
import kotlin.io.path.createParentDirectories

private const val className = "ForeignRegistrationFeature"
val nativeImageDowncallDescriptors = mutableListOf<String>()
val nativeImageUpcallDescriptors = mutableListOf<String>()

fun writeNativeImageRegistration(
    packageName: String,
    downcall: List<String> = nativeImageDowncallDescriptors,
    upcall: List<String> = nativeImageUpcallDescriptors,
    libBasename: String?
) {
    val basePath = Path(packageName.replace('.', '/'), "$className.java")
    val path = Path("src/main/generated/").resolve(basePath)
    path.createParentDirectories()
    writeString(path, buildString {
        appendLine(commentedFileHeader)
        appendLine(
            """
                package $packageName;
                import java.lang.foreign.*;
                import overrungl.util.*;
                import org.graalvm.nativeimage.hosted.Feature;
                import static org.graalvm.nativeimage.hosted.RuntimeForeignAccess.*;
            """.trimIndent()
        )
        appendLine("class $className implements Feature {")
        appendLine("    @Override public void duringSetup(DuringSetupAccess access) {")
        downcall.toSortedSet().forEach {
            appendLine("        registerForDowncall($it);")
        }
        upcall.forEach {
            appendLine("        registerForUpcall($it);")
        }
        appendLine("    }")
        appendLine("}")
    })
    val nativeImgRoot =
        Path("src/main/resources/META-INF/native-image/io.github.over-run", packageName.replace('.', '-'))
    nativeImgRoot.createDirectories()
    writeString(
        nativeImgRoot.resolve("native-image.properties"),
        buildString {
            appendLine(GENERATOR_NOTICE_SHARP)
            appendLine("Args=--features=$packageName.$className")
        }
    )
    if (libBasename != null || compiledUpcallTypes.isNotEmpty()) {
        writeString(
            nativeImgRoot.resolve("reachability-metadata.json"),
            buildString {
                appendLine("{")
                if (libBasename != null) {
                    append("""  "resources": [{ "glob": "$packageName/**/*$libBasename.*" }]""")
                    if (compiledUpcallTypes.isNotEmpty()) {
                        append(",")
                    }
                    appendLine()
                }
                if (compiledUpcallTypes.isNotEmpty()) {
                    appendLine("""  "reflection": [""")
                    appendLine(compiledUpcallTypes.joinToString(separator = ",\n") {
                        """    { "type": "$it", "allPublicMethods": true }"""
                    })
                    appendLine("  ]")
                }
                appendLine("}")
            }
        )
    }
}
