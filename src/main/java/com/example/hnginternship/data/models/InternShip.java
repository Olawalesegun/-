package com.example.hnginternship.data.models;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class InternShip {

    private String slack_name;
    private DayOfWeek current_day;
    private String utc_time;
    private String track;
    private String github_file_url;
    private String github_repo_url;
    private int status_code;
    LocalDateTime today = LocalDateTime.now();
    DayOfWeek dayOfWeek = today.getDayOfWeek();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
    String dateTimeAsRequested = today.format(dateTimeFormatter);


    public InternShip(String slack_name, String track, int status_code) {
        this.slack_name = slack_name;
        this.current_day = dayOfWeek;
        this.utc_time = dateTimeAsRequested;
        this.track = track;
        this.github_file_url = "https://github.com/Olawalesegun/HandsOnSpring/blob/main/src/main/resources/application.yml";
        this.github_repo_url = "https://github.com/Olawalesegun/HandsOnSpring";
        this.status_code = status_code;
    }

    public String getSlack_name() {
        return slack_name;
    }

    public void setSlack_name(String slack_name) {
        this.slack_name = slack_name;
    }

    public DayOfWeek getCurrent_day() {
        return current_day;
    }

    public void setCurrent_day(DayOfWeek current_day) {
        this.current_day = current_day;
    }

    public String getUtc_time() {
        return utc_time;
    }

    public void setUtc_time(String utc_time) {
        this.utc_time = utc_time;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getGithub_file_url() {
        return github_file_url;
    }

    public void setGithub_file_url(String github_file_url) {
        this.github_file_url = github_file_url;
    }

    public String getGithub_repo_url() {
        return github_repo_url;
    }

    public void setGithub_repo_url(String github_repo_url) {
        this.github_repo_url = github_repo_url;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InternShip that)) return false;
        return getStatus_code() == that.getStatus_code() && Objects.equals(getSlack_name(), that.getSlack_name()) && Objects.equals(getCurrent_day(), that.getCurrent_day()) && Objects.equals(getUtc_time(), that.getUtc_time()) && Objects.equals(getTrack(), that.getTrack()) && Objects.equals(getGithub_file_url(), that.getGithub_file_url()) && Objects.equals(getGithub_repo_url(), that.getGithub_repo_url());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSlack_name(), getCurrent_day(), getUtc_time(), getTrack(), getGithub_file_url(), getGithub_repo_url(), getStatus_code());
    }

    @Override
    public String toString() {
        return "InternShip{" +
                "slack_name='" + slack_name + '\'' +
                ", current_day='" + current_day + '\'' +
                ", utc_time='" + utc_time + '\'' +
                ", track='" + track + '\'' +
                ", github_file_url='" + github_file_url + '\'' +
                ", github_repo_url='" + github_repo_url + '\'' +
                ", status_code=" + status_code +
                '}';
    }
}
