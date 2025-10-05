// This file is auto-generated. DO NOT EDIT!
package overrungl.shaderc;
import overrungl.OverrunGL;
import overrungl.internal.RuntimeHelper;
import java.lang.foreign.SymbolLookup;
import java.util.function.Supplier;

/// Accessor of symbol lookup of module `shaderc`.
public final class ShadercLibrary {
    private static SymbolLookup customLookup;
    private ShadercLibrary() {}

    /// {@return a supplier of the default symbol lookup which tries loading from local and classpath}
    ///
    /// The returned supplier tries loading each time when invoking `get`.
    public static Supplier<SymbolLookup> defaultLookupSupplier() {
        return () -> RuntimeHelper.load("shaderc", "shaderc_shared", OverrunGL.SHADERC_VERSION);
    }

    /// Sets a custom symbol lookup for module `shaderc`.
    ///
    /// This doesn't take effect if `ShadercLibrary::lookup()` had been invoked.
    /// @param lookup the custom symbol lookup
    public static void useLookup(SymbolLookup lookup) { customLookup = lookup; }

    /// {@return the symbol lookup to be used for module `shaderc`}
    public static SymbolLookup lookup() {
        final class Holder {
            static final SymbolLookup lookup = customLookup != null ? customLookup : defaultLookupSupplier().get();
        }
        return Holder.lookup;
    }
}
