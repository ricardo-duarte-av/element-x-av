/*
 * Copyright (c) 2023 New Vector Ltd
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

package io.element.android.features.messages.textcomposer

import androidx.compose.runtime.Composable
import io.element.android.features.messages.impl.messagecomposer.RichTextEditorStateFactory
import io.element.android.wysiwyg.compose.RichTextEditorState
import io.element.android.wysiwyg.compose.rememberRichTextEditorState

class TestRichTextEditorStateFactory : RichTextEditorStateFactory {
    @Composable
    override fun create(): RichTextEditorState {
        return rememberRichTextEditorState("", fake = true)
    }
}