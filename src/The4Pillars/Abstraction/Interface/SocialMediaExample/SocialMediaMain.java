package The4Pillars.Abstraction.Interface.SocialMediaExample;

import The4Pillars.Abstraction.Interface.SocialMediaExample.Classes.Facebook;
import The4Pillars.Abstraction.Interface.SocialMediaExample.Classes.LinkedIn;

public class SocialMediaMain {
    public static void main(String[] args) {

        Facebook facebook = new Facebook("DIVYANSHU");
        LinkedIn linkedIn = new LinkedIn("DIVYANSHU SHARMA", "Software Engineer");

        System.out.println("***** FACEBOOK *******");
        System.out.println("Profile Name: "+facebook.getProfileName());
        facebook.sendConnectionRequest();
        System.out.println("number of current facebook photos posted on this account: " + facebook.getNumOfPhotos());
        System.out.println("number of current facebook videos posted on this account: " + facebook.getNumOfVideos());
        System.out.println("number of current connections on this account: " + facebook.getNumOfConnections());
        facebook.makeMovie();
        facebook.makeShorts();
        facebook.postPictures();
        facebook.addToMoodBoard();
        facebook.sendConnectionRequest();
        facebook.postPictures();
        facebook.uploadProfilePhoto();
        System.out.println("number of current facebook photos posted on this account: " + facebook.getNumOfPhotos());
        System.out.println("number of current facebook videos posted on this account: " + facebook.getNumOfVideos());
        System.out.println("number of current connections on this account: " + facebook.getNumOfConnections());
        System.out.println("***** FACEBOOK STOPPED *******");

        System.out.println("***** LINKEDIN ******* ");
        System.out.println("LinkedIn profile Name : "+ linkedIn.getProfileName());
        linkedIn.sendConnectionRequest();
        System.out.println("number of current facebook photos posted on this account: " + linkedIn.getNumOfPhotos());
        System.out.println("number of current facebook videos posted on this account: " + linkedIn.getNumOfVideos());
        System.out.println("number of current connections on this account: " + linkedIn.getNumOfConnections());
        linkedIn.jobPostings("SOFTWARE ENGINEER");
        linkedIn.jobPostings("JAVA DEVELOPER");
        linkedIn.makePost();
        linkedIn.makeReels();
        linkedIn.postArticle();
        linkedIn.uploadProfilePhoto();
        System.out.println("number of current facebook photos posted on this account: " + linkedIn.getNumOfPhotos());
        System.out.println("number of current facebook videos posted on this account: " + linkedIn.getNumOfVideos());
        System.out.println("number of current connections on this account: " + linkedIn.getNumOfConnections());
        System.out.println("***** LINKEDIN STOPPED *******");




    }
}
