package com.example.user.designing;

import java.util.ArrayList;

public class data {

    public static ArrayList<Info> getData(){
        ArrayList<Info> data=new ArrayList<>();

        int[] images={
          R.drawable.pro,
                R.drawable.pro2,
                R.drawable.pro3,
                R.drawable.pro4,
                R.drawable.pro5,
                R.drawable.pro6,
                R.drawable.pro7,
                R.drawable.pro
        };
       String[] name={"Sara","Jack","John","Alice","Lara","Marla","Sheena","Leena"};
       String[] message={"It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum, Wake up","It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.","Good morning","The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33  ","Hello",
       " If you use this site regularly and would like to help keep the site on the Internet, please consider donating a small sum to help pay for the hosting and bandwidth bill."
       ,"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi ",
       " If you use this site regularly and would like to help keep the site on the Internet, please consider donating a small sum to help pay for the hosting and bandwidth bill. There is no minimum donation, any sum is appreciated - click here to donate using PayPal. Thank you for your support."};
       for (int i=0;i<name.length;i++){
       Info current=new Info();
       current.Name=name[i];
       current.imageid=images[i];
       current.Message=message[i];
       data.add(current);
       }
        return data;
    }

}
