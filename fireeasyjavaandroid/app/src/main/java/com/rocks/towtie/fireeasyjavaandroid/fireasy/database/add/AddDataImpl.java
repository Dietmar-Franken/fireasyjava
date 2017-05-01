package com.rocks.towtie.fireeasyjavaandroid.fireasy.database.add;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by cody.towstik.
 */

public class AddDataImpl implements AddData {

    // TODO: Create a factory instead of constructors to make this more dynamic.

    /**
     *  Method to add data to your database in a specific place.
     *
     * @param dRef database reference.
     * @param parent node to put data under.
     * @param newChild new data to overwrite.
     */
    @Override
    public void addData( DatabaseReference dRef, String parent, String newChild ) {
        dRef = FirebaseDatabase.getInstance().getReference();

        dRef.child(parent).setValue(newChild);
    }

    /**
     *  Mathod to update data in database. Map should already contain the data to be inserted,
     *
     * @param dRef database reference.
     * @param parent node to put data under.
     * @param addData new data to insert.
     */

    @Override
    public void updateData( DatabaseReference dRef, String parent, Map<String,Object> addData ) {
        dRef = FirebaseDatabase.getInstance().getReference();

        dRef.child(parent).updateChildren(addData);
    }
}
