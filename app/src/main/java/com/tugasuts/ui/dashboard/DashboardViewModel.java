package com.tugasuts.ui.dashboard;

//10120073
//Anugrah Dwi
//IF2


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private final MutableLiveData<String> namaLiveData;
    private final MutableLiveData<String> nimLiveData;
    private final MutableLiveData<String> kelasLiveData;
    private final MutableLiveData<String> emailLiveData;

    public DashboardViewModel() {
        namaLiveData = new MutableLiveData<>();
        nimLiveData = new MutableLiveData<>();
        kelasLiveData = new MutableLiveData<>();
        emailLiveData = new MutableLiveData<>();

        // Set nilai awal jika diperlukan
        namaLiveData.setValue("Anugrah Dwi");
        nimLiveData.setValue("10120073");
        kelasLiveData.setValue("IF2");
        emailLiveData.setValue("anugrah.10120073@mahasiswa.unikom.ac.id");
    }

    public LiveData<String> getNama() {
        return namaLiveData;
    }

    public LiveData<String> getNim() {
        return nimLiveData;
    }

    public LiveData<String> getKelas() {
        return kelasLiveData;
    }

    public LiveData<String> getEmail() {
        return emailLiveData;
    }

    public void setNama(String nama) {
        namaLiveData.setValue(nama);
    }

    public void setNim(String nim) {
        nimLiveData.setValue(nim);
    }

    public void setKelas(String kelas) {
        kelasLiveData.setValue(kelas);
    }

    public void setEmail(String email) {
        emailLiveData.setValue(email); }
}