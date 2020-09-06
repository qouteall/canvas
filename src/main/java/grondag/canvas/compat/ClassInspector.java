/*
 * Copyright 2019, 2020 grondag
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package grondag.canvas.compat;

import grondag.canvas.CanvasMod;
import net.minecraft.client.render.WorldRenderer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInspector {
	public static void inspect() {
		final Class<WorldRenderer> clazz = WorldRenderer.class;

		CanvasMod.LOG.info("");
		CanvasMod.LOG.info("WorldRenderer Class Summary - For Developer Use");
		CanvasMod.LOG.info("=============================================");
		CanvasMod.LOG.info("");
		CanvasMod.LOG.info("FIELDS");

		for (final Field f : clazz.getDeclaredFields()) {
			CanvasMod.LOG.info(f.toGenericString());
		}

		CanvasMod.LOG.info("");
		CanvasMod.LOG.info("METHODS");

		for (final Method m : clazz.getDeclaredMethods()) {
			CanvasMod.LOG.info(m.toGenericString());
		}

		CanvasMod.LOG.info("");
	}
}