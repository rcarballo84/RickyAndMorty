package com.rcarballo.rickandmortyapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007\u001a,\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000eH\u0007\u001a\u001a\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0014H\u0007\u001a\u001a\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\u0014H\u0007\u00a8\u0006\u0018"}, d2 = {"bindImage", "", "imgView", "Landroid/widget/ImageView;", "imgUrl", "", "bindName", "status", "bindRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "data", "Ljava/util/ArrayList;", "Lcom/rcarballo/rickandmortyapp/Personaje;", "Lkotlin/collections/ArrayList;", "bindRelativeLayoutStatus", "relativeLayout", "Landroid/widget/RelativeLayout;", "bindStatus", "statusImageView", "Lcom/rcarballo/rickandmortyapp/util/RickAndMortyStatus;", "bindStatusProgress", "contentLoadingProgressBar", "Landroidx/core/widget/ContentLoadingProgressBar;", "app_debug"})
public final class BindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"listData"})
    public static final void bindRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.rcarballo.rickandmortyapp.Personaje> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void bindImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imgView, @org.jetbrains.annotations.Nullable()
    java.lang.String imgUrl) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"status"})
    public static final void bindName(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imgView, @org.jetbrains.annotations.Nullable()
    java.lang.String status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"rickAndMortyApiStatus"})
    public static final void bindStatus(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView statusImageView, @org.jetbrains.annotations.Nullable()
    com.rcarballo.rickandmortyapp.util.RickAndMortyStatus status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"relativeLayoutStatus"})
    public static final void bindRelativeLayoutStatus(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout relativeLayout, @org.jetbrains.annotations.Nullable()
    java.lang.String status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"rickAndMortyApiStatusProgress"})
    public static final void bindStatusProgress(@org.jetbrains.annotations.NotNull()
    androidx.core.widget.ContentLoadingProgressBar contentLoadingProgressBar, @org.jetbrains.annotations.Nullable()
    com.rcarballo.rickandmortyapp.util.RickAndMortyStatus status) {
    }
}