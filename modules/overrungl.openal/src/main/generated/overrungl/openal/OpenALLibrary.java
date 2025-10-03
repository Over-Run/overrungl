// This file is auto-generated. DO NOT EDIT!
package overrungl.openal;
import overrungl.OverrunGL;
import overrungl.internal.RuntimeHelper;
import java.lang.foreign.SymbolLookup;
import java.util.function.Supplier;

/// Accessor of symbol lookup of module `openal`.
public final class OpenALLibrary {
    private static SymbolLookup customLookup;
    private OpenALLibrary() {}

    /// {@return a supplier of the default symbol lookup which tries loading from local and classpath}
    ///
    /// The returned supplier tries loading each time when invoking `get`.
    public static Supplier<SymbolLookup> defaultLookupSupplier() {
        return () -> RuntimeHelper.load("openal", "openal", OverrunGL.OPENAL_VERSION);
    }

    /// Sets a custom symbol lookup for module `openal`.
    ///
    /// This doesn't take effect if `OpenALLibrary::lookup()` had been invoked.
    /// @param lookup the custom symbol lookup
    public static void useLookup(SymbolLookup lookup) { customLookup = lookup; }

    /// {@return the symbol lookup to be used for module `openal`}
    public static SymbolLookup lookup() {
        final class Holder {
            static final SymbolLookup lookup = customLookup != null ? customLookup : defaultLookupSupplier().get();
        }
        return Holder.lookup;
    }
}
