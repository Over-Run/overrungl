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

package overrungl.gen

import kotlin.io.path.Path

private const val className = "ForeignRegistrationFeature"
val nativeImageDowncallDescriptors = mutableListOf<String>()
val nativeImageUpcallDescriptors = mutableListOf<String>()
//TODO add a document to instruct users to register their *static* upcall method

fun writeNativeImageRegistration(
    packageName: String,
    downcall: List<String> = nativeImageDowncallDescriptors,
    upcall: List<String> = nativeImageUpcallDescriptors
) {
    val basePath = Path(packageName.replace('.', '/'), "$className.java")
    val path = Path("src/main/generated/").resolve(basePath)
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
}
