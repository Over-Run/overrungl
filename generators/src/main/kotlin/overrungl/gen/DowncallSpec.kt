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

package overrungl.gen

import com.palantir.javapoet.*
import javax.lang.model.element.Modifier
import kotlin.io.path.Path

/**
 * @author squid233
 * @since 0.1.0
 */
class DowncallSpec(private val packageName: String, className: String, javadoc: JavadocProvider?) {
    private val typeSpecBuilder = TypeSpec.interfaceBuilder(className)

    init {
        if (javadoc != null) {
            typeSpecBuilder.addJavadoc(CodeBlock.builder().also(javadoc.doFirst).build())
        }
        typeSpecBuilder.addModifiers(Modifier.PUBLIC)
    }

    fun extends(typeName: TypeName) {
        typeSpecBuilder.addSuperinterface(typeName)
    }

    operator fun CustomTypeSpec.invoke(pair: Pair<String, CodeBlock>, action: (FieldSpec.Builder.() -> Unit)? = null) {
        typeSpecBuilder.addField(
            FieldSpec.builder(
                this.carrier,
                pair.first,
                Modifier.PUBLIC,
                Modifier.STATIC,
                Modifier.FINAL
            ).initializer(pair.second).also { action?.invoke(it) }.build()
        )
    }

    @JvmName("addFieldStringString")
    operator fun CustomTypeSpec.invoke(pair: Pair<String, String>, action: (FieldSpec.Builder.() -> Unit)? = null) {
        invoke(pair.first to CodeBlock.of(pair.second), action)
    }

    fun generate() {
        JavaFile.builder(packageName, typeSpecBuilder.build()).addFileComment(fileHeader).build().writeTo(Path("."))
    }
}

fun downcall(
    packageName: String,
    className: String,
    javadoc: (JavadocProvider.() -> Unit)? = null,
    action: DowncallSpec.() -> Unit
) {
    DowncallSpec(packageName, className, javadoc?.let { JavadocProvider().also(it) })
        .also(action)
        .generate()
}
