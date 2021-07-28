package com.rcarballo.rickandmortyapp.databinding;
import com.rcarballo.rickandmortyapp.R;
import com.rcarballo.rickandmortyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentItemDetailBindingImpl extends FragmentItemDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.item_detail_nav_container, 12);
        sViewsWithIds.put(R.id.card_view_list, 13);
        sViewsWithIds.put(R.id.separatorTextView, 14);
        sViewsWithIds.put(R.id.lastLocationTextView, 15);
        sViewsWithIds.put(R.id.firstSeenTextView, 16);
        sViewsWithIds.put(R.id.genderTextView, 17);
        sViewsWithIds.put(R.id.typeTextView, 18);
        sViewsWithIds.put(R.id.numberEpisodeTextView, 19);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentItemDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentItemDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[13]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.core.widget.NestedScrollView) bindings[0]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[14]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[18]
            );
        this.accountEpisodeTextView.setTag(null);
        this.itemDetailScrollView.setTag(null);
        this.locationTextView.setTag(null);
        this.maleTextView.setTag(null);
        this.nameTextView.setTag(null);
        this.originTextView.setTag(null);
        this.roundedImage.setTag(null);
        this.shapeLayout.setTag(null);
        this.speciesTextView.setTag(null);
        this.statusImage.setTag(null);
        this.statusTextView.setTag(null);
        this.typeRickTextView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setViewModel((com.rcarballo.rickandmortyapp.ui.DetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.rcarballo.rickandmortyapp.ui.DetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSelectedItem((androidx.lifecycle.LiveData<com.rcarballo.rickandmortyapp.Personaje>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSelectedItem(androidx.lifecycle.LiveData<com.rcarballo.rickandmortyapp.Personaje> ViewModelSelectedItem, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        int viewModelSelectedItemEpisodeSize = 0;
        java.lang.String viewModelSelectedItemStatus = null;
        java.lang.String integerToStringViewModelSelectedItemEpisodeSize = null;
        com.rcarballo.rickandmortyapp.Personaje viewModelSelectedItemGetValue = null;
        java.lang.String viewModelSelectedItemSpecies = null;
        java.lang.String viewModelSelectedItemImage = null;
        java.util.ArrayList<java.lang.String> viewModelSelectedItemEpisode = null;
        com.rcarballo.rickandmortyapp.Data viewModelSelectedItemOrigin = null;
        androidx.lifecycle.LiveData<com.rcarballo.rickandmortyapp.Personaje> viewModelSelectedItem = null;
        java.lang.String viewModelSelectedItemName = null;
        java.lang.String viewModelSelectedItemGender = null;
        com.rcarballo.rickandmortyapp.ui.DetailViewModel viewModel = mViewModel;
        java.lang.String viewModelSelectedItemType = null;
        java.lang.String viewModelSelectedItemOriginName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.selectedItem
                    viewModelSelectedItem = viewModel.getSelectedItem();
                }
                updateLiveDataRegistration(0, viewModelSelectedItem);


                if (viewModelSelectedItem != null) {
                    // read viewModel.selectedItem.getValue()
                    viewModelSelectedItemGetValue = viewModelSelectedItem.getValue();
                }


                if (viewModelSelectedItemGetValue != null) {
                    // read viewModel.selectedItem.getValue().status
                    viewModelSelectedItemStatus = viewModelSelectedItemGetValue.getStatus();
                    // read viewModel.selectedItem.getValue().species
                    viewModelSelectedItemSpecies = viewModelSelectedItemGetValue.getSpecies();
                    // read viewModel.selectedItem.getValue().image
                    viewModelSelectedItemImage = viewModelSelectedItemGetValue.getImage();
                    // read viewModel.selectedItem.getValue().episode
                    viewModelSelectedItemEpisode = viewModelSelectedItemGetValue.getEpisode();
                    // read viewModel.selectedItem.getValue().origin
                    viewModelSelectedItemOrigin = viewModelSelectedItemGetValue.getOrigin();
                    // read viewModel.selectedItem.getValue().name
                    viewModelSelectedItemName = viewModelSelectedItemGetValue.getName();
                    // read viewModel.selectedItem.getValue().gender
                    viewModelSelectedItemGender = viewModelSelectedItemGetValue.getGender();
                    // read viewModel.selectedItem.getValue().type
                    viewModelSelectedItemType = viewModelSelectedItemGetValue.getType();
                }


                if (viewModelSelectedItemEpisode != null) {
                    // read viewModel.selectedItem.getValue().episode.size()
                    viewModelSelectedItemEpisodeSize = viewModelSelectedItemEpisode.size();
                }
                if (viewModelSelectedItemOrigin != null) {
                    // read viewModel.selectedItem.getValue().origin.name
                    viewModelSelectedItemOriginName = viewModelSelectedItemOrigin.getName();
                }


                // read Integer.toString(viewModel.selectedItem.getValue().episode.size())
                integerToStringViewModelSelectedItemEpisodeSize = java.lang.Integer.toString(viewModelSelectedItemEpisodeSize);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.accountEpisodeTextView, integerToStringViewModelSelectedItemEpisodeSize);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.locationTextView, viewModelSelectedItemName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.maleTextView, viewModelSelectedItemGender);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nameTextView, viewModelSelectedItemName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.originTextView, viewModelSelectedItemOriginName);
            com.rcarballo.rickandmortyapp.BindingAdaptersKt.bindImage(this.roundedImage, viewModelSelectedItemImage);
            com.rcarballo.rickandmortyapp.BindingAdaptersKt.bindRelativeLayoutStatus(this.shapeLayout, viewModelSelectedItemStatus);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.speciesTextView, viewModelSelectedItemSpecies);
            com.rcarballo.rickandmortyapp.BindingAdaptersKt.bindName(this.statusImage, viewModelSelectedItemStatus);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusTextView, viewModelSelectedItemStatus);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.typeRickTextView, viewModelSelectedItemType);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.selectedItem
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}