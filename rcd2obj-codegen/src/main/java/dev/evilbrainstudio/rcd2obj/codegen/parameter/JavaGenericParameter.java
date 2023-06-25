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

package dev.evilbrainstudio.rcd2obj.codegen.parameter;

import dev.evilbrainstudio.rcd2obj.codegen.JavaElementType;
import dev.evilbrainstudio.rcd2obj.codegen.render.JavaElementRender;

/**
 * Parameter of generics.
 *
 * @author Andrey_Yurzanov
 * @since 1.0
 */
public class JavaGenericParameter extends JavaParameter {
  /**
   * Constructs new instance of the parameter.
   *
   * @param parameterOrder order of the parameter
   * @param parameterName  name of the parameter
   */
  public JavaGenericParameter(Integer parameterOrder, String parameterName) {
    super(parameterOrder, parameterName);
  }

  @Override
  public void render(JavaElementRender target) {
    target.append(JavaElementType.PARAMETER_BEGIN);
    if (parameterType != null) {
      target.append(JavaElementType.PARAMETER_TYPE, parameterType);
    }

    target.append(JavaElementType.PARAMETER_END);
  }
}
