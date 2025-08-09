package The4Pillars.Abstraction.Interface.SocialMediaExample.Classes;

import The4Pillars.Abstraction.Interface.SocialMediaExample.Interfaces.HybridSocialMedia;
import The4Pillars.Abstraction.Interface.SocialMediaExample.Interfaces.ProfessionalBasesSocialMedia;
import The4Pillars.Abstraction.Interface.SocialMediaExample.Interfaces.SocialMedia;

import javax.crypto.spec.PSource;

public class LinkedIn extends HybridSocialMedia implements SocialMedia, ProfessionalBasesSocialMedia {
    int numOfVideos=0;
    int numOfPhotos=0;
    int numOfPosts=numOfPhotos+numOfVideos;
    int numOfConnections=0;
    String profileName;
    String currentPositoin;

    public LinkedIn(String profileName, String currentPositoin) {
        this.profileName = profileName;
        this.currentPositoin=currentPositoin;
    }

    public LinkedIn() {
    }

    @Override
    public void checkVideoLength() {
        System.out.println("Suggest Video Length for the platform");

    }

    @Override
    public void postPictures() {
        System.out.println("Photo Posted");
        numOfPhotos++;
    }

    @Override
    public void pinPhotos() {
        System.out.println("Photos Pinned");

    }

    @Override
    public void addToMoodBoard() {
        // Not valid for this class so leaving empty

    }

    @Override
    public void jobPostings(String position) {
        System.out.println("Made a job posting. Open Positoin: " + position);
    }

    @Override
    public void seeJobOffers() {
        System.out.println("prints nbumber of job offers made");
    }

    @Override
    public void sendResume() {
        System.out.println("Send Resume");

    }

    @Override
    public void postArticle() {
        System.out.println("Posted an article");
        numOfPosts++;
    }

    @Override
    public void sendConnectionRequest() {
        System.out.println("Connection Request Sent");
        numOfConnections++;
    }

    @Override
    public void approveConnectionRequestReceived() {
        System.out.println("Approve Connection Request");
        numOfConnections++;
    }

    @Override
    public int getNumOfConnections() {
        return numOfConnections;
    }

    @Override
    public void uploadProfilePhoto() {
        System.out.println("profilePhoto uploaded");
    }

    @Override
    public void makePost() {
        System.out.println("Made a post");
        numOfPosts++;
        // if video numofVide++
        // if photo numOfPhoto++
    }

    @Override
    public void openMessenger() {
        System.out.println("messenger Launched");

    }

    @Override
    public String getProfileName() {
        return profileName;
    }

    @Override
    public void makeShorts() {
        System.out.println("Make Short Videos 1-2 min");
        numOfVideos++;
    }

    @Override
    public void makeReels() {
        System.out.println("Make Reel Videos 1 min");
        numOfVideos++;

    }

    @Override
    public void makeMovie() {
        System.out.println("Make Movie Videos > 2 min");
        numOfVideos++;

    }

    @Override
    public void cutClips() {
        System.out.println("Cut clips from videos");
    }
    public int getNumOfPhotos(){
        return numOfPhotos;
    }
    public int getNumOfVideos(){
        return numOfVideos;
    }
}
