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
import java.nio.file.Files
import javax.lang.model.element.Modifier
import kotlin.io.path.Path

val nfdfiltersize_t by int
val nfdversion_t by size_t
val nfdresult_t by int
val const_nfdpathset_t_ptr_ptr = address c "const nfdpathset_t**"
val const_nfdpathset_t_ptr = address c "const nfdpathset_t*"
val nfdpathsetsize_t_ptr = address c "nfdpathsetsize_t*"
val nfdpathsetsize_t = jlong c "nfdpathsetsize_t"
val nfdpathsetenum_t_ptr = address c "nfdpathsetenum_t*"

data class CharVariant(
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

    //region Structs
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
    //endregion

    downcall("overrungl.nfd", "CNFD", javadoc = {
        doFirst { add("Base functions of {@link \$T}.", ClassName.get("overrungl.nfd", "NFD")) }
    }) {
        extends(DirectAccess)
        jint("NFD_ERROR" to "0") { addJavadoc("Programmatic error") }
        jint("NFD_OKAY" to "1") { addJavadoc("User pressed okay, or successful return") }
        jint("NFD_CANCEL" to "2") { addJavadoc("User pressed cancel") }
        jint("NFD_WINDOW_HANDLE_TYPE_UNSET" to "0") { addJavadoc("The native window handle type.") }
        jint("NFD_WINDOW_HANDLE_TYPE_WINDOWS" to "1") { addJavadoc("Windows: handle is HWND (the Windows API typedefs this to void*)") }
        jint("NFD_WINDOW_HANDLE_TYPE_COCOA" to "2") { addJavadoc("Cocoa: handle is NSWindow*") }
        jint("NFD_WINDOW_HANDLE_TYPE_X11" to "3") { addJavadoc("X11: handle is Window") }
        jint("NFD_INTERFACE_VERSION" to "1") {
            addJavadoc(
                """
                    This is a unique identifier tagged to all the NFD_*With() function calls, for backward
                    compatibility purposes. <p>There is usually no need to use this directly, unless you want to use
                    NFD differently depending on the version you're building with.
                """.trimIndent()
            )
        }

        //region methods
        fun provideOverload(variant: CharVariant, spec: MethodSpec, name: String) {
            if (variant == Nchar) {
                typeSpecBuilder.addMethod(
                    MethodSpec.methodBuilder(name)
                        .addJavadoc(
                            "Overloads {@link #$1N($2L)}",
                            spec,
                            spec.parameters().joinToString(separator = ", ") { s -> s.type().toString() })
                        .addAnnotations(spec.annotations())
                        .addAnnotation(Skip)
                        .addModifiers(Modifier.PUBLIC, Modifier.DEFAULT)
                        .returns(spec.returnType())
                        .addParameters(spec.parameters())
                        .addStatement(
                            "$1Lthis.$2N($3L)",
                            if (spec.returnType() == TypeName.VOID) "" else "return ",
                            spec,
                            spec.parameters().joinToString(separator = ", ") { s -> s.name() })
                        .build()
                )
            }
        }

        fun freePath(variant: CharVariant) {
            val spec = "NFD_FreePath${variant.uppercaseName}"(
                void,
                variant.nfdchar_t_ptr("filePath"),
                entrypoint = "NFD_FreePath${variant.uppercaseName}",
                javadoc = {
                    add(
                        """
                        Free a file path that was returned by the dialogs.
                        <p>
                        Note: use {@link #NFD_PathSet_FreePath${variant.uppercaseName}} to free path from pathset instead of this function.
                    """.trimIndent()
                    )
                })
            provideOverload(variant, spec, "NFD_FreePath")
        }
        freePath(Nchar)
        freePath(U8char)

        "NFD_Init"(nfdresult_t, entrypoint = "NFD_Init", javadoc = {
            add(
                """
                    Initialize NFD. Call this for every thread that might use NFD, before calling any other NFD
                    functions on that thread.
                """.trimIndent()
            )
        })
        "NFD_Quit"(void, entrypoint = "NFD_Quit", javadoc = {
            add(
                """
                    Call this to de-initialize NFD, if {@link #NFD_Init()} returned NFD_OKAY.
                """.trimIndent()
            )
        })

        fun openDialog(variant: CharVariant) {
            val spec = "NFD_OpenDialog${variant.uppercaseName}"(
                nfdresult_t,
                variant.nfdchar_t_ptr_ptr("outPath"),
                variant.const_nfdfilteritem_t_ptr("filterList"),
                nfdfiltersize_t("filterCount") {
                    javadoc = CodeBlock.of("If zero, filterList is ignored (you can use null).\n")
                },
                variant.const_nfdchar_t_ptr("defaultPath") {
                    javadoc = CodeBlock.of("If null, the operating system will decide.\n")
                },
                entrypoint = "NFD_OpenDialog${variant.uppercaseName}",
                javadoc = {
                    add(
                        """
                            Single file open dialog
                            <p>
                            It's the caller's responsibility to free {@code outPath} via {@link #NFD_FreePath${variant.uppercaseName}} if this function returns
                            NFD_OKAY.
                        """.trimIndent()
                    )
                }
            )
            provideOverload(variant, spec, "NFD_OpenDialog")
        }
        openDialog(Nchar)
        openDialog(U8char)

        fun openDialogWith(variant: CharVariant) {
            val openDialogWithImpl = "NFD_OpenDialog${variant.uppercaseName}_With_Impl"(
                nfdresult_t,
                nfdversion_t("version"),
                variant.nfdchar_t_ptr_ptr("outPath"),
                variant.const_nfdopendialogargs_t_ptr("args"),
                entrypoint = "NFD_OpenDialog${variant.uppercaseName}_With_Impl",
                javadoc = { add("This function is a library implementation detail.  Please use {@link #NFD_OpenDialog${variant.uppercaseName}_With} instead.") }
            )
            "NFD_OpenDialog${variant.uppercaseName}_With"(
                nfdresult_t,
                variant.nfdchar_t_ptr_ptr("outPath"),
                variant.const_nfdopendialogargs_t_ptr("args"),
                entrypoint = "NFD_OpenDialog${variant.uppercaseName}_With",
                javadoc = {
                    add(
                        """
                            Single file open dialog, with additional parameters.
                            <p>
                            It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePath${variant.uppercaseName}} if this function
                            returns NFD_OKAY.  See documentation of {@link NFDOpenDialog${variant.uppercaseName}Args} for details.
                        """.trimIndent()
                    )
                },
                default = true,
            ) {
                addAnnotation(Skip)
                addStatement("return $1N(NFD_INTERFACE_VERSION, outPath, args)", openDialogWithImpl)
            }
        }
        openDialogWith(Nchar)
        openDialogWith(U8char)

        fun openDialogMultiple(variant: CharVariant) {
            val spec = "NFD_OpenDialogMultiple${variant.uppercaseName}"(
                nfdresult_t,
                const_nfdpathset_t_ptr_ptr("outPaths"),
                variant.const_nfdfilteritem_t_ptr("filterList"),
                nfdfiltersize_t("filterCount") {
                    javadoc = CodeBlock.of("If zero, filterList is ignored (you can use null).\n")
                },
                variant.const_nfdchar_t_ptr("defaultPath") {
                    javadoc = CodeBlock.of("If null, the operating system will decide.\n")
                },
                entrypoint = "NFD_OpenDialogMultiple${variant.uppercaseName}",
                javadoc = {
                    add(
                        """
                        Multiple file open dialog
                        <p>
                        It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
                        returns NFD_OKAY.
                    """.trimIndent()
                    )
                }
            )
            provideOverload(variant, spec, "NFD_OpenDialogMultiple")
        }
        openDialogMultiple(Nchar)
        openDialogMultiple(U8char)

        fun openDialogMultipleWith(variant: CharVariant) {
            val openDialogMultipleWithImpl = "NFD_OpenDialogMultiple${variant.uppercaseName}_With_Impl"(
                nfdresult_t,
                nfdversion_t("version"),
                const_nfdpathset_t_ptr_ptr("outPaths"),
                variant.const_nfdopendialogargs_t_ptr("args"),
                entrypoint = "NFD_OpenDialogMultiple${variant.uppercaseName}_With_Impl",
                javadoc = {
                    add(
                        """
                            This function is a library implementation detail.  Please use {@link #NFD_OpenDialogMultiple${variant.uppercaseName}_With}
                            instead.
                        """.trimIndent()
                    )
                }
            )
            "NFD_OpenDialogMultiple${variant.uppercaseName}_With"(
                nfdresult_t,
                const_nfdpathset_t_ptr_ptr("outPaths"),
                variant.const_nfdopendialogargs_t_ptr("args"),
                entrypoint = "NFD_OpenDialogMultiple${variant.uppercaseName}_With",
                javadoc = {
                    add(
                        """
                            Multiple file open dialog, with additional parameters.
                            <p>
                            It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
                            returns NFD_OKAY.  See documentation of {@link NFDOpenDialog${variant.uppercaseName}Args} for details.
                        """.trimIndent()
                    )
                },
                default = true
            ) {
                addAnnotation(Skip)
                addStatement("return $1N(NFD_INTERFACE_VERSION, outPaths, args)", openDialogMultipleWithImpl)
            }
        }
        openDialogMultipleWith(Nchar)
        openDialogMultipleWith(U8char)


        fun saveDialog(variant: CharVariant) {
            val spec = "NFD_SaveDialog${variant.uppercaseName}"(
                nfdresult_t,
                variant.nfdchar_t_ptr_ptr("outPath"),
                variant.const_nfdfilteritem_t_ptr("filterList"),
                nfdfiltersize_t("filterCount") {
                    javadoc = CodeBlock.of("If zero, filterList is ignored (you can use null).\n")
                },
                variant.const_nfdchar_t_ptr("defaultPath") {
                    javadoc = CodeBlock.of("If null, the operating system will decide.\n")
                },
                variant.const_nfdchar_t_ptr("defaultName"),
                entrypoint = "NFD_SaveDialog${variant.uppercaseName}",
                javadoc = {
                    add(
                        """
                            Save dialog
                            <p>
                            It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePath${variant.uppercaseName}} if this function returns
                            NFD_OKAY.
                        """.trimIndent()
                    )
                }
            )
            provideOverload(variant, spec, "NFD_SaveDialog")
        }
        saveDialog(Nchar)
        saveDialog(U8char)

        fun saveDialogWith(variant: CharVariant) {
            val saveDialogWithImpl = "NFD_SaveDialog${variant.uppercaseName}_WithImpl"(
                nfdresult_t,
                nfdversion_t("version"),
                variant.nfdchar_t_ptr_ptr("outPath"),
                variant.const_nfdsavedialogargs_t_ptr("args"),
                entrypoint = "NFD_SaveDialog${variant.uppercaseName}_With_Impl",
                javadoc = { add("This function is a library implementation detail.  Please use {@link #NFD_SaveDialog${variant.uppercaseName}_With} instead.") }
            )
            "NFD_SaveDialog${variant.uppercaseName}_With"(
                nfdresult_t,
                variant.nfdchar_t_ptr_ptr("outPath"),
                variant.const_nfdsavedialogargs_t_ptr("args"),
                entrypoint = "NFD_SaveDialog${variant.uppercaseName}_With",
                javadoc = {
                    add(
                        """
                            Single file save dialog, with additional parameters.
                            <p>
                            It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePath${variant.uppercaseName}} if this function
                            returns NFD_OKAY.  See documentation of {@link NFDSaveDialog${variant.uppercaseName}Args} for details.
                        """.trimIndent()
                    )
                },
                default = true
            ) {
                addAnnotation(Skip)
                addStatement("return $1N(NFD_INTERFACE_VERSION, outPath, args)", saveDialogWithImpl)
            }
        }
        saveDialogWith(Nchar)
        saveDialogWith(U8char)


        fun pickFolder(variant: CharVariant) {
            val spec = "NFD_PickFolder${variant.uppercaseName}"(
                nfdresult_t,
                variant.nfdchar_t_ptr_ptr("outPath"),
                variant.const_nfdchar_t_ptr("defaultPath") {
                    javadoc = CodeBlock.of("If null, the operating system will decide.\n")
                },
                entrypoint = "NFD_PickFolder${variant.uppercaseName}",
                javadoc = {
                    add(
                        """
                            Select single folder dialog
                            <p>
                            It's the caller's responsibility to free {@code outPath} via {@link #NFD_FreePath${variant.uppercaseName}} if this function returns
                            NFD_OKAY.
                        """.trimIndent()
                    )
                }
            )
            provideOverload(variant, spec, "NFD_PickFolder")
        }
        pickFolder(Nchar)
        pickFolder(U8char)

        fun pickFolderWith(variant: CharVariant) {
            val pickFolderWithImpl = "NFD_PickFolder${variant.uppercaseName}_With_Impl"(
                nfdresult_t,
                nfdversion_t("version"),
                variant.nfdchar_t_ptr_ptr("outPath"),
                variant.const_nfdpickfolderargs_t_ptr("args"),
                entrypoint = "NFD_PickFolder${variant.uppercaseName}_With_Impl",
                javadoc = { add("This function is a library implementation detail.  Please use {@link #NFD_PickFolder${variant.uppercaseName}_With} instead.") }
            )
            "NFD_PickFolder${variant.uppercaseName}_With"(
                nfdresult_t,
                variant.nfdchar_t_ptr_ptr("outPath"),
                variant.const_nfdpickfolderargs_t_ptr("args"),
                entrypoint = "NFD_PickFolder${variant.uppercaseName}_With",
                javadoc = {
                    add(
                        """
                            Single file open dialog, with additional parameters.
                            <p>
                            It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePath${variant.uppercaseName}} if this function
                            returns NFD_OKAY.  See documentation of {@link NFDPickFolder${variant.uppercaseName}Args} for details.
                        """.trimIndent()
                    )
                },
                default = true,
            ) {
                addAnnotation(Skip)
                addStatement("return $1N(NFD_INTERFACE_VERSION, outPath, args)", pickFolderWithImpl)
            }
        }
        pickFolderWith(Nchar)
        pickFolderWith(U8char)

        fun pickFolderMultiple(variant: CharVariant) {
            val spec = "NFD_PickFolderMultiple${variant.uppercaseName}"(
                nfdresult_t,
                const_nfdpathset_t_ptr_ptr("outPaths"),
                variant.const_nfdchar_t_ptr("defaultPath") {
                    javadoc = CodeBlock.of("If null, the operating system will decide.\n")
                },
                entrypoint = "NFD_PickFolderMultiple${variant.uppercaseName}",
                javadoc = {
                    add(
                        """
                        Select multiple folder dialog
                        <p>
                        It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
                        returns NFD_OKAY.
                    """.trimIndent()
                    )
                }
            )
            provideOverload(variant, spec, "NFD_PickFolderMultiple")
        }
        pickFolderMultiple(Nchar)
        pickFolderMultiple(U8char)

        fun pickFolderMultipleWith(variant: CharVariant) {
            val pickFolderMultipleWithImpl = "NFD_PickFolderMultiple${variant.uppercaseName}_With_Impl"(
                nfdresult_t,
                nfdversion_t("version"),
                const_nfdpathset_t_ptr_ptr("outPaths"),
                variant.const_nfdpickfolderargs_t_ptr("args"),
                entrypoint = "NFD_PickFolderMultiple${variant.uppercaseName}_With_Impl",
                javadoc = {
                    add(
                        """
                            This function is a library implementation detail.  Please use {@link #NFD_PickFolderMultiple${variant.uppercaseName}_With}
                            instead.
                        """.trimIndent()
                    )
                }
            )
            "NFD_PickFolderMultiple${variant.uppercaseName}_With"(
                nfdresult_t,
                const_nfdpathset_t_ptr_ptr("outPaths"),
                variant.const_nfdpickfolderargs_t_ptr("args"),
                entrypoint = "NFD_PickFolderMultiple${variant.uppercaseName}_With",
                javadoc = {
                    add(
                        """
                            Multiple file open dialog, with additional parameters.
                            <p>
                            It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
                            returns NFD_OKAY.  See documentation of {@link NFDPickFolder${variant.uppercaseName}Args} for details.
                        """.trimIndent()
                    )
                },
                default = true
            ) {
                addAnnotation(Skip)
                addStatement("return $1N(NFD_INTERFACE_VERSION, outPaths, args)", pickFolderMultipleWithImpl)
            }
        }
        pickFolderMultipleWith(Nchar)
        pickFolderMultipleWith(U8char)

        val getError_ = "NFD_GetError_"(
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
        typeSpecBuilder.addMethod(getError_.toBuilder().setName("NFD_GetError").returns(String::class.java).build())

        "NFD_ClearError"(void, entrypoint = "NFD_ClearError", javadoc = { add("Clear the error.") })

        val pathSetGetCount = "NFD_PathSet_GetCount"(
            nfdresult_t,
            const_nfdpathset_t_ptr("pathSet"),
            nfdpathsetsize_t_ptr("count"),
            entrypoint = "NFD_PathSet_GetCount",
            javadoc = {
                add(
                    """
                        Get the number of entries stored in pathSet.
                        <p>
                        Note: some paths might be invalid (NFD_ERROR will be returned by NFD_PathSet_GetPath),
                        so we might not actually have this number of usable paths.
                    """.trimIndent()
                )
            }
        )
        pathSetGetCount.name()(
            nfdresult_t,
            const_nfdpathset_t_ptr("pathSet"),
            (jlong.array c nfdpathsetsize_t_ptr)("count").ref,
            entrypoint = "NFD_PathSet_GetCount",
            javadoc = { add(pathSetGetCount.javadoc()) }
        )

        fun pathSetGetPath(variant: CharVariant, pathType: String) {
            val spec = "NFD_PathSet_GetPath${variant.uppercaseName}"(
                nfdresult_t,
                const_nfdpathset_t_ptr("pathSet"),
                nfdpathsetsize_t("index"),
                variant.nfdchar_t_ptr_ptr("outPath"),
                entrypoint = "NFD_PathSet_GetPath${variant.uppercaseName}",
                javadoc = {
                    add(
                        """
                            Get the $pathType path at offset index.
                            <p>
                            It is the caller's responsibility to free `outPath` via {@link #NFD_PathSet_FreePath${variant.uppercaseName}} if this function
                            returns NFD_OKAY.
                        """.trimIndent()
                    )
                }
            )
            provideOverload(variant, spec, "NFD_PathSet_GetPath")
        }
        pathSetGetPath(Nchar, "native")
        pathSetGetPath(U8char, "UTF-8")

        fun pathSetFreePath(variant: CharVariant) {
            val spec = "NFD_PathSet_FreePath${variant.uppercaseName}"(
                void,
                variant.const_nfdchar_t_ptr("filePath"),
                entrypoint = "NFD_PathSet_FreePath${variant.uppercaseName}",
                javadoc = { add("Free the path gotten by {@link #NFD_PathSet_GetPath${variant.uppercaseName}}.") }
            )
            provideOverload(variant, spec, "NFD_PathSet_FreePath")
        }
        pathSetFreePath(Nchar)
        pathSetFreePath(U8char)

        "NFD_PathSet_GetEnum"(
            nfdresult_t,
            const_nfdpathset_t_ptr("pathSet"),
            nfdpathsetenum_t_ptr("outEnumerator"),
            entrypoint = "NFD_PathSet_GetEnum",
            javadoc = {
                add(
                    """
                        Gets an enumerator of the path set.
                        <p>
                        It is the caller's responsibility to free {@code enumerator} via {@link #NFD_PathSet_FreeEnum}
                        if this function returns NFD_OKAY, and it should be freed before freeing the pathset.
                    """.trimIndent()
                )
            }
        )
        "NFD_PathSet_FreeEnum"(
            void,
            nfdpathsetenum_t_ptr("enumerator"),
            entrypoint = "NFD_PathSet_FreeEnum",
            javadoc = { add("Frees an enumerator of the path set.") }
        )

        fun pathSetEnumNext(variant: CharVariant) {
            val spec = "NFD_PathSet_EnumNext${variant.uppercaseName}"(
                nfdresult_t,
                nfdpathsetenum_t_ptr("enumerator"),
                variant.nfdchar_t_ptr_ptr("outPath"),
                entrypoint = "NFD_PathSet_EnumNext${variant.uppercaseName}",
                javadoc = {
                    add(
                        """
                            Gets the next item from the path set enumerator.
                            <p>
                            If there are no more items, then *outPaths will be set to null.
                            It is the caller's responsibility to free {@code *outPath} via {@link #NFD_PathSet_FreePath${variant.uppercaseName}}
                            if this function returns NFD_OKAY and {@code *outPath} is not null.
                        """.trimIndent()
                    )
                }
            )
            provideOverload(variant, spec, "NFD_PathSet_EnumNext")
        }
        pathSetEnumNext(Nchar)
        pathSetEnumNext(U8char)

        "NFD_PathSet_Free"(
            void,
            const_nfdpathset_t_ptr("pathSet"),
            entrypoint = "NFD_PathSet_Free",
            javadoc = { add("Free the pathSet") }
        )
        //endregion
    }.also {
        val path = Path("overrungl", "nfd", "NFD.java")
        val content = Files.readString(path)
        check(content.indexOf(GENERATOR_BEGIN) != -1 && content.indexOf(GENERATOR_END) != -1) { "Generator region not found" }
        val split = content.split(GENERATOR_BEGIN, GENERATOR_END)
        val codeBuilder = CodeBlock.builder()
        it.fieldSpecs().forEach { s ->
            codeBuilder.add(
                "$1L",
                FieldSpec.builder(s.type(), s.name())
                    .addJavadoc(s.javadoc())
                    .addModifiers(*s.modifiers().toTypedArray())
                    .initializer("$1N.$2N", "CNFD", s).build()
            )
        }
        it.methodSpecs().forEach { s ->
            codeBuilder.add(
                "$1L",
                MethodSpec.methodBuilder(s.name())
                    .addJavadoc(s.javadoc())
                    .addAnnotations(s.annotations())
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                    .returns(s.returnType())
                    .addParameters(s.parameters())
                    .addStatement(
                        "$1LgetInstance().$2N($3L)",
                        if (s.returnType() == TypeName.VOID) "" else "return ",
                        s,
                        s.parameters().joinToString(separator = ", ") { ps -> ps.name() })
                    .build()
            )
        }

        //region custom overloads

        val nfdCharset = ", NFDInternal.nfdCharset"
        val StringArray = ArrayTypeName.of(String::class.java)

        fun provideOverload(variant: CharVariant, spec: MethodSpec, name: String) {
            if (variant == Nchar) {
                codeBuilder.add(
                    "$1L",
                    MethodSpec.methodBuilder(name)
                        .addJavadoc(spec.javadoc())
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .returns(spec.returnType())
                        .addParameters(spec.parameters())
                        .addStatement(
                            "$1L$2N($3L)",
                            if (spec.returnType() == TypeName.VOID) "" else "return ",
                            spec,
                            spec.parameters().joinToString(separator = ", ") { ps -> ps.name() })
                        .build()
                )
            }
        }

        fun openDialog(variant: CharVariant, charset: String) {
            val spec = MethodSpec.methodBuilder("NFD_OpenDialog${variant.uppercaseName}")
                .addJavadoc("Overloads {@link #NFD_OpenDialog${variant.uppercaseName}(MemorySegment, MemorySegment, int, MemorySegment)}")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(TypeName.INT)
                .addParameter(StringArray, "outPath")
                .addParameter(ClassName.get("overrungl.nfd", "NFD${variant.uppercaseName}FilterItem"), "filterList")
                .addParameter(String::class.java, "defaultPath")
                .beginControlFlow("try (MemoryStack stack = MemoryStack.pushLocal())")
                .addStatement("var seg = Marshal.marshal(stack, outPath$1L)", charset)
                .addStatement(
                    "int result = NFD_OpenDialog${variant.uppercaseName}(seg, Marshal.marshal(filterList), filterItemCount(filterList), Marshal.marshal(stack, defaultPath$1L))",
                    charset
                )
                .beginControlFlow("if (result == NFD_OKAY)")
                .addStatement("copyOutPath${variant.uppercaseName}(seg, outPath)")
                .endControlFlow()
                .addStatement("return result")
                .endControlFlow()
                .build()
            codeBuilder.add("$1L", spec)
            provideOverload(variant, spec, "NFD_OpenDialog")
        }
        openDialog(Nchar, nfdCharset)
        openDialog(U8char, "")

        fun openDialogWith(variant: CharVariant, charset: String) {
            codeBuilder.add(
                "$1L",
                MethodSpec.methodBuilder("NFD_OpenDialog${variant.uppercaseName}_With")
                    .addJavadoc("Overloads {@link #NFD_OpenDialog${variant.uppercaseName}_With(MemorySegment, MemorySegment)}")
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                    .returns(TypeName.INT)
                    .addParameter(StringArray, "outPath")
                    .addParameter(ClassName.get("overrungl.nfd", "NFDOpenDialog${variant.uppercaseName}Args"), "args")
                    .beginControlFlow("try (MemoryStack stack = MemoryStack.pushLocal())")
                    .addStatement("var seg = Marshal.marshal(stack, outPath$1L)", charset)
                    .addStatement("int result = NFD_OpenDialog${variant.uppercaseName}_With(seg, Marshal.marshal(args))")
                    .beginControlFlow("if (result == NFD_OKAY)")
                    .addStatement("copyOutPath${variant.uppercaseName}(seg, outPath)")
                    .endControlFlow()
                    .addStatement("return result")
                    .endControlFlow()
                    .build()
            )
        }
        openDialogWith(Nchar, nfdCharset)
        openDialogWith(U8char, "")

        fun openDialogMultiple(variant: CharVariant, charset: String) {
            val spec = MethodSpec.methodBuilder("NFD_OpenDialogMultiple${variant.uppercaseName}")
                .addJavadoc("Overloads {@link #NFD_OpenDialogMultiple${variant.uppercaseName}(MemorySegment, MemorySegment, int, MemorySegment)}")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(TypeName.INT)
                .addParameter(MemorySegment_, "outPaths")
                .addParameter(ClassName.get("overrungl.nfd", "NFD${variant.uppercaseName}FilterItem"), "filterList")
                .addParameter(String::class.java, "defaultPath")
                .beginControlFlow("try (MemoryStack stack = MemoryStack.pushLocal())")
                .addStatement(
                    "return NFD_OpenDialogMultiple${variant.uppercaseName}(outPaths, Marshal.marshal(filterList), filterItemCount(filterList), Marshal.marshal(stack, defaultPath$1L))",
                    charset
                )
                .endControlFlow()
                .build()
            codeBuilder.add("$1L", spec)
            provideOverload(variant, spec, "NFD_OpenDialogMultiple")
        }
        openDialogMultiple(Nchar, nfdCharset)
        openDialogMultiple(U8char, "")

        fun openDialogMultipleWith(variant: CharVariant) {
            codeBuilder.add(
                "$1L",
                MethodSpec.methodBuilder("NFD_OpenDialogMultiple${variant.uppercaseName}_With")
                    .addJavadoc("Overloads {@link #NFD_OpenDialogMultiple${variant.uppercaseName}_With(MemorySegment, MemorySegment)}")
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                    .returns(TypeName.INT)
                    .addParameter(MemorySegment_, "outPaths")
                    .addParameter(ClassName.get("overrungl.nfd", "NFDOpenDialog${variant.uppercaseName}Args"), "args")
                    .addStatement("return NFD_OpenDialogMultiple${variant.uppercaseName}_With(outPaths, Marshal.marshal(args))")
                    .build()
            )
        }
        openDialogMultipleWith(Nchar)
        openDialogMultipleWith(U8char)


        fun saveDialog(variant: CharVariant, charset: String) {
            val spec = MethodSpec.methodBuilder("NFD_SaveDialog${variant.uppercaseName}")
                .addJavadoc("Overloads {@link #NFD_SaveDialog${variant.uppercaseName}(MemorySegment, MemorySegment, int, MemorySegment, MemorySegment)}")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(TypeName.INT)
                .addParameter(StringArray, "outPath")
                .addParameter(ClassName.get("overrungl.nfd", "NFD${variant.uppercaseName}FilterItem"), "filterList")
                .addParameter(String::class.java, "defaultPath")
                .addParameter(String::class.java, "defaultName")
                .beginControlFlow("try (MemoryStack stack = MemoryStack.pushLocal())")
                .addStatement("var seg = Marshal.marshal(stack, outPath$1L)", charset)
                .addStatement(
                    "int result = NFD_SaveDialog${variant.uppercaseName}(seg, Marshal.marshal(filterList), filterItemCount(filterList), Marshal.marshal(stack, defaultPath$1L), Marshal.marshal(stack, defaultName$1L))",
                    charset
                )
                .beginControlFlow("if (result == NFD_OKAY)")
                .addStatement("copyOutPath${variant.uppercaseName}(seg, outPath)")
                .endControlFlow()
                .addStatement("return result")
                .endControlFlow()
                .build()
            codeBuilder.add("$1L", spec)
            provideOverload(variant, spec, "NFD_SaveDialog")
        }
        saveDialog(Nchar, nfdCharset)
        saveDialog(U8char, "")

        fun saveDialogWith(variant: CharVariant, charset: String) {
            codeBuilder.add(
                "$1L",
                MethodSpec.methodBuilder("NFD_SaveDialog${variant.uppercaseName}_With")
                    .addJavadoc("Overloads {@link #NFD_SaveDialog${variant.uppercaseName}_With(MemorySegment, MemorySegment)}")
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                    .returns(TypeName.INT)
                    .addParameter(StringArray, "outPath")
                    .addParameter(ClassName.get("overrungl.nfd", "NFDSaveDialog${variant.uppercaseName}Args"), "args")
                    .beginControlFlow("try (MemoryStack stack = MemoryStack.pushLocal())")
                    .addStatement("var seg = Marshal.marshal(stack, outPath$1L)", charset)
                    .addStatement("int result = NFD_SaveDialog${variant.uppercaseName}_With(seg, Marshal.marshal(args))")
                    .beginControlFlow("if (result == NFD_OKAY)")
                    .addStatement("copyOutPath${variant.uppercaseName}(seg, outPath)")
                    .endControlFlow()
                    .addStatement("return result")
                    .endControlFlow()
                    .build()
            )
        }
        saveDialogWith(Nchar, nfdCharset)
        saveDialogWith(U8char, "")


        fun pickFolder(variant: CharVariant, charset: String) {
            val spec = MethodSpec.methodBuilder("NFD_PickFolder${variant.uppercaseName}")
                .addJavadoc("Overloads {@link #NFD_PickFolder${variant.uppercaseName}(MemorySegment, MemorySegment)}")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(TypeName.INT)
                .addParameter(StringArray, "outPath")
                .addParameter(String::class.java, "defaultPath")
                .beginControlFlow("try (MemoryStack stack = MemoryStack.pushLocal())")
                .addStatement("var seg = Marshal.marshal(stack, outPath$1L)", charset)
                .addStatement(
                    "int result = NFD_PickFolder${variant.uppercaseName}(seg, Marshal.marshal(stack, defaultPath$1L))",
                    charset
                )
                .beginControlFlow("if (result == NFD_OKAY)")
                .addStatement("copyOutPath${variant.uppercaseName}(seg, outPath)")
                .endControlFlow()
                .addStatement("return result")
                .endControlFlow()
                .build()
            codeBuilder.add("$1L", spec)
            provideOverload(variant, spec, "NFD_PickFolder")
        }
        pickFolder(Nchar, nfdCharset)
        pickFolder(U8char, "")

        fun pickFolderWith(variant: CharVariant, charset: String) {
            codeBuilder.add(
                "$1L",
                MethodSpec.methodBuilder("NFD_PickFolder${variant.uppercaseName}_With")
                    .addJavadoc("Overloads {@link #NFD_PickFolder${variant.uppercaseName}_With(MemorySegment, MemorySegment)}")
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                    .returns(TypeName.INT)
                    .addParameter(StringArray, "outPath")
                    .addParameter(ClassName.get("overrungl.nfd", "NFDPickFolder${variant.uppercaseName}Args"), "args")
                    .beginControlFlow("try (MemoryStack stack = MemoryStack.pushLocal())")
                    .addStatement("var seg = Marshal.marshal(stack, outPath$1L)", charset)
                    .addStatement("int result = NFD_PickFolder${variant.uppercaseName}_With(seg, Marshal.marshal(args))")
                    .beginControlFlow("if (result == NFD_OKAY)")
                    .addStatement("copyOutPath${variant.uppercaseName}(seg, outPath)")
                    .endControlFlow()
                    .addStatement("return result")
                    .endControlFlow()
                    .build()
            )
        }
        pickFolderWith(Nchar, nfdCharset)
        pickFolderWith(U8char, "")

        fun pickFolderMultiple(variant: CharVariant, charset: String) {
            val spec = MethodSpec.methodBuilder("NFD_PickFolderMultiple${variant.uppercaseName}")
                .addJavadoc("Overloads {@link #NFD_PickFolderMultiple${variant.uppercaseName}(MemorySegment, MemorySegment)}")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(TypeName.INT)
                .addParameter(MemorySegment_, "outPaths")
                .addParameter(String::class.java, "defaultPath")
                .beginControlFlow("try (MemoryStack stack = MemoryStack.pushLocal())")
                .addStatement(
                    "return NFD_PickFolderMultiple${variant.uppercaseName}(outPaths, Marshal.marshal(stack, defaultPath$1L))",
                    charset
                )
                .endControlFlow()
                .build()
            codeBuilder.add("$1L", spec)
            provideOverload(variant, spec, "NFD_PickFolderMultiple")
        }
        pickFolderMultiple(Nchar, nfdCharset)
        pickFolderMultiple(U8char, "")

        fun pickFolderMultipleWith(variant: CharVariant) {
            codeBuilder.add(
                "$1L",
                MethodSpec.methodBuilder("NFD_PickFolderMultiple${variant.uppercaseName}_With")
                    .addJavadoc("Overloads {@link #NFD_PickFolderMultiple${variant.uppercaseName}_With(MemorySegment, MemorySegment)}")
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                    .returns(TypeName.INT)
                    .addParameter(MemorySegment_, "outPaths")
                    .addParameter(ClassName.get("overrungl.nfd", "NFDPickFolder${variant.uppercaseName}Args"), "args")
                    .addStatement("return NFD_PickFolderMultiple${variant.uppercaseName}_With(outPaths, Marshal.marshal(args))")
                    .build()
            )
        }
        pickFolderMultipleWith(Nchar)
        pickFolderMultipleWith(U8char)


        fun pathSetGetPath(variant: CharVariant, charset: String) {
            val spec = MethodSpec.methodBuilder("NFD_PathSet_GetPath${variant.uppercaseName}")
                .addJavadoc("Overloads {@link #NFD_PathSet_GetPath${variant.uppercaseName}(MemorySegment, long, MemorySegment)}")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(TypeName.INT)
                .addParameter(MemorySegment_, "pathSet")
                .addParameter(TypeName.LONG, "index")
                .addParameter(StringArray, "outPath")
                .beginControlFlow("try (MemoryStack stack = MemoryStack.pushLocal())")
                .addStatement("var seg = Marshal.marshal(stack, outPath$1L)", charset)
                .addStatement("int result = NFD_PathSet_GetPath${variant.uppercaseName}(pathSet, index, seg)")
                .beginControlFlow("if (result == NFD_OKAY)")
                .addStatement("copyPathSetOutPath${variant.uppercaseName}(seg, outPath)")
                .endControlFlow()
                .addStatement("return result")
                .endControlFlow()
                .build()
            codeBuilder.add("$1L", spec)
            provideOverload(variant, spec, "NFD_PathSet_GetPath")
        }
        pathSetGetPath(Nchar, nfdCharset)
        pathSetGetPath(U8char, "")

        fun pathSetEnumNext(variant: CharVariant, charset: String) {
            val spec = MethodSpec.methodBuilder("NFD_PathSet_EnumNext${variant.uppercaseName}")
                .addJavadoc("Overloads {@link #NFD_PathSet_EnumNext${variant.uppercaseName}(MemorySegment, MemorySegment)}")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(TypeName.INT)
                .addParameter(MemorySegment_, "enumerator")
                .addParameter(StringArray, "outPath")
                .beginControlFlow("try (MemoryStack stack = MemoryStack.pushLocal())")
                .addStatement("var seg = Marshal.marshal(stack, outPath$1L)", charset)
                .addStatement("int result = NFD_PathSet_EnumNext${variant.uppercaseName}(enumerator, seg)")
                .beginControlFlow("if (result == NFD_OKAY)")
                .addStatement("copyPathSetOutPath${variant.uppercaseName}(seg, outPath)")
                .endControlFlow()
                .addStatement("return result")
                .endControlFlow()
                .build()
            codeBuilder.add("$1L", spec)
            provideOverload(variant, spec, "NFD_PathSet_EnumNext")
        }
        pathSetEnumNext(Nchar, nfdCharset)
        pathSetEnumNext(U8char, "")

        //endregion

        Files.writeString(
            path,
            "${split[0]}$GENERATOR_BEGIN\n${
                codeBuilder.build().toString().prependIndent("    ")
            }$GENERATOR_END${split[2]}"
        )
    }
}
