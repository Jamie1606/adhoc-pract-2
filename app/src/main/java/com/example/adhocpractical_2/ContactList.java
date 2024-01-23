package com.example.adhocpractical_2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;

public class ContactList extends ListFragment {
    String[] contactlist = new String[]{"JOHN", "ANN", "KEN", "MARY", "PETER", "JANE"};
    String[] email = new String[]{"john@sp.com", "ann@sp.com", "ken@sp.com", "mary@sp.com", "peter@sp.com", "jane@sp.com"};
    String[] address = new String[]{"500 Dover Road", "15 Clementi North", "300 Clementi Road", "Something", "Pasir Ris Drive 3", "9 Yishun Ring Road"};
    String[] phone = new String[]{"98232984", "82345678", "95384958", "54984365", "23456475", "98765000"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_contactlist, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, contactlist);
        setListAdapter(adapter);
        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        ContactDetailList cdl = (ContactDetailList) getFragmentManager().findFragmentById(R.id.fragment_contactdetaillist);
        cdl.change(contactlist[position], email[position], phone[position], address[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }

}