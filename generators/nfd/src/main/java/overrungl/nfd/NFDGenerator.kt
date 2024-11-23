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

import com.palantir.javapoet.ArrayTypeName
import com.palantir.javapoet.ClassName
import com.palantir.javapoet.MethodSpec
import com.palantir.javapoet.ParameterizedTypeName
import overrungl.gen.*
import java.lang.foreign.SegmentAllocator
import javax.lang.model.element.Modifier

val const_nfdu8char_t_ptr = string c "const nfdu8char_t*"
val const_nfdnchar_t_ptr = string c "const nfdnchar_t*"
val nfdfiltersize_t by int
val nfdversion_t by size_t
val const_nfdu8filteritem_t_ptr = address c "const nfdu8filteritem_t*"
val const_nfdnfilteritem_t_ptr = address c "const nfdnfilteritem_t*"

/**
 * @author squid233
 * @since 0.1.0
 */
fun main() {
    val NFDInternal = ClassName.get("overrungl.nfd", "NFDInternal")

    struct("overrungl.nfd", "NFDU8FilterItem", "nfdu8filteritem_t", javadoc = {
        doFirst { add("UTF-8 Filter Item") }
    }) {
        const_nfdu8char_t_ptr("name")
        const_nfdu8char_t_ptr("spec")
        doLast {
            addMethod(
                MethodSpec.methodBuilder("create")
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                    .returns(selfClassName)
                    .addParameter(SegmentAllocator::class.java, "allocator")
                    .addParameter(String::class.java, "name")
                    .addParameter(String::class.java, "spec")
                    .addStatement(
                        "return $1T.OF.of($2N).name($5T.marshal($2N, $3N)).spec($5T.marshal($2N, $4N))",
                        this@struct.selfClassName,
                        "allocator",
                        "name",
                        "spec",
                        Marshal
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
                    .addStatement("var of = \$T.OF.of(\$N, \$N.length)", selfClassName, "allocator", "entries")
                    .beginControlFlow("for (int i = 0; i < \$N.length; i++)", "entries")
                    .addStatement("var e = \$N[i]", "entries")
                    .addStatement(
                        "of.slice(i).name(\$1T.marshal(allocator, e.getKey())).spec(\$1T.marshal(allocator, e.getValue()))",
                        Marshal
                    )
                    .endControlFlow()
                    .addStatement("return of")
                    .build()
            )
        }
    }
    struct("overrungl.nfd", "NFDNFilterItem", "nfdnfilteritem_t", javadoc = {
        doFirst { add("UTF-16 Filter Item") }
    }) {
        const_nfdnchar_t_ptr("name")
        const_nfdnchar_t_ptr("spec")
        doLast {
            addMethod(
                MethodSpec.methodBuilder("create")
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                    .returns(selfClassName)
                    .addParameter(SegmentAllocator::class.java, "allocator")
                    .addParameter(String::class.java, "name")
                    .addParameter(String::class.java, "spec")
                    .addStatement(
                        "return $1T.OF.of($2N).name($5T.marshal($2N, $3N, $6T.nfdCharset)).spec($5T.marshal($2N, $4N, $6T.nfdCharset))",
                        this@struct.selfClassName,
                        "allocator",
                        "name",
                        "spec",
                        Marshal,
                        NFDInternal
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
                    .addStatement("var of = \$T.OF.of(\$N, \$N.length)", selfClassName, "allocator", "entries")
                    .beginControlFlow("for (int i = 0; i < \$N.length; i++)", "entries")
                    .addStatement("var e = \$N[i]", "entries")
                    .addStatement(
                        "of.slice(i).name($1T.marshal(allocator, e.getKey(), $2T.nfdCharset)).spec($1T.marshal(allocator, e.getValue(), $2T.nfdCharset))",
                        Marshal,
                        NFDInternal
                    )
                    .endControlFlow()
                    .addStatement("return of")
                    .build()
            )
        }
    }
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
    struct("overrungl.nfd", "NFDOpenDialogU8Args", "nfdopendialogu8args_t") {
        const_nfdu8filteritem_t_ptr("filterList")
        nfdfiltersize_t("filterCount")
        const_nfdu8char_t_ptr("defaultPath")
        byValueStruct(nfdwindowhandle_t.structSpec, "parentWindow")
    }
    struct("overrungl.nfd", "NFDOpenDialogNArgs", "nfdopendialognargs_t") {
        const_nfdnfilteritem_t_ptr("filterList")
        nfdfiltersize_t("filterCount")
        const_nfdnchar_t_ptr("defaultPath")
        byValueStruct(nfdwindowhandle_t.structSpec, "parentWindow")
    }
    struct("overrungl.nfd", "NFDSaveDialogU8Args", "nfdsavedialogu8args_t") {
        const_nfdu8filteritem_t_ptr("filterList")
        nfdfiltersize_t("filterCount")
        const_nfdu8char_t_ptr("defaultPath")
        const_nfdu8char_t_ptr("defaultName")
        byValueStruct(nfdwindowhandle_t.structSpec, "parentWindow")
    }
    struct("overrungl.nfd", "NFDSaveDialogNArgs", "nfdsavedialognargs_t") {
        const_nfdnfilteritem_t_ptr("filterList")
        nfdfiltersize_t("filterCount")
        const_nfdnchar_t_ptr("defaultPath")
        const_nfdnchar_t_ptr("defaultName")
        byValueStruct(nfdwindowhandle_t.structSpec, "parentWindow")
    }
    struct("overrungl.nfd", "NFDPickFolderU8Args", "nfdpickfolderu8args_t") {
        const_nfdu8char_t_ptr("defaultPath")
        byValueStruct(nfdwindowhandle_t.structSpec, "parentWindow")
    }
    struct("overrungl.nfd", "NFDPickFolderNArgs", "nfdpickfoldernargs_t") {
        const_nfdnchar_t_ptr("defaultPath")
        byValueStruct(nfdwindowhandle_t.structSpec, "parentWindow")
    }
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
    }
}
