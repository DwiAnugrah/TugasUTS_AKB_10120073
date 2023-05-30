package com.tugasuts.ui.home;

//10120073
//Anugrah Dwi
//IF2


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;

import com.tugasuts.R;
import com.tugasuts.VPAdpater;
import com.tugasuts.ViewPagerItem;
import com.tugasuts.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    ViewPager2 viewPager2;
    ArrayList<ViewPagerItem> viewPagerItemArrayList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewPager2 = view.findViewById(R.id.viewPager);
        int[] images = {R.drawable.i1, R.drawable.i2, R.drawable.i3};
        String[] heading = {"Informasi", "Informasi", "Informasi"};
        String[] desc = {getString(R.string.i1_desc), getString(R.string.i2_desc), getString(R.string.i3_desc)};

        viewPagerItemArrayList = new ArrayList<>();

        for (int i = 0; i < images.length; i++) {
            ViewPagerItem viewPagerItem = new ViewPagerItem(images[i], heading[i], desc[i]);
            viewPagerItemArrayList.add(viewPagerItem);
        }

        VPAdpater vpAdpater = new VPAdpater(viewPagerItemArrayList);

        viewPager2.setAdapter(vpAdpater);

        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}