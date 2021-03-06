/*
 * Copyright (c) 2020 Benjamin Ye
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.enjoydambience.kotlinbard

import com.squareup.kotlinpoet.*

@DslMarker
@Target(AnnotationTarget.CLASS, AnnotationTarget.TYPEALIAS)
public annotation class CodegenDsl

@CodegenDsl
public typealias FileSpecBuilder = FileSpec.Builder

@CodegenDsl
public typealias TypeSpecBuilder = TypeSpec.Builder

@CodegenDsl
public typealias PropertySpecBuilder = PropertySpec.Builder

@CodegenDsl
public typealias FunSpecBuilder = FunSpec.Builder

@CodegenDsl
public typealias ParameterSpecBuilder = ParameterSpec.Builder

@CodegenDsl
public typealias TypeAliasSpecBuilder = TypeAliasSpec.Builder

@CodegenDsl
public typealias AnnotationSpecBuilder = AnnotationSpec.Builder

@CodegenDsl
public typealias CodeBlockBuilder = CodeBlock.Builder
