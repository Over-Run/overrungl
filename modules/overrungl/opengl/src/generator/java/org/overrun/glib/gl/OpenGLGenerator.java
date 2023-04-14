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

package org.overrun.glib.gl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author squid233
 * @since 0.1.0
 */
public final class OpenGLGenerator {
    public static void main(String[] args) throws IOException {
        generateFiles();
    }

    private static GLExtFunc[] functions(GLExtFunc... functions) {
        return functions;
    }

    private static GLExtFunc func(String name, Type returnType, FuncParam... params) {
        return new GLExtFunc(name, returnType, params);
    }

    private static FuncParam i(String name) {
        return new FuncParam(Type.Int, name);
    }

    private static FuncParam p(String name) {
        return new FuncParam(Type.Address, name);
    }

    private static void generateFiles() throws IOException {
        generateFile("GLARBRobustness", new GLExtension("GL_ARB_robustness", functions(
            func("glGetGraphicsResetStatusARB", Type.Int),
            func("glGetnCompressedTexImageARB", Type.Void, i("target"), i("lod"), i("bufSize"), p("img")),
            func("glGetnTexImageARB", Type.Void, i("target"), i("level"), i("format"), i("type"), i("bufSize"), p("img")),
            func("glGetnUniformdvARB", Type.Void, i("program"), i("location"), i("bufSize"), p("params")),
            func("glGetnUniformfvARB", Type.Void, i("program"), i("location"), i("bufSize"), p("params")),
            func("glGetnUniformivARB", Type.Void, i("program"), i("location"), i("bufSize"), p("params")),
            func("glGetnUniformuivARB", Type.Void, i("program"), i("location"), i("bufSize"), p("params")),
            func("glReadnPixelsARB", Type.Void, i("x"), i("y"), i("width"), i("height"), i("format"), i("type"), i("bufSize"), p("data"))
        )));
        generateFile("GLARBSampleLocations", new GLExtension("GL_ARB_sample_locations", functions(
            func("glEvaluateDepthValuesARB", Type.Void),
            func("glFramebufferSampleLocationsfvARB", Type.Void, i("target"), i("start"), i("count"), p("v")),
            func("glNamedFramebufferSampleLocationsfvARB", Type.Void, i("framebuffer"), i("start"), i("count"), p("v"))
        )));
    }

    private static void generateFile(String filename, GLExtension extension) throws IOException {
        final StringBuilder sb = new StringBuilder(2048);
        // file-header
        sb.append("""
            // this file is auto-generated. DO NOT EDIT!
            package org.overrun.glib.gl.ext""");
        if (filename.startsWith("GLARB")) {
            sb.append(".arb");
        }
        sb.append(";").append("""


            import org.overrun.glib.*;
            import org.overrun.glib.gl.*;
            import java.lang.foreign.MemorySegment;
            import static org.overrun.glib.FunctionDescriptors.*;

            /**
             *""").append(" {@code ").append(extension.name()).append("""
            }
             */
            public final class\s""").append(filename).append(' ').append("""
            {
                public static void load(GLExtCaps ext, GLLoadFunc load) {
                    if (!ext.""").append(extension.name()).append(") return;");
        // load functions
        for (GLExtFunc(String name, Type returnType, FuncParam[] params) : extension.functions()) {
            sb.append("\n        ext.").append(name).append(" = load.invoke(\"").append(name).append("\", ");
            for (FuncParam param : params) {
                sb.append(param.type().shortStr());
            }
            sb.append(returnType.shortStr());
            sb.append(");");
        }
        sb.append("\n    }\n");
        // declare methods
        for (GLExtFunc(String name, Type returnType, FuncParam[] params) : extension.functions()) {
            sb.append("\n    public static ").append(returnType.name()).append(' ').append(name).append("(");
            // parameters
            int i = 0;
            for (FuncParam(Type type, String paramName) : params) {
                if (i > 0) sb.append(", ");
                sb.append(type.name()).append(' ').append(paramName);
                i++;
            }
            // method body
            sb.append("""
                ) {
                        final var ext = GLLoader.getExtCapabilities();
                        try {
                           \s""");
            if (!returnType.equals(Type.Void)) {
                sb.append("return (").append(returnType.name()).append(") ");
            }
            // invoke function
            sb.append("GLLoader.check(ext.").append(name).append(").invokeExact(");
            i = 0;
            for (FuncParam param : params) {
                if (i > 0) sb.append(", ");
                sb.append(param.name());
                i++;
            }
            sb.append("""
                );
                        } catch (Throwable e) {
                            throw new AssertionError("should not reach here", e);
                        }
                    }
                """);
        }
        // eof
        sb.append("\n}\n");
        String prefix;
        if (filename.startsWith("GLARB")) {
            prefix = "arb/";
        } else {
            prefix = "";
        }
        Files.writeString(Path.of("ext/" + prefix + filename + ".java"), sb);
    }
}
