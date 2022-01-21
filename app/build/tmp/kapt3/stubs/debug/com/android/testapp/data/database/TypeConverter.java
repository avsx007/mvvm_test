package com.android.testapp.data.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/android/testapp/data/database/TypeConverter;", "", "()V", "GsonToImageList", "", "", "data", "ImageListToString", "someObjects", "app_debug"})
public final class TypeConverter {
    @org.jetbrains.annotations.NotNull()
    public static final com.android.testapp.data.database.TypeConverter INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public static final java.util.List<java.lang.String> GsonToImageList(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public static final java.lang.String ImageListToString(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> someObjects) {
        return null;
    }
    
    private TypeConverter() {
        super();
    }
}