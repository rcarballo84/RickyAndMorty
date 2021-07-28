package com.rcarballo.rickandmortyapp;

import java.lang.System;

/**
 * Created by @kulnois on 29/08/2020.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0013\u0014\u0015B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/rcarballo/rickandmortyapp/RickAndMortyAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/rcarballo/rickandmortyapp/Personaje;", "Lcom/rcarballo/rickandmortyapp/RickAndMortyAdapter$RickAndMortyViewHolder;", "onClickListener", "Lcom/rcarballo/rickandmortyapp/RickAndMortyAdapter$OnClickListener;", "(Lcom/rcarballo/rickandmortyapp/RickAndMortyAdapter$OnClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "list", "", "DiffCallback", "OnClickListener", "RickAndMortyViewHolder", "app_debug"})
public final class RickAndMortyAdapter extends androidx.recyclerview.widget.ListAdapter<com.rcarballo.rickandmortyapp.Personaje, com.rcarballo.rickandmortyapp.RickAndMortyAdapter.RickAndMortyViewHolder> {
    private final com.rcarballo.rickandmortyapp.RickAndMortyAdapter.OnClickListener onClickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.rcarballo.rickandmortyapp.RickAndMortyAdapter.DiffCallback DiffCallback = null;
    
    public RickAndMortyAdapter(@org.jetbrains.annotations.NotNull()
    com.rcarballo.rickandmortyapp.RickAndMortyAdapter.OnClickListener onClickListener) {
        super(null);
    }
    
    @java.lang.Override()
    public void submitList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.rcarballo.rickandmortyapp.Personaje> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.rcarballo.rickandmortyapp.RickAndMortyAdapter.RickAndMortyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.rcarballo.rickandmortyapp.RickAndMortyAdapter.RickAndMortyViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/rcarballo/rickandmortyapp/RickAndMortyAdapter$RickAndMortyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/rcarballo/rickandmortyapp/databinding/ItemListContentBinding;", "(Lcom/rcarballo/rickandmortyapp/databinding/ItemListContentBinding;)V", "bind", "", "rickAndMorty", "Lcom/rcarballo/rickandmortyapp/Personaje;", "app_debug"})
    public static final class RickAndMortyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.rcarballo.rickandmortyapp.databinding.ItemListContentBinding binding;
        
        public RickAndMortyViewHolder(@org.jetbrains.annotations.NotNull()
        com.rcarballo.rickandmortyapp.databinding.ItemListContentBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.rcarballo.rickandmortyapp.Personaje rickAndMorty) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004R,\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/rcarballo/rickandmortyapp/RickAndMortyAdapter$OnClickListener;", "", "clickListener", "Lkotlin/Function1;", "Lcom/rcarballo/rickandmortyapp/Personaje;", "Lkotlin/ParameterName;", "name", "rickAndMorty", "", "(Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "onClick", "app_debug"})
    public static final class OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<com.rcarballo.rickandmortyapp.Personaje, kotlin.Unit> clickListener = null;
        
        public OnClickListener(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.rcarballo.rickandmortyapp.Personaje, kotlin.Unit> clickListener) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<com.rcarballo.rickandmortyapp.Personaje, kotlin.Unit> getClickListener() {
            return null;
        }
        
        public final void onClick(@org.jetbrains.annotations.NotNull()
        com.rcarballo.rickandmortyapp.Personaje rickAndMorty) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/rcarballo/rickandmortyapp/RickAndMortyAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/rcarballo/rickandmortyapp/Personaje;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.rcarballo.rickandmortyapp.Personaje> {
        
        private DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.rcarballo.rickandmortyapp.Personaje oldItem, @org.jetbrains.annotations.NotNull()
        com.rcarballo.rickandmortyapp.Personaje newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.rcarballo.rickandmortyapp.Personaje oldItem, @org.jetbrains.annotations.NotNull()
        com.rcarballo.rickandmortyapp.Personaje newItem) {
            return false;
        }
    }
}