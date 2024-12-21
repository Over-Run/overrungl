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

import overrungl.gen.refactor.*

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
    Struct(
        nfdPackage,
        "NFDFilterItem",
        "nfdnfilteritem_t",
        javadoc = "UTF-16 Filter Item on Windows, UTF-8 Filter Item on others"
    ) {
        const_nfdnchar_t_ptr("name")
        const_nfdnchar_t_ptr("spec")
        doLast {
            it.appendLine(
                """
                    public static NFDFilterItem create(SegmentAllocator allocator, String name, String spec) {
                        return new NFDFilterItem(allocator).name(NFDInternal.marshalString(allocator, name)).spec(NFDInternal.marshalString(allocator, spec));
                    }

                    @SafeVarargs
                    public static NFDFilterItem create(SegmentAllocator allocator, java.util.Map.Entry<String, String>... entries) {
                        var of = new NFDFilterItem(allocator, entries.length);
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

    val nfdwindowhandle_t = Struct(
        nfdPackage,
        "NFDWindowHandle",
        "nfdwindowhandle_t",
        javadoc = """
            The native window handle.

            If using a platform abstraction framework (e.g. SDL2), this should be
            obtained using the corresponding NFD glue header (e.g. nfd_sdl2.h).
        """.trimIndent()
    ) {
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

    StaticDowncall(nfdPackage, "NFD", "NFDInternal.LOOKUP") {
        jint("NFD_ERROR" to "0", javadoc = "Programmatic error")
        jint("NFD_OKAY" to "1", javadoc = "User pressed okay, or successful return")
        jint("NFD_CANCEL" to "2", javadoc = "User pressed cancel")
        jint("NFD_WINDOW_HANDLE_TYPE_UNSET" to "0", javadoc = "The native window handle type.")
        jint(
            "NFD_WINDOW_HANDLE_TYPE_WINDOWS" to "1",
            javadoc = "Windows: handle is HWND (the Windows API typedefs this to void*)"
        )
        jint("NFD_WINDOW_HANDLE_TYPE_COCOA" to "2", javadoc = "Cocoa: handle is NSWindow*")
        jint("NFD_WINDOW_HANDLE_TYPE_X11" to "3", javadoc = "X11: handle is Window")
        jint(
            "NFD_INTERFACE_VERSION" to "1", javadoc =
                """
                    This is a unique identifier tagged to all the NFD_*With() function calls, for backward
                    compatibility purposes. <p>There is usually no need to use this directly, unless you want to use
                    NFD differently depending on the version you're building with.
                """.trimIndent()
        )

        //region methods
        "NFD_FreePath"(
            void,
            nfdnchar_t_ptr("filePath"),
            entrypoint = "NFD_FreePathN",
            javadoc = """
                Free a file path that was returned by the dialogs.

                Note: use NFD_PathSet_FreePath() to free path from pathset instead of this function.
            """.trimIndent()
        )
        "NFD_Init"(
            nfdresult_t,
            entrypoint = "NFD_Init",
            javadoc = """
                Initialize NFD. Call this for every thread that might use NFD, before calling any other NFD
                functions on that thread.
            """.trimIndent()
        )
        "NFD_Quit"(
            void,
            entrypoint = "NFD_Quit",
            javadoc = """
                Call this to de-initialize NFD, if [NFD_Init][#NFD_Init()] returned NFD_OKAY.
            """.trimIndent()
        )

        "NFD_OpenDialog"(
            nfdresult_t,
            nfdnchar_t_ptr_ptr("outPath"),
            const_nfdnfilteritem_t_ptr("filterList"),
            nfdfiltersize_t("filterCount"),
            const_nfdnchar_t_ptr("defaultPath"),
            entrypoint = "NFD_OpenDialogN",
            javadoc = """
                Single file open dialog

                It's the caller's responsibility to free `outPath` via NFD_FreePath() if this function returns
                NFD_OKAY.
                @param filterCount If zero, filterList is ignored (you can use null).
                @param defaultPath If null, the operating system will decide.
            """.trimIndent()
        )
        "NFD_OpenDialog_With_Impl"(
            nfdresult_t,
            nfdversion_t("version"),
            nfdnchar_t_ptr_ptr("outPath"),
            const_nfdopendialognargs_t_ptr("args"),
            entrypoint = "NFD_OpenDialogN_With_Impl",
            javadoc = "This function is a library implementation detail.  Please use NFD_OpenDialog_With() instead."
        )
        "NFD_OpenDialog_With"(
            nfdresult_t,
            nfdnchar_t_ptr_ptr("outPath"),
            const_nfdopendialognargs_t_ptr("args"),
            entrypoint = null,
            javadoc = """
                Single file open dialog, with additional parameters.

                It is the caller's responsibility to free `outPath` via NFD_FreePath() if this function
                returns NFD_OKAY.  See documentation of [NFDOpenDialogArgs] for details.
            """.trimIndent(),
            code = "return NFD_OpenDialog_With_Impl(NFD_INTERFACE_VERSION, outPath, args);"
        )
        "NFD_OpenDialogMultiple"(
            nfdresult_t,
            const_nfdpathset_t_ptr_ptr("outPaths"),
            const_nfdnfilteritem_t_ptr("filterList"),
            nfdfiltersize_t("filterCount"),
            const_nfdnchar_t_ptr("defaultPath"),
            entrypoint = "NFD_OpenDialogMultipleN",
            javadoc = """
                Multiple file open dialog

                It is the caller's responsibility to free `outPaths` via NFD_PathSet_Free() if this function
                returns NFD_OKAY.
                @param filterCount If zero, filterList is ignored (you can use null).
                @param defaultPath If null, the operating system will decide.
            """.trimIndent()
        )
        "NFD_OpenDialogMultiple_With_Impl"(
            nfdresult_t,
            nfdversion_t("version"),
            const_nfdpathset_t_ptr_ptr("outPaths"),
            const_nfdopendialognargs_t_ptr("args"),
            entrypoint = "NFD_OpenDialogMultipleN_With_Impl",
            javadoc = """
                This function is a library implementation detail.  Please use NFD_OpenDialogMultiple_With()
                instead.
            """.trimIndent()
        )
        "NFD_OpenDialogMultiple_With"(
            nfdresult_t,
            const_nfdpathset_t_ptr_ptr("outPaths"),
            const_nfdopendialognargs_t_ptr("args"),
            entrypoint = null,
            javadoc = """
                Multiple file open dialog, with additional parameters.

                It is the caller's responsibility to free `outPaths` via NFD_PathSet_Free() if this function
                returns NFD_OKAY.  See documentation of [NFDOpenDialogArgs] for details.
            """.trimIndent(),
            code = "return NFD_OpenDialogMultiple_With_Impl(NFD_INTERFACE_VERSION, outPaths, args);"
        )

        "NFD_SaveDialog"(
            nfdresult_t,
            nfdnchar_t_ptr_ptr("outPath"),
            const_nfdnfilteritem_t_ptr("filterList"),
            nfdfiltersize_t("filterCount"),
            const_nfdnchar_t_ptr("defaultPath"),
            const_nfdnchar_t_ptr("defaultName"),
            entrypoint = "NFD_SaveDialogN",
            javadoc = """
                Save dialog

                It is the caller's responsibility to free `outPath` via NFD_FreePath() if this function returns
                NFD_OKAY.
                @param filterCount If zero, filterList is ignored (you can use null).
                @param defaultPath If null, the operating system will decide.
            """.trimIndent()
        )
        "NFD_SaveDialog_With_Impl"(
            nfdresult_t,
            nfdversion_t("version"),
            nfdnchar_t_ptr_ptr("outPath"),
            const_nfdsavedialognargs_t_ptr("args"),
            entrypoint = "NFD_SaveDialogN_With_Impl",
            javadoc = "This function is a library implementation detail.  Please use NFD_SaveDialog_With() instead."
        )
        "NFD_SaveDialog_With"(
            nfdresult_t,
            nfdnchar_t_ptr_ptr("outPath"),
            const_nfdsavedialognargs_t_ptr("args"),
            entrypoint = null,
            javadoc = """
                Single file save dialog, with additional parameters.

                It is the caller's responsibility to free `outPath` via NFD_FreePath() if this function
                returns NFD_OKAY.  See documentation of [NFDSaveDialogArgs] for details.
            """.trimIndent(),
            code = "return NFD_SaveDialog_With_Impl(NFD_INTERFACE_VERSION, outPath, args);"
        )

        "NFD_PickFolder"(
            nfdresult_t,
            nfdnchar_t_ptr_ptr("outPath"),
            const_nfdnchar_t_ptr("defaultPath"),
            entrypoint = "NFD_PickFolderN",
            javadoc = """
                Select single folder dialog

                It is the caller's responsibility to free `outPath` via NFD_FreePath() if this function returns
                NFD_OKAY.
                @param defaultPath If null, the operating system will decide.
            """.trimIndent()
        )
        "NFD_PickFolder_With_Impl"(
            nfdresult_t,
            nfdversion_t("version"),
            nfdnchar_t_ptr_ptr("outPath"),
            const_nfdpickfoldernargs_t_ptr("args"),
            entrypoint = "NFD_PickFolderN_With_Impl",
            javadoc = "This function is a library implementation detail.  Please use NFD_PickFolder_With() instead."
        )
        "NFD_PickFolder_With"(
            nfdresult_t,
            nfdnchar_t_ptr_ptr("outPath"),
            const_nfdpickfoldernargs_t_ptr("args"),
            entrypoint = null,
            javadoc = """
                Select single folder dialog, with additional parameters.

                It is the caller's responsibility to free `outPath` via NFD_FreePath() if this function
                returns NFD_OKAY.  See documentation of [NFDPickFolderArgs] for details.
            """.trimIndent(),
            code = "return NFD_PickFolder_With_Impl(NFD_INTERFACE_VERSION, outPath, args);"
        )
        "NFD_PickFolderMultiple"(
            nfdresult_t,
            const_nfdpathset_t_ptr_ptr("outPaths"),
            const_nfdnchar_t_ptr("defaultPath"),
            entrypoint = "NFD_PickFolderMultipleN",
            javadoc = """
                Select multiple folder dialog

                It is the caller's responsibility to free `outPaths` via NFD_PathSet_Free() if this function
                NFD_OKAY.
                @param defaultPath If null, the operating system will decide.
            """.trimIndent()
        )
        "NFD_PickFolderMultiple_With_Impl"(
            nfdresult_t,
            nfdversion_t("version"),
            const_nfdpathset_t_ptr_ptr("outPaths"),
            const_nfdpickfoldernargs_t_ptr("args"),
            entrypoint = "NFD_PickFolderMultipleN_With_Impl",
            javadoc = "This function is a library implementation detail.  Please use NFD_PickFolderMultiple_With() instead."
        )
        "NFD_PickFolderMultiple_With"(
            nfdresult_t,
            const_nfdpathset_t_ptr_ptr("outPaths"),
            const_nfdpickfoldernargs_t_ptr("args"),
            entrypoint = null,
            javadoc = """
                Select multiple folder dialog, with additional parameters.

                It is the caller's responsibility to free `outPaths` via NFD_PathSet_Free() if this function
                returns NFD_OKAY.  See documentation of [NFDPickFolderArgs] for details.
            """.trimIndent(),
            code = "return NFD_PickFolderMultiple_With_Impl(NFD_INTERFACE_VERSION, outPaths, args);"
        )

        +"NFD_GetError_"(
            const_char_ptr,
            entrypoint = "NFD_GetError",
            javadoc = """
                Get the last error

                This is set when a function returns NFD_ERROR.
                The memory is owned by NFD and should not be freed by user code.
                This is *always* ASCII printable characters, so it can be interpreted as UTF-8 without any
                conversion.
                @return The last error that was set, or null if there is no error.
            """.trimIndent()
        ).overload("NFD_GetError")
        "NFD_ClearError"(
            void,
            entrypoint = "NFD_ClearError",
            javadoc = "Clear the error."
        )

        +"NFD_PathSet_GetCount"(
            nfdresult_t,
            const_nfdpathset_t_ptr("pathSet"),
            nfdpathsetsize_t_ptr("count").ref(),
            entrypoint = "NFD_PathSet_GetCount",
            javadoc = """
                Get the number of entries stored in pathSet.

                Note: some paths might be invalid (NFD_ERROR will be returned by NFD_PathSet_GetPath),
                so we might not actually have this number of usable paths.
            """.trimIndent()
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
            entrypoint = "NFD_PathSet_GetPathN",
            javadoc = """
                Get the native path at offset index.
                <p>
                It is the caller's responsibility to free `outPath` via NFD_PathSet_FreePath() if this function
                returns NFD_OKAY.
            """.trimIndent()
        )
        "NFD_PathSet_FreePath"(
            void,
            const_nfdnchar_t_ptr("filePath"),
            entrypoint = "NFD_PathSet_FreePathN",
            javadoc = "Free the path gotten by NFD_PathSet_GetPath()."
        )
        "NFD_PathSet_GetEnum"(
            nfdresult_t,
            const_nfdpathset_t_ptr("pathSet"),
            nfdpathsetenum_t_ptr("outEnumerator"),
            entrypoint = "NFD_PathSet_GetEnum",
            javadoc = """
                Gets an enumerator of the path set.

                It is the caller's responsibility to free `enumerator` via NFD_PathSet_FreeEnum()
                if this function returns NFD_OKAY, and it should be freed before freeing the pathset.
            """.trimIndent()
        )
        "NFD_PathSet_FreeEnum"(
            void,
            nfdpathsetenum_t_ptr("enumerator"),
            entrypoint = "NFD_PathSet_FreeEnum",
            javadoc = "Frees an enumerator of the path set."
        )
        "NFD_PathSet_EnumNext"(
            nfdresult_t,
            nfdpathsetenum_t_ptr("enumerator"),
            nfdnchar_t_ptr_ptr("outPath"),
            entrypoint = "NFD_PathSet_EnumNextN",
            javadoc = """
                Gets the next item from the path set enumerator.

                If there are no more items, then *outPaths will be set to null.
                It is the caller's responsibility to free `*outPath` via NFD_PathSet_FreePath()
                if this function returns NFD_OKAY and `*outPath` is not null.
            """.trimIndent()
        )
        "NFD_PathSet_Free"(
            void,
            const_nfdpathset_t_ptr("pathSet"),
            entrypoint = "NFD_PathSet_Free",
            javadoc = "Free the pathSet"
        )
        //endregion
    }
}
