package com.rocks.towtie.fireeasyjavaandroid.fireasy.database.add;

import com.google.firebase.database.DatabaseReference;

import java.util.Map;

/**
 * Created by cody.towstik.
 */

public interface AddData {

    public void addData( DatabaseReference dRef, String parent, String newChild );

    public void updateData( DatabaseReference dRef, String parent, Map<String,Object> addData );
}
