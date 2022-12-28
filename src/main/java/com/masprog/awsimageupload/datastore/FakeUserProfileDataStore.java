package com.masprog.awsimageupload.datastore;

import com.masprog.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

   /* static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "antoniojunior", null));
    }*/

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("22948154-d0c0-414c-b479-f44c4741f74b"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("b9689641-54e5-4eaf-89c8-19bbc91192c7"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }


}
