package com.dicoding.picodiploma.listtop10gachagames;

import android.os.Parcel;
import android.os.Parcelable;

public class Games implements Parcelable {
    private String name;
    private String genre;
    private String jenis;
    private String deskripsi;
    private int photo;


    protected Games(Parcel in) {
        name = in.readString();
        genre = in.readString();
        jenis = in.readString();
        deskripsi = in.readString();
        photo = in.readInt();
    }
    public static final Creator<Games> CREATOR = new Creator<Games>() {
        @Override
        public Games createFromParcel(Parcel in) {

            return new Games(in);
        }
        @Override
        public Games[] newArray(int size) {
            return new Games[size];
        }
    };


    public Games() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name2) {
        this.name = name2;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getJenis() {

        return jenis;
    }

    public void setJenis(String jenis2) {

        this.jenis = jenis2;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi2) {
        this.deskripsi = deskripsi2;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo2) {
        this.photo = photo2;
    }

    @Override
    public int describeContents(){
        return 0;
    }
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.genre);
        parcel.writeString(this.jenis);
        parcel.writeString(this.deskripsi);
        parcel.writeInt(this.photo);
    }
}
