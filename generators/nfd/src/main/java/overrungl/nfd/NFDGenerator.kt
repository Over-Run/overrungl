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

import io.github.overrun.marshalgen.*

val const_nfdu8char_t_pointer = const_char_pointer c "const nfdu8char_t*"
val const_nfdnchar_t_pointer = const_char_pointer c "const nfdnchar_t*"
val const_nfdu8filteritem_t_pointer = address c "const nfdu8filteritem_t*"
val const_nfdnfilteritem_t_pointer = address c "const nfdnfilteritem_t*"
val nfdfiltersize_t by int
val nfdresult_t by int
val nfdversion_t by size_t
val nfdu8char_t_pointer = address c "nfdu8char_t*"
val nfdnchar_t_pointer = address c "nfdnchar_t*"
val nfdu8char_t_pointer_pointer = address c "nfdu8char_t**"
val nfdnchar_t_pointer_pointer = address c "nfdnchar_t**"

/**
 * @author squid233
 * @since 0.1.0
 */
fun main() {
    struct("overrungl.nfd.NFDU8FilterItem", "nfdu8filteritem_t", javadoc {
        +"UTF-8 Filter Item"
        see("NFDHelper")
    }) {
        const_nfdu8char_t_pointer("name")
        const_nfdu8char_t_pointer("spec")
    }
    struct("overrungl.nfd.NFDNFilterItem", "nfdnfilteritem_t", javadoc {
        +"UTF-16 Filter Item"
        see("NFDHelper")
    }) {
        const_nfdnchar_t_pointer("name")
        const_nfdnchar_t_pointer("spec")
    }
    val nfdwindowhandle_t = struct("overrungl.nfd.NFDWindowHandle", "nfdwindowhandle_t", javadoc {
        +"""
            The native window handle.  If using a platform abstraction framework (e.g. SDL2), this should be
            obtained using the corresponding NFD glue header (e.g. nfd_sdl2.h).
        """.trimIndent()
    }) {
        size_t("type")
        void_pointer("handle")
    }
    struct("overrungl.nfd.NFDOpenDialogU8Args", "nfdopendialogu8args_t") {
        const_nfdu8filteritem_t_pointer("filterList")
        nfdfiltersize_t("filterCount")
        const_nfdu8char_t_pointer("defaultPath")
        nfdwindowhandle_t("parentWindow")
    }
    struct("overrungl.nfd.NFDOpenDialogNArgs", "nfdopendialognargs_t") {
        const_nfdnfilteritem_t_pointer("filterList")
        nfdfiltersize_t("filterCount")
        const_nfdnchar_t_pointer("defaultPath")
        nfdwindowhandle_t("parentWindow")
    }
    struct("overrungl.nfd.NFDSaveDialogU8Args", "nfdsavedialogu8args_t") {
        const_nfdu8filteritem_t_pointer("filterList")
        nfdfiltersize_t("filterCount")
        const_nfdu8char_t_pointer("defaultPath")
        const_nfdu8char_t_pointer("defaultName")
        nfdwindowhandle_t("parentWindow")
    }
    struct("overrungl.nfd.NFDSaveDialogNArgs", "nfdsavedialognargs_t") {
        const_nfdnfilteritem_t_pointer("filterList")
        nfdfiltersize_t("filterCount")
        const_nfdnchar_t_pointer("defaultPath")
        const_nfdnchar_t_pointer("defaultName")
        nfdwindowhandle_t("parentWindow")
    }
    struct("overrungl.nfd.NFDPickFolderU8Args", "nfdpickfolderu8args_t") {
        const_nfdu8char_t_pointer("defaultPath")
        nfdwindowhandle_t("parentWindow")
    }
    struct("overrungl.nfd.NFDPickFolderNArgs", "nfdpickfoldernargs_t") {
        const_nfdnchar_t_pointer("defaultPath")
        nfdwindowhandle_t("parentWindow")
    }
    StructRegistration.generate("overrungl.nfd.NFDStructTypes")

    downcall("overrungl.nfd.CNFD", javadoc {
        +"Base functions of [NFD]."
    }) {
        extends(DirectAccess)
        int("ERROR" to "0", javadoc { +"Programmatic error" })
        int("OKAY" to "1", javadoc { +"User pressed okay, or successful return" })
        int("CANCEL" to "2", javadoc { +"User pressed cancel" })
        int(javadoc { +"The native window handle type." }) {
            "WINDOW_HANDLE_TYPE_UNSET"("0")
            "WINDOW_HANDLE_TYPE_WINDOWS"(
                "1",
                javadoc { +"Windows: handle is HWND (the Windows API typedefs this to void*)" })
            // Cocoa: handle is NSWindow*
            "WINDOW_HANDLE_TYPE_COCOA"("2", javadoc { +"Cocoa: handle is NSWindow*" })
            // X11: handle is Window
            "WINDOW_HANDLE_TYPE_X11"("3", javadoc { +"X11: handle is Window" })
        }

        void("FreePathN", nfdnchar_t_pointer * "filePath", entrypoint = "NFD_FreePathN", javadoc = javadoc {
            +"Free a file path that was returned by the dialogs."
            +"Note: use NFD_PathSet_FreePathN() to free path from pathset instead of this function."
        })
        void("FreePathU8", nfdu8char_t_pointer * "filePath", entrypoint = "NFD_FreePathU8", javadoc = javadoc {
            +"Free a file path that was returned by the dialogs."
            +"Note: use NFD_PathSet_FreePathU8() to free path from pathset instead of this function."
        })
        nfdresult_t("Init", entrypoint = "NFD_Init", javadoc = javadoc {
            +"Initialize NFD. Call this for every thread that might use NFD, before calling any other NFD functions on that thread."
        })
        void(
            "Quit",
            entrypoint = "NFD_Quit",
            javadoc = javadoc { +"Call this to de-initialize NFD, if NFD_Init returned NFD_OKAY." })
        /*nfdresult_t(
            "OpenDialogN",
            nfdnchar_t_pointer_pointer * "outPath",
            const_nfdnfilteritem_t_pointer * "filterList",
            nfdfiltersize_t * "filterCount",
            const_nfdnchar_t_pointer * "defaultPath",
            entrypoint = "NFD_OpenDialogN",
            javadoc = javadoc {
                +"Single file open dialog"
                +"It's the caller's responsibility to free `outPath` via NFD_FreePathN() if this function returns NFD_OKAY."
                "filterCount" param "If zero, filterList is ignored (you can use null)."
                "defaultPath" param "If null, the operating system will decide."
            }
        )*/
    }
}
