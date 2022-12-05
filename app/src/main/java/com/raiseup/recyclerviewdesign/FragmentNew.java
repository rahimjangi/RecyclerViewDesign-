package com.raiseup.recyclerviewdesign;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentNew extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("fragment","fragment -> onCreateView");
        return inflater.inflate(R.layout.fragment_new,container,false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("fragment","fragment -> onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("fragment","fragment -> onCreate");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i("fragment","fragment - > onViewCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("fragment","fragment - > onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("fragment","fragment - > onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("fragment","fragment - > onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("fragment","fragment - > onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("fragment","fragment - > onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("fragment","fragment - > onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("fragment","fragment - > onDetach");
    }
}
