package Entities;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Event {

    @SerializedName("idEvent")
    public int idEvent;


    @SerializedName("EventTitle")
    public String EventTitle ;//titre de l'evenement


    @SerializedName("CreationDate")
    public Date CreationDate ; //date de creation


    @SerializedName("EventDate")
    public Date EventDate ; //date de l'evenement


    @SerializedName("EventLocation")
    public String EventLocation ; //lieu de l'evenement


    @SerializedName("Description")
    public String Description ; //description de l'evenement


    @SerializedName("orgname")
    public String hostedby ;


    @SerializedName("username")
    public String creator ;


    @SerializedName("UnivName")
    public String University;


    @SerializedName("designation")
    public String theme ;

    @SerializedName("adminid")
    public int admin ;



}
