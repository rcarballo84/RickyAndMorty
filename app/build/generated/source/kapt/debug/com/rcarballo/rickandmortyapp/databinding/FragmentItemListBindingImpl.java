package com.rcarballo.rickandmortyapp.databinding;
import com.rcarballo.rickandmortyapp.R;
import com.rcarballo.rickandmortyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentItemListBindingImpl extends FragmentItemListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentItemListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentItemListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , null
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[3]
            , (androidx.core.widget.ContentLoadingProgressBar) bindings[2]
            );
        this.itemList.setTag(null);
        this.itemListContainer.setTag(null);
        this.loadingImage.setTag(null);
        this.loadingProgressBar.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.rcarballo.rickandmortyapp.ListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.rcarballo.rickandmortyapp.ListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelRickAndMortyData((androidx.lifecycle.LiveData<java.util.ArrayList<com.rcarballo.rickandmortyapp.Personaje>>) object, fieldId);
            case 1 :
                return onChangeViewModelStatus((androidx.lifecycle.LiveData<com.rcarballo.rickandmortyapp.util.RickAndMortyStatus>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelRickAndMortyData(androidx.lifecycle.LiveData<java.util.ArrayList<com.rcarballo.rickandmortyapp.Personaje>> ViewModelRickAndMortyData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelStatus(androidx.lifecycle.LiveData<com.rcarballo.rickandmortyapp.util.RickAndMortyStatus> ViewModelStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<java.util.ArrayList<com.rcarballo.rickandmortyapp.Personaje>> viewModelRickAndMortyData = null;
        java.util.ArrayList<com.rcarballo.rickandmortyapp.Personaje> viewModelRickAndMortyDataGetValue = null;
        androidx.lifecycle.LiveData<com.rcarballo.rickandmortyapp.util.RickAndMortyStatus> viewModelStatus = null;
        com.rcarballo.rickandmortyapp.util.RickAndMortyStatus viewModelStatusGetValue = null;
        com.rcarballo.rickandmortyapp.ListViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.rickAndMortyData
                        viewModelRickAndMortyData = viewModel.getRickAndMortyData();
                    }
                    updateLiveDataRegistration(0, viewModelRickAndMortyData);


                    if (viewModelRickAndMortyData != null) {
                        // read viewModel.rickAndMortyData.getValue()
                        viewModelRickAndMortyDataGetValue = viewModelRickAndMortyData.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.status
                        viewModelStatus = viewModel.getStatus();
                    }
                    updateLiveDataRegistration(1, viewModelStatus);


                    if (viewModelStatus != null) {
                        // read viewModel.status.getValue()
                        viewModelStatusGetValue = viewModelStatus.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.rcarballo.rickandmortyapp.BindingAdaptersKt.bindRecyclerView(this.itemList, viewModelRickAndMortyDataGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.rcarballo.rickandmortyapp.BindingAdaptersKt.bindStatus(this.loadingImage, viewModelStatusGetValue);
            com.rcarballo.rickandmortyapp.BindingAdaptersKt.bindStatusProgress(this.loadingProgressBar, viewModelStatusGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.rickAndMortyData
        flag 1 (0x2L): viewModel.status
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}