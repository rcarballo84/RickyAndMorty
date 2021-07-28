package com.rcarballo.rickandmortyapp;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u000b\u0010\n\u001a\u00070\u000b\u00a2\u0006\u0002\b\f\u0012\u000b\u0010\r\u001a\u00070\u000b\u00a2\u0006\u0002\b\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0010j\b\u0012\u0004\u0012\u00020\u0005`\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003H\u00d6\u0001R!\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0010j\b\u0012\u0004\u0012\u00020\u0005`\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\r\u001a\u00070\u000b\u00a2\u0006\u0002\b\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\n\u001a\u00070\u000b\u00a2\u0006\u0002\b\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016\u00a8\u0006\'"}, d2 = {"Lcom/rcarballo/rickandmortyapp/Personaje;", "Landroid/os/Parcelable;", "id", "", "name", "", "status", "species", "type", "gender", "origin", "Lcom/rcarballo/rickandmortyapp/Data;", "Lkotlinx/parcelize/RawValue;", "location", "image", "episode", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/rcarballo/rickandmortyapp/Data;Lcom/rcarballo/rickandmortyapp/Data;Ljava/lang/String;Ljava/util/ArrayList;)V", "getEpisode", "()Ljava/util/ArrayList;", "getGender", "()Ljava/lang/String;", "getId", "()I", "getImage", "getLocation", "()Lcom/rcarballo/rickandmortyapp/Data;", "getName", "getOrigin", "getSpecies", "getStatus", "getType", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class Personaje implements android.os.Parcelable {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String species = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String gender = null;
    @org.jetbrains.annotations.NotNull()
    private final com.rcarballo.rickandmortyapp.Data origin = null;
    @org.jetbrains.annotations.NotNull()
    private final com.rcarballo.rickandmortyapp.Data location = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String image = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.String> episode = null;
    public static final android.os.Parcelable.Creator<com.rcarballo.rickandmortyapp.Personaje> CREATOR = null;
    
    public Personaje(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String species, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String gender, @org.jetbrains.annotations.NotNull()
    com.rcarballo.rickandmortyapp.Data origin, @org.jetbrains.annotations.NotNull()
    com.rcarballo.rickandmortyapp.Data location, @org.jetbrains.annotations.NotNull()
    java.lang.String image, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> episode) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSpecies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rcarballo.rickandmortyapp.Data getOrigin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rcarballo.rickandmortyapp.Data getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getEpisode() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.rcarballo.rickandmortyapp.Personaje> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.rcarballo.rickandmortyapp.Personaje createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.rcarballo.rickandmortyapp.Personaje[] newArray(int size) {
            return null;
        }
    }
}