package com.rcarballo.rickandmortyapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0005J\u0006\u0010!\u001a\u00020\u001fJ\u0019\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0010\u0010\u0019\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020\u001fH\u0014J\u000e\u0010\'\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\'\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\u00180\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/rcarballo/rickandmortyapp/ListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_navigateToSelectedProperty", "Landroidx/lifecycle/MutableLiveData;", "Lcom/rcarballo/rickandmortyapp/Personaje;", "_rickAndMortyData", "Ljava/util/ArrayList;", "_status", "Lcom/rcarballo/rickandmortyapp/util/RickAndMortyStatus;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dataAllList", "getDataAllList", "()Ljava/util/ArrayList;", "loadPage", "", "getLoadPage", "()Landroidx/lifecycle/MutableLiveData;", "navigateToSelectedProperty", "Landroidx/lifecycle/LiveData;", "getNavigateToSelectedProperty", "()Landroidx/lifecycle/LiveData;", "rickAndMortyData", "Lkotlin/collections/ArrayList;", "getRickAndMortyData", "status", "getStatus", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "displayPropertyDetails", "", "personaje", "displayPropertyDetailsComplete", "getData", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "updatePage", "app_debug"})
public final class ListViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.rcarballo.rickandmortyapp.util.RickAndMortyStatus> _status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.rcarballo.rickandmortyapp.Personaje> dataAllList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadPage = null;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.rcarballo.rickandmortyapp.Personaje>> _rickAndMortyData = null;
    private final androidx.lifecycle.MutableLiveData<com.rcarballo.rickandmortyapp.Personaje> _navigateToSelectedProperty = null;
    private kotlinx.coroutines.CompletableJob viewModelJob;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    
    public ListViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.rcarballo.rickandmortyapp.util.RickAndMortyStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.rcarballo.rickandmortyapp.Personaje> getDataAllList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.rcarballo.rickandmortyapp.Personaje>> getRickAndMortyData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.rcarballo.rickandmortyapp.Personaje> getNavigateToSelectedProperty() {
        return null;
    }
    
    private final void getRickAndMortyData(int page) {
    }
    
    private final java.lang.Object getData(int page, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void displayPropertyDetails(@org.jetbrains.annotations.NotNull()
    com.rcarballo.rickandmortyapp.Personaje personaje) {
    }
    
    public final void displayPropertyDetailsComplete() {
    }
    
    public final void updatePage(int page) {
    }
}