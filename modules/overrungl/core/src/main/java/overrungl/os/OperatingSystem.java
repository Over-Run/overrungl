/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

package overrungl.os;

import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import static overrungl.os.OperatingSystems.*;

/**
 * The operating system.
 *
 * @author Gradle
 * @since 0.1.0
 */
public abstract class OperatingSystem {
    private static OperatingSystem currentOs;
    private final String toStringValue;
    private final String osName;
    private final String osVersion;
    private final String osArch;

    OperatingSystem() {
        osName = System.getProperty("os.name");
        osVersion = System.getProperty("os.version");
        osArch = System.getProperty("os.arch");
        toStringValue = getName() + " " + getVersion() + " " + getArch();
    }

    public static OperatingSystem current() {
        if (currentOs == null) {
            currentOs = forName(System.getProperty("os.name"));
        }
        return currentOs;
    }

    // for testing current()
    static void resetCurrent() {
        currentOs = null;
    }

    public static OperatingSystem forName(String os) {
        String osName = os.toLowerCase();
        if (osName.contains("windows")) {
            return WINDOWS;
        } else if (osName.contains("mac os x") || osName.contains("darwin") || osName.contains("osx")) {
            return MAC_OS;
        } else if (osName.contains("sunos") || osName.contains("solaris")) {
            return SOLARIS;
        } else if (osName.contains("linux")) {
            return LINUX;
        } else if (osName.contains("freebsd")) {
            return FREE_BSD;
        } else {
            // Not strictly true
            return UNIX;
        }
    }

    @Override
    public String toString() {
        return toStringValue;
    }

    public String getName() {
        return osName;
    }

    public String getVersion() {
        return osVersion;
    }

    public String getArch() {
        return osArch;
    }

    public boolean isWindows() {
        return false;
    }

    public boolean isUnix() {
        return false;
    }

    public boolean isMacOsX() {
        return false;
    }

    public boolean isLinux() {
        return false;
    }

    public abstract String getNativePrefix();

    public abstract String getScriptName(String scriptPath);

    public abstract String getExecutableName(String executablePath);

    public abstract String getExecutableSuffix();

    public abstract String getSharedLibraryName(String libraryName);

    public abstract String getSharedLibrarySuffix();

    public abstract String getStaticLibraryName(String libraryName);

    public abstract String getStaticLibrarySuffix();

    public abstract String getLinkLibrarySuffix();

    public abstract String getLinkLibraryName(String libraryPath);

    public abstract String getFamilyName();

    /**
     * Locates the given executable in the system path. Returns null if not found.
     */
    @Nullable
    public File findInPath(String name) {
        String exeName = getExecutableName(name);
        if (exeName.contains(File.separator)) {
            File candidate = new File(exeName);
            if (candidate.isFile()) {
                return candidate;
            }
            return null;
        }
        for (File dir : getPath()) {
            File candidate = new File(dir, exeName);
            if (candidate.isFile()) {
                return candidate;
            }
        }

        return null;
    }

    public List<File> findAllInPath(String name) {
        List<File> all = new LinkedList<File>();

        for (File dir : getPath()) {
            File candidate = new File(dir, name);
            if (candidate.isFile()) {
                all.add(candidate);
            }
        }

        return all;
    }

    public List<File> getPath() {
        String path = System.getenv(getPathVar());
        if (path == null) {
            return Collections.emptyList();
        }
        List<File> entries = new ArrayList<File>();
        for (String entry : path.split(Pattern.quote(File.pathSeparator))) {
            entries.add(new File(entry));
        }
        return entries;
    }

    public String getPathVar() {
        return "PATH";
    }

    static class Windows extends OperatingSystem {
        private final String nativePrefix;

        Windows() {
            nativePrefix = resolveNativePrefix();
        }

        @Override
        public boolean isWindows() {
            return true;
        }

        @Override
        public String getFamilyName() {
            return "windows";
        }

        @Override
        public String getScriptName(String scriptPath) {
            return withExtension(scriptPath, ".bat");
        }

        @Override
        public String getExecutableSuffix() {
            return ".exe";
        }

        @Override
        public String getExecutableName(String executablePath) {
            return withExtension(executablePath, ".exe");
        }

        @Override
        public String getSharedLibrarySuffix() {
            return ".dll";
        }

        @Override
        public String getSharedLibraryName(String libraryPath) {
            return withExtension(libraryPath, ".dll");
        }

        @Override
        public String getLinkLibrarySuffix() {
            return ".lib";
        }

        @Override
        public String getLinkLibraryName(String libraryPath) {
            return withExtension(libraryPath, ".lib");
        }

        @Override
        public String getStaticLibrarySuffix() {
            return ".lib";
        }

        @Override
        public String getStaticLibraryName(String libraryName) {
            return withExtension(libraryName, ".lib");
        }

        @Override
        public String getNativePrefix() {
            return nativePrefix;
        }

        private String resolveNativePrefix() {
            String arch = System.getProperty("os.arch");
            if ("i386".equals(arch)) {
                arch = "x86";
            }
            return "win32-" + arch;
        }

        @Override
        public String getPathVar() {
            return "Path";
        }
    }

    static class Unix extends OperatingSystem {
        private final String nativePrefix;

        Unix() {
            this.nativePrefix = resolveNativePrefix();
        }

        @Override
        public String getScriptName(String scriptPath) {
            return scriptPath;
        }

        @Override
        public String getFamilyName() {
            return "unknown";
        }

        @Override
        public String getExecutableSuffix() {
            return "";
        }

        @Override
        public String getExecutableName(String executablePath) {
            return executablePath;
        }

        @Override
        public String getSharedLibraryName(String libraryName) {
            return getLibraryName(libraryName, getSharedLibrarySuffix());
        }

        private String getLibraryName(String libraryName, String suffix) {
            if (libraryName.endsWith(suffix)) {
                return libraryName;
            }
            int pos = libraryName.lastIndexOf('/');
            if (pos >= 0) {
                return libraryName.substring(0, pos + 1) + "lib" + libraryName.substring(pos + 1) + suffix;
            } else {
                return "lib" + libraryName + suffix;
            }
        }

        @Override
        public String getSharedLibrarySuffix() {
            return ".so";
        }

        @Override
        public String getLinkLibrarySuffix() {
            return getSharedLibrarySuffix();
        }

        @Override
        public String getLinkLibraryName(String libraryPath) {
            return getSharedLibraryName(libraryPath);
        }

        @Override
        public String getStaticLibrarySuffix() {
            return ".a";
        }

        @Override
        public String getStaticLibraryName(String libraryName) {
            return getLibraryName(libraryName, ".a");
        }

        @Override
        public boolean isUnix() {
            return true;
        }

        @Override
        public String getNativePrefix() {
            return nativePrefix;
        }

        private String resolveNativePrefix() {
            String arch = getArch();
            String osPrefix = getOsPrefix();
            osPrefix += "-" + arch;
            return osPrefix;
        }

        public String getArch() {
            String arch = super.getArch();
            if ("x86".equals(arch)) {
                arch = "i386";
            }
            if ("x86_64".equals(arch)) {
                arch = "amd64";
            }
            if ("powerpc".equals(arch)) {
                arch = "ppc";
            }
            return arch;
        }

        protected String getOsPrefix() {
            String osPrefix = getName().toLowerCase();
            int space = osPrefix.indexOf(" ");
            if (space != -1) {
                osPrefix = osPrefix.substring(0, space);
            }
            return osPrefix;
        }
    }

    static class MacOs extends Unix {
        @Override
        public boolean isMacOsX() {
            return true;
        }

        @Override
        public String getFamilyName() {
            return "os x";
        }

        @Override
        public String getSharedLibrarySuffix() {
            return ".dylib";
        }

        @Override
        public String getNativePrefix() {
            return "darwin";
        }
    }

    static class Linux extends Unix {
        @Override
        public boolean isLinux() {
            return true;
        }

        @Override
        public String getFamilyName() {
            return "linux";
        }
    }

    static class FreeBSD extends Unix {
    }

    static class Solaris extends Unix {
        @Override
        public String getFamilyName() {
            return "solaris";
        }

        @Override
        protected String getOsPrefix() {
            return "sunos";
        }

        @Override
        public String getArch() {
            String arch = System.getProperty("os.arch");
            if (arch.equals("i386") || arch.equals("x86")) {
                return "x86";
            }
            return super.getArch();
        }
    }

    /**
     * Returns a representation of the file path with an alternate extension.  If the file path has no extension,
     * then the provided extension is simply concatenated.  If the file path has an extension, the extension is
     * stripped and replaced with the provided extension.
     * <p>
     * e.g. with a provided extension of ".bar"
     * foo -&gt; foo.bar
     * foo.baz -&gt; foo.bar
     *
     * @param filePath  the file path to transform
     * @param extension the extension to use in the transformed path
     * @return the transformed path
     */
    public static String withExtension(String filePath, String extension) {
        if (filePath.toLowerCase().endsWith(extension)) {
            return filePath;
        }
        return removeExtension(filePath) + extension;
    }

    /**
     * Removes the extension (if any) from the file path.  If the file path has no extension, then it returns the same string.
     *
     * @return the file path without an extension
     */
    public static String removeExtension(String filePath) {
        int fileNameStart = Math.max(filePath.lastIndexOf('/'), filePath.lastIndexOf('\\'));
        int extensionPos = filePath.lastIndexOf('.');

        if (extensionPos > fileNameStart) {
            return filePath.substring(0, extensionPos);
        }
        return filePath;
    }
}
