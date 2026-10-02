package com.example.demo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MeetingDetails {
    private String title;
    private String attendee;
    private String date;
    private String time;
    private Integer durationMinutes;
}
