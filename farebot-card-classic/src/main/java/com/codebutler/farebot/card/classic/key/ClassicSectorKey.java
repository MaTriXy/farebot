/*
 * ClassicSectorKey.java
 *
 * This file is part of FareBot.
 * Learn more at: https://codebutler.github.io/farebot/
 *
 * Copyright (C) 2012, 2014, 2016 Eric Butler <eric@codebutler.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.codebutler.farebot.card.classic.key;

import android.support.annotation.NonNull;

import com.codebutler.farebot.base.util.ByteArray;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue
public abstract class ClassicSectorKey {

    @NonNull
    public static ClassicSectorKey create(@NonNull byte[] keyA, @NonNull byte[] keyB) {
        return new AutoValue_ClassicSectorKey(ByteArray.create(keyA), ByteArray.create(keyB));
    }

    @NonNull
    public static TypeAdapter<ClassicSectorKey> typeAdapter(@NonNull Gson gson) {
        return new AutoValue_ClassicSectorKey.GsonTypeAdapter(gson);
    }

    @NonNull
    public abstract ByteArray getKeyA();

    @NonNull
    public abstract ByteArray getKeyB();
}
