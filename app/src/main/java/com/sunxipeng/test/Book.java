package com.sunxipeng.test;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2016/1/13.
 */
public class Book implements Parcelable {

    protected Book(Parcel in) {
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
