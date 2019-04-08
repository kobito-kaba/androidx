/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.ui.material.surface

import androidx.ui.material.borders.RoundedRectangleBorder
import androidx.ui.material.borders.ShapeBorder
import androidx.ui.material.ripple.RippleEffect
import androidx.ui.painting.Color
import com.google.r4a.Children
import com.google.r4a.Composable
import com.google.r4a.composer

/**
 * A transparent [Surface] that draws [RippleEffect]s.
 *
 * While the material surface metaphor describes child widgets as printed on the
 * surface itself and do not hide [RippleEffect]s, in practice the [Surface]
 * draws children on top of the [RippleEffect].
 * A [TransparentSurface] can be placed on top of opaque components to show
 * [RippleEffect] effects on top of them.
 *
 * @param shape Defines the surface's shape.
 */
@Composable
fun TransparentSurface(
    shape: ShapeBorder = RoundedRectangleBorder(),
    @Children children: () -> Unit
) {
    <Surface shape children color=Color.Transparent />
}
