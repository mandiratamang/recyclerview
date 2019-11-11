package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import com.example.myapp.adapters.RecyclerViewAdapter;
import com.example.myapp.models.UserViewDetail;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<UserViewDetail>lstUserViewDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstUserViewDetail = new ArrayList<>();
        lstUserViewDetail.add(new UserViewDetail("Gerald Ford", "Category Userdeails", "Gerald Rudolph Ford Jr. was an American politician who served as the 38th president of the United States from August 1974 to January 1977. Before his accession to the presidency, Ford served as the 40th vice president of the United States from December 1973 to August 1974", R.drawable.gerald));
        lstUserViewDetail.add(new UserViewDetail("Jimmy Carter", "Category Userdeails", "James Earl Carter Jr. is an American politician and philanthropist who served as the 39th president of the United States from 1977 to 1981. A member of the Democratic Party, he previously served as a Georgia State Senator from 1963 to 1967 and as the 76th Governor of Georgia from 1971 to 1975", R.drawable.jimmy));
        lstUserViewDetail.add(new UserViewDetail("Ronald Reagan", "Category Userdeails", "Ronald Wilson Reagan was an American politician who served as the 40th president of the United States from 1981 to 1989 and became the highly influential voice of modern conservatism. Prior to his presidency, he was a Hollywood actor and union leader before serving as the 33rd governor of California from 1967 to 1975.", R.drawable.ronald));
        lstUserViewDetail.add(new UserViewDetail("George H.W.Bush", "Category Userdeails", "George Herbert Walker Bush was an American politician and businessman who served as the 41st president of the United States from 1989 to 1993 and the 43rd vice president from 1981 to 1989.", R.drawable.george));
        lstUserViewDetail.add(new UserViewDetail("Donald Trump", "Category Userdeails", "Donald John Trump is the 45th and current president of the United States. Before entering politics, he was a businessman and television personality. Trump was born and raised in the New York City borough of Queens, and received a B.S. degree in economics from the Wharton School at the University of Pennsylvania", R.drawable.donald));
        lstUserViewDetail.add(new UserViewDetail("Barack Obama", "Category Userdeails", "Barack Hussein Obama II is an American attorney and politician who served as the 44th president of the United States from 2009 to 2017. A member of the Democratic Party, he was the first African American to be elected to the presidency.", R.drawable.barack));
        lstUserViewDetail.add(new UserViewDetail("George W.Bush", "Category Userdeails", "George Herbert Walker Bush was an American politician and businessman who served as the 41st president of the United States from 1989 to 1993 and the 43rd vice president from 1981 to 1989.", R.drawable.george));
        lstUserViewDetail.add(new UserViewDetail("Jimmy Carter", "Category Userdeails", "James Earl Carter Jr. is an American politician and philanthropist who served as the 39th president of the United States from 1977 to 1981. A member of the Democratic Party, he previously served as a Georgia State Senator from 1963 to 1967 and as the 76th Governor of Georgia from 1971 to 1975", R.drawable.jimmy));
        lstUserViewDetail.add(new UserViewDetail("Gerald Ford", "Category Userdeails", "Gerald Rudolph Ford Jr. was an American politician who served as the 38th president of the United States from August 1974 to January 1977. Before his accession to the presidency, Ford served as the 40th vice president of the United States from December 1973 to August 1974", R.drawable.gerald));
        lstUserViewDetail.add(new UserViewDetail("Ronald Reagan", "Category Userdeails", "Ronald Wilson Reagan was an American politician who served as the 40th president of the United States from 1981 to 1989 and became the highly influential voice of modern conservatism. Prior to his presidency, he was a Hollywood actor and union leader before serving as the 33rd governor of California from 1967 to 1975.", R.drawable.ronald));


        RecyclerView myrv = (RecyclerView) findViewById((R.id.Recyclerview_id));
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstUserViewDetail);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(myAdapter);

    }
}
