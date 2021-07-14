package com.company;

public class Parked_CarOwner_Details {
    private String ownerName,carModel,ownerAddress;
   private int carNo;
   private long ownerMobileNo;


    public Parked_CarOwner_Details(String ownerName, String carModel, String ownerAddress, int carNo, long ownerMobileNo) {
        this.ownerName = ownerName;
        this.carModel = carModel;
        this.ownerAddress = ownerAddress;
        this.carNo = carNo;
        this.ownerMobileNo = ownerMobileNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public int getCarNo() {
        return carNo;
    }

    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }

    public long getOwnerMobileNo() {
        return ownerMobileNo;
    }

    public void setOwnerMobileNo(long ownerMobileNo) {
        this.ownerMobileNo = ownerMobileNo;
    }

    @Override
    public String toString() {
        return "Parked_CarOwner_Details{" +
                "ownerName='" + ownerName + '\'' +
                ", carModel='" + carModel + '\'' +
                ", ownerAddress='" + ownerAddress + '\'' +
                ", carNo=" + carNo +
                ", ownerMobileNo=" + ownerMobileNo +
                '}';
    }
}
