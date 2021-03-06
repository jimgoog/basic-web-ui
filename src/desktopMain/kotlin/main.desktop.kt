/*
 * Copyright 2020-2021 JetBrains s.r.o. and respective authors and developers.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE.txt file.
 */

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import demo.ApplicationTitle
import demo.SimpleUi


@OptIn(ExperimentalComposeUiApi::class)
fun main() =
    singleWindowApplication(
        title = ApplicationTitle,
        state = WindowState(size = DpSize(800.dp, 800.dp))
    ) {
        SimpleUi()
    }
