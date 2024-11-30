package com.iit.oopcw.Real_Time_Event_Ticketing_System.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Configuration {

    private int totalTickets;
    private int ticketReleaseRate;
    private int customerRetrievalRate;
    private int maxTicketCapacity;
}
