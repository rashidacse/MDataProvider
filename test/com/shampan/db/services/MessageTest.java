/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shampan.db.services;

import com.shampan.db.collections.MessageDAO;
import com.shampan.db.collections.builder.MessageDAOBuilder;
import com.shampan.db.collections.fragment.common.UserInfo;
import com.shampan.model.MessageModel;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author Sampan IT
 */
public class MessageTest {

    MessageModel messageModel = new MessageModel();
    String userId1 = "FdJptWkGvsRNAIW";
    String userId2 = "Rmy6luSAFvM1EoP";
    String userId3 = "9nSEiMgzieo1O4K";
    String groupId = "_FdJptWkGvsRNAIW_shdT5pVLdELcsL31_";

//    @Test
    public void addMessage() {
//        UserInfo userInfo = new UserInfo();
//        userInfo.setFirstName("Rashida");
//        userInfo.setLastName("sultana");
//        userInfo.setUserId(userId1);
        List<String> userIdList = new ArrayList<>();
        userIdList.add(userId1);
        userIdList.add(userId2);
        userIdList.sort(null);

        System.out.println(messageModel.addMessage(userIdList.toString(), userId1, "hi"));

    }

//    @Test
//    public void getMessageInitailization() {
//        System.out.println( messageModel.getMessageInitailization(groupId));
//        
//    }
//    @Test
    public void addMessageByGroupId() {
        int offset = 0;
        int limit = 5;
        UserInfo userInfo = new UserInfo();
        System.out.println(messageModel.addMessageByGroupId(groupId, userInfo.toString(), "fdsgf"));

    }
    @Test

    public void getMessageSummaryList() {
        int offset = 0;
        int limit = 5;
        System.out.println(messageModel.getMessageSummaryList(userId1, offset, limit));

    }

//    @Test
    public void getMessageList() {
        int offset = 1;
        int limit = 5;
        messageModel.getMessageList(groupId, offset, limit);
    }
}
