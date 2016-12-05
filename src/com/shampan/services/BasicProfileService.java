package com.shampan.services;

import com.shampan.db.collections.BasicProfileDAO;
import com.shampan.model.BasicProfileModel;

/**
 *
 * @author nazmul hasan
 */
public class BasicProfileService {

    private static BasicProfileModel basicProfileModel = new BasicProfileModel();

    //--------------------------------- About -> Works and Education ------------------------------------//
    /**
     * This method will return details of works and education section of a user
     *
     * @param userId, user idd
     * @return String, details of works and education
     * @author nazmul hasan on 5th September 2015
     */
    public static String getWorksEducation(String userId) {
        BasicProfileDAO worksEducation = basicProfileModel.getWorksEducation(userId);
        return worksEducation.toString();
    }

    /**
     * This method will add workplace of a user
     *
     * @param userId, user id
     * @param workPlaceData, workplace data to be added
     * @return string, status of the operation
     * @author nazmul hasan on 29th august 2015
     */
    public static String addWorkPlace(String userId, String workPlaceData) {
        String workPlace = basicProfileModel.addWorkPlace(userId, workPlaceData).toString();
        return workPlace;
    }

    /**
     * This method will add professional skill of a user
     *
     * @param userId, user id
     * @param professionalSkillData, professional skill data to be added
     * @return string, status of the operation
     * @author nazmul hasan on 29th august 2015
     */
    public static String addProfessionalSkill(String userId, String professionalSkillData) {
        String pSkill = basicProfileModel.addProfessionalSkill(userId, professionalSkillData).toString();
        return pSkill;
    }

    /**
     * This method will add university of a user
     *
     * @param userId, user id
     * @param universityData, university data to be added
     * @return string, status of the operation
     * @author nazmul hasan on 29th august 2015
     */
    public static String addUniversity(String userId, String universityData) {
        String univesity = basicProfileModel.addUniversity(userId, universityData).toString();
        return univesity;
    }

    /**
     * This method will add college of a user
     *
     * @param userId, user id
     * @param collegeData, college data to be added
     * @return string, status of the operation
     * @author nazmul hasan on 29th august 2015
     */
    public static String addCollege(String userId, String collegeData) {
        String response = basicProfileModel.addCollege(userId, collegeData).toString();
        return response;
    }

    /**
     * This method will add school of a user
     *
     * @param userId, user id
     * @param schoolData, school data to be added
     * @return string, status of the operation
     * @author nazmul hasan on 29th august 2015
     */
    public static String addSchool(String userId, String schoolData) {
        String response = basicProfileModel.addSchool(userId, schoolData).toString();
        return response;
    }

    /**
     * This method will edit workplace of a user
     *
     * @return string, status of the operation
     * @author nazmul hasan on 5th September 2015
     */
    public static String editWorkPlace(String userId, String workPlaceId, String workPlaceData) {
        String response = basicProfileModel.editWorkPlace(userId, workPlaceId, workPlaceData).toString();
        return response;
    }

    /**
     * This method will edit professional skill of a user
     *
     * @return string, status of the operation
     * @author nazmul hasan on 5th September 2015
     */
    public static String editProfessionalSkill(String userId, String pSkillId, String pSkillData) {
        String response = basicProfileModel.editProfessionalSkill(userId, pSkillId, pSkillData).toString();
        return response;
    }

    /**
     * This method will edit university of a user
     *
     * @return string, status of the operation
     * @author nazmul hasan on 5th September 2015
     */
    public static String editUniversity(String userId, String universityId, String universityData) {
        String response = basicProfileModel.editUniversity(userId, universityId, universityData).toString();
        return response;
    }

    /**
     * This method will edit college of a user
     *
     * @return string, status of the operation
     * @author nazmul hasan on 5th September 2015
     */
    public static String editCollege(String userId, String collegeId, String collegeData) {
        String response = basicProfileModel.editCollege(userId, collegeId, collegeData).toString();
        return response;
    }

    /**
     * This method will edit school of a user
     *
     * @return string, status of the operation
     * @author nazmul hasan on 5th September 2015
     */
    public static String editSchool(String userId, String schoolId, String schoolData) {
        String response = basicProfileModel.editSchool(userId, schoolId, schoolData).toString();
        return response;
    }

    public static String deleteWrokPlace(String userId, String wrokPlaceId) {
        String response = basicProfileModel.deleteWrokPlace(userId, wrokPlaceId).toString();
        return response;
    }

    public static String deletePSkill(String userId, String pSkillId) {
        String response = basicProfileModel.deletePSkill(userId, pSkillId).toString();
        return response;
    }

    public static String deleteUniversity(String userId, String universityId) {
        String response = basicProfileModel.deleteUniversity(userId, universityId).toString();
        return response;
    }

    public static String deleteCollege(String userId, String collegeId) {
        String response = basicProfileModel.deleteCollege(userId, collegeId).toString();
        return response;
    }

    public static String deleteSchool(String userId, String schoolId) {
        String response = basicProfileModel.deleteSchool(userId, schoolId).toString();
        return response;
    }

    public static String getOverview(String userId) {
        String overview = basicProfileModel.getOverview(userId);
        return overview;
    }

    public static String getCityTown(String userId) {
        BasicProfileDAO cityTown = basicProfileModel.getCityTown(userId);
        return cityTown.toString();
    }

    public static String getFamilyRelation(String userId) {
        BasicProfileDAO familyRelations = basicProfileModel.getFamilyRelation(userId);
        return familyRelations.toString();
    }

    public static String getContactBasicInfo(String userId) {
        BasicProfileDAO BasicInfo = basicProfileModel.getContactBasicInfo(userId);
        return BasicInfo.toString();
    }

    public static String getAboutFQuote(String userId) {
        BasicProfileDAO aboutFQuote = basicProfileModel.getAboutFQuote(userId);
        return aboutFQuote.toString();
    }

    public static String addAbout(String userId, String aboutInfo) {
        String workPlace = basicProfileModel.addAbout(userId, aboutInfo).toString();
        return workPlace;
    }

    public static String addFQuote(String userId, String fQuoteInfo) {
        String workPlace = basicProfileModel.addFQuote(userId, fQuoteInfo).toString();
        return workPlace;
    }

    public static String addCurrentCity(String userId, String additionalData) {
        String response = basicProfileModel.addCurrentCity(userId, additionalData).toString();
        return response;
    }

    public static String editCurrentCity(String userId, String cityInfo) {
        String cityTown = basicProfileModel.editCurrentCity(userId, cityInfo).toString();
        return cityTown.toString();
    }

    public static String deleteCurrentCity(String userId) {
        String cityTown = basicProfileModel.deleteCurrentCity(userId).toString();
        return cityTown.toString();
    }

    public static String addHomeTown(String userId, String additionalData) {
        String response = basicProfileModel.addHomeTown(userId, additionalData).toString();
        return response;
    }

    public static String editHomeTown(String userId, String townInfo) {
        String cityTown = basicProfileModel.editHomeTown(userId, townInfo).toString();
        return cityTown.toString();
    }

    public static String deleteHomeTown(String userId) {
        String cityTown = basicProfileModel.deleteHomeTown(userId).toString();
        return cityTown.toString();
    }

    public static String addRelationshipStatus(String userId, String relationshipStatus) {
        String response = basicProfileModel.addRelationshipStatus(userId, relationshipStatus).toString();
        return response;
    }

    public static String addMobilePhone(String userId, String mobilePhoneInfo) {
        String response = basicProfileModel.addMobilePhone(userId, mobilePhoneInfo).toString();
        return response;
    }

    public static String editMobilePhone(String userId, String mobileId, String mobilePhoneInfo) {
        String response = basicProfileModel.editMobilePhone(userId, mobileId, mobilePhoneInfo).toString();
        return response;
    }

    public static String deleteMobilePhone(String userId, String mobileId) {
        String response = basicProfileModel.deleteMobilePhone(userId, mobileId).toString();
        return response;
    }

    public static String addAddress(String userId, String addressInfo) {
        String response = basicProfileModel.addAddress(userId, addressInfo).toString();
        return response;
    }

    public static String editAddress(String userId, String addressInfo) {
        String response = basicProfileModel.editAddress(userId, addressInfo).toString();
        return response;
    }

    public static String deleteAddress(String userId, String addressInfo) {
        String response = basicProfileModel.deleteAddress(userId).toString();
        return response;
    }

    public static String addWebsite(String userId, String websiteInfo) {
        String response = basicProfileModel.addWebsite(userId, websiteInfo).toString();
        return response;
    }

    public static String editWebsite(String userId, String websiteInfo) {
        String response = basicProfileModel.editWebsite(userId, websiteInfo).toString();
        return response;
    }

    public static String deleteWebsite(String userId, String websiteId) {
        String response = basicProfileModel.deleteWebsite(userId, websiteId).toString();
        return response;
    }

    public static String addEmail(String userId, String emailInfo) {
        String response = basicProfileModel.addEmail(userId, emailInfo).toString();
        return response;
    }

    public static String editEmail(String userId, String emailId, String emailInfo) {
        String response = basicProfileModel.editEmail(userId, emailId, emailInfo).toString();
        return response;
    }

    public static String deleteEmail(String userId, String emailId) {
        String response = basicProfileModel.deleteEmail(userId, emailId).toString();
        return response;
    }

}
