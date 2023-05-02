/*
 *    Copyright 2023 Evil Brain Studio
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package dev.evilbrainstudio.rcd2obj.codegen.render;

import dev.evilbrainstudio.rcd2obj.codegen.JavaElementType;

/**
 * Base abstraction for the Java elements rendering.
 *
 * @author Andrey_Yurzanov
 * @since 1.0
 */
public interface JavaElementRender {
  /**
   * Appends to the render element of the Java language.
   *
   * @param type     element's type {@link JavaElementType}
   * @param elements some literals for the element rendering
   * @return current instance
   */
  JavaElementRender append(JavaElementType type, String... elements);
}
