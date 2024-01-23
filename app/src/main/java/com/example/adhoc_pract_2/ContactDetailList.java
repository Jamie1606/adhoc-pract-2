package com.example.adhoc_pract_2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ContactDetailList extends Fragment {
    TextView txtName, txtEmail, txtPhone, txtAddress;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_contactdetaillist, container, false);
        txtName = (TextView)view.findViewById(R.id.name);
        txtEmail = (TextView)view.findViewById(R.id.email);
        txtPhone = (TextView)view.findViewById(R.id.phone);
        txtAddress = (TextView)view.findViewById(R.id.address);
        return view;
    }
    public void change(String name, String email, String phone, String address){
        txtName.setText(name);
        txtEmail.setText(email);
        txtPhone.setText(phone);
        txtAddress.setText(address);
    }

}
