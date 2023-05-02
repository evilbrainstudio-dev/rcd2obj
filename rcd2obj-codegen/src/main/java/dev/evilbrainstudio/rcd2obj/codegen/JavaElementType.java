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

package dev.evilbrainstudio.rcd2obj.codegen;

/**
 * Type of the Java element. Contains definition of keywords and some special symbols.
 *
 * @author Andrey_Yurzanov
 * @since 1.0
 */
public enum JavaElementType {
  /**
   * The keyword of the Java package.
   */
  PACKAGE_BEGIN("package"),
  /**
   * The name of the package.
   */
  PACKAGE_NAME,
  /**
   * The end of the package definition.
   */
  PACKAGE_END(";");

  private final String value;

  JavaElementType() {
    this("");
  }

  JavaElementType(String value) {
    this.value = value;
  }
}
