/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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

import com.palantir.javapoet.*
import overrungl.gen.*
import java.lang.foreign.SegmentAllocator
import javax.lang.model.element.Modifier

val nfdfiltersize_t by int
val nfdversion_t by size_t
val nfdresult_t by int
val const_nfdpathset_t_ptr_ptr = address c "const nfdpathset_t**"

class CharVariant(
    val uppercaseName: String,
    val lowercaseName: String,
    val const_nfdchar_t_ptr: CustomTypeSpec,
    val const_nfdfilteritem_t_ptr: CustomTypeSpec,
    val nfdchar_t_ptr: CustomTypeSpec,
    val nfdchar_t_ptr_ptr: CustomTypeSpec,
    val const_nfdopendialogargs_t_ptr: CustomTypeSpec,
    val const_nfdsavedialogargs_t_ptr: CustomTypeSpec,
    val const_nfdpickfolderargs_t_ptr: CustomTypeSpec,
)

val Nchar = CharVariant(
    "N", "n",
    const_nfdchar_t_ptr = string c "const nfdnchar_t*",
    const_nfdfilteritem_t_ptr = address c "const nfdnfilteritem_t*",
    nfdchar_t_ptr = address c "nfdnchar_t*",
    nfdchar_t_ptr_ptr = address c "nfdnchar_t**",
    const_nfdopendialogargs_t_ptr = address c "const nfdopendialognargs_t*",
    const_nfdsavedialogargs_t_ptr = address c "const nfdsavedialognargs_t*",
    const_nfdpickfolderargs_t_ptr = address c "const nfdpickfoldernargs_t*"
)
val U8char = CharVariant(
    "U8", "u8",
    const_nfdchar_t_ptr = string c "const nfdu8char_t*",
    const_nfdfilteritem_t_ptr = address c "const nfdu8filteritem_t*",
    nfdchar_t_ptr = address c "nfdu8char_t*",
    nfdchar_t_ptr_ptr = address c "nfdu8char_t**",
    const_nfdopendialogargs_t_ptr = address c "const nfdopendialogu8args_t*",
    const_nfdsavedialogargs_t_ptr = address c "const nfdsavedialogu8args_t*",
    const_nfdpickfolderargs_t_ptr = address c "const nfdpickfolderu8args_t*"
)

/**
 * @author squid233
 * @since 0.1.0
 */
fun main() {
    val NFDInternal = ClassName.get("overrungl.nfd", "NFDInternal")

    fun NFDFilterItem(variant: CharVariant, utf: String, charset: CodeBlock) {
        struct(
            "overrungl.nfd",
            "NFD${variant.uppercaseName}FilterItem",
            "nfd${variant.lowercaseName}filteritem_t",
            javadoc = {
                doFirst { add("$utf Filter Item") }
            }) {
            variant.const_nfdchar_t_ptr("name")
            variant.const_nfdchar_t_ptr("spec")
            doLast {
                addMethod(
                    MethodSpec.methodBuilder("create")
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .returns(selfClassName)
                        .addParameter(SegmentAllocator::class.java, "allocator")
                        .addParameter(String::class.java, "name")
                        .addParameter(String::class.java, "spec")
                        .addStatement(
                            "return $1T.OF.of($2N).name($5T.marshal($2N, $3N$6L)).spec($5T.marshal($2N, $4N$6L))",
                            selfClassName,
                            "allocator",
                            "name",
                            "spec",
                            Marshal,
                            charset
                        )
                        .build()
                )
                addMethod(
                    MethodSpec.methodBuilder("create")
                        .addAnnotation(SafeVarargs::class.java)
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .returns(selfClassName)
                        .addParameter(SegmentAllocator::class.java, "allocator")
                        .addParameter(
                            ArrayTypeName.of(
                                ParameterizedTypeName.get(
                                    Map.Entry::class.java,
                                    String::class.java,
                                    String::class.java
                                )
                            ), "entries"
                        )
                        .varargs()
                        .addStatement("var of = $1T.OF.of(allocator, entries.length)", selfClassName)
                        .beginControlFlow("for (int i = 0; i < entries.length; i++)")
                        .addStatement("var e = entries[i]")
                        .addStatement(
                            "of.slice(i).name($1T.marshal($2N, $3N.getKey()$4L)).spec($1T.marshal($2N, $3N.getValue()$4L))",
                            Marshal,
                            "allocator",
                            "e",
                            charset
                        )
                        .endControlFlow()
                        .addStatement("return of")
                        .build()
                )
            }
        }
    }
    NFDFilterItem(U8char, "UTF-8", CodeBlock.of(""))
    NFDFilterItem(Nchar, "UTF-16", CodeBlock.of(", $1T.nfdCharset", NFDInternal))

    val nfdwindowhandle_t = struct("overrungl.nfd", "NFDWindowHandle", "nfdwindowhandle_t", javadoc = {
        doFirst {
            add(
                """
                    The native window handle. <p>If using a platform abstraction framework (e.g. SDL2), this should be
                    obtained using the corresponding NFD glue header (e.g. nfd_sdl2.h).
                """.trimIndent()
            )
        }
    }) {
        size_t("type")
        void_ptr("handle")
    }

    fun NFDOpenDialogArgs(variant: CharVariant) {
        struct(
            "overrungl.nfd",
            "NFDOpenDialog${variant.uppercaseName}Args",
            "nfdopendialog${variant.lowercaseName}args_t"
        ) {
            variant.const_nfdfilteritem_t_ptr("filterList")
            nfdfiltersize_t("filterCount")
            variant.const_nfdchar_t_ptr("defaultPath")
            byValueStruct(nfdwindowhandle_t.structSpec, "parentWindow")
        }
    }
    NFDOpenDialogArgs(U8char)
    NFDOpenDialogArgs(Nchar)

    fun NFDSaveDialogArgs(variant: CharVariant) {
        struct(
            "overrungl.nfd",
            "NFDSaveDialog${variant.uppercaseName}Args",
            "nfdsavedialog${variant.lowercaseName}args_t"
        ) {
            variant.const_nfdfilteritem_t_ptr("filterList")
            nfdfiltersize_t("filterCount")
            variant.const_nfdchar_t_ptr("defaultPath")
            variant.const_nfdchar_t_ptr("defaultName")
            byValueStruct(nfdwindowhandle_t.structSpec, "parentWindow")
        }
    }
    NFDSaveDialogArgs(U8char)
    NFDSaveDialogArgs(Nchar)

    fun NFDPickFolderArgs(variant: CharVariant) {
        struct(
            "overrungl.nfd",
            "NFDPickFolder${variant.uppercaseName}Args",
            "nfdpickfolder${variant.lowercaseName}args_t"
        ) {
            variant.const_nfdchar_t_ptr("defaultPath")
            byValueStruct(nfdwindowhandle_t.structSpec, "parentWindow")
        }
    }
    NFDPickFolderArgs(U8char)
    NFDPickFolderArgs(Nchar)
    StructRegistration.generate("overrungl.nfd", "NFDStructTypes")

    downcall("overrungl.nfd", "CNFD", javadoc = {
        doFirst { add("Base functions of {@link \$T}.", ClassName.get("overrungl.nfd", "NFD")) }
    }) {
        extends(DirectAccess)
        jint("ERROR" to "0") { addJavadoc("Programmatic error") }
        jint("OKAY" to "1") { addJavadoc("User pressed okay, or successful return") }
        jint("CANCEL" to "2") { addJavadoc("User pressed cancel") }
        jint("WINDOW_HANDLE_TYPE_UNSET" to "0") { addJavadoc("The native window handle type.") }
        jint("WINDOW_HANDLE_TYPE_WINDOWS" to "1") { addJavadoc("Windows: handle is HWND (the Windows API typedefs this to void*)") }
        jint("WINDOW_HANDLE_TYPE_COCOA" to "2") { addJavadoc("Cocoa: handle is NSWindow*") }
        jint("WINDOW_HANDLE_TYPE_X11" to "3") { addJavadoc("X11: handle is Window") }
        jint("INTERFACE_VERSION" to "1") {
            addJavadoc(
                """
                    This is a unique identifier tagged to all the NFD_*With() function calls, for backward
                    compatibility purposes. <p>There is usually no need to use this directly, unless you want to use
                    NFD differently depending on the version you're building with.
                """.trimIndent()
            )
        }

        fun freePath(variant: CharVariant) {
            "freePath${variant.uppercaseName}"(
                void,
                variant.nfdchar_t_ptr("filePath"),
                entrypoint = "NFD_FreePath${variant.uppercaseName}",
                javadoc = {
                    add(
                        """
                        Free a file path that was returned by the dialogs.
                        <p>
                        Note: use {@link #pathSetFreePath${variant.uppercaseName}} to free path from pathset instead of this function.
                    """.trimIndent()
                    )
                })
        }
        freePath(Nchar)
        freePath(U8char)

        "init"(nfdresult_t, entrypoint = "NFD_Init", javadoc = {
            add(
                """
                    Initialize NFD. Call this for every thread that might use NFD, before calling any other NFD
                    functions on that thread.
                """.trimIndent()
            )
        })
        "quit"(void, entrypoint = "NFD_Quit", javadoc = {
            add(
                """
                    Call this to de-initialize NFD, if {@link #init()} returned NFD_OKAY.
                """.trimIndent()
            )
        })

        fun openDialog(variant: CharVariant) {
            "openDialog${variant.uppercaseName}"(
                nfdresult_t,
                variant.nfdchar_t_ptr_ptr("outPath"),
                variant.const_nfdfilteritem_t_ptr("filterList"),
                nfdfiltersize_t("filterCount") {
                    javadoc = CodeBlock.of("If zero, filterList is ignored (you can use null).")
                },
                variant.const_nfdchar_t_ptr("defaultPath") {
                    javadoc = CodeBlock.of("If null, the operating system will decide.")
                },
                entrypoint = "NFD_OpenDialog${variant.uppercaseName}",
                javadoc = {
                    add(
                        """
                            Single file open dialog
                            <p>
                            It's the caller's responsibility to free {@code outPath} via {@link #freePath${variant.uppercaseName}} if this function returns
                            NFD_OKAY.
                        """.trimIndent()
                    )
                }
            )
        }
        openDialog(Nchar)
        openDialog(U8char)

        fun openDialogWith(variant: CharVariant) {
            val openDialogWithImpl = "openDialog${variant.uppercaseName}WithImpl"(
                nfdresult_t,
                nfdversion_t("version"),
                variant.nfdchar_t_ptr_ptr("outPath"),
                variant.const_nfdopendialogargs_t_ptr("args"),
                entrypoint = "NFD_OpenDialog${variant.uppercaseName}_With_Impl",
                javadoc = { add("This function is a library implementation detail.  Please use {@link #openDialog${variant.uppercaseName}With} instead.") }
            )
            "openDialog${variant.uppercaseName}With"(
                nfdresult_t,
                variant.nfdchar_t_ptr_ptr("outPath"),
                variant.const_nfdopendialogargs_t_ptr("args"),
                entrypoint = "NFD_OpenDialog${variant.uppercaseName}_With",
                javadoc = {
                    add(
                        """
                            Single file open dialog, with additional parameters.
                            <p>
                            It is the caller's responsibility to free {@code outPath} via {@link #freePath${variant.uppercaseName}} if this function
                            returns NFD_OKAY.  See documentation of {@link NFDOpenDialog${variant.uppercaseName}Args} for details.
                        """.trimIndent()
                    )
                },
                default = true,
            ) {
                addAnnotation(Skip)
                addStatement("return $1N(INTERFACE_VERSION, outPath, args)", openDialogWithImpl)
            }
        }
        openDialogWith(Nchar)
        openDialogWith(U8char)

        fun openDialogMultiple(variant: CharVariant) {
            "openDialogMultiple${variant.uppercaseName}"(
                nfdresult_t,
                const_nfdpathset_t_ptr_ptr("outPaths"),
                variant.const_nfdfilteritem_t_ptr("filterList"),
                nfdfiltersize_t("filterCount") {
                    javadoc = CodeBlock.of("If zero, filterList is ignored (you can use null).")
                },
                variant.const_nfdchar_t_ptr("defaultPath") {
                    javadoc = CodeBlock.of("If null, the operating system will decide.")
                },
                entrypoint = "NFD_OpenDialogMultiple${variant.uppercaseName}",
                javadoc = {
                    add(
                        """
                        Multiple file open dialog
                        <p>
                        It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFree${variant.uppercaseName}} if this function
                        returns NFD_OKAY.
                    """.trimIndent()
                    )
                }
            )
        }
        openDialogMultiple(Nchar)
        openDialogMultiple(U8char)

        fun openDialogMultipleWith(variant: CharVariant) {
            val openDialogMultipleWithImpl = "openDialogMultiple${variant.uppercaseName}WithImpl"(
                nfdresult_t,
                nfdversion_t("version"),
                const_nfdpathset_t_ptr_ptr("outPaths"),
                variant.const_nfdopendialogargs_t_ptr("args"),
                entrypoint = "NFD_OpenDialogMultiple${variant.uppercaseName}_With_Impl",
                javadoc = {
                    add(
                        """
                            This function is a library implementation detail.  Please use {@link #openDialogMultiple${variant.uppercaseName}With}
                            instead.
                        """.trimIndent()
                    )
                }
            )
            "openDialogMultiple${variant.uppercaseName}With"(
                nfdresult_t,
                const_nfdpathset_t_ptr_ptr("outPaths"),
                variant.const_nfdopendialogargs_t_ptr("args"),
                entrypoint = "NFD_OpenDialogMultiple${variant.uppercaseName}_With",
                javadoc = {
                    add(
                        """
                            Multiple file open dialog, with additional parameters.
                            <p>
                            It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFree${variant.uppercaseName}} if this function
                            returns NFD_OKAY.  See documentation of {@link NFDOpenDialog${variant.uppercaseName}Args} for details.
                        """.trimIndent()
                    )
                },
                default = true
            ) {
                addAnnotation(Skip)
                addStatement("return $1N(INTERFACE_VERSION, outPaths, args)", openDialogMultipleWithImpl)
            }
        }
        openDialogMultipleWith(Nchar)
        openDialogMultipleWith(U8char)


        fun saveDialog(variant: CharVariant) {
            "saveDialog${variant.uppercaseName}"(
                nfdresult_t,
                variant.nfdchar_t_ptr_ptr("outPath"),
                variant.const_nfdfilteritem_t_ptr("filterList"),
                nfdfiltersize_t("filterCount") {
                    javadoc = CodeBlock.of("If zero, filterList is ignored (you can use null).")
                },
                variant.const_nfdchar_t_ptr("defaultPath") {
                    javadoc = CodeBlock.of("If null, the operating system will decide.")
                },
                variant.const_nfdchar_t_ptr("defaultName"),
                entrypoint = "NFD_SaveDialog${variant.uppercaseName}",
                javadoc = {
                    add(
                        """
                            Save dialog
                            <p>
                            It is the caller's responsibility to free {@code outPath} via {@link #freePath${variant.uppercaseName}} if this function returns
                            NFD_OKAY.
                        """.trimIndent()
                    )
                }
            )
        }
        saveDialog(Nchar)
        saveDialog(U8char)

        fun saveDialogWith(variant: CharVariant) {
            val saveDialogWithImpl = "saveDialog${variant.uppercaseName}WithImpl"(
                nfdresult_t,
                nfdversion_t("version"),
                variant.nfdchar_t_ptr_ptr("outPath"),
                variant.const_nfdsavedialogargs_t_ptr("args"),
                entrypoint = "NFD_SaveDialog${variant.uppercaseName}_With_Impl",
                javadoc = { add("This function is a library implementation detail.  Please use {@link #saveDialog${variant.uppercaseName}With} instead.") }
            )
            "saveDialog${variant.uppercaseName}With"(
                nfdresult_t,
                variant.nfdchar_t_ptr_ptr("outPath"),
                variant.const_nfdsavedialogargs_t_ptr("args"),
                entrypoint = "NFD_SaveDialog${variant.uppercaseName}_With",
                javadoc = {
                    add(
                        """
                            Single file save dialog, with additional parameters.
                            <p>
                            It is the caller's responsibility to free {@code outPath} via {@link #freePath${variant.uppercaseName}} if this function
                            returns NFD_OKAY.  See documentation of {@link NFDSaveDialog${variant.uppercaseName}Args} for details.
                        """.trimIndent()
                    )
                },
                default = true
            ) {
                addAnnotation(Skip)
                addStatement("return $1N(INTERFACE_VERSION, outPath, args)", saveDialogWithImpl)
            }
        }
        saveDialogWith(Nchar)
        saveDialogWith(U8char)


        fun pickFolder(variant: CharVariant) {
            "pickFolder${variant.uppercaseName}"(
                nfdresult_t,
                variant.nfdchar_t_ptr_ptr("outPath"),
                variant.const_nfdchar_t_ptr("defaultPath") {
                    javadoc = CodeBlock.of("If null, the operating system will decide.")
                },
                entrypoint = "NFD_PickFolder${variant.uppercaseName}",
                javadoc = {
                    add(
                        """
                            Select single folder dialog
                            <p>
                            It's the caller's responsibility to free {@code outPath} via {@link #freePath${variant.uppercaseName}} if this function returns
                            NFD_OKAY.
                        """.trimIndent()
                    )
                }
            )
        }
        pickFolder(Nchar)
        pickFolder(U8char)

        fun pickFolderWith(variant: CharVariant) {
            val pickFolderWithImpl = "pickFolder${variant.uppercaseName}WithImpl"(
                nfdresult_t,
                nfdversion_t("version"),
                variant.nfdchar_t_ptr_ptr("outPath"),
                variant.const_nfdpickfolderargs_t_ptr("args"),
                entrypoint = "NFD_PickFolder${variant.uppercaseName}_With_Impl",
                javadoc = { add("This function is a library implementation detail.  Please use {@link #pickFolder${variant.uppercaseName}With} instead.") }
            )
            "pickFolder${variant.uppercaseName}With"(
                nfdresult_t,
                variant.nfdchar_t_ptr_ptr("outPath"),
                variant.const_nfdpickfolderargs_t_ptr("args"),
                entrypoint = "NFD_PickFolder${variant.uppercaseName}_With",
                javadoc = {
                    add(
                        """
                            Single file open dialog, with additional parameters.
                            <p>
                            It is the caller's responsibility to free {@code outPath} via {@link #freePath${variant.uppercaseName}} if this function
                            returns NFD_OKAY.  See documentation of {@link NFDPickFolder${variant.uppercaseName}Args} for details.
                        """.trimIndent()
                    )
                },
                default = true,
            ) {
                addAnnotation(Skip)
                addStatement("return $1N(INTERFACE_VERSION, outPath, args)", pickFolderWithImpl)
            }
        }
        pickFolderWith(Nchar)
        pickFolderWith(U8char)

        fun pickFolderMultiple(variant: CharVariant) {
            "pickFolderMultiple${variant.uppercaseName}"(
                nfdresult_t,
                const_nfdpathset_t_ptr_ptr("outPaths"),
                variant.const_nfdchar_t_ptr("defaultPath") {
                    javadoc = CodeBlock.of("If null, the operating system will decide.")
                },
                entrypoint = "NFD_PickFolderMultiple${variant.uppercaseName}",
                javadoc = {
                    add(
                        """
                        Select multiple folder dialog
                        <p>
                        It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFree${variant.uppercaseName}} if this function
                        returns NFD_OKAY.
                    """.trimIndent()
                    )
                }
            )
        }
        pickFolderMultiple(Nchar)
        pickFolderMultiple(U8char)

        fun pickFolderMultipleWith(variant: CharVariant) {
            val pickFolderMultipleWithImpl = "pickFolderMultiple${variant.uppercaseName}WithImpl"(
                nfdresult_t,
                nfdversion_t("version"),
                const_nfdpathset_t_ptr_ptr("outPaths"),
                variant.const_nfdpickfolderargs_t_ptr("args"),
                entrypoint = "NFD_PickFolderMultiple${variant.uppercaseName}_With_Impl",
                javadoc = {
                    add(
                        """
                            This function is a library implementation detail.  Please use {@link #pickFolderMultiple${variant.uppercaseName}With}
                            instead.
                        """.trimIndent()
                    )
                }
            )
            "pickFolderMultiple${variant.uppercaseName}With"(
                nfdresult_t,
                const_nfdpathset_t_ptr_ptr("outPaths"),
                variant.const_nfdpickfolderargs_t_ptr("args"),
                entrypoint = "NFD_PickFolderMultiple${variant.uppercaseName}_With",
                javadoc = {
                    add(
                        """
                            Multiple file open dialog, with additional parameters.
                            <p>
                            It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFree${variant.uppercaseName}} if this function
                            returns NFD_OKAY.  See documentation of {@link NFDPickFolder${variant.uppercaseName}Args} for details.
                        """.trimIndent()
                    )
                },
                default = true
            ) {
                addAnnotation(Skip)
                addStatement("return $1N(INTERFACE_VERSION, outPaths, args)", pickFolderMultipleWithImpl)
            }
        }
        pickFolderMultipleWith(Nchar)
        pickFolderMultipleWith(U8char)

        val getError_ = "getError_"(
            const_char_ptr,
            entrypoint = "NFD_GetError",
            javadoc = {
                add(
                    """
                        Get the last error
                        <p>
                        This is set when a function returns NFD_ERROR.
                        The memory is owned by NFD and should not be freed by user code.
                        This is <strong>always</strong> ASCII printable characters, so it can be interpreted as UTF-8 without any
                        conversion.
                        @return The last error that was set, or null if there is no error.
                    """.trimIndent()
                )
            }
        )
        typeSpecBuilder.addMethod(getError_.toBuilder().setName("getError").returns(String::class.java).build())

        "clearError"(void, entrypoint = "NFD_ClearError", javadoc = { add("Clear the error.") })
    }
}
