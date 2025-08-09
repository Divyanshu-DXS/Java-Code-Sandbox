package The4Pillars.Abstraction.Interface.SocialMediaExample.Interfaces;

public abstract class HybridSocialMedia implements VideoBasedSocialMedia, PictureBasedSocialMedia {

    int numPhotos;
    int numVideos;
    public abstract void checkVideoLength();
    public int getNumOfPhotos(){
        return numPhotos;
    }
    public int getNumOfVideos(){
        return numVideos;
    }
}
