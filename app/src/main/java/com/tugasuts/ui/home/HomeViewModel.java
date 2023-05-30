package com.tugasuts.ui.home;

//10120073
//Anugrah Dwi
//IF2


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText; }

    public LiveData<Object> getNama() {
        return null;
    }

    public LiveData<Object> getNim() {
        return null;
    }

    public LiveData<Object> getKelas() {
        return null;
    }

    public LiveData<Object> getEmail() {
        return null;
    }
}