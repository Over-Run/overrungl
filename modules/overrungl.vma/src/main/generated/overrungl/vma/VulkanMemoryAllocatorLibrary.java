// This file is auto-generated. DO NOT EDIT!
package overrungl.vma;
import overrungl.OverrunGL;
import overrungl.internal.RuntimeHelper;
import java.lang.foreign.*;
import java.util.*;
import java.util.function.*;

/// Accessor of symbol lookup of module `vma`.
public final class VulkanMemoryAllocatorLibrary {
    private static SymbolLookup customLookup;
    private VulkanMemoryAllocatorLibrary() {}

    /// {@return a supplier of the default symbol lookup which tries loading from local and classpath}
    ///
    /// The returned supplier tries loading each time when invoking `get`.
    public static Supplier<SymbolLookup> defaultLookupSupplier() {
        return () -> RuntimeHelper.load("vma", "VulkanMemoryAllocator", OverrunGL.VMA_VERSION);
    }

    /// Sets a custom symbol lookup for module `vma`.
    ///
    /// This doesn't take effect if `VulkanMemoryAllocatorLibrary::lookup()` had been invoked.
    /// @param lookup the custom symbol lookup
    public static void useLookup(SymbolLookup lookup) { customLookup = lookup; }

    /// {@return the symbol lookup to be used for module `vma`}
    public static SymbolLookup lookup() {
        final class Holder {
            static final SymbolLookup lookup = customLookup != null ? customLookup : defaultLookupSupplier().get();
        }
        return Holder.lookup;
    }
}
