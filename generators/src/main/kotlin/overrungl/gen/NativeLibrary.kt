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

fun generateLookupAccessor(
    packageName: String,
    className: String,
    moduleName: String,
    basename: String,
    versionRef: String
) {
    writeString(Path("src/main/generated/overrungl/$packageName/$className.java"), buildString {
        appendLine(commentedFileHeader)
        appendLine(
            """
                package overrungl.$packageName;
                import overrungl.OverrunGL;
                import overrungl.internal.RuntimeHelper;
                import java.lang.foreign.SymbolLookup;
                import java.util.function.Supplier;

                /// Accessor of symbol lookup of module `$moduleName`.
                public final class $className {
                    private static SymbolLookup customLookup;
                    private $className() {}

                    /// {@return a supplier of the default symbol lookup which tries loading from local and classpath}
                    ///
                    /// The returned supplier tries loading each time when invoking `get`.
                    public static Supplier<SymbolLookup> defaultLookupSupplier() {
                        return () -> RuntimeHelper.load("$moduleName", "$basename", OverrunGL.$versionRef);
                    }

                    /// Sets a custom symbol lookup for module `$moduleName`.
                    ///
                    /// This doesn't take effect if `$className::lookup()` had been invoked.
                    /// @param lookup the custom symbol lookup
                    public static void useLookup(SymbolLookup lookup) { customLookup = lookup; }

                    /// {@return the symbol lookup to be used for module `$moduleName`}
                    public static SymbolLookup lookup() {
                        final class Holder {
                            static final SymbolLookup lookup = customLookup != null ? customLookup : defaultLookupSupplier().get();
                        }
                        return Holder.lookup;
                    }
                }
            """.trimIndent()
        )
    })
}
