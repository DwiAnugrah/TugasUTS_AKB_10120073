package com.tugasuts.ui.dashboard;

//10120073
//Anugrah Dwi
//IF2

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.tugasuts.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel;
        dashboardViewModel = new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView namaTextView = binding.nama;
        final TextView nimTextView = binding.nim;
        final TextView kelasTextView = binding.kelas;
        final TextView emailTextView = binding.email;
        dashboardViewModel.getNama().observe(getViewLifecycleOwner(), nama -> namaTextView.setText("" + nama));
        dashboardViewModel.getNim().observe(getViewLifecycleOwner(), nim -> nimTextView.setText("Nim: " + nim));
        dashboardViewModel.getKelas().observe(getViewLifecycleOwner(), kelas -> kelasTextView.setText("Kelas: " + kelas));
        dashboardViewModel.getEmail().observe(getViewLifecycleOwner(), email -> emailTextView.setText("Email: " + email));
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null; }
}