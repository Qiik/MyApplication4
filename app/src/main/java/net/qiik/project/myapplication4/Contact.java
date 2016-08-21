package net.qiik.project.myapplication4;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by NotePad1 on 21.08.2016.
 */

public class Contact implements Parcelable {

    private String mFirstName;
    private String mLastName;
    private String mPhone;
    private int mAge;
    private String mSex;

    public Contact(String firstName, String lastName, String phone, int age, String sex) {
        mFirstName = firstName;
        mLastName = lastName;
        mPhone = phone;
        mAge = age;
        mSex = sex;
    }

    public Contact(Parcel in) {
        String[] data = new String[4];
        in.readStringArray(data);
        mFirstName = data[0];
        mLastName = data[1];
        mPhone = data[2];
        mSex = data[3];

        int[] extData = new int[1];
        in.readIntArray(extData);
        mAge = extData[0];
    }

    public void setmFirstName{
        mFirstName = firstName;
    }

    public String getmFirstName{
        return mFirstName;
    }

    public void setmLastName{
        mLastName = lastName;
    }

    public String getmLastName{
        return mLastName;
    }

    public void setmPhone{
        mPhone = phone;
    }

    public String getmPhone{
        return mPhone;
    }

    public void setmSex{
        mSex = sex;
    }

    public String getmSex{
        return mSex;
    }

    public void setmAge{
        mAge = age;
    }

    public int getmAge{
        return mAge;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(new String[] {mFirstName, mLastName, mPhone, mSex});
        parcel.writeIntArray(new int[] {mAge});
    }

    public static final Parcelable.Creator<Contact> CREATOR = new Parcelable.Creator<Contact>(){

        @Override
        public Contact createFromParcel(Parcel parcel) {
            return new Contact(parcel);
        }

        @Override
        public Contact[] newArray(int i) {
            return new Contact[i];
        }
    };
}
