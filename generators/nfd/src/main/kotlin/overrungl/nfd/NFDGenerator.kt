/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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

import overrungl.gen.*

const val nfdPackage = "overrungl.nfd"

object NFDStringProcessor : ValueProcessor {
    override fun marshal(context: ProcessorContext) {
        val builder = context.builder
        val action = context.action
        builder.append("NFDInternal.marshalString(")
        action(builder)
        builder.append(")")
    }

    override fun unmarshal(context: ProcessorContext) {
        val builder = context.builder
        val action = context.action
        builder.append("NFDInternal.unmarshalString(")
        action(builder)
        builder.append(")")
    }

    override fun copy(context: ProcessorContext) {
        val builder = context.builder
        val action = context.action
        builder.append("NFDInternal.unmarshalString(")
        action(builder)
        builder.append(", NFDInternal.nfdCharset)")
    }
}

val nfdfiltersize_t = int c "nfdfiltersize_t"
val nfdversion_t = int c "nfdversion_t"
val nfdresult_t = int c "nfdresult_t"
val const_nfdpathset_t_ptr_ptr = address c "const nfdpathset_t**"
val const_nfdpathset_t_ptr = address c "const nfdpathset_t*"
val nfdpathsetsize_t_ptr = address c "nfdpathsetsize_t*"
val nfdpathsetsize_t = jlong c "nfdpathsetsize_t"
val nfdpathsetenum_t_ptr = address c "nfdpathsetenum_t*"
val const_nfdnchar_t_ptr = string_u8.copy(processor = NFDStringProcessor, cType = "const nfdnchar_t*")
val const_nfdnfilteritem_t_ptr = address c "const nfdnfilteritem_t*"
val nfdnchar_t_ptr = address c "nfdnchar_t*"
val nfdnchar_t_ptr_ptr = address c "nfdnchar_t**"
val const_nfdopendialognargs_t_ptr = address c "const nfdopendialognargs_t*"
val const_nfdsavedialognargs_t_ptr = address c "const nfdsavedialognargs_t*"
val const_nfdpickfoldernargs_t_ptr = address c "const nfdpickfoldernargs_t*"

fun main() {
    //region Structs
    Struct(nfdPackage, "NFDFilterItem", "nfdnfilteritem_t") {
        const_nfdnchar_t_ptr("name")
        const_nfdnchar_t_ptr("spec")
        doLast {
            it.appendLine(
                """
                    public static NFDFilterItem create(SegmentAllocator allocator, String name, String spec) {
                        return alloc(allocator).name(NFDInternal.marshalString(allocator, name)).spec(NFDInternal.marshalString(allocator, spec));
                    }

                    @SafeVarargs
                    public static NFDFilterItem create(SegmentAllocator allocator, java.util.Map.Entry<String, String>... entries) {
                        var of = alloc(allocator, entries.length);
                        for (int i = 0; i < entries.length; i++) {
                            var e = entries[i];
                            of.nameAt(i, NFDInternal.marshalString(allocator, e.getKey())).specAt(i, NFDInternal.marshalString(allocator, e.getValue()));
                        }
                        return of;
                    }
                """.trimIndent().prependIndent("    ")
            )
        }
    }

    val nfdwindowhandle_t = Struct(nfdPackage, "NFDWindowHandle", "nfdwindowhandle_t") {
        size_t("type")
        void_ptr("handle")
    }

    Struct(nfdPackage, "NFDOpenDialogArgs", "nfdopendialognargs_t") {
        const_nfdnfilteritem_t_ptr("filterList")
        nfdfiltersize_t("filterCount")
        const_nfdnchar_t_ptr("defaultPath")
        nfdwindowhandle_t.byValue("parentWindow")
    }
    Struct(nfdPackage, "NFDSaveDialogArgs", "nfdsavedialognargs_t") {
        const_nfdnfilteritem_t_ptr("filterList")
        nfdfiltersize_t("filterCount")
        const_nfdnchar_t_ptr("defaultPath")
        const_nfdnchar_t_ptr("defaultName")
        nfdwindowhandle_t.byValue("parentWindow")
    }
    Struct(nfdPackage, "NFDPickFolderArgs", "nfdpickfoldernargs_t") {
        const_nfdnchar_t_ptr("defaultPath")
        nfdwindowhandle_t.byValue("parentWindow")
    }
    //endregion

    StaticDowncall(nfdPackage, "NFD", "NFDInternal.lookup()") {
        int {
            "NFD_ERROR"("0")
            "NFD_OKAY"("1")
            "NFD_CANCEL"("2")
        }
        int {
            "NFD_WINDOW_HANDLE_TYPE_UNSET"("0")
            "NFD_WINDOW_HANDLE_TYPE_WINDOWS"("1")
            "NFD_WINDOW_HANDLE_TYPE_COCOA"("2")
            "NFD_WINDOW_HANDLE_TYPE_X11"("3")
        }
        int("NFD_INTERFACE_VERSION" to "1")

        //region methods
        "NFD_FreePath"(void, nfdnchar_t_ptr("filePath"), entrypoint = "NFD_FreePathN")
        "NFD_Init"(nfdresult_t, entrypoint = "NFD_Init")
        "NFD_Quit"(void, entrypoint = "NFD_Quit")

        "NFD_OpenDialog"(
            nfdresult_t,
            nfdnchar_t_ptr_ptr("outPath"),
            const_nfdnfilteritem_t_ptr("filterList"),
            nfdfiltersize_t("filterCount"),
            const_nfdnchar_t_ptr("defaultPath"),
            entrypoint = "NFD_OpenDialogN"
        )
        "NFD_OpenDialog_With_Impl"(
            nfdresult_t,
            nfdversion_t("version"),
            nfdnchar_t_ptr_ptr("outPath"),
            const_nfdopendialognargs_t_ptr("args"),
            entrypoint = "NFD_OpenDialogN_With_Impl"
        )
        "NFD_OpenDialog_With"(
            nfdresult_t,
            nfdnchar_t_ptr_ptr("outPath"),
            const_nfdopendialognargs_t_ptr("args"),
            entrypoint = null,
            code = "return NFD_OpenDialog_With_Impl(NFD_INTERFACE_VERSION, outPath, args);"
        )
        "NFD_OpenDialogMultiple"(
            nfdresult_t,
            const_nfdpathset_t_ptr_ptr("outPaths"),
            const_nfdnfilteritem_t_ptr("filterList"),
            nfdfiltersize_t("filterCount"),
            const_nfdnchar_t_ptr("defaultPath"),
            entrypoint = "NFD_OpenDialogMultipleN"
        )
        "NFD_OpenDialogMultiple_With_Impl"(
            nfdresult_t,
            nfdversion_t("version"),
            const_nfdpathset_t_ptr_ptr("outPaths"),
            const_nfdopendialognargs_t_ptr("args"),
            entrypoint = "NFD_OpenDialogMultipleN_With_Impl"
        )
        "NFD_OpenDialogMultiple_With"(
            nfdresult_t,
            const_nfdpathset_t_ptr_ptr("outPaths"),
            const_nfdopendialognargs_t_ptr("args"),
            entrypoint = null,
            code = "return NFD_OpenDialogMultiple_With_Impl(NFD_INTERFACE_VERSION, outPaths, args);"
        )

        "NFD_SaveDialog"(
            nfdresult_t,
            nfdnchar_t_ptr_ptr("outPath"),
            const_nfdnfilteritem_t_ptr("filterList"),
            nfdfiltersize_t("filterCount"),
            const_nfdnchar_t_ptr("defaultPath"),
            const_nfdnchar_t_ptr("defaultName"),
            entrypoint = "NFD_SaveDialogN"
        )
        "NFD_SaveDialog_With_Impl"(
            nfdresult_t,
            nfdversion_t("version"),
            nfdnchar_t_ptr_ptr("outPath"),
            const_nfdsavedialognargs_t_ptr("args"),
            entrypoint = "NFD_SaveDialogN_With_Impl"
        )
        "NFD_SaveDialog_With"(
            nfdresult_t,
            nfdnchar_t_ptr_ptr("outPath"),
            const_nfdsavedialognargs_t_ptr("args"),
            entrypoint = null,
            code = "return NFD_SaveDialog_With_Impl(NFD_INTERFACE_VERSION, outPath, args);"
        )

        "NFD_PickFolder"(
            nfdresult_t,
            nfdnchar_t_ptr_ptr("outPath"),
            const_nfdnchar_t_ptr("defaultPath"),
            entrypoint = "NFD_PickFolderN"
        )
        "NFD_PickFolder_With_Impl"(
            nfdresult_t,
            nfdversion_t("version"),
            nfdnchar_t_ptr_ptr("outPath"),
            const_nfdpickfoldernargs_t_ptr("args"),
            entrypoint = "NFD_PickFolderN_With_Impl"
        )
        "NFD_PickFolder_With"(
            nfdresult_t,
            nfdnchar_t_ptr_ptr("outPath"),
            const_nfdpickfoldernargs_t_ptr("args"),
            entrypoint = null,
            code = "return NFD_PickFolder_With_Impl(NFD_INTERFACE_VERSION, outPath, args);"
        )
        "NFD_PickFolderMultiple"(
            nfdresult_t,
            const_nfdpathset_t_ptr_ptr("outPaths"),
            const_nfdnchar_t_ptr("defaultPath"),
            entrypoint = "NFD_PickFolderMultipleN"
        )
        "NFD_PickFolderMultiple_With_Impl"(
            nfdresult_t,
            nfdversion_t("version"),
            const_nfdpathset_t_ptr_ptr("outPaths"),
            const_nfdpickfoldernargs_t_ptr("args"),
            entrypoint = "NFD_PickFolderMultipleN_With_Impl"
        )
        "NFD_PickFolderMultiple_With"(
            nfdresult_t,
            const_nfdpathset_t_ptr_ptr("outPaths"),
            const_nfdpickfoldernargs_t_ptr("args"),
            entrypoint = null,
            code = "return NFD_PickFolderMultiple_With_Impl(NFD_INTERFACE_VERSION, outPaths, args);"
        )

        +"NFD_GetError_"(const_char_ptr, entrypoint = "NFD_GetError").overload("NFD_GetError")
        "NFD_ClearError"(void, entrypoint = "NFD_ClearError")

        +"NFD_PathSet_GetCount"(
            nfdresult_t,
            const_nfdpathset_t_ptr("pathSet"),
            nfdpathsetsize_t_ptr("count").ref(),
            entrypoint = "NFD_PathSet_GetCount"
        ).overload(
            parameters = listOf(
                const_nfdpathset_t_ptr("pathSet"),
                jlong_array("count").ref()
            )
        )
        "NFD_PathSet_GetPath"(
            nfdresult_t,
            const_nfdpathset_t_ptr("pathSet"),
            nfdpathsetsize_t("index"),
            nfdnchar_t_ptr_ptr("outPath"),
            entrypoint = "NFD_PathSet_GetPathN"
        )
        "NFD_PathSet_FreePath"(void, const_nfdnchar_t_ptr("filePath"), entrypoint = "NFD_PathSet_FreePathN")
        "NFD_PathSet_GetEnum"(
            nfdresult_t,
            const_nfdpathset_t_ptr("pathSet"),
            nfdpathsetenum_t_ptr("outEnumerator"),
            entrypoint = "NFD_PathSet_GetEnum"
        )
        "NFD_PathSet_FreeEnum"(void, nfdpathsetenum_t_ptr("enumerator"), entrypoint = "NFD_PathSet_FreeEnum")
        "NFD_PathSet_EnumNext"(
            nfdresult_t,
            nfdpathsetenum_t_ptr("enumerator"),
            nfdnchar_t_ptr_ptr("outPath"),
            entrypoint = "NFD_PathSet_EnumNextN"
        )
        "NFD_PathSet_Free"(void, const_nfdpathset_t_ptr("pathSet"), entrypoint = "NFD_PathSet_Free")
        //endregion
    }
}
