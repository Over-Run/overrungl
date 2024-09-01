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

import overrungl.gen.*

val const_nfdu8char_t_pointer = string.nativeType("const nfdu8char_t*")
val const_nfdnchar_t_pointer = string.nativeType("const nfdu8char_t*")
val const_nfdu8filteritem_t_pointer = address.nativeType("const nfdu8filteritem_t*")
val const_nfdnfilteritem_t_pointer = address.nativeType("const nfdnfilteritem_t*")
val nfdfiltersize_t by int
val nfdversion_t by size_t

/**
 * @author squid233
 * @since 0.1.0
 */
fun main() {
    Struct("nfdu8filteritem_t", "overrungl.nfd.NFDU8FilterItem", javadoc = "UTF-8 Filter Item") {
        const_nfdu8char_t_pointer("name")
        const_nfdu8char_t_pointer("spec")
        code("""
            static NFDU8FilterItem create(SegmentAllocator allocator, String name, String spec) {
                return OF.of(allocator).name(Marshal.marshal(allocator, name)).spec(Marshal.marshal(allocator, spec));
            }

            @SafeVarargs
            static NFDU8FilterItem create(SegmentAllocator allocator, Map.Entry<String, String>... entries) {
                var of = OF.of(allocator, entries.length);
                for (int i = 0; i < entries.length; i++) {
                    var e = entries[i];
                    of.slice(i).name(Marshal.marshal(allocator, e.getKey())).spec(Marshal.marshal(allocator, e.getValue()));
                }
                return of;
            }
        """.trimIndent())
    }
    Struct("nfdnfilteritem_t", "overrungl.nfd.NFDNFilterItem", javadoc = "UTF-16 Filter Item") {
        const_nfdnchar_t_pointer("name")
        const_nfdnchar_t_pointer("spec")
        code("""
            static NFDNFilterItem create(SegmentAllocator allocator, String name, String spec) {
                return OF.of(allocator).name(Marshal.marshal(allocator, name, NFDInternal.nfdCharset)).spec(Marshal.marshal(allocator, spec, NFDInternal.nfdCharset));
            }

            @SafeVarargs
            static NFDNFilterItem create(SegmentAllocator allocator, Map.Entry<String, String>... entries) {
                var of = OF.of(allocator, entries.length);
                for (int i = 0; i < entries.length; i++) {
                    var e = entries[i];
                    of.slice(i).name(Marshal.marshal(allocator, e.getKey(), NFDInternal.nfdCharset)).spec(Marshal.marshal(allocator, e.getValue(), NFDInternal.nfdCharset));
                }
                return of;
            }
        """.trimIndent())
    }
    val nfdwindowhandle_t = Struct(
        "nfdwindowhandle_t", "overrungl.nfd.NFDWindowHandle", javadoc = """
            The native window handle.  If using a platform abstraction framework (e.g. SDL2), this should be
            obtained using the corresponding NFD glue header (e.g. nfd_sdl2.h).
        """.trimIndent()
    ) {
        size_t("type")
        void_pointer("handle")
    }
    Struct("nfdopendialogu8args_t", "overrungl.nfd.NFDOpenDialogU8Args") {
        const_nfdu8filteritem_t_pointer("filterList")
        nfdfiltersize_t("filterCount")
        const_nfdu8char_t_pointer("defaultPath")
        nfdwindowhandle_t.type(true)("parentWindow")
    }
    Struct("nfdopendialognargs_t", "overrungl.nfd.NFDOpenDialogNArgs") {
        const_nfdnfilteritem_t_pointer("filterList")
        nfdfiltersize_t("filterCount")
        const_nfdnchar_t_pointer("defaultPath")
        nfdwindowhandle_t.type(true)("parentWindow")
    }
    Struct("nfdsavedialogu8args_t", "overrungl.nfd.NFDSaveDialogU8Args") {
        const_nfdu8filteritem_t_pointer("filterList")
        nfdfiltersize_t("filterCount")
        const_nfdu8char_t_pointer("defaultPath")
        const_nfdu8char_t_pointer("defaultName")
        nfdwindowhandle_t.type(true)("parentWindow")
    }
    Struct("nfdsavedialognargs_t", "overrungl.nfd.NFDSaveDialogNArgs") {
        const_nfdnfilteritem_t_pointer("filterList")
        nfdfiltersize_t("filterCount")
        const_nfdnchar_t_pointer("defaultPath")
        const_nfdnchar_t_pointer("defaultName")
        nfdwindowhandle_t.type(true)("parentWindow")
    }
    Struct("nfdpickfolderu8args_t", "overrungl.nfd.NFDPickFolderU8Args") {
        const_nfdu8char_t_pointer("defaultPath")
        nfdwindowhandle_t.type(true)("parentWindow")
    }
    Struct("nfdpickfoldernargs_t", "overrungl.nfd.NFDPickFolderNArgs") {
        const_nfdnchar_t_pointer("defaultPath")
        nfdwindowhandle_t.type(true)("parentWindow")
    }
    Structs.generate("overrungl.nfd.NFDStructTypes")
}
