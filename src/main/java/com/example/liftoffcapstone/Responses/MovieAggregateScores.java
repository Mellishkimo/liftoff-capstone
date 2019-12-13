package com.example.liftoffcapstone.Responses;

public class MovieAggregateScores {

    private String movieName;

    private long movieId;

    private String moviePosterSource;

    private double overallAggregate;

    private double plotAggregate;

    private double characterAggregate;

    private double threatAggregate;

    private double aestheticAggregate;

    private double graphicContentAggregate;

    public MovieAggregateScores(String movieName, long movieId, String moviePosterSource, double overallAggregate, double plotAggregate, double characterAggregate, double threatAggregate, double aestheticAggregate, double graphicContentAggregate) {
        this.movieName = movieName;
        this.movieId = movieId;
        this.moviePosterSource = moviePosterSource;
        this.overallAggregate = overallAggregate;
        this.plotAggregate = plotAggregate;
        this.characterAggregate = characterAggregate;
        this.threatAggregate = threatAggregate;
        this.aestheticAggregate = aestheticAggregate;
        this.graphicContentAggregate = graphicContentAggregate;
    }

    public MovieAggregateScores() {}

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public String getMoviePosterSource() {
        return moviePosterSource;
    }

    public void setMoviePosterSource(String moviePosterSource) {
        this.moviePosterSource = moviePosterSource;
    }

    public double getOverallAggregate() {
        return overallAggregate;
    }

    public void setOverallAggregate(double overallAggregate) {
        this.overallAggregate = overallAggregate;
    }

    public double getPlotAggregate() {
        return plotAggregate;
    }

    public void setPlotAggregate(double plotAggregate) {
        this.plotAggregate = plotAggregate;
    }

    public double getCharacterAggregate() {
        return characterAggregate;
    }

    public void setCharacterAggregate(double characterAggregate) {
        this.characterAggregate = characterAggregate;
    }

    public double getThreatAggregate() {
        return threatAggregate;
    }

    public void setThreatAggregate(double threatAggregate) {
        this.threatAggregate = threatAggregate;
    }

    public double getAestheticAggregate() {
        return aestheticAggregate;
    }

    public void setAestheticAggregate(double aestheticAggregate) {
        this.aestheticAggregate = aestheticAggregate;
    }

    public double getGraphicContentAggregate() {
        return graphicContentAggregate;
    }

    public void setGraphicContentAggregate(double graphicContentAggregate) {
        this.graphicContentAggregate = graphicContentAggregate;
    }
}
