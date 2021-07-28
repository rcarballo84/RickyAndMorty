package com.rcarballo.rickandmortyapp.ui;

import java.lang.System;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a [ItemListFragment]
 * in two-pane mode (on larger screen devices) or self-contained
 * on handsets.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/rcarballo/rickandmortyapp/ui/ItemDetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/rcarballo/rickandmortyapp/databinding/FragmentItemDetailBinding;", "application", "Landroid/app/Application;", "binding", "getBinding", "()Lcom/rcarballo/rickandmortyapp/databinding/FragmentItemDetailBinding;", "itemDetailTextView", "Landroid/widget/TextView;", "getItemDetailTextView", "()Landroid/widget/TextView;", "setItemDetailTextView", "(Landroid/widget/TextView;)V", "initUI", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "Companion", "app_debug"})
public final class ItemDetailFragment extends androidx.fragment.app.Fragment {
    
    /**
     * The placeholder content this fragment is presenting.
     */
    public android.widget.TextView itemDetailTextView;
    private com.rcarballo.rickandmortyapp.databinding.FragmentItemDetailBinding _binding;
    private android.app.Application application;
    @org.jetbrains.annotations.NotNull()
    public static final com.rcarballo.rickandmortyapp.ui.ItemDetailFragment.Companion Companion = null;
    
    /**
     * The fragment argument representing the item ID that this fragment represents.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_ITEM_ID = "item_id";
    
    public ItemDetailFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getItemDetailTextView() {
        return null;
    }
    
    public final void setItemDetailTextView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    private final com.rcarballo.rickandmortyapp.databinding.FragmentItemDetailBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initUI() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/rcarballo/rickandmortyapp/ui/ItemDetailFragment$Companion;", "", "()V", "ARG_ITEM_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}