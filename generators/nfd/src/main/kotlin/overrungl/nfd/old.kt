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
import java.nio.file.Files
import javax.lang.model.element.Modifier
import kotlin.io.path.Path

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

fun old() {
    downcall("overrungl.nfd", "CNFD", javadoc = {
        doFirst { add("Base functions of {@link \$T}.", ClassName.get("overrungl.nfd", "NFD")) }
    }) {
    }.also {
        val path = Path("overrungl", "nfd", "NFD.java")
        val content = Files.readString(path)
        check(content.indexOf(GENERATOR_BEGIN) != -1 && content.indexOf(GENERATOR_END) != -1) { "Generator region not found" }
        val split = content.split(GENERATOR_BEGIN, GENERATOR_END)
        val codeBuilder = CodeBlock.builder()

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
