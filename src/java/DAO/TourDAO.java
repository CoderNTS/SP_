/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entities.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MienTrungComputer
 */
public class TourDAO extends MyDAO {

    public List<Tour> loadAllTour() {
        List<Tour> list = new ArrayList<>();
        String xSql = "SELECT [Tour_ID], [StartDate], [EndDate], [Hotel], [CityName], [NumberPeople], [Content], [IMG], [TotalPrice], [isDelete], [Type_name] "
                + "FROM [dbo].[Tour] t join [dbo].[City] c  on c.[City_ID] = t.[City_ID] join [dbo].[TourType] a on a.[Type_ID] = t.[Type_ID] ";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Tour(rs.getInt("Tour_ID"),
                        rs.getString("StartDate"),
                        rs.getString("EndDate"),
                        rs.getString("Hotel"),
                        rs.getString("CityName"),
                        rs.getString("NumberPeople"),
                        rs.getString("Content"),
                        rs.getString("IMG"),
                        rs.getDouble("TotalPrice"),
                        rs.getBoolean("isDelete"),
                        rs.getString("Type_name")));
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void deleteTour(String id) {
        String xSql = "DELETE FROM [dbo].[Tour]\n"
                + "      WHERE Tour_ID = ?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insertTour(Tour tour) {
        String xSql = "INSERT INTO [dbo].[Tour]\n"
                + "           ([StartDate]\n"
                + "           ,[EndDate]\n"
                + "           ,[Hotel]\n"
                + "           ,[City_ID]\n"
                + "           ,[NumberPeople])\n"
                + "     VALUES\n"
                + "           ( ?, ?, ? ,?, ?)";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, tour.getStartDate());
            ps.setString(2, tour.getEndDate());
            ps.setString(3, tour.getHotel());
            ps.setString(4, tour.getCity_ID());
            ps.setString(5, tour.getNumberPeople());

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insertTour(Activiti activiti) {
        // String xSql =""
    }

    public void updateTour(Tour tour) {
        String xSql = "UPDATE [dbo].[Tour]\n"
                + "   SET [StartDate] = ?\n"
                + "      ,[EndDate] = ?\n"
                + "      ,[Hotel] = ?\n"
                + "      ,[City_ID] = ?\n"
                + "      ,[NumberPeople] = ?\n"
                + " WHERE Tour_ID = ?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, tour.getStartDate());
            ps.setString(2, tour.getEndDate());
            ps.setString(3, tour.getHotel());
            ps.setString(4, tour.getCity_ID());
            ps.setString(5, tour.getNumberPeople());
            ps.setString(6, tour.getCity_ID());

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public Tour getTourID(String id) {
        String xSql = "SELECT [Tour_ID]　\n" +
"　     ,[StartDate]　\n" +
"　     ,[EndDate]　\n" +
"　     ,[Hotel]　\n" +
"　     ,c.[CityName]　\n" +
"　     ,[NumberPeople]　\n" +
"　     ,[Content]　\n" +
"　     ,[IMG]　\n" +
"　     ,[TotalPrice]\n" +
"      ,[isDelete]\n" +
"      ,a.[Type_name] FROM [dbo].[Tour] t join [dbo].[City] c  on c.[City_ID] = t.[City_ID] join [dbo].[TourType] a on a.[Type_ID] = t.[Type_ID]  WHERE Tour_ID = ?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
            return new Tour(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getDouble(9),
                    rs.getBoolean(10),
                    rs.getString(11));   
        }
        } catch (Exception e) {
        }
        return null;
    }

    public static void main(String[] args) {
        TourDAO dao = new TourDAO();
        Tour tour = dao.getTourID("4");
        System.out.println(tour);
    }
}
