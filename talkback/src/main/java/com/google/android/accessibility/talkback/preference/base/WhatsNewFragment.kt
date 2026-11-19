/*
 * Copyright 2026 Nika contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.android.accessibility.talkback.preference.base

import com.google.android.accessibility.talkback.R

/** Shows what is new in this version of Nika. The text is in the strings whats_new_*. */
class WhatsNewFragment : TalkbackBaseFragment(R.xml.whats_new_preferences) {
  override fun getTitle(): CharSequence = getText(R.string.title_pref_whats_new)
}
