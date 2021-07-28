package com.rcarballo.rickandmortyapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.rcarballo.rickandmortyapp.databinding.FragmentItemDetailBindingImpl;
import com.rcarballo.rickandmortyapp.databinding.FragmentItemListBindingImpl;
import com.rcarballo.rickandmortyapp.databinding.FragmentItemListBindingSw600dpImpl;
import com.rcarballo.rickandmortyapp.databinding.ItemListContentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTITEMDETAIL = 1;

  private static final int LAYOUT_FRAGMENTITEMLIST = 2;

  private static final int LAYOUT_ITEMLISTCONTENT = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rcarballo.rickandmortyapp.R.layout.fragment_item_detail, LAYOUT_FRAGMENTITEMDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rcarballo.rickandmortyapp.R.layout.fragment_item_list, LAYOUT_FRAGMENTITEMLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rcarballo.rickandmortyapp.R.layout.item_list_content, LAYOUT_ITEMLISTCONTENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTITEMDETAIL: {
          if ("layout/fragment_item_detail_0".equals(tag)) {
            return new FragmentItemDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_item_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTITEMLIST: {
          if ("layout/fragment_item_list_0".equals(tag)) {
            return new FragmentItemListBindingImpl(component, view);
          }
          if ("layout-sw600dp/fragment_item_list_0".equals(tag)) {
            return new FragmentItemListBindingSw600dpImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_item_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLISTCONTENT: {
          if ("layout/item_list_content_0".equals(tag)) {
            return new ItemListContentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_list_content is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "property");
      sKeys.put(2, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/fragment_item_detail_0", com.rcarballo.rickandmortyapp.R.layout.fragment_item_detail);
      sKeys.put("layout/fragment_item_list_0", com.rcarballo.rickandmortyapp.R.layout.fragment_item_list);
      sKeys.put("layout-sw600dp/fragment_item_list_0", com.rcarballo.rickandmortyapp.R.layout.fragment_item_list);
      sKeys.put("layout/item_list_content_0", com.rcarballo.rickandmortyapp.R.layout.item_list_content);
    }
  }
}
