// This file is auto-generated. DO NOT EDIT!
package overrungl.glfw;
import overrungl.OverrunGL;
import overrungl.internal.RuntimeHelper;
import java.lang.foreign.SymbolLookup;
import java.util.function.Supplier;

/// Accessor of symbol lookup of module `glfw`.
public final class GLFWLibrary {
    private static SymbolLookup customLookup;
    private GLFWLibrary() {}

    /// {@return a supplier of the default symbol lookup which tries loading from local and classpath}
    ///
    /// The returned supplier tries loading each time when invoking `get`.
    public static Supplier<SymbolLookup> defaultLookupSupplier() {
        return () -> RuntimeHelper.load("glfw", "glfw", OverrunGL.GLFW_VERSION);
    }

    /// Sets a custom symbol lookup for module `glfw`.
    ///
    /// This doesn't take effect if `GLFWLibrary::lookup()` had been invoked.
    /// @param lookup the custom symbol lookup
    public static void useLookup(SymbolLookup lookup) { customLookup = lookup; }

    /// {@return the symbol lookup to be used for module `glfw`}
    public static SymbolLookup lookup() {
        final class Holder {
            static final SymbolLookup lookup = customLookup != null ? customLookup : defaultLookupSupplier().get();
        }
        return Holder.lookup;
    }
}
