package com.rcarballo.rickandmortyapp.databinding;
import com.rcarballo.rickandmortyapp.R;
import com.rcarballo.rickandmortyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemListContentBindingImpl extends ItemListContentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.separatorTextView, 7);
        sViewsWithIds.put(R.id.lastLocationTextView, 8);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemListContentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ItemListContentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.card.MaterialCardView) bindings[0]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[3]
            );
        this.cardViewList.setTag(null);
        this.locationTextView.setTag(null);
        this.nameTextView.setTag(null);
        this.rickAndMortyImage.setTag(null);
        this.speciesTextView.setTag(null);
        this.statusImage.setTag(null);
        this.statusTextView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.property == variableId) {
            setProperty((com.rcarballo.rickandmortyapp.Personaje) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProperty(@Nullable com.rcarballo.rickandmortyapp.Personaje Property) {
        this.mProperty = Property;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.property);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String propertyLocationName = null;
        com.rcarballo.rickandmortyapp.Personaje property = mProperty;
        com.rcarballo.rickandmortyapp.Data propertyLocation = null;
        java.lang.String propertyStatus = null;
        java.lang.String propertySpecies = null;
        java.lang.String propertyImage = null;
        java.lang.String propertyName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (property != null) {
                    // read property.location
                    propertyLocation = property.getLocation();
                    // read property.status
                    propertyStatus = property.getStatus();
                    // read property.species
                    propertySpecies = property.getSpecies();
                    // read property.image
                    propertyImage = property.getImage();
                    // read property.name
                    propertyName = property.getName();
                }


                if (propertyLocation != null) {
                    // read property.location.name
                    propertyLocationName = propertyLocation.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.locationTextView, propertyLocationName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nameTextView, propertyName);
            com.rcarballo.rickandmortyapp.BindingAdaptersKt.bindImage(this.rickAndMortyImage, propertyImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.speciesTextView, propertySpecies);
            com.rcarballo.rickandmortyapp.BindingAdaptersKt.bindName(this.statusImage, propertyStatus);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusTextView, propertyStatus);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): property
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}