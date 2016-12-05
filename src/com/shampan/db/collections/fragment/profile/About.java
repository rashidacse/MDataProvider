package com.shampan.db.collections.fragment.profile;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author Sampan-IT
 */
public class About {
    private String id;
//    @JsonProperty("abt")
    private String about;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
     public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        try {
            json = mapper.writeValueAsString(this);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return json;
    }

    public static About getAbout(String jsonContent) {
        About about = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            about = mapper.readValue(jsonContent, About.class);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return about;
    }
}
