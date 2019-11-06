package com.example.liftoffcapstone.Models;

public class Review {

    private int id;

    private int plotRating;

    private int characterRating;

    private int threatRating;

    private int aestheticRating;

    private int graphicContentRating;

    private String plotDescription;

    private String characterDescription;

    private String threatDescription;

    private String aestheticDescription;

    private String graphicContentDescription;

    public Review(int plotRating, int characterRating, int threatRating, int aestheticRating, int graphicContentRating,
                  String plotDescription, String characterDescription, String threatDescription, String aestheticDescription,
                  String graphicContentDescription) {
        this.plotRating = plotRating;
        this.characterRating = characterRating;
        this.threatRating = threatRating;
        this.aestheticRating = aestheticRating;
        this.graphicContentRating = graphicContentRating;
        this.plotDescription = plotDescription;
        this.characterDescription = characterDescription;
        this.threatDescription = threatDescription;
        this.aestheticDescription = aestheticDescription;
        this.graphicContentDescription = graphicContentDescription;
    }

    public int getId() {
        return id;
    }

    public int getPlotRating() {
        return plotRating;
    }

    public void setPlotRating(int plotRating) {
        this.plotRating = plotRating;
    }

    public int getCharacterRating() {
        return characterRating;
    }

    public void setCharacterRating(int characterRating) {
        this.characterRating = characterRating;
    }

    public int getThreatRating() {
        return threatRating;
    }

    public void setThreatRating(int threatRating) {
        this.threatRating = threatRating;
    }

    public int getAestheticRating() {
        return aestheticRating;
    }

    public void setAestheticRating(int aestheticRating) {
        this.aestheticRating = aestheticRating;
    }

    public int getGraphicContentRating() {
        return graphicContentRating;
    }

    public void setGraphicContentRating(int graphicContentRating) {
        this.graphicContentRating = graphicContentRating;
    }

    public String getPlotDescription() {
        return plotDescription;
    }

    public void setPlotDescription(String plotDescription) {
        this.plotDescription = plotDescription;
    }

    public String getCharacterDescription() {
        return characterDescription;
    }

    public void setCharacterDescription(String characterDescription) {
        this.characterDescription = characterDescription;
    }

    public String getThreatDescription() {
        return threatDescription;
    }

    public void setThreatDescription(String threatDescription) {
        this.threatDescription = threatDescription;
    }

    public String getAestheticDescription() {
        return aestheticDescription;
    }

    public void setAestheticDescription(String aestheticDescription) {
        this.aestheticDescription = aestheticDescription;
    }

    public String getGraphicContentDescription() {
        return graphicContentDescription;
    }

    public void setGraphicContentDescription(String graphicContentDescription) {
        this.graphicContentDescription = graphicContentDescription;
    }
}
