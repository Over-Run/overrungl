// This file is auto-generated. DO NOT EDIT!
package overrungl.nfd;
import overrungl.OverrunGL;
import overrungl.internal.RuntimeHelper;
import java.lang.foreign.*;
import java.util.*;
import java.util.function.*;

/// Accessor of symbol lookup of module `nfd`.
public final class NFDLibrary {
    private static SymbolLookup customLookup;
    private NFDLibrary() {}

    /// {@return a supplier of the default symbol lookup which tries loading from local and classpath}
    ///
    /// The returned supplier tries loading each time when invoking `get`.
    public static Supplier<SymbolLookup> defaultLookupSupplier() {
        return () -> RuntimeHelper.load("nfd", "nfd", OverrunGL.NFD_VERSION);
    }

    /// Sets a custom symbol lookup for module `nfd`.
    ///
    /// This doesn't take effect if `NFDLibrary::lookup()` had been invoked.
    /// @param lookup the custom symbol lookup
    public static void useLookup(SymbolLookup lookup) { customLookup = lookup; }

    /// {@return the symbol lookup to be used for module `nfd`}
    public static SymbolLookup lookup() {
        final class Holder {
            static final SymbolLookup lookup = customLookup != null ? customLookup : defaultLookupSupplier().get();
        }
        return Holder.lookup;
    }
}
