package The4Pillars.Abstraction.Interface.SocialMediaExample.Interfaces;

public interface SocialMedia {

    void sendConnectionRequest();
    void approveConnectionRequestReceived();
    int getNumOfConnections();
    void uploadProfilePhoto();
    void makePost();
    void openMessenger();
    String getProfileName();
}
