/* *****************************************************************************
 * Copyright (c) 2017 Evernote Corporation.
 * This software was generated by Evernote’s Android-State code generator
 * (available at https://github.com/evernote/android-state), which is made
 * available under the terms of the Eclipse Public License v1.0
 * (available at http://www.eclipse.org/legal/epl-v10.html).
 * For clarification, code generated by the Android-State code generator is
 * not subject to the Eclipse Public License and can be used subject to the
 * following terms:
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *******************************************************************************/
package org.inaturalist.android;

import android.os.Bundle;
import com.evernote.android.state.Bundler;
import com.evernote.android.state.InjectionHelper;
import com.evernote.android.state.Injector;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MessagesActivity$$StateSaver<T extends MessagesActivity> extends Injector.Object<T> {
  private static final HashMap<String, Bundler<?>> BUNDLERS = new HashMap<String, Bundler<?>>();

  private static final InjectionHelper HELPER = new InjectionHelper("org.inaturalist.android.MessagesActivity$$StateSaver", BUNDLERS);

  static {
    BUNDLERS.put("mMessages", new AndroidStateBundlers.JSONListBundler());
  }

  @Override
  @SuppressWarnings("unchecked")
  public void save(T target, Bundle state) {
    HELPER.putString(state, "mCurrentSearchString", target.mCurrentSearchString);
    HELPER.putInt(state, "mLastMessageViewedPosition", target.mLastMessageViewedPosition);
    HELPER.putWithBundler(state, "mMessages", target.mMessages);
    HELPER.putLong(state, "mStartTime", target.mStartTime);
  }

  @Override
  @SuppressWarnings("unchecked")
  public void restore(T target, Bundle state) {
    target.mCurrentSearchString = HELPER.getString(state, "mCurrentSearchString");
    target.mLastMessageViewedPosition = HELPER.getInt(state, "mLastMessageViewedPosition");
    target.mMessages = HELPER.getWithBundler(state, "mMessages");
    target.mStartTime = HELPER.getLong(state, "mStartTime");
  }
}