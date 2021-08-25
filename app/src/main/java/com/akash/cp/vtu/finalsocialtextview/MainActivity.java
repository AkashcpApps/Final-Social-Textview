package com.akash.cp.vtu.finalsocialtextview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    HyperAdapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String text="I love to do programming in @Android @IOS @JAVA #anu # 9945888170 akash@gmail.com @k";

        List<Item> animalNames = new ArrayList<>();
        animalNames.add(new Item("9945888170 #anb lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters  https://www.w3.org/ it may also be a hot area in an image (image map in HTML), a designated, often irregular part of an image. One way to define it is by a list of"));
        animalNames.add(new Item("rregular part of an image. One way to define it is by a list of"));
        animalNames.add(new Item("9945888170 lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters  9945888170 lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters  9945888170 lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters  9945888170 lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters 9945888170 lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters  https://www.w3.org/ it may also be a hot area in an image (image map in HTML), a designated, often irregular part of an image. One way to define it is by a list of"));
        animalNames.add(new Item("  https://www.w3.org/ it may also be a hot area in an image (image map in HTML), a designated, often irregular part of an image. One way to define it is by a list of"));
        animalNames.add(new Item("9945888170 lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters  https://www.w3.org/ it may also be a hot area in an image (image map in HTML), a designated, often irregular part of an image. One way to define it is by a list of"));
        animalNames.add(new Item("9945888170 lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters  https://www.w3.org/ it may also be a hot area in an image (image map in HTML), a designated, often irregular part of an image. One way to define it is by a list of"));
        animalNames.add(new Item("9945888170 lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters  https://www.w3.org/ it may also be a hot area in an image (image map in HTML), a designated, often irregular part of an image. One way to define it is by a list of"));
        animalNames.add(new Item("9945888170 #anb lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters  https://www.w3.org/ it may also be a hot area in an image (image map in HTML), a designated, often irregular part of an image. One way to define it is by a list of"));
        animalNames.add(new Item("9945888170 lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters  https://www.w3.org/ it may also be a hot area in an image (image map in HTML), a designated, often irregular part of an image. One way to define it is by a list of"));
        animalNames.add(new Item("9945888170 lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters  9945888170 lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters  9945888170 lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters  9945888170 lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters 9945888170 lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters  https://www.w3.org/ it may also be a hot area in an image (image map in HTML), a designated, often irregular part of an image. One way to define it is by a list of"));
        animalNames.add(new Item("9945888170 lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters  https://www.w3.org/ it may also be a hot area in an image (image map in HTML), a designated, often irregular part of an image. One way to define it is by a list of"));
        animalNames.add(new Item("9945888170 lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters  https://www.w3.org/ it may also be a hot area in an image (image map in HTML), a designated, often irregular part of an image. One way to define it is by a list of"));
        animalNames.add(new Item("9945888170 lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters  https://www.w3.org/ it may also be a hot area in an image (image map in HTML), a designated, often irregular part of an image. One way to define it is by a list of"));
        animalNames.add(new Item("9945888170 lkgndflg.com generally text, @  @A @@@ # though not necessarily. @Akash  anush@ For instance, #BlacklifeMatters  https://www.w3.org/ it may also be a hot area in an image (image map in HTML), a designated, often irregular part of an image. One way to define it is by a list of"));

        recyclerView = findViewById(R.id.rec);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        adapter = new HyperAdapter(this, animalNames);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

}