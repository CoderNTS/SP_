/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author MienTrungComputer
 */
public class Tour {
    private int tour_ID;
    private String startDate;
    private String endDate;
    private String hotel;
    private String city_ID;
    private String numberPeople;
    private String content;
    private String img;
    private double totalPrice;
    private Boolean isDelete;
    private String Type_name;
    
    
    public Tour() {
    }

    public Tour(int tour_ID, String startDate, String endDate, String hotel, String city_ID, String numberPeople, String content, String img, double totalPrice, Boolean isDelete, String Type_name) {
        this.tour_ID = tour_ID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.hotel = hotel;
        this.city_ID = city_ID;
        this.numberPeople = numberPeople;
        this.content = content;
        this.img = img;
        this.totalPrice = totalPrice;
        this.isDelete = isDelete;
        this.Type_name = Type_name;
    }
    
    
    
    public Tour(int tour_ID, String startDate, String endDate, String hotel, String city_ID, String numberPeople, String content, String img) {
        this.tour_ID = tour_ID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.hotel = hotel;
        this.city_ID = city_ID;
        this.numberPeople = numberPeople;
        this.content = content;
        this.img = img;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getType_name() {
        return Type_name;
    }

    public void setType_name(String Type_name) {
        this.Type_name = Type_name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getTour_ID() {
        return tour_ID;
    }

    public void setTour_ID(int tour_ID) {
        this.tour_ID = tour_ID;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getCity_ID() {
        return city_ID;
    }

    public void setCity_ID(String city_ID) {
        this.city_ID = city_ID;
    }

    public String getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(String numberPeople) {
        this.numberPeople = numberPeople;
    }

    @Override
    public String toString() {
        return "Tour{" + "tour_ID=" + tour_ID + ", startDate=" + startDate + ", endDate=" + endDate + ", hotel=" + hotel + ", city_ID=" + city_ID + ", numberPeople=" + numberPeople + ", content=" + content + ", img=" + img + ", totalPrice=" + totalPrice + ", isDelete=" + isDelete + ", Type_name=" + Type_name + '}';
    }
    
}
